
-keep class proguard.annotation.*
-keepclassmembers @proguard.annotation.KeepField class * { <fields>; }
-keepclassmembers @proguard.annotation.KeepMethod class * { <methods>; }
-keepclassmembers @proguard.annotation.KeepGetterSetter class * {
   void set*(***);
   *** get*();
   boolean is*();
}

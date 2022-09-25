package com.google.android.apps.auto.sdk;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.android.apps.auto.sdk.y */
/* compiled from: PG */
abstract class C8993y {

    /* renamed from: m */
    protected Object f31109m;

    /* renamed from: n */
    protected String f31110n;

    public C8993y(C8967ac acVar, Object... objArr) {
        Constructor constructor;
        int i = 0;
        try {
            int a = C8967ac.m23524a(acVar.f31062a);
            int a2 = C8967ac.m23524a(acVar.f31063b);
            if (a > a2) {
                String packageName = acVar.f31063b.getPackageName();
                String packageName2 = acVar.f31062a.getPackageName();
                String str = acVar.f31063b.getPackageManager().getPackageInfo(packageName, 0).versionName;
                Log.w("CSL.RemoteClass", "Older version of Android Auto detected." + packageName + "(" + str + ", api=" + a2 + ")\n" + packageName2 + "(api=  " + a + ")");
            }
        } catch (Exception e) {
            Log.e("CSL.RemoteClass", "Error extracting SDK version, you may face runtime errors", e);
        }
        this.f31110n = "com.google.android.gearhead.appdecor.CarUiEntry";
        try {
            Class<?> loadClass = acVar.f31063b.getClassLoader().loadClass("com.google.android.gearhead.appdecor.CarUiEntry");
            Constructor[] constructors = loadClass.getConstructors();
            int length = constructors.length;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (objArr.length == constructor.getParameterTypes().length) {
                    break;
                }
                i++;
            }
            if (constructor != null) {
                try {
                    this.f31109m = constructor.newInstance(objArr);
                    mo17293b(loadClass.getDeclaredMethods());
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                    Log.wtf("CSL.RemoteClass", "Unable to load SDK entry class.", e2);
                    throw new IllegalStateException("Unable to load SDK entry class.", e2);
                }
            } else {
                throw new IllegalStateException("Cannot find SDK entry constructor.");
            }
        } catch (ClassNotFoundException e3) {
            throw new IllegalStateException("Unable to load SDK class com.google.android.gearhead.appdecor.CarUiEntry", e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo17293b(Method[] methodArr);

    /* renamed from: c */
    public final Object mo17306c(Method method, Object... objArr) {
        if (method != null) {
            try {
                return method.invoke(this.f31109m, objArr);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                Log.e("CSL.RemoteClass", "Error invoking: ".concat(String.valueOf(method.getName())), e);
                return null;
            }
        } else {
            Log.e("CSL.RemoteClass", "Error invoking a null method.  Ignored.", new Exception());
            return null;
        }
    }
}

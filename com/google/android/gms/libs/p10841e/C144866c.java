package com.google.android.gms.libs.p10841e;

/* renamed from: com.google.android.gms.libs.e.c */
/* compiled from: PG */
public final class C144866c {
    /* renamed from: a */
    public static Object m235449a(String str, C144865b... bVarArr) {
        Class<?> cls = Class.forName("android.os.SystemProperties");
        Class[] clsArr = new Class[2];
        Object[] objArr = new Object[2];
        for (int i = 0; i < 2; i++) {
            C144865b bVar = bVarArr[i];
            bVar.getClass();
            clsArr[i] = bVar.f391714a;
            objArr[i] = bVarArr[i].f391715b;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke((Object) null, objArr);
    }
}

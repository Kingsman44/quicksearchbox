package com.google.android.material.p3505b;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: com.google.android.material.b.b */
/* compiled from: PG */
final class C44532b implements C44533c {

    /* renamed from: a */
    private Long f115784a;

    /* renamed from: a */
    public final boolean mo47470a() {
        if (this.f115784a == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", new Class[]{String.class});
                declaredMethod.setAccessible(true);
                this.f115784a = Long.valueOf(((Long) declaredMethod.invoke((Object) null, new Object[]{"ro.build.version.oneui"})).longValue());
            } catch (Exception unused) {
                this.f115784a = -1L;
            }
        }
        return this.f115784a.longValue() >= 40100;
    }
}

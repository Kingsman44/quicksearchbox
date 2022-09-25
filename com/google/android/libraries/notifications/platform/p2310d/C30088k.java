package com.google.android.libraries.notifications.platform.p2310d;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.notifications.platform.d.k */
/* compiled from: PG */
public abstract class C30088k {
    /* renamed from: g */
    public static C30087j m55906g() {
        C30081d dVar = new C30081d();
        dVar.f81407b = new HashMap();
        return dVar;
    }

    /* renamed from: a */
    public abstract Exception mo35475a();

    /* renamed from: b */
    public abstract Integer mo35476b();

    /* renamed from: c */
    public abstract String mo35477c();

    /* renamed from: d */
    public abstract Map mo35478d();

    /* renamed from: e */
    public abstract byte[] mo35479e();

    /* renamed from: f */
    public abstract byte[] mo35481f();

    /* renamed from: h */
    public final Throwable mo35487h() {
        return (mo35475a() != null || mo35476b() == null || mo35476b().intValue() == 200) ? mo35475a() : new C30089l(mo35476b().intValue());
    }
}

package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16354ba;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.aq */
/* compiled from: PG */
public abstract class C16091aq {
    /* renamed from: j */
    public static C16091aq m32981j(String str, C16090ap apVar, int i, float f, float f2, int i2, int i3, long j, C16354ba baVar) {
        C16161e eVar = new C16161e();
        if (str != null) {
            eVar.f47659a = str;
            eVar.mo22718c(apVar);
            eVar.mo22723h(i);
            eVar.mo22721f(f);
            eVar.mo22724i(f2);
            eVar.mo22719d(i2);
            eVar.mo22722g(i3);
            eVar.mo22720e(j);
            eVar.mo22717b(baVar);
            return eVar.mo22716a();
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: a */
    public abstract float mo22727a();

    /* renamed from: b */
    public abstract float mo22728b();

    /* renamed from: c */
    public abstract int mo22729c();

    /* renamed from: d */
    public abstract int mo22730d();

    /* renamed from: e */
    public abstract int mo22731e();

    /* renamed from: f */
    public abstract long mo22732f();

    /* renamed from: g */
    public abstract C16090ap mo22733g();

    /* renamed from: h */
    public abstract C16354ba mo22734h();

    /* renamed from: i */
    public abstract String mo22735i();
}

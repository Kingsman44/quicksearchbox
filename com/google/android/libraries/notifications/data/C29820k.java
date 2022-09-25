package com.google.android.libraries.notifications.data;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.notifications.C29986f;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;

/* renamed from: com.google.android.libraries.notifications.data.k */
/* compiled from: PG */
public abstract class C29820k {
    /* renamed from: m */
    public static C29787a m55110m() {
        C29787a aVar = new C29787a();
        aVar.f80715c = 0L;
        aVar.f80716d = 0L;
        aVar.mo34999e(C29986f.UNKNOWN_STATUS);
        aVar.f80717e = 0L;
        aVar.mo34998d(0);
        aVar.f80718f = 0L;
        aVar.f80719g = BuildConfig.FLAVOR;
        aVar.f80720h = BuildConfig.FLAVOR;
        return aVar;
    }

    /* renamed from: a */
    public abstract int mo35001a();

    /* renamed from: b */
    public abstract C29986f mo35002b();

    /* renamed from: c */
    public abstract Long mo35003c();

    /* renamed from: d */
    public abstract Long mo35004d();

    /* renamed from: e */
    public abstract Long mo35005e();

    /* renamed from: f */
    public abstract Long mo35007f();

    /* renamed from: g */
    public abstract Long mo35008g();

    /* renamed from: h */
    public abstract String mo35009h();

    /* renamed from: i */
    public abstract String mo35011i();

    /* renamed from: j */
    public abstract String mo35012j();

    /* renamed from: k */
    public abstract String mo35013k();

    /* renamed from: l */
    public abstract C29787a mo35014l();

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("name", mo35009h());
        return b.toString();
    }
}

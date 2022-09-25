package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.aj */
/* compiled from: PG */
public abstract class C78983aj {
    /* renamed from: a */
    public abstract C74757n mo73746a();

    /* renamed from: b */
    public abstract Optional mo73747b();

    /* renamed from: c */
    public final C78982ai mo73748c() {
        C79074e eVar = new C79074e();
        Optional b = mo73747b();
        if (b != null) {
            eVar.f217428a = b;
            eVar.mo73745b(mo73746a());
            return eVar;
        }
        throw new NullPointerException("Null interpretation");
    }
}

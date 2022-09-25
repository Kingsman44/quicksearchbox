package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78537at;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.bp */
/* compiled from: PG */
abstract class C78393bp {
    /* renamed from: g */
    static C78392bo m125918g() {
        C78491q qVar = new C78491q();
        qVar.mo73353e(C78537at.f216290a);
        return qVar;
    }

    /* renamed from: a */
    public abstract C78392bo mo73354a();

    /* renamed from: b */
    public abstract C83358h mo73355b();

    /* renamed from: c */
    public abstract Optional mo73356c();

    /* renamed from: d */
    public abstract Optional mo73357d();

    /* renamed from: e */
    public abstract Optional mo73358e();

    /* renamed from: f */
    public abstract Optional mo73359f();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo73360h() {
        if (mo73356c().isPresent()) {
            return true;
        }
        int a = ((C78537at) mo73355b().mo76657c()).mo73447a();
        if (a != 0) {
            return a != 7;
        }
        throw null;
    }
}

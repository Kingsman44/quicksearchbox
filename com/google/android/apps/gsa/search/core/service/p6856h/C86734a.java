package com.google.android.apps.gsa.search.core.service.p6856h;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.search.core.service.h.a */
/* compiled from: PG */
public abstract class C86734a implements C86744b {

    /* renamed from: d */
    public final C118575h f234292d;

    /* renamed from: e */
    public final String f234293e;

    protected C86734a(C118575h hVar, String str) {
        this.f234292d = hVar;
        this.f234293e = str;
    }

    /* renamed from: gS */
    public void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getName());
    }

    /* renamed from: hY */
    public void mo79108hY() {
    }

    /* renamed from: hZ */
    public final C118575h mo80348hZ() {
        return this.f234292d;
    }

    /* renamed from: ia */
    public final String mo80349ia() {
        return this.f234293e;
    }

    @Deprecated
    /* renamed from: ib */
    public void mo80350ib() {
    }

    /* renamed from: ic */
    public final C89356b mo80351ic(C84466a aVar, String str, C118575h hVar) {
        C58838bb.m90868c(hVar != this.f234292d);
        return aVar.mo78026b(str, hVar, this.f234292d);
    }
}

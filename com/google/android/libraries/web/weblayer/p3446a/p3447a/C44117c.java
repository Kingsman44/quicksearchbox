package com.google.android.libraries.web.weblayer.p3446a.p3447a;

import android.os.RemoteException;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.p3343a.C43227c;
import com.google.android.libraries.web.weblayer.wrapper.C44315a;
import com.google.common.base.C58893dc;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72611bt;

/* renamed from: com.google.android.libraries.web.weblayer.a.a.c */
/* compiled from: PG */
public final class C44117c implements C43227c {

    /* renamed from: a */
    private final C44315a f114835a;

    public C44117c(C44315a aVar) {
        this.f114835a = aVar;
    }

    /* renamed from: a */
    public final String mo46278a() {
        C19559g.m37304c();
        C72611bt h = this.f114835a.mo47217h();
        C58893dc.m90996a(h);
        C72604bm.m107399a();
        try {
            return h.f193174f.mo63773f();
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }
}

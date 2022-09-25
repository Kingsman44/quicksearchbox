package com.google.android.apps.gsa.staticplugins.p7565bu;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.m */
/* compiled from: PG */
final class C96859m implements C22868d {

    /* renamed from: a */
    final /* synthetic */ long f270818a;

    /* renamed from: b */
    final /* synthetic */ C96862p f270819b;

    public C96859m(C96862p pVar, long j) {
        this.f270819b = pVar;
        this.f270818a = j;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        for (C96826as a : this.f270819b.f270825e) {
            long j = this.f270818a;
            Optional a2 = a.mo90363a(j);
            if (a2.isPresent()) {
                ((C96825ar) a2.get()).f270770a.mo5439d(th);
            } else {
                ((C59052c) ((C59052c) C96826as.f270771a.mo56226d()).mo56372aa(20905)).mo56388r("onTaskFailed() callback not found; batchId=%d", j);
            }
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        List list = (List) obj;
        for (C96826as a : this.f270819b.f270825e) {
            long j = this.f270818a;
            Optional a2 = a.mo90363a(j);
            if (a2.isPresent()) {
                ((C96825ar) a2.get()).f270770a.mo5437b((Object) null);
            } else {
                ((C59052c) ((C59052c) C96826as.f270771a.mo56226d()).mo56372aa(20904)).mo56388r("onTaskDone() callback not found; batchId=%d", j);
            }
        }
    }
}

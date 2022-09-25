package com.google.android.apps.gsa.staticplugins.accl.p7331c.p7332a;

import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67186ad;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.a.g */
/* compiled from: PG */
public final class C92755g implements C84295m {

    /* renamed from: a */
    private static final C59071e f258855a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.c.a.g");

    /* renamed from: b */
    private C63088z f258856b = C63088z.f170246b;

    /* renamed from: c */
    private boolean f258857c;

    /* renamed from: d */
    private final C92761m f258858d;

    public C92755g(C92761m mVar) {
        this.f258858d = mVar;
    }

    /* renamed from: b */
    private final void m152781b(C58833ax axVar) {
        if (this.f258857c) {
            ((C59052c) ((C59052c) f258855a.mo56225c()).mo56372aa(13050)).mo56389s("Listener was already notified of TTS done, Ignoring ttsBytesOptional: %s", axVar);
            return;
        }
        this.f258857c = true;
        C92762n nVar = this.f258858d.f258868a;
        synchronized (nVar.f258870b) {
            SettableFuture settableFuture = nVar.f258871c;
            if (settableFuture != null && !settableFuture.isDone()) {
                nVar.f258871c.mo57356n(axVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo77831a(C90523o oVar) {
        m152781b(C58836b.f156633a);
    }

    /* renamed from: c */
    public final void mo77832c(C90523o oVar) {
        m152781b(C58836b.f156633a);
    }

    /* renamed from: d */
    public final void mo77833d(C66611ci ciVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C67186ad.f182611f);
        ciVar.mo58887l(r0);
        Object l = ciVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C67186ad adVar = (C67186ad) obj;
        if ((adVar.f182613a & 1) != 0) {
            this.f258856b = this.f258856b.mo59177x(adVar.f182614b);
        }
        if (adVar.f182615c) {
            m152781b(C58833ax.m90834k(this.f258856b));
        }
    }
}

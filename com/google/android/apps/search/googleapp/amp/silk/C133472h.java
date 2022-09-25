package com.google.android.apps.search.googleapp.amp.silk;

import android.net.Uri;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.urlhandler.optimizer.C139829a;
import com.google.android.apps.search.googleapp.urlhandler.optimizer.C139846f;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.silk.p3205a.p3206a.C41709a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56612d;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56616h;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56618j;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protobuf.p4750c.C62950b;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Instant;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.googleapp.amp.silk.h */
/* compiled from: PG */
public final class C133472h implements C41709a {

    /* renamed from: a */
    private final C139846f f363689a;

    /* renamed from: b */
    private final C133467c f363690b;

    /* renamed from: c */
    private final AccountId f363691c;

    /* renamed from: d */
    private final boolean f363692d;

    /* renamed from: e */
    private final boolean f363693e;

    /* renamed from: f */
    private final Fragment f363694f;

    /* renamed from: g */
    private final AtomicReference f363695g;

    /* renamed from: h */
    private final C37215b f363696h;

    /* renamed from: i */
    private final C60950i f363697i;

    /* renamed from: j */
    private final int f363698j;

    public C133472h(int i, C139846f fVar, C133467c cVar, AccountId accountId, boolean z, boolean z2, Fragment fragment, AtomicReference atomicReference, C37215b bVar, C60950i iVar) {
        this.f363698j = i;
        this.f363689a = fVar;
        this.f363690b = cVar;
        this.f363691c = accountId;
        this.f363692d = z;
        this.f363693e = z2;
        this.f363694f = fragment;
        this.f363695g = atomicReference;
        this.f363696h = bVar;
        this.f363697i = iVar;
    }

    /* renamed from: c */
    private final boolean m216650c() {
        return this.f363698j + -1 != 1 ? this.f363693e : this.f363692d;
    }

    /* renamed from: a */
    public final C60870cx mo44311a(C56616h hVar) {
        C56612d dVar = hVar.f151166b;
        if (dVar == null) {
            dVar = C56612d.f151152f;
        }
        if (C133480p.m216667b(dVar)) {
            return C60856cj.m92899h(new IllegalArgumentException("Empty request."));
        }
        C56612d dVar2 = hVar.f151166b;
        if (dVar2 == null) {
            dVar2 = C56612d.f151152f;
        }
        if (!C133480p.m216666a(dVar2)) {
            return C60856cj.m92899h(new IllegalArgumentException("Invalid starting index."));
        }
        Instant a = this.f363697i.mo57444a();
        boolean z = false;
        if (m216650c()) {
            C56612d dVar3 = hVar.f151166b;
            if (dVar3 == null) {
                dVar3 = C56612d.f151152f;
            }
            if (Collection.EL.stream(dVar3.f151154a).allMatch(C133479o.f363714a)) {
                C56612d dVar4 = hVar.f151166b;
                if (dVar4 == null) {
                    dVar4 = C56612d.f151152f;
                }
                if (Collection.EL.stream(dVar4.f151154a).allMatch(C133478n.f363713a)) {
                    z = true;
                }
            }
        }
        if (z) {
            if (this.f363698j == 2) {
                this.f363696h.mo19974a(C37182a.f97943dP);
            } else {
                this.f363696h.mo19974a(C37182a.f97944dQ);
            }
        }
        Fragment fragment = this.f363694f;
        AccountId accountId = this.f363691c;
        C133475k kVar = (C133475k) fragment.getChildFragmentManager().f634a.mo671c("silk_amp_api_ui_thread_helper_fragment");
        if (kVar == null) {
            kVar = new C133475k();
            C68324h.m98669f(kVar);
            C47247a.m84047b(kVar, accountId);
            C0154a aVar = new C0154a(fragment.getChildFragmentManager());
            aVar.mo685r(kVar, "silk_amp_api_ui_thread_helper_fragment");
            aVar.mo509f();
        }
        SilkAmpApiImplOpenHelperFragmentPeer a2 = kVar.mo17754z();
        int i = this.f363698j;
        String str = (String) this.f363695g.get();
        if (z) {
            ProtoParsers.InternalDontUse internalDontUse = new ProtoParsers.InternalDontUse((byte[]) null, hVar);
            ProtoParsers.InternalDontUse internalDontUse2 = new ProtoParsers.InternalDontUse((byte[]) null, C62950b.m95472c(a));
            if (str == null) {
                str = null;
            }
            a2.f363672h.mo50445g(new C46438d(a2.f363670f.mo115249a()), new C46436b(new C133462x51e0c516(i, str, internalDontUse, internalDontUse2)), a2.f363674j);
        } else {
            a2.mo111176a(hVar, i, str, a);
        }
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final C60870cx mo44312b(C56618j jVar) {
        C56612d dVar = jVar.f151172b;
        if (dVar == null) {
            dVar = C56612d.f151152f;
        }
        if (C133480p.m216667b(dVar)) {
            return C60856cj.m92899h(new IllegalArgumentException("Empty request."));
        }
        C56612d dVar2 = jVar.f151172b;
        if (dVar2 == null) {
            dVar2 = C56612d.f151152f;
        }
        if (!C133480p.m216666a(dVar2)) {
            return C60856cj.m92899h(new IllegalArgumentException("Invalid starting index."));
        }
        C56612d dVar3 = jVar.f151172b;
        if (dVar3 == null) {
            dVar3 = C56612d.f151152f;
        }
        C56610b bVar = (C56610b) dVar3.f151154a.get((int) dVar3.f151156c);
        if (m216650c() && bVar.f151148g) {
            return C60866ct.f164955a;
        }
        Uri a = this.f363690b.mo111183b(Uri.parse(bVar.f151144c)).mo111163a();
        this.f363689a.mo115306c();
        C139846f fVar = this.f363689a;
        if (!fVar.f380122f) {
            C60870cx a2 = fVar.mo115305a();
            C139829a aVar = new C139829a(a);
            C139846f.m227380b(C60922j.m93045h(a2, C47810es.m84966f(aVar), fVar.f380121e), "Failed to preload URL", new Object[0]);
        }
        return C60866ct.f164955a;
    }
}

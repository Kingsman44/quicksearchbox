package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.nga.api.bh;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87873gt;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88405ac;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.staticplugins.bisto.C94635a;
import com.google.android.apps.gsa.staticplugins.bisto.C95270e;
import com.google.android.apps.gsa.staticplugins.bisto.C95458i;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e.C94960u;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95130w;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95298d;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.assistant.p3739a.p3740a.C48045af;
import com.google.assistant.p3739a.p3740a.C48090bx;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.protobuf.C63088z;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.t */
/* compiled from: PG */
public final /* synthetic */ class C95002t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95005w f265785a;

    /* renamed from: b */
    public final /* synthetic */ C95455a f265786b;

    /* renamed from: c */
    public final /* synthetic */ C95007y f265787c;

    /* renamed from: d */
    public final /* synthetic */ C124548d f265788d;

    /* renamed from: e */
    public final /* synthetic */ boolean f265789e;

    /* renamed from: f */
    public final /* synthetic */ int f265790f;

    /* renamed from: g */
    public final /* synthetic */ C48090bx f265791g;

    /* renamed from: h */
    public final /* synthetic */ boolean f265792h;

    /* renamed from: i */
    public final /* synthetic */ C58833ax f265793i;

    /* renamed from: j */
    public final /* synthetic */ C94960u f265794j;

    public /* synthetic */ C95002t(C95005w wVar, C95455a aVar, C95007y yVar, C124548d dVar, boolean z, int i, C48090bx bxVar, boolean z2, C58833ax axVar, C94960u uVar) {
        this.f265785a = wVar;
        this.f265786b = aVar;
        this.f265787c = yVar;
        this.f265788d = dVar;
        this.f265789e = z;
        this.f265790f = i;
        this.f265791g = bxVar;
        this.f265792h = z2;
        this.f265793i = axVar;
        this.f265794j = uVar;
    }

    public final void run() {
        Uri uri;
        int i;
        C95005w wVar = this.f265785a;
        C95455a aVar = this.f265786b;
        C95007y yVar = this.f265787c;
        C124548d dVar = this.f265788d;
        boolean z = this.f265789e;
        int i2 = this.f265790f;
        C48090bx bxVar = this.f265791g;
        boolean z2 = this.f265792h;
        C58833ax axVar = this.f265793i;
        C94960u uVar = this.f265794j;
        C94995m mVar = wVar.f265808b;
        C95003u uVar2 = new C95003u(wVar, yVar);
        C58976aa aaVar = C58975e.f156826a;
        C48045af afVar = bxVar.f124455c;
        if (afVar == null) {
            afVar = C48045af.f124365d;
        }
        mVar.mo88900d("Device state: %s", afVar);
        if (!mVar.f265761x.f265734d.equals("IDLE") && !mVar.f265761x.f265734d.equals("DONE") && !mVar.f265761x.f265734d.equals("WAITING_FOR_AUDIO")) {
            C59104x b = C94995m.f265738a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17813)).mo56389s("Current state: %s; cancelling current query", mVar.f265761x.f265734d);
            mVar.f265761x.mo88895a();
        }
        mVar.f265751n = uVar2;
        mVar.f265759v = dVar;
        mVar.f265762y = uVar;
        mVar.f265760w = true;
        mVar.f265756s = 0;
        mVar.f265755r = null;
        Bundle a = C95130w.m157240a(mVar.f265741d, !aVar.f267099b, aVar);
        C94995m.m156832a(a, bxVar, dVar, mVar.f265746i.f265849b);
        a.putInt("com.google.android.apps.gsa.shared.bisto.AUDIO_SAMPLING_RATE", i2);
        Uri uri2 = aVar.f267098a;
        C95006x xVar = mVar.f265742e;
        boolean z3 = mVar.f265752o;
        boolean equals = mVar.f265761x.f265734d.equals("WAITING_FOR_AUDIO");
        xVar.f265815d.mo89056a();
        if (!equals) {
            xVar.mo88915d();
        }
        if (a.containsKey("com.google.android.apps.gsa.shared.bisto.AUDIO_SAMPLING_RATE") && (i = a.getInt("com.google.android.apps.gsa.shared.bisto.AUDIO_SAMPLING_RATE")) != 0 && i >= 0) {
            uri = uri2;
        } else {
            uri = uri2;
            i = 0;
        }
        long a2 = C95006x.m156856a(a);
        Query aI = Query.f252741b.mo84307as(xVar.mo88913b(a, dVar)).mo84275aL("com.google.android.apps.gsa.search.core.service.SearchService").mo84272aI(amo.BISTO);
        C90498f i3 = aI.mo84480i();
        i3.mo84562U(1);
        C124548d dVar2 = dVar;
        boolean z4 = z;
        C90498f fVar = i3;
        C48090bx bxVar2 = bxVar;
        boolean z5 = z2;
        fVar.mo84573e(0, 2048);
        fVar.mo84573e(0, 2);
        fVar.mo84561T(QueryTriggerType.BISTO);
        fVar.mo84572d(0, 33554432);
        fVar.mo84572d(512, 0);
        fVar.mo84552K(-2, -2);
        fVar.mo84572d(16384, 0);
        fVar.mo84564W(0);
        fVar.mo84547F(uri, i, false);
        fVar.mo84572d(0, 1024);
        fVar.mo84549H((Long) null);
        fVar.mo84593y(aI.f252746D.mo83792a(a2));
        C90498f i4 = fVar.mo84568a().mo84244G(true).mo84261Y(!a.getBoolean("com.google.android.apps.gsa.shared.bisto.ENDPOINTING_BY_CLOSING_STREAM", false)).mo84314az().mo84287aX().mo84480i();
        i4.mo84572d(0, 67108864);
        Query a3 = i4.mo84568a();
        if (z3) {
            a3 = a3.mo84286aW(QueryTriggerType.FOLLOW_ON);
        } else if (axVar.mo56113h()) {
            a3 = a3.mo84286aW(QueryTriggerType.HOTWORD).mo84310av(HotwordResultMetadata.m147624r(xVar.f265813b, (HotwordResult) axVar.mo56107c(), false, xVar.f265816e.mo26870b(), false));
        }
        if (z5) {
            C90498f i5 = a3.mo84480i();
            i5.mo84573e(0, 2097152);
            a3 = i5.mo84568a();
        }
        Query aH = a3.mo84271aH(xVar.f265817f);
        if (axVar.mo56113h()) {
            C88405ac acVar = (C88405ac) C88406ad.f239033l.createBuilder();
            C63088z m = C90772bp.m148305m(aH);
            acVar.copyOnWrite();
            C88406ad adVar = (C88406ad) acVar.instance;
            m.getClass();
            adVar.f239035a |= 1;
            adVar.f239036b = m;
            C63088z m2 = C90772bp.m148305m((Parcelable) axVar.mo56107c());
            acVar.copyOnWrite();
            C88406ad adVar2 = (C88406ad) acVar.instance;
            m2.getClass();
            adVar2.f239035a |= 2;
            adVar2.f239037c = m2;
            C88489j jVar = new C88489j(C87739bu.HOTWORD_DETECTED_ON_ACTIVE_CLIENT);
            jVar.mo82014b(C87873gt.f237726a, (C88406ad) acVar.build());
            xVar.f265814c.mo81937i(jVar.mo82013a());
        } else {
            xVar.f265814c.mo81931b(aH);
        }
        if (!mVar.f265761x.f265734d.equals("WAITING_FOR_AUDIO")) {
            C95007y yVar2 = mVar.f265751n;
            yVar2.getClass();
            yVar2.mo88817h(mVar.f265742e.f265817f, z4, bxVar2.f124456d);
        }
        C95458i iVar = mVar.f265750m;
        C95298d dVar3 = mVar.f265748k;
        iVar.f267111b.set(true);
        iVar.f267118i = Optional.m71637of(new C94635a(dVar3, dVar2));
        iVar.f267117h.mo28212l("call-hotword-arbitration-listeners", new C95270e(iVar));
        if (axVar.mo56113h()) {
            bh bhVar = mVar.f265749l;
            C95458i iVar2 = mVar.f265750m;
            Objects.requireNonNull(iVar2);
            bhVar.b(new C94981a(iVar2));
        }
        mVar.mo88902f("FETCHING");
    }
}

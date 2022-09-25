package com.google.android.apps.gsa.nga.engine.p6056o;

import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import com.google.android.apps.gsa.nga.engine.understanding.C79004ba;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82838ch;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e */
/* compiled from: PG */
final class C76760e extends C77425s {

    /* renamed from: a */
    public C78983aj f212126a;

    /* renamed from: b */
    public C80379i f212127b;

    /* renamed from: c */
    public C82838ch f212128c;

    /* renamed from: d */
    public C79004ba f212129d;

    /* renamed from: e */
    private C80401n f212130e;

    /* renamed from: f */
    private boolean f212131f;

    /* renamed from: g */
    private byte f212132g;

    public C76760e() {
    }

    public C76760e(C77426t tVar) {
        C77369f fVar = (C77369f) tVar;
        this.f212126a = fVar.f213373a;
        this.f212130e = fVar.f213374b;
        this.f212127b = fVar.f213375c;
        this.f212128c = fVar.f213376d;
        this.f212131f = fVar.f213377e;
        this.f212129d = fVar.f213378f;
        this.f212132g = 1;
    }

    /* renamed from: a */
    public final C77426t mo72324a() {
        C78983aj ajVar;
        C80401n nVar;
        C80379i iVar;
        C82838ch chVar;
        C79004ba baVar;
        if (this.f212132g == 1 && (ajVar = this.f212126a) != null && (nVar = this.f212130e) != null && (iVar = this.f212127b) != null && (chVar = this.f212128c) != null && (baVar = this.f212129d) != null) {
            return new C77369f(ajVar, nVar, iVar, chVar, this.f212131f, baVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f212126a == null) {
            sb.append(" queryUnderstandingResult");
        }
        if (this.f212130e == null) {
            sb.append(" onDeviceFulfillerResponse");
        }
        if (this.f212127b == null) {
            sb.append(" preFulfillmentRankingFeatures");
        }
        if (this.f212128c == null) {
            sb.append(" fulfillmentCandidateInfo");
        }
        if (this.f212132g == 0) {
            sb.append(" didMultipleDevicesTrigger");
        }
        if (this.f212129d == null) {
            sb.append(" understandingStreamzEventsBuilder");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo72325b(boolean z) {
        this.f212131f = z;
        this.f212132g = 1;
    }

    /* renamed from: c */
    public final void mo72326c(C80401n nVar) {
        if (nVar != null) {
            this.f212130e = nVar;
            return;
        }
        throw new NullPointerException("Null onDeviceFulfillerResponse");
    }
}

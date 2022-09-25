package com.google.android.libraries.lens.p2014e;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.p4017at.p4056g.p4057a.p4058a.C54007bo;
import com.google.p4017at.p4056g.p4057a.p4058a.C54054f;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56304dd;

/* renamed from: com.google.android.libraries.lens.e.c */
/* compiled from: PG */
public final class C24211c extends C24228t {

    /* renamed from: a */
    public C58833ax f66155a;

    /* renamed from: b */
    public C58833ax f66156b;

    /* renamed from: c */
    public String f66157c;

    /* renamed from: d */
    public C58833ax f66158d;

    /* renamed from: e */
    private boolean f66159e;

    /* renamed from: f */
    private C56220aa f66160f;

    /* renamed from: g */
    private C58485gu f66161g;

    /* renamed from: h */
    private C56304dd f66162h;

    /* renamed from: i */
    private C58485gu f66163i;

    /* renamed from: j */
    private C54007bo f66164j;

    /* renamed from: k */
    private int f66165k;

    /* renamed from: l */
    private C54054f f66166l;

    /* renamed from: m */
    private boolean f66167m;

    /* renamed from: n */
    private boolean f66168n;

    /* renamed from: o */
    private byte f66169o;

    public C24211c() {
        C58836b bVar = C58836b.f156633a;
        this.f66155a = bVar;
        this.f66156b = bVar;
        this.f66158d = bVar;
    }

    public C24211c(C24229u uVar) {
        C58836b bVar = C58836b.f156633a;
        this.f66155a = bVar;
        this.f66156b = bVar;
        this.f66158d = bVar;
        C24212d dVar = (C24212d) uVar;
        this.f66159e = dVar.f66170a;
        this.f66160f = dVar.f66171b;
        this.f66161g = dVar.f66172c;
        this.f66155a = dVar.f66173d;
        this.f66162h = dVar.f66174e;
        this.f66163i = dVar.f66175f;
        this.f66156b = dVar.f66176g;
        this.f66157c = dVar.f66177h;
        this.f66164j = dVar.f66178i;
        this.f66165k = dVar.f66179j;
        this.f66166l = dVar.f66180k;
        this.f66167m = dVar.f66181l;
        this.f66158d = dVar.f66182m;
        this.f66168n = dVar.f66183n;
        this.f66169o = 15;
    }

    /* renamed from: a */
    public final C24229u mo29721a() {
        if (this.f66169o == 15 && this.f66160f != null && this.f66161g != null && this.f66162h != null && this.f66163i != null && this.f66157c != null && this.f66164j != null && this.f66166l != null) {
            return new C24212d(this.f66159e, this.f66160f, this.f66161g, this.f66155a, this.f66162h, this.f66163i, this.f66156b, this.f66157c, this.f66164j, this.f66165k, this.f66166l, this.f66167m, this.f66158d, this.f66168n);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f66169o & 1) == 0) {
            sb.append(" isComplete");
        }
        if (this.f66160f == null) {
            sb.append(" detectedObjects");
        }
        if (this.f66161g == null) {
            sb.append(" deepGleamData");
        }
        if (this.f66162h == null) {
            sb.append(" filterDetectedContexts");
        }
        if (this.f66163i == null) {
            sb.append(" filterRecommendations");
        }
        if (this.f66157c == null) {
            sb.append(" reverseImageSearchUrl");
        }
        if (this.f66164j == null) {
            sb.append(" logInfo");
        }
        if ((this.f66169o & 2) == 0) {
            sb.append(" statusCode");
        }
        if (this.f66166l == null) {
            sb.append(" backendMetadata");
        }
        if ((this.f66169o & 4) == 0) {
            sb.append(" hasEarlyGleams");
        }
        if ((this.f66169o & 8) == 0) {
            sb.append(" isOnDeviceError");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo29722b(C54054f fVar) {
        if (fVar != null) {
            this.f66166l = fVar;
            return;
        }
        throw new NullPointerException("Null backendMetadata");
    }

    /* renamed from: c */
    public final void mo29723c(C58485gu guVar) {
        if (guVar != null) {
            this.f66161g = guVar;
            return;
        }
        throw new NullPointerException("Null deepGleamData");
    }

    /* renamed from: d */
    public final void mo29724d(C56220aa aaVar) {
        if (aaVar != null) {
            this.f66160f = aaVar;
            return;
        }
        throw new NullPointerException("Null detectedObjects");
    }

    /* renamed from: e */
    public final void mo29725e(C56304dd ddVar) {
        if (ddVar != null) {
            this.f66162h = ddVar;
            return;
        }
        throw new NullPointerException("Null filterDetectedContexts");
    }

    /* renamed from: f */
    public final void mo29726f(C58485gu guVar) {
        if (guVar != null) {
            this.f66163i = guVar;
            return;
        }
        throw new NullPointerException("Null filterRecommendations");
    }

    /* renamed from: g */
    public final void mo29727g(boolean z) {
        this.f66167m = z;
        this.f66169o = (byte) (this.f66169o | 4);
    }

    /* renamed from: h */
    public final void mo29728h(boolean z) {
        this.f66159e = z;
        this.f66169o = (byte) (this.f66169o | 1);
    }

    /* renamed from: i */
    public final void mo29729i(boolean z) {
        this.f66168n = z;
        this.f66169o = (byte) (this.f66169o | 8);
    }

    /* renamed from: j */
    public final void mo29730j(C54007bo boVar) {
        if (boVar != null) {
            this.f66164j = boVar;
            return;
        }
        throw new NullPointerException("Null logInfo");
    }

    /* renamed from: k */
    public final void mo29731k(int i) {
        this.f66165k = i;
        this.f66169o = (byte) (this.f66169o | 2);
    }
}

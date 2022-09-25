package com.google.android.libraries.lens.view.p2173u;

import com.google.android.libraries.lens.view.p2069am.C25312at;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26733ab;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26750b;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26853b;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26876s;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26878u;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.aae;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.u.c */
/* compiled from: PG */
public final class C28097c {

    /* renamed from: a */
    public static final C58833ax f76483a = C58836b.f156633a;

    /* renamed from: b */
    public final long f76484b;

    /* renamed from: c */
    public final C26733ab f76485c;

    /* renamed from: d */
    public final int f76486d;

    /* renamed from: e */
    public final int f76487e;

    /* renamed from: f */
    public Integer f76488f;

    /* renamed from: g */
    public C28095a f76489g;

    /* renamed from: h */
    public C26750b f76490h;

    /* renamed from: i */
    public C58833ax f76491i;

    /* renamed from: j */
    public Integer f76492j;

    /* renamed from: k */
    public C58495hd f76493k;

    /* renamed from: l */
    public C58528ij f76494l;

    /* renamed from: m */
    public C58833ax f76495m;

    /* renamed from: n */
    public aae f76496n;

    /* renamed from: o */
    public C58833ax f76497o;

    /* renamed from: p */
    public C25312at f76498p;

    /* renamed from: q */
    private final C58833ax f76499q;

    /* renamed from: r */
    private C28096b f76500r = C28096b.UNINITIALIZED;

    public C28097c(long j, C26733ab abVar, int i, int i2, Integer num, C58833ax axVar) {
        C58836b bVar = C58836b.f156633a;
        this.f76491i = bVar;
        this.f76495m = f76483a;
        this.f76497o = bVar;
        this.f76484b = j;
        this.f76485c = abVar;
        this.f76486d = i;
        this.f76487e = i2;
        this.f76488f = num;
        this.f76499q = axVar;
        this.f76489g = C28095a.UNKNOWN;
    }

    /* renamed from: a */
    public final C28096b mo33558a() {
        C58838bb.m90884s(this.f76500r != C28096b.UNINITIALIZED, "Attempting to retrieve frameAnalysisTypes before it has been set.");
        return this.f76500r;
    }

    /* renamed from: b */
    public final C25312at mo33559b() {
        C25312at atVar = this.f76498p;
        C58838bb.m90866a(atVar, "accessed gleam update before setting");
        return atVar;
    }

    /* renamed from: c */
    public final void mo33560c(C28095a aVar) {
        C28095a aVar2 = C28095a.UNKNOWN;
        int ordinal = aVar.ordinal();
        boolean z = true;
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4) {
            mo33561d();
        } else if (ordinal == 5) {
            C28095a aVar3 = this.f76489g;
            if (!(aVar3 == C28095a.UNKNOWN || aVar3 == C28095a.SELECTED)) {
                z = false;
            }
            C58838bb.m90887v(z, "Invalid transition %s -> SELECTED", aVar3);
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Invalid reasonCode: %s -> %s", new Object[]{this.f76489g, aVar}));
        }
        this.f76489g = aVar;
    }

    /* renamed from: d */
    public final void mo33561d() {
        C58833ax axVar = this.f76499q;
        if (axVar.mo56113h()) {
            synchronized (axVar) {
                if (this.f76488f != null) {
                    C26853b bVar = (C26853b) this.f76499q.mo56107c();
                    Integer num = this.f76488f;
                    num.getClass();
                    C26876s sVar = bVar.f73165a;
                    C58974d dVar = C26878u.f73209a;
                    C58838bb.m90890y(!sVar.f73205a.contains(num), "**** FSIQ onPboBufferReleased DUPE return: %s; %s", num, sVar.f73205a);
                    sVar.f73205a.add(num);
                    this.f76488f = null;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo33562e(C28096b bVar) {
        C58838bb.m90869d(bVar != C28096b.UNINITIALIZED, "Attempting to set frameAnalysisType to UNINITIALIZED.");
        this.f76500r = bVar;
    }

    public final String toString() {
        return String.format(Locale.US, "{frame[%d]: [%d, %s; %s, %s; %s; %s]}", new Object[]{Long.valueOf(this.f76484b), Integer.valueOf(this.f76486d), this.f76488f, this.f76500r, this.f76489g, this.f76490h, this.f76495m});
    }
}

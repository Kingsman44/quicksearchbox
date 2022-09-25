package com.google.android.libraries.lens.view.p2148l;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.lens.p4707j.C62471cu;

/* renamed from: com.google.android.libraries.lens.view.l.c */
/* compiled from: PG */
public final class C27223c extends C27230j {

    /* renamed from: A */
    private boolean f74431A;

    /* renamed from: a */
    public C58833ax f74432a;

    /* renamed from: b */
    public C58833ax f74433b;

    /* renamed from: c */
    public C58833ax f74434c;

    /* renamed from: d */
    public C58833ax f74435d;

    /* renamed from: e */
    public C58833ax f74436e;

    /* renamed from: f */
    public C58833ax f74437f;

    /* renamed from: g */
    public C58833ax f74438g;

    /* renamed from: h */
    public C58833ax f74439h;

    /* renamed from: i */
    public C58833ax f74440i;

    /* renamed from: j */
    public C58833ax f74441j;

    /* renamed from: k */
    public C58833ax f74442k;

    /* renamed from: l */
    public C58833ax f74443l;

    /* renamed from: m */
    public C58833ax f74444m;

    /* renamed from: n */
    public C58833ax f74445n;

    /* renamed from: o */
    public C58833ax f74446o;

    /* renamed from: p */
    public short f74447p;

    /* renamed from: q */
    private C62471cu f74448q;

    /* renamed from: r */
    private C58833ax f74449r;

    /* renamed from: s */
    private boolean f74450s;

    /* renamed from: t */
    private int f74451t;

    /* renamed from: u */
    private int f74452u;

    /* renamed from: v */
    private boolean f74453v;

    /* renamed from: w */
    private boolean f74454w;

    /* renamed from: x */
    private int f74455x;

    /* renamed from: y */
    private boolean f74456y;

    /* renamed from: z */
    private boolean f74457z;

    public C27223c() {
        C58836b bVar = C58836b.f156633a;
        this.f74432a = bVar;
        this.f74433b = bVar;
        this.f74434c = bVar;
        this.f74449r = bVar;
        this.f74435d = bVar;
        this.f74436e = bVar;
        this.f74437f = bVar;
        this.f74438g = bVar;
        this.f74439h = bVar;
        this.f74440i = bVar;
        this.f74441j = bVar;
        this.f74442k = bVar;
        this.f74443l = bVar;
        this.f74444m = bVar;
        this.f74445n = bVar;
        this.f74446o = bVar;
    }

    public C27223c(C27232l lVar) {
        C58836b bVar = C58836b.f156633a;
        this.f74432a = bVar;
        this.f74433b = bVar;
        this.f74434c = bVar;
        this.f74449r = bVar;
        this.f74435d = bVar;
        this.f74436e = bVar;
        this.f74437f = bVar;
        this.f74438g = bVar;
        this.f74439h = bVar;
        this.f74440i = bVar;
        this.f74441j = bVar;
        this.f74442k = bVar;
        this.f74443l = bVar;
        this.f74444m = bVar;
        this.f74445n = bVar;
        this.f74446o = bVar;
        C27224d dVar = (C27224d) lVar;
        this.f74432a = dVar.f74458a;
        this.f74433b = dVar.f74459b;
        this.f74434c = dVar.f74460c;
        this.f74448q = dVar.f74461d;
        this.f74449r = dVar.f74462e;
        this.f74450s = dVar.f74463f;
        this.f74435d = dVar.f74464g;
        this.f74451t = dVar.f74465h;
        this.f74452u = dVar.f74466i;
        this.f74453v = dVar.f74467j;
        this.f74436e = dVar.f74468k;
        this.f74454w = dVar.f74469l;
        this.f74455x = dVar.f74470m;
        this.f74437f = dVar.f74471n;
        this.f74456y = dVar.f74472o;
        this.f74438g = dVar.f74473p;
        this.f74439h = dVar.f74474q;
        this.f74440i = dVar.f74475r;
        this.f74441j = dVar.f74476s;
        this.f74442k = dVar.f74477t;
        this.f74457z = dVar.f74478u;
        this.f74443l = dVar.f74479v;
        this.f74431A = dVar.f74480w;
        this.f74444m = dVar.f74481x;
        this.f74445n = dVar.f74482y;
        this.f74446o = dVar.f74483z;
        this.f74447p = 1023;
    }

    /* renamed from: a */
    public final C27232l mo32678a() {
        if (this.f74447p != 1023 || this.f74448q == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f74448q == null) {
                sb.append(" initParams");
            }
            if ((this.f74447p & 1) == 0) {
                sb.append(" isTriggeredFromAgsaExternal");
            }
            if ((this.f74447p & 2) == 0) {
                sb.append(" transitionType");
            }
            if ((this.f74447p & 4) == 0) {
                sb.append(" intentTypeForLoggingOnly");
            }
            if ((this.f74447p & 8) == 0) {
                sb.append(" enableArtLookalikeFeature");
            }
            if ((this.f74447p & 16) == 0) {
                sb.append(" shouldHideLensCloseButton");
            }
            if ((this.f74447p & 32) == 0) {
                sb.append(" screenOrientation");
            }
            if ((this.f74447p & 64) == 0) {
                sb.append(" isFromIncognito");
            }
            if ((this.f74447p & 128) == 0) {
                sb.append(" promoAddShortcut");
            }
            if ((this.f74447p & 256) == 0) {
                sb.append(" hermeticLfeRecordMode");
            }
            if ((this.f74447p & 512) == 0) {
                sb.append(" recordLensMessages");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        C27224d dVar = r2;
        C27224d dVar2 = new C27224d(this.f74432a, this.f74433b, this.f74434c, this.f74448q, this.f74449r, this.f74450s, this.f74435d, this.f74451t, this.f74452u, this.f74453v, this.f74436e, this.f74454w, this.f74455x, this.f74437f, this.f74456y, this.f74438g, this.f74439h, this.f74440i, this.f74441j, this.f74442k, this.f74457z, this.f74443l, this.f74431A, this.f74444m, this.f74445n, this.f74446o);
        return dVar;
    }

    /* renamed from: b */
    public final void mo32679b(String str) {
        this.f74434c = C58833ax.m90833j(str);
    }

    /* renamed from: c */
    public final void mo32680c(boolean z) {
        this.f74453v = z;
        this.f74447p = (short) (this.f74447p | 8);
    }

    /* renamed from: d */
    public final void mo32681d(long j) {
        this.f74449r = C58833ax.m90834k(Long.valueOf(j));
    }

    /* renamed from: e */
    public final void mo32682e(boolean z) {
        this.f74431A = z;
        this.f74447p = (short) (this.f74447p | 256);
    }

    /* renamed from: f */
    public final void mo32683f(C62471cu cuVar) {
        if (cuVar != null) {
            this.f74448q = cuVar;
            return;
        }
        throw new NullPointerException("Null initParams");
    }

    /* renamed from: g */
    public final void mo32684g(int i) {
        this.f74452u = i;
        this.f74447p = (short) (this.f74447p | 4);
    }

    /* renamed from: h */
    public final void mo32685h(boolean z) {
        this.f74456y = z;
        this.f74447p = (short) (this.f74447p | 64);
    }

    /* renamed from: i */
    public final void mo32686i(boolean z) {
        this.f74450s = z;
        this.f74447p = (short) (this.f74447p | 1);
    }

    /* renamed from: j */
    public final void mo32687j(boolean z) {
        this.f74457z = z;
        this.f74447p = (short) (this.f74447p | 128);
    }

    /* renamed from: k */
    public final void mo32688k(int i) {
        this.f74455x = i;
        this.f74447p = (short) (this.f74447p | 32);
    }

    /* renamed from: l */
    public final void mo32689l(boolean z) {
        this.f74454w = z;
        this.f74447p = (short) (this.f74447p | 16);
    }

    /* renamed from: m */
    public final void mo32690m(int i) {
        this.f74451t = i;
        this.f74447p = (short) (this.f74447p | 2);
    }
}

package com.google.android.libraries.lens.view.vision;

import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.vision.f */
/* compiled from: PG */
public final class C28164f extends C28178t {

    /* renamed from: A */
    private boolean f76632A;

    /* renamed from: a */
    public int f76633a;

    /* renamed from: b */
    public C58833ax f76634b;

    /* renamed from: c */
    public C58833ax f76635c;

    /* renamed from: d */
    public C58833ax f76636d;

    /* renamed from: e */
    public C58833ax f76637e;

    /* renamed from: f */
    public C58833ax f76638f;

    /* renamed from: g */
    public C58833ax f76639g;

    /* renamed from: h */
    public C58833ax f76640h;

    /* renamed from: i */
    public C58833ax f76641i;

    /* renamed from: j */
    public C58833ax f76642j;

    /* renamed from: k */
    public short f76643k;

    /* renamed from: l */
    private float f76644l;

    /* renamed from: m */
    private float f76645m;

    /* renamed from: n */
    private float f76646n;

    /* renamed from: o */
    private float f76647o;

    /* renamed from: p */
    private float f76648p;

    /* renamed from: q */
    private boolean f76649q;

    /* renamed from: r */
    private boolean f76650r;

    /* renamed from: s */
    private boolean f76651s;

    /* renamed from: t */
    private boolean f76652t;

    /* renamed from: u */
    private boolean f76653u;

    /* renamed from: v */
    private long f76654v;

    /* renamed from: w */
    private C58485gu f76655w;

    /* renamed from: x */
    private C25349y f76656x;

    /* renamed from: y */
    private float f76657y;

    /* renamed from: z */
    private float f76658z;

    public C28164f() {
        C58836b bVar = C58836b.f156633a;
        this.f76634b = bVar;
        this.f76635c = bVar;
        this.f76636d = bVar;
        this.f76637e = bVar;
        this.f76638f = bVar;
        this.f76639g = bVar;
        this.f76640h = bVar;
        this.f76641i = bVar;
        this.f76642j = bVar;
    }

    public C28164f(C28179u uVar) {
        C58836b bVar = C58836b.f156633a;
        this.f76634b = bVar;
        this.f76635c = bVar;
        this.f76636d = bVar;
        this.f76637e = bVar;
        this.f76638f = bVar;
        this.f76639g = bVar;
        this.f76640h = bVar;
        this.f76641i = bVar;
        this.f76642j = bVar;
        C28165g gVar = (C28165g) uVar;
        this.f76633a = gVar.f76659a;
        this.f76644l = gVar.f76660b;
        this.f76645m = gVar.f76661c;
        this.f76646n = gVar.f76662d;
        this.f76647o = gVar.f76663e;
        this.f76648p = gVar.f76664f;
        this.f76634b = gVar.f76665g;
        this.f76635c = gVar.f76666h;
        this.f76649q = gVar.f76667i;
        this.f76650r = gVar.f76668j;
        this.f76651s = gVar.f76669k;
        this.f76636d = gVar.f76670l;
        this.f76637e = gVar.f76671m;
        this.f76652t = gVar.f76672n;
        this.f76638f = gVar.f76673o;
        this.f76639g = gVar.f76674p;
        this.f76653u = gVar.f76675q;
        this.f76654v = gVar.f76676r;
        this.f76655w = gVar.f76677s;
        this.f76656x = gVar.f76678t;
        this.f76657y = gVar.f76679u;
        this.f76658z = gVar.f76680v;
        this.f76640h = gVar.f76681w;
        this.f76641i = gVar.f76682x;
        this.f76642j = gVar.f76683y;
        this.f76632A = gVar.f76684z;
        this.f76643k = -1;
    }

    /* renamed from: a */
    public final C28179u mo33637a() {
        if (this.f76643k != -1 || this.f76655w == null || this.f76656x == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.f76643k & 1) == 0) {
                sb.append(" id");
            }
            if ((this.f76643k & 2) == 0) {
                sb.append(" x");
            }
            if ((this.f76643k & 4) == 0) {
                sb.append(" y");
            }
            if ((this.f76643k & 8) == 0) {
                sb.append(" sizeX");
            }
            if ((this.f76643k & 16) == 0) {
                sb.append(" sizeY");
            }
            if ((this.f76643k & 32) == 0) {
                sb.append(" rotationZ");
            }
            if ((this.f76643k & 64) == 0) {
                sb.append(" groupTracking");
            }
            if ((this.f76643k & 128) == 0) {
                sb.append(" isFrameSelectionBox");
            }
            if ((this.f76643k & 256) == 0) {
                sb.append(" enableFeatureMatchStats");
            }
            if ((this.f76643k & 512) == 0) {
                sb.append(" skipOcclusionDetection");
            }
            if ((this.f76643k & 1024) == 0) {
                sb.append(" allowTrackingUsingPose");
            }
            if ((this.f76643k & 2048) == 0) {
                sb.append(" reacquisitionEnabled");
            }
            if ((this.f76643k & 4096) == 0) {
                sb.append(" timestampUs");
            }
            if (this.f76655w == null) {
                sb.append(" quadVertices");
            }
            if (this.f76656x == null) {
                sb.append(" gleamType");
            }
            if ((this.f76643k & 8192) == 0) {
                sb.append(" extentX");
            }
            if ((this.f76643k & 16384) == 0) {
                sb.append(" extentZ");
            }
            if ((this.f76643k & 32768) == 0) {
                sb.append(" usesGroupHomography");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        C28165g gVar = r2;
        C28165g gVar2 = new C28165g(this.f76633a, this.f76644l, this.f76645m, this.f76646n, this.f76647o, this.f76648p, this.f76634b, this.f76635c, this.f76649q, this.f76650r, this.f76651s, this.f76636d, this.f76637e, this.f76652t, this.f76638f, this.f76639g, this.f76653u, this.f76654v, this.f76655w, this.f76656x, this.f76657y, this.f76658z, this.f76640h, this.f76641i, this.f76642j, this.f76632A);
        return gVar;
    }

    /* renamed from: b */
    public final void mo33638b(boolean z) {
        this.f76652t = z;
        this.f76643k = (short) (this.f76643k | 1024);
    }

    /* renamed from: c */
    public final void mo33639c(float f) {
        this.f76657y = f;
        this.f76643k = (short) (this.f76643k | 8192);
    }

    /* renamed from: d */
    public final void mo33640d(float f) {
        this.f76658z = f;
        this.f76643k = (short) (this.f76643k | 16384);
    }

    /* renamed from: e */
    public final void mo33641e(C25349y yVar) {
        if (yVar != null) {
            this.f76656x = yVar;
            return;
        }
        throw new NullPointerException("Null gleamType");
    }

    /* renamed from: f */
    public final void mo33642f(boolean z) {
        this.f76649q = z;
        this.f76643k = (short) (this.f76643k | 64);
    }

    /* renamed from: g */
    public final void mo33643g(boolean z) {
        this.f76650r = z;
        this.f76643k = (short) (this.f76643k | 128);
    }

    /* renamed from: h */
    public final void mo33644h(C58485gu guVar) {
        if (guVar != null) {
            this.f76655w = guVar;
            return;
        }
        throw new NullPointerException("Null quadVertices");
    }

    /* renamed from: i */
    public final void mo33645i(boolean z) {
        this.f76653u = z;
        this.f76643k = (short) (this.f76643k | 2048);
    }

    /* renamed from: j */
    public final void mo33646j(float f) {
        this.f76648p = f;
        this.f76643k = (short) (this.f76643k | 32);
    }

    /* renamed from: k */
    public final void mo33647k(float f) {
        this.f76646n = f;
        this.f76643k = (short) (this.f76643k | 8);
    }

    /* renamed from: l */
    public final void mo33648l(float f) {
        this.f76647o = f;
        this.f76643k = (short) (this.f76643k | 16);
    }

    /* renamed from: m */
    public final void mo33649m(boolean z) {
        this.f76651s = z;
        this.f76643k = (short) (this.f76643k | 512);
    }

    /* renamed from: n */
    public final void mo33650n(long j) {
        this.f76654v = j;
        this.f76643k = (short) (this.f76643k | 4096);
    }

    /* renamed from: o */
    public final void mo33651o(boolean z) {
        this.f76632A = z;
        this.f76643k = (short) (this.f76643k | 32768);
    }

    /* renamed from: p */
    public final void mo33652p(float f) {
        this.f76644l = f;
        this.f76643k = (short) (this.f76643k | 2);
    }

    /* renamed from: q */
    public final void mo33653q(float f) {
        this.f76645m = f;
        this.f76643k = (short) (this.f76643k | 4);
    }
}

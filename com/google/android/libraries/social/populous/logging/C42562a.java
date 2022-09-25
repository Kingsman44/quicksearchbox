package com.google.android.libraries.social.populous.logging;

import java.util.EnumSet;
import p5602o.p5607c.C71942m;

/* renamed from: com.google.android.libraries.social.populous.logging.a */
/* compiled from: PG */
public final class C42562a extends C42584s {

    /* renamed from: a */
    public String f111674a;

    /* renamed from: b */
    public String f111675b;

    /* renamed from: c */
    public String f111676c;

    /* renamed from: d */
    public String f111677d;

    /* renamed from: e */
    public String f111678e;

    /* renamed from: f */
    public String f111679f;

    /* renamed from: g */
    public Long f111680g;

    /* renamed from: h */
    public Integer f111681h;

    /* renamed from: i */
    public String f111682i;

    /* renamed from: j */
    public C71942m f111683j;

    /* renamed from: k */
    private EnumSet f111684k;

    /* renamed from: l */
    private EnumSet f111685l;

    /* renamed from: m */
    private int f111686m;

    /* renamed from: n */
    private int f111687n;

    /* renamed from: o */
    private int f111688o;

    /* renamed from: p */
    private boolean f111689p;

    /* renamed from: q */
    private boolean f111690q;

    /* renamed from: r */
    private boolean f111691r;

    /* renamed from: s */
    private boolean f111692s;

    /* renamed from: t */
    private boolean f111693t;

    /* renamed from: u */
    private boolean f111694u;

    /* renamed from: v */
    private short f111695v;

    /* renamed from: w */
    private int f111696w;

    /* renamed from: x */
    private int f111697x;

    public C42562a() {
    }

    public C42562a(LogEntity logEntity) {
        this.f111684k = logEntity.mo45582n();
        this.f111685l = logEntity.mo45583o();
        this.f111674a = logEntity.mo45579k();
        this.f111675b = logEntity.mo45578j();
        this.f111686m = logEntity.mo45567a();
        this.f111687n = logEntity.mo45569c();
        this.f111688o = logEntity.mo45568b();
        this.f111676c = logEntity.mo45574g();
        this.f111677d = logEntity.mo45575h();
        this.f111678e = logEntity.mo45580l();
        this.f111679f = logEntity.mo45577i();
        this.f111680g = logEntity.mo45573f();
        this.f111696w = logEntity.mo45592w();
        this.f111697x = logEntity.mo45593x();
        this.f111689p = logEntity.mo45586r();
        this.f111690q = logEntity.mo45587s();
        this.f111691r = logEntity.mo45585q();
        this.f111692s = logEntity.mo45591v();
        this.f111693t = logEntity.mo45588t();
        this.f111681h = logEntity.mo45571e();
        this.f111694u = logEntity.mo45590u();
        this.f111682i = logEntity.mo45581m();
        this.f111683j = logEntity.mo45584p();
        this.f111695v = 511;
    }

    /* renamed from: a */
    public final LogEntity mo45613a() {
        if (this.f111695v != 511 || this.f111684k == null || this.f111685l == null || this.f111675b == null || this.f111696w == 0 || this.f111697x == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.f111684k == null) {
                sb.append(" personProvenance");
            }
            if (this.f111685l == null) {
                sb.append(" provenance");
            }
            if (this.f111675b == null) {
                sb.append(" fieldLoggingId");
            }
            if ((this.f111695v & 1) == 0) {
                sb.append(" affinityVersion");
            }
            if ((this.f111695v & 2) == 0) {
                sb.append(" personLevelPosition");
            }
            if ((this.f111695v & 4) == 0) {
                sb.append(" fieldLevelPosition");
            }
            if (this.f111696w == 0) {
                sb.append(" entityType");
            }
            if (this.f111697x == 0) {
                sb.append(" personEntityType");
            }
            if ((this.f111695v & 8) == 0) {
                sb.append(" hasDisplayNameMatches");
            }
            if ((this.f111695v & 16) == 0) {
                sb.append(" hasFieldMatches");
            }
            if ((this.f111695v & 32) == 0) {
                sb.append(" hasAvatar");
            }
            if ((this.f111695v & 64) == 0) {
                sb.append(" boosted");
            }
            if ((this.f111695v & 128) == 0) {
                sb.append(" isExternalEventSource");
            }
            if ((this.f111695v & 256) == 0) {
                sb.append(" isPlaceholder");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        AutoValue_LogEntity autoValue_LogEntity = r2;
        AutoValue_LogEntity autoValue_LogEntity2 = new AutoValue_LogEntity(this.f111684k, this.f111685l, this.f111674a, this.f111675b, this.f111686m, this.f111687n, this.f111688o, this.f111676c, this.f111677d, this.f111678e, this.f111679f, this.f111680g, this.f111696w, this.f111697x, this.f111689p, this.f111690q, this.f111691r, this.f111692s, this.f111693t, this.f111681h, this.f111694u, this.f111682i, this.f111683j);
        return autoValue_LogEntity;
    }

    /* renamed from: b */
    public final String mo45614b() {
        return this.f111679f;
    }

    /* renamed from: c */
    public final EnumSet mo45615c() {
        EnumSet enumSet = this.f111684k;
        if (enumSet != null) {
            return enumSet;
        }
        throw new IllegalStateException("Property \"personProvenance\" has not been set");
    }

    /* renamed from: d */
    public final EnumSet mo45616d() {
        EnumSet enumSet = this.f111685l;
        if (enumSet != null) {
            return enumSet;
        }
        throw new IllegalStateException("Property \"provenance\" has not been set");
    }

    /* renamed from: e */
    public final void mo45617e(int i) {
        this.f111686m = i;
        this.f111695v = (short) (this.f111695v | 1);
    }

    /* renamed from: f */
    public final void mo45618f(boolean z) {
        this.f111692s = z;
        this.f111695v = (short) (this.f111695v | 64);
    }

    /* renamed from: g */
    public final void mo45619g(int i) {
        if (i != 0) {
            this.f111696w = i;
            return;
        }
        throw new NullPointerException("Null entityType");
    }

    /* renamed from: h */
    public final void mo45620h(int i) {
        this.f111688o = i;
        this.f111695v = (short) (this.f111695v | 4);
    }

    /* renamed from: i */
    public final void mo45621i(String str) {
        if (str != null) {
            this.f111675b = str;
            return;
        }
        throw new NullPointerException("Null fieldLoggingId");
    }

    /* renamed from: j */
    public final void mo45622j(boolean z) {
        this.f111691r = z;
        this.f111695v = (short) (this.f111695v | 32);
    }

    /* renamed from: k */
    public final void mo45623k(boolean z) {
        this.f111689p = z;
        this.f111695v = (short) (this.f111695v | 8);
    }

    /* renamed from: l */
    public final void mo45624l(boolean z) {
        this.f111690q = z;
        this.f111695v = (short) (this.f111695v | 16);
    }

    /* renamed from: m */
    public final void mo45625m(boolean z) {
        this.f111693t = z;
        this.f111695v = (short) (this.f111695v | 128);
    }

    /* renamed from: n */
    public final void mo45626n(boolean z) {
        this.f111694u = z;
        this.f111695v = (short) (this.f111695v | 256);
    }

    /* renamed from: o */
    public final void mo45627o(int i) {
        if (i != 0) {
            this.f111697x = i;
            return;
        }
        throw new NullPointerException("Null personEntityType");
    }

    /* renamed from: p */
    public final void mo45628p(int i) {
        this.f111687n = i;
        this.f111695v = (short) (this.f111695v | 2);
    }

    /* renamed from: q */
    public final void mo45629q(EnumSet enumSet) {
        if (enumSet != null) {
            this.f111684k = enumSet;
            return;
        }
        throw new NullPointerException("Null personProvenance");
    }

    /* renamed from: r */
    public final void mo45630r(EnumSet enumSet) {
        if (enumSet != null) {
            this.f111685l = enumSet;
            return;
        }
        throw new NullPointerException("Null provenance");
    }
}

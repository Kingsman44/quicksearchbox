package com.google.android.libraries.home.p1940a.p1943c;

import com.evernote.android.state.BuildConfig;
import java.util.Collection;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.cn */
/* compiled from: PG */
public final class C23513cn implements C23571er {

    /* renamed from: a */
    public static final C23512cm f64258a = new C23512cm();

    /* renamed from: b */
    public static final C23487bo f64259b = C23486bn.m43898b(C23485bm.UNKNOWN_ACTIVITY_STATE.f64231e);

    /* renamed from: c */
    public static final C23496bx f64260c = C23494bv.m43903b(C23495bw.UNKNOWN_PLAYBACK_STATE.f64243g);

    /* renamed from: d */
    public static final C23489bq f64261d = new C23489bq(BuildConfig.FLAVOR, false);

    /* renamed from: e */
    public static final C23519ct f64262e = new C23519ct(BuildConfig.FLAVOR, false);

    /* renamed from: f */
    public static final C23517cr f64263f = new C23517cr(BuildConfig.FLAVOR, false);

    /* renamed from: g */
    private final C23487bo f64264g;

    /* renamed from: h */
    private final C23496bx f64265h;

    /* renamed from: i */
    private final C23489bq f64266i;

    /* renamed from: j */
    private final C23519ct f64267j;

    /* renamed from: k */
    private final C23517cr f64268k;

    public C23513cn(C23487bo boVar, C23496bx bxVar, C23489bq bqVar, C23519ct ctVar, C23517cr crVar) {
        C69664n.m101061g(boVar, "activityStateParameter");
        C69664n.m101061g(bxVar, "playbackStateParameter");
        C69664n.m101061g(bqVar, "artistParameter");
        C69664n.m101061g(ctVar, "titleParameter");
        C69664n.m101061g(crVar, "subtitleParameter");
        this.f64264g = boVar;
        this.f64265h = bxVar;
        this.f64266i = bqVar;
        this.f64267j = ctVar;
        this.f64268k = crVar;
    }

    /* renamed from: a */
    public final C23574eu mo28848a() {
        return C23574eu.MEDIA_STATE;
    }

    /* renamed from: b */
    public final Collection mo28849b() {
        return C69540x.m100947e(this.f64264g, this.f64265h, this.f64266i, this.f64267j, this.f64268k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23513cn)) {
            return false;
        }
        C23513cn cnVar = (C23513cn) obj;
        return C69664n.m101066l(this.f64264g, cnVar.f64264g) && C69664n.m101066l(this.f64265h, cnVar.f64265h) && C69664n.m101066l(this.f64266i, cnVar.f64266i) && C69664n.m101066l(this.f64267j, cnVar.f64267j) && C69664n.m101066l(this.f64268k, cnVar.f64268k);
    }

    public final int hashCode() {
        return (((((((this.f64264g.hashCode() * 31) + this.f64265h.hashCode()) * 31) + this.f64266i.hashCode()) * 31) + this.f64267j.hashCode()) * 31) + this.f64268k.hashCode();
    }

    public final String toString() {
        C23487bo boVar = this.f64264g;
        C23496bx bxVar = this.f64265h;
        C23489bq bqVar = this.f64266i;
        C23519ct ctVar = this.f64267j;
        C23517cr crVar = this.f64268k;
        return "HomeAutomationMediaStateTrait(activityStateParameter=" + boVar + ", playbackStateParameter=" + bxVar + ", artistParameter=" + bqVar + ", titleParameter=" + ctVar + ", subtitleParameter=" + crVar + ")";
    }

    public C23513cn() {
        throw null;
    }
}

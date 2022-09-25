package com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125034a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125422z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125931t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126057bv;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126181j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126221bh;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126324be;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.f.d */
/* compiled from: PG */
public final class C125463d {

    /* renamed from: a */
    public final Locale f345987a;

    /* renamed from: b */
    public final C70862aj f345988b;

    /* renamed from: c */
    public final C125931t f345989c;

    /* renamed from: d */
    public final C126057bv f345990d;

    /* renamed from: e */
    public final C126324be f345991e;

    /* renamed from: f */
    public final C60870cx f345992f;

    /* renamed from: g */
    public final C126181j f345993g;

    /* renamed from: h */
    public final C125034a f345994h;

    /* renamed from: i */
    public final C125422z f345995i;

    /* renamed from: j */
    public final C126221bh f345996j;

    public C125463d(Locale locale, C70862aj ajVar, C125422z zVar, C125931t tVar, C126057bv bvVar, C126221bh bhVar, C126324be beVar, C60870cx cxVar, C126181j jVar, C125034a aVar) {
        C69664n.m101061g(locale, "spokenLocale");
        C69664n.m101061g(ajVar, "requests");
        C69664n.m101061g(zVar, "dictationController");
        C69664n.m101061g(bvVar, "keyboardUiManager");
        C69664n.m101061g(beVar, "textState");
        C69664n.m101061g(cxVar, "directActionsSnapshot");
        C69664n.m101061g(jVar, "orationLogger");
        C69664n.m101061g(aVar, "triggerType");
        this.f345987a = locale;
        this.f345988b = ajVar;
        this.f345995i = zVar;
        this.f345989c = tVar;
        this.f345990d = bvVar;
        this.f345996j = bhVar;
        this.f345991e = beVar;
        this.f345992f = cxVar;
        this.f345993g = jVar;
        this.f345994h = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125463d)) {
            return false;
        }
        C125463d dVar = (C125463d) obj;
        return C69664n.m101066l(this.f345987a, dVar.f345987a) && C69664n.m101066l(this.f345988b, dVar.f345988b) && C69664n.m101066l(this.f345995i, dVar.f345995i) && C69664n.m101066l(this.f345989c, dVar.f345989c) && C69664n.m101066l(this.f345990d, dVar.f345990d) && C69664n.m101066l(this.f345996j, dVar.f345996j) && C69664n.m101066l(this.f345991e, dVar.f345991e) && C69664n.m101066l(this.f345992f, dVar.f345992f) && C69664n.m101066l(this.f345993g, dVar.f345993g) && this.f345994h == dVar.f345994h;
    }

    public final int hashCode() {
        return (((((((((((((((((this.f345987a.hashCode() * 31) + this.f345988b.hashCode()) * 31) + this.f345995i.hashCode()) * 31) + this.f345989c.hashCode()) * 31) + this.f345990d.hashCode()) * 31) + this.f345996j.hashCode()) * 31) + this.f345991e.hashCode()) * 31) + this.f345992f.hashCode()) * 31) + this.f345993g.hashCode()) * 31) + this.f345994h.hashCode();
    }

    public final String toString() {
        Locale locale = this.f345987a;
        C70862aj ajVar = this.f345988b;
        C125422z zVar = this.f345995i;
        C125931t tVar = this.f345989c;
        C126057bv bvVar = this.f345990d;
        C126221bh bhVar = this.f345996j;
        C126324be beVar = this.f345991e;
        C60870cx cxVar = this.f345992f;
        C126181j jVar = this.f345993g;
        C125034a aVar = this.f345994h;
        return "ExecutionContext(spokenLocale=" + locale + ", requests=" + ajVar + ", dictationController=" + zVar + ", keyboardState=" + tVar + ", keyboardUiManager=" + bvVar + ", executionTextSetter=" + bhVar + ", textState=" + beVar + ", directActionsSnapshot=" + cxVar + ", orationLogger=" + jVar + ", triggerType=" + aVar + ")";
    }
}

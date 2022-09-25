package com.google.android.libraries.home.p1940a.p1943c;

import com.evernote.android.state.BuildConfig;
import java.util.Collection;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.au */
/* compiled from: PG */
public final class C23418au implements C23571er {

    /* renamed from: a */
    public static final C23417at f64000a = new C23417at();

    /* renamed from: b */
    public static final C23532df f64001b = C23531de.m43933b("false", false);

    /* renamed from: c */
    public static final C23409al f64002c = C23405ah.m43825b(BuildConfig.FLAVOR, false);

    /* renamed from: d */
    public final C23409al f64003d;

    /* renamed from: e */
    private final C23532df f64004e;

    /* renamed from: f */
    private final C23577ex f64005f;

    public C23418au() {
        this((C23409al) null, 7);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23418au(C23409al alVar, int i) {
        this((i & 1) != 0 ? f64001b : null, (i & 2) != 0 ? f64002c : alVar, C23577ex.f64591b);
    }

    public C23418au(C23532df dfVar, C23409al alVar, C23577ex exVar) {
        C69664n.m101061g(dfVar, "onlineParameter");
        C69664n.m101061g(alVar, "errorParameter");
        C69664n.m101061g(exVar, "challengeParameter");
        this.f64004e = dfVar;
        this.f64003d = alVar;
        this.f64005f = exVar;
    }

    /* renamed from: a */
    public final C23574eu mo28848a() {
        return C23574eu.DEVICE_STATUS;
    }

    /* renamed from: b */
    public final Collection mo28849b() {
        return C69540x.m100947e(this.f64004e, this.f64003d, this.f64005f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23418au)) {
            return false;
        }
        C23418au auVar = (C23418au) obj;
        return C69664n.m101066l(this.f64004e, auVar.f64004e) && C69664n.m101066l(this.f64003d, auVar.f64003d) && C69664n.m101066l(this.f64005f, auVar.f64005f);
    }

    public final int hashCode() {
        return (((this.f64004e.hashCode() * 31) + this.f64003d.hashCode()) * 31) + this.f64005f.hashCode();
    }

    public final String toString() {
        C23532df dfVar = this.f64004e;
        C23409al alVar = this.f64003d;
        C23577ex exVar = this.f64005f;
        return "HomeAutomationDeviceStatusTrait(onlineParameter=" + dfVar + ", errorParameter=" + alVar + ", challengeParameter=" + exVar + ")";
    }
}

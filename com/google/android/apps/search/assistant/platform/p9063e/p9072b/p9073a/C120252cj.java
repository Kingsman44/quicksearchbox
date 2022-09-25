package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120601c;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5082b.p5083a.p5084a.C65482b;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.cj */
/* compiled from: PG */
public final class C120252cj {

    /* renamed from: a */
    public final C120222bl f334612a;

    /* renamed from: b */
    public final C60870cx f334613b;

    /* renamed from: c */
    public C2164c f334614c;

    /* renamed from: d */
    public final C60870cx f334615d;

    /* renamed from: e */
    public C2164c f334616e;

    /* renamed from: f */
    private final Map f334617f = new ConcurrentHashMap();

    /* renamed from: g */
    private final C120246cd f334618g;

    /* renamed from: h */
    private final C120243ca f334619h;

    public C120252cj(C120246cd cdVar, C120222bl blVar, C120243ca caVar) {
        this.f334618g = cdVar;
        this.f334612a = blVar;
        this.f334619h = caVar;
        this.f334613b = C2169h.m6027a(new C120250ch(this));
        this.f334615d = C2169h.m6027a(new C120251ci(this));
    }

    /* renamed from: a */
    public final C120601c mo104708a(C120245cc ccVar) {
        C120368j jVar = (C120368j) ccVar;
        this.f334616e.mo5437b(jVar.f334862a);
        if (this.f334618g.f334606b.get()) {
            C120221bk bkVar = (C120221bk) this.f334617f.get(BuildConfig.FLAVOR);
            if (bkVar != null && bkVar.f334557b.isDone()) {
                return bkVar;
            }
            throw new C120236bz("Cannot prefetch because the prefetch queue is closed", C65482b.PREFETCH_FAILED_QUEUE_CLOSED, (Throwable) null);
        }
        this.f334618g.f334605a.mo38137d(ccVar);
        if (jVar.f334863b) {
            this.f334618g.mo104707a((Throwable) null);
        }
        return mo104712e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r5 != 2) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r5 != 1) goto L_0x001e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104709b(com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d r5) {
        /*
            r4 = this;
            int r5 = r5.f335967a
            int r5 = com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120810c.m200013b(r5)
            com.google.android.apps.search.assistant.platform.e.b.a.ca r0 = com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.C120243ca.ONLINE_ASR
            com.google.android.apps.search.assistant.platform.e.b.a.ca r0 = r4.f334619h
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x001a
            r3 = 2
            if (r0 != r3) goto L_0x0021
            if (r5 == r3) goto L_0x001d
            goto L_0x001e
        L_0x001a:
            if (r5 == r2) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 1
        L_0x001e:
            if (r1 == 0) goto L_0x0021
            return
        L_0x0021:
            com.google.android.apps.search.assistant.platform.e.b.a.ge r0 = new com.google.android.apps.search.assistant.platform.e.b.a.ge
            com.google.android.apps.search.assistant.platform.e.b.a.ca r1 = r4.f334619h
            r0.<init>(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.C120252cj.mo104709b(com.google.android.apps.search.assistant.platform.f.l.d):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo104710c() {
        this.f334614c.mo5438c();
        this.f334618g.mo104707a((Throwable) null);
        Collection.EL.stream(this.f334617f.values()).forEach(C120249cg.f334609a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo104711d(Throwable th) {
        this.f334614c.mo5439d(th);
        this.f334618g.mo104707a(th);
        Collection.EL.stream(this.f334617f.values()).forEach(new C120248cf(th));
    }

    /* renamed from: e */
    public final C120221bk mo104712e() {
        return (C120221bk) Map.EL.computeIfAbsent(this.f334617f, BuildConfig.FLAVOR, new C120247ce(this));
    }
}

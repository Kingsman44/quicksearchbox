package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl;

import android.util.LruCache;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.C122617c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123033c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.p440an.p441a.C8841h;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class TextAnnotatorImpl implements C122617c {

    /* renamed from: a */
    public static final C59071e f339787a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.TextAnnotatorImpl");

    /* renamed from: b */
    public static final C58528ij f339788b = C58528ij.m90012L(C8841h.f30231d, C8841h.f30232e, C8841h.f30233f);

    /* renamed from: j */
    private static final C58485gu f339789j = C58485gu.m89834D(C80080z.ADDRESS, C80080z.APP, C80080z.DATE_TIME, C80080z.EMAIL, C80080z.GRAMMAR, C80080z.PHONE, C80080z.URL, C80080z.CONTACT, C80080z.PERSON_NAME, C80080z.POS_TAG, C80080z.WEBREF, C80080z.DURATION, C80080z.NUMBER, C80080z.PERCENTAGE);

    /* renamed from: c */
    public final C58485gu f339790c;

    /* renamed from: d */
    public final String f339791d;

    /* renamed from: e */
    public final ReentrantReadWriteLock f339792e = new ReentrantReadWriteLock();

    /* renamed from: f */
    public boolean f339793f = false;

    /* renamed from: g */
    public final boolean f339794g;

    /* renamed from: h */
    public final boolean f339795h;

    /* renamed from: i */
    public final boolean f339796i;

    /* renamed from: k */
    private final C123033c f339797k;

    /* renamed from: l */
    private final C60950i f339798l;

    /* renamed from: m */
    private final C60887da f339799m;

    /* renamed from: n */
    private final LruCache f339800n = new LruCache(100);

    public TextAnnotatorImpl(C58485gu guVar, String str, C123033c cVar, boolean z, boolean z2, boolean z3, C60950i iVar, C60887da daVar) {
        this.f339790c = guVar;
        this.f339791d = str;
        this.f339797k = cVar;
        this.f339794g = z;
        this.f339795h = z2;
        this.f339796i = z3;
        this.f339798l = iVar;
        this.f339799m = daVar;
    }

    /* renamed from: e */
    private final C122707o m202025e(String str, String str2, C63179l lVar, Optional optional, Optional optional2) {
        C122707o oVar;
        if (optional.isPresent() || optional2.isPresent()) {
            optional.isPresent();
            C60950i iVar = this.f339798l;
            Objects.requireNonNull(iVar);
            return m202026f(str, (C58485gu) optional2.orElse(f339789j), (Instant) optional.orElseGet(new C122706n(iVar)), str2, lVar);
        }
        C122619a aVar = new C122619a(str, str2, lVar);
        Instant a = this.f339798l.mo57444a();
        synchronized (this.f339800n) {
            oVar = (C122707o) this.f339800n.get(aVar);
            if (oVar == null || ChronoUnit.MILLIS.between(oVar.f339988b, a) > 5000) {
                oVar = m202026f(str, f339789j, a, str2, lVar);
                this.f339800n.put(aVar, oVar);
            }
        }
        return oVar;
    }

    /* renamed from: f */
    private final C122707o m202026f(String str, C58485gu guVar, Instant instant, String str2, C63179l lVar) {
        C60870cx a = this.f339797k.mo105841a();
        C122704l lVar2 = new C122704l(this, str, guVar, instant, str2, lVar);
        return new C122707o(C60922j.m93045h(a, C47810es.m84966f(lVar2), this.f339799m), instant);
    }

    public static native byte[] nativeAnnotate(byte[] bArr);

    /* renamed from: a */
    public final C60870cx mo105690a(String str, String str2, C63179l lVar, Optional optional, Optional optional2) {
        return C60856cj.m92901j(m202025e(str, str2, lVar, optional, optional2).f339987a.f340614a);
    }

    /* renamed from: b */
    public final C60870cx mo105691b(String str, String str2, C63179l lVar) {
        C122707o e = m202025e(str, str2, lVar, Optional.empty(), Optional.empty());
        C60870cx j = C60856cj.m92901j(e.f339987a.f340614a);
        C122702j jVar = new C122702j(str, str2, e);
        return C60922j.m93044g(j, C47810es.m84963c(jVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo105692c() {
        ReentrantReadWriteLock.WriteLock writeLock = this.f339792e.writeLock();
        writeLock.lock();
        try {
            this.f339793f = true;
            return C60866ct.f164955a;
        } finally {
            writeLock.unlock();
        }
    }

    /* renamed from: d */
    public final void mo105694d() {
        synchronized (this.f339800n) {
            this.f339800n.evictAll();
        }
    }
}

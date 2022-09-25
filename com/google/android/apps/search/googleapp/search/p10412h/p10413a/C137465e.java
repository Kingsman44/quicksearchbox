package com.google.android.apps.search.googleapp.search.p10412h.p10413a;

import android.net.Uri;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.logging.adclick.AdClickHandler$resolveTargetUriForNonConversionTrackedAdWithOriginalUriChecked$2$uriWithAdSignals$1", mo61344c = "AdClickHandler.kt", mo61345d = "invokeSuspend", mo61346e = {79})
/* renamed from: com.google.android.apps.search.googleapp.search.h.a.e */
/* compiled from: PG */
final class C137465e extends C69572j implements C69630p {

    /* renamed from: a */
    int f373880a;

    /* renamed from: b */
    final /* synthetic */ C137468h f373881b;

    /* renamed from: c */
    final /* synthetic */ Uri f373882c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137465e(C137468h hVar, Uri uri, C69577g gVar) {
        super(2, gVar);
        this.f373881b = hVar;
        this.f373882c = uri;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137465e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f373880a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f373881b.f373893a.mo113910a(this.f373882c);
            this.f373880a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137465e(this.f373881b, this.f373882c, gVar);
    }
}

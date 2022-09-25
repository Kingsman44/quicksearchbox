package com.google.android.apps.search.googleapp.search.p10412h.p10413a;

import android.net.Uri;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.profile.p3431a.C44051c;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.logging.adclick.AdClickHandler$resolveTargetUriForNonConversionTrackedAdWithOriginalUriChecked$2$cookies$1", mo61344c = "AdClickHandler.kt", mo61345d = "invokeSuspend", mo61346e = {86})
/* renamed from: com.google.android.apps.search.googleapp.search.h.a.c */
/* compiled from: PG */
final class C137463c extends C69572j implements C69630p {

    /* renamed from: a */
    int f373873a;

    /* renamed from: b */
    final /* synthetic */ C137468h f373874b;

    /* renamed from: c */
    final /* synthetic */ Profile f373875c;

    /* renamed from: d */
    final /* synthetic */ Uri f373876d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137463c(C137468h hVar, Profile profile, Uri uri, C69577g gVar) {
        super(2, gVar);
        this.f373874b = hVar;
        this.f373875c = profile;
        this.f373876d = uri;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137463c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f373873a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44051c b = this.f373874b.f373898f.mo47022b(this.f373875c);
            String uri = this.f373876d.toString();
            C69664n.m101060f(uri, "originalUri.toString()");
            this.f373873a = 1;
            obj = b.mo47015d(uri, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137463c(this.f373874b, this.f373875c, this.f373876d, gVar);
    }
}

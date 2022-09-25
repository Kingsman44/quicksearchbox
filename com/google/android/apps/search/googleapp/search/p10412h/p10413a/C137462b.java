package com.google.android.apps.search.googleapp.search.p10412h.p10413a;

import android.net.Uri;
import com.google.android.libraries.web.profile.Profile;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.logging.adclick.AdClickHandler$resolveTargetUriForNonConversionTrackedAdFromJava$1", mo61344c = "AdClickHandler.kt", mo61345d = "invokeSuspend", mo61346e = {52})
/* renamed from: com.google.android.apps.search.googleapp.search.h.a.b */
/* compiled from: PG */
public final class C137462b extends C69572j implements C69630p {

    /* renamed from: a */
    int f373869a;

    /* renamed from: b */
    final /* synthetic */ C137468h f373870b;

    /* renamed from: c */
    final /* synthetic */ Uri f373871c;

    /* renamed from: d */
    final /* synthetic */ Profile f373872d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137462b(C137468h hVar, Uri uri, Profile profile, C69577g gVar) {
        super(2, gVar);
        this.f373870b = hVar;
        this.f373871c = uri;
        this.f373872d = profile;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137462b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f373869a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137468h hVar = this.f373870b;
            Uri uri = this.f373871c;
            Profile profile = this.f373872d;
            this.f373869a = 1;
            obj = C71423ax.m104196a(new C137467g(hVar, uri, profile, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137462b(this.f373870b, this.f373871c, this.f373872d, gVar);
    }
}

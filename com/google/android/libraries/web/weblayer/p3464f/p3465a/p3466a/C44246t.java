package com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.weblayer.p3448b.C44129e;
import kotlinx.coroutines.C71422aw;
import org.chromium.weblayer.C72627p;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69588r;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.weblayer.profile.cookies.internal.WLCookieManager$withWebLayerCookieManagerOnUiThread$2", mo61344c = "WLCookieManager.kt", mo61345d = "invokeSuspend", mo61346e = {269, 284})
/* renamed from: com.google.android.libraries.web.weblayer.f.a.a.t */
/* compiled from: PG */
final class C44246t extends C69572j implements C69630p {

    /* renamed from: a */
    int f115074a;

    /* renamed from: b */
    final /* synthetic */ C69630p f115075b;

    /* renamed from: c */
    final /* synthetic */ C44247u f115076c;

    /* renamed from: d */
    final /* synthetic */ Profile f115077d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44246t(C69630p pVar, C44247u uVar, Profile profile, C69577g gVar) {
        super(2, gVar);
        this.f115075b = pVar;
        this.f115076c = uVar;
        this.f115077d = profile;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44246t) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f115074a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C44247u uVar = this.f115076c;
            Profile profile = this.f115077d;
            this.f115074a = 1;
            C69588r rVar = new C69588r(C69555b.m100961b(this));
            try {
                uVar.f115078a.mo47218i(new C44245s(rVar, profile));
            } catch (Throwable th) {
                rVar.mo61338mb(C69714l.m101133a(new C44129e(BuildConfig.FLAVOR, th)));
            }
            obj = rVar.mo61355a();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
        }
        C69630p pVar = this.f115075b;
        this.f115074a = 2;
        obj = pVar.mo5192a((C72627p) obj, this);
        return obj == aVar ? aVar : obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44246t(this.f115075b, this.f115076c, this.f115077d, gVar);
    }
}

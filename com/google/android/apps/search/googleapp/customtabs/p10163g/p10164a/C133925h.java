package com.google.android.apps.search.googleapp.customtabs.p10163g.p10164a;

import com.evernote.android.state.BuildConfig;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.customtabs.settings.dataservice.CustomTabsEnabledDataService$summarySource$2$appAccount$1", mo61344c = "CustomTabsEnabledDataService.kt", mo61345d = "invokeSuspend", mo61346e = {113})
/* renamed from: com.google.android.apps.search.googleapp.customtabs.g.a.h */
/* compiled from: PG */
final class C133925h extends C69572j implements C69630p {

    /* renamed from: a */
    int f364747a;

    /* renamed from: b */
    final /* synthetic */ C133932o f364748b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133925h(C133932o oVar, C69577g gVar) {
        super(2, gVar);
        this.f364748b = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133925h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f364747a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (C46167as e) {
                C59052c cVar = (C59052c) ((C59052c) C133932o.f364768f.mo56226d()).mo56382g(e);
                cVar.mo56379ah(new C59094n(40193));
                cVar.mo56386p("Failed to get the AGSA account name.");
                return BuildConfig.FLAVOR;
            }
        } else {
            C69714l.m101134b(obj);
            C133932o oVar = this.f364748b;
            C60870cx b = oVar.f364774l.mo50215b(oVar.f364773k);
            this.f364747a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = (String) obj;
        if (str == null) {
            return BuildConfig.FLAVOR;
        }
        return str;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133925h(this.f364748b, gVar);
    }
}

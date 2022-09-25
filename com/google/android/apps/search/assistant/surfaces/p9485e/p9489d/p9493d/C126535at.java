package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d;

import com.google.android.apps.search.assistant.platform.p9141h.p9169k.p9170a.C121177c;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126436e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.response.TTSHandler$handle$2", mo61344c = "TTSHandler.kt", mo61345d = "invokeSuspend", mo61346e = {44, 48, 50})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.d.at */
/* compiled from: PG */
public final class C126535at extends C69572j implements C69630p {

    /* renamed from: a */
    int f348477a;

    /* renamed from: b */
    final /* synthetic */ C126557bo f348478b;

    /* renamed from: c */
    final /* synthetic */ C71587n f348479c;

    /* renamed from: d */
    final /* synthetic */ C126436e f348480d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126535at(C126557bo boVar, C71587n nVar, C126436e eVar, C69577g gVar) {
        super(2, gVar);
        this.f348478b = boVar;
        this.f348479c = nVar;
        this.f348480d = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126535at) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f348477a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C60870cx a = this.f348478b.f348534d.mo105070a();
            this.f348477a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        if (obj == C121177c.HANDS_FREE_ONLY) {
            return C69788q.f186170a;
        }
        C126557bo boVar = this.f348478b;
        if (boVar.f348532b) {
            C71587n nVar = this.f348479c;
            C126436e eVar = this.f348480d;
            this.f348477a = 2;
            if (C71423ax.m104196a(new C126545bc(nVar, eVar, boVar, (C69577g) null), this) == aVar) {
                return aVar;
            }
        } else {
            C71587n nVar2 = this.f348479c;
            C126436e eVar2 = this.f348480d;
            this.f348477a = 3;
            Object a2 = C71423ax.m104196a(new C126556bn(nVar2, boVar, eVar2, (C69577g) null), this);
            if (a2 != C69554a.COROUTINE_SUSPENDED) {
                a2 = C69788q.f186170a;
            }
            if (a2 == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126535at(this.f348478b, this.f348479c, this.f348480d, gVar);
    }
}

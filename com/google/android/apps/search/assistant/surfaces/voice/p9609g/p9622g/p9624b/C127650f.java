package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b;

import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127615b;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127628o;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127629p;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127630q;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127632s;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127634u;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.triggering.impl.LocaleUpdateListener$onPrimaryMobileLocaleSettingsDataChanged$1", mo61344c = "LocaleUpdateListener.kt", mo61345d = "invokeSuspend", mo61346e = {35})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.b.f */
/* compiled from: PG */
final class C127650f extends C69572j implements C69630p {

    /* renamed from: a */
    int f351420a;

    /* renamed from: b */
    final /* synthetic */ C127651g f351421b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127650f(C127651g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f351421b = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127650f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f351420a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Exception e) {
                C59052c cVar = (C59052c) ((C59052c) C127651g.f351422a.mo56225c()).mo56382g(e);
                cVar.mo56379ah(new C59094n(37521));
                cVar.mo56386p("Update failed");
            }
        } else {
            C69714l.m101134b(obj);
            C127628o oVar = this.f351421b.f351423b;
            C127629p pVar = (C127629p) C127630q.f351355b.createBuilder();
            C69664n.m101060f(pVar, "newBuilder()");
            C127632s a = C69664n.m101061g(pVar, "builder");
            a.mo108157b(C127615b.PRIMARY_LOCALE_CHANGE_SETTING);
            C127630q a2 = a.mo108156a();
            this.f351420a = 1;
            obj = oVar.mo108155c(a2, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C127634u uVar = (C127634u) obj;
        C59052c cVar2 = (C59052c) C127651g.f351422a.mo56224b();
        cVar2.mo56379ah(new C59094n(37520));
        cVar2.mo56386p("Update Complete");
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127650f(this.f351421b, gVar);
    }
}

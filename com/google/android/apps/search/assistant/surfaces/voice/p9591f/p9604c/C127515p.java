package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127463a;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127464b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127465c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127467e;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127471c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127476h;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127477i;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127479k;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entry.dispatcher.VisEntryPointDispatcher$dispatchVisInvocation$2", mo61344c = "VisEntryPointDispatcher.kt", mo61345d = "invokeSuspend", mo61346e = {62})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.c.p */
/* compiled from: PG */
public final class C127515p extends C69572j implements C69630p {

    /* renamed from: a */
    Object f351129a;

    /* renamed from: b */
    Object f351130b;

    /* renamed from: c */
    Object f351131c;

    /* renamed from: d */
    int f351132d;

    /* renamed from: e */
    final /* synthetic */ C127475g f351133e;

    /* renamed from: f */
    final /* synthetic */ C127519t f351134f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127515p(C127475g gVar, C127519t tVar, C69577g gVar2) {
        super(2, gVar2);
        this.f351133e = gVar;
        this.f351134f = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127515p) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f351132d != 0) {
            obj4 = this.f351131c;
            obj3 = this.f351130b;
            obj2 = this.f351129a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127471c cVar = this.f351133e.f350987c;
            if (cVar == null) {
                cVar = C127471c.f350977d;
            }
            C127470b a = C127470b.m208430a(cVar.f350980b);
            if (a == null) {
                a = C127470b.UNRECOGNIZED;
            }
            switch (a.ordinal()) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    C127519t tVar = this.f351134f;
                    C127475g gVar = this.f351133e;
                    C127476h hVar = (C127476h) C127477i.f350991c.createBuilder();
                    C69664n.m101060f(hVar, "newBuilder()");
                    obj2 = C69664n.m101061g(hVar, "builder");
                    this.f351129a = obj2;
                    this.f351130b = obj2;
                    this.f351131c = obj2;
                    this.f351132d = 1;
                    obj = tVar.mo108108a(gVar, this);
                    if (obj != aVar) {
                        obj4 = obj2;
                        obj3 = obj4;
                        break;
                    } else {
                        return aVar;
                    }
                default:
                    C59052c cVar2 = (C59052c) C127519t.f351146a.mo56226d();
                    cVar2.mo56379ah(new C59094n(37482));
                    cVar2.mo56386p("Request does not have valid VisEntryPointType.");
                    C127476h hVar2 = (C127476h) C127477i.f350991c.createBuilder();
                    C69664n.m101060f(hVar2, "newBuilder()");
                    C127479k a2 = C69664n.m101061g(hVar2, "builder");
                    C127463a aVar2 = (C127463a) C127465c.f350959c.createBuilder();
                    C69664n.m101060f(aVar2, "newBuilder()");
                    C127467e a3 = C69664n.m101061g(aVar2, "builder");
                    a3.mo108080c(C127464b.ERROR_INVALID_REQUEST);
                    a3.mo108079b("Please make sure the entry invocation is valid");
                    a2.mo108085b(a3.mo108078a());
                    return a2.mo108084a();
            }
        }
        ((C127479k) obj4).mo108086c((C119834cb) obj);
        C127463a aVar3 = (C127463a) C127465c.f350959c.createBuilder();
        C69664n.m101060f(aVar3, "newBuilder()");
        C127467e a4 = C69664n.m101061g(aVar3, "builder");
        a4.mo108080c(C127464b.SUCCESS);
        ((C127479k) obj3).mo108085b(a4.mo108078a());
        return ((C127479k) obj2).mo108084a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127515p(this.f351133e, this.f351134f, gVar);
    }
}

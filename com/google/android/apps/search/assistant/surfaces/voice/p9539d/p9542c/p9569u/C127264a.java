package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9569u;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127361i;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32803ay;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32808bc;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51482ji;
import com.google.assistant.p3897e.p3917i.p3918a.C51484jk;
import com.google.assistant.p3897e.p3917i.p3918a.C51485jl;
import com.google.assistant.p3897e.p3921j.C52230ka;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.ngacontext.NgaContextParamsSupplier$fetchContext$1", mo61344c = "NgaContextParamsSupplier.kt", mo61345d = "invokeSuspend", mo61346e = {38})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.u.a */
/* compiled from: PG */
final class C127264a extends C69572j implements C69630p {

    /* renamed from: a */
    Object f350484a;

    /* renamed from: b */
    int f350485b;

    /* renamed from: c */
    final /* synthetic */ C127266c f350486c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127264a(C127266c cVar, C69577g gVar) {
        super(2, gVar);
        this.f350486c = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127264a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350485b != 0) {
            obj2 = this.f350484a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127266c cVar = this.f350486c;
            C127361i iVar = cVar.f350493c;
            this.f350484a = iVar;
            this.f350485b = 1;
            obj = cVar.mo108006b(this);
            if (obj == aVar) {
                return aVar;
            }
            obj2 = iVar;
        }
        C51484jk jkVar = (C51484jk) obj;
        C69664n.m101061g(jkVar, "uiMode");
        ((C127361i) obj2).f350725a.set(jkVar);
        C127266c cVar2 = this.f350486c;
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C69664n.m101060f(auVar, "newBuilder()");
        C32803ay a = C69664n.m101061g(auVar, "builder");
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C69664n.m101060f(azVar, "newBuilder()");
        C32808bc a2 = C69664n.m101061g(azVar, "builder");
        C33476a aVar2 = C127266c.f350492b;
        C51482ji jiVar = (C51482ji) C51485jl.f134149c.createBuilder();
        C51484jk a3 = cVar2.f350493c.mo108032a();
        jiVar.copyOnWrite();
        C51485jl jlVar = (C51485jl) jiVar.instance;
        jlVar.f134152b = a3.f134148d;
        jlVar.f134151a |= 1;
        C52230ka a4 = aVar2.mo38879a(jiVar.build());
        C69664n.m101060f(a4, "PARAMS_KEY.pack(NgaParam…ore.getUiMode()).build())");
        a2.mo38306b(a4);
        a.mo38303b(a2.mo38305a());
        return a.mo38302a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127264a(this.f350486c, gVar);
    }
}

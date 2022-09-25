package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a;

import android.net.Uri;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2683g.p2684a.C34640b;
import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.C37502di;
import com.google.android.libraries.search.p2904c.p2908b.p2910b.C37377d;
import com.google.android.libraries.search.p2904c.p2908b.p2910b.C37378e;
import com.google.android.libraries.search.p3055n.C39277b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.HotwordUriConverter$createHotwordUri$2", mo61344c = "HotwordUriConverter.kt", mo61345d = "invokeSuspend", mo61346e = {50})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.n */
/* compiled from: PG */
final class C34516n extends C69572j implements C69630p {

    /* renamed from: a */
    Object f91735a;

    /* renamed from: b */
    int f91736b;

    /* renamed from: c */
    final /* synthetic */ C34517o f91737c;

    /* renamed from: d */
    final /* synthetic */ C37502di f91738d;

    /* renamed from: e */
    final /* synthetic */ C39277b f91739e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34516n(C34517o oVar, C37502di diVar, C39277b bVar, C69577g gVar) {
        super(2, gVar);
        this.f91737c = oVar;
        this.f91738d = diVar;
        this.f91739e = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34516n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91736b != 0) {
            obj2 = this.f91735a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C34640b bVar = new C34640b();
            C59052c cVar = (C59052c) C34517o.f91740a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordLegacyUri");
            C37500dg dgVar = this.f91738d.f99564b;
            if (dgVar == null) {
                dgVar = C37500dg.f99557c;
            }
            cVar.mo56379ah(new C59094n(51390));
            cVar.mo56389s("Piping audio from soda route(%s) to uri.", dgVar);
            C37378e eVar = this.f91737c.f91741b;
            C37502di diVar = this.f91738d;
            C39277b bVar2 = this.f91739e;
            C37357av avVar = (C37357av) C37360ay.f99224l.createBuilder();
            avVar.copyOnWrite();
            C37360ay ayVar = (C37360ay) avVar.instance;
            ayVar.f99226a |= 512;
            ayVar.f99236k = true;
            int i = bVar2.f103462b;
            avVar.copyOnWrite();
            C37360ay ayVar2 = (C37360ay) avVar.instance;
            ayVar2.f99226a |= 2;
            ayVar2.f99228c = i;
            int i2 = bVar2.f103464d;
            avVar.copyOnWrite();
            C37360ay ayVar3 = (C37360ay) avVar.instance;
            ayVar3.f99226a |= 8;
            ayVar3.f99230e = i2;
            int i3 = bVar2.f103463c;
            avVar.copyOnWrite();
            C37360ay ayVar4 = (C37360ay) avVar.instance;
            ayVar4.f99226a |= 4;
            ayVar4.f99229d = i3;
            C62942bv build = avVar.build();
            C69664n.m101060f(build, "newBuilder()\n        .se…lConfig)\n        .build()");
            C34515m mVar = new C34515m(this.f91737c, bVar);
            this.f91735a = bVar;
            this.f91736b = 1;
            Object a = C71803m.m105040a(eVar.f99284c, new C37377d((C37360ay) build, eVar, mVar, diVar, (C69577g) null), this);
            if (a != C69554a.COROUTINE_SUSPENDED) {
                a = C69788q.f186170a;
            }
            if (a == aVar) {
                return aVar;
            }
            obj2 = bVar;
        }
        return (Uri) ((C34640b) obj2).f91978c.mo5768a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34516n(this.f91737c, this.f91738d, this.f91739e, gVar);
    }
}

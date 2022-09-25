package com.google.android.apps.search.soundsearch.p10660g.p10661a;

import com.google.android.apps.search.soundsearch.p10654c.C141646a;
import com.google.android.apps.search.soundsearch.p10654c.C141648c;
import com.google.android.apps.search.soundsearch.p10654c.C141649d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.soundsearch.g.a.e */
/* compiled from: PG */
public final /* synthetic */ class C141675e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141677g f384528a;

    /* renamed from: b */
    public final /* synthetic */ C141648c f384529b;

    public /* synthetic */ C141675e(C141677g gVar, C141648c cVar) {
        this.f384528a = gVar;
        this.f384529b = cVar;
    }

    public final void run() {
        C141677g gVar = this.f384528a;
        C141648c cVar = this.f384529b;
        if (cVar instanceof C141649d) {
            C141680j jVar = gVar.f384532a;
            C141681k kVar = (C141681k) C141684n.f384546f.createBuilder();
            kVar.copyOnWrite();
            C141684n nVar = (C141684n) kVar.instance;
            nVar.f384549b = 4;
            nVar.f384548a |= 1;
            jVar.mo116650a((C141684n) kVar.build());
        } else if (cVar instanceof C141646a) {
            C141680j jVar2 = gVar.f384532a;
            C141681k kVar2 = (C141681k) C141684n.f384546f.createBuilder();
            kVar2.copyOnWrite();
            C141684n nVar2 = (C141684n) kVar2.instance;
            nVar2.f384549b = 5;
            nVar2.f384548a |= 1;
            jVar2.mo116650a((C141684n) kVar2.build());
        } else {
            ((C59052c) ((C59052c) ((C59052c) C141680j.f384536a.mo56224b()).mo56382g(cVar)).mo56372aa(41796)).mo56386p("#onError");
            C141680j jVar3 = gVar.f384532a;
            C141681k kVar3 = (C141681k) C141684n.f384546f.createBuilder();
            kVar3.copyOnWrite();
            C141684n nVar3 = (C141684n) kVar3.instance;
            nVar3.f384549b = 3;
            nVar3.f384548a |= 1;
            jVar3.mo116650a((C141684n) kVar3.build());
        }
    }
}

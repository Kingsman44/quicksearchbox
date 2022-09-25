package com.google.android.apps.search.soundsearch.p10660g.p10661a;

import com.google.android.apps.search.soundsearch.p10652a.C141634f;
import com.google.android.apps.search.soundsearch.p10660g.C141670a;
import com.google.android.apps.search.soundsearch.p10660g.C141685b;
import com.google.android.apps.search.soundsearch.p10660g.C141702k;
import com.google.android.apps.search.soundsearch.p10660g.C141703l;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.soundsearch.g.a.a */
/* compiled from: PG */
public final /* synthetic */ class C141671a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141680j f384522a;

    /* renamed from: b */
    public final /* synthetic */ C141703l f384523b;

    /* renamed from: c */
    public final /* synthetic */ C141679i f384524c;

    public /* synthetic */ C141671a(C141680j jVar, C141679i iVar, C141703l lVar) {
        this.f384522a = jVar;
        this.f384524c = iVar;
        this.f384523b = lVar;
    }

    public final void run() {
        C141680j jVar = this.f384522a;
        C141679i iVar = this.f384524c;
        C141703l lVar = this.f384523b;
        C141685b bVar = jVar.f384539d;
        C141702k kVar = (C141702k) bVar.f384554a.mo17428b();
        kVar.getClass();
        C141634f fVar = (C141634f) bVar.f384555b.mo17428b();
        fVar.getClass();
        jVar.f384541f = new C141670a(kVar, fVar, iVar, lVar);
        C141681k kVar2 = (C141681k) C141684n.f384546f.createBuilder();
        kVar2.copyOnWrite();
        C141684n nVar = (C141684n) kVar2.instance;
        nVar.f384549b = 1;
        nVar.f384548a = 1 | nVar.f384548a;
        jVar.mo116650a((C141684n) kVar2.build());
        C141670a aVar = jVar.f384541f;
        ((C59052c) ((C59052c) C141670a.f384518a.mo56224b()).mo56372aa(41785)).mo56386p("#startListening");
        aVar.f384520c.mo116625c();
        aVar.f384521d.mo116659d(aVar.f384520c.mo116623a(), C141670a.f384519b);
    }
}

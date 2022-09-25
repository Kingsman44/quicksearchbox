package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125034a;
import java.util.List;
import p3186j$.lang.Iterable$EL;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cl */
/* compiled from: PG */
public final /* synthetic */ class C126074cl implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126081cs f347445a;

    /* renamed from: b */
    public final /* synthetic */ List f347446b;

    /* renamed from: c */
    public final /* synthetic */ C125034a f347447c;

    public /* synthetic */ C126074cl(C126081cs csVar, List list, C125034a aVar) {
        this.f347445a = csVar;
        this.f347446b = list;
        this.f347447c = aVar;
    }

    public final void run() {
        C126081cs csVar = this.f347445a;
        List list = this.f347446b;
        C125034a aVar = this.f347447c;
        csVar.mo107316v();
        Iterable$EL.forEach(list, new C126061bz(csVar, aVar));
        if (csVar.f347468f) {
            csVar.f347471i.mo107212a(csVar.f347472j.mo107269a(list));
        }
        csVar.f347469g.mo107340e(C126092dc.f347510a);
        csVar.mo107318x();
    }
}

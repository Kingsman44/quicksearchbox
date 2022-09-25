package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125034a;
import java.util.List;
import p3186j$.lang.Iterable$EL;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.by */
/* compiled from: PG */
public final /* synthetic */ class C126060by implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126081cs f347425a;

    /* renamed from: b */
    public final /* synthetic */ List f347426b;

    /* renamed from: c */
    public final /* synthetic */ C125034a f347427c;

    public /* synthetic */ C126060by(C126081cs csVar, List list, C125034a aVar) {
        this.f347425a = csVar;
        this.f347426b = list;
        this.f347427c = aVar;
    }

    public final void run() {
        C126081cs csVar = this.f347425a;
        List list = this.f347426b;
        C125034a aVar = this.f347427c;
        csVar.mo107316v();
        Iterable$EL.forEach(list, new C126066cd(csVar, aVar));
        if (csVar.f347468f) {
            csVar.f347471i.mo107212a(csVar.f347472j.mo107269a(list));
        }
        boolean z = false;
        if (csVar.f347469g.mo107337b().f347482c && Collection.EL.stream(list).map(C126067ce.f347437a).allMatch(C126068cf.f347438a)) {
            z = true;
        }
        csVar.f347469g.mo107340e(new C126091db(!z));
        if (!z) {
            csVar.mo107315u();
        }
    }
}

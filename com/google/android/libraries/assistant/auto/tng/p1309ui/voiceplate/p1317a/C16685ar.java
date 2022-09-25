package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16659x;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16660y;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.ar */
/* compiled from: PG */
public final class C16685ar {
    /* renamed from: a */
    public static C16662b m33751a(boolean z) {
        if (z) {
            C16627a aVar = (C16627a) C16662b.f48800l.createBuilder();
            aVar.copyOnWrite();
            C16662b bVar = (C16662b) aVar.instance;
            bVar.f48802a |= 1;
            bVar.f48803b = true;
            C16659x xVar = (C16659x) C16660y.f48794d.createBuilder();
            xVar.copyOnWrite();
            C16660y yVar = (C16660y) xVar.instance;
            yVar.f48796a |= 1;
            yVar.f48798c = true;
            xVar.mo22947a(C16684aq.DIRECTIONS.mo22977a());
            xVar.mo22947a(C16684aq.MUSIC.mo22977a());
            xVar.mo22947a(C16684aq.MESSAGE.mo22977a());
            aVar.mo22945d(xVar);
            return (C16662b) aVar.build();
        }
        C16627a aVar2 = (C16627a) C16662b.f48800l.createBuilder();
        aVar2.copyOnWrite();
        C16662b bVar2 = (C16662b) aVar2.instance;
        bVar2.f48802a |= 1;
        bVar2.f48803b = true;
        aVar2.mo22942a(C16684aq.DIRECTIONS.mo22978b());
        aVar2.mo22942a(C16684aq.MUSIC.mo22978b());
        aVar2.mo22942a(C16684aq.MESSAGE.mo22978b());
        return (C16662b) aVar2.build();
    }
}

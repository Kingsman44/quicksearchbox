package com.google.android.apps.search.assistant.verticals.newsplayer.p10066c;

import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.c.c */
/* compiled from: PG */
final class C132411c implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C132412d.f361408a.mo56226d()).mo56382g(th)).mo56372aa(39636)).mo56386p("Failed to sync News Playback corpus.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        boolean z = false;
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (((C65753ak) entry.getKey()).equals(C65753ak.PLAYBACK)) {
                if (((C21850cf) entry.getValue()).mo27152b().isEmpty()) {
                    z = true;
                } else {
                    ((C59052c) ((C59052c) C132412d.f361408a.mo56226d()).mo56372aa(39638)).mo56389s("Failed to sync News Playback corpus: %s", Collection.EL.stream(((C21850cf) entry.getValue()).mo27152b()).map(C132410b.f361407a).collect(Collectors.joining("\n")));
                }
            }
        }
        if (!z) {
            ((C59052c) ((C59052c) C132412d.f361408a.mo56226d()).mo56372aa(39637)).mo56386p("Could not find corpus to sync");
        }
    }
}

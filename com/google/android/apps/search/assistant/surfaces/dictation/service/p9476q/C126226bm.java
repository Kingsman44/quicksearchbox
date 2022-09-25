package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.common.p4526f.C59052c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.bm */
/* compiled from: PG */
public final /* synthetic */ class C126226bm implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C126233bt f347828a;

    public /* synthetic */ C126226bm(C126233bt btVar) {
        this.f347828a = btVar;
    }

    public final Object call() {
        C126233bt btVar = this.f347828a;
        if (btVar.f347847h) {
            ((C59052c) ((C59052c) C126233bt.f347840a.mo56226d()).mo56372aa(36972)).mo56389s("#shutdownSequenced - double shutdown of %s [SD]", btVar.f347844e);
        }
        C126208av avVar = btVar.f347845f;
        if (avVar != null) {
            avVar.mo107461d(C126207au.DICTATION_SHUTDOWN, (Throwable) null);
        }
        btVar.f347847h = true;
        btVar.f347845f = null;
        return null;
    }
}

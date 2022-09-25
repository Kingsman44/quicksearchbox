package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.TimeoutException;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.ap */
/* compiled from: PG */
public final /* synthetic */ class C126202ap implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C126208av f347738a;

    /* renamed from: b */
    public final /* synthetic */ C126207au f347739b;

    public /* synthetic */ C126202ap(C126208av avVar, C126207au auVar) {
        this.f347738a = avVar;
        this.f347739b = auVar;
    }

    public final void accept(Object obj) {
        C126208av avVar = this.f347738a;
        C126207au auVar = this.f347739b;
        Throwable th = (Throwable) obj;
        avVar.f347755d.mo107435f();
        if (th instanceof TimeoutException) {
            ((C59052c) ((C59052c) ((C59052c) C126208av.f347752a.mo56226d()).mo56382g(th)).mo56372aa(36932)).mo56389s("Waiting for the end of %s timed out. [SD]", avVar.f347766o);
            avVar.f347773v.f347829a.mo107477b(avVar, auVar);
            return;
        }
        C59052c cVar = (C59052c) C126208av.f347752a.mo56225c();
        cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.ASSISTANT_DICTATION_ORATION_CLEANUP_ERROR_VALUE));
        ((C59052c) ((C59052c) cVar.mo56382g(th)).mo56372aa(36931)).mo56389s("Waiting for the end of %s failed. [SD]", avVar.f347766o);
        C126227bn bnVar = avVar.f347773v;
        bnVar.f347829a.mo107477b(avVar, C126207au.CLEANUP_ERROR);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

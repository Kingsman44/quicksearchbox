package com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1063b;

import com.google.android.libraries.assistant.auto.tng.media.mediabrowser.C14049k;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.b.h */
/* compiled from: PG */
final class C14023h implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C14024i f42636a;

    public C14023h(C14024i iVar) {
        this.f42636a = iVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f42636a.f42638b.mo21388b();
        ((C59052c) ((C59052c) ((C59052c) C14027l.f42639a.mo56225c()).mo56382g(th)).mo56372aa(45294)).mo56386p("Failed to update playMediaArgs contentFetchRetriedCount.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C14027l lVar = this.f42636a.f42638b;
        C46459k.m82829b(lVar.f42640b.mo50546b(C14049k.m30340a(1, ((Long) lVar.f42642d.mo17428b()).intValue())), "Failed to retry NewsContentSyncWorker", new Object[0]);
    }
}

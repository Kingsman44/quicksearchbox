package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p739d.p740a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p734b.p735a.C12035j;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.d.a.h */
/* compiled from: PG */
final class C12102h implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C12103i f38694a;

    public C12102h(C12103i iVar) {
        this.f38694a = iVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((C59052c) ((C59052c) ((C59052c) C12103i.f38695a.mo56226d()).mo56382g(th)).mo56372aa(44020)).mo56386p("Audio spinner future failed");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C12035j jVar = (C12035j) obj;
        if (this.f38694a.f38705k.get()) {
            C46459k.m82829b(jVar.mo20380a(), "Stop spinner playback failed", new Object[0]);
            return;
        }
        this.f38694a.f38700f.mo22352b(C37179a.f97452aX);
        this.f38694a.f38708n.set(jVar);
    }
}

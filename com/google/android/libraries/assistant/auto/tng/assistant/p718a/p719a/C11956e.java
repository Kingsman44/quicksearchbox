package com.google.android.libraries.assistant.auto.tng.assistant.p718a.p719a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a.C12916am;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.a.a.e */
/* compiled from: PG */
final class C11956e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C11957f f38406a;

    public C11956e(C11957f fVar) {
        this.f38406a = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C11957f.f38407a.mo56226d()).mo56382g(th)).mo56372aa(43916)).mo56386p("Session future failed");
        this.f38406a.mo20335a();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C12916am amVar = (C12916am) obj;
        if (!this.f38406a.f38410d.get()) {
            C46459k.m82829b(amVar.f40209a.mo20440jJ(this.f38406a.f38409c), "Failure while streaming to session data sink.", new Object[0]);
        }
    }
}

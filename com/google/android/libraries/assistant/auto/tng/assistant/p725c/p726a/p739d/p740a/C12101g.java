package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p739d.p740a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.d.a.g */
/* compiled from: PG */
final class C12101g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C12103i f38693a;

    public C12101g(C12103i iVar) {
        this.f38693a = iVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((C59052c) ((C59052c) ((C59052c) C12103i.f38695a.mo56226d()).mo56382g(th)).mo56372aa(44018)).mo56386p("Last played TTS timestamp future failed");
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C12103i iVar = this.f38693a;
        if (!iVar.f38705k.get()) {
            C60870cx e = iVar.f38699e.mo20374e();
            C12102h hVar = new C12102h(iVar);
            C60856cj.m92911t(e, C47810es.m84974n(hVar), iVar.f38703i);
        }
    }
}

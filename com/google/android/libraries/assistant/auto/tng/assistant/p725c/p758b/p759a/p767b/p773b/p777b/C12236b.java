package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.b */
/* compiled from: PG */
final class C12236b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C12274c f38975a;

    public C12236b(C12274c cVar) {
        this.f38975a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException) || !((Boolean) this.f38975a.f39050b.mo17428b()).booleanValue()) {
            ((C59052c) ((C59052c) ((C59052c) C12274c.f39049a.mo56226d()).mo56382g(th)).mo56372aa(44128)).mo56386p("Text request execution failed");
        } else {
            ((C59052c) ((C59052c) C12274c.f39049a.mo56224b()).mo56372aa(44129)).mo56386p("Text request execution cancelled");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}

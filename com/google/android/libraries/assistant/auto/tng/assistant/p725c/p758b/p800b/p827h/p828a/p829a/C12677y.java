package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.y */
/* compiled from: PG */
final class C12677y implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C57987f f39727a;

    public C12677y(C57987f fVar) {
        this.f39727a = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((C59052c) ((C59052c) ((C59052c) C12678z.f39728a.mo56226d()).mo56382g(th)).mo56372aa(44381)).mo56386p("Limited connectivity future failed");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C57987f fVar = this.f39727a;
        fVar.f155056f.mo54591h(C16730ar.SLOW_CONNECTION);
    }
}

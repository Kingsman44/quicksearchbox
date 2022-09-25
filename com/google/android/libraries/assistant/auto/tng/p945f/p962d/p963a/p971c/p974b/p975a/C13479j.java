package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p974b.p975a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.b.a.j */
/* compiled from: PG */
final class C13479j extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C13480k f41337a;

    public C13479j(C13480k kVar) {
        this.f41337a = kVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C60870cx cxVar;
        C47538ax c = this.f41337a.f41345h.mo51613c("TcLibReleaser");
        try {
            C58976aa aaVar = C58975e.f156826a;
            C13480k kVar = this.f41337a;
            C59104x b = C13480k.f41338a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TcLibProvider");
            ((C59052c) ((C59052c) b).mo56372aa(44839)).mo56386p("#release");
            int i = kVar.f41351n;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 != 1) {
                    cxVar = i2 != 2 ? C60866ct.f164955a : (C60870cx) kVar.f41350m.mo56107c();
                } else {
                    kVar.f41351n = 3;
                    kVar.f41348k.clear();
                    kVar.f41350m = C58833ax.m90834k(C60922j.m93044g(((TextClassifierLibImpl) kVar.f41349l.mo56107c()).mo58300a(), C47810es.m84963c(new C13477h(kVar)), kVar.f41344g));
                    cxVar = (C60870cx) kVar.f41350m.mo56107c();
                }
                cxVar.mo4106b(C13478i.f41336a, this.f41337a.f41344g);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            }
            throw null;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}

package com.google.android.libraries.web.webview.p3485h.p3486a;

import androidx.p201w.C4361e;
import androidx.p201w.C4362f;
import com.google.android.libraries.web.postmessage.PostMessageConfig;
import com.google.android.libraries.web.postmessage.internal.C43976w;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.web.webview.h.a.j */
/* compiled from: PG */
public final class C44422j extends C4362f {

    /* renamed from: a */
    final /* synthetic */ PostMessageConfig f115467a;

    /* renamed from: b */
    final /* synthetic */ C44424l f115468b;

    public C44422j(C44424l lVar, PostMessageConfig postMessageConfig) {
        this.f115468b = lVar;
        this.f115467a = postMessageConfig;
    }

    /* renamed from: a */
    public final void mo9289a(C4361e eVar) {
        C47538ax c = this.f115468b.f115475e.mo51613c("WebMessageCallback#onMessage");
        try {
            C43976w a = this.f115468b.f115472b.mo46963a(this.f115467a.mo42598a());
            if (a.mo46969e()) {
                ((C59052c) ((C59052c) C44424l.f115471a.mo56226d()).mo56372aa(54230)).mo56386p("Discarded a WebMessage as channel is not available.");
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            }
            a.mo46967c(eVar.f13972a, this.f115467a);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}

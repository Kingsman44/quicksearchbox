package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.common.p4552o.C59764eu;
import com.google.common.p4552o.C59765ev;
import com.google.common.p4552o.C59774fb;
import com.google.protobuf.MessageLite;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.l */
/* compiled from: PG */
public final class C90976l extends C90983s {
    public C90976l(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85255a(MessageLite messageLite) {
        C59774fb fbVar;
        C59765ev evVar = (C59765ev) messageLite;
        if (evVar != null) {
            this.f254188a.mo85258b("MonetClient");
            this.f254188a.mo85261e();
            C90974j jVar = this.f254188a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[0] = evVar.f161480b;
            int a = C59764eu.m92502a(evVar.f161481c);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            objArr[1] = i != 1 ? i != 2 ? i != 3 ? "STOPPED" : "SHOWN" : "RESUMED" : "STARTED";
            objArr[2] = Boolean.valueOf(evVar.f161482d);
            jVar.mo85257a(String.format(locale, "MonetClientId: %s | LifecycleState: %s | SupportRestore: %b", objArr));
            this.f254188a.mo85257a(String.format(Locale.US, "SavedInstanceStateNonNull: %b", new Object[]{Boolean.valueOf(evVar.f161483e)}));
            C90972h.m148592c("RendererPublisher", evVar.f161484f, new C90984t(this.f254188a));
            C90972h.m148592c("Features", evVar.f161485g, new C90989y(this.f254188a));
            if ((evVar.f161479a & 16) != 0) {
                fbVar = evVar.f161486h;
                if (fbVar == null) {
                    fbVar = C59774fb.f161511c;
                }
            } else {
                fbVar = null;
            }
            C90972h.m148591b(fbVar, new C90977m(this.f254188a));
            this.f254188a.mo85260d();
        }
    }
}

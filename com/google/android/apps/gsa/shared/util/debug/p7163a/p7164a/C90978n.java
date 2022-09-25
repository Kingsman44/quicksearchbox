package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.common.p4552o.C59774fb;
import com.google.common.p4552o.C59776fd;
import com.google.protobuf.MessageLite;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.n */
/* compiled from: PG */
public final class C90978n extends C90983s {
    public C90978n(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85255a(MessageLite messageLite) {
        C59774fb fbVar;
        C59776fd fdVar = (C59776fd) messageLite;
        this.f254188a.mo85258b("MonetServiceHolder");
        this.f254188a.mo85261e();
        this.f254188a.mo85257a(String.format(Locale.US, "Monet client id: %s", new Object[]{fdVar.f161519b}));
        this.f254188a.mo85261e();
        C90972h.m148592c("Controllers", fdVar.f161520c, new C90985u(this.f254188a));
        this.f254188a.mo85260d();
        if ((fdVar.f161518a & 2) != 0) {
            fbVar = fdVar.f161521d;
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

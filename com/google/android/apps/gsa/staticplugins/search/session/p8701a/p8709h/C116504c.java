package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.common.base.C58887cx;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.c */
/* compiled from: PG */
final class C116504c extends C90883aq {
    public C116504c() {
        super("locationPromptResponse", 2, 0);
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Boolean bool = (Boolean) obj;
    }
}

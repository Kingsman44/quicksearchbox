package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.android.apps.gsa.shared.util.p7159c.C90935ce;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.bc */
/* compiled from: PG */
final class C90811bc extends C90805ax implements C90936cf {

    /* renamed from: a */
    final /* synthetic */ C90812bd f253939a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90811bc(C90812bd bdVar, C90935ce ceVar) {
        super(ceVar);
        this.f253939a = bdVar;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.f253939a.f253940a.mo85155b(this);
        }
        return cancel;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90811bc(C90812bd bdVar, C90936cf cfVar) {
        super(cfVar, (Object) null);
        this.f253939a = bdVar;
    }
}

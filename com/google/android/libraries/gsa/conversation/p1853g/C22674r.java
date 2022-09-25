package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.common.base.C58817ah;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.conversation.g.r */
/* compiled from: PG */
public final /* synthetic */ class C22674r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C22667k f62452a;

    public /* synthetic */ C22674r(C22667k kVar) {
        this.f62452a = kVar;
    }

    public final Object apply(Object obj) {
        return (this.f62452a == C22667k.POSTPONED || ((List) obj).contains(C22667k.POSTPONED)) ? C22667k.POSTPONED : C22667k.NORMAL;
    }
}

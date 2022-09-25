package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.pm.ResolveInfo;
import com.google.common.p4522b.C58506ho;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.k */
/* compiled from: PG */
public final /* synthetic */ class C18896k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58506ho f53180a;

    public /* synthetic */ C18896k(C58506ho hoVar) {
        this.f53180a = hoVar;
    }

    public final void accept(Object obj) {
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        this.f53180a.mo55456j(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

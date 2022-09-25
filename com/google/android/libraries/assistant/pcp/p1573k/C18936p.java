package com.google.android.libraries.assistant.pcp.p1573k;

import android.content.ComponentName;
import java.util.LinkedHashSet;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.k.p */
/* compiled from: PG */
public final /* synthetic */ class C18936p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ LinkedHashSet f53234a;

    public /* synthetic */ C18936p(LinkedHashSet linkedHashSet) {
        this.f53234a = linkedHashSet;
    }

    public final void accept(Object obj) {
        this.f53234a.add((ComponentName) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

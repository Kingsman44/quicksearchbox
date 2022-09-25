package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.app.usage.UsageStats;
import android.content.pm.PackageItemInfo;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.q */
/* compiled from: PG */
public final /* synthetic */ class C18902q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ List f53186a;

    /* renamed from: b */
    public final /* synthetic */ UsageStats f53187b;

    public /* synthetic */ C18902q(List list, UsageStats usageStats) {
        this.f53186a = list;
        this.f53187b = usageStats;
    }

    public final void accept(Object obj) {
        this.f53186a.add(new C18800a(Long.valueOf(this.f53187b.getLastTimeUsed()), (PackageItemInfo) obj));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35665z;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.k.h */
/* compiled from: PG */
public final /* synthetic */ class C12795h implements C35665z {

    /* renamed from: a */
    public final /* synthetic */ Runnable f39976a;

    /* renamed from: b */
    public final /* synthetic */ C35665z f39977b;

    public /* synthetic */ C12795h(Runnable runnable, C35665z zVar) {
        this.f39976a = runnable;
        this.f39977b = zVar;
    }

    /* renamed from: a */
    public final C60870cx mo20792a(BundledMessageNotification bundledMessageNotification, boolean z) {
        Runnable runnable = this.f39976a;
        C35665z zVar = this.f39977b;
        C59071e eVar = C12801n.f39985a;
        runnable.run();
        return zVar.mo20792a(bundledMessageNotification, z);
    }
}

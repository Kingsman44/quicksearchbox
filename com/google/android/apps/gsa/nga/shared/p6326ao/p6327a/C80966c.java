package com.google.android.apps.gsa.nga.shared.p6326ao.p6327a;

import android.content.Intent;
import com.google.android.apps.gsa.nga.shared.p6326ao.C80963a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ao.a.c */
/* compiled from: PG */
public final /* synthetic */ class C80966c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Intent f221963a;

    public /* synthetic */ C80966c(Intent intent) {
        this.f221963a = intent;
    }

    public final void accept(Object obj) {
        Intent intent = this.f221963a;
        int i = C80969f.f221966b;
        ((C80963a) obj).mo74738g(intent);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

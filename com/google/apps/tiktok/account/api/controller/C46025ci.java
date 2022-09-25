package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import android.os.Bundle;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.apps.tiktok.tracing.C47816ey;

/* renamed from: com.google.apps.tiktok.account.api.controller.ci */
/* compiled from: PG */
public final /* synthetic */ class C46025ci implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C46027ck f120872a;

    /* renamed from: b */
    public final /* synthetic */ Intent f120873b;

    /* renamed from: c */
    public final /* synthetic */ C47816ey f120874c;

    public /* synthetic */ C46025ci(C46027ck ckVar, Intent intent, C47816ey eyVar) {
        this.f120872a = ckVar;
        this.f120873b = intent;
        this.f120874c = eyVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C46027ck ckVar = this.f120872a;
        Intent intent = this.f120873b;
        C47816ey eyVar = this.f120874c;
        ckVar.f120877a.sendOrderedBroadcast(intent, ckVar.f120879c, new C46026cj(eyVar, cVar), ckVar.f120878b, -1, (String) null, (Bundle) null);
        return "MultiProcessAccountRequirementManager sendOrderedBroadcast";
    }
}

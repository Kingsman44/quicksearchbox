package com.google.android.apps.search.fedora.localcompute;

import com.google.android.gms.learning.C144829p;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19412p;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.io.File;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.localcompute.b */
/* compiled from: PG */
public final /* synthetic */ class C133060b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ FedoraLocalComputeResultHandlingService f362800a;

    /* renamed from: b */
    public final /* synthetic */ boolean f362801b;

    /* renamed from: c */
    public final /* synthetic */ String f362802c;

    /* renamed from: d */
    public final /* synthetic */ InAppTrainerOptions f362803d;

    /* renamed from: e */
    public final /* synthetic */ C19412p f362804e;

    /* renamed from: f */
    public final /* synthetic */ Optional f362805f;

    /* renamed from: g */
    public final /* synthetic */ Optional f362806g;

    /* renamed from: h */
    public final /* synthetic */ C144829p f362807h;

    public /* synthetic */ C133060b(FedoraLocalComputeResultHandlingService fedoraLocalComputeResultHandlingService, boolean z, String str, InAppTrainerOptions inAppTrainerOptions, C19412p pVar, Optional optional, Optional optional2, C144829p pVar2) {
        this.f362800a = fedoraLocalComputeResultHandlingService;
        this.f362801b = z;
        this.f362802c = str;
        this.f362803d = inAppTrainerOptions;
        this.f362804e = pVar;
        this.f362805f = optional;
        this.f362806g = optional2;
        this.f362807h = pVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        FedoraLocalComputeResultHandlingService fedoraLocalComputeResultHandlingService = this.f362800a;
        boolean z = this.f362801b;
        String str = this.f362802c;
        InAppTrainerOptions inAppTrainerOptions = this.f362803d;
        C19412p pVar = this.f362804e;
        Optional optional = this.f362805f;
        Optional optional2 = this.f362806g;
        C144829p pVar2 = this.f362807h;
        new File((String) optional.get());
        return C47633f.m84733g(pVar.mo24604e(z, new File((String) optional2.get()), inAppTrainerOptions)).mo51515h(new C133059a(str, pVar2), fedoraLocalComputeResultHandlingService.f362797d);
    }
}

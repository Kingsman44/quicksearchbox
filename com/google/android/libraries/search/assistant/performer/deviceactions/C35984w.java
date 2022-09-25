package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.app.KeyguardManager;
import android.content.pm.PackageManager;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2749b.p2750a.C35903c;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35473i;
import com.google.common.util.concurrent.C60887da;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.w */
/* compiled from: PG */
public final class C35984w {

    /* renamed from: a */
    private final C69464a f94170a;

    /* renamed from: b */
    private final C69464a f94171b;

    /* renamed from: c */
    private final C69464a f94172c;

    /* renamed from: d */
    private final C69464a f94173d;

    public C35984w(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4) {
        aVar.getClass();
        this.f94170a = aVar;
        aVar2.getClass();
        this.f94171b = aVar2;
        aVar3.getClass();
        this.f94172c = aVar3;
        aVar4.getClass();
        this.f94173d = aVar4;
    }

    /* renamed from: a */
    public final C35981t mo39917a(C35983v vVar, C35470f fVar, C35473i iVar) {
        PackageManager packageManager = (PackageManager) this.f94170a.mo17428b();
        packageManager.getClass();
        KeyguardManager keyguardManager = (KeyguardManager) this.f94171b.mo17428b();
        keyguardManager.getClass();
        C60887da daVar = (C60887da) this.f94172c.mo17428b();
        daVar.getClass();
        C35903c cVar = (C35903c) this.f94173d.mo17428b();
        cVar.getClass();
        vVar.getClass();
        fVar.getClass();
        iVar.getClass();
        return new C35981t(packageManager, keyguardManager, daVar, cVar, vVar, fVar, iVar);
    }
}

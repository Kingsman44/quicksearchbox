package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80904as;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.at */
/* compiled from: PG */
public final /* synthetic */ class C77021at implements C80904as {

    /* renamed from: a */
    public final /* synthetic */ C77027az f212572a;

    /* renamed from: b */
    public final /* synthetic */ C77088df f212573b;

    /* renamed from: c */
    public final /* synthetic */ C80303ay f212574c;

    public /* synthetic */ C77021at(C77027az azVar, C77088df dfVar, C80303ay ayVar) {
        this.f212572a = azVar;
        this.f212573b = dfVar;
        this.f212574c = ayVar;
    }

    /* renamed from: a */
    public final C60870cx mo71517a() {
        C77027az azVar = this.f212572a;
        C77088df dfVar = this.f212573b;
        C80303ay ayVar = this.f212574c;
        if (dfVar.mo72410f().isPresent()) {
            return azVar.f212600f.mo28209i(azVar.f212597c.mo72416b(dfVar, ayVar), "[NGA] wrap with MessagingTarget", C77017ap.f212565a);
        }
        return C60856cj.m92900i(Optional.empty());
    }
}

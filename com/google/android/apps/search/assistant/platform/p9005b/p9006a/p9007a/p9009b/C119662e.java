package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9009b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.a.b.e */
/* compiled from: PG */
public final class C119662e implements C119667j {

    /* renamed from: a */
    public static final /* synthetic */ int f333457a = 0;

    /* renamed from: c */
    private final C58495hd f333458c;

    /* renamed from: d */
    private final C119667j f333459d;

    public C119662e(C58495hd hdVar, Optional optional) {
        this.f333458c = hdVar;
        this.f333459d = (C119667j) optional.orElse(C119667j.f333464b);
    }

    /* renamed from: a */
    public final C119908e mo104425a(C51809dy dyVar, C119793ao aoVar) {
        return ((C119667j) Optional.ofNullable((C119661d) this.f333458c.get(dyVar.f135936b)).map(C119659b.f333454a).orElse(this.f333459d)).mo104425a(dyVar, aoVar);
    }

    /* renamed from: b */
    public final C58485gu mo104474b() {
        return (C58485gu) Collection.EL.stream(this.f333458c.values()).map(C119658a.f333453a).collect(C58370cn.f155946a);
    }
}

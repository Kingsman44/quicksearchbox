package com.google.android.libraries.mdi.download.p2248h.p2250b;

import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.p4552o.p4566l.C60184cv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.mdi.download.h.b.am */
/* compiled from: PG */
public final /* synthetic */ class C29532am implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29538as f80030a;

    /* renamed from: b */
    public final /* synthetic */ C28737bo f80031b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f80032c;

    /* renamed from: d */
    public final /* synthetic */ String f80033d;

    public /* synthetic */ C29532am(C29538as asVar, C28737bo boVar, C65753ak akVar, String str) {
        this.f80030a = asVar;
        this.f80031b = boVar;
        this.f80032c = akVar;
        this.f80033d = str;
    }

    public final C60870cx apply(Object obj) {
        C29538as asVar = this.f80030a;
        C28737bo boVar = this.f80031b;
        C65753ak akVar = this.f80032c;
        String str = this.f80033d;
        C28736bn bnVar = new C28736bn();
        bnVar.f78062a = boVar;
        bnVar.f78064c = (Exception) obj;
        bnVar.f78063b = String.format("refresh failed [%s]", new Object[]{boVar.name()});
        C28738bp a = bnVar.mo34334a();
        C29045l.m53937i("%s: GDD Sync failed for corpus: %s, configuration: %s\n%s", "GddFileGroupPopulator", akVar.name(), str, Log.isLoggable("MDD", 6) ? Log.getStackTraceString(a) : BuildConfig.FLAVOR);
        asVar.mo34765d(C60184cv.m92534b(a.f78134a.f78133ap), akVar, str);
        return C60856cj.m92899h(a);
    }
}

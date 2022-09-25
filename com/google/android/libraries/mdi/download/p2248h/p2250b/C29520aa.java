package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.mdi.download.h.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C29520aa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29538as f79996a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f79997b;

    /* renamed from: c */
    public final /* synthetic */ String f79998c;

    public /* synthetic */ C29520aa(C29538as asVar, C65753ak akVar, String str) {
        this.f79996a = asVar;
        this.f79997b = akVar;
        this.f79998c = str;
    }

    public final C60870cx apply(Object obj) {
        C29538as asVar = this.f79996a;
        C65753ak akVar = this.f79997b;
        String str = this.f79998c;
        C29045l.m53932d("%s: GDD Public Sync succeeded for corpus: %s, configuration: %s", "GddFileGroupPopulator", akVar.name(), str);
        asVar.mo34765d(2014, akVar, str);
        return C60866ct.f164955a;
    }
}

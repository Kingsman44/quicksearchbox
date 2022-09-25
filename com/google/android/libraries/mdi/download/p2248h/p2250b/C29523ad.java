package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.mdi.download.h.b.ad */
/* compiled from: PG */
public final /* synthetic */ class C29523ad implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29538as f80007a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f80008b;

    /* renamed from: c */
    public final /* synthetic */ String f80009c;

    public /* synthetic */ C29523ad(C29538as asVar, C65753ak akVar, String str) {
        this.f80007a = asVar;
        this.f80008b = akVar;
        this.f80009c = str;
    }

    public final C60870cx apply(Object obj) {
        C29538as asVar = this.f80007a;
        C65753ak akVar = this.f80008b;
        String str = this.f80009c;
        C29045l.m53932d("%s: GDD Private Sync succeeded for corpus: %s, configuration: %s", "GddFileGroupPopulator", akVar.name(), str);
        asVar.mo34765d(2015, akVar, str);
        return C60866ct.f164955a;
    }
}

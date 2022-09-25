package com.google.android.libraries.search.p2871b.p2872a.p2880h;

import com.google.android.libraries.search.p2871b.p2890e.C37234c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b;

/* renamed from: com.google.android.libraries.search.b.a.h.c */
/* compiled from: PG */
public enum C37196c implements C37234c {
    FLOW_TYPE_UNKNOWN(0),
    NONE(1),
    LENS_QUERY(101),
    LENS_PRIME(102),
    LENS_CCT(103),
    LENS_DOWNLOAD_LANGUAGE(104),
    LENS_CCT_LAUNCH(105),
    LENS_CCT_PAGE_LATENCY(106),
    LENS_IV_PAGE_LATENCY(107),
    LENS_INTERACTION_TO_LRP_RENDERED(108);
    

    /* renamed from: l */
    private final int f98662l;

    /* renamed from: m */
    private final C58833ax f98663m;

    /* renamed from: n */
    private final int f98664n;

    private C37196c(int i) {
        C58836b bVar = C58836b.f156633a;
        this.f98662l = i;
        C66419b bVar2 = C66419b.UNKNOWN;
        this.f98663m = bVar;
        this.f98664n = 1;
    }

    /* renamed from: a */
    public final int mo40693a() {
        return this.f98664n;
    }

    /* renamed from: b */
    public final int mo40694b() {
        return this.f98662l;
    }

    /* renamed from: c */
    public final C58833ax mo40695c() {
        return this.f98663m;
    }
}

package com.google.android.libraries.search.p2871b.p2872a.p2878f;

import com.google.android.libraries.search.p2871b.p2890e.C37234c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b;

/* renamed from: com.google.android.libraries.search.b.a.f.c */
/* compiled from: PG */
public enum C37190c implements C37234c {
    FLOW_TYPE_UNKNOWN(0),
    NONE(1),
    SODA_HOTWORD_INITIALIZATION(101),
    HOTWORD_PFD_CLOSE_BY_TIMEOUT(102),
    SILENT_ENROLLMENT(103),
    SPEECH_DEEPLINK(104),
    SPEECH_DEEPLINK_ENROLL_RESULT(105);
    

    /* renamed from: i */
    private final int f98394i;

    /* renamed from: j */
    private final C58833ax f98395j;

    /* renamed from: k */
    private final int f98396k;

    private C37190c(int i) {
        C58836b bVar = C58836b.f156633a;
        this.f98394i = i;
        C66419b bVar2 = C66419b.UNKNOWN;
        this.f98395j = bVar;
        this.f98396k = 1;
    }

    /* renamed from: a */
    public final int mo40693a() {
        return this.f98396k;
    }

    /* renamed from: b */
    public final int mo40694b() {
        return this.f98394i;
    }

    /* renamed from: c */
    public final C58833ax mo40695c() {
        return this.f98395j;
    }
}

package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p736c.p737a;

import com.google.android.libraries.search.p2904c.C37397bb;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C12038a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ long f38579a;

    public /* synthetic */ C12038a(long j) {
        this.f38579a = j;
    }

    public final Object apply(Object obj) {
        long j = this.f38579a;
        C37397bb bbVar = (C37397bb) obj;
        if ((bbVar.f99322a & 1) != 0) {
            j = bbVar.f99323b * 1000000;
        }
        return Long.valueOf(j);
    }
}

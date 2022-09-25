package com.google.android.gms.mdh;

import java.util.List;

/* renamed from: com.google.android.gms.mdh.a */
/* compiled from: PG */
public final class C145024a {
    /* renamed from: a */
    public static final LatestFootprintFilter m235680a(List list) {
        return new LatestFootprintFilter(list);
    }

    /* renamed from: b */
    public static final void m235681b(byte[] bArr, int i, List list) {
        list.add(new SecondaryIdMatcher((byte[]) bArr.clone(), i));
    }
}

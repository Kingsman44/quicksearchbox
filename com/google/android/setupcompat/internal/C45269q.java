package com.google.android.setupcompat.internal;

/* renamed from: com.google.android.setupcompat.internal.q */
/* compiled from: PG */
public final class C45269q {
    /* renamed from: a */
    public static void m80649a(String str, String str2, int i, int i2) {
        C45259g.m80634c(str, String.format("%s cannot be null.", new Object[]{str2}));
        int length = str.length();
        C45259g.m80632a(length <= i2 && length >= i, String.format("Length of %s should be in the range [%s-%s]", new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}));
    }
}

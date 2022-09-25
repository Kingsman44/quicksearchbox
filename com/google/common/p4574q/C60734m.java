package com.google.common.p4574q;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.common.q.m */
/* compiled from: PG */
final class C60734m {
    /* renamed from: a */
    public static Collection m92688a(Collection collection) {
        ArrayList b = C58597ky.m90211b(collection);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C58838bb.m90866a(b.get(i), "this list cannot contain null");
        }
        return b;
    }
}

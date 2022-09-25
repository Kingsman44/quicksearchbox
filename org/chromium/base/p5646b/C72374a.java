package org.chromium.base.p5646b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: org.chromium.base.b.a */
/* compiled from: PG */
public final class C72374a {

    /* renamed from: a */
    private final List f192519a = new ArrayList(1);

    /* renamed from: a */
    public final synchronized boolean mo63843a(int i) {
        if (this.f192519a.size() >= 256) {
            return false;
        }
        this.f192519a.add(Integer.valueOf(i));
        return true;
    }
}

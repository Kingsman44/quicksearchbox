package com.google.common.p4577t;

import java.util.List;

/* renamed from: com.google.common.t.a */
/* compiled from: PG */
public final class C60785a extends RuntimeException {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final List f164839a;

    public C60785a(List list) {
        super("Cyclical graphs can not be topologically sorted.");
        this.f164839a = list;
    }
}

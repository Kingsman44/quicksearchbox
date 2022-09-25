package com.google.common.p4535g;

import java.io.Serializable;

/* renamed from: com.google.common.g.co */
/* compiled from: PG */
public abstract class C59176co implements Serializable, C59125ar {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public long mo56438a() {
        return mo56552c(0).mo56438a();
    }

    /* renamed from: b */
    public abstract int mo56551b();

    /* renamed from: c */
    public abstract C59200dl mo56552c(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C59200dl mo56553d(C59173cl clVar) {
        for (int i = 0; i < mo56551b(); i++) {
            C59200dl c = mo56552c(i);
            if (c.f157265b == clVar) {
                return c;
            }
        }
        return null;
    }
}

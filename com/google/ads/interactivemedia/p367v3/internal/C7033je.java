package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.je */
/* compiled from: PG */
public final class C7033je {

    /* renamed from: a */
    public final int f22538a;

    /* renamed from: b */
    public final C7321tw f22539b;

    /* renamed from: c */
    private final CopyOnWriteArrayList f22540c;

    public C7033je() {
        this(new CopyOnWriteArrayList(), 0, (C7321tw) null);
    }

    private C7033je(CopyOnWriteArrayList copyOnWriteArrayList, int i, C7321tw twVar) {
        this.f22540c = copyOnWriteArrayList;
        this.f22538a = i;
        this.f22539b = twVar;
    }

    /* renamed from: a */
    public final C7033je mo16067a(int i, C7321tw twVar) {
        return new C7033je(this.f22540c, i, twVar);
    }

    /* renamed from: b */
    public final void mo16068b(Handler handler, C7034jf jfVar) {
        ary.m19467t(handler);
        ary.m19467t(jfVar);
        this.f22540c.add(new C7135mz());
    }
}

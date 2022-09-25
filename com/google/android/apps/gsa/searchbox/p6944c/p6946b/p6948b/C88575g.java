package com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6948b;

import com.google.android.apps.gsa.searchbox.p6944c.p6946b.C88582c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.common.util.concurrent.C60870cx;
import java.util.LinkedList;

/* renamed from: com.google.android.apps.gsa.searchbox.c.b.b.g */
/* compiled from: PG */
public abstract class C88575g extends C88582c implements C89204i {

    /* renamed from: a */
    public final Object f239410a = new Object();

    /* renamed from: b */
    public final LinkedList f239411b = new LinkedList();

    /* renamed from: c */
    public final C88572d f239412c;

    protected C88575g(C88572d dVar) {
        this.f239412c = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo82247a() {
        throw null;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        synchronized (this.f239410a) {
            while (!this.f239411b.isEmpty()) {
                C60870cx cxVar = (C60870cx) this.f239411b.poll();
                cxVar.getClass();
                cxVar.cancel(true);
            }
        }
    }

    /* renamed from: j */
    public final int mo82233j() {
        return 100;
    }
}

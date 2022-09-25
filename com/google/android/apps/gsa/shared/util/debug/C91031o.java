package com.google.android.apps.gsa.shared.util.debug;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.o */
/* compiled from: PG */
final class C91031o {

    /* renamed from: a */
    public final C91031o f254269a;

    /* renamed from: b */
    public long f254270b;

    /* renamed from: c */
    public List f254271c;

    /* renamed from: d */
    private final String f254272d;

    /* renamed from: e */
    private final long f254273e;

    public C91031o(String str, long j, C91031o oVar) {
        this.f254272d = str;
        this.f254273e = j;
        this.f254269a = oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85307a(C91006f fVar, long j) {
        Object obj;
        long j2 = this.f254270b;
        if (j2 == 0) {
            long j3 = this.f254273e;
            obj = (j - j3) + "+";
        } else {
            obj = Long.valueOf(j2 - this.f254273e);
        }
        fVar.mo85279c(this.f254272d).mo85276a(C90752i.m148229c(obj.toString()));
        List<C91031o> list = this.f254271c;
        if (list != null) {
            for (C91031o a : list) {
                a.mo85307a(fVar.mo85281e((Object) null), j);
            }
        }
    }
}

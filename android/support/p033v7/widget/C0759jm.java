package android.support.p033v7.widget;

import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.jm */
/* compiled from: PG */
final class C0759jm implements C0761jo {

    /* renamed from: a */
    final C0622ek f2650a;

    /* renamed from: b */
    final /* synthetic */ C0760jn f2651b;

    public C0759jm(C0760jn jnVar, C0622ek ekVar) {
        this.f2651b = jnVar;
        this.f2650a = ekVar;
    }

    /* renamed from: a */
    public final int mo3271a(int i) {
        return i;
    }

    /* renamed from: b */
    public final int mo3272b(int i) {
        List list = (List) this.f2651b.f2652a.get(i);
        if (list == null) {
            list = new ArrayList();
            this.f2651b.f2652a.put(i, list);
        }
        if (!list.contains(this.f2650a)) {
            list.add(this.f2650a);
        }
        return i;
    }
}

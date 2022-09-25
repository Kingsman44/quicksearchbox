package androidx.media3.common.p136b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: androidx.media3.common.b.p */
/* compiled from: PG */
public final /* synthetic */ class C2628p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CopyOnWriteArraySet f7289a;

    /* renamed from: b */
    public final /* synthetic */ int f7290b;

    /* renamed from: c */
    public final /* synthetic */ C2629q f7291c;

    public /* synthetic */ C2628p(CopyOnWriteArraySet copyOnWriteArraySet, int i, C2629q qVar) {
        this.f7289a = copyOnWriteArraySet;
        this.f7290b = i;
        this.f7291c = qVar;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f7289a;
        int i = this.f7290b;
        C2629q qVar = this.f7291c;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C2631s sVar = (C2631s) it.next();
            if (!sVar.f7295d) {
                if (i != -1) {
                    sVar.f7293b.mo6349b(i);
                }
                sVar.f7294c = true;
                qVar.mo5972a(sVar.f7292a);
            }
        }
    }
}

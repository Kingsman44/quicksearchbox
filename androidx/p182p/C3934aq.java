package androidx.p182p;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.aq */
/* compiled from: PG */
public final /* synthetic */ class C3934aq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Runnable f12589a;

    /* renamed from: b */
    public final /* synthetic */ C3935ar f12590b;

    public /* synthetic */ C3934aq(Runnable runnable, C3935ar arVar) {
        this.f12589a = runnable;
        this.f12590b = arVar;
    }

    public final void run() {
        Runnable runnable = this.f12589a;
        C3935ar arVar = this.f12590b;
        C69664n.m101061g(runnable, "$command");
        try {
            runnable.run();
        } finally {
            arVar.mo8217a();
        }
    }
}

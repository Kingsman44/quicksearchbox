package androidx.work.impl.p204a.p206b;

import android.content.Context;
import androidx.work.impl.p204a.C4415a;
import androidx.work.impl.utils.p210b.C4595b;
import java.util.LinkedHashSet;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.a.b.i */
/* compiled from: PG */
public abstract class C4434i {

    /* renamed from: a */
    public final Context f14115a;

    /* renamed from: b */
    public final Object f14116b = new Object();

    /* renamed from: c */
    public final LinkedHashSet f14117c = new LinkedHashSet();

    /* renamed from: d */
    public Object f14118d;

    /* renamed from: e */
    private final C4595b f14119e;

    protected C4434i(Context context, C4595b bVar) {
        C69664n.m101061g(context, "context");
        this.f14119e = bVar;
        Context applicationContext = context.getApplicationContext();
        C69664n.m101060f(applicationContext, "context.applicationContext");
        this.f14115a = applicationContext;
    }

    /* renamed from: b */
    public abstract Object mo9377b();

    /* renamed from: d */
    public abstract void mo9380d();

    /* renamed from: e */
    public abstract void mo9381e();

    /* renamed from: f */
    public final void mo9383f(C4415a aVar) {
        synchronized (this.f14116b) {
            if (this.f14117c.remove(aVar) && this.f14117c.isEmpty()) {
                mo9381e();
            }
        }
    }

    /* renamed from: g */
    public final void mo9384g(Object obj) {
        synchronized (this.f14116b) {
            Object obj2 = this.f14118d;
            if (obj2 == null || !C69664n.m101066l(obj2, obj)) {
                this.f14118d = obj;
                this.f14119e.f14488c.execute(new C4433h(C69540x.m100840V(this.f14117c), this));
            }
        }
    }
}

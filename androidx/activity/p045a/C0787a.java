package androidx.activity.p045a;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: androidx.activity.a.a */
/* compiled from: PG */
public final class C0787a {

    /* renamed from: a */
    public final Set f2729a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public volatile Context f2730b;

    /* renamed from: a */
    public final void mo3343a(C0788b bVar) {
        if (this.f2730b != null) {
            bVar.mo531a();
        }
        this.f2729a.add(bVar);
    }
}

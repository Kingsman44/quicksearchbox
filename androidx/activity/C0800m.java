package androidx.activity;

import androidx.core.p097i.C1967b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.m */
/* compiled from: PG */
public abstract class C0800m {

    /* renamed from: b */
    public boolean f2747b;

    /* renamed from: c */
    public final CopyOnWriteArrayList f2748c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public C1967b f2749d;

    public C0800m(boolean z) {
        this.f2747b = z;
    }

    /* renamed from: a */
    public abstract void mo608a();

    /* renamed from: b */
    public final void mo3351b() {
        Iterator it = this.f2748c.iterator();
        while (it.hasNext()) {
            ((C0786a) it.next()).mo3342b();
        }
    }

    /* renamed from: c */
    public final void mo3352c(boolean z) {
        this.f2747b = z;
        C1967b bVar = this.f2749d;
        if (bVar != null) {
            bVar.mo3353a(Boolean.valueOf(z));
        }
    }
}

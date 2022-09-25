package androidx.navigation;

import androidx.p060c.C0985o;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: androidx.navigation.ba */
/* compiled from: PG */
public final class C3833ba implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    final /* synthetic */ C3834bb f12370a;

    /* renamed from: b */
    private int f12371b = -1;

    /* renamed from: c */
    private boolean f12372c;

    public C3833ba(C3834bb bbVar) {
        this.f12370a = bbVar;
    }

    /* renamed from: a */
    public final C3825ax next() {
        if (hasNext()) {
            this.f12372c = true;
            C0985o oVar = this.f12370a.f12374a;
            int i = this.f12371b + 1;
            this.f12371b = i;
            Object f = oVar.mo3727f(i);
            C69664n.m101060f(f, "nodes.valueAt(++index)");
            return (C3825ax) f;
        }
        throw new NoSuchElementException();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f12371b + 1 < this.f12370a.f12374a.mo3725d();
    }

    public final void remove() {
        if (this.f12372c) {
            C0985o oVar = this.f12370a.f12374a;
            ((C3825ax) oVar.mo3727f(this.f12371b)).f12355d = null;
            int i = this.f12371b;
            Object[] objArr = oVar.f3126d;
            Object obj = objArr[i];
            Object obj2 = C0985o.f3123a;
            if (obj != obj2) {
                objArr[i] = obj2;
                oVar.f3124b = true;
            }
            this.f12371b = i - 1;
            this.f12372c = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element");
    }
}

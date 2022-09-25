package androidx.core.p098j;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: androidx.core.j.bo */
/* compiled from: PG */
public final class C2049bo implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f5956a;

    /* renamed from: b */
    private int f5957b;

    public C2049bo(ViewGroup viewGroup) {
        this.f5956a = viewGroup;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f5957b < this.f5956a.getChildCount();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        ViewGroup viewGroup = this.f5956a;
        int i = this.f5957b;
        this.f5957b = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void remove() {
        ViewGroup viewGroup = this.f5956a;
        int i = this.f5957b - 1;
        this.f5957b = i;
        viewGroup.removeViewAt(i);
    }
}

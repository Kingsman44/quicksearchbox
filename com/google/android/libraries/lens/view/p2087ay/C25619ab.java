package com.google.android.libraries.lens.view.p2087ay;

import java.util.LinkedList;

/* renamed from: com.google.android.libraries.lens.view.ay.ab */
/* compiled from: PG */
final class C25619ab {

    /* renamed from: a */
    public final LinkedList f69694a = new LinkedList();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30731a(Comparable comparable) {
        while (!this.f69694a.isEmpty() && ((Comparable) this.f69694a.getFirst()).compareTo(comparable) < 0) {
            this.f69694a.removeFirst();
        }
    }
}

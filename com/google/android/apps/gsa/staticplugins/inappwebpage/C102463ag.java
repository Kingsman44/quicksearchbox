package com.google.android.apps.gsa.staticplugins.inappwebpage;

import com.google.common.p4522b.C58570jy;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.ag */
/* compiled from: PG */
final class C102463ag implements Iterable {

    /* renamed from: a */
    private final LinkedList f285946a = new LinkedList();

    /* renamed from: b */
    private boolean f285947b = false;

    /* renamed from: a */
    public final synchronized void mo93268a(Object obj) {
        this.f285946a.add(obj);
        if (this.f285946a.size() > 40) {
            this.f285946a.removeFirst();
            this.f285947b = true;
        }
    }

    public final Iterator iterator() {
        if (!this.f285947b) {
            return this.f285946a.iterator();
        }
        return C58570jy.m90158j(C58570jy.m90169u(new String[]{"[History log trimmed to 40 elements]"}, 1), this.f285946a.iterator());
    }
}

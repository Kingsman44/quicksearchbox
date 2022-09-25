package com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager;

import android.support.p033v7.p040e.C0430l;
import com.google.android.apps.search.googleapp.discover.p10248y.C135254e;
import com.google.android.apps.search.googleapp.discover.p10248y.C135267r;
import com.google.android.apps.search.googleapp.discover.p10248y.C135268s;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.p5494b.C69802a;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.i */
/* compiled from: PG */
public final class C134877i implements C0430l {

    /* renamed from: a */
    private final ContentDisposableManager f367180a;

    /* renamed from: b */
    private final List f367181b;

    public C134877i(List list, ContentDisposableManager contentDisposableManager) {
        C69664n.m101061g(list, "currentRenderableSlices");
        C69664n.m101061g(contentDisposableManager, "contentDisposableManager");
        this.f367180a = contentDisposableManager;
        this.f367181b = C69540x.m100842X(list);
    }

    /* renamed from: a */
    public final void mo1392a(int i, int i2, Object obj) {
    }

    /* renamed from: b */
    public final void mo1393b(int i, int i2) {
        List list = this.f367181b;
        C58480gp f = C58485gu.m89838f(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            f.mo55395g(C135267r.f368498a);
        }
        C58485gu f2 = f.mo55394f();
        C69664n.m101060f(f2, "builder.build()");
        list.addAll(i, f2);
    }

    /* renamed from: c */
    public final void mo1394c(int i, int i2) {
        this.f367181b.add(i2, (C135268s) this.f367181b.remove(i));
    }

    /* renamed from: d */
    public final void mo1395d(int i, int i2) {
        List subList = this.f367181b.subList(i, i2 + i);
        ArrayList<C135254e> arrayList = new ArrayList<>();
        for (Object next : subList) {
            if (next instanceof C135254e) {
                arrayList.add(next);
            }
        }
        for (C135254e eVar : arrayList) {
            ContentDisposableManager contentDisposableManager = this.f367180a;
            C69802a aVar = (C69802a) contentDisposableManager.f367149a.remove(eVar.f368466a.f366399e);
            C58838bb.m90866a(aVar, "Could not find Disposable for given ContentId");
            aVar.dispose();
        }
        subList.clear();
    }
}

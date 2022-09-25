package android.support.p033v7.p037c.p038a;

import android.support.p033v7.p040e.C0430l;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: android.support.v7.c.a.g */
/* compiled from: PG */
public final class C0415g {

    /* renamed from: h */
    private static final Executor f1398h = new C0414f();

    /* renamed from: a */
    public final C0430l f1399a;

    /* renamed from: b */
    final C0410b f1400b;

    /* renamed from: c */
    final Executor f1401c;

    /* renamed from: d */
    public final List f1402d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public List f1403e;

    /* renamed from: f */
    public List f1404f = Collections.emptyList();

    /* renamed from: g */
    int f1405g;

    public C0415g(C0430l lVar, C0410b bVar) {
        this.f1399a = lVar;
        this.f1400b = bVar;
        this.f1401c = f1398h;
    }

    /* renamed from: a */
    public final void mo1387a(List list) {
        int i = this.f1405g + 1;
        this.f1405g = i;
        List list2 = this.f1403e;
        if (list != list2) {
            if (list == null) {
                int size = list2.size();
                this.f1403e = null;
                this.f1404f = Collections.emptyList();
                this.f1399a.mo1395d(0, size);
                mo1388b();
            } else if (list2 == null) {
                this.f1403e = list;
                this.f1404f = Collections.unmodifiableList(list);
                this.f1399a.mo1393b(0, list.size());
                mo1388b();
            } else {
                this.f1400b.f1388a.execute(new C0413e(this, list2, list, i));
            }
        }
    }

    /* renamed from: b */
    public final void mo1388b() {
        for (C0416h hVar : this.f1402d) {
        }
    }
}

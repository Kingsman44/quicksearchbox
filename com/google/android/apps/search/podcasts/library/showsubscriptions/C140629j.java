package com.google.android.apps.search.podcasts.library.showsubscriptions;

import android.support.p033v7.p040e.C0422d;
import com.google.android.apps.search.podcasts.p10588n.C140666ao;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.j */
/* compiled from: PG */
public final class C140629j extends C0422d {

    /* renamed from: a */
    final /* synthetic */ List f381935a;

    /* renamed from: b */
    final /* synthetic */ List f381936b;

    public C140629j(List list, List list2) {
        this.f381935a = list;
        this.f381936b = list2;
    }

    /* renamed from: a */
    public final int mo1379a() {
        return this.f381936b.size();
    }

    /* renamed from: b */
    public final int mo1380b() {
        return this.f381935a.size();
    }

    /* renamed from: d */
    public final boolean mo1382d(int i, int i2) {
        return C69664n.m101066l(this.f381935a.get(i), this.f381936b.get(i2));
    }

    /* renamed from: e */
    public final boolean mo1383e(int i, int i2) {
        return C69664n.m101066l(((C140666ao) this.f381935a.get(i)).f382044a.f381995a, ((C140666ao) this.f381936b.get(i2)).f382044a.f381995a);
    }
}

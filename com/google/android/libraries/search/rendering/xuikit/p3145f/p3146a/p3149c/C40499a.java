package com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3149c;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.silk.p3205a.p3216e.C41719a;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56850f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.a.c.a */
/* compiled from: PG */
public final class C40499a implements C41719a {

    /* renamed from: a */
    public static final C56848d f106260a;

    /* renamed from: b */
    public final Fragment f106261b;

    static {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        C69664n.m101060f(cVar, "newBuilder()");
        C56850f a = C69664n.m101061g(cVar, "builder");
        a.mo54435c("not_bubble_container_error");
        a.mo54434b("Failed to bubble container action: Fragment's peer doesn't implement the BubbleContainerApi.");
        f106260a = a.mo54433a();
    }

    public C40499a(Fragment fragment) {
        C69664n.m101061g(fragment, "fragment");
        this.f106261b = fragment;
    }
}

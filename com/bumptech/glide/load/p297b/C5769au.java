package com.bumptech.glide.load.p297b;

import androidx.core.p097i.C1971f;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.data.C5929d;
import com.bumptech.glide.load.data.C5930e;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p291h.C5630q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.b.au */
/* compiled from: PG */
final class C5769au implements C5930e, C5929d {

    /* renamed from: a */
    private final List f17353a;

    /* renamed from: b */
    private final C1971f f17354b;

    /* renamed from: c */
    private int f17355c = 0;

    /* renamed from: d */
    private C5997p f17356d;

    /* renamed from: e */
    private C5929d f17357e;

    /* renamed from: f */
    private List f17358f;

    /* renamed from: g */
    private boolean f17359g;

    public C5769au(List list, C1971f fVar) {
        this.f17354b = fVar;
        C5630q.m14606c(list);
        this.f17353a = list;
    }

    /* renamed from: h */
    private final void m14918h() {
        if (!this.f17359g) {
            if (this.f17355c < this.f17353a.size() - 1) {
                this.f17355c++;
                mo11925e(this.f17356d, this.f17357e);
                return;
            }
            C5630q.m14607d(this.f17358f, "Argument must not be null");
            this.f17357e.mo12184g(new C5673ap("Fetch failed", new ArrayList(this.f17358f)));
        }
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return ((C5930e) this.f17353a.get(0)).mo11921a();
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return ((C5930e) this.f17353a.get(0)).mo11922b();
    }

    /* renamed from: c */
    public final void mo11923c() {
        this.f17359g = true;
        for (C5930e c : this.f17353a) {
            c.mo11923c();
        }
    }

    /* renamed from: d */
    public final void mo11924d() {
        List list = this.f17358f;
        if (list != null) {
            this.f17354b.mo5127b(list);
        }
        this.f17358f = null;
        for (C5930e d : this.f17353a) {
            d.mo11924d();
        }
    }

    /* renamed from: e */
    public final void mo11925e(C5997p pVar, C5929d dVar) {
        this.f17356d = pVar;
        this.f17357e = dVar;
        this.f17358f = (List) this.f17354b.mo5126a();
        ((C5930e) this.f17353a.get(this.f17355c)).mo11925e(pVar, this);
        if (this.f17359g) {
            mo11923c();
        }
    }

    /* renamed from: f */
    public final void mo12183f(Object obj) {
        if (obj != null) {
            this.f17357e.mo12183f(obj);
        } else {
            m14918h();
        }
    }

    /* renamed from: g */
    public final void mo12184g(Exception exc) {
        List list = this.f17358f;
        C5630q.m14607d(list, "Argument must not be null");
        list.add(exc);
        m14918h();
    }
}

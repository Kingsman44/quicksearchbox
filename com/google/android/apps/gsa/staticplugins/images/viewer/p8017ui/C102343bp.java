package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C4268a;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.bp */
/* compiled from: PG */
final class C102343bp extends C4268a {

    /* renamed from: c */
    public final C4268a f285626c;

    /* renamed from: d */
    public final DataSetObserver f285627d;

    /* renamed from: e */
    private final HashMap f285628e = new HashMap();

    /* renamed from: f */
    private final boolean f285629f = C102344bq.m169659a();

    public C102343bp(C4268a aVar) {
        this.f285626c = aVar;
        C102342bo boVar = new C102342bo(this);
        this.f285627d = boVar;
        aVar.f13843a.registerObserver(boVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo93149b(int i) {
        if (this.f285629f) {
            i = (this.f285626c.mo9175k() - i) - 1;
        }
        return Math.max(0, Math.min(this.f285626c.mo9175k() - 1, i));
    }

    /* renamed from: d */
    public final void mo646d(ViewGroup viewGroup, int i, Object obj) {
        this.f285628e.remove(obj);
        this.f285626c.mo646d(viewGroup, mo93149b(i), obj);
    }

    /* renamed from: g */
    public final void mo647g(ViewGroup viewGroup, int i, Object obj) {
        this.f285626c.mo647g(viewGroup, mo93149b(i), obj);
    }

    /* renamed from: gv */
    public final Parcelable mo648gv() {
        return this.f285626c.mo648gv();
    }

    /* renamed from: gw */
    public final Object mo649gw(ViewGroup viewGroup, int i) {
        int b = mo93149b(i);
        Object gw = this.f285626c.mo649gw(viewGroup, b);
        this.f285628e.put(gw, Integer.valueOf(b));
        return gw;
    }

    /* renamed from: gx */
    public final void mo650gx(ViewGroup viewGroup) {
        this.f285626c.mo650gx(viewGroup);
    }

    /* renamed from: h */
    public final void mo651h(ViewGroup viewGroup) {
        this.f285626c.mo651h(viewGroup);
    }

    /* renamed from: i */
    public final boolean mo652i(View view, Object obj) {
        return this.f285626c.mo652i(view, obj);
    }

    /* renamed from: j */
    public final float mo9174j(int i) {
        return this.f285626c.mo9174j(mo93149b(i));
    }

    /* renamed from: jT */
    public final void mo653jT(Parcelable parcelable, ClassLoader classLoader) {
        this.f285626c.mo653jT(parcelable, classLoader);
    }

    /* renamed from: k */
    public final int mo9175k() {
        return this.f285626c.mo9175k();
    }

    /* renamed from: l */
    public final int mo9176l(Object obj) {
        int l = this.f285626c.mo9176l(obj);
        if (l == -1) {
            if (this.f285628e.containsKey(obj)) {
                return mo93149b(((Integer) this.f285628e.get(obj)).intValue());
            }
            return -2;
        } else if (l == -2) {
            return -2;
        } else {
            return mo93149b(l);
        }
    }

    /* renamed from: m */
    public final CharSequence mo9177m(int i) {
        return this.f285626c.mo9177m(mo93149b(i));
    }
}

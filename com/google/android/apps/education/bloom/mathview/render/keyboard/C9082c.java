package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.util.SparseArray;
import android.view.View;
import androidx.core.p097i.C1975j;
import androidx.core.p097i.C1977l;
import java.util.Iterator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.c */
/* compiled from: PG */
public abstract class C9082c {

    /* renamed from: a */
    public final float f31324a;

    /* renamed from: b */
    public float f31325b;

    /* renamed from: c */
    public final SparseArray f31326c = new SparseArray();

    /* renamed from: d */
    public final SparseArray f31327d = new SparseArray();

    /* renamed from: e */
    public final View.OnLayoutChangeListener f31328e = new C9081b(this);

    /* renamed from: f */
    private final C9073a f31329f = new C9073a(this);

    public C9082c(float f) {
        this.f31324a = f;
        this.f31325b = f;
    }

    /* renamed from: a */
    public final Float mo17400a() {
        Iterator a = C1977l.m5321a(this.f31326c);
        float f = Float.MAX_VALUE;
        while (a.hasNext()) {
            Float f2 = (Float) a.next();
            if (f2 == null) {
                return null;
            }
            float floatValue = f2.floatValue();
            if (f > floatValue) {
                f = floatValue;
            }
        }
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Float mo17395b(View view);

    /* renamed from: c */
    public final void mo17401c(View view) {
        C69664n.m101061g(view, "view");
        this.f31326c.put(view.getId(), (Object) null);
        this.f31327d.put(view.getId(), view);
        if (view.isLaidOut()) {
            mo17402e(view);
        }
        view.addOnLayoutChangeListener(this.f31328e);
        view.addOnAttachStateChangeListener(this.f31329f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo17396d(View view, float f);

    /* renamed from: e */
    public final void mo17402e(View view) {
        this.f31326c.put(view.getId(), mo17395b(view));
        Float a = mo17400a();
        if (a != null) {
            this.f31325b = Math.min(a.floatValue(), this.f31324a);
            C1975j jVar = new C1975j(this.f31326c);
            while (jVar.hasNext()) {
                Object obj = this.f31327d.get(Integer.valueOf(jVar.mo5128a()).intValue());
                C69664n.m101060f(obj, "viewIdMap.get(it)");
                mo17396d((View) obj, this.f31325b);
            }
        }
    }
}

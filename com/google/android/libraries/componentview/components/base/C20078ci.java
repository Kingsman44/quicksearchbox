package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20475f;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.p4522b.C58485gu;
import com.google.p4271bq.C56425d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.base.ci */
/* compiled from: PG */
public abstract class C20078ci extends C20061bs implements C20475f {

    /* renamed from: d */
    public final List f56324d = new ArrayList();

    /* renamed from: e */
    public final Executor f56325e;

    /* renamed from: f */
    protected final C20537f f56326f;

    public C20078ci(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
        this.f56326f = fVar;
        this.f56325e = executor;
    }

    /* renamed from: B */
    public static void m37955B(View view, C20470a aVar, float f, float f2, float f3, float f4, View view2) {
        int left = view2.getLeft();
        float f5 = 0.0f;
        if (left > 0) {
            f4 = 0.0f;
        }
        if (left > 0) {
            f = 0.0f;
        }
        int right = view2.getRight();
        int width = view.getWidth();
        if (right < width) {
            f3 = 0.0f;
        }
        if (right < width) {
            f2 = 0.0f;
        }
        int top = view2.getTop();
        if (top > 0) {
            f2 = 0.0f;
        }
        if (top > 0) {
            f = 0.0f;
        }
        int bottom = view2.getBottom();
        int height = view.getHeight();
        if (bottom < height) {
            f4 = 0.0f;
        }
        if (bottom >= height) {
            f5 = f3;
        }
        aVar.mo25181kD(f, f2, f5, f4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo25256A(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo25258n((C56425d) it.next());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo25257C(float f, float f2, float f3, float f4) {
        for (C20470a aVar : this.f56324d) {
            View view = this.f56305p;
            View kH = aVar.mo25098kH();
            if (kH != null) {
                if (kH.getVisibility() != 8) {
                    m37955B(view, aVar, f, f2, f3, f4, kH);
                } else {
                    View view2 = kH;
                    View view3 = view;
                    C20470a aVar2 = aVar;
                    float f5 = f;
                    float f6 = f2;
                    float f7 = f3;
                    float f8 = f4;
                    C20076cg cgVar = new C20076cg(view2, view3, aVar2, f5, f6, f7, f8);
                    kH.getViewTreeObserver().addOnGlobalLayoutListener(cgVar);
                    kH.addOnAttachStateChangeListener(new C20077ch(view2, view3, aVar2, f5, f6, f7, f8, cgVar));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C56425d mo25113i(List list);

    /* renamed from: kA */
    public final /* synthetic */ List mo25239kA() {
        return C58485gu.m89842j(this.f56324d);
    }

    /* renamed from: kB */
    public final void mo25240kB() {
        mo25116kJ();
    }

    /* renamed from: kJ */
    public abstract void mo25116kJ();

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        return mo25113i(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C20470a mo25258n(C56425d dVar) {
        C20470a a = this.f56326f.mo25450a(this, dVar);
        if (a != null) {
            int size = this.f56324d.size();
            View kH = a.mo25098kH();
            if (kH != null) {
                this.f56324d.add(size, a);
                mo25259o(size, kH);
                C20075cf.m37938v(a);
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo25259o(int i, View view) {
        ((ViewGroup) this.f56305p).addView(view, i);
    }

    /* renamed from: p */
    public void mo25192p(float f, float f2, float f3, float f4) {
        super.mo25192p(f, f2, f3, f4);
        mo25257C(f, f2, f3, f4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo25193q(float f, float f2, float f3, float f4) {
        super.mo25193q(f, f2, f3, f4);
        mo25257C(f, f2, f3, f4);
    }
}

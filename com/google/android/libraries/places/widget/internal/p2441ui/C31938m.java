package com.google.android.libraries.places.widget.internal.p2441ui;

import android.content.res.Resources;
import android.support.p033v7.widget.C0568ck;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.p119j.p120a.p121a.C2300b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.places.widget.internal.ui.m */
/* compiled from: PG */
public final class C31938m extends C0568ck {

    /* renamed from: n */
    public final List f85904n = new ArrayList();

    /* renamed from: o */
    private final List f85905o = new ArrayList();

    /* renamed from: p */
    private final List f85906p = new ArrayList();

    /* renamed from: q */
    private final int f85907q;

    public C31938m(Resources resources) {
        this.f85907q = resources.getDimensionPixelSize(R.dimen.places_autocomplete_vertical_dropdown);
    }

    /* renamed from: y */
    public static void m59499y(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    /* renamed from: z */
    private final void m59500z(C0673gh ghVar) {
        View view = ghVar.itemView;
        this.f85904n.add(ghVar);
        long j = this.f2410j;
        int layoutPosition = ghVar.getLayoutPosition();
        view.setTranslationY((float) (-this.f85907q));
        view.setAlpha(0.0f);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.translationY(0.0f).alpha(1.0f).setDuration(133).setInterpolator(new C2300b()).setStartDelay(j + ((long) (layoutPosition * 67)));
        animate.setListener(new C31937l(this, view, ghVar, animate)).start();
    }

    /* renamed from: c */
    public final void mo2687c(C0673gh ghVar) {
        try {
            super.mo2687c(ghVar);
            if (this.f85905o.remove(ghVar)) {
                m59499y(ghVar.itemView);
                mo2889m(ghVar);
            }
            mo37709x();
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: d */
    public final void mo2688d() {
        try {
            int size = this.f85905o.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C0673gh ghVar = (C0673gh) this.f85905o.get(size);
                m59499y(ghVar.itemView);
                mo2889m(ghVar);
                this.f85905o.remove(size);
            }
            List list = this.f85904n;
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    ((C0673gh) list.get(size2)).itemView.animate().cancel();
                } else {
                    super.mo2688d();
                    return;
                }
            }
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: e */
    public final void mo2689e() {
        try {
            for (C0673gh f : this.f85906p) {
                super.mo2690f(f);
            }
            this.f85906p.clear();
            super.mo2689e();
            if (!this.f85905o.isEmpty()) {
                ArrayList<C0673gh> arrayList = new ArrayList<>(this.f85905o);
                this.f85905o.clear();
                for (C0673gh ghVar : arrayList) {
                    View view = ghVar.itemView;
                    this.f85904n.add(ghVar);
                    long layoutPosition = this.f2410j + ((long) (ghVar.getLayoutPosition() * 67));
                    view.setTranslationY((float) (-this.f85907q));
                    view.setAlpha(0.0f);
                    ViewPropertyAnimator animate = view.animate();
                    animate.cancel();
                    animate.translationY(0.0f).alpha(1.0f).setDuration(133).setInterpolator(new C2300b()).setStartDelay(layoutPosition);
                    animate.setListener(new C31937l(this, view, ghVar, animate)).start();
                }
            }
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: f */
    public final boolean mo2690f(C0673gh ghVar) {
        try {
            mo2687c(ghVar);
            ghVar.itemView.setAlpha(0.0f);
            if (((C31942q) ghVar).f85916d) {
                this.f85905o.add(ghVar);
                return true;
            }
            this.f85906p.add(ghVar);
            return true;
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: k */
    public final boolean mo2695k() {
        try {
            return super.mo2695k() || !this.f85906p.isEmpty() || !this.f85905o.isEmpty() || !this.f85904n.isEmpty();
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: x */
    public final void mo37709x() {
        if (!mo2695k()) {
            mo2890n();
        }
    }
}

package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108325en;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.z */
/* compiled from: PG */
public final class C114156z implements C22869e {

    /* renamed from: a */
    final /* synthetic */ C114096aa f316469a;

    public C114156z(C114096aa aaVar) {
        this.f316469a = aaVar;
    }

    public final void run() {
        TextView textView;
        C114096aa aaVar = this.f316469a;
        int a = aaVar.f316182d.mo95351a();
        while (true) {
            a--;
            if (a < 0) {
                break;
            }
            C108232bc b = aaVar.f316182d.mo95352b(a);
            if (b instanceof C108325en) {
                C108241bl m = ((C108325en) b).mo96603m();
                TextView textView2 = null;
                if (!(m == null || (textView = m.f301077d) == null)) {
                    textView2 = textView;
                }
                if (textView2 != null) {
                    aaVar.f316184f.add(textView2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (View view : this.f316469a.f316184f) {
            int b2 = C114096aa.m189228b(view, this.f316469a.f316183e);
            int height = this.f316469a.f316183e.getHeight();
            int a2 = C114096aa.m189227a(view, this.f316469a.f316183e);
            int width = this.f316469a.f316183e.getWidth();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.33f, 1.0f});
            ofFloat.setInterpolator(C114096aa.f316179a);
            ofFloat.setDuration(1600);
            ofFloat.setStartDelay((long) Math.round(((((float) b2) / ((float) height)) + (((float) a2) / ((float) width))) * 550.0f));
            arrayList.add(ofFloat);
        }
        this.f316469a.f316180b = new AnimatorSet();
        this.f316469a.f316180b.playTogether(arrayList);
        this.f316469a.f316180b.addListener(new C114155y(this));
        for (View animate : this.f316469a.f316184f) {
            animate.animate().alpha(1.0f);
        }
        C114096aa aaVar2 = this.f316469a;
        aaVar2.f316181c = false;
        ViewPropertyAnimator animate2 = ((View) aaVar2.f316184f.iterator().next()).animate();
        AnimatorSet animatorSet = this.f316469a.f316180b;
        Objects.requireNonNull(animatorSet);
        animate2.withEndAction(new C114154x(animatorSet));
    }
}

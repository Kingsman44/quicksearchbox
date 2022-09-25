package com.google.android.libraries.onegoogle.popovercontainer;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.content.C1878d;
import androidx.core.graphics.C1924a;
import androidx.p119j.p120a.p121a.C2301c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3504a.C44499d;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.q */
/* compiled from: PG */
public final /* synthetic */ class C31055q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31036ak f83643a;

    /* renamed from: b */
    public final /* synthetic */ View f83644b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f83645c;

    public /* synthetic */ C31055q(C31036ak akVar, View view, Bundle bundle) {
        this.f83643a = akVar;
        this.f83644b = view;
        this.f83645c = bundle;
    }

    public final void run() {
        C31036ak akVar = this.f83643a;
        View view = this.f83644b;
        Bundle bundle = this.f83645c;
        view.findViewById(R.id.og_header_close_button).setOnClickListener(new C31056r(akVar));
        akVar.f83600d = new C31054p(akVar.f83604h, C31054p.f83637a, view.findViewById(R.id.og_container_scroll_view));
        akVar.f83600d.mo36760b();
        if (bundle == null) {
            ExpandableDialogView expandableDialogView = (ExpandableDialogView) Objects.requireNonNull(akVar.f83604h);
            expandableDialogView.setAlpha(0.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(expandableDialogView, C31036ak.f83598b, new float[]{0.0f, 1.0f});
            ofFloat.setDuration(83);
            ofFloat.setInterpolator(new LinearInterpolator());
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(expandableDialogView, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.8f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.8f, 1.0f})});
            ofPropertyValuesHolder.setDuration(200);
            ofPropertyValuesHolder.setInterpolator(new C2301c());
            expandableDialogView.getViewTreeObserver().addOnPreDrawListener(new C31061w(expandableDialogView));
            if (!(akVar.getDialog() == null || akVar.getDialog().getWindow() == null)) {
                int a = C1878d.m5128a(akVar.requireContext(), R.color.google_scrim);
                ObjectAnimator ofObject = ObjectAnimator.ofObject(akVar.getDialog().getWindow().getDecorView(), C31036ak.f83599c, new C44499d(), new Integer[]{Integer.valueOf(C1924a.m5189h(a, 0)), Integer.valueOf(a)});
                ofObject.setInterpolator(new LinearInterpolator());
                ofObject.setDuration(200);
                ofObject.start();
            }
            ofFloat.start();
            ofPropertyValuesHolder.start();
        }
    }
}

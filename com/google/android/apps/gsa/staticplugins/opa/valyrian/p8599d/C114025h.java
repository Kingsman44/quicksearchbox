package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d;

import android.animation.ValueAnimator;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import com.google.android.libraries.gsa.p1876k.C22870f;
import java.util.Arrays;
import java.util.Collections;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.d.h */
/* compiled from: PG */
public final /* synthetic */ class C114025h implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C114028k f315678a;

    public /* synthetic */ C114025h(C114028k kVar) {
        this.f315678a = kVar;
    }

    public final void run() {
        C114028k kVar = this.f315678a;
        kVar.f315685e.measure(View.MeasureSpec.makeMeasureSpec(kVar.f315685e.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(16777215, LinearLayoutManager.INVALID_OFFSET));
        C114034q.m188814j(kVar.f315684d, kVar.f315690j);
        int measuredHeight = kVar.f315685e.getMeasuredHeight();
        int i = kVar.f315681a;
        if (i == measuredHeight) {
            kVar.mo100942a();
            return;
        }
        int abs = Math.abs(i - measuredHeight);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{kVar.f315681a, measuredHeight});
        kVar.f315682b = ofInt;
        ofInt.addUpdateListener(new C114026i(kVar.f315685e));
        ofInt.addListener(new C114027j(kVar));
        ofInt.setDuration(((Duration) Collections.min(Arrays.asList(new Duration[]{Duration.ofMillis((long) ((((float) abs) / kVar.f315683c) * 1000.0f)), C114034q.f315713a}))).toMillis());
        ofInt.start();
    }
}

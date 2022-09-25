package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.bf */
/* compiled from: PG */
public final /* synthetic */ class C113960bf implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ ImageView f315590a;

    public /* synthetic */ C113960bf(ImageView imageView) {
        this.f315590a = imageView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView = this.f315590a;
        C59071e eVar = C114071eg.f315790j;
        boolean z = true;
        if (!(motionEvent.getAction() == 0 || motionEvent.getAction() == 2)) {
            z = false;
        }
        imageView.setSelected(z);
        return false;
    }
}

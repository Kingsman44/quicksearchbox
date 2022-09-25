package com.google.android.libraries.surveys.internal.view;

import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;

/* renamed from: com.google.android.libraries.surveys.internal.view.g */
/* compiled from: PG */
public final /* synthetic */ class C43149g implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ CheckBox f112838a;

    /* renamed from: b */
    public final /* synthetic */ View f112839b;

    /* renamed from: c */
    public final /* synthetic */ EditText f112840c;

    public /* synthetic */ C43149g(CheckBox checkBox, View view, EditText editText) {
        this.f112838a = checkBox;
        this.f112839b = view;
        this.f112840c = editText;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        CheckBox checkBox = this.f112838a;
        View view2 = this.f112839b;
        EditText editText = this.f112840c;
        if (motionEvent.getAction() != 1) {
            return false;
        }
        if (motionEvent.getX() < 0.0f || motionEvent.getX() >= ((float) checkBox.getWidth()) || motionEvent.getY() < 0.0f || motionEvent.getY() >= ((float) view2.getHeight())) {
            editText.requestFocus();
            C43066o.m75993n(editText);
            return false;
        }
        checkBox.performClick();
        return false;
    }
}

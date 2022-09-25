package com.google.android.libraries.places.widget;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.places.widget.internal.p2441ui.AutocompleteImplFragment;

/* renamed from: com.google.android.libraries.places.widget.b */
/* compiled from: PG */
public final /* synthetic */ class C31897b implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutocompleteActivity f85779a;

    /* renamed from: b */
    public final /* synthetic */ AutocompleteImplFragment f85780b;

    /* renamed from: c */
    public final /* synthetic */ View f85781c;

    public /* synthetic */ C31897b(AutocompleteActivity autocompleteActivity, AutocompleteImplFragment autocompleteImplFragment, View view) {
        this.f85779a = autocompleteActivity;
        this.f85780b = autocompleteImplFragment;
        this.f85781c = view;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AutocompleteActivity autocompleteActivity = this.f85779a;
        AutocompleteImplFragment autocompleteImplFragment = this.f85780b;
        View view2 = this.f85781c;
        autocompleteActivity.f85776k = false;
        View view3 = autocompleteImplFragment.getView();
        if (view3 == null || motionEvent.getY() <= ((float) view3.getBottom())) {
            return false;
        }
        autocompleteActivity.f85776k = true;
        view2.performClick();
        return true;
    }
}

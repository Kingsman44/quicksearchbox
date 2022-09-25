package com.google.android.apps.gsa.search.shared.p6930h;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.search.shared.h.c */
/* compiled from: PG */
public final class C87560c implements View.OnTouchListener {

    /* renamed from: a */
    private final Collection f236495a;

    public C87560c(View.OnTouchListener... onTouchListenerArr) {
        ArrayList arrayList = new ArrayList();
        this.f236495a = arrayList;
        arrayList.addAll(Arrays.asList(onTouchListenerArr));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        for (View.OnTouchListener onTouch : this.f236495a) {
            if (onTouch.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}

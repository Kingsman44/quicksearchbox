package com.google.android.apps.gsa.searchbox.p6960ui;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.l */
/* compiled from: PG */
public final class C88711l implements View.OnTouchListener {
    /* renamed from: a */
    public static Point m143617a(View view) {
        Point point = (Point) view.getTag(R.id.app_icon_touched);
        if (point != null) {
            return point;
        }
        Point point2 = new Point();
        view.setTag(R.id.app_icon_touched, point2);
        return point2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            m143617a(view).set(((int) motionEvent.getX()) + iArr[0], ((int) motionEvent.getY()) + iArr[1]);
        }
        return false;
    }
}

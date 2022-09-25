package com.google.android.apps.search.googleapp.homescreen;

import android.view.MotionEvent;
import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.m */
/* compiled from: PG */
final class C136191m implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ int f370884a;

    /* renamed from: b */
    final /* synthetic */ C136193o f370885b;

    public C136191m(int i, C136193o oVar) {
        this.f370884a = i;
        this.f370885b = oVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View r;
        motionEvent.offsetLocation(0.0f, (float) this.f370884a);
        View view2 = this.f370885b.f370907b.getView();
        if (view2 == null || (r = C2043bi.m5589r(view2, R.id.googleapp_hs_header_container)) == null) {
            return true;
        }
        r.dispatchTouchEvent(motionEvent);
        return true;
    }
}

package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.content.Intent;
import android.support.p031v4.app.C0167am;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110425l;
import com.google.android.libraries.logging.C28285c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.ao */
/* compiled from: PG */
final class C110329ao extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ TouchInterceptingFrameLayout f307495a;

    /* renamed from: b */
    final /* synthetic */ C110332ar f307496b;

    public C110329ao(C110332ar arVar, TouchInterceptingFrameLayout touchInterceptingFrameLayout) {
        this.f307496b = arVar;
        this.f307495a = touchInterceptingFrameLayout;
    }

    /* renamed from: a */
    private final void m183720a(int i) {
        C0167am activity = this.f307496b.getActivity();
        if (activity != null) {
            activity.setResult(-1, new Intent().putExtra("PHOTOS_EXTRA_EXIT_REASON", i));
            activity.finish();
        }
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        m183720a(7);
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!((C110425l) this.f307496b.f307515j.mo27525b()).mo98664b()) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        }
        if (this.f307496b.f307516k) {
            C89949q.m146521e(C28285c.m52882i(this.f307495a, 5, (Integer) null), false);
        }
        m183720a(2);
        return true;
    }
}

package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.content.Intent;
import android.support.p031v4.app.C0167am;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.ap */
/* compiled from: PG */
final class C110330ap extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ C110332ar f307497a;

    public C110330ap(C110332ar arVar) {
        this.f307497a = arVar;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C110331aq aqVar;
        C0167am activity = this.f307497a.getActivity();
        if (activity == null || (aqVar = this.f307497a.f307520o) == null) {
            if (activity != null) {
                activity.setResult(-1, new Intent().putExtra("PHOTOS_EXTRA_EXIT_REASON", 2));
                activity.finish();
            }
            return true;
        }
        aqVar.mo97370B();
        return true;
    }
}

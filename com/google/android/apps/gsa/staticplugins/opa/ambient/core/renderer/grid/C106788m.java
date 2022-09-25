package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.gsa.staticplugins.opa.ambient.activity.C106429x;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.m */
/* compiled from: PG */
final class C106788m extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ Optional f297579a;

    /* renamed from: b */
    final /* synthetic */ C106791p f297580b;

    public C106788m(C106791p pVar, Optional optional) {
        this.f297580b = pVar;
        this.f297579a = optional;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f297579a.isEmpty()) {
            ((C58970a) ((C58970a) this.f297580b.f297585a.mo56226d()).mo56372aa(23193)).mo56386p("empty space clicked. but no navigation controller available, cannot finish.");
            return false;
        }
        ((C58970a) ((C58970a) this.f297580b.f297585a.mo56224b()).mo56372aa(23192)).mo56386p("empty space clicked. finish.");
        ((C106429x) this.f297579a.get()).mo95502v();
        return true;
    }
}

package com.google.android.libraries.lens.view.frozenimage;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.lens.view.p2078at.C25516av;
import com.google.android.libraries.lens.view.p2078at.C25529l;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.libraries.lens.view.frozenimage.r */
/* compiled from: PG */
final class C26286r extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ FrozenImageView f71434a;

    public C26286r(FrozenImageView frozenImageView) {
        this.f71434a = frozenImageView;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        FrozenImageView frozenImageView = this.f71434a;
        PointF c = frozenImageView.mo31471c(motionEvent);
        boolean z = false;
        if (frozenImageView.mo31472e(c) && motionEvent.getAction() == 1) {
            z = true;
        }
        if (z) {
            C47393f.m84237h(new C25529l(c), frozenImageView);
            frozenImageView.f71403b.mo33853c(new C28440j(36).mo33894a(), C28485y.m53234a(frozenImageView));
        }
        return z;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        FrozenImageView frozenImageView = this.f71434a;
        return frozenImageView.mo31472e(frozenImageView.mo31471c(motionEvent));
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        FrozenImageView frozenImageView = this.f71434a;
        PointF c = frozenImageView.mo31471c(motionEvent);
        boolean e = frozenImageView.mo31472e(c);
        if (e) {
            C47393f.m84237h(new C25516av(c), frozenImageView);
            frozenImageView.f71403b.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(frozenImageView));
        }
        return e;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        FrozenImageView frozenImageView = this.f71434a;
        return frozenImageView.mo31472e(frozenImageView.mo31471c(motionEvent));
    }
}

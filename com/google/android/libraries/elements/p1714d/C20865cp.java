package com.google.android.libraries.elements.p1714d;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.elements.interfaces.C21240aj;
import com.google.android.libraries.elements.interfaces.C21245ao;
import com.google.android.libraries.elements.interfaces.C21302i;
import java.util.List;

/* renamed from: com.google.android.libraries.elements.d.cp */
/* compiled from: PG */
final class C20865cp implements GestureDetector.OnDoubleTapListener {

    /* renamed from: a */
    private final C20864co f58520a;

    public C20865cp(C20864co coVar) {
        this.f58520a = coVar;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        List<C21240aj> list;
        C20864co coVar = this.f58520a;
        if (motionEvent.getActionMasked() != 1 || (list = coVar.f58512f) == null) {
            return false;
        }
        for (C21240aj a : list) {
            a.mo26127a((View) coVar.f58507a.get(), new C21302i(motionEvent.getX(), motionEvent.getY()));
        }
        return false;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C20864co coVar = this.f58520a;
        List<C21245ao> list = coVar.f58511e;
        if (list == null) {
            return false;
        }
        for (C21245ao a : list) {
            a.mo25926a((View) coVar.f58507a.get(), new C21302i(motionEvent.getX(), motionEvent.getY()));
        }
        return false;
    }
}

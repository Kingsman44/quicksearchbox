package com.google.android.libraries.elements.p1714d;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.elements.interfaces.C21241ak;
import com.google.android.libraries.elements.interfaces.C21244an;
import com.google.android.libraries.elements.interfaces.C21302i;
import java.util.List;

/* renamed from: com.google.android.libraries.elements.d.cq */
/* compiled from: PG */
final class C20866cq implements GestureDetector.OnGestureListener {

    /* renamed from: a */
    private final C20864co f58521a;

    public C20866cq(C20864co coVar) {
        this.f58521a = coVar;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C20864co coVar = this.f58521a;
        View view = (View) coVar.f58507a.get();
        List<C21244an> list = coVar.f58517k;
        if (list == null || view == null) {
            return false;
        }
        for (C21244an a : list) {
            a.mo26101a(view, new C21302i(motionEvent.getX(), motionEvent.getY()), new C21302i(motionEvent2.getX(), motionEvent2.getY()), f, f2);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r7.f58521a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLongPress(android.view.MotionEvent r8) {
        /*
            r7 = this;
            com.google.android.libraries.elements.d.co r0 = r7.f58521a
            boolean r0 = r0.mo25970b()
            if (r0 == 0) goto L_0x0037
            com.google.android.libraries.elements.d.co r0 = r7.f58521a
            java.util.List r1 = r0.f58514h
            if (r1 == 0) goto L_0x0037
            java.util.Iterator r1 = r1.iterator()
        L_0x0012:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r1.next()
            com.google.android.libraries.elements.interfaces.am r2 = (com.google.android.libraries.elements.interfaces.C21243am) r2
            java.lang.ref.WeakReference r3 = r0.f58507a
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            float r4 = r8.getX()
            float r5 = r8.getY()
            com.google.android.libraries.elements.interfaces.i r6 = new com.google.android.libraries.elements.interfaces.i
            r6.<init>(r4, r5)
            r2.mo25927a(r3, r6)
            goto L_0x0012
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.C20866cq.onLongPress(android.view.MotionEvent):void");
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C20864co coVar = this.f58521a;
        View view = (View) coVar.f58507a.get();
        List<C21241ak> list = coVar.f58515i;
        if (list == null || view == null) {
            return false;
        }
        coVar.f58519m = true;
        C21302i iVar = new C21302i(motionEvent.getX(), motionEvent.getY());
        C21302i iVar2 = new C21302i(motionEvent2.getX(), motionEvent2.getY());
        for (C21241ak a : list) {
            a.mo26100a(view, iVar, iVar2, f, f2);
        }
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}

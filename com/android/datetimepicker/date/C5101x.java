package com.android.datetimepicker.date;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.android.datetimepicker.date.x */
/* compiled from: PG */
final class C5101x extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ C5072ab f16272a;

    public C5101x(C5072ab abVar) {
        this.f16272a = abVar;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.f16272a.f16182m.setEmpty();
        C5072ab abVar = this.f16272a;
        int b = abVar.mo10056b();
        int i = abVar.f16173d;
        float f = (float) b;
        if (x >= f) {
            int i2 = abVar.f16186q;
            if (x <= ((float) i2)) {
                float f2 = (float) i;
                if (y >= f2) {
                    float f3 = ((float) (i2 - b)) / ((float) abVar.f16193x);
                    int i3 = (int) (f + (((float) ((int) ((x - f) / f3))) * f3));
                    int i4 = abVar.f16188s;
                    int i5 = i + (((int) ((y - f2) / ((float) i4))) * i4);
                    abVar.f16182m.set(i3, i5, (int) (((float) i3) + f3), i4 + i5);
                }
            }
        }
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        C5072ab abVar = this.f16272a;
        if (!abVar.f16182m.isEmpty()) {
            abVar.mo10061f(motionEvent.getX(), motionEvent.getY(), new C5099v(abVar));
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f16272a.f16182m.isEmpty()) {
            return false;
        }
        if (this.f16272a.f16182m.contains((int) motionEvent2.getX(), (int) motionEvent2.getY())) {
            return true;
        }
        this.f16272a.f16182m.setEmpty();
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.f16272a.f16182m.isEmpty()) {
            return false;
        }
        return this.f16272a.mo10061f(motionEvent.getX(), motionEvent.getY(), new C5100w(this));
    }
}

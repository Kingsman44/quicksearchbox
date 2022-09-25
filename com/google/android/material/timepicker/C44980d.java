package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1990j;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.timepicker.d */
/* compiled from: PG */
final class C44980d extends C2061c {

    /* renamed from: a */
    final /* synthetic */ ClockFaceView f117547a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44980d(ClockFaceView clockFaceView) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f117547a = clockFaceView;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            kVar.f5921a.setTraversalAfter((View) this.f117547a.f117477c.get(intValue - 1));
        }
        kVar.mo5155d(C1990j.m5333a(0, 1, intValue, 1, false, view.isSelected()));
        kVar.f5921a.setClickable(true);
        kVar.mo5153b(C1988h.f5905c);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        view.getHitRect(this.f117547a.f117476b);
        long j = uptimeMillis;
        float centerX = (float) this.f117547a.f117476b.centerX();
        float centerY = (float) this.f117547a.f117476b.centerY();
        this.f117547a.f117475a.onTouchEvent(MotionEvent.obtain(uptimeMillis, j, 0, centerX, centerY, 0));
        this.f117547a.f117475a.onTouchEvent(MotionEvent.obtain(uptimeMillis, j, 1, centerX, centerY, 0));
        return true;
    }
}

package com.android.datetimepicker.date;

import android.util.Log;
import android.view.View;

/* renamed from: com.android.datetimepicker.date.q */
/* compiled from: PG */
public final class C5094q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5095r f16250a;

    /* renamed from: b */
    private int f16251b;

    protected C5094q(C5095r rVar) {
        this.f16250a = rVar;
    }

    /* renamed from: a */
    public final void mo10099a(int i) {
        this.f16250a.f16254b.removeCallbacks(this);
        this.f16251b = i;
        this.f16250a.f16254b.postDelayed(this, 40);
    }

    public final void run() {
        this.f16250a.f16259g = this.f16251b;
        if (Log.isLoggable("MonthFragment", 3)) {
            int i = this.f16251b;
            int i2 = this.f16250a.f16258f;
            Log.d("MonthFragment", "new scroll state: " + i + " old state: " + i2);
        }
        int i3 = this.f16251b;
        if (i3 == 0) {
            C5095r rVar = this.f16250a;
            int i4 = rVar.f16258f;
            boolean z = false;
            if (i4 == 0 || i4 == 1) {
                i3 = 0;
            } else {
                rVar.f16258f = 0;
                View childAt = rVar.getChildAt(0);
                int i5 = 0;
                while (childAt != null && childAt.getBottom() <= 0) {
                    i5++;
                    childAt = this.f16250a.getChildAt(i5);
                }
                if (childAt != null) {
                    int firstVisiblePosition = this.f16250a.getFirstVisiblePosition();
                    int lastVisiblePosition = this.f16250a.getLastVisiblePosition();
                    if (!(firstVisiblePosition == 0 || lastVisiblePosition == this.f16250a.getCount() - 1)) {
                        z = true;
                    }
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    int height = this.f16250a.getHeight() / 2;
                    if (z && top < -1) {
                        if (bottom > height) {
                            this.f16250a.smoothScrollBy(top, 250);
                            return;
                        } else {
                            this.f16250a.smoothScrollBy(bottom, 250);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        this.f16250a.f16258f = i3;
    }
}

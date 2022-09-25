package com.google.android.apps.search.googleapp.activity;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.apps.tiktok.tracing.C47538ax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class FirstDrawObservableCoordinatorLayout extends CoordinatorLayout {

    /* renamed from: i */
    public final List f363410i = new ArrayList();

    public FirstDrawObservableCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        for (C133380ad adVar : this.f363410i) {
            C133387ak akVar = adVar.f363443a;
            C47538ax c = akVar.f363465n.mo51613c("GoogleAppActivityPeer#onFirstDrawDoneCallback");
            try {
                akVar.f363458g.mo83757a();
                akVar.f363461j.mo41633g();
                akVar.mo111120i(C133385ai.f363448a);
                if (c != null) {
                    c.close();
                }
            } catch (Throwable th) {
                C133378ab.m216496a(th, th);
            }
        }
        this.f363410i.clear();
        return;
        throw th;
    }
}

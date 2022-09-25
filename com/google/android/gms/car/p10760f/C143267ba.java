package com.google.android.gms.car.p10760f;

import android.graphics.Rect;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.p054b.p055a.p058c.C0895a;
import com.google.android.gms.car.C143201dr;
import com.google.android.gms.car.C143202ds;
import com.google.android.gms.car.C143204du;
import com.google.android.gms.car.C143205dv;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.f.ba */
/* compiled from: PG */
final class C143267ba implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C143268bb f388428a;

    /* renamed from: b */
    private final boolean f388429b;

    /* renamed from: c */
    private final View f388430c;

    /* renamed from: d */
    private final C143205dv f388431d;

    public C143267ba(C143268bb bbVar, boolean z, View view, C143205dv dvVar) {
        this.f388428a = bbVar;
        this.f388429b = z;
        this.f388430c = view;
        this.f388431d = dvVar;
    }

    public final void onGlobalLayout() {
        C0895a aVar;
        View findViewById;
        if (C143316a.m232515e("CAR.PROJECTION.CAHI", 2)) {
            C143268bb bbVar = this.f388428a;
            C143316a.m232514d(2, "CAR.PROJECTION.CAHI", (Throwable) null, "%s onGlobalLayout() [hasInputFocus:%b, inTouchMode:%b]", bbVar.f388473v, Boolean.valueOf(this.f388429b), Boolean.valueOf(bbVar.f388433A));
        }
        C143268bb bbVar2 = this.f388428a;
        bbVar2.f388464m.mo118151h(this.f388429b, bbVar2.f388433A, -1, (Rect) null);
        C143205dv dvVar = this.f388431d;
        if (dvVar != null) {
            View view = this.f388430c;
            int i = dvVar.f388303a;
            if (i == -1) {
                C143316a.m232511a("GH.ViewFocusInfo", (Throwable) null, "Attempted to restore View focus state, but no id was saved.");
            } else {
                View findViewById2 = view.findViewById(i);
                if (findViewById2 == null) {
                    C143316a.m232511a("GH.ViewFocusInfo", (Throwable) null, "Attempted to restore View focus state, but the View was not found by id. Maybe view hierarchy is being added asynchronously?");
                } else {
                    if ((findViewById2 instanceof RecyclerView) && (dvVar.f388304b >= 0 || dvVar.f388305c != -1)) {
                        RecyclerView recyclerView = (RecyclerView) findViewById2;
                        if (dvVar.f388305c != -1) {
                            aVar = new C143201dr(dvVar);
                        } else {
                            aVar = new C143202ds(dvVar);
                        }
                        C0673gh b = dvVar.mo118226b(recyclerView, aVar);
                        if (b == null) {
                            findViewById2 = null;
                        } else {
                            findViewById2 = b.itemView;
                            int i2 = dvVar.f388306d;
                            if (!(i2 == -1 || (findViewById = findViewById2.findViewById(i2)) == null)) {
                                findViewById2 = findViewById;
                            }
                        }
                    }
                    if (findViewById2 == null) {
                        C143316a.m232511a("GH.ViewFocusInfo", (Throwable) null, "Restoring focus was desired, but couldn't find the View.");
                    } else if (findViewById2.requestFocus()) {
                        C143316a.m232516f("GH.ViewFocusInfo", "Restored focus synchronously");
                    } else {
                        C143316a.m232511a("GH.ViewFocusInfo", (Throwable) null, "Attempted to request focus on the desired View synchronously, but failed. This is normal. Will try asynchronously.");
                        findViewById2.getViewTreeObserver().addOnTouchModeChangeListener(new C143204du(findViewById2));
                    }
                }
            }
        }
        this.f388430c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}

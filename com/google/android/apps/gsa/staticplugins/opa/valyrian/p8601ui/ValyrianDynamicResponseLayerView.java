package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.apps.gsa.staticplugins.opa.util.C113853ch;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView */
/* compiled from: PG */
public class ValyrianDynamicResponseLayerView extends FrameLayout {

    /* renamed from: a */
    public boolean f316100a;

    /* renamed from: b */
    public boolean f316101b;

    /* renamed from: c */
    public int f316102c;

    /* renamed from: d */
    public C58833ax f316103d;

    /* renamed from: e */
    public C38802e f316104e;

    /* renamed from: f */
    public C68214a f316105f;

    /* renamed from: g */
    public Runnable f316106g;

    /* renamed from: h */
    public Runnable f316107h;

    /* renamed from: i */
    private boolean f316108i;

    /* renamed from: j */
    private int f316109j = 1;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView$a */
    /* compiled from: PG */
    public interface C114093a {
        /* renamed from: qS */
        void mo101063qS(ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView);
    }

    public ValyrianDynamicResponseLayerView(Context context) {
        super(context);
        m189161d();
    }

    /* renamed from: d */
    private final void m189161d() {
        ((C114093a) C47266f.m84076a(getContext(), C114093a.class)).mo101063qS(this);
    }

    /* renamed from: a */
    public final void mo101053a(int i) {
        if (this.f316109j != i) {
            C58976aa aaVar = C58975e.f156826a;
            C59081b.m91349a(C58979ad.MEDIUM, "stack size");
        }
        this.f316109j = i;
        requestLayout();
    }

    /* renamed from: b */
    public final boolean mo101054b() {
        return this.f316109j == 2;
    }

    /* renamed from: c */
    public final boolean mo101055c() {
        return this.f316109j == 1;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f316108i) {
            C58833ax axVar = this.f316103d;
            if (axVar != null && axVar.mo56113h()) {
                ((C89922b) axVar.mo56107c()).mo83757a();
                this.f316104e.mo41633g();
                this.f316108i = true;
            }
            C68214a aVar = this.f316105f;
            if (aVar != null) {
                ((C113853ch) aVar.mo27525b()).mo100699a();
            }
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
            this.f316100a = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            C58976aa aaVar = C58975e.f156826a;
            Runnable runnable = this.f316107h;
            if (runnable != null) {
                ((C114146p) runnable).f316431a.mo101194d();
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
        }
        return this.f316101b;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (mo101055c()) {
            setMeasuredDimension(getMeasuredWidth(), Math.min(getMeasuredHeight(), this.f316102c));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                Runnable runnable = this.f316106g;
                if (runnable != null) {
                    C58976aa aaVar = C58975e.f156826a;
                    ((C114145o) runnable).f316430a.mo101193c();
                }
                this.f316101b = false;
                return true;
            }
        } else if (this.f316101b) {
            C58976aa aaVar2 = C58975e.f156826a;
            return this.f316101b;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f316100a = z;
    }

    public final String toString() {
        return "heightCap=" + this.f316102c + " fullscreenMode=" + mo101054b() + " enableHeightCap=" + mo101055c();
    }

    public ValyrianDynamicResponseLayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m189161d();
    }

    public ValyrianDynamicResponseLayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m189161d();
    }
}

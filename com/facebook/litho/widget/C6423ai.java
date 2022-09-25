package com.facebook.litho.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.facebook.litho.C6132bm;
import com.facebook.litho.C6169cq;
import com.facebook.litho.LithoView;
import com.google.android.libraries.elements.interfaces.C21238ah;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.android.libraries.elements.p1714d.C20925du;
import com.google.android.libraries.elements.p1714d.C20927dw;
import com.google.protos.youtube.elements.C66205ds;
import com.google.protos.youtube.elements.C66206dt;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;

/* renamed from: com.facebook.litho.widget.ai */
/* compiled from: PG */
final class C6423ai extends HorizontalScrollView implements C6169cq {

    /* renamed from: a */
    public final LithoView f19068a;

    /* renamed from: b */
    public int f19069b;

    /* renamed from: c */
    public int f19070c;

    /* renamed from: d */
    public C6424aj f19071d;

    /* renamed from: e */
    public C20925du f19072e;

    /* renamed from: f */
    public C6551p f19073f;

    /* renamed from: g */
    private C6132bm f19074g;

    public C6423ai(Context context) {
        super(context);
        LithoView lithoView = new LithoView(context);
        this.f19068a = lithoView;
        addView(lithoView);
    }

    /* renamed from: a */
    public final void mo13143a(List list) {
        list.add(this.f19068a);
    }

    /* renamed from: b */
    public final C6132bm mo12667b() {
        return this.f19074g;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C6132bm bmVar = this.f19074g;
        if (bmVar != null) {
            bmVar.mo13114a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        C6551p pVar = this.f19073f;
        if (pVar != null) {
            pVar.mo13644a(this);
        }
    }

    public final void fling(int i) {
        super.fling(i);
        C6551p pVar = this.f19073f;
        if (pVar != null) {
            pVar.f19516b = true;
        }
    }

    /* renamed from: m */
    public final void mo12684m(C6132bm bmVar) {
        this.f19074g = bmVar;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        this.f19068a.measure(View.MeasureSpec.makeMeasureSpec(this.f19069b, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f19070c, 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f19071d != null) {
            C20925du duVar = this.f19072e;
            if (duVar != null) {
                int scrollX = getScrollX();
                int i5 = this.f19071d.f19075a;
                C21313t tVar = duVar.f58681a;
                C21357r rVar = duVar.f58682b;
                C21319z zVar = duVar.f58683c;
                float f = duVar.f58684d;
                CommandOuterClass$Command a = rVar.mo26862a();
                C21256az h = zVar.mo26806h();
                C21238ah g = zVar.mo26805g();
                C66205ds dsVar = (C66205ds) C66206dt.f180035d.createBuilder();
                dsVar.copyOnWrite();
                C66206dt dtVar = (C66206dt) dsVar.instance;
                dtVar.f180037a |= 1;
                dtVar.f180038b = ((float) scrollX) / f;
                C20927dw.m39354c(this, tVar, a, h, g, (C66206dt) dsVar.build());
            }
            this.f19071d.f19075a = getScrollX();
        }
        C6551p pVar = this.f19073f;
        if (pVar != null) {
            pVar.mo13645b(this);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C6551p pVar = this.f19073f;
        if (pVar != null) {
            pVar.mo13646c(this, motionEvent);
        }
        return onTouchEvent;
    }
}

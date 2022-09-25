package com.google.android.apps.gsa.staticplugins.avocado;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class Camera2SourcePreview extends ViewGroup {

    /* renamed from: a */
    public static final C59071e f263019a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.Camera2SourcePreview");

    /* renamed from: b */
    boolean f263020b;

    /* renamed from: c */
    public C94336w f263021c;

    /* renamed from: d */
    private int f263022d = 0;

    /* renamed from: e */
    private int f263023e = 0;

    /* renamed from: f */
    private final Context f263024f;

    public Camera2SourcePreview(Context context) {
        super(context);
        this.f263024f = context;
        this.f263020b = false;
        SurfaceView surfaceView = new SurfaceView(context);
        surfaceView.getHolder().addCallback(new C94270dv(this));
        addView(surfaceView);
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: a */
    public final void mo88350a(int i, int i2) {
        C58976aa aaVar = C58975e.f156826a;
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Size cannot be negative.");
        }
        this.f263022d = i;
        this.f263023e = i2;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        C58976aa aaVar = C58975e.f156826a;
        int i6 = this.f263022d;
        int i7 = 320;
        if (i6 == 0 || (i5 = this.f263023e) == 0) {
            i6 = 240;
        } else {
            i7 = i5;
        }
        int i8 = this.f263024f.getResources().getConfiguration().orientation;
        boolean z2 = i8 != 2 && i8 == 1;
        int i9 = true != z2 ? i6 : i7;
        if (true != z2) {
            i6 = i7;
        }
        int i10 = i3 - i;
        int i11 = (int) ((((float) i10) / ((float) i6)) * ((float) i9));
        int i12 = ((i4 - i2) - i11) / 2;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            C59104x b = f263019a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Preview2");
            int i14 = i11 + i12;
            ((C59052c) ((C59052c) b).mo56372aa(14397)).mo56359L("#onLayout 0, childTop : %d, childWidth %d, childHeight + childTop : %d", Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i14));
            getChildAt(i13).layout(0, i12, i10, i14);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.f263022d;
        if (i4 == 0 || (i3 = this.f263023e) == 0) {
            C58976aa aaVar = C58975e.f156826a;
            setMeasuredDimension(size, size2);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        double d = (double) size;
        double d2 = (double) i3;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = (double) i4;
        Double.isNaN(d3);
        setMeasuredDimension(size, (int) ((d * d2) / d3));
    }

    public Camera2SourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f263024f = context;
        this.f263020b = false;
        SurfaceView surfaceView = new SurfaceView(context);
        surfaceView.getHolder().addCallback(new C94270dv(this));
        addView(surfaceView);
        C58976aa aaVar = C58975e.f156826a;
    }
}

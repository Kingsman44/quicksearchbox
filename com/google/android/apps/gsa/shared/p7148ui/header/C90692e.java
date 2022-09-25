package com.google.android.apps.gsa.shared.p7148ui.header;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.p7148ui.C90714z;

/* renamed from: com.google.android.apps.gsa.shared.ui.header.e */
/* compiled from: PG */
public final class C90692e {

    /* renamed from: a */
    public boolean f253672a = false;

    /* renamed from: b */
    public int f253673b = 0;

    /* renamed from: c */
    public int f253674c = 0;

    /* renamed from: d */
    public int f253675d = 0;

    /* renamed from: e */
    public int f253676e = 0;

    /* renamed from: f */
    public int f253677f = 2;

    /* renamed from: g */
    public final Context f253678g;

    /* renamed from: h */
    public final ViewStub f253679h;

    /* renamed from: i */
    public final boolean f253680i;

    /* renamed from: j */
    public View f253681j;

    /* renamed from: k */
    public LayerDrawable f253682k;

    /* renamed from: l */
    public C90714z f253683l;

    /* renamed from: m */
    private boolean f253684m = false;

    public C90692e(Context context, ViewStub viewStub, boolean z) {
        this.f253678g = context;
        this.f253679h = viewStub;
        this.f253680i = z;
    }

    /* renamed from: a */
    public final void mo85008a(int i) {
        LayerDrawable layerDrawable;
        if (this.f253681j == null || (layerDrawable = this.f253682k) == null) {
            this.f253673b = i;
            return;
        }
        layerDrawable.setLayerInset(0, 0, 0, 0, this.f253675d);
        this.f253682k.setLayerInset(1, 0, i - this.f253675d, 0, 0);
        LayerDrawable layerDrawable2 = this.f253682k;
        int i2 = this.f253675d;
        layerDrawable2.setLayerInset(2, 0, i - i2, 0, i2 - this.f253676e);
        this.f253681j.setLayoutParams(new FrameLayout.LayoutParams(-1, i));
    }

    /* renamed from: b */
    public final void mo85009b(int i) {
        C90714z zVar = this.f253683l;
        if (zVar == null) {
            this.f253674c = i;
        } else if (i != zVar.f253748c) {
            zVar.f253748c = i;
            if (i != 0 && zVar.f253752g < (-i)) {
                zVar.mo85047k(0, 1);
            }
        }
    }

    /* renamed from: c */
    public final void mo85010c(boolean z) {
        View view = this.f253681j;
        if (view == null) {
            this.f253684m = true;
        } else if (this.f253672a != z || this.f253684m) {
            view.setVisibility(true != z ? 8 : 0);
            this.f253684m = false;
        }
        this.f253672a = z;
    }

    /* renamed from: d */
    public final void mo85011d(int i) {
        this.f253677f = i;
        C90714z zVar = this.f253683l;
        if (zVar != null) {
            zVar.mo85046j(i, false, true);
        }
    }
}

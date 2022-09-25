package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.slice.widget.SliceView;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.l */
/* compiled from: PG */
public final class C88682l {

    /* renamed from: a */
    public static final C59071e f239769a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.l");

    /* renamed from: b */
    public final RelativeLayout f239770b;

    /* renamed from: c */
    public C88683m f239771c;

    /* renamed from: d */
    public int f239772d = 1;

    public C88682l(Context context, SliceView sliceView) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f239770b = relativeLayout;
        relativeLayout.addView(sliceView);
        relativeLayout.addView(C88673c.m143429a(context));
        sliceView.mo8670e(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final RelativeLayout mo82368a() {
        for (int i = 0; i < this.f239770b.getChildCount(); i++) {
            View childAt = this.f239770b.getChildAt(i);
            if (childAt instanceof RelativeLayout) {
                return (RelativeLayout) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final SliceView mo82369b() {
        for (int i = 0; i < this.f239770b.getChildCount(); i++) {
            View childAt = this.f239770b.getChildAt(i);
            if (childAt instanceof SliceView) {
                return (SliceView) childAt;
            }
        }
        return null;
    }

    /* renamed from: c */
    static boolean m143464c(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0 || i2 == 1) {
            return false;
        } else {
            if (i2 == 2 || i2 == 3) {
                return true;
            }
            throw new AssertionError("Unknown SliceState: ".concat(i != 1 ? i != 2 ? i != 3 ? "ERRORED_BUT_NOT_SHOWN" : "ERROR_SHOWN" : "SLICE_SHOWN" : "SLICE_NOT_SHOWN"));
        }
    }
}

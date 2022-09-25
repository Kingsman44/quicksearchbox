package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.Gravity;
import android.widget.TextView;
import com.google.android.apps.gsa.sidekick.shared.util.C91961al;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.x */
/* compiled from: PG */
public final class C91948x extends C91936l {

    /* renamed from: c */
    private static final C59071e f256433c = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.ui.x");

    /* renamed from: a */
    public final TextView f256434a;

    /* renamed from: b */
    public final LayerDrawable f256435b;

    /* renamed from: d */
    private final String f256436d;

    public C91948x(TextView textView, LayerDrawable layerDrawable, String str) {
        super(layerDrawable, textView);
        this.f256434a = textView;
        this.f256435b = layerDrawable;
        this.f256436d = str;
    }

    /* renamed from: b */
    public static Rect m150881b(Drawable drawable, int i, boolean z, int i2) {
        int i3;
        int i4;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth == intrinsicHeight) {
            i3 = i;
            i4 = i3;
        } else {
            float f = ((float) intrinsicWidth) / ((float) intrinsicHeight);
            C58976aa aaVar = C58975e.f156826a;
            if (intrinsicWidth <= intrinsicHeight || !z) {
                i3 = (int) (((float) i) * f);
                i4 = i;
            } else {
                i4 = (int) (((float) i) / f);
                i3 = i;
            }
        }
        Rect rect = new Rect(0, i2, true != z ? i3 : i, i + i2);
        Rect rect2 = new Rect();
        Gravity.apply(17, i3, i4, rect, rect2);
        return rect2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo86637a(RuntimeException runtimeException) {
        C59104x c = f256433c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "WebIconImageSpan");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(runtimeException)).mo56372aa(11939)).mo56389s("Error drawing bitmap for: %s", this.f256436d);
        throw runtimeException;
    }

    /* renamed from: c */
    public static LayerDrawable m150882c(Context context, Drawable drawable, TextView textView, int i, int i2, boolean z, int i3) {
        int i4;
        LayerDrawable layerDrawable;
        int i5 = i - 1;
        if (i5 == 0 || i5 == 1 || i5 == 7) {
            i4 = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
            C58976aa aaVar = C58975e.f156826a;
        } else {
            i4 = C91961al.m150917a(context.getResources(), i);
            C58976aa aaVar2 = C58975e.f156826a;
        }
        int i6 = i4 - 2;
        Drawable mutate = drawable.mutate();
        if (i2 != 0) {
            mutate.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        }
        Rect b = m150881b(mutate, i6, z, 0);
        int width = (z || b.width() <= i6) ? i6 : b.width();
        if (i3 != 0) {
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.dark_bg);
            drawable2.setColorFilter(i3, PorterDuff.Mode.MULTIPLY);
            layerDrawable = new LayerDrawable(new Drawable[]{drawable2, mutate});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{mutate});
        }
        layerDrawable.setBounds(0, 0, width, i6);
        layerDrawable.setId(0, R.id.icon);
        mutate.setBounds(b);
        return layerDrawable;
    }
}

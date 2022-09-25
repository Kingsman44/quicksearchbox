package com.google.android.apps.gsa.shared.p7148ui.p7155g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.ui.g.c */
/* compiled from: PG */
public final class C90686c {

    /* renamed from: a */
    private static final C59071e f253605a = C59071e.m91332i("com.google.android.apps.gsa.shared.ui.g.c");

    /* renamed from: a */
    public static int m148055a(Context context, int i) {
        int i2;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i3 = 0;
        if (i == 4) {
            int i4 = displayMetrics.widthPixels;
            int c = m148057c(context, i4, false, 1);
            return Math.min(i4 - (c + c), resources.getDimensionPixelSize(R.dimen.feed_max_card_width));
        }
        if (i != 3) {
            i2 = resources.getDimensionPixelSize(R.dimen.card_width);
        } else if (resources.getBoolean(R.bool.assist_full_bleed)) {
            i2 = displayMetrics.widthPixels;
        } else {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.assist_card_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.lotic_card_side_margin);
            i2 = dimensionPixelSize + dimensionPixelSize2 + dimensionPixelSize2;
        }
        if (i2 <= 0) {
            int f = m148060f(context, i);
            int b = m148056b(context, displayMetrics.widthPixels, i);
            int i5 = displayMetrics.widthPixels - (b + b);
            i2 = f != 1 ? (i5 - ((f - 1) * resources.getDimensionPixelSize(R.dimen.columns_padding_inbetween))) / f : i5;
        }
        if (i == 2 || i == 3) {
            i3 = resources.getDimensionPixelSize(R.dimen.lotic_card_side_margin);
        }
        return i2 - (i3 + i3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m148056b(android.content.Context r5, int r6, int r7) {
        /*
            boolean r0 = m148059e(r5, r7)
            if (r0 == 0) goto L_0x0008
            r5 = 0
            return r5
        L_0x0008:
            android.content.res.Resources r0 = r5.getResources()
            r1 = 2131170248(0x7f0713c8, float:1.7954849E38)
            int r1 = r0.getDimensionPixelSize(r1)
            r2 = 2131166909(0x7f0706bd, float:1.7948077E38)
            int r2 = r0.getDimensionPixelSize(r2)
            int r5 = m148060f(r5, r7)
            r3 = 2131492949(0x7f0c0055, float:1.8609364E38)
            int r3 = r0.getInteger(r3)
            r4 = 3
            if (r7 == r4) goto L_0x0040
            if (r3 > 0) goto L_0x0035
            if (r7 != r4) goto L_0x002d
            goto L_0x0040
        L_0x002d:
            r7 = 2131166493(0x7f07051d, float:1.7947233E38)
            int r7 = r0.getDimensionPixelSize(r7)
            goto L_0x0050
        L_0x0035:
            int r5 = 100 - r3
            int r5 = r5 * r6
            int r5 = r5 / 200
            int r5 = java.lang.Math.max(r1, r5)
            return r5
        L_0x0040:
            r7 = 2131165717(0x7f070215, float:1.794566E38)
            int r7 = r0.getDimensionPixelSize(r7)
            r3 = 2131169622(0x7f071156, float:1.795358E38)
            int r0 = r0.getDimensionPixelSize(r3)
            int r0 = r0 + r0
            int r7 = r7 + r0
        L_0x0050:
            if (r7 <= 0) goto L_0x0061
            int r7 = r7 * r5
            int r5 = r5 + -1
            int r2 = r2 * r5
            int r7 = r7 + r2
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r5 = java.lang.Math.max(r1, r6)
            return r5
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c.m148056b(android.content.Context, int, int):int");
    }

    /* renamed from: c */
    public static int m148057c(Context context, int i, boolean z, int i2) {
        return m148056b(context, i, i2) - (z ? (int) Math.abs(context.getResources().getDimension(R.dimen.search_bg_9_baked_margin)) : 0);
    }

    /* renamed from: d */
    public static Point m148058d(Context context) {
        Point point = new Point();
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            try {
                displayManager.getDisplay(0).getRealSize(point);
            } catch (Error | Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f253605a.mo56225c()).mo56382g(e)).mo56372aa(11299)).mo56386p("Unable to get correct window size due to method error");
            }
        }
        return point;
    }

    /* renamed from: e */
    public static boolean m148059e(Context context, int i) {
        if (i == 3) {
            return context.getResources().getBoolean(R.bool.assist_full_bleed);
        }
        return context.getResources().getInteger(R.integer.content_width_percentage) == 100 && i == 2 && m148060f(context, i) == 1;
    }

    /* renamed from: f */
    private static int m148060f(Context context, int i) {
        if (i == 3) {
            return context.getResources().getInteger(R.integer.assist_column_count);
        }
        if (i != 4) {
            return context.getResources().getInteger(R.integer.cards_column_count);
        }
        return 1;
    }
}

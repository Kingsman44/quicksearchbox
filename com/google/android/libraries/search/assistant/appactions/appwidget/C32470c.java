package com.google.android.libraries.search.assistant.appactions.appwidget;

import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SizeF;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.search.assistant.appactions.appwidget.c */
/* compiled from: PG */
public final class C32470c {

    /* renamed from: a */
    public final Rect f87012a;

    /* renamed from: b */
    public final float f87013b;

    /* renamed from: c */
    private final int f87014c;

    /* renamed from: d */
    private final float f87015d;

    /* renamed from: e */
    private final SizeF f87016e;

    /* renamed from: f */
    private final SizeF f87017f;

    /* renamed from: g */
    private final float f87018g;

    /* renamed from: h */
    private final Context f87019h;

    public C32470c(int i, Context context) {
        float b = C32469b.m60262b(context, (float) i);
        this.f87013b = b;
        float f = b / 1.4f;
        this.f87018g = f;
        Rect defaultPaddingForWidget = AppWidgetHostView.getDefaultPaddingForWidget(context, new ComponentName(context.getPackageName(), BuildConfig.FLAVOR), new Rect());
        this.f87012a = new Rect((int) C32469b.m60262b(context, (float) defaultPaddingForWidget.left), (int) C32469b.m60262b(context, (float) defaultPaddingForWidget.top), (int) C32469b.m60262b(context, (float) defaultPaddingForWidget.right), (int) C32469b.m60262b(context, (float) defaultPaddingForWidget.bottom));
        this.f87019h = context;
        int i2 = context.getResources().getConfiguration().orientation;
        this.f87014c = i2;
        float f2 = i2 == 1 ? b / 5.0f : f / 5.0f;
        this.f87015d = f2;
        float f3 = 1.4f * f2;
        this.f87016e = new SizeF(f3, f2);
        this.f87017f = new SizeF(f2, f3);
    }

    /* renamed from: a */
    public final SizeF mo38086a(AppWidgetProviderInfo appWidgetProviderInfo) {
        SizeF sizeF;
        float f;
        float f2;
        float f3;
        float f4;
        int i = appWidgetProviderInfo.minWidth;
        int i2 = appWidgetProviderInfo.minHeight;
        float b = C32469b.m60262b(this.f87019h, (float) i);
        int i3 = this.f87012a.left;
        int i4 = this.f87012a.right;
        float b2 = C32469b.m60262b(this.f87019h, (float) i2);
        int i5 = this.f87012a.top;
        int i6 = this.f87012a.bottom;
        float max = Math.max(1.0f, (float) Math.ceil((double) (((b + ((float) i3)) + ((float) i4)) / this.f87015d)));
        float max2 = Math.max(1.0f, (float) Math.ceil((double) (((b2 + ((float) i5)) + ((float) i6)) / this.f87015d)));
        if (this.f87014c == 1) {
            sizeF = new SizeF(max * this.f87017f.getWidth(), max2 * this.f87017f.getHeight());
        } else {
            sizeF = new SizeF(max * this.f87016e.getWidth(), max2 * this.f87016e.getHeight());
        }
        if (Build.VERSION.SDK_INT < 31) {
            return sizeF;
        }
        int i7 = appWidgetProviderInfo.targetCellWidth;
        float width = sizeF.getWidth();
        if (i7 != 0) {
            if (this.f87014c == 1) {
                f4 = (float) i7;
                f3 = this.f87017f.getWidth();
            } else {
                f4 = (float) i7;
                f3 = this.f87016e.getWidth();
            }
            width = f3 * f4;
        }
        int i8 = appWidgetProviderInfo.targetCellHeight;
        float height = sizeF.getHeight();
        if (i8 != 0) {
            if (this.f87014c == 1) {
                f = (float) i8;
                f2 = this.f87017f.getHeight();
            } else {
                f = (float) i8;
                f2 = this.f87016e.getHeight();
            }
            height = f2 * f;
        }
        return new SizeF(width, height);
    }
}

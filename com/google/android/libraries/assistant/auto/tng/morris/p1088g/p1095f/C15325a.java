package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import android.util.SizeF;
import androidx.core.p094f.C1888a;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.a */
/* compiled from: PG */
public final class C15325a {

    /* renamed from: a */
    public final Rect f45994a;

    /* renamed from: b */
    public final float f45995b;

    /* renamed from: c */
    private final int f45996c;

    /* renamed from: d */
    private final float f45997d;

    /* renamed from: e */
    private final SizeF f45998e;

    /* renamed from: f */
    private final SizeF f45999f;

    /* renamed from: g */
    private final Context f46000g;

    public C15325a(int i, Context context) {
        float b = m31901b(context, (float) i);
        this.f45995b = b;
        Rect defaultPaddingForWidget = AppWidgetHostView.getDefaultPaddingForWidget(context, new ComponentName(context.getPackageName(), BuildConfig.FLAVOR), new Rect());
        this.f45994a = new Rect((int) m31901b(context, (float) defaultPaddingForWidget.left), (int) m31901b(context, (float) defaultPaddingForWidget.top), (int) m31901b(context, (float) defaultPaddingForWidget.right), (int) m31901b(context, (float) defaultPaddingForWidget.bottom));
        this.f46000g = context;
        int i2 = context.getResources().getConfiguration().orientation;
        this.f45996c = i2;
        float f = i2 == 1 ? b / 5.0f : (b / 5.0f) / 1.4f;
        this.f45997d = f;
        float f2 = 1.4f * f;
        this.f45998e = new SizeF(f2, f);
        this.f45999f = new SizeF(f, f2);
    }

    /* renamed from: a */
    public static float m31900a(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    public static float m31901b(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: c */
    public final SizeF mo22191c(AppWidgetProviderInfo appWidgetProviderInfo) {
        SizeF sizeF;
        float f;
        float f2;
        float f3;
        float f4;
        int i = appWidgetProviderInfo.minWidth;
        int i2 = appWidgetProviderInfo.minHeight;
        float b = m31901b(this.f46000g, (float) i);
        int i3 = this.f45994a.left;
        int i4 = this.f45994a.right;
        float b2 = m31901b(this.f46000g, (float) i2);
        int i5 = this.f45994a.top;
        int i6 = this.f45994a.bottom;
        float max = Math.max(1.0f, (float) Math.ceil((double) (((b + ((float) i3)) + ((float) i4)) / this.f45997d)));
        float max2 = Math.max(1.0f, (float) Math.ceil((double) (((b2 + ((float) i5)) + ((float) i6)) / this.f45997d)));
        if (this.f45996c == 1) {
            sizeF = new SizeF(max * this.f45999f.getWidth(), max2 * this.f45999f.getHeight());
        } else {
            sizeF = new SizeF(max * this.f45998e.getWidth(), max2 * this.f45998e.getHeight());
        }
        if (!C1888a.m5149c()) {
            return sizeF;
        }
        int i7 = appWidgetProviderInfo.targetCellWidth;
        float width = sizeF.getWidth();
        if (i7 != 0) {
            if (this.f45996c == 1) {
                f4 = (float) i7;
                f3 = this.f45999f.getWidth();
            } else {
                f4 = (float) i7;
                f3 = this.f45998e.getWidth();
            }
            width = f3 * f4;
        }
        int i8 = appWidgetProviderInfo.targetCellHeight;
        float height = sizeF.getHeight();
        if (i8 != 0) {
            if (this.f45996c == 1) {
                f = (float) i8;
                f2 = this.f45999f.getHeight();
            } else {
                f = (float) i8;
                f2 = this.f45998e.getHeight();
            }
            height = f2 * f;
        }
        return new SizeF(width, height);
    }
}

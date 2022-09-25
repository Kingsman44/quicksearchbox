package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import android.util.SizeF;
import androidx.core.p094f.C1888a;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.ao */
/* compiled from: PG */
public final class C120919ao {

    /* renamed from: a */
    public final Rect f336203a;

    /* renamed from: b */
    public final float f336204b;

    /* renamed from: c */
    private final int f336205c;

    /* renamed from: d */
    private final float f336206d;

    /* renamed from: e */
    private final SizeF f336207e;

    /* renamed from: f */
    private final SizeF f336208f;

    /* renamed from: g */
    private final Context f336209g;

    public C120919ao(int i, Context context) {
        float b = m200121b(context, (float) i);
        this.f336204b = b;
        Rect defaultPaddingForWidget = AppWidgetHostView.getDefaultPaddingForWidget(context, new ComponentName(context.getPackageName(), BuildConfig.FLAVOR), new Rect());
        this.f336203a = new Rect((int) m200121b(context, (float) defaultPaddingForWidget.left), (int) m200121b(context, (float) defaultPaddingForWidget.top), (int) m200121b(context, (float) defaultPaddingForWidget.right), (int) m200121b(context, (float) defaultPaddingForWidget.bottom));
        this.f336209g = context;
        int i2 = context.getResources().getConfiguration().orientation;
        this.f336205c = i2;
        float f = i2 == 1 ? b / 5.0f : (b / 5.0f) / 1.4f;
        this.f336206d = f;
        float f2 = 1.4f * f;
        this.f336207e = new SizeF(f2, f);
        this.f336208f = new SizeF(f, f2);
    }

    /* renamed from: a */
    public static float m200120a(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    public static float m200121b(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: c */
    public final SizeF mo104964c(AppWidgetProviderInfo appWidgetProviderInfo) {
        SizeF sizeF;
        float f;
        float f2;
        float f3;
        float f4;
        int i = appWidgetProviderInfo.minWidth;
        int i2 = appWidgetProviderInfo.minHeight;
        float b = m200121b(this.f336209g, (float) i);
        int i3 = this.f336203a.left;
        int i4 = this.f336203a.right;
        float b2 = m200121b(this.f336209g, (float) i2);
        int i5 = this.f336203a.top;
        int i6 = this.f336203a.bottom;
        float max = Math.max(1.0f, (float) Math.ceil((double) (((b + ((float) i3)) + ((float) i4)) / this.f336206d)));
        float max2 = Math.max(1.0f, (float) Math.ceil((double) (((b2 + ((float) i5)) + ((float) i6)) / this.f336206d)));
        if (this.f336205c == 1) {
            sizeF = new SizeF(max * this.f336208f.getWidth(), max2 * this.f336208f.getHeight());
        } else {
            sizeF = new SizeF(max * this.f336207e.getWidth(), max2 * this.f336207e.getHeight());
        }
        if (!C1888a.m5149c()) {
            return sizeF;
        }
        int i7 = appWidgetProviderInfo.targetCellWidth;
        float width = sizeF.getWidth();
        if (i7 != 0) {
            if (this.f336205c == 1) {
                f4 = (float) i7;
                f3 = this.f336208f.getWidth();
            } else {
                f4 = (float) i7;
                f3 = this.f336207e.getWidth();
            }
            width = f3 * f4;
        }
        int i8 = appWidgetProviderInfo.targetCellHeight;
        float height = sizeF.getHeight();
        if (i8 != 0) {
            if (this.f336205c == 1) {
                f = (float) i8;
                f2 = this.f336208f.getHeight();
            } else {
                f = (float) i8;
                f2 = this.f336207e.getHeight();
            }
            height = f2 * f;
        }
        return new SizeF(width, height);
    }
}

package androidx.media3.p174ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* renamed from: androidx.media3.ui.b */
/* compiled from: PG */
public final class C3638b {

    /* renamed from: a */
    public static final C3638b f11697a = new C3638b(-1, -16777216, 0, 0, -1, (Typeface) null);

    /* renamed from: b */
    public final int f11698b;

    /* renamed from: c */
    public final int f11699c;

    /* renamed from: d */
    public final int f11700d;

    /* renamed from: e */
    public final int f11701e;

    /* renamed from: f */
    public final int f11702f;

    /* renamed from: g */
    public final Typeface f11703g;

    public C3638b(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f11698b = i;
        this.f11699c = i2;
        this.f11700d = i3;
        this.f11701e = i4;
        this.f11702f = i5;
        this.f11703g = typeface;
    }

    /* renamed from: a */
    public static C3638b m10522a(CaptioningManager.CaptionStyle captionStyle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (captionStyle.hasForegroundColor()) {
            i = captionStyle.foregroundColor;
        } else {
            i = f11697a.f11698b;
        }
        int i6 = i;
        if (captionStyle.hasBackgroundColor()) {
            i2 = captionStyle.backgroundColor;
        } else {
            i2 = f11697a.f11699c;
        }
        int i7 = i2;
        if (captionStyle.hasWindowColor()) {
            i3 = captionStyle.windowColor;
        } else {
            i3 = f11697a.f11700d;
        }
        int i8 = i3;
        if (captionStyle.hasEdgeType()) {
            i4 = captionStyle.edgeType;
        } else {
            i4 = f11697a.f11701e;
        }
        int i9 = i4;
        if (captionStyle.hasEdgeColor()) {
            i5 = captionStyle.edgeColor;
        } else {
            i5 = f11697a.f11702f;
        }
        return new C3638b(i6, i7, i8, i9, i5, captionStyle.getTypeface());
    }
}

package androidx.swiperefreshlayout.widget;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.swiperefreshlayout.widget.d */
/* compiled from: PG */
final class C4175d {

    /* renamed from: a */
    final RectF f13539a = new RectF();

    /* renamed from: b */
    final Paint f13540b;

    /* renamed from: c */
    final Paint f13541c;

    /* renamed from: d */
    final Paint f13542d;

    /* renamed from: e */
    float f13543e;

    /* renamed from: f */
    float f13544f;

    /* renamed from: g */
    float f13545g;

    /* renamed from: h */
    float f13546h;

    /* renamed from: i */
    int[] f13547i;

    /* renamed from: j */
    int f13548j;

    /* renamed from: k */
    float f13549k;

    /* renamed from: l */
    float f13550l;

    /* renamed from: m */
    float f13551m;

    /* renamed from: n */
    boolean f13552n;

    /* renamed from: o */
    Path f13553o;

    /* renamed from: p */
    float f13554p;

    /* renamed from: q */
    float f13555q;

    /* renamed from: r */
    int f13556r;

    /* renamed from: s */
    int f13557s;

    /* renamed from: t */
    int f13558t;

    /* renamed from: u */
    int f13559u;

    public C4175d() {
        Paint paint = new Paint();
        this.f13540b = paint;
        Paint paint2 = new Paint();
        this.f13541c = paint2;
        Paint paint3 = new Paint();
        this.f13542d = paint3;
        this.f13543e = 0.0f;
        this.f13544f = 0.0f;
        this.f13545g = 0.0f;
        this.f13546h = 5.0f;
        this.f13554p = 1.0f;
        this.f13558t = PrivateKeyType.INVALID;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo8825a() {
        return (this.f13548j + 1) % this.f13547i.length;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8826b() {
        this.f13549k = 0.0f;
        this.f13550l = 0.0f;
        this.f13551m = 0.0f;
        this.f13543e = 0.0f;
        this.f13544f = 0.0f;
        this.f13545g = 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8827c(int i) {
        this.f13548j = i;
        this.f13559u = this.f13547i[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8828d(int[] iArr) {
        this.f13547i = iArr;
        mo8827c(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8829e(boolean z) {
        if (this.f13552n != z) {
            this.f13552n = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo8830f(float f) {
        this.f13546h = f;
        this.f13540b.setStrokeWidth(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo8831g() {
        this.f13549k = this.f13543e;
        this.f13550l = this.f13544f;
        this.f13551m = this.f13545g;
    }
}

package androidx.p198v.p199a.p200a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.v.a.a.r */
/* compiled from: PG */
final class C4259r extends Drawable.ConstantState {

    /* renamed from: a */
    int f13750a;

    /* renamed from: b */
    C4258q f13751b;

    /* renamed from: c */
    ColorStateList f13752c;

    /* renamed from: d */
    PorterDuff.Mode f13753d;

    /* renamed from: e */
    boolean f13754e;

    /* renamed from: f */
    Bitmap f13755f;

    /* renamed from: g */
    ColorStateList f13756g;

    /* renamed from: h */
    PorterDuff.Mode f13757h;

    /* renamed from: i */
    int f13758i;

    /* renamed from: j */
    boolean f13759j;

    /* renamed from: k */
    boolean f13760k;

    /* renamed from: l */
    Paint f13761l;

    public C4259r() {
        this.f13752c = null;
        this.f13753d = C4261t.f13763a;
        this.f13751b = new C4258q();
    }

    /* renamed from: a */
    public final void mo9050a(int i, int i2) {
        this.f13755f.eraseColor(0);
        Canvas canvas = new Canvas(this.f13755f);
        C4258q qVar = this.f13751b;
        qVar.mo9045b(qVar.f13736d, C4258q.f13733a, canvas, i, i2);
    }

    public int getChangingConfigurations() {
        return this.f13750a;
    }

    public final Drawable newDrawable() {
        return new C4261t(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new C4261t(this);
    }

    public C4259r(C4259r rVar) {
        this.f13752c = null;
        this.f13753d = C4261t.f13763a;
        if (rVar != null) {
            this.f13750a = rVar.f13750a;
            this.f13751b = new C4258q(rVar.f13751b);
            Paint paint = rVar.f13751b.f13735c;
            if (paint != null) {
                this.f13751b.f13735c = new Paint(paint);
            }
            Paint paint2 = rVar.f13751b.f13734b;
            if (paint2 != null) {
                this.f13751b.f13734b = new Paint(paint2);
            }
            this.f13752c = rVar.f13752c;
            this.f13753d = rVar.f13753d;
            this.f13754e = rVar.f13754e;
        }
    }
}

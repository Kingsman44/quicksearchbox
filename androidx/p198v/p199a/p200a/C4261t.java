package androidx.p198v.p199a.p200a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.p091b.C1854c;
import androidx.core.content.p091b.C1874w;
import androidx.core.content.p091b.C1875x;
import androidx.core.graphics.C1941g;
import androidx.core.graphics.drawable.C1928a;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.graphics.drawable.C1930c;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.v.a.a.t */
/* compiled from: PG */
public final class C4261t extends C4252k {

    /* renamed from: a */
    static final PorterDuff.Mode f13763a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public C4259r f13764b;

    /* renamed from: d */
    public boolean f13765d;

    /* renamed from: e */
    private PorterDuffColorFilter f13766e;

    /* renamed from: f */
    private ColorFilter f13767f;

    /* renamed from: g */
    private boolean f13768g;

    /* renamed from: h */
    private final float[] f13769h;

    /* renamed from: i */
    private final Matrix f13770i;

    /* renamed from: j */
    private final Rect f13771j;

    public C4261t() {
        this.f13765d = true;
        this.f13769h = new float[9];
        this.f13770i = new Matrix();
        this.f13771j = new Rect();
        this.f13764b = new C4259r();
    }

    /* renamed from: a */
    static int m12179a(int i, float f) {
        return (((int) (((float) Color.alpha(i)) * f)) << 24) | (16777215 & i);
    }

    /* renamed from: b */
    public static C4261t m12180b(Resources resources, int i, Resources.Theme theme) {
        C4261t tVar = new C4261t();
        tVar.f13703c = C1874w.m5109f(resources, i, theme);
        return tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final PorterDuffColorFilter mo9059c(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f13703c;
        if (drawable == null) {
            return false;
        }
        C1929b.m5228i(drawable);
        return false;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f13771j);
        if (this.f13771j.width() > 0 && this.f13771j.height() > 0) {
            ColorFilter colorFilter = this.f13767f;
            if (colorFilter == null) {
                colorFilter = this.f13766e;
            }
            canvas.getMatrix(this.f13770i);
            this.f13770i.getValues(this.f13769h);
            float abs = Math.abs(this.f13769h[0]);
            float abs2 = Math.abs(this.f13769h[4]);
            float abs3 = Math.abs(this.f13769h[1]);
            float abs4 = Math.abs(this.f13769h[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int width = this.f13771j.width();
            int height = this.f13771j.height();
            int min = Math.min(2048, (int) (((float) width) * abs));
            int min2 = Math.min(2048, (int) (((float) height) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f13771j.left, (float) this.f13771j.top);
                if (isAutoMirrored() && C1930c.m5229a(this) == 1) {
                    canvas.translate((float) this.f13771j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f13771j.offsetTo(0, 0);
                C4259r rVar = this.f13764b;
                Bitmap bitmap = rVar.f13755f;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == rVar.f13755f.getHeight())) {
                    rVar.f13755f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    rVar.f13760k = true;
                }
                if (!this.f13765d) {
                    this.f13764b.mo9050a(min, min2);
                } else {
                    C4259r rVar2 = this.f13764b;
                    if (!(!rVar2.f13760k && rVar2.f13756g == rVar2.f13752c && rVar2.f13757h == rVar2.f13753d && rVar2.f13759j == rVar2.f13754e && rVar2.f13758i == rVar2.f13751b.getRootAlpha())) {
                        this.f13764b.mo9050a(min, min2);
                        C4259r rVar3 = this.f13764b;
                        rVar3.f13756g = rVar3.f13752c;
                        rVar3.f13757h = rVar3.f13753d;
                        rVar3.f13758i = rVar3.f13751b.getRootAlpha();
                        rVar3.f13759j = rVar3.f13754e;
                        rVar3.f13760k = false;
                    }
                }
                C4259r rVar4 = this.f13764b;
                Rect rect = this.f13771j;
                if (rVar4.f13751b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (rVar4.f13761l == null) {
                        rVar4.f13761l = new Paint();
                        rVar4.f13761l.setFilterBitmap(true);
                    }
                    rVar4.f13761l.setAlpha(rVar4.f13751b.getRootAlpha());
                    rVar4.f13761l.setColorFilter(colorFilter);
                    paint = rVar4.f13761l;
                }
                canvas.drawBitmap(rVar4.f13755f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return C1928a.m5215a(drawable);
        }
        return this.f13764b.f13751b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f13764b.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f13703c;
        return drawable != null ? C1929b.m5220a(drawable) : this.f13767f;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f13764b.f13751b.f13738f;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f13764b.f13751b.f13737e;
    }

    public final int getOpacity() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return C1928a.m5219e(drawable);
        }
        return this.f13764b.f13754e;
    }

    public final boolean isStateful() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C4259r rVar = this.f13764b;
        if (rVar != null) {
            if (rVar.f13751b.mo9044a()) {
                return true;
            }
            ColorStateList colorStateList = this.f13764b.f13752c;
            return colorStateList != null && colorStateList.isStateful();
        }
        return false;
    }

    public final Drawable mutate() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f13768g && super.mutate() == this) {
            this.f13764b = new C4259r(this.f13764b);
            this.f13768g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C4259r rVar = this.f13764b;
        ColorStateList colorStateList = rVar.f13752c;
        boolean z = false;
        if (!(colorStateList == null || (mode = rVar.f13753d) == null)) {
            this.f13766e = mo9059c(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (rVar.f13751b.mo9044a()) {
            boolean c = rVar.f13751b.f13736d.mo9007c(iArr);
            rVar.f13760k |= c;
            if (c) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f13764b.f13751b.getRootAlpha() != i) {
            this.f13764b.f13751b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            C1928a.m5218d(drawable, z);
        } else {
            this.f13764b.f13754e = z;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f13767f = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            C1929b.m5225f(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            C1929b.m5226g(drawable, colorStateList);
            return;
        }
        C4259r rVar = this.f13764b;
        if (rVar.f13752c != colorStateList) {
            rVar.f13752c = colorStateList;
            this.f13766e = mo9059c(colorStateList, rVar.f13753d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            C1929b.m5227h(drawable, mode);
            return;
        }
        C4259r rVar = this.f13764b;
        if (rVar.f13753d != mode) {
            rVar.f13753d = mode;
            this.f13766e = mo9059c(rVar.f13752c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return new C4260s(drawable.getConstantState());
        }
        this.f13764b.f13750a = getChangingConfigurations();
        return this.f13764b;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ColorStateList colorStateList;
        int i;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            C1929b.m5222c(drawable, resources2, xmlPullParser2, attributeSet2, theme2);
            return;
        }
        C4259r rVar = this.f13764b;
        rVar.f13751b = new C4258q();
        TypedArray d = C1875x.m5117d(resources2, theme2, attributeSet2, C4242a.f13682a);
        C4259r rVar2 = this.f13764b;
        C4258q qVar = rVar2.f13751b;
        int c = C1875x.m5116c(d, xmlPullParser2, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i2 = 3;
        if (c == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (c == 5) {
            mode = PorterDuff.Mode.SRC_IN;
        } else if (c != 9) {
            switch (c) {
                case 14:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.ADD;
                    break;
            }
        } else {
            mode = PorterDuff.Mode.SRC_ATOP;
        }
        rVar2.f13753d = mode;
        int i3 = 1;
        if (C1875x.m5120g(xmlPullParser2, "tint")) {
            TypedValue typedValue = new TypedValue();
            d.getValue(1, typedValue);
            if (typedValue.type == 2) {
                new StringBuilder("Failed to resolve attribute at index 1: ").append(typedValue);
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(typedValue.toString()));
            } else if (typedValue.type < 28 || typedValue.type > 31) {
                colorStateList = C1854c.m5082c(d.getResources(), d.getResourceId(1, 0), theme2);
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            rVar2.f13752c = colorStateList;
        }
        boolean z = rVar2.f13754e;
        if (C1875x.m5120g(xmlPullParser2, "autoMirrored")) {
            z = d.getBoolean(5, z);
        }
        rVar2.f13754e = z;
        qVar.f13739g = C1875x.m5114a(d, xmlPullParser2, "viewportWidth", 7, qVar.f13739g);
        float a = C1875x.m5114a(d, xmlPullParser2, "viewportHeight", 8, qVar.f13740h);
        qVar.f13740h = a;
        if (qVar.f13739g <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(d.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        } else if (a > 0.0f) {
            qVar.f13737e = d.getDimension(3, qVar.f13737e);
            float dimension = d.getDimension(2, qVar.f13738f);
            qVar.f13738f = dimension;
            if (qVar.f13737e <= 0.0f) {
                throw new XmlPullParserException(String.valueOf(d.getPositionDescription()).concat("<vector> tag requires width > 0"));
            } else if (dimension > 0.0f) {
                qVar.setAlpha(C1875x.m5114a(d, xmlPullParser2, "alpha", 4, qVar.getAlpha()));
                String string = d.getString(0);
                if (string != null) {
                    qVar.f13742j = string;
                    qVar.f13744l.put(string, qVar);
                }
                d.recycle();
                rVar.f13750a = getChangingConfigurations();
                rVar.f13760k = true;
                C4259r rVar3 = this.f13764b;
                C4258q qVar2 = rVar3.f13751b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(qVar2.f13736d);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != i3 && (xmlPullParser.getDepth() >= depth || eventType != i2)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C4255n nVar = (C4255n) arrayDeque.peek();
                        if (nVar == null) {
                            i = depth;
                        } else if ("path".equals(name)) {
                            C4254m mVar = new C4254m();
                            TypedArray d2 = C1875x.m5117d(resources2, theme2, attributeSet2, C4242a.f13684c);
                            mVar.f13704a = null;
                            if (!C1875x.m5120g(xmlPullParser2, "pathData")) {
                                i = depth;
                            } else {
                                String string2 = d2.getString(0);
                                if (string2 != null) {
                                    mVar.f13730n = string2;
                                }
                                String string3 = d2.getString(2);
                                if (string3 != null) {
                                    mVar.f13729m = C1941g.m5255a(string3);
                                }
                                mVar.f13707d = C1875x.m5124k(d2, xmlPullParser2, theme2, "fillColor", 1);
                                i = depth;
                                mVar.f13709f = C1875x.m5114a(d2, xmlPullParser2, "fillAlpha", 12, mVar.f13709f);
                                int c2 = C1875x.m5116c(d2, xmlPullParser2, "strokeLineCap", 8, -1);
                                Paint.Cap cap = mVar.f13713j;
                                if (c2 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (c2 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (c2 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                mVar.f13713j = cap;
                                int c3 = C1875x.m5116c(d2, xmlPullParser2, "strokeLineJoin", 9, -1);
                                Paint.Join join = mVar.f13714k;
                                if (c3 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (c3 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (c3 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                mVar.f13714k = join;
                                mVar.f13715l = C1875x.m5114a(d2, xmlPullParser2, "strokeMiterLimit", 10, mVar.f13715l);
                                mVar.f13705b = C1875x.m5124k(d2, xmlPullParser2, theme2, "strokeColor", 3);
                                mVar.f13708e = C1875x.m5114a(d2, xmlPullParser2, "strokeAlpha", 11, mVar.f13708e);
                                mVar.f13706c = C1875x.m5114a(d2, xmlPullParser2, "strokeWidth", 4, mVar.f13706c);
                                mVar.f13711h = C1875x.m5114a(d2, xmlPullParser2, "trimPathEnd", 6, mVar.f13711h);
                                mVar.f13712i = C1875x.m5114a(d2, xmlPullParser2, "trimPathOffset", 7, mVar.f13712i);
                                mVar.f13710g = C1875x.m5114a(d2, xmlPullParser2, "trimPathStart", 5, mVar.f13710g);
                                mVar.f13731o = C1875x.m5116c(d2, xmlPullParser2, "fillType", 13, mVar.f13731o);
                            }
                            d2.recycle();
                            nVar.f13717b.add(mVar);
                            if (mVar.getPathName() != null) {
                                qVar2.f13744l.put(mVar.getPathName(), mVar);
                            }
                            int i4 = rVar3.f13750a;
                            z2 = false;
                        } else {
                            i = depth;
                            if ("clip-path".equals(name)) {
                                C4253l lVar = new C4253l();
                                if (C1875x.m5120g(xmlPullParser2, "pathData")) {
                                    TypedArray d3 = C1875x.m5117d(resources2, theme2, attributeSet2, C4242a.f13685d);
                                    String string4 = d3.getString(0);
                                    if (string4 != null) {
                                        lVar.f13730n = string4;
                                    }
                                    String string5 = d3.getString(1);
                                    if (string5 != null) {
                                        lVar.f13729m = C1941g.m5255a(string5);
                                    }
                                    lVar.f13731o = C1875x.m5116c(d3, xmlPullParser2, "fillType", 2, 0);
                                    d3.recycle();
                                }
                                nVar.f13717b.add(lVar);
                                if (lVar.getPathName() != null) {
                                    qVar2.f13744l.put(lVar.getPathName(), lVar);
                                }
                                int i5 = rVar3.f13750a;
                            } else if ("group".equals(name)) {
                                C4255n nVar2 = new C4255n();
                                TypedArray d4 = C1875x.m5117d(resources2, theme2, attributeSet2, C4242a.f13683b);
                                nVar2.f13727l = null;
                                nVar2.f13718c = C1875x.m5114a(d4, xmlPullParser2, "rotation", 5, nVar2.f13718c);
                                nVar2.f13719d = d4.getFloat(1, nVar2.f13719d);
                                nVar2.f13720e = d4.getFloat(2, nVar2.f13720e);
                                nVar2.f13721f = C1875x.m5114a(d4, xmlPullParser2, "scaleX", 3, nVar2.f13721f);
                                nVar2.f13722g = C1875x.m5114a(d4, xmlPullParser2, "scaleY", 4, nVar2.f13722g);
                                nVar2.f13723h = C1875x.m5114a(d4, xmlPullParser2, "translateX", 6, nVar2.f13723h);
                                nVar2.f13724i = C1875x.m5114a(d4, xmlPullParser2, "translateY", 7, nVar2.f13724i);
                                String string6 = d4.getString(0);
                                if (string6 != null) {
                                    nVar2.f13728m = string6;
                                }
                                nVar2.mo9024a();
                                d4.recycle();
                                nVar.f13717b.add(nVar2);
                                arrayDeque.push(nVar2);
                                if (nVar2.getGroupName() != null) {
                                    qVar2.f13744l.put(nVar2.getGroupName(), nVar2);
                                }
                                int i6 = rVar3.f13750a;
                            }
                        }
                    } else {
                        i = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i;
                    i3 = 1;
                    i2 = 3;
                }
                if (!z2) {
                    this.f13766e = mo9059c(rVar.f13752c, rVar.f13753d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(String.valueOf(d.getPositionDescription()).concat("<vector> tag requires height > 0"));
            }
        } else {
            throw new XmlPullParserException(String.valueOf(d.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
        }
    }

    public C4261t(C4259r rVar) {
        this.f13765d = true;
        this.f13769h = new float[9];
        this.f13770i = new Matrix();
        this.f13771j = new Rect();
        this.f13764b = rVar;
        this.f13766e = mo9059c(rVar.f13752c, rVar.f13753d);
    }
}

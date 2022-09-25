package androidx.p198v.p199a.p200a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.p091b.C1874w;
import androidx.core.content.p091b.C1875x;
import androidx.core.graphics.drawable.C1928a;
import androidx.core.graphics.drawable.C1929b;
import androidx.p060c.C0977g;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.v.a.a.i */
/* compiled from: PG */
public final class C4250i extends C4252k implements Animatable {

    /* renamed from: a */
    ArrayList f13698a;

    /* renamed from: b */
    final Drawable.Callback f13699b;

    /* renamed from: d */
    private final C4247f f13700d;

    /* renamed from: e */
    private final Context f13701e;

    /* renamed from: f */
    private Animator.AnimatorListener f13702f;

    public C4250i() {
        this((Context) null);
    }

    /* renamed from: a */
    public static C4250i m12163a(Context context, int i) {
        C4250i iVar = new C4250i(context);
        Drawable f = C1874w.m5109f(context.getResources(), i, context.getTheme());
        f.setCallback(iVar.f13699b);
        new C4248g(f.getConstantState());
        iVar.f13703c = f;
        return iVar;
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            C1929b.m5221b(drawable, theme);
        }
    }

    /* renamed from: b */
    public final void mo8962b(C4244c cVar) {
        if (cVar != null) {
            Drawable drawable = this.f13703c;
            if (drawable != null) {
                C4249h.m12161b((AnimatedVectorDrawable) drawable, cVar.mo8945a());
                return;
            }
            if (this.f13698a == null) {
                this.f13698a = new ArrayList();
            }
            if (!this.f13698a.contains(cVar)) {
                this.f13698a.add(cVar);
                if (this.f13702f == null) {
                    this.f13702f = new C4246e(this);
                }
                this.f13700d.f13694c.addListener(this.f13702f);
            }
        }
    }

    /* renamed from: c */
    public final void mo8963c(C4244c cVar) {
        Animator.AnimatorListener animatorListener;
        if (cVar != null) {
            Drawable drawable = this.f13703c;
            if (drawable != null) {
                C4249h.m12162c((AnimatedVectorDrawable) drawable, cVar.mo8945a());
            }
            ArrayList arrayList = this.f13698a;
            if (arrayList != null) {
                arrayList.remove(cVar);
                if (this.f13698a.size() == 0 && (animatorListener = this.f13702f) != null) {
                    this.f13700d.f13694c.removeListener(animatorListener);
                    this.f13702f = null;
                }
            }
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return C1929b.m5228i(drawable);
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f13700d.f13693b.draw(canvas);
        if (this.f13700d.f13694c.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return C1928a.m5215a(drawable);
        }
        return this.f13700d.f13693b.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        int i = this.f13700d.f13692a;
        return changingConfigurations;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return C1929b.m5220a(drawable);
        }
        return this.f13700d.f13693b.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return new C4248g(drawable.getConstantState());
        }
        return null;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f13700d.f13693b.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f13700d.f13693b.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f13700d.f13693b.getOpacity();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return C1928a.m5219e(drawable);
        }
        return this.f13700d.f13693b.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f13700d.f13694c.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f13700d.f13693b.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f13700d.f13693b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f13700d.f13693b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f13700d.f13693b.setState(iArr);
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f13700d.f13693b.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            C1928a.m5218d(drawable, z);
        } else {
            this.f13700d.f13693b.setAutoMirrored(z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f13700d.f13693b.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            C1929b.m5225f(drawable, i);
        } else {
            this.f13700d.f13693b.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            C1929b.m5226g(drawable, colorStateList);
        } else {
            this.f13700d.f13693b.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            C1929b.m5227h(drawable, mode);
        } else {
            this.f13700d.f13693b.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f13700d.f13693b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final void start() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f13700d.f13694c.isStarted()) {
            this.f13700d.f13694c.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f13700d.f13694c.end();
        }
    }

    public C4250i(Context context) {
        this.f13702f = null;
        this.f13698a = null;
        this.f13699b = new C4245d(this);
        this.f13701e = context;
        this.f13700d = new C4247f();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f13703c;
        if (drawable != null) {
            C1929b.m5222c(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray d = C1875x.m5117d(resources, theme, attributeSet, C4242a.f13686e);
                    int resourceId = d.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C4261t b = C4261t.m12180b(resources, resourceId, theme);
                        b.f13765d = false;
                        b.setCallback(this.f13699b);
                        C4261t tVar = this.f13700d.f13693b;
                        if (tVar != null) {
                            tVar.setCallback((Drawable.Callback) null);
                        }
                        this.f13700d.f13693b = b;
                    }
                    d.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C4242a.f13687f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f13701e;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(this.f13700d.f13693b.f13764b.f13751b.f13744l.get(string));
                            C4247f fVar = this.f13700d;
                            if (fVar.f13695d == null) {
                                fVar.f13695d = new ArrayList();
                                this.f13700d.f13696e = new C0977g();
                            }
                            this.f13700d.f13695d.add(loadAnimator);
                            this.f13700d.f13696e.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        C4247f fVar2 = this.f13700d;
        if (fVar2.f13694c == null) {
            fVar2.f13694c = new AnimatorSet();
        }
        fVar2.f13694c.playTogether(fVar2.f13695d);
    }
}

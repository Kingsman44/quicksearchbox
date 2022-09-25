package androidx.p198v.p199a.p200a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: androidx.v.a.a.s */
/* compiled from: PG */
final class C4260s extends Drawable.ConstantState {

    /* renamed from: a */
    private final Drawable.ConstantState f13762a;

    public C4260s(Drawable.ConstantState constantState) {
        this.f13762a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f13762a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.f13762a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        C4261t tVar = new C4261t();
        tVar.f13703c = (VectorDrawable) this.f13762a.newDrawable();
        return tVar;
    }

    public final Drawable newDrawable(Resources resources) {
        C4261t tVar = new C4261t();
        tVar.f13703c = (VectorDrawable) this.f13762a.newDrawable(resources);
        return tVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C4261t tVar = new C4261t();
        tVar.f13703c = (VectorDrawable) this.f13762a.newDrawable(resources, theme);
        return tVar;
    }
}

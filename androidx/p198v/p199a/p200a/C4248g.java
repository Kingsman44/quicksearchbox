package androidx.p198v.p199a.p200a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.v.a.a.g */
/* compiled from: PG */
final class C4248g extends Drawable.ConstantState {

    /* renamed from: a */
    private final Drawable.ConstantState f13697a;

    public C4248g(Drawable.ConstantState constantState) {
        this.f13697a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f13697a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.f13697a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        C4250i iVar = new C4250i((Context) null);
        iVar.f13703c = this.f13697a.newDrawable();
        iVar.f13703c.setCallback(iVar.f13699b);
        return iVar;
    }

    public final Drawable newDrawable(Resources resources) {
        C4250i iVar = new C4250i((Context) null);
        iVar.f13703c = this.f13697a.newDrawable(resources);
        iVar.f13703c.setCallback(iVar.f13699b);
        return iVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C4250i iVar = new C4250i((Context) null);
        iVar.f13703c = this.f13697a.newDrawable(resources, theme);
        iVar.f13703c.setCallback(iVar.f13699b);
        return iVar;
    }
}

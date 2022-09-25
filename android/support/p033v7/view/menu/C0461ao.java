package android.support.p033v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.p087b.p088a.C1842c;

/* renamed from: android.support.v7.view.menu.ao */
/* compiled from: PG */
final class C0461ao extends C0455ai implements SubMenu {

    /* renamed from: d */
    private final C1842c f1588d;

    public C0461ao(Context context, C1842c cVar) {
        super(context, cVar);
        this.f1588d = cVar;
    }

    public final void clearHeader() {
        this.f1588d.clearHeader();
    }

    public final MenuItem getItem() {
        return mo1614a(this.f1588d.getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        this.f1588d.setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        this.f1588d.setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.f1588d.setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.f1588d.setIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f1588d.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1588d.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f1588d.setIcon(drawable);
        return this;
    }
}

package android.support.p033v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.p087b.p088a.C1841b;
import androidx.core.p098j.C2089d;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.view.menu.z */
/* compiled from: PG */
public final class C0486z extends C0465e implements MenuItem {

    /* renamed from: d */
    public final C1841b f1716d;

    /* renamed from: e */
    public Method f1717e;

    public C0486z(Context context, C1841b bVar) {
        super(context);
        if (bVar != null) {
            this.f1716d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.f1716d.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.f1716d.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        C2089d a = this.f1716d.mo1461a();
        if (a instanceof C0481u) {
            return ((C0481u) a).f1708a;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.f1716d.getActionView();
        return actionView instanceof C0483w ? (View) ((C0483w) actionView).f1711a : actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f1716d.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.f1716d.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.f1716d.getContentDescription();
    }

    public final int getGroupId() {
        return this.f1716d.getGroupId();
    }

    public final Drawable getIcon() {
        return this.f1716d.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.f1716d.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f1716d.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.f1716d.getIntent();
    }

    public final int getItemId() {
        return this.f1716d.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1716d.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.f1716d.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.f1716d.getNumericShortcut();
    }

    public final int getOrder() {
        return this.f1716d.getOrder();
    }

    public final SubMenu getSubMenu() {
        return mo1615b(this.f1716d.getSubMenu());
    }

    public final CharSequence getTitle() {
        return this.f1716d.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.f1716d.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f1716d.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.f1716d.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.f1716d.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.f1716d.isCheckable();
    }

    public final boolean isChecked() {
        return this.f1716d.isChecked();
    }

    public final boolean isEnabled() {
        return this.f1716d.isEnabled();
    }

    public final boolean isVisible() {
        return this.f1716d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        C0482v vVar = new C0482v(this, actionProvider);
        C1841b bVar = this.f1716d;
        if (actionProvider == null) {
            vVar = null;
        }
        bVar.mo1463c(vVar);
        return this;
    }

    public final MenuItem setActionView(int i) {
        this.f1716d.setActionView(i);
        View actionView = this.f1716d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1716d.setActionView((View) new C0483w(actionView));
        }
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f1716d.setAlphabeticShortcut(c);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f1716d.setCheckable(z);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f1716d.setChecked(z);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f1716d.mo1462b(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f1716d.setEnabled(z);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f1716d.setIcon(i);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1716d.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1716d.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f1716d.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f1716d.setNumericShortcut(c);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1716d.setOnActionExpandListener(onActionExpandListener != null ? new C0484x(this, onActionExpandListener) : null);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1716d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0485y(this, onMenuItemClickListener) : null);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f1716d.setShortcut(c, c2);
        return this;
    }

    public final void setShowAsAction(int i) {
        this.f1716d.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.f1716d.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f1716d.setTitle(i);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1716d.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f1716d.mo1465d(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        C1841b bVar = this.f1716d;
        bVar.setVisible(z);
        return bVar;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1716d.setAlphabeticShortcut(c, i);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f1716d.setIcon(drawable);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f1716d.setNumericShortcut(c, i);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1716d.setShortcut(c, c2, i, i2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1716d.setTitle(charSequence);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0483w(view);
        }
        this.f1716d.setActionView(view);
        return this;
    }
}

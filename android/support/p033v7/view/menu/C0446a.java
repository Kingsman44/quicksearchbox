package android.support.p033v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C1877c;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p087b.p088a.C1841b;
import androidx.core.p098j.C2089d;

/* renamed from: android.support.v7.view.menu.a */
/* compiled from: PG */
public final class C0446a implements C1841b {

    /* renamed from: a */
    private CharSequence f1535a;

    /* renamed from: b */
    private CharSequence f1536b;

    /* renamed from: c */
    private Intent f1537c;

    /* renamed from: d */
    private char f1538d;

    /* renamed from: e */
    private int f1539e = 4096;

    /* renamed from: f */
    private char f1540f;

    /* renamed from: g */
    private int f1541g = 4096;

    /* renamed from: h */
    private Drawable f1542h;

    /* renamed from: i */
    private final Context f1543i;

    /* renamed from: j */
    private CharSequence f1544j;

    /* renamed from: k */
    private CharSequence f1545k;

    /* renamed from: l */
    private ColorStateList f1546l = null;

    /* renamed from: m */
    private PorterDuff.Mode f1547m = null;

    /* renamed from: n */
    private boolean f1548n = false;

    /* renamed from: o */
    private boolean f1549o = false;

    /* renamed from: p */
    private int f1550p = 16;

    public C0446a(Context context, CharSequence charSequence) {
        this.f1543i = context;
        this.f1535a = charSequence;
    }

    /* renamed from: e */
    private final void m1468e() {
        Drawable drawable = this.f1542h;
        if (drawable == null) {
            return;
        }
        if (this.f1548n || this.f1549o) {
            Drawable mutate = drawable.mutate();
            this.f1542h = mutate;
            if (this.f1548n) {
                C1929b.m5226g(mutate, this.f1546l);
            }
            if (this.f1549o) {
                C1929b.m5227h(this.f1542h, this.f1547m);
            }
        }
    }

    /* renamed from: a */
    public final C2089d mo1461a() {
        return null;
    }

    /* renamed from: b */
    public final void mo1462b(CharSequence charSequence) {
        this.f1544j = charSequence;
    }

    /* renamed from: c */
    public final void mo1463c(C2089d dVar) {
        throw new UnsupportedOperationException();
    }

    public final boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public final void mo1465d(CharSequence charSequence) {
        this.f1545k = charSequence;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f1541g;
    }

    public final char getAlphabeticShortcut() {
        return this.f1540f;
    }

    public final CharSequence getContentDescription() {
        return this.f1544j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f1542h;
    }

    public final ColorStateList getIconTintList() {
        return this.f1546l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f1547m;
    }

    public final Intent getIntent() {
        return this.f1537c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f1539e;
    }

    public final char getNumericShortcut() {
        return this.f1538d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f1535a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1536b;
        return charSequence != null ? charSequence : this.f1535a;
    }

    public final CharSequence getTooltipText() {
        return this.f1545k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f1550p & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f1550p & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f1550p & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f1550p & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f1540f = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f1550p = z | (this.f1550p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f1550p = (true != z ? 0 : 2) | (this.f1550p & -3);
        return this;
    }

    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f1544j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f1550p = (true != z ? 0 : 16) | (this.f1550p & -17);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f1542h = C1877c.m5125a(this.f1543i, i);
        m1468e();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1546l = colorStateList;
        this.f1548n = true;
        m1468e();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1547m = mode;
        this.f1549o = true;
        m1468e();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f1537c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f1538d = c;
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f1538d = c;
        this.f1539e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f1538d = c;
        this.f1540f = Character.toLowerCase(c2);
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f1535a = this.f1543i.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1535a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1536b = charSequence;
        return this;
    }

    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.f1545k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f1550p & 8;
        if (true == z) {
            i = 0;
        }
        this.f1550p = i2 | i;
        return this;
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1540f = Character.toLowerCase(c);
        this.f1541g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1538d = c;
        this.f1539e = KeyEvent.normalizeMetaState(i);
        this.f1540f = Character.toLowerCase(c2);
        this.f1541g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f1542h = drawable;
        m1468e();
        return this;
    }
}

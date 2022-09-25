package androidx.core.p087b.p088a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.core.p098j.C2089d;

/* renamed from: androidx.core.b.a.b */
/* compiled from: PG */
public interface C1841b extends MenuItem {
    /* renamed from: a */
    C2089d mo1461a();

    /* renamed from: b */
    void mo1462b(CharSequence charSequence);

    /* renamed from: c */
    void mo1463c(C2089d dVar);

    boolean collapseActionView();

    /* renamed from: d */
    void mo1465d(CharSequence charSequence);

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}

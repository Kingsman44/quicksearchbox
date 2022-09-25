package com.google.android.material.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.support.p033v7.view.menu.C0460an;
import android.support.p033v7.view.menu.C0480t;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.ac */
/* compiled from: PG */
public final class C44704ac extends C0640fb {

    /* renamed from: a */
    public final ArrayList f116531a = new ArrayList();

    /* renamed from: b */
    public C0480t f116532b;

    /* renamed from: c */
    public boolean f116533c;

    /* renamed from: d */
    final /* synthetic */ C44714am f116534d;

    public C44704ac(C44714am amVar) {
        this.f116534d = amVar;
        mo48016a();
    }

    /* renamed from: c */
    private final void m79255c(int i, int i2) {
        while (i < i2) {
            ((C44708ag) this.f116531a.get(i)).f116538b = true;
            i++;
        }
    }

    /* renamed from: d */
    private final void m79256d(View view, int i, boolean z) {
        C2043bi.m5526T(view, new C44703ab(this, i, z));
    }

    /* renamed from: a */
    public final void mo48016a() {
        if (!this.f116533c) {
            this.f116533c = true;
            this.f116531a.clear();
            this.f116531a.add(new C44705ad());
            int size = this.f116534d.f116543c.mo1654e().size();
            int i = -1;
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0480t tVar = (C0480t) this.f116534d.f116543c.mo1654e().get(i3);
                if (tVar.isChecked()) {
                    mo48017b(tVar);
                }
                if (tVar.isCheckable()) {
                    tVar.mo1705j(false);
                }
                if (tVar.hasSubMenu()) {
                    C0460an anVar = tVar.f1691j;
                    if (anVar.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.f116531a.add(new C44707af(this.f116534d.f116565y, 0));
                        }
                        this.f116531a.add(new C44708ag(tVar));
                        int size2 = this.f116531a.size();
                        int size3 = anVar.size();
                        boolean z2 = false;
                        for (int i4 = 0; i4 < size3; i4++) {
                            C0480t tVar2 = (C0480t) anVar.getItem(i4);
                            if (tVar2.isVisible()) {
                                if (!z2 && tVar2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (tVar2.isCheckable()) {
                                    tVar2.mo1705j(false);
                                }
                                if (tVar.isChecked()) {
                                    mo48017b(tVar);
                                }
                                this.f116531a.add(new C44708ag(tVar2));
                            }
                        }
                        if (z2) {
                            m79255c(size2, this.f116531a.size());
                        }
                    }
                } else {
                    int i5 = tVar.f1683b;
                    if (i5 != i) {
                        i2 = this.f116531a.size();
                        z = tVar.getIcon() != null;
                        if (i3 != 0) {
                            i2++;
                            ArrayList arrayList = this.f116531a;
                            int i6 = this.f116534d.f116565y;
                            arrayList.add(new C44707af(i6, i6));
                        }
                    } else if (!z && tVar.getIcon() != null) {
                        m79255c(i2, this.f116531a.size());
                        z = true;
                    }
                    C44708ag agVar = new C44708ag(tVar);
                    agVar.f116538b = z;
                    this.f116531a.add(agVar);
                    i = i5;
                }
            }
            this.f116533c = false;
        }
    }

    /* renamed from: b */
    public final void mo48017b(C0480t tVar) {
        if (this.f116532b != tVar && tVar.isCheckable()) {
            C0480t tVar2 = this.f116532b;
            if (tVar2 != null) {
                tVar2.setChecked(false);
            }
            this.f116532b = tVar;
            tVar.setChecked(true);
        }
    }

    public final int getItemCount() {
        return this.f116531a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        C44706ae aeVar = (C44706ae) this.f116531a.get(i);
        if (aeVar instanceof C44707af) {
            return 2;
        }
        if (aeVar instanceof C44705ad) {
            return 3;
        }
        if (aeVar instanceof C44708ag) {
            return ((C44708ag) aeVar).f116537a.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C44713al alVar = (C44713al) ghVar;
        int itemViewType = getItemViewType(i);
        boolean z = true;
        if (itemViewType == 0) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) alVar.itemView;
            navigationMenuItemView.f116522i = this.f116534d.f116551k;
            if (navigationMenuItemView.f116522i == null) {
                z = false;
            }
            navigationMenuItemView.f116523j = z;
            C0480t tVar = navigationMenuItemView.f116521h;
            if (tVar != null) {
                navigationMenuItemView.mo48010b(tVar.getIcon());
            }
            int i2 = this.f116534d.f116549i;
            if (i2 != 0) {
                navigationMenuItemView.f116519f.setTextAppearance(i2);
            }
            ColorStateList colorStateList = this.f116534d.f116550j;
            if (colorStateList != null) {
                navigationMenuItemView.f116519f.setTextColor(colorStateList);
            }
            Drawable drawable = this.f116534d.f116552l;
            C2043bi.m5530X(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = this.f116534d.f116553m;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            C44708ag agVar = (C44708ag) this.f116531a.get(i);
            navigationMenuItemView.f116517d = agVar.f116538b;
            C44714am amVar = this.f116534d;
            int i3 = amVar.f116554n;
            int i4 = amVar.f116555o;
            navigationMenuItemView.setPadding(i3, i4, i3, i4);
            navigationMenuItemView.f116519f.setCompoundDrawablePadding(this.f116534d.f116556p);
            C44714am amVar2 = this.f116534d;
            if (amVar2.f116561u) {
                navigationMenuItemView.f116516c = amVar2.f116557q;
            }
            navigationMenuItemView.f116519f.setMaxLines(amVar2.f116563w);
            navigationMenuItemView.mo1446f(agVar.f116537a);
            m79256d(navigationMenuItemView, i, false);
        } else if (itemViewType == 1) {
            TextView textView = (TextView) alVar.itemView;
            textView.setText(((C44708ag) this.f116531a.get(i)).f116537a.f1685d);
            int i5 = this.f116534d.f116547g;
            if (i5 != 0) {
                textView.setTextAppearance(i5);
            }
            textView.setPadding(this.f116534d.f116560t, textView.getPaddingTop(), 0, textView.getPaddingBottom());
            ColorStateList colorStateList2 = this.f116534d.f116548h;
            if (colorStateList2 != null) {
                textView.setTextColor(colorStateList2);
            }
            m79256d(textView, i, true);
        } else if (itemViewType != 2) {
            m79256d(alVar.itemView, i, true);
        } else {
            C44707af afVar = (C44707af) this.f116531a.get(i);
            View view = alVar.itemView;
            C44714am amVar3 = this.f116534d;
            view.setPadding(amVar3.f116558r, afVar.f116535a, amVar3.f116559s, afVar.f116536b);
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            C44714am amVar = this.f116534d;
            return new C44710ai(amVar.f116546f, viewGroup, amVar.f116540A);
        } else if (i == 1) {
            return new C44712ak(this.f116534d.f116546f, viewGroup);
        } else {
            if (i == 2) {
                return new C44711aj(this.f116534d.f116546f, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new C44702aa(this.f116534d.f116542b);
        }
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        C44713al alVar = (C44713al) ghVar;
        if (alVar instanceof C44710ai) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) alVar.itemView;
            FrameLayout frameLayout = navigationMenuItemView.f116520g;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.f116519f.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }
}

package com.google.apps.tiktok.tracing;

import android.view.MenuItem;

/* renamed from: com.google.apps.tiktok.tracing.cz */
/* compiled from: PG */
public final class C47761cz implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    final /* synthetic */ MenuItem.OnActionExpandListener f123746a;

    /* renamed from: b */
    final /* synthetic */ String f123747b = "Settings search view expand/hide";

    /* renamed from: c */
    final /* synthetic */ C47770dh f123748c;

    public C47761cz(C47770dh dhVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f123748c = dhVar;
        this.f123746a = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        if (C47831fm.m85027v()) {
            return this.f123746a.onMenuItemActionCollapse(menuItem);
        }
        C47538ax c = this.f123748c.mo51613c(this.f123747b);
        try {
            boolean onMenuItemActionCollapse = this.f123746a.onMenuItemActionCollapse(menuItem);
            if (c != null) {
                c.close();
            }
            return onMenuItemActionCollapse;
        } catch (Throwable th) {
            C47760cy.m84914a(th, th);
        }
        throw th;
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        if (C47831fm.m85027v()) {
            return this.f123746a.onMenuItemActionExpand(menuItem);
        }
        C47538ax c = this.f123748c.mo51613c(this.f123747b);
        try {
            boolean onMenuItemActionExpand = this.f123746a.onMenuItemActionExpand(menuItem);
            if (c != null) {
                c.close();
            }
            return onMenuItemActionExpand;
        } catch (Throwable th) {
            C47760cy.m84914a(th, th);
        }
        throw th;
    }
}

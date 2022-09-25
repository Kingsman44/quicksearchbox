package com.google.android.apps.gsa.staticplugins.opa.util;

import android.app.Activity;
import android.view.MenuItem;
import android.widget.PopupMenu;
import com.google.android.apps.gsa.assistant.shared.p5829r.C73906a;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bz */
/* compiled from: PG */
public class C113810bz implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: b */
    public final C113809by f315211b;

    public C113810bz(C113809by byVar) {
        this.f315211b = byVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo97177a() {
        this.f315211b.mo100658a();
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.opa_menu_account) {
            mo97177a();
            return true;
        } else if (menuItem.getItemId() == R.id.opa_menu_settings) {
            this.f315211b.mo100661d();
            return true;
        } else if (menuItem.getItemId() == R.id.opa_menu_what_can_you_do) {
            this.f315211b.mo100662e();
            return true;
        } else if (menuItem.getItemId() == R.id.opa_menu_my_activity) {
            return this.f315211b.mo100663f();
        } else {
            if (menuItem.getItemId() == R.id.opa_menu_feedback) {
                this.f315211b.mo100659b();
                return true;
            } else if (menuItem.getItemId() == R.id.opa_menu_help) {
                this.f315211b.mo100660c();
                return true;
            } else if (menuItem.getItemId() != R.id.opa_menu_transparency_disclosure) {
                return false;
            } else {
                C113809by byVar = this.f315211b;
                C73906a.m108547b();
                Activity activity = byVar.f315204a;
                C73906a aVar = byVar.f315205b;
                activity.startActivity(C73906a.m108547b());
                return true;
            }
        }
    }
}

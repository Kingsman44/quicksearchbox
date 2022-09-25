package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.app.FragmentManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.p033v7.app.C0401v;
import android.view.MenuItem;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7184t.C91098h;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92248j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.s */
/* compiled from: PG */
public class C118680s extends C118624a implements FragmentManager.OnBackStackChangedListener, C91098h {

    /* renamed from: A */
    public C68214a f331071A;

    /* renamed from: a */
    private boolean f331072a;

    /* renamed from: b */
    private CharSequence f331073b;

    /* renamed from: c */
    private int f331074c;

    /* renamed from: y */
    C91090a f331075y;

    /* renamed from: z */
    public C92248j f331076z;

    /* renamed from: b */
    private final void m197020b(int i, CharSequence charSequence) {
        if (i > 0) {
            charSequence = getText(i);
        }
        if (charSequence != null) {
            setTitle(charSequence);
        }
    }

    public final SharedPreferences getSharedPreferences(String str, int i) {
        if (((C86127w) this.f331071A.mo27525b()).f232790a.mo79726e(str)) {
            return ((C86127w) this.f331071A.mo27525b()).f232790a.mo79722a();
        }
        return super.getSharedPreferences(str, i);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C91090a aVar = this.f331075y;
        aVar.mo85356g(i, i2, intent, aVar.f254379a);
    }

    public final void onBackStackChanged() {
        int backStackEntryCount = getFragmentManager().getBackStackEntryCount();
        if (backStackEntryCount == 0) {
            m197020b(this.f331074c, this.f331073b);
            return;
        }
        FragmentManager.BackStackEntry backStackEntryAt = getFragmentManager().getBackStackEntryAt(backStackEntryCount - 1);
        m197020b(backStackEntryAt.getBreadCrumbTitleRes(), backStackEntryAt.getBreadCrumbTitle());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f331075y = new C91090a(this, this, 100);
        C0401v.m1321C();
        super.onCreate(bundle);
        this.f331075y.mo85358i(bundle);
        if (!this.f331076z.mo86932k()) {
            this.f331076z.mo86928g();
        }
        if (onIsHidingHeaders() || !onIsMultiPane()) {
            getFragmentManager().addOnBackStackChangedListener(this);
            this.f331072a = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        if (this.f331072a) {
            getFragmentManager().removeOnBackStackChangedListener(this);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f331075y.mo85357h(bundle);
    }

    public final void switchToHeader(PreferenceActivity.Header header) {
        super.switchToHeader(header);
        this.f331073b = header.title;
        this.f331074c = header.titleRes;
    }

    /* renamed from: x */
    public final C91097g mo17775x() {
        return this.f331075y;
    }
}

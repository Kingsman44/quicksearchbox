package android.support.p033v7.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p033v7.view.C0435c;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0824t;
import androidx.core.app.C1783a;
import androidx.core.app.C1814bd;
import androidx.core.app.C1815be;
import androidx.core.app.C1828o;
import androidx.core.app.C1829p;
import androidx.core.content.p091b.C1873v;
import androidx.core.p094f.C1897j;
import androidx.p043a.p044a.C0782b;
import androidx.savedstate.C4092h;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.app.p */
/* compiled from: PG */
public class C0395p extends C0167am implements C0396q, C1814bd {

    /* renamed from: YY */
    private C0401v f1352YY;

    public C0395p() {
        m1303fT();
    }

    /* renamed from: fT */
    private final void m1303fT() {
        this.f2706g.f13082a.mo8585b("androidx:appcompat", new C0393n(this));
        this.f2705f.mo3343a(new C0394o(this));
    }

    /* renamed from: fU */
    private final void m1304fU() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        C4092h.m11723a(getWindow().getDecorView(), this);
        C0824t.m2679a(getWindow().getDecorView(), this);
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1304fU();
        mo1322k().mo1178g(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C0356aq aqVar = (C0356aq) mo1322k();
        aqVar.f1181F = true;
        int E = aqVar.mo1152E(context, aqVar.mo1151D());
        if (C0356aq.m1327w(context)) {
            C0356aq.m1326v(context);
        }
        C1897j X = C0356aq.m1079X(context);
        Configuration configuration = null;
        if (C0356aq.f1175j && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(C0356aq.m1080Y(context, E, X, (Configuration) null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0782b) {
            try {
                ((C0782b) context).mo3324a(C0356aq.m1080Y(context, E, X, (Configuration) null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (C0356aq.f1174i) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (!(configuration4 == null || configuration3.diff(configuration4) == 0)) {
                    if (configuration3.fontScale != configuration4.fontScale) {
                        configuration.fontScale = configuration4.fontScale;
                    }
                    if (configuration3.mcc != configuration4.mcc) {
                        configuration.mcc = configuration4.mcc;
                    }
                    if (configuration3.mnc != configuration4.mnc) {
                        configuration.mnc = configuration4.mnc;
                    }
                    C0345af.m1061b(configuration3, configuration4, configuration);
                    if (configuration3.touchscreen != configuration4.touchscreen) {
                        configuration.touchscreen = configuration4.touchscreen;
                    }
                    if (configuration3.keyboard != configuration4.keyboard) {
                        configuration.keyboard = configuration4.keyboard;
                    }
                    if (configuration3.keyboardHidden != configuration4.keyboardHidden) {
                        configuration.keyboardHidden = configuration4.keyboardHidden;
                    }
                    if (configuration3.navigation != configuration4.navigation) {
                        configuration.navigation = configuration4.navigation;
                    }
                    if (configuration3.navigationHidden != configuration4.navigationHidden) {
                        configuration.navigationHidden = configuration4.navigationHidden;
                    }
                    if (configuration3.orientation != configuration4.orientation) {
                        configuration.orientation = configuration4.orientation;
                    }
                    if ((configuration3.screenLayout & 15) != (configuration4.screenLayout & 15)) {
                        configuration.screenLayout |= configuration4.screenLayout & 15;
                    }
                    if ((configuration3.screenLayout & 192) != (configuration4.screenLayout & 192)) {
                        configuration.screenLayout |= configuration4.screenLayout & 192;
                    }
                    if ((configuration3.screenLayout & 48) != (configuration4.screenLayout & 48)) {
                        configuration.screenLayout |= configuration4.screenLayout & 48;
                    }
                    if ((configuration3.screenLayout & 768) != (configuration4.screenLayout & 768)) {
                        configuration.screenLayout |= configuration4.screenLayout & 768;
                    }
                    if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                        configuration.colorMode |= configuration4.colorMode & 3;
                    }
                    if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                        configuration.colorMode |= configuration4.colorMode & 12;
                    }
                    if ((configuration3.uiMode & 15) != (configuration4.uiMode & 15)) {
                        configuration.uiMode |= configuration4.uiMode & 15;
                    }
                    if ((configuration3.uiMode & 48) != (configuration4.uiMode & 48)) {
                        configuration.uiMode |= configuration4.uiMode & 48;
                    }
                    if (configuration3.screenWidthDp != configuration4.screenWidthDp) {
                        configuration.screenWidthDp = configuration4.screenWidthDp;
                    }
                    if (configuration3.screenHeightDp != configuration4.screenHeightDp) {
                        configuration.screenHeightDp = configuration4.screenHeightDp;
                    }
                    if (configuration3.smallestScreenWidthDp != configuration4.smallestScreenWidthDp) {
                        configuration.smallestScreenWidthDp = configuration4.smallestScreenWidthDp;
                    }
                    if (configuration3.densityDpi != configuration4.densityDpi) {
                        configuration.densityDpi = configuration4.densityDpi;
                    }
                }
            }
            Configuration Y = C0356aq.m1080Y(context, E, X, configuration, true);
            C0782b bVar = new C0782b(context, 2132150595);
            bVar.mo3324a(Y);
            try {
                if (context.getTheme() != null) {
                    C1873v.m5103a(bVar.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = bVar;
        }
        super.attachBaseContext(context);
    }

    public final void closeOptionsMenu() {
        C0356aq aqVar = (C0356aq) mo1322k();
        aqVar.mo1163P();
        C0383d dVar = aqVar.f1215o;
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (dVar == null || !dVar.mo1247r()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0356aq aqVar = (C0356aq) mo1322k();
        aqVar.mo1163P();
        C0383d dVar = aqVar.f1215o;
        if (keyCode != 82 || dVar == null || !dVar.mo1251v(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: fQ */
    public final void mo541fQ() {
        mo1322k().mo1180i();
    }

    public View findViewById(int i) {
        return mo1322k().mo1177e(i);
    }

    public final MenuInflater getMenuInflater() {
        return mo1322k().mo1176d();
    }

    public void invalidateOptionsMenu() {
        mo1322k().mo1180i();
    }

    /* renamed from: j */
    public final Intent mo1320j() {
        return C1829p.m5010a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public void mo1321jA() {
    }

    /* renamed from: k */
    public final C0401v mo1322k() {
        if (this.f1352YY == null) {
            this.f1352YY = C0401v.m1322b(this, this);
        }
        return this.f1352YY;
    }

    /* renamed from: l */
    public void mo1204l(C0435c cVar) {
    }

    /* renamed from: m */
    public boolean mo1323m() {
        Intent a = C1829p.m5010a(this);
        if (a == null) {
            return false;
        }
        if (C1828o.m5009c(this, a)) {
            C1815be beVar = new C1815be(this);
            Intent j = mo1320j();
            if (j == null) {
                j = C1829p.m5010a(this);
            }
            if (j != null) {
                ComponentName component = j.getComponent();
                if (component == null) {
                    component = j.resolveActivity(beVar.f5644b.getPackageManager());
                }
                beVar.mo5005b(component);
                beVar.f5643a.add(j);
            }
            beVar.mo5006c();
            try {
                C1783a.m4902a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            C1828o.m5008b(this, a);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo1324o() {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo1322k().mo1181j(configuration);
    }

    public final void onContentChanged() {
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo1322k().mo1182k();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0356aq aqVar = (C0356aq) mo1322k();
        aqVar.mo1163P();
        C0383d dVar = aqVar.f1215o;
        if (menuItem.getItemId() != 16908332 || dVar == null || (dVar.mo1231a() & 4) == 0) {
            return false;
        }
        return mo1323m();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((C0356aq) mo1322k()).mo1162O();
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo1322k().mo1183l();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo1322k().mo1184m();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo1322k().mo1185n();
    }

    /* access modifiers changed from: protected */
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo1322k().mo1193u(charSequence);
    }

    public final void openOptionsMenu() {
        C0356aq aqVar = (C0356aq) mo1322k();
        aqVar.mo1163P();
        C0383d dVar = aqVar.f1215o;
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (dVar == null || !dVar.mo1252w()) {
            super.openOptionsMenu();
        }
    }

    /* renamed from: p */
    public final C0435c mo1207p() {
        return null;
    }

    /* renamed from: q */
    public final void mo1329q() {
        mo1322k().mo1150B(1);
    }

    /* renamed from: r */
    public void mo1208r() {
    }

    public final void setContentView(int i) {
        m1304fU();
        mo1322k().mo1188p(i);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        ((C0356aq) mo1322k()).f1183H = i;
    }

    public C0395p(int i) {
        super(i);
        m1303fT();
    }

    public final void setContentView(View view) {
        m1304fU();
        mo1322k().mo1189q(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1304fU();
        mo1322k().mo1190r(view, layoutParams);
    }
}

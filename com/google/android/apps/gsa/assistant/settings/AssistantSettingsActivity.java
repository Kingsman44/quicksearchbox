package com.google.android.apps.gsa.assistant.settings;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.constraint.C0146c;
import android.support.constraint.ConstraintLayout;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0356aq;
import android.support.p033v7.app.C0383d;
import android.support.p033v7.app.C0401v;
import android.support.p033v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.p515c.C9521f;
import com.google.android.apps.gsa.assistant.settings.p515c.C9522g;
import com.google.android.apps.gsa.assistant.settings.shared.h.g;
import com.google.android.apps.gsa.assistant.settings.shared.p5797h.C73755h;
import com.google.android.apps.gsa.assistant.settings.shared.p5797h.C73757j;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73872d;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86314e;
import com.google.android.apps.gsa.search.shared.p6941ui.C88522b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.p8338bh.p8339a.C108066a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.baseclasses.C47212h;
import com.google.apps.tiktok.inject.p3659d.C47237f;
import com.google.apps.tiktok.inject.p3659d.C47241j;
import com.google.apps.tiktok.p3674l.p3680d.C47401a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47762d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47818f;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.C47849i;
import com.google.apps.tiktok.tracing.C47851k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68314a;

/* compiled from: PG */
public final class AssistantSettingsActivity extends r implements C47231d, C47211g {

    /* renamed from: k */
    private g f32953k;

    /* renamed from: l */
    private final C47851k f32954l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f32955m;

    /* renamed from: n */
    private Context f32956n;

    /* renamed from: o */
    private C2393x f32957o;

    /* renamed from: p */
    private boolean f32958p;

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity, android.app.Activity] */
    public AssistantSettingsActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: I */
    private final void m24028I() {
        if (this.f32953k != null) {
            return;
        }
        if (!this.f32955m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f32958p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                H().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f32953k = ((C73725i) H().mo17653jN()).mo65183c();
                    a2.close();
                    this.f32953k.z = this;
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C9494a.m24044a(th, th);
                }
            } catch (Throwable th2) {
                C9494a.m24044a(th, th2);
            }
        } else {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        throw th;
        throw th;
    }

    /* renamed from: A */
    public final void mo17713A() {
        m24028I();
        this.f32953k.q = null;
    }

    /* renamed from: B */
    public final void mo17714B() {
        m24028I();
        g gVar = this.f32953k;
        gVar.q = null;
        AssistantSettingsActivity.super.onBackPressed();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.support.v7.app.p, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* renamed from: C */
    public final void mo17715C() {
        m24028I();
        g gVar = this.f32953k;
        gVar.u = true;
        C0356aq aqVar = (C0356aq) gVar.b.mo1322k();
        aqVar.mo1163P();
        C0383d dVar = aqVar.f1215o;
        if (dVar != null) {
            dVar.mo1236g();
        }
    }

    /* renamed from: D */
    public final void mo17716D(C90936cf cfVar) {
        m24028I();
        this.f32953k.q = cfVar;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [com.google.android.libraries.at.c.a.a, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* renamed from: E */
    public final void mo17717E(int i, Intent intent) {
        m24028I();
        g gVar = this.f32953k;
        gVar.b.setResult(i, intent);
        gVar.b.finish();
    }

    /* renamed from: F */
    public final void mo17718F(int i) {
        m24028I();
        this.f32953k.r.mo17834a(i);
    }

    /* renamed from: G */
    public final void mo17719G(String str, Bundle bundle, int i, CharSequence charSequence, Fragment fragment) {
        m24028I();
        g gVar = this.f32953k;
        C58976aa aaVar = C58975e.f156826a;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        g gVar2 = (g) gVar.h.mo17428b();
        gVar2.d(str);
        gVar2.f(i);
        gVar2.e(charSequence != null ? charSequence.toString() : BuildConfig.FLAVOR);
        gVar2.c(bundle);
        C73755h a = gVar2.a();
        Intent intent = new Intent("com.google.android.googlequicksearchbox.action.ASSISTANT_SETTINGS");
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.putExtra("account_name", a.mo65229c());
        intent.putExtra("extra_assistant_settings_entry_source", a.mo65230d());
        intent.putExtra(":assistantsettings:show_fragment", a.mo65231e());
        intent.putExtra(":assistantsettings:show_fragment_args", a.mo65228b());
        intent.putExtra(":assistantsettings:show_fragment_title_resid", a.mo65227a());
        intent.putExtra(":assistantsettings:show_fragment_title", a.mo65232f());
        fragment.startActivityForResult(intent, 0);
    }

    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.f32956n;
        }
        C47401a.m84249b(baseContext, configuration);
        AssistantSettingsActivity.super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f32956n = context;
        AssistantSettingsActivity.super.attachBaseContext(C47401a.m84248a(context));
        this.f32956n = null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.support.v4.app.am, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    public final C2384o getLifecycle() {
        if (this.f32957o == null) {
            this.f32957o = new C47212h(this);
        }
        return this.f32957o;
    }

    public final SharedPreferences getSharedPreferences(String str, int i) {
        m24028I();
        g gVar = this.f32953k;
        if (((C86127w) gVar.e.mo27525b()).f232790a.mo79726e(str)) {
            return ((C86127w) gVar.e.mo27525b()).f232790a.mo79722a();
        }
        return AssistantSettingsActivity.super.getSharedPreferences(str, i);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.support.v7.app.p, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo17725jA() {
    }

    /* renamed from: m */
    public final boolean mo17726m() {
        C47573bx i = this.f32954l.mo51682i();
        try {
            boolean m = AssistantSettingsActivity.super.m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo17727o() {
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [com.google.android.libraries.at.c.a.a, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f32954l.mo51691r();
        try {
            m24028I();
            g gVar = this.f32953k;
            if (i != 1) {
                C58976aa aaVar = C58975e.f156826a;
                AssistantSettingsActivity.super.onActivityResult(i, i2, intent);
                C91090a aVar = gVar.l;
                aVar.mo85356g(i, i2, intent, aVar.f254379a);
            } else if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError("Unknown resultCode: " + i2);
                    }
                }
                gVar.b.setResult(0);
                gVar.b.finish();
            } else {
                gVar.b(C89849ae.OPA_SETTINGS_STARTUP_POST_ONBOARDING);
            }
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f32954l.mo51674a();
        try {
            m24028I();
            g gVar = this.f32953k;
            C90936cf cfVar = gVar.q;
            if (cfVar != null) {
                cfVar.run();
            } else {
                AssistantSettingsActivity.super.onBackPressed();
            }
            a.close();
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f32954l.mo51684k("onConfigurationChanged");
        try {
            AssistantSettingsActivity.super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: type inference failed for: r3v15, types: [android.support.v7.app.p, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.support.v7.app.p, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* JADX WARNING: type inference failed for: r10v3, types: [android.support.v7.app.p, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* JADX WARNING: type inference failed for: r3v20, types: [android.support.v7.app.p, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* JADX WARNING: type inference failed for: r3v24, types: [android.support.v7.app.p, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* JADX WARNING: type inference failed for: r5v13, types: [android.support.v7.app.p, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* JADX WARNING: type inference failed for: r3v28, types: [android.support.v7.app.p, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* JADX WARNING: type inference failed for: r3v34, types: [androidx.activity.ComponentActivity, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* JADX WARNING: type inference failed for: r3v38, types: [androidx.activity.ComponentActivity, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* JADX WARNING: type inference failed for: r8v3, types: [com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r3v41, types: [android.support.v7.app.p, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* JADX WARNING: type inference failed for: r5v16, types: [android.content.Context, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* JADX WARNING: type inference failed for: r5v21, types: [android.support.v7.app.p, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C47573bx s = this.f32954l.mo51692s();
        try {
            this.f32955m = true;
            m24028I();
            ((C47212h) getLifecycle()).mo51120i(this.f32954l);
            ((C47237f) H().mo17653jN()).mo51141bP().mo50899a();
            m24028I();
            g gVar = this.f32953k;
            C74504a.m120462a(f.e);
            Intent intent = gVar.b.getIntent();
            intent.getClass();
            gVar.l.mo85358i(bundle);
            gVar.t = false;
            gVar.u = false;
            boolean equals = "opa".equals(gVar.b.getIntent().getStringExtra("extra_assistant_settings_entry_source"));
            gVar.v = equals;
            gVar.r = gVar.y.mo17835a(equals);
            int i = 2;
            if (gVar.d.mo79746e(C90059dk.f249169g)) {
                gVar.b.mo1322k().mo1191s(2);
            } else {
                C0401v.m1321C();
                if (!C90962a.m148577a(gVar.b)) {
                    View decorView = gVar.b.getWindow().getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
            }
            AssistantSettingsActivity.super.onCreate(bundle);
            if (intent.hasExtra(":settings:fragment_args_key")) {
                gVar.j.mo77944g(C118569b.ASSISTANT_SETTINGS_OPENED_FROM_SEARCH_COUNT, C118575h.UNKNOWN_WORKLOAD).mo104025g(1);
            }
            C58976aa aaVar = C58975e.f156826a;
            C73757j jVar = gVar.c;
            if (gVar.n.mo64548a() != 1) {
                if (!gVar.d.mo79746e(C90059dk.f249077an)) {
                    if (!gVar.d.mo79746e(C90014bt.f247382gB)) {
                        i = 1;
                    }
                }
                i = 3;
            }
            gVar.x = i;
            if (i != 1) {
                gVar.b.setTheme(2132150636);
            }
            gVar.w = gVar.x == 3 ? R.layout.assistant_settings_activity_layout_withactionbar : R.layout.assistant_settings_activity_layout;
            if (gVar.v && gVar.f.mo56113h()) {
                ? r3 = gVar.b;
                int i2 = gVar.w;
                C88522b a = ((C108066a) gVar.f.mo56107c()).mo96416a(gVar.b);
                int i3 = gVar.x;
                r3.setContentView(a.mo82140b(i2));
            } else if (gVar.c.mo65233b() == 1 || gVar.x == 3) {
                gVar.b.setContentView(gVar.w);
            }
            if (gVar.d.mo79746e(C90014bt.f247382gB)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) gVar.b.mo1322k().mo1177e(R.id.assistant_settings_activity_constraintlayout);
                C0146c cVar = new C0146c();
                cVar.mo192d(constraintLayout);
                cVar.mo189a(R.id.assistant_settings_activity_container).f567af = gVar.b.getResources().getDimensionPixelSize(R.dimen.assistant_settings_max_width);
                cVar.mo190b(constraintLayout);
                constraintLayout.f335c = null;
            }
            if (gVar.x == 3) {
                C0401v k = gVar.b.mo1322k();
                ((C0356aq) k).mo1163P();
                if (((C0356aq) k).f1215o == null) {
                    gVar.b.mo1322k().mo1192t((Toolbar) gVar.b.mo1322k().mo1177e(R.id.assistant_settings_toolbar));
                }
            }
            C0401v k2 = gVar.b.mo1322k();
            ((C0356aq) k2).mo1163P();
            C0383d dVar = ((C0356aq) k2).f1215o;
            if (dVar != null) {
                dVar.mo1239j(true);
                dVar.mo1240k(true);
            }
            gVar.p = (ProgressBar) gVar.b.mo1322k().mo1177e(R.id.assistant_settings_progress_bar);
            if (bundle == null) {
                C0401v k3 = gVar.b.mo1322k();
                ((C0356aq) k3).mo1163P();
                C0383d dVar2 = ((C0356aq) k3).f1215o;
                if (dVar2 != null) {
                    dVar2.mo1236g();
                }
                gVar.b(C89849ae.OPA_SETTINGS_STARTUP_ON_CREATE);
            } else {
                gVar.c();
                gVar.a();
            }
            this.f32955m = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.support.v7.app.p, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    public final boolean onCreateOptionsMenu(Menu menu) {
        m24028I();
        g gVar = this.f32953k;
        C9521f fVar = gVar.r;
        MenuInflater d = gVar.b.mo1322k().mo1176d();
        C9522g gVar2 = (C9522g) fVar;
        if (gVar2.f33004a.mo79746e(C90059dk.f249069af)) {
            d.inflate(R.menu.assistant_settings_menu_simplified, menu);
        } else {
            d.inflate(R.menu.assistant_settings_menu, menu);
        }
        if (!gVar2.f33005b.mo65438a()) {
            menu.removeItem(R.id.opa_menu_transparency_disclosure);
        }
        boolean onCreateOptionsMenu = AssistantSettingsActivity.super.onCreateOptionsMenu(menu);
        gVar.s = menu;
        return onCreateOptionsMenu;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f32954l.mo51693t();
        try {
            boolean onCreatePanelMenu = AssistantSettingsActivity.super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f32954l.mo51675b();
        try {
            AssistantSettingsActivity.super.onDestroy();
            m24028I();
            g gVar = this.f32953k;
            gVar.t = true;
            C86314e eVar = ((C9522g) gVar.r).f33006c;
            if (eVar != null) {
                eVar.dismiss();
            }
            this.f32958p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f32954l.mo51676c(intent);
        try {
            AssistantSettingsActivity.super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f32954l.mo51695v();
        try {
            m24028I();
            g gVar = this.f32953k;
            boolean z = true;
            if (!((C9522g) gVar.r).mo17834a(menuItem.getItemId()) && !AssistantSettingsActivity.super.onOptionsItemSelected(menuItem)) {
                z = false;
            }
            if (v != null) {
                v.close();
            }
            return z;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f32954l.mo51677d();
        try {
            AssistantSettingsActivity.super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f32954l.mo51696w();
        try {
            AssistantSettingsActivity.super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f32954l.mo51697x();
        try {
            AssistantSettingsActivity.super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f32954l.mo51678e();
        try {
            AssistantSettingsActivity.super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        C47573bx w = C47831fm.m85028w();
        try {
            boolean onPrepareOptionsMenu = AssistantSettingsActivity.super.onPrepareOptionsMenu(menu);
            w.close();
            return onPrepareOptionsMenu;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f32954l.mo51684k("onRequestPermissionsResult");
        try {
            AssistantSettingsActivity.super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f32954l.mo51679f();
        try {
            AssistantSettingsActivity.super.onResume();
            m24028I();
            C0401v.m1321C();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f32954l.mo51698y();
        try {
            AssistantSettingsActivity.super.onSaveInstanceState(bundle);
            m24028I();
            this.f32953k.l.mo85357h(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f32954l.mo51680g();
        try {
            AssistantSettingsActivity.super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f32954l.mo51681h();
        try {
            AssistantSettingsActivity.super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f32954l.mo51683j();
        try {
            AssistantSettingsActivity.super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C9494a.m24044a(th, th);
        }
        throw th;
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        AssistantSettingsActivity.super.startActivity(intent);
    }

    /* renamed from: v */
    public final Menu mo17750v() {
        m24028I();
        return this.f32953k.s;
    }

    /* renamed from: w */
    public final C73872d mo17751w() {
        m24028I();
        return this.f32953k.g;
    }

    /* renamed from: x */
    public final C91097g mo17752x() {
        m24028I();
        return this.f32953k.l;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity, android.app.Activity] */
    /* renamed from: y */
    public final /* synthetic */ C68314a mo17753y() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        g gVar = this.f32953k;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f32958p) {
            return gVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        AssistantSettingsActivity.super.startActivity(intent, bundle);
    }
}

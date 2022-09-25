package com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.location;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107061a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomsheet.C44565p;
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
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68314a;

/* compiled from: PG */
public final class SmartspaceOOBELocationActivity extends C110858b implements C47231d, C47211g {

    /* renamed from: l */
    private C110866j f308850l;

    /* renamed from: m */
    private final C47851k f308851m = new C47851k(this, this);

    /* renamed from: n */
    private boolean f308852n;

    /* renamed from: o */
    private Context f308853o;

    /* renamed from: p */
    private C2393x f308854p;

    /* renamed from: q */
    private boolean f308855q;

    public SmartspaceOOBELocationActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: l */
    private final void m184595l() {
        if (this.f308850l != null) {
            return;
        }
        if (!this.f308852n) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f308855q || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo22285j().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f308850l = ((C110867k) mo22285j().mo17653jN()).mo98912aa();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C110859c.m184602a(th, th);
                }
            } catch (Throwable th2) {
                C110859c.m184602a(th, th2);
            }
        } else {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        throw th;
        throw th;
    }

    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.f308853o;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f308853o = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f308853o = null;
    }

    public final C2384o getLifecycle() {
        if (this.f308854p == null) {
            this.f308854p = new C47212h(this);
        }
        return this.f308854p;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.invalidateOptionsMenu();
            w.close();
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    /* renamed from: k */
    public final /* synthetic */ C68314a mo22340k() {
        return new C47241j(this);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f308851m.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f308851m.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f308851m.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String[] strArr;
        String str;
        String str2;
        C47573bx s = this.f308851m.mo51692s();
        try {
            this.f308852n = true;
            m184595l();
            ((C47212h) getLifecycle()).mo51120i(this.f308851m);
            ((C47237f) mo22285j().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m184595l();
            C110866j jVar = this.f308850l;
            C74504a.m120462a(f.aE);
            if (!jVar.f308869c.mo79746e(C90017bw.f247899aN)) {
                jVar.f308868b.finish();
            } else if (!C107061a.m177776a(jVar.f308869c)) {
                jVar.f308868b.finish();
            } else {
                jVar.f308868b.setContentView((int) R.layout.smartspace_intro_activity);
                C44565p pVar = new C44565p(jVar.f308868b, R.style.ssIntroBottomSheetDialog);
                pVar.setContentView((int) R.layout.smartspace_intro_location_content);
                pVar.setCancelable(true);
                pVar.setCanceledOnTouchOutside(true);
                View e = pVar.mo1197b().mo1177e(R.id.design_bottom_sheet);
                if (e != null) {
                    e.setBackgroundColor(jVar.f308868b.getResources().getColor(17170445));
                }
                pVar.setOnCancelListener(new C110860d(jVar));
                String x = jVar.f308869c.mo79758x(C90017bw.f248003cc);
                if (TextUtils.isEmpty(x)) {
                    strArr = new String[]{"%s", "%s", BuildConfig.FLAVOR};
                } else {
                    strArr = x.split("#");
                    int length = strArr.length;
                    if (length < 3) {
                        strArr = new String[]{"%s", "%s", BuildConfig.FLAVOR};
                    } else {
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (TextUtils.isEmpty(strArr[i])) {
                                strArr = new String[]{"%s", "%s", BuildConfig.FLAVOR};
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                String string = jVar.f308868b.getResources().getString(R.string.at_a_glance);
                boolean isEmpty = jVar.f308868b.getResources().getString(R.string.smartspace_location_feature_description).isEmpty();
                C59104x b = C110866j.f308867a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ssIntroLocationAct");
                ((C59052c) ((C59052c) b).mo56372aa(26695)).mo56389s("using mendel strings:%b", Boolean.valueOf(isEmpty));
                if (isEmpty) {
                    str = String.format(strArr[0], new Object[]{string});
                } else {
                    str = jVar.f308868b.getResources().getString(R.string.smartspace_location_feature_description, new Object[]{string});
                }
                TextView textView = (TextView) pVar.mo1197b().mo1177e(R.id.smartspace_title);
                if (textView != null) {
                    textView.setText(str);
                }
                String string2 = jVar.f308868b.getResources().getString(R.string.smartspace_assistant_settings);
                if (isEmpty) {
                    str2 = String.format(strArr[1], new Object[]{string2});
                } else {
                    str2 = jVar.f308868b.getResources().getString(R.string.smartspace_location_feature_explanation, new Object[]{string2});
                }
                SpannableString spannableString = new SpannableString(str2);
                int indexOf = str2.indexOf(string2);
                C110863g gVar = new C110863g(jVar);
                spannableString.setSpan(gVar, indexOf, string2.length() + indexOf, 0);
                jVar.f308873g.mo86712q(gVar, 108865);
                TextView textView2 = (TextView) pVar.mo1197b().mo1177e(R.id.smartspace_description);
                if (textView2 != null) {
                    textView2.setContentDescription(str2);
                    textView2.setMovementMethod(LinkMovementMethod.getInstance());
                    textView2.setText(spannableString);
                }
                TextView textView3 = (TextView) pVar.mo1197b().mo1177e(R.id.example_text);
                if (textView3 != null) {
                    if (isEmpty) {
                        textView3.setText(strArr[2]);
                    } else {
                        textView3.setText(R.string.smartspace_example_context);
                    }
                }
                TextView textView4 = (TextView) pVar.mo1197b().mo1177e(R.id.allow_button);
                jVar.f308873g.mo86712q(textView4, 108864);
                if (textView4 != null) {
                    textView4.setOnClickListener(new C110861e(jVar, textView4));
                }
                TextView textView5 = (TextView) pVar.mo1197b().mo1177e(R.id.secondary_button);
                if (textView5 != null) {
                    textView5.setOnClickListener(new C110862f(jVar));
                }
                View e2 = pVar.mo1197b().mo1177e(R.id.smartspace_setting_description);
                if (e2 != null) {
                    e2.setVisibility(8);
                }
                pVar.show();
                jVar.f308873g.mo86705j(gVar, textView4);
            }
            this.f308852n = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f308851m.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f308851m.mo51675b();
        try {
            super.onDestroy();
            this.f308855q = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C47573bx u = this.f308851m.mo51694u();
        try {
            boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            if (u != null) {
                u.close();
            }
            return onMenuItemSelected;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f308851m.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f308851m.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f308851m.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f308851m.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f308851m.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f308851m.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        C47573bx w = C47831fm.m85028w();
        try {
            boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            w.close();
            return onPrepareOptionsMenu;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f308851m.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f308851m.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f308851m.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f308851m.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f308851m.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f308851m.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C110859c.m184602a(th, th);
        }
        throw th;
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C110866j jVar = this.f308850l;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f308855q) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}

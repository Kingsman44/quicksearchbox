package com.google.android.apps.search.googleapp.activity;

import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.core.content.p091b.C1874w;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.apps.search.googleapp.accounts.C133152b;
import com.google.android.apps.search.googleapp.activity.p10136a.C133376f;
import com.google.android.apps.search.googleapp.p10310h.C136126g;
import com.google.android.apps.search.googleapp.p10527u.C139761b;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.pixelsuggest.C136894d;
import com.google.android.apps.search.googleapp.pixelsuggest.C136895e;
import com.google.android.apps.search.googleapp.pixelsuggest.C136896f;
import com.google.android.apps.search.googleapp.pixelsuggest.PixelSuggestHelper$animateSuggest$5;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.baseclasses.C47212h;
import com.google.apps.tiktok.inject.p3659d.C47237f;
import com.google.apps.tiktok.inject.p3659d.C47241j;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3680d.C47401a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47762d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47818f;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.C47849i;
import com.google.apps.tiktok.tracing.C47851k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.C59668bv;
import com.google.common.p4552o.C60547ty;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68314a;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class GoogleAppActivity extends C133400ax implements C47231d, C47211g {

    /* renamed from: k */
    private C133387ak f363411k;

    /* renamed from: l */
    private final C47851k f363412l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f363413m;

    /* renamed from: n */
    private Context f363414n;

    /* renamed from: o */
    private C2393x f363415o;

    /* renamed from: p */
    private boolean f363416p;

    public GoogleAppActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: A */
    private final void m216448A() {
        if (this.f363411k != null) {
            return;
        }
        if (!this.f363413m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f363416p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo111128y().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f363411k = ((C133390an) mo111128y().mo17653jN()).mo111123aN();
                    a2.close();
                    this.f363411k.f363477q = this;
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C133427f.m216565a(th, th);
                }
            } catch (Throwable th2) {
                C133427f.m216565a(th, th2);
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
            baseContext = this.f363414n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f363414n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f363414n = null;
    }

    public final void finish() {
        m216448A();
        this.f363411k.mo111121j();
    }

    public final C2384o getLifecycle() {
        if (this.f363415o == null) {
            this.f363415o = new C47212h(this);
        }
        return this.f363415o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f363412l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f363412l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f363412l.mo51674a();
        try {
            m216448A();
            C133387ak akVar = this.f363411k;
            C133444w e = akVar.mo111116e();
            if (e == null || !e.mo111154k()) {
                super.onBackPressed();
            }
            a.close();
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f363412l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Throwable th;
        ImageView imageView;
        ViewGroup viewGroup;
        ImageView imageView2;
        ImageView imageView3;
        View findViewById;
        C133395as asVar;
        Bundle bundle2 = bundle;
        C47573bx s = this.f363412l.mo51692s();
        try {
            this.f363413m = true;
            m216448A();
            ((C47212h) getLifecycle()).mo51120i(this.f363412l);
            ((C47237f) mo111128y().mo17653jN()).mo51141bP().mo50899a();
            m216448A();
            C133387ak akVar = this.f363411k;
            C47558bi a = C47831fm.m85006a("GoogleAppActivityPeer#onCreate");
            try {
                super.onCreate(bundle2);
                GoogleAppActivity googleAppActivity = akVar.f363455d;
                if (C133428g.m216566a(googleAppActivity, googleAppActivity.getIntent())) {
                    Duration ofNanos = Duration.ofNanos(akVar.f363457f.mo26872d());
                    long millis = ofNanos.toMillis();
                    akVar.f363467p.mo115168a(akVar.f363455d);
                    akVar.mo111120i(new C133379ac(akVar, millis));
                    akVar.f363455d.setTheme(2132150662);
                    akVar.f363463l.mo110996d(akVar.f363455d, R.layout.googleapp_activity, 2132150663);
                    ((FirstDrawObservableCoordinatorLayout) akVar.f363455d.mo1322k().mo1177e(R.id.googleapp_root)).f363410i.add(new C133380ad(akVar));
                    if (bundle2 == null) {
                        akVar.f363461j.mo41627a(ofNanos, akVar.f363455d);
                        C89922b bVar = akVar.f363458g;
                        C60547ty tyVar = C60547ty.GOOGLE_APP_ACTIVITY;
                        GoogleAppActivity googleAppActivity2 = akVar.f363455d;
                        bVar.mo83758b(tyVar, googleAppActivity2.getClass(), C58833ax.m90834k(googleAppActivity2.getIntent()), millis, false);
                    } else {
                        if (bundle2.containsKey("accountSwitchMainFragmentParams")) {
                            asVar = (C133395as) ProtoParsers.m95520c(bundle2, "accountSwitchMainFragmentParams", C133395as.f363478e, C62921ba.f169869a);
                            akVar.f363466o = asVar;
                            akVar.f363454c = Instant.ofEpochMilli(bundle2.getLong("lastOnStopTimestampMs", -1));
                            akVar.f363460i = bundle2.getBoolean("hasNonIncognitoAccountSelected", false);
                        }
                        asVar = null;
                        akVar.f363466o = asVar;
                        akVar.f363454c = Instant.ofEpochMilli(bundle2.getLong("lastOnStopTimestampMs", -1));
                        akVar.f363460i = bundle2.getBoolean("hasNonIncognitoAccountSelected", false);
                    }
                    Optional a2 = akVar.f363459h.mo115169a();
                    if (akVar.f363462k && bundle2 == null && a2.isPresent() && ((String) a2.get()).equals("and.gsa.launcher.allapps.appssearch") && akVar.f363464m.f372595b != null) {
                        View inflate = ((ViewStub) akVar.f363455d.mo1322k().mo1177e(R.id.googleapp_pixel_search_overlay)).inflate();
                        ViewGroup viewGroup2 = (ViewGroup) akVar.f363455d.mo1322k().mo1177e(R.id.googleapp_content);
                        C136895e eVar = akVar.f363464m;
                        GoogleAppActivity googleAppActivity3 = akVar.f363455d;
                        C69664n.m101061g(inflate, "overlayView");
                        C69664n.m101061g(viewGroup2, "contentView");
                        C136896f fVar = eVar.f372594a;
                        if (fVar != null) {
                            Bitmap bitmap = eVar.f372595b;
                            eVar.f372595b = null;
                            if (!(bitmap == null || (imageView = (ImageView) inflate.findViewById(R.id.googleapp_pixel_all_apps)) == null || (viewGroup = (ViewGroup) inflate.findViewById(R.id.googleapp_pixel_search_box_container)) == null || (imageView2 = (ImageView) inflate.findViewById(R.id.googleapp_pixel_superg)) == null || (imageView3 = (ImageView) inflate.findViewById(R.id.googleapp_pixel_mic_icon)) == null || (findViewById = inflate.findViewById(R.id.googleapp_pixel_search_hairline)) == null)) {
                                Resources resources = inflate.getResources();
                                float f = (float) fVar.f372598b;
                                imageView.setTranslationY(f);
                                imageView.setImageBitmap(bitmap);
                                imageView.setVisibility(0);
                                int i = fVar.f372599c;
                                viewGroup.setPadding(0, i, 0, 0);
                                viewGroup.setVisibility(0);
                                float a3 = C1874w.m5104a(resources, R.dimen.googleapp_pixel_superg_scale);
                                imageView2.setTranslationX(resources.getDimension(R.dimen.googleapp_pixel_superg_offset));
                                imageView2.setScaleX(a3);
                                imageView2.setScaleY(a3);
                                imageView3.setTranslationX(resources.getDimension(R.dimen.googleapp_pixel_mic_icon_offset));
                                findViewById.setAlpha(0.0f);
                                viewGroup2.setVisibility(4);
                                eVar.f372596c = new C136894d(viewGroup2, inflate, i, f, imageView, imageView2, imageView3, findViewById, resources);
                                googleAppActivity3.getLifecycle().mo5790b(new PixelSuggestHelper$animateSuggest$5(eVar));
                            }
                        }
                    }
                }
            } catch (C62974ct e) {
                ((C58970a) ((C58970a) ((C58970a) C133387ak.f363452a.mo56226d()).mo56382g(e)).mo56372aa(40042)).mo56389s("failed to parse bundle for key %s", "accountSwitchMainFragmentParams");
            } catch (Throwable th2) {
                th = th2;
                a.close();
                throw th;
            }
            a.close();
            C47389c.m84226a(this).f123128b = mo1322k().mo1177e(16908290);
            C47393f.m84231b(this, C133152b.class, new C133388al(this.f363411k));
            this.f363413m = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            if (s != null) {
                try {
                    ((C47818f) s).f123842a.mo51690q();
                } catch (Throwable th5) {
                    C133427f.m216565a(th4, th5);
                }
            }
            throw th4;
        }
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f363412l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f363412l.mo51675b();
        try {
            super.onDestroy();
            this.f363416p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f363412l.mo51676c(intent);
        try {
            m216448A();
            C133387ak akVar = this.f363411k;
            super.onNewIntent(intent);
            if (C133428g.m216566a(akVar.f363455d, intent)) {
                Intent intent2 = akVar.f363455d.getIntent();
                akVar.f363467p.mo115168a(akVar.f363455d);
                C133444w e = akVar.mo111116e();
                if (e != null) {
                    e.mo111149f(intent2);
                    e.mo111147d(intent2);
                    if (C136126g.m221193g(intent2)) {
                        if (!akVar.f363454c.isBefore(Instant.EPOCH)) {
                            Duration minus = C133387ak.f363453b.minus(Duration.between(akVar.f363454c, Instant.ofEpochMilli(akVar.f363457f.mo26870b())));
                            if (!minus.isNegative() && !minus.isZero()) {
                                if (e.f363624i.mo112802a() || e.f363606O != C139779t.HOME_SCREEN) {
                                    if (e.f363601J.mo113716a() || e.f363606O != C139779t.SEARCH) {
                                        C133376f fVar = e.f363595D;
                                        C139779t tVar = e.f363606O;
                                        tVar.getClass();
                                        Optional b = fVar.mo111110b(tVar);
                                        if (b.isPresent() && ((C139761b) b.get()).mo111226i()) {
                                            C133376f fVar2 = e.f363595D;
                                            C139779t tVar2 = e.f363606O;
                                            tVar2.getClass();
                                            fVar2.mo111110b(tVar2).ifPresent(C133442u.f363589a);
                                        }
                                    }
                                }
                                C139765f fVar3 = (C139765f) C139767h.f379869k.createBuilder();
                                C139779t tVar3 = C139779t.HOME_SCREEN;
                                fVar3.copyOnWrite();
                                C139767h hVar = (C139767h) fVar3.instance;
                                hVar.f379872b = tVar3.f379907i;
                                hVar.f379871a |= 1;
                                e.mo111150g((C139767h) fVar3.build());
                            }
                        }
                    }
                }
                akVar.f363456e.mo50078a(intent2, new C133386aj(akVar, e, intent2));
            }
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f363412l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f363412l.mo51677d();
        try {
            m216448A();
            C133387ak akVar = this.f363411k;
            super.onPause();
            akVar.mo111120i(new C133381ae(akVar));
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f363412l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f363412l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f363412l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
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
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    public final void onProvideAssistContent(AssistContent assistContent) {
        m216448A();
        C133387ak akVar = this.f363411k;
        super.onProvideAssistContent(assistContent);
        C133444w e = akVar.mo111116e();
        if (e != null && !e.f363611T.f101930a) {
            C133376f fVar = e.f363595D;
            C139779t tVar = e.f363606O;
            tVar.getClass();
            fVar.mo111111c(tVar, C133416bc.class).ifPresent(new C133443v(assistContent));
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f363412l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f363412l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f363412l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            m216448A();
            C133387ak akVar = this.f363411k;
            C133395as asVar = akVar.f363466o;
            if (asVar != null) {
                bundle.putParcelable("accountSwitchMainFragmentParams", new ProtoParsers.InternalDontUse((byte[]) null, asVar));
            }
            bundle.putLong("lastOnStopTimestampMs", akVar.f363454c.toEpochMilli());
            bundle.putBoolean("hasNonIncognitoAccountSelected", akVar.f363460i);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f363412l.mo51680g();
        try {
            m216448A();
            C133387ak akVar = this.f363411k;
            Duration ofNanos = Duration.ofNanos(akVar.f363457f.mo26872d());
            super.onStart();
            akVar.f363461j.mo41628b(ofNanos, akVar.f363455d);
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f363412l.mo51681h();
        try {
            m216448A();
            C133387ak akVar = this.f363411k;
            akVar.f363454c = Instant.ofEpochMilli(akVar.f363457f.mo26870b());
            super.onStop();
            akVar.f363458g.mo83761e(C59668bv.STARTUP_CANCEL_ACTIVITY_STOPPED);
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f363412l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133427f.m216565a(th, th);
        }
        throw th;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m216448A();
        C133444w e = this.f363411k.mo111116e();
        if (e != null) {
            C133376f fVar = e.f363595D;
            C139779t tVar = e.f363606O;
            tVar.getClass();
            fVar.mo111111c(tVar, C133423bj.class).ifPresent(new C133439r(z));
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* renamed from: v */
    public final C133387ak mo17754z() {
        C133387ak akVar = this.f363411k;
        if (akVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f363416p) {
            return akVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* renamed from: w */
    public final /* synthetic */ C68314a mo111106w() {
        return new C47241j(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo111107x() {
        super.finish();
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}

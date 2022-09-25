package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.p197u.C4230o;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl.BrightnessDataServiceImpl;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.p9801a.C129171a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.k */
/* compiled from: PG */
public final class C129212k extends C129177ad implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129217p f354929a;

    /* renamed from: c */
    private Context f354930c;

    /* renamed from: d */
    private final C2393x f354931d = new C2393x(this);

    /* renamed from: e */
    private boolean f354932e;

    @Deprecated
    public C129212k() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129217p mo17754z() {
        C129217p pVar = this.f354929a;
        if (pVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f354932e) {
            return pVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo108881b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f354930c == null) {
            this.f354930c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f354930c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f354931d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129211j.m210935a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            mo17754z().f354940b.setEnterTransition(new C4230o());
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129211j.m210935a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C129217p a = mo17754z();
            if (!a.f354945g.f136792b.isEmpty()) {
                C59104x b = C129217p.f354939a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "SettingNativeSliderCard");
                ((C59052c) ((C59052c) b).mo56372aa(38144)).mo56386p("SettingUri is present, use phone buddy flow.");
                a.f354944f.mo50707a(a.f354942d.mo108894b(a.f354945g.f136792b), a.f354946h);
                a.f354944f.mo50707a(a.f354942d.mo108893a(a.f354945g.f136792b), a.f354947i);
            } else if (C129171a.f354823a.contains(a.f354945g.f136797g)) {
                C59104x b2 = C129217p.f354939a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "SettingNativeSliderCard");
                ((C59052c) ((C59052c) b2).mo56372aa(38143)).mo56389s("Setting is supported by legacy flow %s", a.f354945g.f136797g);
                if (a.f354945g.f136797g.equals(C63490p.BRIGHTNESS_LEVEL.name())) {
                    a.f354943e.mo108892b();
                    a.f354944f.mo50707a(a.f354943e.mo108891a(), a.f354948j);
                }
            } else {
                C59104x d = C129217p.f354939a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SettingNativeSliderCard");
                ((C59052c) ((C59052c) d).mo56372aa(38142)).mo56389s("Unsupported setting %s", a.f354945g.f136797g);
            }
            View inflate = layoutInflater.inflate(R.layout.assistant_ma_settings_native_slider_card, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C129211j.m210935a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f354932e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129211j.m210935a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C129211j.m210935a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C129217p a = mo17754z();
            ((TextView) view.findViewById(R.id.assistant_setting_text)).setText(a.f354945g.f136793c);
            SeekBar seekBar = (SeekBar) view.findViewById(R.id.assistant_setting_seek_bar);
            if (!a.f354945g.f136794d) {
                C58976aa aaVar = C58975e.f156826a;
                seekBar.setEnabled(false);
            } else {
                seekBar.setEnabled(true);
                seekBar.setOnSeekBarChangeListener(a.f354949k);
            }
            if (C129171a.f354823a.contains(a.f354945g.f136797g)) {
                ((ImageView) view.findViewById(R.id.assistant_setting_icon)).setImageDrawable(a.f354941c.getDrawable(R.drawable.quantum_ic_settings_grey600_48));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129211j.m210935a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f354932e) {
                super.onAttach(context);
                if (this.f354929a == null) {
                    Object jN = mo108882d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C129212k) {
                        C129212k kVar = (C129212k) fragment;
                        C68225k.m98532d(kVar);
                        this.f354929a = new C129217p(kVar, (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), ((C74176nj) jN).mo69446V(), new BrightnessDataServiceImpl((Context) ((C74176nj) jN).f206677a.g.mo17428b(), (C46877q) ((C74176nj) jN).f206730b.f198100bT.mo17428b(), (C2384o) ((C74176nj) jN).f207048h.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C60887da) ((C74176nj) jN).f206677a.n.mo17428b(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), (C46723bg) ((C74176nj) jN).f206677a.ap.mo17428b()), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69848hf(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f354931d));
                    } else {
                        String obj = C129217p.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C129211j.m210935a(th2, th3);
            }
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}

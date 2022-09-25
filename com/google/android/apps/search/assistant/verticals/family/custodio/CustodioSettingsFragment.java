package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.verticals.family.custodio.C132246dc;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58485gu;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* compiled from: PG */
public final class CustodioSettingsFragment extends C132322fp implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C132246dc f360563a;

    /* renamed from: c */
    private Context f360564c;

    /* renamed from: d */
    private final C2393x f360565d = new C2393x(this);

    /* renamed from: e */
    private boolean f360566e;

    @Deprecated
    public CustodioSettingsFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C132246dc mo17754z() {
        C132246dc dcVar = this.f360563a;
        if (dcVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f360566e) {
            return dcVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo110436b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f360564c == null) {
            this.f360564c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f360564c;
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
        return this.f360565d;
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
            C132238cw.m214899a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C132246dc a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_fragment_custodio_settings, viewGroup, false);
            inflate.findViewById(R.id.assistant_custodio_settings_fragment_subtitle_link).setOnClickListener(new C132239cx(a));
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.assistant_custodio_settings_fragment_list);
            linearLayout.removeAllViews();
            View inflate2 = LayoutInflater.from(a.f360948c.requireContext()).inflate(R.layout.assistant_custodio_settings_fragment_item, linearLayout, false);
            linearLayout.addView(inflate2);
            Button button = (Button) inflate2.findViewById(R.id.assistant_custodio_settings_fragment_item_edit_button);
            button.setText(R.string.assistant_custodio_settings_fragment_media_item_button);
            button.setOnClickListener(new C132240cy(a));
            View inflate3 = LayoutInflater.from(a.f360948c.requireContext()).inflate(R.layout.assistant_custodio_settings_fragment_item, linearLayout, false);
            linearLayout.addView(inflate3);
            Button button2 = (Button) inflate3.findViewById(R.id.assistant_custodio_settings_fragment_item_edit_button);
            button2.setText(R.string.assistant_custodio_settings_fragment_features_item_button);
            button2.setOnClickListener(new C132241cz(a));
            View inflate4 = LayoutInflater.from(a.f360948c.requireContext()).inflate(R.layout.assistant_custodio_settings_fragment_item, linearLayout, false);
            linearLayout.addView(inflate4);
            Button button3 = (Button) inflate4.findViewById(R.id.assistant_custodio_settings_fragment_item_edit_button);
            button3.setText(R.string.assistant_custodio_settings_fragment_downtime_item_button);
            button3.setOnClickListener(new C132244da(a));
            if (!a.f360954i) {
                inflate4.setVisibility(8);
            }
            String string = a.f360949d.getString("entry_point_id");
            String string2 = a.f360949d.getString("supervised_oid");
            if (string2 == null || string == null) {
                throw new IllegalStateException("CustodioSettingsFragmentPeer not provided required argument!");
            }
            C132246dc.C132247a aVar = a.f360953h;
            View findViewById = inflate.findViewById(R.id.assistant_custodio_settings_fragment_bottom_bar);
            aVar.f360957a = (ProgressBar) inflate.findViewById(R.id.assistant_custodio_settings_fragment_progress_bar);
            aVar.f360958b = (ScrollView) inflate.findViewById(R.id.assistant_custodio_settings_fragment_scroll_view);
            aVar.f360959c = findViewById;
            aVar.f360960d = (Button) inflate.findViewById(R.id.assistant_custodio_settings_fragment_next_button);
            aVar.f360961e = (TextView) inflate.findViewById(R.id.assistant_custodio_settings_fragment_title);
            aVar.f360962f = (TextView) inflate.findViewById(R.id.assistant_custodio_settings_fragment_subtitle);
            aVar.f360963g = inflate2;
            aVar.f360964h = inflate3;
            aVar.f360965i = inflate4;
            a.f360951f.mo50707a(a.f360952g.mo110501a(string, C58485gu.m89846n(string2), false), a.f360953h);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C132238cw.m214899a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f360566e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C132238cw.m214899a(th, th);
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
            C132238cw.m214899a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            mo17754z().f360956k.mo19974a(C37176a.f96941cF);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C132238cw.m214899a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            mo17754z().f360956k.mo19974a(C37176a.f96940cE);
            e.close();
            return;
        } catch (Throwable th) {
            C132238cw.m214899a(th, th);
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
            if (!this.f360566e) {
                super.onAttach(context);
                if (this.f360563a == null) {
                    Object jN = mo110631d().mo17653jN();
                    Activity activity = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof CustodioSettingsFragment) {
                        CustodioSettingsFragment custodioSettingsFragment = (CustodioSettingsFragment) fragment;
                        C68225k.m98532d(custodioSettingsFragment);
                        this.f360563a = new C132246dc(activity, custodioSettingsFragment, (C46485f) ((C74176nj) jN).f206995g.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C132140a) ((C74176nj) jN).f206730b.f198027a.f199474fh.mo17428b(), ((C74176nj) jN).f206677a.d.mo67720aW().mo60449b(), ((C74176nj) jN).f206677a.d.mo67720aW().mo60450c(), (C37215b) ((C74176nj) jN).f206730b.f198067an.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f360565d));
                    } else {
                        String obj = C132246dc.class.toString();
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
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C132238cw.m214899a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}

package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p096h.C1951d;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.p9498b.C126714a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.android.setupcompat.template.C45276c;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.p3555d.C45295c;
import com.google.android.setupdesign.view.RichTextView;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58836b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ar */
/* compiled from: PG */
public final class C126704ar extends C126715ba implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C126708av f348939a;

    /* renamed from: c */
    private Context f348940c;

    /* renamed from: d */
    private final C2393x f348941d = new C2393x(this);

    /* renamed from: e */
    private boolean f348942e;

    @Deprecated
    public C126704ar() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C126704ar m207209a(AccountId accountId, String str) {
        C126704ar arVar = new C126704ar();
        C68324h.m98669f(arVar);
        C47247a.m84047b(arVar, accountId);
        C47243l.m84040b(arVar, str);
        return arVar;
    }

    /* renamed from: b */
    public final C126708av mo17754z() {
        C126708av avVar = this.f348939a;
        if (avVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f348942e) {
            return avVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo107700d() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f348940c == null) {
            this.f348940c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f348940c;
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
        return this.f348941d;
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
            C126703aq.m207208a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C126708av b = mo17754z();
            Bundle extras = b.f348948d.getActivity().getIntent().getExtras();
            GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(R.layout.assistant_suw_settings_fragment, viewGroup, false);
            boolean z = extras.getBoolean("intent_extra_enable_t_ui", false);
            boolean z2 = extras.getBoolean("intent_extra_vm_enabled", false);
            String string = b.f348947c.getString(R.string.assistant_suw_intro_screen_default_x_google_hotword);
            if (extras != null && extras.containsKey("intent_extra_x_google_hotword")) {
                string = extras.getString("intent_extra_x_google_hotword");
            }
            String string2 = b.f348947c.getString(R.string.assistant_suw__device_type_device);
            String string3 = extras.getString("intent_extra_given_name");
            if (extras != null && string3 != null && extras.containsKey("intent_extra_use_unicorn_flow") && extras.getBoolean("intent_extra_use_unicorn_flow") && extras.containsKey("intent_extra_given_name") && !TextUtils.isEmpty(extras.getString("intent_extra_given_name")) && extras.containsKey("intent_extra_standard_gender")) {
                int i = extras.getInt("intent_extra_standard_gender");
                String str = "other";
                if (i == 1) {
                    str = "male";
                } else if (i == 2) {
                    str = "female";
                }
                if (z) {
                    glifLayout.mo49197s(C5114a.m13988b(Locale.getDefault(), b.f348947c.getString(R.string.assistant_suw_settings_screen_title_for_unicorn_t), "GENDER", str, "GIVEN_NAME", string3));
                    if (b.f348950f.mo56113h()) {
                        if (z2) {
                            glifLayout.mo49195q(((C126714a) b.f348950f.mo56107c()).mo107721d());
                        } else {
                            glifLayout.mo49195q(((C126714a) b.f348950f.mo56107c()).mo107720c());
                        }
                    }
                    glifLayout.findViewById(R.id.assistant_suw_settings_item_2_container).setVisibility(0);
                    glifLayout.findViewById(R.id.assistant_suw_settings_hint_container).setVisibility(8);
                    ((TextView) glifLayout.findViewById(R.id.assistant_suw_settings_item_title_1)).setText(b.f348947c.getString(R.string.assistant_suw_settings_screen_item_title_for_unicorn_1_t));
                    ((TextView) glifLayout.findViewById(R.id.assistant_suw_settings_item_title_2)).setText(b.f348947c.getString(R.string.assistant_suw_settings_screen_item_title_for_unicorn_2_t));
                    TextView textView = (TextView) glifLayout.findViewById(R.id.assistant_suw_settings_item_summary_1);
                    TextView textView2 = (TextView) glifLayout.findViewById(R.id.assistant_suw_settings_item_summary_2);
                    textView.setText(C1951d.m5280a(C5114a.m13988b(Locale.getDefault(), b.f348947c.getString(true != z2 ? R.string.assistant_suw_settings_screen_item_summary_for_unicorn_1_t_vm_off : R.string.assistant_suw_settings_screen_item_summary_for_unicorn_1_t_vm_on, new Object[]{string}), "GENDER", str, "GIVEN_NAME", string3), 63));
                    textView2.setText(C5114a.m13988b(Locale.getDefault(), b.f348947c.getString(R.string.assistant_suw_settings_screen_item_summary_for_unicorn_2_t), "GENDER", str, "GIVEN_NAME", string3));
                    ((ImageView) glifLayout.findViewById(R.id.assistant_suw_settings_item_icon_1)).setImageDrawable(b.f348947c.getDrawable(R.drawable.gs_account_circle_vd_theme_24));
                    ((ImageView) glifLayout.findViewById(R.id.assistant_suw_settings_item_icon_2)).setImageDrawable(b.f348947c.getDrawable(R.drawable.gs_magic_button_vd_theme_24));
                } else {
                    glifLayout.mo49197s(C5114a.m13988b(Locale.getDefault(), b.f348947c.getString(R.string.assistant_suw_settings_screen_title_for_unicorn, new Object[]{string2}), "GENDER", str, "GIVEN_NAME", string3));
                    ((RichTextView) glifLayout.findViewById(R.id.assistant_suw_settings_item_summary_1)).setText(C5114a.m13988b(Locale.getDefault(), b.f348947c.getString(R.string.assistant_suw_settings_screen_item_summary_v2_for_unicorn, new Object[]{string2, string}), "GENDER", str, "GIVEN_NAME", string3));
                    ((TextView) glifLayout.findViewById(R.id.assistant_suw_settings_screen_hint)).setText(C1951d.m5280a(C5114a.m13988b(Locale.getDefault(), b.f348947c.getString(R.string.assistant_suw_settings_screen_hint_for_unicorn), "GENDER", str, "GIVEN_NAME", string3), 63));
                }
            } else if (z) {
                glifLayout.mo49197s(b.f348947c.getString(R.string.assistant_suw_settings_screen_title_t));
                if (b.f348950f.mo56113h()) {
                    if (z2) {
                        glifLayout.mo49195q(((C126714a) b.f348950f.mo56107c()).mo107721d());
                    } else {
                        glifLayout.mo49195q(((C126714a) b.f348950f.mo56107c()).mo107720c());
                    }
                }
                glifLayout.findViewById(R.id.assistant_suw_settings_item_2_container).setVisibility(0);
                glifLayout.findViewById(R.id.assistant_suw_settings_hint_container).setVisibility(8);
                ((TextView) glifLayout.findViewById(R.id.assistant_suw_settings_item_title_1)).setText(b.f348947c.getString(R.string.assistant_suw_settings_screen_item_title_1_t));
                ((TextView) glifLayout.findViewById(R.id.assistant_suw_settings_item_title_2)).setText(b.f348947c.getString(R.string.assistant_suw_settings_screen_item_title_2_t));
                TextView textView3 = (TextView) glifLayout.findViewById(R.id.assistant_suw_settings_item_summary_1);
                TextView textView4 = (TextView) glifLayout.findViewById(R.id.assistant_suw_settings_item_summary_2);
                textView3.setText(C1951d.m5280a(b.f348947c.getString(true != z2 ? R.string.assistant_suw_settings_screen_item_summary_1_t_vm_off : R.string.assistant_suw_settings_screen_item_summary_1_t_vm_on, new Object[]{string}), 63));
                textView4.setText(b.f348947c.getString(R.string.assistant_suw_settings_screen_item_summary_2_t));
                ((ImageView) glifLayout.findViewById(R.id.assistant_suw_settings_item_icon_1)).setImageDrawable(b.f348947c.getDrawable(R.drawable.gs_account_circle_vd_theme_24));
            } else {
                glifLayout.mo49197s(b.f348947c.getString(R.string.assistant_suw_settings_screen_title, new Object[]{string2}));
                ((RichTextView) glifLayout.findViewById(R.id.assistant_suw_settings_item_summary_1)).setText(b.f348947c.getString(R.string.assistant_suw_settings_screen_item_summary_v2, new Object[]{string2, string}));
            }
            b.f348951g.mo50708b(b.f348949e.mo50244a(b.f348946b), C46788de.DONT_CARE, new C126707au());
            int[] iArr = {R.id.assistant_suw_settings_item_title_1, R.id.assistant_suw_settings_item_summary_1, R.id.assistant_suw_settings_item_title_2, R.id.assistant_suw_settings_item_summary_2, R.id.assistant_suw_settings_screen_hint};
            C45295c cVar = (C45295c) glifLayout.mo49129j(C45295c.class);
            for (int i2 = 0; i2 < 5; i2++) {
                ((TextView) glifLayout.findViewById(iArr[i2])).setTypeface(Typeface.create(cVar.mo49224a().getTypeface(), 0));
            }
            ImageView imageView = (ImageView) glifLayout.findViewById(R.id.assistant_settings_image);
            if (z && b.f348950f.mo56113h()) {
                imageView.setImageDrawable(((C126714a) b.f348950f.mo56107c()).mo107719b());
                imageView.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), imageView.getPaddingRight(), b.f348947c.getResources().getDimensionPixelSize(R.dimen.assistant_setupwizard_items_padding_bottom_extra));
            } else if (C126728o.m207280e(b.f348947c)) {
                imageView.setImageDrawable(b.f348947c.getDrawable(R.drawable.assistant_lockscreen_dark));
            } else {
                imageView.setImageDrawable(b.f348947c.getDrawable(R.drawable.assistant_lockscreen));
            }
            b.f348958n.mo107697c(glifLayout);
            C126702ap apVar = b.f348958n;
            C45276c cVar2 = new C45276c(b.f348947c);
            cVar2.mo49181b(R.string.assistant_suw_settings_screen_action_button_text);
            cVar2.f118281b = new C126705as(b);
            cVar2.f118282c = 5;
            cVar2.f118283d = 2132150157;
            apVar.f348934e = cVar2.mo49180a();
            C126702ap apVar2 = b.f348958n;
            C45276c cVar3 = new C45276c(b.f348947c);
            cVar3.mo49181b(R.string.assistant_suw_settings_screen_cancel_button_text);
            cVar3.f118281b = new C126706at(b);
            cVar3.f118282c = 7;
            cVar3.f118283d = 2132150158;
            apVar2.f348935f = cVar3.mo49180a();
            apVar2.f348932c = false;
            b.f348958n.mo107698d();
            b.f348952h.mo33802c(glifLayout, b.f348953i.mo33805a(C28427h.m53115a(149914)));
            View findViewById = glifLayout.findViewById(R.id.assistant_suw_empty_action_button);
            View findViewById2 = glifLayout.findViewById(R.id.assistant_suw_empty_cancel_button);
            b.f348952h.mo33802c(findViewById, b.f348953i.mo33805a(C28427h.m53115a(149916)));
            b.f348952h.mo33802c(findViewById2, b.f348953i.mo33805a(C28427h.m53115a(149917)));
            C47831fm.m85019n();
            return glifLayout;
        } catch (Throwable th2) {
            C126703aq.m207208a(th, th2);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f348942e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C126703aq.m207208a(th, th);
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
            C126703aq.m207208a(th, th);
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
            if (!this.f348942e) {
                super.onAttach(context);
                if (this.f348939a == null) {
                    Object jN = mo107722f().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C46175b bVar = (C46175b) ((C74176nj) jN).f206730b.f198398h.mo17428b();
                    C36624a aVar = (C36624a) ((C74176nj) jN).f206730b.f198093bM.mo17428b();
                    C58836b bVar2 = C58836b.f156633a;
                    C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                    C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                    C28310af afVar = (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b();
                    C28443m mVar = (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C126704ar) {
                        C126704ar arVar = (C126704ar) fragment;
                        C68225k.m98532d(arVar);
                        boolean a = ((C74176nj) jN).f206730b.f198027a.mo66983fx().mo60459a();
                        String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                        C68225k.m98532d(b);
                        this.f348939a = new C126708av(accountId, bVar, aVar, bVar2, dpVar, abVar, afVar, mVar, context2, arVar, a, b);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f348941d));
                    } else {
                        String obj = C126708av.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = this.f122869b;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
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
                C126703aq.m207208a(th2, th3);
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

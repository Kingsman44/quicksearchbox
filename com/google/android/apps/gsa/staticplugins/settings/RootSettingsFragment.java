package com.google.android.apps.gsa.staticplugins.settings;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p094f.C1888a;
import androidx.core.p098j.C2043bi;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import com.android.settingslib.widget.FooterPreference;
import com.google.android.apps.gsa.nga.api.C74709bj;
import com.google.android.apps.gsa.nga.api.C74712bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.staticplugins.settings.preferences.ImagePreference;
import com.google.android.apps.gsa.staticplugins.settings.preferences.ViewHolderPreference;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;

/* compiled from: PG */
public class RootSettingsFragment extends C117332w {

    /* renamed from: e */
    public static final C59071e f325604e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.settings.RootSettingsFragment");

    /* renamed from: f */
    public C91090a f325605f;

    /* renamed from: g */
    public C28310af f325606g;

    /* renamed from: h */
    public C28443m f325607h;

    /* renamed from: i */
    public SharedPreferences f325608i;

    /* renamed from: j */
    public C58833ax f325609j;

    /* renamed from: k */
    public C58833ax f325610k;

    /* renamed from: l */
    public boolean f325611l;

    /* renamed from: m */
    public C22871g f325612m;

    /* renamed from: n */
    public C86124t f325613n;

    /* renamed from: o */
    C28452b f325614o;

    /* renamed from: p */
    public C117327r f325615p;

    /* renamed from: q */
    public C117320l f325616q;

    /* renamed from: r */
    private View f325617r;

    /* renamed from: p */
    private final void m194940p() {
        C58485gu guVar = this.f325616q.f325667a;
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= i) {
                break;
            }
            C117329t tVar = (C117329t) guVar.get(i2);
            Preference l = mo8412gi().mo8382l(tVar.f325686a);
            if (l != null) {
                l.f12753y = Boolean.valueOf(tVar.mo103261a());
                if (!((Boolean) this.f325609j.mo56106b(C117333x.f325701a).mo56109e(false)).booleanValue() || !((Boolean) tVar.f325690e.mo6453a()).booleanValue() || !tVar.f325688c.mo79746e(tVar.f325687b)) {
                    z = false;
                }
                l.mo8348O(z);
                if (l.f12754z) {
                    if (this.f325611l) {
                        l.mo8339F(false);
                    } else {
                        C22871g gVar = this.f325612m;
                        Objects.requireNonNull(l);
                        new C90873ag((C60870cx) tVar.f325689d.apply(tVar.f325686a), gVar, "RootSettingsFragment.updateEnabledStatus", new C117334y(l)).mo85223a(C117335z.f325703a);
                    }
                }
                mo103250n(l);
            }
            i2++;
        }
        ImagePreference imagePreference = (ImagePreference) mo8411gg("assistant_android_settings_illustration_nga");
        ImagePreference imagePreference2 = (ImagePreference) mo8411gg("assistant_android_settings_illustration_opa");
        ImagePreference imagePreference3 = (ImagePreference) mo8411gg("assistant_android_settings_illustration_unified");
        if (!(imagePreference == null || imagePreference2 == null || imagePreference3 == null)) {
            if (!((Boolean) this.f325609j.mo56106b(C117333x.f325701a).mo56109e(false)).booleanValue()) {
                imagePreference2.mo8348O(true);
                imagePreference.mo8348O(false);
                imagePreference3.mo8348O(false);
            } else if (this.f325613n.mo79746e(C90059dk.f249179q)) {
                imagePreference2.mo8348O(false);
                imagePreference.mo8348O(false);
                imagePreference3.mo8348O(true);
            } else {
                imagePreference2.mo8348O(false);
                imagePreference.mo8348O(true);
                imagePreference3.mo8348O(false);
            }
        }
        C74712bm bmVar = (C74712bm) ((C58847bk) this.f325610k).f156646a;
        if (this.f325613n.mo79746e(C90126fx.f251077bx)) {
            C0167am activity = getActivity();
            ViewHolderPreference viewHolderPreference = (ViewHolderPreference) mo8411gg("assistant_android_settings_error_bubble");
            if (activity != null && viewHolderPreference != null) {
                C58833ax c = bmVar.mo71073c(activity);
                if (c.mo56113h()) {
                    View view = (View) c.mo56107c();
                    viewHolderPreference.f325682a = view;
                    viewHolderPreference.mo8348O(true);
                    viewHolderPreference.mo8317e();
                    viewHolderPreference.mo8348O(true);
                    if (view instanceof C74709bj) {
                        C74709bj bjVar = (C74709bj) view;
                        bjVar.mo71070b(new C117304aa(this, viewHolderPreference));
                        bjVar.mo71069a(new C117305ab(this, viewHolderPreference));
                    }
                } else {
                    viewHolderPreference.f325682a = null;
                    viewHolderPreference.mo8317e();
                }
                mo103250n(viewHolderPreference);
                View view2 = this.f325617r;
                if (view2 != null) {
                    C58833ax d = bmVar.mo71074d(view2);
                    if (d.mo56113h()) {
                        ((Snackbar) d.mo56107c()).mo48343h();
                    }
                }
            }
        }
    }

    /* renamed from: fZ */
    public final void mo8407fZ(Bundle bundle, String str) {
        Preference l;
        Preference l2;
        Preference l3;
        this.f12807b.f12831c = new C117309af(this.f325608i, this.f325616q);
        mo8408ga(R.xml.assistant_android_settings);
        mo8408ga(((C74712bm) ((C58847bk) this.f325610k).f156646a).mo71071a());
        mo8408ga(R.xml.assistant_android_settings_lower);
        mo8408ga(R.xml.assistant_android_settings_footer);
        if (!this.f325615p.mo103260a() && (l3 = mo8412gi().mo8382l("assistant_android_settings_squeeze")) != null) {
            l3.mo8348O(false);
        }
        if (!C1888a.m5149c() && (l2 = mo8412gi().mo8382l("assistant_android_settings_long_press_power")) != null) {
            l2.mo8348O(false);
        }
        m194940p();
        if (!((C74712bm) ((C58847bk) this.f325610k).f156646a).mo71075e() && (l = mo8412gi().mo8382l("assistant_android_settings_quick_phrases")) != null) {
            l.mo8348O(false);
        }
        FooterPreference footerPreference = (FooterPreference) mo8412gi().mo8382l("assistant_android_settings_learn_more");
        if (footerPreference != null) {
            C117308ae aeVar = new C117308ae(this);
            if (footerPreference.f16639a != aeVar) {
                footerPreference.f16639a = aeVar;
                footerPreference.mo8317e();
            }
            String string = getString(R.string.assistant_android_settings_footer_link_content_description);
            if (!TextUtils.equals((CharSequence) null, string)) {
                footerPreference.f16640b = string;
                footerPreference.mo8317e();
            }
        }
    }

    /* renamed from: k */
    public final boolean mo8414k(Preference preference) {
        if (C117322n.f325671a.containsKey(preference.f12748t)) {
            C28440j h = C28442l.m53142h();
            if (preference instanceof TwoStatePreference) {
                h.mo33895b(C28442l.m53145k(!((TwoStatePreference) preference).f12789a));
            }
            this.f325607h.mo33853c(h.mo33894a(), this.f325614o.mo33908b(preference.f12748t));
        }
        if (preference.f12749u == null) {
            return super.mo8414k(preference);
        }
        if (!this.f325613n.mo79746e(C90059dk.f249172j) || !"assistant_android_settings_see_all".equals(preference.f12748t)) {
            return this.f325605f.mo65089a(preference.f12749u);
        }
        preference.f12749u.removeExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT");
        return this.f325605f.mo65089a(preference.f12749u.addFlags(268435456));
    }

    /* renamed from: n */
    public final void mo103250n(Preference preference) {
        if (this.f325614o != null) {
            if (C117322n.f325671a.containsKey(preference.f12748t)) {
                int i = 1;
                if (true != preference.f12754z) {
                    i = 2;
                }
                this.f325614o.mo33908b(preference.f12748t).mo33892i(i);
            }
        }
    }

    /* renamed from: o */
    public final /* synthetic */ void mo103251o() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(R.string.assistant_android_settings_footer_link))));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.getClass();
        this.f325617r = onCreateView;
        this.f325614o = new C28452b(this.f325606g.f76997b.mo33800a(C28427h.m53115a(85390)).mo33809b(onCreateView));
        PreferenceScreen gi = mo8412gi();
        C58800sl lA = C117322n.f325671a.keySet().iterator();
        while (lA.hasNext()) {
            String str = (String) lA.next();
            Preference l = gi.mo8382l(str);
            if (l != null) {
                Integer num = (Integer) C117322n.f325671a.get(str);
                num.getClass();
                C28439i a = this.f325614o.mo33909c(num.intValue()).mo33899a(l.f12748t);
                int i = 1;
                if (true != l.f12754z) {
                    i = 2;
                }
                a.mo33892i(i);
            }
        }
        return this.f325617r;
    }

    public final void onResume() {
        super.onResume();
        m194940p();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C2043bi.m5555ai(this.f12808c, C117307ad.f325643a);
    }
}

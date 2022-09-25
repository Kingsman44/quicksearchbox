package com.google.android.libraries.lens.view.filters.translation;

import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.translation.languagepicker.C26149ar;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3709a.p3710a.C47692b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59918c;
import com.google.common.p4552o.p4563i.C59959i;
import com.google.common.p4552o.p4563i.C59960j;
import com.google.common.p4552o.p4563i.C59961k;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.co */
/* compiled from: PG */
public final class C26104co implements C27654a {

    /* renamed from: A */
    private final C25225bd f70916A;

    /* renamed from: B */
    private final boolean f70917B;

    /* renamed from: a */
    public C26114cy f70918a;

    /* renamed from: b */
    public LiveData f70919b;

    /* renamed from: c */
    public LiveData f70920c;

    /* renamed from: d */
    public LiveData f70921d;

    /* renamed from: e */
    public LiveData f70922e;

    /* renamed from: f */
    public LiveData f70923f;

    /* renamed from: g */
    public LiveData f70924g;

    /* renamed from: h */
    public LiveData f70925h;

    /* renamed from: i */
    public LiveData f70926i;

    /* renamed from: j */
    public LiveData f70927j;

    /* renamed from: k */
    public LiveData f70928k;

    /* renamed from: l */
    public C25752a f70929l;

    /* renamed from: m */
    public final Fragment f70930m;

    /* renamed from: n */
    public final AccountId f70931n;

    /* renamed from: o */
    public final LensConnectivityManager f70932o;

    /* renamed from: p */
    public final C26059ax f70933p;

    /* renamed from: q */
    public final C26120dc f70934q;

    /* renamed from: r */
    public final C28306ab f70935r;

    /* renamed from: s */
    public final C28443m f70936s;

    /* renamed from: t */
    public final C26217r f70937t;

    /* renamed from: u */
    public final C26077bo f70938u;

    /* renamed from: v */
    public final C47770dh f70939v;

    /* renamed from: w */
    public final C47692b f70940w;

    /* renamed from: x */
    public final C25684e f70941x;

    /* renamed from: y */
    public final boolean f70942y;

    /* renamed from: z */
    public boolean f70943z;

    public C26104co(Fragment fragment, AccountId accountId, LensConnectivityManager lensConnectivityManager, C25225bd bdVar, C26059ax axVar, C26120dc dcVar, C28306ab abVar, C28443m mVar, C25684e eVar, C26217r rVar, C26077bo boVar, C47770dh dhVar, C47692b bVar, boolean z, boolean z2) {
        this.f70930m = fragment;
        this.f70931n = accountId;
        this.f70932o = lensConnectivityManager;
        this.f70916A = bdVar;
        this.f70933p = axVar;
        this.f70934q = dcVar;
        this.f70935r = abVar;
        this.f70936s = mVar;
        this.f70937t = rVar;
        this.f70938u = boVar;
        this.f70939v = dhVar;
        this.f70940w = bVar;
        this.f70941x = eVar;
        this.f70942y = z;
        this.f70917B = z2;
    }

    /* renamed from: a */
    public static C28442l m48173a(boolean z, boolean z2) {
        C28440j h = C28442l.m53142h();
        C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
        C59918c cVar = (C59918c) C59961k.f162053f.createBuilder();
        C56306df dfVar = C56306df.TRANSLATE;
        cVar.copyOnWrite();
        C59961k kVar = (C59961k) cVar.instance;
        kVar.f162058d = dfVar.f150068m;
        kVar.f162055a |= 1;
        C59959i iVar = (C59959i) C59960j.f162046f.createBuilder();
        iVar.copyOnWrite();
        C59960j jVar = (C59960j) iVar.instance;
        jVar.f162048a |= 32;
        jVar.f162052e = z;
        iVar.copyOnWrite();
        C59960j jVar2 = (C59960j) iVar.instance;
        jVar2.f162048a |= 16;
        jVar2.f162051d = z2;
        cVar.copyOnWrite();
        C59961k kVar2 = (C59961k) cVar.instance;
        C59960j jVar3 = (C59960j) iVar.build();
        jVar3.getClass();
        kVar2.f162057c = jVar3;
        kVar2.f162056b = 2;
        C59961k kVar3 = (C59961k) cVar.build();
        bhVar.copyOnWrite();
        C59900bi biVar = (C59900bi) bhVar.instance;
        kVar3.getClass();
        biVar.f161894b = kVar3;
        biVar.f161893a |= 2;
        h.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
        return h.mo33894a();
    }

    /* renamed from: d */
    public static void m48174d(AccountId accountId, FragmentManager fragmentManager, boolean z) {
        for (Fragment fragment : fragmentManager.f634a.mo677i()) {
            if (fragment instanceof C26149ar) {
                return;
            }
        }
        C26149ar.m48291a(accountId, Boolean.toString(z)).showNow(fragmentManager, "LensTranslateLanguagePicker");
    }

    /* renamed from: g */
    private final String m48175g(Predicate predicate) {
        C58495hd hdVar = (C58495hd) this.f70920c.mo3842a();
        if (hdVar == null) {
            return BuildConfig.FLAVOR;
        }
        String str = (String) Collection.EL.stream(hdVar.entrySet()).filter(new C26088bz(predicate)).map(C26090ca.f70902a).map(C26091cb.f70903a).collect(Collectors.joining(","));
        return str.isEmpty() ? "ø" : str;
    }

    /* renamed from: b */
    public final void mo31292b(boolean z) {
        m48174d(this.f70931n, this.f70930m.getChildFragmentManager(), z);
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("TranslationFilterSettingsFragment");
        C26116cz czVar = (C26116cz) this.f70926i.mo3842a();
        if (czVar != null) {
            eVar.mo33148e("srcLang", czVar.mo31306a().toString());
            eVar.mo33148e("targetLang", czVar.mo31307b().toString());
        }
        C58495hd hdVar = (C58495hd) this.f70920c.mo3842a();
        eVar.mo33148e("nb packs", hdVar != null ? String.valueOf(hdVar.size()) : BuildConfig.FLAVOR);
        eVar.mo33148e("downloaded packs", m48175g(C26092cc.f70904a));
        eVar.mo33148e("downloading packs", m48175g(C26093cd.f70905a));
        eVar.mo33148e("queued packs", m48175g(C26095cf.f70907a));
        eVar.mo33148e("offline onboarding tooltip", true != this.f70916A.mo30349e().f68753a ? "not shown" : "shown");
    }

    /* renamed from: e */
    public final void mo31293e() {
        int i;
        C26116cz czVar = (C26116cz) this.f70926i.mo3842a();
        czVar.getClass();
        Locale b = czVar.mo31307b();
        Locale locale = (Locale) this.f70925h.mo3842a();
        locale.getClass();
        boolean t = this.f70933p.mo31265t();
        C26114cy cyVar = this.f70918a;
        MaterialButton b2 = cyVar.mo31299b();
        b2.setText(cyVar.f70955c.mo31434d(locale));
        b2.mo28945lq(t ? cyVar.f70954b.getDrawable(R.drawable.quantum_ic_auto_awesome_white_18) : null);
        if (t) {
            i = true != cyVar.f70965m ? R.dimen.lens_translate_language_picker_chip_button_padding_start_icon : R.dimen.lens_translate_language_picker_chip_button_padding_start_icon_large;
        } else {
            i = true != cyVar.f70965m ? R.dimen.lens_translate_language_picker_chip_button_padding_start_text : R.dimen.lens_translate_language_picker_chip_button_padding_start_text_large;
        }
        b2.setPaddingRelative(cyVar.f70954b.getDimensionPixelSize(i), b2.getPaddingTop(), b2.getPaddingEnd(), b2.getPaddingBottom());
        if (t) {
            b2.setContentDescription(cyVar.f70954b.getString(R.string.lens_translate_filter_params_auto_source_desc, new Object[]{C26114cy.f70953a.equals(locale) ? BuildConfig.FLAVOR : cyVar.f70955c.mo31432b(locale)}));
        } else {
            b2.setContentDescription(cyVar.f70954b.getString(R.string.lens_translate_filter_params_source_desc, new Object[]{cyVar.f70955c.mo31432b(locale)}));
        }
        C26114cy cyVar2 = this.f70918a;
        MaterialButton c = cyVar2.mo31300c();
        c.setText(cyVar2.f70955c.mo31434d(b));
        c.setContentDescription(cyVar2.f70954b.getString(R.string.lens_translate_filter_params_target_desc, new Object[]{cyVar2.f70955c.mo31432b(b)}));
    }

    /* renamed from: f */
    public final void mo31294f(boolean z) {
        if (this.f70917B) {
            if (z) {
                this.f70918a.mo31303f();
            } else {
                this.f70918a.mo31302e();
            }
        }
    }
}

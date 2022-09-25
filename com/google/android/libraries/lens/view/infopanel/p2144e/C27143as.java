package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.translation.C26041af;
import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.filters.translation.C26116cz;
import com.google.android.libraries.lens.view.filters.translation.C26217r;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26968d;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26977m;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26978n;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.p2078at.C25535r;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.as */
/* compiled from: PG */
public final class C27143as implements C27131ag {

    /* renamed from: f */
    public static final /* synthetic */ int f74163f = 0;

    /* renamed from: g */
    private static final View.OnClickListener f74164g = C27141aq.f74162a;

    /* renamed from: h */
    private static final C58974d f74165h = C58974d.m91135i("InfoPanelOfflineItemRenderer");

    /* renamed from: a */
    public final AccountId f74166a;

    /* renamed from: c */
    public final C28443m f74167c;

    /* renamed from: d */
    public final C26059ax f74168d;

    /* renamed from: e */
    public final C68214a f74169e;

    /* renamed from: i */
    private final Context f74170i;

    /* renamed from: j */
    private final C25537t f74171j;

    /* renamed from: k */
    private final LensConnectivityManager f74172k;

    /* renamed from: l */
    private final C28310af f74173l;

    /* renamed from: m */
    private final C26217r f74174m;

    /* renamed from: n */
    private final C28306ab f74175n;

    public C27143as(AccountId accountId, Context context, C25537t tVar, LensConnectivityManager lensConnectivityManager, C28310af afVar, C28443m mVar, C26059ax axVar, C68214a aVar, C26217r rVar, C28306ab abVar) {
        this.f74166a = accountId;
        this.f74170i = context;
        this.f74171j = tVar;
        this.f74172k = lensConnectivityManager;
        this.f74173l = afVar;
        this.f74167c = mVar;
        this.f74168d = axVar;
        this.f74169e = aVar;
        this.f74174m = rVar;
        this.f74175n = abVar;
    }

    /* renamed from: a */
    public final /* synthetic */ View mo32451a(C27129ae aeVar) {
        return C27130af.m50335a(this, aeVar);
    }

    /* renamed from: b */
    public final /* synthetic */ View mo32452b(C27129ae aeVar) {
        C27161c cVar;
        C27134aj ajVar = (C27134aj) aeVar;
        View inflate = LayoutInflater.from(this.f74170i).inflate(R.layout.lens_card_with_illustration, (ViewGroup) null);
        C27162d a = C27162d.m50375a(inflate);
        int i = ajVar.f74144a - 1;
        if (i == 0) {
            MaterialButton materialButton = a.f74248c;
            this.f74175n.mo33801b(inflate, this.f74173l.mo33805a(C28427h.m53115a(107564)));
            this.f74175n.mo33801b(materialButton, this.f74173l.mo33805a(C28427h.m53115a(119329)));
            cVar = new C27161c(this.f74170i.getString(R.string.lens_offline_translate_deferred_header), this.f74170i.getString(R.string.lens_offline_translate_deferred_body), this.f74170i.getString(R.string.lens_offline_translate_deferred_button_text), new C27139ao(this, inflate, materialButton), f74164g);
        } else if (i == 1) {
            MaterialButton materialButton2 = a.f74248c;
            this.f74175n.mo33801b(inflate, this.f74173l.mo33805a(C28427h.m53115a(107564)));
            C26059ax axVar = this.f74168d;
            axVar.mo31256k();
            C26116cz czVar = (C26116cz) axVar.f70826p.mo3842a();
            czVar.getClass();
            C26059ax axVar2 = this.f74168d;
            axVar2.mo31256k();
            Locale locale = (Locale) axVar2.f70827q.mo3842a();
            locale.getClass();
            Locale b = czVar.mo31307b();
            if (this.f74168d.mo31267v(locale, C26041af.f70762a) || this.f74168d.mo31267v(b, C26041af.f70762a)) {
                this.f74175n.mo33801b(materialButton2, this.f74173l.mo33805a(C28427h.m53115a(119329)));
                boolean v = this.f74168d.mo31267v(locale, C26041af.f70762a);
                String d = v ? this.f74174m.mo31434d(locale) : this.f74174m.mo31434d(b);
                if (true != v) {
                    locale = b;
                }
                cVar = new C27161c(this.f74170i.getString(R.string.lens_offline_translate_deferred_header), this.f74170i.getString(R.string.lens_offline_translate_deferred_body_specific, new Object[]{d}), this.f74170i.getString(R.string.lens_offline_translate_deferred_button_text), new C27140ap(this, materialButton2, locale), f74164g);
            } else {
                this.f74175n.mo33801b(materialButton2, this.f74173l.mo33805a(C28427h.m53115a(119328)));
                Stream distinct = Stream.CC.m71936of((T[]) new Locale[]{locale, b}).distinct();
                C26059ax axVar3 = this.f74168d;
                Objects.requireNonNull(axVar3);
                C58485gu guVar = (C58485gu) distinct.filter(new C27137am(axVar3)).collect(C58370cn.f155946a);
                cVar = new C27161c(this.f74170i.getString(R.string.lens_offline_translate_deferred_header), this.f74170i.getString(R.string.lens_offline_translate_deferred_body_specific, new Object[]{this.f74174m.mo31434d((Locale) Collection.EL.stream(guVar).findFirst().orElse(locale))}), this.f74170i.getString(R.string.lens_offline_translate_deferred_button_cancel_text), new C27138an(this, guVar, materialButton2), f74164g);
            }
        } else if (i != 2) {
            MaterialButton materialButton3 = a.f74248c;
            this.f74175n.mo33801b(inflate, this.f74173l.mo33805a(C28427h.m53115a(139035)));
            this.f74175n.mo33801b(materialButton3, this.f74173l.mo33805a(C28427h.m53115a(139036)));
            cVar = new C27161c(this.f74170i.getString(R.string.lens_background_retry_card_header_something_went_wrong), this.f74170i.getString(R.string.lens_error_please_try_again), this.f74170i.getString(R.string.lens_offline_translate_no_languages_button_text), new C27136al(this, ajVar, materialButton3), f74164g);
        } else {
            MaterialButton materialButton4 = a.f74248c;
            this.f74175n.mo33801b(inflate, this.f74173l.mo33805a(C28427h.m53115a(119330)));
            this.f74175n.mo33801b(materialButton4, this.f74173l.mo33805a(C28427h.m53115a(119331)));
            cVar = new C27161c(this.f74170i.getString(R.string.lens_offline_translate_no_languages_header), this.f74170i.getString(R.string.lens_offline_translate_no_languages_body), this.f74170i.getString(R.string.lens_offline_translate_no_languages_button_text), new C27135ak(this, ajVar, materialButton4), f74164g);
        }
        a.f74246a.setText(cVar.f74240a);
        a.f74247b.setText(cVar.f74241b);
        C27162d.m50376b(a.f74248c, cVar.f74242c, cVar.f74244e);
        C27162d.m50376b(a.f74249d, cVar.f74243d, cVar.f74245f);
        return inflate;
    }

    /* renamed from: c */
    public final void mo32575c(C27134aj ajVar, View view) {
        this.f74167c.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        if (this.f74172k.mo30907k()) {
            try {
                ((C25535r) this.f74171j.mo30552a().mo56107c()).mo30589G(Intent.parseUri("ae-action://lens-request-retry", 0));
            } catch (URISyntaxException e) {
                ((C58970a) ((C58970a) ((C58970a) f74165h.mo56226d()).mo56382g(e)).mo56372aa(49584)).mo56386p("Could not build URI for Lens Retry.");
            }
        } else {
            C26978n nVar = ajVar.f74145b;
            C26980p pVar = nVar.f73564a;
            int i = nVar.f73565b;
            pVar.mo32440g(pVar.mo32437d(pVar.f73567a.getString(R.string.lens_info_panel_loading_message)));
            pVar.mo32441h(C26968d.OPEN);
            pVar.f73568b.mo29164d(new C26977m(pVar, i), 400, TimeUnit.MILLISECONDS);
        }
    }
}

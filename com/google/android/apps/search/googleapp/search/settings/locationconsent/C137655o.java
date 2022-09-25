package com.google.android.apps.search.googleapp.search.settings.locationconsent;

import android.widget.RadioGroup;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.search.location.p3029a.C38583ac;
import com.google.android.libraries.search.location.p3029a.C38586af;
import com.google.android.libraries.search.location.p3029a.C38590aj;
import com.google.android.libraries.search.location.p3029a.C38625bq;
import com.google.android.libraries.search.location.p3029a.C38626br;
import com.google.android.libraries.search.location.p3029a.C38633by;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.locationconsent.o */
/* compiled from: PG */
public final class C137655o {

    /* renamed from: a */
    public static final C59071e f374421a = C59071e.m91332i("com.google.android.apps.search.googleapp.search.settings.locationconsent.o");

    /* renamed from: b */
    public final C137651k f374422b;

    /* renamed from: c */
    public final C136247a f374423c;

    /* renamed from: d */
    public final C46801dp f374424d;

    /* renamed from: e */
    public final C47770dh f374425e;

    /* renamed from: f */
    public final C38586af f374426f;

    /* renamed from: g */
    public final C137656a f374427g = new C137656a();

    /* renamed from: h */
    public final C28306ab f374428h;

    /* renamed from: com.google.android.apps.search.googleapp.search.settings.locationconsent.o$a */
    /* compiled from: PG */
    final class C137656a implements C46792di {
        public C137656a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C137655o.f374421a.mo56226d()).mo56382g(th)).mo56372aa(41012)).mo56386p("Failed to get location consent setting option.");
            C137655o.this.mo113886a(C38633by.ALWAYS_USE);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            ((C59052c) ((C59052c) C137655o.f374421a.mo56224b()).mo56372aa(41013)).mo56386p("Location consent setting option is loaded.");
            C137655o.this.mo113886a((C38633by) obj);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C137655o(C137651k kVar, C136247a aVar, C38586af afVar, IncognitoLifecycleObserver incognitoLifecycleObserver, C46801dp dpVar, C47770dh dhVar, C28306ab abVar) {
        this.f374422b = kVar;
        this.f374426f = afVar;
        this.f374423c = aVar;
        this.f374424d = dpVar;
        this.f374425e = dhVar;
        this.f374428h = abVar;
        incognitoLifecycleObserver.mo112948g();
    }

    /* renamed from: a */
    public final void mo113886a(C38633by byVar) {
        RadioGroup radioGroup = (RadioGroup) this.f374422b.requireView().findViewById(R.id.googleapp_location_consent_setting_radio_button_group);
        C38633by byVar2 = C38633by.ALWAYS_USE;
        int ordinal = byVar.ordinal();
        if (ordinal == 0) {
            radioGroup.check(R.id.googleapp_location_consent_setting_radio_button_accepted);
        } else if (ordinal == 1) {
            radioGroup.check(R.id.googleapp_location_consent_setting_radio_button_declined);
        } else if (ordinal == 2) {
            radioGroup.check(R.id.googleapp_location_consent_setting_radio_button_ask);
        }
    }

    /* renamed from: b */
    public final void mo113887b(C38633by byVar) {
        C38586af afVar = this.f374426f;
        C38590aj ajVar = byVar.f102087d;
        C38625bq bqVar = (C38625bq) C38626br.f102069c.createBuilder();
        bqVar.copyOnWrite();
        C38626br brVar = (C38626br) bqVar.instance;
        brVar.f102072b = 2;
        brVar.f102071a |= 1;
        C60870cx g = afVar.mo41511g(ajVar, (C38626br) bqVar.build());
        C60856cj.m92911t(g, C47810es.m84974n(new C38583ac(afVar, byVar)), afVar.f101993d);
        C46459k.m82829b(g, "Unable to update the user's consent reason", new Object[0]);
    }
}

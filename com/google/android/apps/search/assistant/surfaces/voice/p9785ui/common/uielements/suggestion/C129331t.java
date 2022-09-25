package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion;

import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3897e.p3902c.p3907c.C51133hp;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.t */
/* compiled from: PG */
public final class C129331t {

    /* renamed from: a */
    public static final C59071e f355202a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.t");

    /* renamed from: b */
    public final AccountId f355203b;

    /* renamed from: c */
    public final Context f355204c;

    /* renamed from: d */
    public final LayoutInflater f355205d;

    /* renamed from: e */
    public final C129320i f355206e;

    /* renamed from: f */
    public final FragmentManager f355207f;

    /* renamed from: g */
    public final C129318g f355208g;

    /* renamed from: h */
    public final C46855i f355209h;

    /* renamed from: i */
    public final C46439e f355210i;

    /* renamed from: j */
    public final C47449e f355211j;

    /* renamed from: k */
    public final C127118j f355212k;

    /* renamed from: l */
    public final C126879a f355213l;

    /* renamed from: m */
    public final C47770dh f355214m;

    /* renamed from: n */
    public final C129024a f355215n;

    /* renamed from: o */
    public final C129332a f355216o = new C129332a();

    /* renamed from: p */
    public SuggestionViewModel f355217p;

    /* renamed from: q */
    public boolean f355218q;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.t$a */
    /* compiled from: PG */
    final class C129332a implements C46440f {
        public C129332a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C129331t.f355202a.mo56225c()).mo56382g(th)).mo56372aa(38260)).mo56386p("Failed to start interaction for suggestion click.");
            C129331t tVar = C129331t.this;
            SuggestionViewModel suggestionViewModel = tVar.f355217p;
            suggestionViewModel.getClass();
            C58485gu b = C129331t.m211144b(tVar.f355206e);
            suggestionViewModel.f355121a = BuildConfig.FLAVOR;
            int size = b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) b.get(i);
                view.setEnabled(true);
                view.setClickable(true);
            }
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    public C129331t(AccountId accountId, C47215a aVar, C129320i iVar, C129318g gVar, C46855i iVar2, C46439e eVar, C47449e eVar2, C127118j jVar, C126879a aVar2, C47770dh dhVar, C129024a aVar3) {
        this.f355203b = accountId;
        Context p = aVar.mo51121p();
        this.f355204c = p;
        this.f355205d = LayoutInflater.from(p);
        this.f355206e = iVar;
        this.f355207f = iVar.getChildFragmentManager();
        this.f355208g = gVar;
        this.f355209h = iVar2;
        this.f355210i = eVar;
        this.f355211j = eVar2;
        this.f355212k = jVar;
        this.f355213l = aVar2;
        this.f355214m = dhVar;
        this.f355215n = aVar3;
    }

    /* renamed from: a */
    public static ViewGroup m211143a(C129320i iVar) {
        return (ViewGroup) iVar.requireView().findViewById(R.id.assistant_suggestion_chip_group);
    }

    /* renamed from: b */
    public static C58485gu m211144b(C129320i iVar) {
        ViewGroup viewGroup = (ViewGroup) iVar.requireView().findViewById(R.id.assistant_suggestion_chip_group);
        C58480gp e = C58485gu.m89837e();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            e.mo55395g(viewGroup.getChildAt(i));
        }
        return e.mo55394f();
    }

    /* renamed from: c */
    public final C58485gu mo108970c() {
        SuggestionViewModel suggestionViewModel = this.f355217p;
        suggestionViewModel.getClass();
        return suggestionViewModel.f355122b;
    }

    /* renamed from: d */
    public final void mo108971d(boolean z) {
        Fragment c = this.f355207f.f634a.mo671c("CORRECTION_FRAGMENT_TAG");
        if (c == null || !c.isVisible() || !z) {
            m211143a(this.f355206e).setVisibility(true != z ? 8 : 0);
        }
    }

    /* renamed from: e */
    public final void mo108972e() {
        this.f355208g.mo108965a(C58485gu.m89845m());
        SuggestionViewModel suggestionViewModel = this.f355217p;
        suggestionViewModel.getClass();
        suggestionViewModel.f355121a = BuildConfig.FLAVOR;
        C0154a aVar = new C0154a(this.f355207f);
        for (Fragment m : this.f355207f.f634a.mo677i()) {
            aVar.mo516m(m);
        }
        aVar.mo509f();
    }

    /* renamed from: f */
    public final void mo108973f(C51986gl glVar) {
        C51133hp a = C51133hp.m86035a(glVar.f136425c);
        if (a == null) {
            a = C51133hp.DEFAULT;
        }
        if (!a.equals(C51133hp.DEFAULT)) {
            ((C59052c) ((C59052c) f355202a.mo56226d()).mo56372aa(38266)).mo56386p("Unexpected suggestion display target.");
            return;
        }
        Collection.EL.stream(glVar.f136424b).filter(C129322k.f355190a).findFirst().ifPresent(new C129323l(this));
        this.f355208g.mo108965a(C129337y.f355222a.mo108976a(glVar, this.f355204c.getPackageManager()));
    }
}

package com.google.android.apps.search.googleapp.settingsui;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import androidx.preference.Preference;
import com.google.android.apps.search.googleapp.p10536x.C139869e;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.C139874j;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.apps.search.googleapp.p10536x.C139876l;
import com.google.android.apps.search.googleapp.p10536x.C139878n;
import com.google.android.apps.search.googleapp.p10536x.C139880p;
import com.google.android.apps.search.googleapp.settingsui.selectedpreference.SelectablePreferenceFactory;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.androidx.p3697b.C47616a;
import java.util.Map;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69669s;
import p5462h.p5478h.C69682a;
import p5462h.p5478h.C69684c;
import p5462h.p5481k.C69713k;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.y */
/* compiled from: PG */
public final class C139266y implements C139878n {

    /* renamed from: a */
    static final /* synthetic */ C69713k[] f378773a;

    /* renamed from: b */
    public final C46801dp f378774b;

    /* renamed from: c */
    public final C28443m f378775c;

    /* renamed from: d */
    public final Fragment f378776d;

    /* renamed from: e */
    public final C139876l f378777e;

    /* renamed from: f */
    public final C46792di f378778f = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, "throwable");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C139266y.this.f378782j.mo8339F(((Boolean) obj).booleanValue());
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: g */
    public final C46792di f378779g = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, "throwable");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C139266y.this.f378782j.mo8348O(((Boolean) obj).booleanValue());
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: h */
    public final C46792di f378780h = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, "throwable");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            String str = (String) obj;
            C69664n.m101061g(str, "value");
            C139266y.this.f378782j.mo8329n(str);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: i */
    public final C69684c f378781i = new C69682a();

    /* renamed from: j */
    public final Preference f378782j;

    /* renamed from: k */
    private final Context f378783k;

    /* renamed from: l */
    private final String f378784l;

    /* renamed from: m */
    private final C47770dh f378785m;

    /* renamed from: n */
    private final SelectablePreferenceFactory f378786n;

    /* renamed from: o */
    private final C139873i f378787o;

    static {
        C69669s sVar = new C69669s(C139266y.class, "preferenceVe", "getPreferenceVe()Lcom/google/android/libraries/logging/ve/ClientVisualElement;");
        int i = C69649af.f186028a;
        f378773a = new C69713k[]{sVar};
    }

    public C139266y(AccountId accountId, Context context, Map map, String str, C46801dp dpVar, C47770dh dhVar, C28443m mVar, SelectablePreferenceFactory selectablePreferenceFactory, Fragment fragment) {
        C139161ao aoVar;
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(map, "settingUiElements");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(mVar, "interactionLogger");
        C69664n.m101061g(fragment, "linkFragment");
        this.f378783k = context;
        this.f378784l = str;
        this.f378774b = dpVar;
        this.f378785m = dhVar;
        this.f378775c = mVar;
        this.f378786n = selectablePreferenceFactory;
        this.f378776d = fragment;
        C139873i a = C139873i.m227462a(str);
        this.f378787o = a;
        Object obj = map.get(a);
        C69664n.m101059e(obj, "null cannot be cast to non-null type com.google.android.apps.search.googleapp.settings.LinkSettingUiElement");
        C139876l lVar = (C139876l) obj;
        this.f378777e = lVar;
        Preference a2 = selectablePreferenceFactory.mo114855a(context, a);
        if (lVar instanceof C139869e) {
            a2.mo8339F(false);
        }
        if (lVar instanceof C139871g) {
            a2.mo8348O(false);
        }
        if (lVar.mo111859b() != -1) {
            a2.mo8340G(lVar.mo111859b());
        }
        a2.f12751w = false;
        a2.mo8343J(str);
        a2.mo8347N(lVar.mo111460j());
        a2.mo8329n(lVar.mo111457g());
        a2.mo8342I(false);
        if (lVar instanceof C139880p) {
            C139874j c = ((C139880p) lVar).mo112666c();
            C69664n.m101060f(c, "settingSpec.page");
            aoVar = new C139160an(c);
        } else if (lVar instanceof C139875k) {
            aoVar = new C139158al(a);
        } else {
            throw new IllegalStateException("The `settingSpec` of a PageLinkSettingFragmentPeer must be a SettingsPageLinkSettingUiElement or a HostedFragmentLinkSettingUiElement.");
        }
        a2.f12743o = new C47616a(new C139265x(this, aoVar), dhVar);
        this.f378782j = a2;
    }

    /* renamed from: a */
    public final Preference mo112667a() {
        return this.f378782j;
    }

    /* renamed from: b */
    public final void mo112668b(C28439i iVar) {
        C69664n.m101061g(iVar, "ve");
        this.f378781i.mo42045b(f378773a[0], iVar);
    }
}

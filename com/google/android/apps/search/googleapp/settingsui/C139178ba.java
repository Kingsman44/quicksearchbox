package com.google.android.apps.search.googleapp.settingsui;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.RecyclerView;
import androidx.preference.C3990ap;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.C139874j;
import com.google.android.apps.search.googleapp.p10536x.C139879o;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139138b;
import com.google.android.apps.search.googleapp.settingsui.p10484c.C139205a;
import com.google.android.apps.search.googleapp.settingsui.selectedpreference.C139253b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63077o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.ba */
/* compiled from: PG */
public final class C139178ba extends C139180bc {

    /* renamed from: a */
    public static final C59071e f378511a = C59071e.m91331h();

    /* renamed from: b */
    public final AccountId f378512b;

    /* renamed from: c */
    public final SettingsPageFragment f378513c;

    /* renamed from: d */
    public final Map f378514d;

    /* renamed from: e */
    public final C28310af f378515e;

    /* renamed from: f */
    public final C28306ab f378516f;

    /* renamed from: g */
    public final C139253b f378517g;

    /* renamed from: h */
    public final C46855i f378518h;

    /* renamed from: i */
    public final C47770dh f378519i;

    /* renamed from: j */
    public final C133148g f378520j;

    /* renamed from: k */
    public final C46401p f378521k;

    /* renamed from: l */
    public C139873i f378522l;

    /* renamed from: m */
    public final C139874j f378523m;

    /* renamed from: n */
    public final C139873i f378524n;

    /* renamed from: o */
    public final boolean f378525o;

    /* renamed from: p */
    public final C139169aw f378526p;

    /* renamed from: q */
    public final C139205a f378527q;

    /* renamed from: s */
    private final C38553h f378528s;

    public C139178ba(AccountId accountId, SettingsPageFragment settingsPageFragment, C139138b bVar, Map map, C28310af afVar, C28306ab abVar, C38553h hVar, C139205a aVar, InstanceStateStoreFactory instanceStateStoreFactory, C139253b bVar2, C46855i iVar, boolean z, C47770dh dhVar, C133148g gVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(map, "settingUiElements");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(hVar, "fragmentIncognitoChecker");
        C69664n.m101061g(instanceStateStoreFactory, "cacheFactory");
        C69664n.m101061g(bVar2, "currentDestinationDataService");
        C69664n.m101061g(iVar, "localSubscriptionMixin");
        C69664n.m101061g(dhVar, "traceCreation");
        this.f378512b = accountId;
        this.f378513c = settingsPageFragment;
        this.f378514d = map;
        this.f378515e = afVar;
        this.f378516f = abVar;
        this.f378528s = hVar;
        this.f378527q = aVar;
        this.f378517g = bVar2;
        this.f378518h = iVar;
        this.f378519i = dhVar;
        this.f378520j = gVar;
        this.f378521k = instanceStateStoreFactory.mo50325a("has_highlighted", C63077o.f170228b);
        String str = bVar.f378429b;
        C69664n.m101060f(str, "args.currentPage");
        this.f378523m = C139874j.m227463a(str);
        String str2 = bVar.f378430c;
        C139873i iVar2 = null;
        if (!(str2 == null || str2.length() == 0)) {
            iVar2 = C139873i.m227462a(str2);
        }
        this.f378524n = iVar2;
        boolean z2 = settingsPageFragment.getResources().getBoolean(R.bool.googleapp_settings_use_two_pane);
        boolean z3 = false;
        if (z2 && z) {
            z3 = true;
        }
        this.f378525o = z3;
        this.f378526p = new C139169aw(this);
    }

    /* renamed from: a */
    public final List mo114800a() {
        C139879o oVar;
        C139879o oVar2;
        C139873i[] values = C139873i.values();
        ArrayList arrayList = new ArrayList();
        for (C139873i iVar : values) {
            if (!this.f378528s.f101930a ? !((oVar = (C139879o) this.f378514d.get(iVar)) == null || !oVar.mo111462l() || iVar.f380267aI != this.f378523m) : !((oVar2 = (C139879o) this.f378514d.get(iVar)) == null || !oVar2.mo111463m())) {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo114801b(C139873i iVar) {
        C0640fb fbVar = this.f378513c.f12808c.mAdapter;
        C69664n.m101059e(fbVar, "null cannot be cast to non-null type androidx.preference.PreferenceGroupAdapter");
        C3990ap apVar = (C3990ap) fbVar;
        apVar.notifyItemChanged(apVar.mo8425c(iVar.name()));
    }

    /* renamed from: c */
    public final void mo114802c(C139873i iVar) {
        ((AppBarLayout) this.f378513c.requireView().findViewById(R.id.googleapp_settings_page_toolbar)).mo47405o(false, true, true);
        RecyclerView recyclerView = this.f378513c.f12808c;
        C0640fb fbVar = recyclerView.mAdapter;
        C69664n.m101059e(fbVar, "null cannot be cast to non-null type androidx.preference.PreferenceGroupAdapter");
        C3990ap apVar = (C3990ap) fbVar;
        int c = apVar.mo8425c(iVar.name());
        if (c != -1) {
            recyclerView.smoothScrollToPosition(c);
            return;
        }
        C69664n.m101060f(recyclerView, "recyclerView");
        apVar.mObservable.registerObserver(new C139168av(apVar, recyclerView, iVar.name()));
    }
}

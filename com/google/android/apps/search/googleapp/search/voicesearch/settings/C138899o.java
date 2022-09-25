package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0613eb;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.telephony.TelephonyManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138716b;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a.C138880n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.o */
/* compiled from: PG */
public final class C138899o {

    /* renamed from: a */
    public static final C59071e f377801a = C59071e.m91331h();

    /* renamed from: b */
    public final Context f377802b;

    /* renamed from: c */
    public final Fragment f377803c;

    /* renamed from: d */
    public final C138880n f377804d;

    /* renamed from: e */
    public final C46801dp f377805e;

    /* renamed from: f */
    public final C138894j f377806f;

    /* renamed from: g */
    public final C47770dh f377807g;

    /* renamed from: h */
    public final AccountId f377808h;

    /* renamed from: i */
    public final C28310af f377809i;

    /* renamed from: j */
    public final C28306ab f377810j;

    /* renamed from: k */
    public final C28443m f377811k;

    /* renamed from: l */
    public final Map f377812l = new LinkedHashMap();

    /* renamed from: m */
    public final List f377813m = new ArrayList();

    /* renamed from: n */
    public final List f377814n = new ArrayList();

    /* renamed from: o */
    public final C0613eb f377815o;

    /* renamed from: p */
    public final C1389001 f377816p;

    /* renamed from: q */
    public boolean f377817q;

    public C138899o(Context context, Fragment fragment, C138880n nVar, C46801dp dpVar, TelephonyManager telephonyManager, C138894j jVar, C47770dh dhVar, C46485f fVar, AccountId accountId, C28310af afVar, C28306ab abVar, C28443m mVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(nVar, "voiceSettingsDataService");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(telephonyManager, "telephonyManager");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(fVar, "navigation");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(mVar, "interactionLogger");
        this.f377802b = context;
        this.f377803c = fragment;
        this.f377804d = nVar;
        this.f377805e = dpVar;
        this.f377806f = jVar;
        this.f377807g = dhVar;
        this.f377808h = accountId;
        this.f377809i = afVar;
        this.f377810j = abVar;
        this.f377811k = mVar;
        this.f377815o = new C0613eb(context, (AttributeSet) null, R.attr.listPopupWindowStyle);
        this.f377816p = new C46792di() {
            /* renamed from: a */
            public final void mo18077a(Throwable th) {
                C69664n.m101061g(th, C42181t.f110467a);
                C59052c cVar = (C59052c) ((C59052c) C138899o.f377801a.mo56225c()).mo56382g(th);
                cVar.mo56379ah(new C59094n(41303));
                cVar.mo56386p("Failed to load voice languages setting data.");
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
                C138716b bVar = (C138716b) obj;
                C69664n.m101061g(bVar, "voiceSettings");
                C138899o oVar = C138899o.this;
                if (!oVar.f377817q) {
                    List list = oVar.f377814n;
                    String c = bVar.mo114498c();
                    C69664n.m101060f(c, "voiceSettings.primaryLanguage()");
                    list.add(c);
                    List list2 = C138899o.this.f377814n;
                    C58485gu a = bVar.mo114496a();
                    C69664n.m101060f(a, "voiceSettings.additionalLanguages()");
                    list2.addAll(a);
                }
                Map map = C138899o.this.f377812l;
                C58495hd b = bVar.mo114497b();
                C69664n.m101060f(b, "voiceSettings.bcpToDisplayLanguages()");
                map.putAll(b);
                C138899o.this.mo114628c();
                C138899o oVar2 = C138899o.this;
                List list3 = oVar2.f377813m;
                Map map2 = oVar2.f377812l;
                ArrayList arrayList = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    C138891g gVar = new C138891g((String) entry.getValue(), (String) entry.getKey());
                    if (oVar2.f377814n.contains(gVar.f377786b)) {
                        gVar.f377787c = true;
                    }
                    arrayList.add(gVar);
                }
                list3.addAll(arrayList);
                RecyclerView recyclerView = (RecyclerView) oVar2.f377803c.requireView().findViewById(R.id.googleapp_voice_languages_setting_language_list);
                recyclerView.setLayoutManager(new LinearLayoutManager(oVar2.f377803c.requireContext()));
                C138894j jVar = oVar2.f377806f;
                List list4 = oVar2.f377813m;
                C28310af afVar = oVar2.f377809i;
                C28306ab abVar = oVar2.f377810j;
                C28443m mVar = oVar2.f377811k;
                ((C138880n) jVar.f377793a.mo17428b()).getClass();
                C47770dh dhVar = (C47770dh) jVar.f377794b.mo17428b();
                dhVar.getClass();
                afVar.getClass();
                abVar.getClass();
                mVar.getClass();
                recyclerView.setAdapter(new C138889f(dhVar, list4, afVar, abVar, mVar));
                C138899o oVar3 = C138899o.this;
                Button a2 = oVar3.mo114626a();
                oVar3.f377810j.mo33802c(a2, oVar3.f377809i.mo33805a(C28427h.m53115a(150548)));
                if (oVar3.f377814n.size() > 1) {
                    a2.setVisibility(0);
                }
                C0613eb ebVar = oVar3.f377815o;
                ebVar.f2360k = a2;
                ebVar.mo2829w();
                a2.setOnClickListener(new C47591co(oVar3.f377807g, "Primary language selection button tapped", new C138897m(oVar3)));
                C138899o.this.f377817q = false;
            }

            /* renamed from: c */
            public final /* synthetic */ void mo18079c() {
            }
        };
    }

    /* renamed from: a */
    public final Button mo114626a() {
        View findViewById = this.f377803c.requireView().findViewById(R.id.googleapp_voice_languages_setting_primary_language_selection_button);
        C69664n.m101060f(findViewById, "fragment\n      .requireV…_selection_button\n      )");
        return (Button) findViewById;
    }

    /* renamed from: b */
    public final void mo114627b(List list) {
        List list2;
        C138880n nVar = this.f377804d;
        String str = (String) list.get(0);
        if (list.size() == 1) {
            list2 = C58485gu.m89845m();
            C69664n.m101060f(list2, "of()");
        } else {
            list2 = list.subList(1, list.size());
        }
        C60870cx f = nVar.f377758d.mo104003f(str, list2);
        nVar.f377756b.mo50787a(f, "voice_languages_setting_set_preference_key");
        C46459k.m82829b(f, "Failed to save primary and additional languages preference data.", new Object[0]);
    }

    /* renamed from: c */
    public final void mo114628c() {
        String str = (String) C69540x.m100821C(this.f377814n);
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        View view = this.f377803c.getView();
        View view2 = null;
        TextView textView = view != null ? (TextView) view.findViewById(R.id.googleapp_voice_languages_setting_primary_language) : null;
        if (textView != null) {
            textView.setText((CharSequence) this.f377812l.get(str));
        }
        View view3 = this.f377803c.getView();
        if (view3 != null) {
            view2 = view3.findViewById(R.id.googleapp_voice_languages_setting_primary_language_container);
        }
        if (view2 != null) {
            view2.setVisibility(str.length() == 0 ? 8 : 0);
        }
    }
}

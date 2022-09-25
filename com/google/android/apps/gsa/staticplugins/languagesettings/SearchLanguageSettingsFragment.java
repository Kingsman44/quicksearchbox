package com.google.android.apps.gsa.staticplugins.languagesettings;

import android.app.Activity;
import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.LocaleList;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84559s;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p395al.p408c.p414c.p416b.C8506p;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
public class SearchLanguageSettingsFragment extends Fragment {

    /* renamed from: a */
    public C86054o f286517a;

    /* renamed from: b */
    public C102656ab f286518b;

    /* renamed from: c */
    public C90465g f286519c;

    /* renamed from: d */
    View f286520d;

    /* renamed from: e */
    private C102655aa f286521e;

    /* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.SearchLanguageSettingsFragment$a */
    /* compiled from: PG */
    public interface C102646a {
        /* renamed from: qy */
        void mo93362qy(SearchLanguageSettingsFragment searchLanguageSettingsFragment);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((ViewGroup) this.f286520d.getParent()).setClipToPadding(false);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        Menu menu2 = menu;
        this.f286519c.mo84210a(getActivity()).mo84208a(menu2, "now_settings", this.f286517a.mo79668a(), C87562e.m142218a(getActivity(), "now_settings"), false, false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8506p pVar;
        List list;
        ((C102646a) C47266f.m84076a(getActivity(), C102646a.class)).mo93362qy(this);
        this.f286520d = layoutInflater.inflate(R.layout.search_language_preference_screen, viewGroup, false);
        C102656ab abVar = this.f286518b;
        Activity activity = getActivity();
        View view = this.f286520d;
        SharedPreferences sharedPreferences = (SharedPreferences) abVar.f286552a.mo17428b();
        sharedPreferences.getClass();
        C89994f fVar = (C89994f) abVar.f286553b.mo17428b();
        fVar.getClass();
        activity.getClass();
        view.getClass();
        C92486a aVar = (C92486a) abVar.f286554c.mo17428b();
        aVar.getClass();
        TelephonyManager telephonyManager = (TelephonyManager) abVar.f286555d.mo17428b();
        telephonyManager.getClass();
        C84559s sVar = (C84559s) abVar.f286556e.mo17428b();
        sVar.getClass();
        C102655aa aaVar = new C102655aa(sharedPreferences, fVar, activity, view, aVar, telephonyManager, sVar);
        this.f286521e = aaVar;
        String string = aaVar.f286544c.getString("selected_search_language", BuildConfig.FLAVOR);
        if (TextUtils.isEmpty(string)) {
            aaVar.f286549h.mo78314e(Locale.getDefault());
            string = aaVar.f286544c.getString("selected_search_language", BuildConfig.FLAVOR);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aaVar.f286546e.getLayoutParams();
        int i = -((int) (aaVar.f286543b.getResources().getDisplayMetrics().density * 16.0f));
        marginLayoutParams.setMargins(i, 0, i, 0);
        aaVar.f286546e.setLayoutParams(marginLayoutParams);
        aaVar.mo93367c(string);
        ListView listView = (ListView) aaVar.f286546e.findViewById(R.id.search_language_preferences_layout);
        listView.setFastScrollEnabled(true);
        ArrayList arrayList = new ArrayList();
        Map a = aaVar.mo93365a();
        listView.setOnScrollListener(new C102679w(aaVar));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i2 = 0; i2 < localeList.size(); i2++) {
            arrayList2.add(localeList.get(i2).toLanguageTag());
        }
        linkedHashSet.addAll(arrayList2);
        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>();
        linkedHashSet2.add(Locale.getDefault().getCountry());
        linkedHashSet2.add(aaVar.f286548g.getSimCountryIso());
        linkedHashSet2.add(aaVar.f286548g.getNetworkCountryIso());
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        for (String str : linkedHashSet2) {
            if (!TextUtils.isEmpty(str) && (list = (List) C102655aa.f286542a.get(str.toUpperCase())) != null) {
                linkedHashSet3.addAll(list);
            }
        }
        linkedHashSet.addAll(linkedHashSet3);
        Iterator it = linkedHashSet.iterator();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (it.hasNext() && linkedHashMap.size() < 7) {
            String str2 = (String) it.next();
            if (a.containsKey(str2) && (pVar = (C8506p) a.get(str2)) != null) {
                linkedHashMap.put(str2, pVar);
            }
        }
        if (!linkedHashMap.isEmpty()) {
            arrayList.add(new C102681y(2, (String) null, (C8506p) null, false));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new C102681y(1, (String) entry.getKey(), (C8506p) entry.getValue(), true));
            }
        }
        arrayList.add(new C102681y(3, (String) null, (C8506p) null, false));
        for (Map.Entry entry2 : a.entrySet()) {
            arrayList.add(new C102681y(1, (String) entry2.getKey(), (C8506p) entry2.getValue(), false));
        }
        listView.setAdapter(new C102682z(aaVar, aaVar.f286543b, arrayList));
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 999;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        return this.f286520d;
    }
}

package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import com.google.android.apps.gsa.search.core.p6502ae.C84463d;
import com.google.android.apps.gsa.search.core.p6502ae.C84464e;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84418a;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84430al;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86336p;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.p7066m.C89987az;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.bx */
/* compiled from: PG */
public final class C98000bx extends C88994i implements Preference.OnPreferenceChangeListener {

    /* renamed from: c */
    private static final C58495hd f273637c = C58495hd.m89903q("com.google.android.googlequicksearchbox/applications_uri", "com.google.android.gms/apps", "com.google.android.gms/apps", "com.google.android.googlequicksearchbox/applications_uri", "com.google.android.googlequicksearchbox/contacts_contact_id", "com.google.android.gms/contacts_contact_id", "com.google.android.gms/contacts_contact_id", "com.google.android.googlequicksearchbox/contacts_contact_id");

    /* renamed from: d */
    private static final C58495hd f273638d = C58495hd.m89901o("com.google.android.gms/apps", "com.google.android.gms/internal.3p:MobileApplication", "com.google.android.gms/internal.3p:MobileApplication", "com.google.android.gms/apps");

    /* renamed from: a */
    public final Context f273639a;

    /* renamed from: b */
    public final C84464e f273640b;

    /* renamed from: e */
    private final C84418a f273641e;

    /* renamed from: f */
    private final C86124t f273642f;

    /* renamed from: g */
    private DataSetObserver f273643g;

    /* renamed from: h */
    private PreferenceGroup f273644h;

    /* renamed from: i */
    private final C86127w f273645i;

    public C98000bx(Context context, C84418a aVar, C84464e eVar, C86127w wVar, C86124t tVar) {
        this.f273639a = context;
        this.f273641e = aVar;
        this.f273640b = eVar;
        this.f273645i = wVar;
        this.f273642f = tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo90871a(Collection collection) {
        Drawable drawable;
        PreferenceGroup preferenceGroup = this.f273644h;
        preferenceGroup.getClass();
        HashSet<Preference> hashSet = new HashSet<>();
        for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
            hashSet.add(preferenceGroup.getPreference(i));
        }
        C58485gu c = this.f273642f.mo79745c(C89987az.f246750c);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C84430al alVar = (C84430al) it.next();
            if (c.contains(alVar.f229733a)) {
                Preference findPreference = preferenceGroup.findPreference(C84463d.m134801b(alVar));
                if (findPreference != null) {
                    hashSet.remove(findPreference);
                } else {
                    C86336p pVar = new C86336p(this.f273639a);
                    pVar.setKey(C84463d.m134801b(alVar));
                    pVar.setChecked(alVar.f229744l);
                    pVar.setOnPreferenceChangeListener(this);
                    Context context = this.f273639a;
                    CharSequence a = C84463d.m134800a(context, alVar, alVar.f229735c);
                    if (a == null && alVar.f229738f.labelRes != 0) {
                        a = C84463d.m134800a(context, alVar, alVar.f229738f.labelRes);
                    }
                    if (a == null) {
                        a = alVar.f229734b;
                    }
                    pVar.setTitle(a);
                    CharSequence a2 = C84463d.m134800a(this.f273639a, alVar, alVar.f229737e);
                    pVar.setSummaryOn(a2);
                    pVar.setSummaryOff(a2);
                    Context context2 = this.f273639a;
                    if (alVar.f229736d == 0) {
                        drawable = null;
                    } else {
                        drawable = context2.getPackageManager().getDrawable(alVar.f229734b, alVar.f229736d, alVar.f229738f);
                    }
                    if (drawable == null) {
                        drawable = context2.getResources().getDrawable(R.drawable.source_icon_default);
                    }
                    pVar.f233430a = drawable;
                    preferenceGroup.addPreference(pVar);
                }
            }
        }
        for (Preference preference : hashSet) {
            if (!preference.getKey().equals("ipa_searchable_items_description")) {
                preferenceGroup.removePreference(preference);
            }
        }
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        this.f273644h = (PreferenceGroup) preference;
        Preference preference2 = new Preference(this.f273639a);
        preference2.setKey("ipa_searchable_items_description");
        preference2.setSummary(R.string.ipa_searchable_items_summary);
        preference2.setSelectable(false);
        preference2.setLayoutResource(R.layout.searchable_items_description);
        this.f273644h.addPreference(preference2);
        this.f273644h.setOrderingAsAdded(false);
        if (this.f273643g == null) {
            C97998bv bvVar = new C97998bv(this);
            this.f273643g = bvVar;
            this.f273640b.mo78017f(bvVar);
        }
        mo90871a(this.f273640b.mo78016a());
    }

    /* renamed from: e */
    public final void mo82943e() {
        DataSetObserver dataSetObserver = this.f273643g;
        if (dataSetObserver != null) {
            this.f273640b.mo78018g(dataSetObserver);
            this.f273643g = null;
        }
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        this.f273639a.sendBroadcast(new Intent("android.search.action.SETTINGS_CHANGED"));
        String key = preference.getKey();
        if (!key.startsWith("enable_corpus_")) {
            return true;
        }
        String substring = key.substring(14);
        C86341u uVar = new C86341u((C86346z) this.f273645i.f232790a.mo79722a());
        Boolean bool = (Boolean) obj;
        uVar.mo80085k("enable_corpus_".concat(String.valueOf((String) f273637c.get(substring))), Boolean.valueOf(bool.booleanValue()));
        uVar.mo80086l(false);
        C58495hd hdVar = f273638d;
        if (hdVar.containsKey(substring)) {
            C86341u uVar2 = new C86341u((C86346z) this.f273645i.f232790a.mo79722a());
            uVar2.mo80085k("enable_corpus_".concat(String.valueOf((String) hdVar.get(substring))), Boolean.valueOf(bool.booleanValue()));
            uVar2.mo80086l(false);
        }
        for (C84430al alVar : this.f273640b.mo78016a()) {
            if (alVar.f229733a.equals(substring)) {
                boolean equals = obj.equals(true);
                alVar.f229744l = equals;
                C97999bw bwVar = new C97999bw(this);
                if (!alVar.f229734b.equals(this.f273639a.getPackageName())) {
                    String str = alVar.f229733a;
                    this.f273641e.mo77986c().mo77998e(alVar.f229734b, str.startsWith("com.google.android.gms") ? str.substring(23) : null, equals, bwVar);
                }
            }
        }
        return true;
    }
}

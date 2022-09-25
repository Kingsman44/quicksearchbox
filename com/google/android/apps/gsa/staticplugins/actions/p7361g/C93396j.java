package com.google.android.apps.gsa.staticplugins.actions.p7361g;

import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.apps.gsa.contacts.bg;
import com.google.android.apps.gsa.contacts.cn;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84428aj;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55088fk;
import com.google.p4152bb.p4153a.C55089fl;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.g.j */
/* compiled from: PG */
public final class C93396j {

    /* renamed from: a */
    public static final C59071e f260484a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.g.j");

    /* renamed from: b */
    public final C84428aj f260485b;

    /* renamed from: c */
    public final cn f260486c;

    /* renamed from: d */
    public final C68214a f260487d;

    /* renamed from: e */
    public final C68214a f260488e;

    /* renamed from: f */
    public final C86124t f260489f;

    /* renamed from: g */
    public final C93397k f260490g;

    /* renamed from: h */
    private final bg f260491h;

    /* renamed from: i */
    private final String f260492i;

    public C93396j(bg bgVar, C84428aj ajVar, cn cnVar, TelephonyManager telephonyManager, C68214a aVar, C68214a aVar2, C86124t tVar, C93397k kVar) {
        this.f260491h = bgVar;
        this.f260485b = ajVar;
        this.f260486c = cnVar;
        this.f260487d = aVar;
        this.f260488e = aVar2;
        String simCountryIso = telephonyManager.getSimCountryIso();
        if (TextUtils.isEmpty(simCountryIso) && Locale.getDefault() != null) {
            simCountryIso = Locale.getDefault().getCountry();
        }
        this.f260492i = TextUtils.isEmpty(simCountryIso) ? "US" : simCountryIso.toUpperCase(Locale.US);
        this.f260489f = tVar;
        this.f260490g = kVar;
    }

    /* renamed from: a */
    public final String mo87658a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String stripSeparators = PhoneNumberUtils.stripSeparators(str);
        if (TextUtils.isEmpty(stripSeparators)) {
            return str;
        }
        String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(stripSeparators, this.f260492i);
        return !TextUtils.isEmpty(formatNumberToE164) ? formatNumberToE164 : stripSeparators;
    }

    /* renamed from: b */
    public final Map mo87659b(Query query, List list, String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55088fk fkVar = (C55088fk) C55089fl.f144954j.createBuilder();
            fkVar.mo54187b((String) it.next());
            List a = this.f260491h.a(query, (C55089fl) fkVar.build(), (Map) null, (Set) null, str);
            if (a != null) {
                arrayList.addAll(a);
            }
        }
        TreeMap treeMap = new TreeMap();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Person person = (Person) arrayList.get(i2);
            Iterator it2 = C58485gu.m89842j(person.f236374e).iterator();
            while (true) {
                i = i2 + 1;
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = ((Contact) it2.next()).f236354e;
                if (treeMap.containsKey(str2)) {
                    ((C59052c) ((C59052c) f260484a.mo56226d()).mo56372aa(13720)).mo56389s("[%s] was tried to be associate with different person", str2);
                } else {
                    treeMap.put(mo87658a(str2), person);
                }
            }
            i2 = i;
        }
        return treeMap;
    }

    /* renamed from: c */
    public final Long mo87660c(C21454b bVar) {
        try {
            return Long.valueOf(Long.parseLong(bVar.f59905a.mo117712h(this.f260490g.mo87662d())));
        } catch (NumberFormatException e) {
            ((C59052c) ((C59052c) ((C59052c) f260484a.mo56226d()).mo56382g(e)).mo56372aa(13700)).mo56389s("Invalid integer value \"%s\" in receivedTime", bVar.f59905a.mo117712h(this.f260490g.mo87662d()));
            return null;
        }
    }
}

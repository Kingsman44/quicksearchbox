package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.text.TextUtils;
import com.google.android.libraries.social.peoplekit.common.dataservice.AutocompleteMatchInfo;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42096f;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitExternalEntityKey;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.C42282bh;
import com.google.android.libraries.social.populous.core.C42283bi;
import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.MatchInfo;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.PersonExtendedData;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Phone;
import com.google.common.p4522b.C58485gu;
import com.google.p4181bi.p4182a.C55790h;
import com.google.p4420by.p4423b.p4424a.C57870b;
import com.google.p4420by.p4425c.p4428b.p4429a.p4432b.C57887d;
import com.google.p4420by.p4425c.p4428b.p4429a.p4432b.C57889f;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.populous.f */
/* compiled from: PG */
public final class C42112f {
    /* renamed from: a */
    static int m73902a(ContactMethodField contactMethodField) {
        C42282bh bhVar = C42282bh.EMAIL;
        int ordinal = contactMethodField.mo45020lo().ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            int i = contactMethodField.mo45117k().mo45019i();
            if (i == 2) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i == 3 ? 3 : 0;
        } else if (ordinal == 3) {
            return 5;
        } else {
            if (ordinal != 4) {
                return ordinal != 5 ? 0 : 3;
            }
            return 4;
        }
    }

    /* renamed from: b */
    static C42111e m73903b(Person person, ContactMethodField contactMethodField, PeopleKitConfig peopleKitConfig) {
        C57887d dVar;
        boolean z;
        C42111e eVar = new C42111e();
        int a = m73902a(contactMethodField);
        String obj = contactMethodField.mo44982g().toString();
        if (contactMethodField instanceof Phone) {
            CharSequence f = contactMethodField.mo45118l().mo45043f();
            if (!TextUtils.isEmpty(f)) {
                obj = f.toString();
            }
        }
        eVar.f110130b = obj;
        eVar.f110131c = a;
        eVar.f110154z = contactMethodField;
        if (contactMethodField instanceof InAppNotificationTarget) {
            InAppNotificationTarget k = contactMethodField.mo45117k();
            String a2 = k.mo44976b().mo45153a();
            if ((k.mo45020lo() == C42282bh.IN_APP_EMAIL || k.mo45020lo() == C42282bh.IN_APP_PHONE || k.mo45020lo() == C42282bh.IN_APP_GAIA) && a2 == null) {
                a2 = k.mo45017h();
            }
            eVar.f110140l = a2;
        } else {
            eVar.f110140l = contactMethodField.mo44976b().mo45153a();
        }
        if (contactMethodField.mo45020lo() == C42282bh.IN_APP_NOTIFICATION_TARGET && !contactMethodField.mo45117k().mo45016f().isEmpty()) {
            ContactMethodField contactMethodField2 = (ContactMethodField) contactMethodField.mo45117k().mo45016f().get(0);
            String obj2 = contactMethodField2.mo44982g().toString();
            int a3 = m73902a(contactMethodField2);
            eVar.f110149u = obj2;
            eVar.f110150v = a3;
        }
        C58485gu guVar = contactMethodField.mo44976b().f110790g;
        if (guVar != null && !guVar.isEmpty()) {
            MatchInfo matchInfo = (MatchInfo) guVar.get(0);
            eVar.f110132d = new AutocompleteMatchInfo(matchInfo.mo45023b(), matchInfo.mo45022a());
        }
        C55790h hVar = null;
        Name name = person.mo44833d().length > 0 ? person.mo44833d()[0] : null;
        if (name != null) {
            boolean z2 = name.f110781e != 1;
            String obj3 = name.f110777a.toString();
            boolean z3 = !z2 ? !C42283bi.m74439c(name.f110780d.f110804u) : name.f110781e == 3;
            if (z2) {
                z = name.f110781e == 2;
            } else {
                z = C42283bi.m74439c(name.f110780d.f110804u);
            }
            eVar.mo44728b(obj3, z3, z);
            eVar.f110138j = C42096f.m73798c(name.f110777a.toString());
            String str = name.f110778b;
            if (str != null) {
                eVar.f110134f = str.toString();
            }
            C58485gu guVar2 = name.f110780d.f110790g;
            if (guVar2 != null && !guVar2.isEmpty()) {
                MatchInfo matchInfo2 = (MatchInfo) guVar2.get(0);
                eVar.f110137i = new AutocompleteMatchInfo(matchInfo2.mo45023b(), matchInfo2.mo45022a());
            }
        }
        if (person.mo44837f().length > 0) {
            eVar.f110139k = person.mo44837f()[0].mo45048d();
        }
        if (C42131a.m73927j() && peopleKitConfig.mo44761f() && (dVar = person.f110370f) != null) {
            eVar.f110144p = m73906e(dVar);
            eVar.f110145q = m73904c(dVar);
        }
        eVar.f110146r = m73905d(contactMethodField);
        if (peopleKitConfig.mo44762g() && contactMethodField.mo45020lo() == C42282bh.EMAIL) {
            Email j = contactMethodField.mo45116j();
            if (j.mo44975a() != null) {
                hVar = j.mo44975a().mo45001b();
            }
            if (hVar != null && hVar.equals(C55790h.INTERNAL)) {
                eVar.f110128B = 2;
            } else if (hVar == null || !hVar.equals(C55790h.EXTERNAL)) {
                eVar.f110128B = 1;
            } else {
                eVar.f110128B = 3;
            }
            if (j.mo44976b().f110797n) {
                eVar.f110127A = 2;
            } else {
                eVar.f110127A = 1;
            }
        }
        if (peopleKitConfig.mo44764i()) {
            C42130x xVar = new C42130x();
            xVar.f110200a = person;
            eVar.f110152x = new PopulousPerson(xVar);
        }
        eVar.f110151w = peopleKitConfig.mo44760e();
        PersonExtendedData personExtendedData = person.f110369e;
        if (personExtendedData != null && personExtendedData.mo45035b()) {
            eVar.f110143o = true;
        }
        return eVar;
    }

    /* renamed from: c */
    public static List m73904c(C57887d dVar) {
        C62971cq<C57870b> cqVar = dVar.f154849b;
        ArrayList arrayList = new ArrayList();
        for (C57870b bVar : cqVar) {
            int i = bVar.f154593a;
            if (i == 2) {
                arrayList.add(new PeopleKitExternalEntityKey(2, (String) bVar.f154594b));
            } else if (i == 3) {
                arrayList.add(new PeopleKitExternalEntityKey(3, (String) bVar.f154594b));
            } else if (i == 1) {
                arrayList.add(new PeopleKitExternalEntityKey(1, (String) bVar.f154594b));
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static boolean m73905d(ContactMethodField contactMethodField) {
        PersonFieldMetadata b = contactMethodField.mo44976b();
        if (b == null) {
            return false;
        }
        return C42331dc.m74558c(b.f110792i);
    }

    /* renamed from: e */
    public static boolean m73906e(C57887d dVar) {
        int a = C57889f.m88557a(dVar.f154848a);
        return a != 0 && a == 2;
    }
}

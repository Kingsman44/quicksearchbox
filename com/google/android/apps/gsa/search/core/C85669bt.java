package com.google.android.apps.gsa.search.core;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t;
import com.google.android.apps.gsa.search.shared.contact.C87515c;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.contact.PersonShortcut;
import com.google.android.apps.gsa.search.shared.contact.PersonShortcutKey;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4522b.C58759qy;
import com.google.p4152bb.p4153a.C55421x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.bt */
/* compiled from: PG */
public abstract class C85669bt {

    /* renamed from: a */
    public final List f231595a = new ArrayList();

    protected C85669bt() {
    }

    /* renamed from: f */
    public static boolean m137537f(C55421x xVar, Query query, C86124t tVar) {
        C55421x xVar2 = C55421x.UNKNOWN_ACTION_TYPE;
        int ordinal = xVar.ordinal();
        if (ordinal == 1) {
            return m137542k(query, tVar);
        }
        if (ordinal == 3) {
            return tVar.mo79746e(C90120fr.f250819ak);
        }
        if (ordinal == 22) {
            return m137540i(query, tVar);
        }
        if (ordinal != 152) {
            return true;
        }
        return m137541j(query);
    }

    /* renamed from: g */
    public static boolean m137538g(C55421x xVar, Query query, C86124t tVar) {
        C55421x xVar2 = C55421x.UNKNOWN_ACTION_TYPE;
        int ordinal = xVar.ordinal();
        if (ordinal == 1) {
            return m137542k(query, tVar);
        }
        if (ordinal == 3) {
            return tVar.mo79746e(C90120fr.f250819ak);
        }
        if (ordinal != 22) {
            if (ordinal != 152) {
                return true;
            }
            return m137541j(query);
        } else if (query.mo84337bV() || !m137540i(query, tVar)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: h */
    public static final PersonDisambiguation m137539h(VoiceAction voiceAction) {
        C87456t e = voiceAction.mo81064e();
        if (e == null) {
            return null;
        }
        return e.mo81156b();
    }

    /* renamed from: i */
    private static boolean m137540i(Query query, C86124t tVar) {
        if (query.mo84332bQ()) {
            return true;
        }
        return tVar.mo79746e(C90120fr.f250818aj);
    }

    /* renamed from: j */
    private static boolean m137541j(Query query) {
        return !query.mo84403cj();
    }

    /* renamed from: k */
    private static boolean m137542k(Query query, C86124t tVar) {
        if (query.mo84332bQ()) {
            return true;
        }
        return tVar.mo79746e(C90120fr.f250820al);
    }

    /* renamed from: a */
    public final PersonShortcut mo79198a(PersonShortcutKey personShortcutKey) {
        if (this.f231595a.isEmpty()) {
            return null;
        }
        for (PersonShortcut personShortcut : this.f231595a) {
            if (personShortcut.f236402e == personShortcutKey.f236402e && personShortcut.f236403f.equalsIgnoreCase(personShortcutKey.f236403f)) {
                if ((TextUtils.isEmpty(personShortcut.f236404g) && TextUtils.isEmpty(personShortcutKey.f236404g)) || TextUtils.equals(personShortcut.f236404g, personShortcutKey.f236404g)) {
                    return personShortcut;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final PersonShortcut mo79199b(PersonShortcutKey personShortcutKey) {
        PersonShortcut a = mo79198a(personShortcutKey);
        if (a == null) {
            return null;
        }
        return a;
    }

    /* renamed from: c */
    public final void mo79200c(long j, PersonDisambiguation personDisambiguation, Map map, PersonShortcutKey personShortcutKey) {
        String str;
        personDisambiguation.f236396l = map;
        if (personShortcutKey != null) {
            C87515c cVar = personShortcutKey.f236402e;
            PersonShortcut b = mo79199b(personShortcutKey);
            Iterator it = personDisambiguation.f236363b.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    break;
                }
                Person person = (Person) it.next();
                if (b != null && person.f236371b == b.f236399b) {
                    b.f236398a = j;
                    personDisambiguation.f236397m = b;
                    personDisambiguation.mo81535d(person, false);
                    if (cVar == C87515c.PERSON) {
                        personDisambiguation.mo81612y((List) null, false);
                    } else {
                        personDisambiguation.mo81612y(person.mo81562k(new C58759qy(cVar), (Set) null), false);
                    }
                }
            }
            if (personDisambiguation.mo81544m()) {
                C89949q.m146523g(307);
                if (b != null) {
                    str = b.f236400c;
                }
                if (str != null && cVar != C87515c.PERSON) {
                    for (Contact contact : personDisambiguation.f236411n) {
                        if (b != null && b.f236399b == contact.f236351b && str.equalsIgnoreCase(contact.f236354e) && cVar.equals(contact.f236350a)) {
                            if ((TextUtils.isEmpty(b.f236401d) && TextUtils.isEmpty(contact.f236356g)) || TextUtils.equals(b.f236401d, contact.f236356g)) {
                                personDisambiguation.mo81610w(contact, false);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo79201d(VoiceAction voiceAction) {
        PersonShortcut personShortcut;
        PersonShortcut a;
        PersonDisambiguation h = m137539h(voiceAction);
        if (h != null && (personShortcut = h.f236397m) != null && (a = mo79198a(personShortcut)) != null) {
            C89949q.m146523g(309);
            this.f231595a.remove(a);
            mo79202e();
        }
    }

    /* renamed from: e */
    public abstract void mo79202e();
}

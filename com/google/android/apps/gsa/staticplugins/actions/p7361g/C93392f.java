package com.google.android.apps.gsa.staticplugins.actions.p7361g;

import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.g.f */
/* compiled from: PG */
public final class C93392f {
    /* renamed from: a */
    public static PersonDisambiguation m153641a(PersonDisambiguation personDisambiguation, String str) {
        List<Contact> list;
        PersonDisambiguation personDisambiguation2 = new PersonDisambiguation(personDisambiguation.f236392h, personDisambiguation);
        if (!personDisambiguation.mo81544m() || (list = personDisambiguation.f236411n) == null) {
            return personDisambiguation2;
        }
        ArrayList arrayList = new ArrayList();
        for (Contact contact : list) {
            if (str.equalsIgnoreCase(contact.f236355f)) {
                arrayList.add(contact);
            }
        }
        if (arrayList.size() == 1) {
            personDisambiguation2.mo81610w((Contact) arrayList.get(0), true);
        } else {
            personDisambiguation2.mo81612y(arrayList, true);
        }
        return personDisambiguation2;
    }
}

package com.google.android.apps.gsa.search.shared.contact;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.search.shared.contact.p */
/* compiled from: PG */
public final class C87528p extends C87535w {
    /* renamed from: a */
    public final Person mo81630a(Person person, Person person2) {
        if (!person.mo81571v(person2)) {
            return null;
        }
        for (Contact contact : person.f236375f) {
            if (contact.mo81529l()) {
                for (Contact k : C58485gu.m89842j(person2.f236375f)) {
                    if (contact.mo81528k(k)) {
                        person.mo81574y(person2);
                        return person;
                    }
                }
                continue;
            }
        }
        return null;
    }
}

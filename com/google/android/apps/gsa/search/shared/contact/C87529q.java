package com.google.android.apps.gsa.search.shared.contact;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.search.shared.contact.q */
/* compiled from: PG */
public final class C87529q extends C87535w {
    /* renamed from: a */
    public final Person mo81630a(Person person, Person person2) {
        if (!person.mo81571v(person2)) {
            return null;
        }
        if (person.mo81572w() && person2.mo81572w()) {
            return null;
        }
        if (!C58485gu.m89842j(person.f236374e).isEmpty() && !C58485gu.m89842j(person2.f236374e).isEmpty()) {
            return null;
        }
        if (!C58485gu.m89842j(person.f236375f).isEmpty() && !C58485gu.m89842j(person2.f236375f).isEmpty()) {
            return null;
        }
        if (!C58485gu.m89842j(person.f236376g).isEmpty() && !C58485gu.m89842j(person2.f236376g).isEmpty()) {
            return null;
        }
        person.mo81574y(person2);
        return person;
    }
}

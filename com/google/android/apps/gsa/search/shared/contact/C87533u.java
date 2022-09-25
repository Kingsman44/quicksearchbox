package com.google.android.apps.gsa.search.shared.contact;

import android.telephony.PhoneNumberUtils;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.contact.u */
/* compiled from: PG */
public final class C87533u extends C87524l {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo81631b(Person person) {
        return C58485gu.m89842j(person.f236374e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo81632c(String str, String str2) {
        return PhoneNumberUtils.compare(str, str2);
    }
}

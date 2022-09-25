package com.google.common.p4523c;

import com.google.common.base.C58817ah;
import com.google.common.p4575r.C60754k;
import com.google.common.p4575r.C60755l;

/* renamed from: com.google.common.c.o */
/* compiled from: PG */
final class C58940o implements C58817ah {
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        String obj2 = charSequence.toString();
        C60754k c = C60755l.m92736c(charSequence.length());
        int i = 0;
        while (i < obj2.length()) {
            int codePointAt = obj2.codePointAt(i);
            i += Character.charCount(codePointAt);
            c.mo57180b(codePointAt);
        }
        return c.mo57179a();
    }
}

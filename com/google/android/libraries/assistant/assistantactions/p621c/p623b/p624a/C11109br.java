package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import android.content.ContentUris;
import android.provider.ContactsContract;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.br */
/* compiled from: PG */
public final /* synthetic */ class C11109br implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C11109br f36414a = new C11109br();

    private /* synthetic */ C11109br() {
    }

    public final Object apply(Object obj) {
        int i = C11110bs.f36416b;
        return ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, ((Long) obj).longValue()).toString();
    }
}

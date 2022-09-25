package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c;

import android.content.ContentUris;
import android.content.Intent;
import android.provider.ContactsContract;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.c.c */
/* compiled from: PG */
public final class C11315c {

    /* renamed from: a */
    private static final C59071e f36770a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.c.c");

    /* renamed from: b */
    private final C11314b f36771b;

    public C11315c(C11314b bVar) {
        this.f36771b = bVar;
    }

    /* renamed from: a */
    public final void mo19749a() {
        Intent intent = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
        intent.setFlags(1);
        this.f36771b.mo19747c(intent, new C11313a(this));
    }

    /* renamed from: b */
    public final /* synthetic */ void mo19750b(Intent intent) {
        if (intent != null) {
            try {
                this.f36771b.mo19748e(ContentUris.parseId(intent.getData()));
            } catch (NumberFormatException | UnsupportedOperationException e) {
                ((C59052c) ((C59052c) ((C59052c) f36770a.mo56226d()).mo56382g(e)).mo56372aa(43293)).mo56386p("Unexpected contact selection data");
            }
        }
    }
}

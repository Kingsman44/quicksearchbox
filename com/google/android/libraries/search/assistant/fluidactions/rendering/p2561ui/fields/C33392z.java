package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Intent;
import android.provider.ContactsContract;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33170a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33243b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33245d;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.z */
/* compiled from: PG */
public final /* synthetic */ class C33392z implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C33272ae f89451a;

    public /* synthetic */ C33392z(C33272ae aeVar) {
        this.f89451a = aeVar;
    }

    public final void onClick(View view) {
        C33272ae aeVar = this.f89451a;
        C33170a aVar = aeVar.f89235f;
        if (aVar != null) {
            C33245d dVar = new C33245d(aeVar, aVar);
            Intent intent = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
            intent.setFlags(1);
            dVar.f88894b.mo38559a(intent, new C33243b(dVar, intent));
        }
    }
}

package com.google.android.libraries.search.assistant.performer.communication.p2741f;

import android.provider.ContactsContract;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f.x */
/* compiled from: PG */
public final /* synthetic */ class C35756x implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35733aa f93684a;

    public /* synthetic */ C35756x(C35733aa aaVar) {
        this.f93684a = aaVar;
    }

    public final C60870cx apply(Object obj) {
        C35733aa aaVar = this.f93684a;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C46463o a = aaVar.f93652c.mo39825a(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data4", "data1"}, "raw_contact_id = ?", new String[]{(String) optional.get()}, "starred DESC", C39226b.TAG_CLASSIC_SERVICES_CO);
        if (a == null) {
            return C60856cj.m92900i(Optional.empty());
        }
        return a.f121591a.mo57272e(C47810es.m84970j(C35755w.f93683a), aaVar.f93653d).mo57275g();
    }
}

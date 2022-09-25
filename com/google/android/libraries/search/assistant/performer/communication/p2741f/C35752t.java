package com.google.android.libraries.search.assistant.performer.communication.p2741f;

import android.provider.ContactsContract;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f.t */
/* compiled from: PG */
public final /* synthetic */ class C35752t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35733aa f93680a;

    public /* synthetic */ C35752t(C35733aa aaVar) {
        this.f93680a = aaVar;
    }

    public final C60870cx apply(Object obj) {
        C35733aa aaVar = this.f93680a;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < guVar.size(); i++) {
            if (i != 0) {
                sb.append(" OR ");
            }
            sb.append("raw_contact_id = ?");
        }
        C46463o a = aaVar.f93652c.mo39825a(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "data4", "data2", "data3", "is_primary"}, sb.toString(), (String[]) guVar.toArray(new String[0]), "starred DESC", C39226b.TAG_CLASSIC_SERVICES_CO);
        if (a == null) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        return a.f121591a.mo57272e(C47810es.m84970j(C35754v.f93682a), aaVar.f93653d).mo57275g();
    }
}

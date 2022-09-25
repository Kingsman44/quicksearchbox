package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.p1123a;

import android.provider.ContactsContract;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C15541d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15553p f46521a;

    public /* synthetic */ C15541d(C15553p pVar) {
        this.f46521a = pVar;
    }

    public final C60870cx apply(Object obj) {
        C15553p pVar = this.f46521a;
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
        return pVar.f46550j.mo50872b(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "data4", "data2"}, sb.toString(), (String[]) guVar.toArray(new String[0]), "starred DESC, times_contacted DESC, last_time_contacted DESC").f121591a.mo57272e(C47810es.m84970j(C15538a.f46517a), pVar.f46546f).mo57275g();
    }
}

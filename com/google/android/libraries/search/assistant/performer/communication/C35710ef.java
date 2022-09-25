package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Intent;
import android.provider.ContactsContract;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ef */
/* compiled from: PG */
public final class C35710ef {

    /* renamed from: a */
    public static final C59071e f93613a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.ef");

    /* renamed from: a */
    public static C60870cx m64102a(C46877q qVar, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setPackage(str3);
        C60838bs g = qVar.mo50872b(ContactsContract.Data.CONTENT_URI, new String[]{"_id", "mimetype", "data1"}, "mimetype=? AND data1=?", new String[]{str2, str}, "display_name").f121591a.mo57272e(C47810es.m84970j(C35709ee.f93612a), C60826bg.f164896a).mo57275g();
        C35688dw dwVar = new C35688dw(intent, str2);
        return C60922j.m93044g(g, C47810es.m84963c(dwVar), C60826bg.f164896a);
    }
}

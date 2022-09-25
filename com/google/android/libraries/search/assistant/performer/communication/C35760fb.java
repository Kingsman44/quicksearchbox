package com.google.android.libraries.search.assistant.performer.communication;

import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import com.evernote.android.state.BuildConfig;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.fb */
/* compiled from: PG */
public final class C35760fb {
    /* renamed from: a */
    public static C60870cx m64143a(C46877q qVar, String str, String str2) {
        C46877q qVar2 = qVar;
        C60838bs g = qVar2.mo50872b(ContactsContract.Data.CONTENT_URI, new String[0], "mimetype=? AND data1=?", new String[]{str2, str}, "display_name").f121591a.mo57272e(C47810es.m84970j(C35726ev.f93637a), C60826bg.f164896a).mo57275g();
        C35727ew ewVar = new C35727ew(str2);
        return C60922j.m93044g(g, C47810es.m84963c(ewVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public static String m64144b(String str) {
        return String.format("%s@s.whatsapp.net", new Object[]{PhoneNumberUtils.normalizeNumber(str).replace("+", BuildConfig.FLAVOR)});
    }
}

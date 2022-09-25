package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.p1123a;

import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.b.a.o */
/* compiled from: PG */
public final /* synthetic */ class C15552o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15553p f46539a;

    /* renamed from: b */
    public final /* synthetic */ String f46540b;

    public /* synthetic */ C15552o(C15553p pVar, String str) {
        this.f46539a = pVar;
        this.f46540b = str;
    }

    public final C60870cx apply(Object obj) {
        C15553p pVar = this.f46539a;
        String str = this.f46540b;
        Locale locale = (Locale) obj;
        if (TextUtils.isEmpty(str)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        String str2 = "%" + str + "%";
        return pVar.f46550j.mo50872b(ContactsContract.Contacts.CONTENT_URI, C15553p.f46543c, "display_name LIKE ? OR display_name_alt LIKE ? OR phonetic_name LIKE ?", new String[]{str2, str2, str2}, "starred DESC, times_contacted DESC, last_time_contacted DESC").f121591a.mo57272e(C47810es.m84970j(new C15549l(str, locale)), pVar.f46546f).mo57275g();
    }
}

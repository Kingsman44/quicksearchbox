package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.p1123a;

import android.provider.ContactsContract;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.b.a.m */
/* compiled from: PG */
public final /* synthetic */ class C15550m implements Function {

    /* renamed from: a */
    public final /* synthetic */ C15553p f46537a;

    public /* synthetic */ C15550m(C15553p pVar) {
        this.f46537a = pVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C15553p pVar = this.f46537a;
        String str = (String) obj;
        C60838bs g = pVar.f46550j.mo50872b(ContactsContract.Contacts.CONTENT_URI, new String[]{"display_name"}, "_id = ?", new String[]{str}, "starred DESC, times_contacted DESC, last_time_contacted DESC").f121591a.mo57272e(C47810es.m84970j(C15543f.f46525a), pVar.f46546f).mo57275g();
        C60838bs g2 = pVar.f46550j.mo50872b(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id"}, "contact_id = ? AND deleted = ?", new String[]{str, "0"}, (String) null).f121591a.mo57272e(C47810es.m84970j(C15548k.f46534a), pVar.f46546f).mo57275g();
        C15541d dVar = new C15541d(pVar);
        C60870cx h = C60922j.m93045h(g2, C47810es.m84966f(dVar), pVar.f46545e);
        return C47638k.m84753d(g, h).mo51520a(new C15542e(str, g, h), pVar.f46545e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

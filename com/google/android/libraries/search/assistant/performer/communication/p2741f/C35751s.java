package com.google.android.libraries.search.assistant.performer.communication.p2741f;

import android.provider.ContactsContract;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f.s */
/* compiled from: PG */
public final /* synthetic */ class C35751s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C35733aa f93678a;

    /* renamed from: b */
    public final /* synthetic */ long f93679b;

    public /* synthetic */ C35751s(C35733aa aaVar, long j) {
        this.f93678a = aaVar;
        this.f93679b = j;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C35733aa aaVar = this.f93678a;
        long j = this.f93679b;
        String[] strArr = {"raw_contact_id"};
        String str = "contact_id = ? AND mimetype = ?";
        C46463o a = aaVar.f93652c.mo39825a(ContactsContract.Data.CONTENT_URI, strArr, str, new String[]{Long.toString(j), (String) obj}, "starred DESC", C39226b.TAG_CLASSIC_SERVICES_CO);
        if (a == null) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        return a.f121591a.mo57272e(C47810es.m84970j(C35739g.f93666a), aaVar.f93653d).mo57275g();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

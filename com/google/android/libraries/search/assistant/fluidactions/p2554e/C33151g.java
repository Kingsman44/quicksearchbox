package com.google.android.libraries.search.assistant.fluidactions.p2554e;

import android.provider.ContactsContract;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.e.g */
/* compiled from: PG */
public final /* synthetic */ class C33151g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C33163s f88693a;

    /* renamed from: b */
    public final /* synthetic */ long f88694b;

    public /* synthetic */ C33151g(C33163s sVar, long j) {
        this.f88693a = sVar;
        this.f88694b = j;
    }

    public final C60870cx apply(Object obj) {
        C33163s sVar = this.f88693a;
        return sVar.f88716h.mo50872b(ContactsContract.Data.CONTENT_URI, C33163s.f88713e, "contact_id=?", new String[]{Long.toString(this.f88694b)}, (String) null).f121591a.mo57272e(C47810es.m84970j(new C33160p((String) obj)), sVar.f88718j).mo57275g();
    }
}

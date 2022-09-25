package com.google.android.libraries.search.assistant.p2497ab;

import android.provider.ContactsContract;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.ab.ba */
/* compiled from: PG */
public final /* synthetic */ class C32386ba implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C32389bd f86808a;

    /* renamed from: b */
    public final /* synthetic */ String f86809b;

    public /* synthetic */ C32386ba(C32389bd bdVar, String str) {
        this.f86808a = bdVar;
        this.f86809b = str;
    }

    public final C60870cx apply(Object obj) {
        C32389bd bdVar = this.f86808a;
        return bdVar.f86817e.mo50872b(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, C32389bd.f86815c, (String) null, (String[]) null, (String) null).f121591a.mo57272e(C47810es.m84970j(new C32388bc((Map) obj, this.f86809b)), bdVar.f86818f).mo57275g();
    }
}

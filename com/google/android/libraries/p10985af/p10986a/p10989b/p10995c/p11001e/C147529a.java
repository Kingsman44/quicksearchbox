package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p11001e;

import android.accounts.Account;
import android.content.Context;
import com.google.android.libraries.storage.p3304a.p3305a.C42714a;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.af.a.b.c.e.a */
/* compiled from: PG */
public final /* synthetic */ class C147529a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Context f398186a;

    /* renamed from: b */
    public final /* synthetic */ String f398187b;

    public /* synthetic */ C147529a(Context context, String str) {
        this.f398186a = context;
        this.f398187b = str;
    }

    public final Object apply(Object obj) {
        Context context = this.f398186a;
        String str = this.f398187b;
        Account account = (Account) obj;
        C42718e a = C42719f.m75461a(context);
        C42719f.m75462b("managed");
        a.f111967b = "managed";
        C42719f.m75463c(str);
        a.f111968c = str;
        C42714a.m75444b(account);
        a.f111969d = account;
        a.mo45821b("cgal.personalization.footprints.facs");
        return a.mo45820a();
    }
}

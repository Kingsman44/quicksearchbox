package com.google.frameworks.client.data.android.p4632a.p4633a;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.C142903e;
import com.google.android.gms.auth.C142914n;
import com.google.android.gms.auth.TokenData;
import com.google.android.libraries.p1730f.C21370a;
import com.google.frameworks.client.data.android.p4632a.C61346g;
import com.google.frameworks.client.data.android.p4632a.C61347h;
import com.google.frameworks.client.data.android.p4632a.C61352m;

/* renamed from: com.google.frameworks.client.data.android.a.a.g */
/* compiled from: PG */
public final class C61340g implements C61352m {

    /* renamed from: a */
    private final Context f165885a;

    /* renamed from: b */
    private final C21370a f165886b;

    public C61340g(Context context, C21370a aVar) {
        this.f165885a = context;
        this.f165886b = aVar;
    }

    /* renamed from: a */
    public final C61347h mo57905a(Account account, String str) {
        try {
            TokenData q = C142914n.m231869q(this.f165885a, account, str, (Bundle) null);
            return new C61347h(q.f387646b, this.f165886b.mo26870b(), q.f387647c);
        } catch (C142903e e) {
            throw new C61346g(e);
        }
    }

    /* renamed from: b */
    public final void mo57906b(String str) {
        try {
            C142914n.m231867o(this.f165885a, str);
        } catch (C142903e e) {
            throw new C61346g(e);
        }
    }
}

package com.google.android.apps.gsa.speech.helper.crossprofile;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142557aq;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.speech.helper.crossprofile.m */
/* compiled from: PG */
public final class C92328m implements C92329n {

    /* renamed from: a */
    private final C142557aq f257430a;

    public C92328m(C142557aq aqVar) {
        aqVar.getClass();
        this.f257430a = aqVar;
    }

    /* renamed from: a */
    public final Account mo86979a(String str) {
        C92326k kVar = C92326k.f257426a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C92326k.f257427b.mo86971c(bundle, "name", str, BundlerType.m231188a("java.lang.String"));
        return (Account) C92326k.f257427b.mo86969a(this.f257430a.mo117175b().mo117150a(-7611133829149911605L, 4, bundle), "return", BundlerType.m231188a("android.accounts.Account"));
    }

    /* renamed from: b */
    public final C60870cx mo86980b(String str, long j) {
        C92326k kVar = C92326k.f257426a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C92326k.f257427b.mo86971c(bundle, "tokenType", str, BundlerType.m231188a("java.lang.String"));
        BundlerType.m231188a("long");
        bundle.putLong("timeoutMs", j);
        C142568e eVar = new C142568e(C92326k.f257427b, BundlerType.m231189b("java.util.Set", BundlerType.m231188a("com.google.android.apps.gsa.speech.helper.proto.AuthToken")));
        this.f257430a.mo117175b().mo117153e(-7611133829149911605L, 0, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: c */
    public final String mo86981c(Account account, String str, long j) {
        C92326k kVar = C92326k.f257426a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C92326k.f257427b.mo86971c(bundle, "account", account, BundlerType.m231188a("android.accounts.Account"));
        C92326k.f257427b.mo86971c(bundle, "tokenType", str, BundlerType.m231188a("java.lang.String"));
        BundlerType.m231188a("long");
        bundle.putLong("timeoutMs", j);
        return (String) C92326k.f257427b.mo86969a(this.f257430a.mo117175b().mo117150a(-7611133829149911605L, 3, bundle), "return", BundlerType.m231188a("java.lang.String"));
    }

    /* renamed from: d */
    public final Set mo86982d(String str, long j) {
        C92326k kVar = C92326k.f257426a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C92326k.f257427b.mo86971c(bundle, "tokenType", str, BundlerType.m231188a("java.lang.String"));
        BundlerType.m231188a("long");
        bundle.putLong("timeoutMs", j);
        Bundle a = this.f257430a.mo117175b().mo117150a(-7611133829149911605L, 1, bundle);
        return (Set) C92326k.f257427b.mo86969a(a, "return", BundlerType.m231189b("java.util.Set", BundlerType.m231188a("com.google.android.apps.gsa.speech.helper.proto.AuthToken")));
    }

    /* renamed from: e */
    public final void mo86983e(String str) {
        C92326k kVar = C92326k.f257426a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C92326k.f257427b.mo86971c(bundle, "token", str, BundlerType.m231188a("java.lang.String"));
        this.f257430a.mo117175b().mo117150a(-7611133829149911605L, 5, bundle);
    }
}

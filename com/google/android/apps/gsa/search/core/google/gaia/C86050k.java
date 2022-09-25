package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.libraries.gcoreclient.p1757e.C21493b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.k */
/* compiled from: PG */
public final class C86050k implements C86049j {

    /* renamed from: a */
    private static final C59071e f232630a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.gaia.k");

    /* renamed from: b */
    private final C68214a f232631b;

    public C86050k(C68214a aVar) {
        this.f232631b = aVar;
    }

    /* renamed from: a */
    public final void mo79642a(String str) {
        try {
            ((C21493b) this.f232631b.mo27525b()).mo26969e(str);
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f232630a.mo56225c()).mo56382g(e)).mo56372aa(8030)).mo56386p("Failed to invalidate token!");
        }
    }

    /* renamed from: b */
    public final void mo79643b() {
    }

    /* renamed from: c */
    public final String mo79644c(Account account, String str, C91032p pVar) {
        try {
            pVar.mo85308a("GoogleAuthAdapter: get token with auth-util");
            return ((C21493b) this.f232631b.mo27525b()).mo26968d(account, str, new Bundle());
        } finally {
            pVar.mo85310c();
        }
    }

    /* renamed from: d */
    public final String mo79645d(Account account, String str, C91032p pVar) {
        try {
            pVar.mo85308a("GoogleAuthAdapter: get token with auth-util");
            return ((C21493b) this.f232631b.mo27525b()).mo26967c(account.name, str, new Bundle());
        } finally {
            pVar.mo85310c();
        }
    }
}

package com.google.android.apps.gsa.staticplugins.languagesettings.p8029a;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.assistant.p3861at.acz;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.a.d */
/* compiled from: PG */
final class C102652d extends k {

    /* renamed from: a */
    final /* synthetic */ Account f286529a;

    /* renamed from: b */
    final /* synthetic */ String f286530b;

    /* renamed from: c */
    final /* synthetic */ C102653e f286531c;

    public C102652d(C102653e eVar, Account account, String str) {
        this.f286531c = eVar;
        this.f286529a = account;
        this.f286530b = str;
    }

    /* renamed from: gn */
    public final void mo93363gn(Throwable th) {
        ((C58970a) ((C58970a) C102653e.f286532a.mo56226d()).mo56372aa(20840)).mo56389s("updating assistant language failed: %s", th.getMessage());
    }

    /* renamed from: go */
    public final /* bridge */ /* synthetic */ void mo93364go(Object obj) {
        acz acz = (acz) obj;
        this.f286531c.f286533b.f(this.f286529a.name, Locale.forLanguageTag(this.f286530b));
    }
}

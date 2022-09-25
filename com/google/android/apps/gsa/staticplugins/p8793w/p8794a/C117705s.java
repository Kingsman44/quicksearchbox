package com.google.android.apps.gsa.staticplugins.p8793w.p8794a;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.a.s */
/* compiled from: PG */
public final /* synthetic */ class C117705s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C117687ai f326696a;

    /* renamed from: b */
    public final /* synthetic */ File f326697b;

    /* renamed from: c */
    public final /* synthetic */ Query f326698c;

    /* renamed from: d */
    public final /* synthetic */ Account f326699d;

    public /* synthetic */ C117705s(C117687ai aiVar, File file, Query query, Account account) {
        this.f326696a = aiVar;
        this.f326697b = file;
        this.f326698c = query;
        this.f326699d = account;
    }

    public final C60870cx apply(Object obj) {
        return this.f326696a.mo103431a(this.f326697b, (String) obj, this.f326698c, this.f326699d.name);
    }
}

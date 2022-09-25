package com.google.android.libraries.mdi.download.foreground;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.libraries.mdi.download.p2228a.C28694b;
import com.google.common.base.C58833ax;
import com.google.common.p4537i.C59291p;
import com.google.common.p4537i.C59294s;

/* renamed from: com.google.android.libraries.mdi.download.foreground.b */
/* compiled from: PG */
public abstract class C29422b {
    /* renamed from: c */
    public static C29422b m54374c(String str, C58833ax axVar, C58833ax axVar2) {
        C59291p e = C59294s.m92135e().mo56748e();
        e.mo56766j(str);
        if (axVar.mo56113h()) {
            e.mo56766j("|");
            e.mo56766j(C28694b.m53577b((Account) axVar.mo56107c()));
        }
        if (axVar2.mo56113h()) {
            e.mo56766j("|");
            e.mo56766j((CharSequence) axVar2.mo56107c());
        }
        return new C29421a(1, e.mo56758p().toString());
    }

    /* renamed from: d */
    public static C29422b m54375d(Uri uri) {
        C59291p e = C59294s.m92135e().mo56748e();
        e.mo56766j(uri.toString());
        e.mo56766j("|");
        return new C29421a(2, e.mo56758p().toString());
    }

    /* renamed from: a */
    public abstract String mo34726a();

    /* renamed from: b */
    public abstract int mo34727b();

    public final String toString() {
        return mo34726a();
    }
}

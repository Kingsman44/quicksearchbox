package com.google.android.libraries.geller.p1818f.p1819a;

import android.accounts.Account;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.geller.p1814b.C21758b;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.geller.f.a.d */
/* compiled from: PG */
public final class C21789d {
    /* renamed from: a */
    public static C21758b m40904a(C58817ah ahVar, String str) {
        C21758b bVar = (C21758b) ahVar.apply(str);
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("GellerConfig is null");
    }

    /* renamed from: b */
    public static String m40905b(C58833ax axVar) {
        return axVar.mo56113h() ? ((Account) axVar.mo56107c()).name : BuildConfig.FLAVOR;
    }
}

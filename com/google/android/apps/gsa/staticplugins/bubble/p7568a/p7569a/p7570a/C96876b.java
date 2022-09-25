package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a.p7570a;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90003bi;
import com.google.android.libraries.storage.p3304a.p3305a.C42714a;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.a.a.b */
/* compiled from: PG */
public final class C96876b {
    /* renamed from: a */
    public static Uri m160482a(Context context, C86054o oVar, C86124t tVar) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("autobubblemodule");
        a.f111968c = "autobubblemodule";
        a.mo45821b("AutoBubbleData.pb");
        Account a2 = oVar.mo79668a();
        if (m160483b(a2, tVar)) {
            C42714a.m75444b(a2);
            a.f111969d = a2;
        }
        return a.mo45820a();
    }

    /* renamed from: b */
    public static boolean m160483b(Account account, C86124t tVar) {
        return account != null && tVar.mo79746e(C90003bi.f246865a);
    }
}

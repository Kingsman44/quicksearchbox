package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b;

import android.accounts.Account;
import com.google.android.gms.libs.p10829a.C144832a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.ArrayList;
import java.util.Set;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.b.c */
/* compiled from: PG */
public final class C37099c implements C37097a {

    /* renamed from: b */
    private static final C59071e f96631b = C59071e.m91331h();

    /* renamed from: a */
    public final C69585o f96632a;

    /* renamed from: c */
    private final C144832a f96633c;

    public C37099c(C144832a aVar, C69585o oVar) {
        C69664n.m101061g(oVar, "backgroundContext");
        this.f96633c = aVar;
        this.f96632a = oVar;
    }

    /* renamed from: a */
    public final Set mo40627a(String str) {
        try {
            Account[] accountArr = (Account[]) this.f96633c.mo120246b(new String[]{str}).getResult();
            C69664n.m101060f(accountArr, "accounts");
            ArrayList<Account> arrayList = new ArrayList<>();
            for (Account account : accountArr) {
                C69664n.m101060f(account, "it");
                if (C69664n.m101066l(account.type, "com.google")) {
                    String str2 = account.name;
                    C69664n.m101060f(str2, "account.name");
                    if (C69764m.m101230i(str2, "@google.com")) {
                    }
                }
                arrayList.add(account);
            }
            ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
            for (Account account2 : arrayList) {
                arrayList2.add(account2.name);
            }
            return C69540x.m100846ab(arrayList2);
        } catch (Exception e) {
            C59052c cVar = (C59052c) ((C59052c) f96631b.mo56225c()).mo56382g(e);
            cVar.mo56379ah(new C59094n(52518));
            cVar.mo56386p("Failed to get accounts.");
            return null;
        }
    }
}

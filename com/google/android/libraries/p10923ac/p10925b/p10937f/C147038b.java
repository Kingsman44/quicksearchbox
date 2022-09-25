package com.google.android.libraries.p10923ac.p10925b.p10937f;

import android.accounts.Account;
import com.google.android.libraries.gcoreclient.p1757e.C21489a;
import com.google.android.libraries.p10923ac.p10925b.p10933d.C146823b;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147248e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.libraries.ac.b.f.b */
/* compiled from: PG */
public final /* synthetic */ class C147038b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C147041e f397011a;

    public /* synthetic */ C147038b(C147041e eVar) {
        this.f397011a = eVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C147041e eVar = this.f397011a;
        HashMap hashMap = new HashMap();
        for (Account account : (List) obj) {
            C147248e eVar2 = eVar.f397021f;
            try {
                cxVar = C60856cj.m92900i(eVar2.f397488a.mo26965a(account.name));
            } catch (C21489a e) {
                cxVar = C60856cj.m92899h(new C146823b(e));
            } catch (IOException e2) {
                cxVar = C60856cj.m92899h(e2);
            }
            hashMap.put(cxVar, account);
        }
        return C60856cj.m92892a(hashMap.keySet()).mo57334a(new C147039c(eVar, hashMap), eVar.f397018c);
    }
}

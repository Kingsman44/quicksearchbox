package com.google.android.libraries.onegoogle.owners.p2386a;

import android.accounts.Account;
import com.google.android.libraries.onegoogle.owners.C30974i;
import com.google.android.libraries.onegoogle.owners.C30976k;
import com.google.android.libraries.onegoogle.owners.C30978m;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.onegoogle.owners.a.d */
/* compiled from: PG */
public final /* synthetic */ class C30945d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f83381a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f83382b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f83383c;

    public /* synthetic */ C30945d(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f83381a = cxVar;
        this.f83382b = cxVar2;
        this.f83383c = cxVar3;
    }

    public final Object call() {
        boolean z;
        C60870cx cxVar = this.f83381a;
        C60870cx cxVar2 = this.f83382b;
        C60870cx cxVar3 = this.f83383c;
        List<Account> list = (List) C30950i.m57754h(cxVar, "device accounts");
        List<Account> list2 = (List) C30950i.m57754h(cxVar2, "g1 accounts");
        C58485gu guVar = (C58485gu) C30950i.m57754h(cxVar3, "owners");
        if (list == null && list2 == null && guVar == null) {
            throw new C30978m();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (Account account : list) {
                C30944c.m57752a(account.name, arrayList, hashMap);
            }
            z = true;
        } else {
            z = false;
        }
        if (list2 != null) {
            for (Account account2 : list2) {
                if (!z) {
                    C30944c.m57752a(account2.name, arrayList, hashMap);
                }
                C30974i iVar = (C30974i) hashMap.get(account2.name);
                if (iVar != null) {
                    iVar.mo36624h(true);
                }
            }
        }
        if (guVar != null) {
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                C30976k kVar = (C30976k) guVar.get(i);
                String a = kVar.mo36650a();
                if (!z) {
                    C30944c.m57752a(a, arrayList, hashMap);
                }
                C30974i iVar2 = (C30974i) hashMap.get(a);
                if (iVar2 != null) {
                    iVar2.mo36620d(kVar.mo36653d());
                    iVar2.mo36622f(kVar.mo36656f());
                    iVar2.mo36621e(kVar.mo36654e());
                    iVar2.mo36626j(kVar.mo36657g());
                    iVar2.mo36619c(kVar.mo36651b());
                    iVar2.mo36623g(kVar.mo36658h());
                }
            }
        }
        C58480gp e = C58485gu.m89837e();
        for (String str : arrayList) {
            e.mo55395g(((C30974i) hashMap.get(str)).mo36617a());
        }
        return e.mo55394f();
    }
}

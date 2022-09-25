package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c;

import android.accounts.Account;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.facs.cache.C144169a;
import com.google.android.gms.facs.cache.C144184l;
import com.google.android.libraries.mdi.p2208a.p2209a.C28594a;
import com.google.android.libraries.mdi.p2210b.C28596a;
import com.google.android.libraries.p10985af.p10986a.p10987a.C147477a;
import com.google.android.libraries.p10985af.p10986a.p10987a.C147482b;
import com.google.android.libraries.p10985af.p10986a.p10987a.p10988a.C147481d;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.C147485b;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.C147488c;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10996a.C147517u;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10996a.p10997a.C147497e;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10998b.C147520b;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10999c.C147523b;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p11000d.C147527c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.af.a.b.c.r */
/* compiled from: PG */
public final class C147544r implements C147488c {

    /* renamed from: a */
    public final C147477a f398212a;

    /* renamed from: b */
    private final Object f398213b = new Object();

    /* renamed from: c */
    private final Map f398214c = new HashMap();

    /* renamed from: d */
    private final C147543q f398215d;

    public C147544r(C147543q qVar) {
        this.f398215d = qVar;
        C147491a aVar = (C147491a) qVar;
        Context context = aVar.f398107a;
        this.f398212a = new C147482b(context.getPackageName(), aVar.f398108b);
    }

    /* renamed from: a */
    public final C147485b mo124244a(Account account) {
        C147485b bVar;
        synchronized (this.f398213b) {
            if (!this.f398214c.containsKey(account)) {
                Map map = this.f398214c;
                C147517u uVar = new C147517u(new C147497e(), new C147527c(new C144184l(((C147491a) this.f398215d).f398107a, new C144169a(account)), ((C147491a) this.f398215d).f398108b), ((C147491a) this.f398215d).f398110d);
                C147520b a = C147520b.m240516a(((C147491a) this.f398215d).f398111e, new C28594a(), ((C147491a) this.f398215d).f398110d, this.f398212a);
                C147477a aVar = this.f398212a;
                C147543q qVar = this.f398215d;
                C147481d a2 = C147481d.m240441a(aVar, ((C147491a) qVar).f398111e, account, new C28596a(((C147491a) qVar).f398109c, account.toString(), 0));
                C147543q qVar2 = this.f398215d;
                ((C147491a) qVar2).f398107a.registerReceiver(new C147523b(uVar, a, ((C147491a) qVar2).f398109c), new IntentFilter("com.google.android.gms.udc.action.FACS_CACHE_UPDATED"));
                C147543q qVar3 = this.f398215d;
                map.put(account, new C147541o(uVar, a, a2, ((C147491a) qVar3).f398109c, ((C147491a) qVar3).f398110d));
            }
            bVar = (C147485b) this.f398214c.get(account);
        }
        return bVar;
    }
}

package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
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
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10996a.p10997a.C147496d;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10998b.C147520b;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p11000d.C147527c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.af.a.b.c.w */
/* compiled from: PG */
public final class C147549w implements C147488c {

    /* renamed from: a */
    public final C147477a f398217a;

    /* renamed from: b */
    private final Object f398218b = new Object();

    /* renamed from: c */
    private final Map f398219c = new HashMap();

    /* renamed from: d */
    private final C147547u f398220d;

    public C147549w(C147547u uVar) {
        this.f398220d = uVar;
        C147521c cVar = (C147521c) uVar;
        Context context = cVar.f398159a;
        this.f398217a = new C147482b(context.getPackageName(), cVar.f398162d);
    }

    /* renamed from: a */
    public final C147485b mo124244a(Account account) {
        C147485b b;
        Uri uri = (Uri) ((C147521c) this.f398220d).f398161c.apply(account);
        synchronized (this.f398218b) {
            if (!this.f398219c.containsKey(account)) {
                Map map = this.f398219c;
                Uri build = uri.buildUpon().appendPath("facs.pb").build();
                C147547u uVar = this.f398220d;
                C147517u uVar2 = new C147517u(new C147496d(build, ((C147521c) uVar).f398160b, ((C147521c) uVar).f398163e), new C147527c(new C144184l(((C147521c) this.f398220d).f398159a, new C144169a(account)), ((C147521c) this.f398220d).f398162d), ((C147521c) this.f398220d).f398165g);
                C147520b a = C147520b.m240516a(((C147521c) this.f398220d).f398166h, new C28594a(), ((C147521c) this.f398220d).f398165g, this.f398217a);
                C147477a aVar = this.f398217a;
                C147547u uVar3 = this.f398220d;
                C147481d a2 = C147481d.m240441a(aVar, ((C147521c) uVar3).f398166h, account, new C28596a(((C147521c) uVar3).f398164f, account.toString(), (int) ((C147521c) this.f398220d).f398165g.mo43943a()));
                C147547u uVar4 = this.f398220d;
                map.put(account, new C147524d(uri, new C147541o(uVar2, a, a2, ((C147521c) uVar4).f398164f, ((C147521c) uVar4).f398165g)));
            }
            C147548v vVar = (C147548v) this.f398219c.get(account);
            if (uri.equals(vVar.mo124293a())) {
                b = vVar.mo124294b();
            } else {
                throw new IllegalArgumentException(String.format("Attempting to create a second cache for the account in a different location. Previous uri: %s, new uri: %s", new Object[]{vVar.mo124293a(), uri}));
            }
        }
        return b;
    }
}

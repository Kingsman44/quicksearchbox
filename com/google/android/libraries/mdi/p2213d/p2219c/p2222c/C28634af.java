package com.google.android.libraries.mdi.p2213d.p2219c.p2222c;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.mdisync.C145080a;
import com.google.android.gms.mdisync.internal.C145094g;
import com.google.android.libraries.mdi.p2208a.p2209a.C28594a;
import com.google.android.libraries.mdi.p2210b.C28596a;
import com.google.android.libraries.mdi.p2213d.p2214a.p2215a.C28614b;
import com.google.android.libraries.mdi.p2213d.p2214a.p2215a.C28615c;
import com.google.android.libraries.mdi.p2213d.p2214a.p2215a.C28617e;
import com.google.android.libraries.mdi.p2213d.p2214a.p2216b.p2217a.C28618a;
import com.google.android.libraries.mdi.p2213d.p2219c.C28681j;
import com.google.android.libraries.mdi.p2213d.p2219c.C28682k;
import com.google.android.libraries.mdi.p2213d.p2219c.p2221b.C28625a;
import com.google.android.libraries.mdi.p2213d.p2219c.p2222c.p2223a.C28628a;
import com.google.android.libraries.mdi.p2213d.p2219c.p2222c.p2224b.C28641b;
import com.google.android.libraries.mdi.p2213d.p2219c.p2222c.p2225c.C28649g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3305a.C42714a;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.android.libraries.storage.protostore.C42901b;
import com.google.android.libraries.storage.protostore.C42959d;
import com.google.android.libraries.storage.protostore.C43018u;
import com.google.common.util.concurrent.C60826bg;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.mdi.d.c.c.af */
/* compiled from: PG */
public final class C28634af implements C28682k {

    /* renamed from: a */
    public final C43018u f77863a;

    /* renamed from: b */
    public final C28617e f77864b;

    /* renamed from: c */
    private final Object f77865c = new Object();

    /* renamed from: d */
    private final Map f77866d = new HashMap();

    /* renamed from: e */
    private final Context f77867e;

    /* renamed from: f */
    private final Executor f77868f;

    /* renamed from: g */
    private final C42813k f77869g;

    /* renamed from: h */
    private final C42880af f77870h;

    /* renamed from: i */
    private final C28625a f77871i;

    /* renamed from: j */
    private final C21370a f77872j;

    /* renamed from: k */
    private final String f77873k;

    public C28634af(Context context, Executor executor, String str, C42813k kVar, C42880af afVar, C28617e eVar, C28625a aVar, C21370a aVar2, C43018u uVar) {
        this.f77867e = context;
        this.f77868f = executor;
        this.f77869g = kVar;
        this.f77870h = afVar;
        this.f77864b = eVar;
        this.f77871i = aVar;
        this.f77872j = aVar2;
        this.f77873k = str;
        this.f77863a = uVar;
    }

    /* renamed from: a */
    public final C28681j mo34308a(Account account) {
        C28681j jVar;
        Account account2 = account;
        synchronized (this.f77865c) {
            if (!this.f77866d.containsKey(account2)) {
                Map map = this.f77866d;
                C42718e a = C42719f.m75461a(this.f77867e);
                a.f111966a = "com.google.android.gms";
                C42719f.m75462b("managed");
                a.f111967b = "managed";
                C42719f.m75463c("mdisync");
                a.f111968c = "mdisync";
                C42714a.m75444b(account);
                a.f111969d = account2;
                a.mo45821b("profilesync/public/profile_info.pb");
                Uri a2 = a.mo45820a();
                C42880af afVar = this.f77870h;
                C42877ac i = C42878ad.m75739i();
                ((C42901b) i).f112236b = new C42959d(this.f77863a);
                i.mo45967d(C28638aj.f77881c);
                i.mo45968e(a2);
                C28618a aVar = new C28618a(afVar.mo45979a(i.mo45964a()));
                C28641b bVar = new C28641b(this.f77868f, this.f77869g);
                AtomicReference atomicReference = new AtomicReference(C28673z.f77940a);
                AtomicReference atomicReference2 = new AtomicReference(C28629aa.f77857a);
                Objects.requireNonNull(atomicReference);
                C28630ab abVar = new C28630ab(atomicReference);
                Objects.requireNonNull(atomicReference2);
                C28631ac acVar = new C28631ac(atomicReference2);
                C145094g gVar = new C145094g(this.f77867e, new C145080a(account2));
                C28649g gVar2 = new C28649g(this.f77867e, gVar, this.f77873k, abVar, acVar);
                Context context = this.f77867e;
                Context applicationContext = context.getApplicationContext();
                Map map2 = map;
                AtomicReference atomicReference3 = atomicReference;
                AtomicReference atomicReference4 = atomicReference2;
                C28615c cVar = new C28615c(new C28614b(applicationContext.getPackageName(), this.f77873k), new C28596a(this.f77872j, account.toString(), (int) this.f77871i.mo34299a()), new C28672y(this, account2));
                C28617e eVar = this.f77864b;
                Objects.requireNonNull(eVar);
                C28632ad adVar = new C28632ad(eVar);
                C28594a aVar2 = new C28594a();
                C28625a aVar3 = this.f77871i;
                Context applicationContext2 = this.f77867e.getApplicationContext();
                C28628a aVar4 = new C28628a(adVar, aVar2, aVar3, new C28614b(applicationContext2.getPackageName(), this.f77873k));
                C28671x xVar = new C28671x(gVar2, context, bVar, aVar, cVar, aVar4, this.f77871i);
                if (this.f77871i.mo34301c(this.f77867e)) {
                    xVar.mo34320e(new C28633ae(this, a2), C60826bg.f164896a);
                }
                atomicReference3.set(xVar);
                atomicReference4.set(xVar);
                account2 = account;
                map2.put(account2, xVar);
            }
            jVar = (C28681j) this.f77866d.get(account2);
        }
        return jVar;
    }
}

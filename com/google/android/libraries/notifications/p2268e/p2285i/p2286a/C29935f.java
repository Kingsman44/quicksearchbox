package com.google.android.libraries.notifications.p2268e.p2285i.p2286a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29787a;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29822m;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.C29839c;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2268e.p2279f.C29851a;
import com.google.android.libraries.notifications.p2268e.p2283h.C29929b;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.p4160bf.p4161a.p4163b.C55450an;
import com.google.p4160bf.p4161a.p4163b.C55489bz;
import com.google.p4160bf.p4164b.p4165a.C55615ay;
import com.google.protobuf.MessageLite;
import java.util.concurrent.TimeUnit;
import p5304e.p5305a.p5306a.p5409o.p5410a.C68958v;

/* renamed from: com.google.android.libraries.notifications.e.i.a.f */
/* compiled from: PG */
final class C29935f implements C29929b {

    /* renamed from: a */
    private final C29851a f81066a;

    /* renamed from: b */
    private final C29823n f81067b;

    /* renamed from: c */
    private final C21370a f81068c;

    /* renamed from: d */
    private final C29835a f81069d;

    public C29935f(C29851a aVar, C29823n nVar, C29835a aVar2, C21370a aVar3) {
        this.f81066a = aVar;
        this.f81067b = nVar;
        this.f81069d = aVar2;
        this.f81068c = aVar3;
    }

    /* renamed from: a */
    public final void mo35219a(C29820k kVar, MessageLite messageLite, Throwable th) {
        Object[] objArr = new Object[1];
        objArr[0] = kVar != null ? kVar.mo35009h() : BuildConfig.FLAVOR;
        C30058b.m55795g("FetchUpdatedThreadsCallback", th, "Fetched updated threads for account: %s (FAILURE)", objArr);
    }

    /* renamed from: b */
    public final void mo35220b(C29820k kVar, MessageLite messageLite, MessageLite messageLite2) {
        C55615ay ayVar = (C55615ay) messageLite2;
        Object[] objArr = new Object[2];
        objArr[0] = kVar != null ? kVar.mo35009h() : BuildConfig.FLAVOR;
        objArr[1] = Integer.valueOf(ayVar.f146746a.size());
        C30058b.m55794f("FetchUpdatedThreadsCallback", "Fetched updated threads for account: %s [%d threads](SUCCESS)", objArr);
        if (kVar != null) {
            if (!C68958v.m100020c()) {
                try {
                    kVar = this.f81067b.mo35088b(kVar.mo35009h());
                } catch (C29822m e) {
                    C30058b.m55792d("FetchUpdatedThreadsCallback", e, "Account not found in scheduled callback.", new Object[0]);
                    return;
                }
            }
            if (ayVar.f146747b > kVar.mo35008g().longValue()) {
                C29787a l = kVar.mo35014l();
                l.f80715c = Long.valueOf(ayVar.f146747b);
                kVar = l.mo34995a();
                this.f81067b.mo35091e(kVar);
            }
            C29820k kVar2 = kVar;
            if (ayVar.f146746a.size() > 0) {
                long micros = TimeUnit.MILLISECONDS.toMicros(this.f81068c.mo26870b());
                C29834a a = this.f81069d.mo35159a(C55489bz.FETCHED_UPDATED_THREADS);
                a.mo35145j(kVar2);
                a.mo35147l(ayVar.f146746a);
                a.mo35150o(micros);
                a.mo35136a();
                this.f81066a.mo35176a(kVar2, ayVar.f146746a, C30007h.m55637d(), new C29839c(Long.valueOf(micros), Long.valueOf(this.f81068c.mo26871c()), C55450an.FETCHED_UPDATED_THREADS), false);
            }
        }
    }
}

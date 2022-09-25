package com.google.android.libraries.notifications.p2268e.p2285i.p2286a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29787a;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29822m;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.data.impl.C29806k;
import com.google.android.libraries.notifications.data.impl.C29812q;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.C29839c;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2268e.p2277e.C29847a;
import com.google.android.libraries.notifications.p2268e.p2279f.C29851a;
import com.google.android.libraries.notifications.p2268e.p2283h.C29929b;
import com.google.android.libraries.notifications.p2289f.C29987a;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.p11027an.p11028a.C147767c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.p4160bf.p4161a.p4163b.C55450an;
import com.google.p4160bf.p4161a.p4163b.C55489bz;
import com.google.p4160bf.p4164b.p4165a.C55609as;
import com.google.p4160bf.p4164b.p4165a.C55611au;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55522ab;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55563bp;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.protobuf.C62971cq;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p5304e.p5305a.p5306a.p5409o.p5410a.C68958v;

/* renamed from: com.google.android.libraries.notifications.e.i.a.d */
/* compiled from: PG */
final class C29933d implements C29929b {

    /* renamed from: a */
    private final C29851a f81059a;

    /* renamed from: b */
    private final C29823n f81060b;

    /* renamed from: c */
    private final C29847a f81061c;

    /* renamed from: d */
    private final Set f81062d;

    /* renamed from: e */
    private final C21370a f81063e;

    /* renamed from: f */
    private final C29806k f81064f;

    /* renamed from: g */
    private final C29835a f81065g;

    public C29933d(C29851a aVar, C29823n nVar, C29806k kVar, C29847a aVar2, C29835a aVar3, Set set, C21370a aVar4) {
        this.f81059a = aVar;
        this.f81060b = nVar;
        this.f81064f = kVar;
        this.f81061c = aVar2;
        this.f81065g = aVar3;
        this.f81062d = set;
        this.f81063e = aVar4;
    }

    /* renamed from: a */
    public final void mo35219a(C29820k kVar, MessageLite messageLite, Throwable th) {
        Object[] objArr = new Object[1];
        objArr[0] = kVar != null ? kVar.mo35009h() : BuildConfig.FLAVOR;
        C30058b.m55795g("FetchLatestThreadsCallback", th, "Fetched latest threads for account: %s (FAILURE)", objArr);
    }

    /* renamed from: b */
    public final void mo35220b(C29820k kVar, MessageLite messageLite, MessageLite messageLite2) {
        Object[] objArr = new Object[1];
        objArr[0] = kVar != null ? kVar.mo35009h() : BuildConfig.FLAVOR;
        C30058b.m55794f("FetchLatestThreadsCallback", "Fetched latest threads for account: %s (SUCCESS)", objArr);
        C55609as asVar = (C55609as) messageLite;
        C55611au auVar = (C55611au) messageLite2;
        if (kVar != null) {
            if (!C68958v.m100020c()) {
                try {
                    kVar = this.f81060b.mo35088b(kVar.mo35009h());
                } catch (C29822m e) {
                    C30058b.m55792d("FetchLatestThreadsCallback", e, "Account not found in scheduled callback.", new Object[0]);
                    return;
                }
            }
            C29787a l = kVar.mo35014l();
            l.f80715c = Long.valueOf(auVar.f146731c);
            l.f80716d = Long.valueOf(auVar.f146730b);
            C55522ab a = C55522ab.m87701a(asVar.f146725f);
            if (a == null) {
                a = C55522ab.FETCH_REASON_UNSPECIFIED;
            }
            if (a == C55522ab.GUNS_MIGRATION && kVar.mo35003c().longValue() == 0) {
                l.f80718f = Long.valueOf(auVar.f146731c);
            }
            C29820k a2 = l.mo34995a();
            this.f81060b.mo35091e(a2);
            for (C29987a f : this.f81062d) {
                f.mo35295f();
            }
            ArrayList arrayList = new ArrayList();
            C29806k kVar2 = this.f81064f;
            C147767c cVar = new C147767c();
            cVar.f398712a.append("1");
            C58485gu a3 = kVar2.f80821a.mo35106a(a2, C58485gu.m89846n(cVar.mo124445a()));
            int size = a3.size();
            for (int i = 0; i < size; i++) {
                C29827r rVar = (C29827r) a3.get(i);
                if (rVar.mo35071r() != 2) {
                    arrayList.add(rVar.mo35063j());
                }
            }
            C29847a aVar = this.f81061c;
            C55563bp bpVar = (C55563bp) C55564bq.f146602f.createBuilder();
            bpVar.copyOnWrite();
            C55564bq bqVar = (C55564bq) bpVar.instance;
            bqVar.f146606c = 2;
            bqVar.f146604a = 2 | bqVar.f146604a;
            aVar.mo35173b(a2, arrayList, (C55564bq) bpVar.build(), 4, 8);
            this.f81064f.f80821a.mo35110e(a2, C29812q.m55070e(new C147767c().mo124445a(), "thread_id", (String[]) arrayList.toArray(new String[0])));
            if (auVar.f146729a.size() > 0) {
                long micros = TimeUnit.MILLISECONDS.toMicros(this.f81063e.mo26870b());
                C29834a a4 = this.f81065g.mo35159a(C55489bz.FETCHED_LATEST_THREADS);
                a4.mo35145j(a2);
                a4.mo35147l(auVar.f146729a);
                a4.mo35150o(micros);
                a4.mo35136a();
                C29851a aVar2 = this.f81059a;
                C62971cq cqVar = auVar.f146729a;
                C30007h d = C30007h.m55637d();
                C29839c cVar2 = new C29839c(Long.valueOf(micros), Long.valueOf(this.f81063e.mo26871c()), C55450an.FETCHED_LATEST_THREADS);
                C55522ab a5 = C55522ab.m87701a(asVar.f146725f);
                if (a5 == null) {
                    a5 = C55522ab.FETCH_REASON_UNSPECIFIED;
                }
                aVar2.mo35176a(a2, cqVar, d, cVar2, a5 == C55522ab.INBOX);
            }
        }
    }
}

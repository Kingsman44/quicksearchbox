package com.google.android.libraries.notifications.p2268e.p2285i.p2286a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29822m;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2268e.p2283h.C29929b;
import com.google.android.libraries.notifications.p2268e.p2287j.C29959j;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.p4160bf.p4161a.p4163b.C55489bz;
import com.google.p4160bf.p4164b.p4165a.C55595ae;
import com.google.p4160bf.p4164b.p4165a.C55597ag;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55560bm;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import p5304e.p5305a.p5306a.p5409o.p5410a.C68958v;

/* renamed from: com.google.android.libraries.notifications.e.i.a.a */
/* compiled from: PG */
final class C29930a implements C29929b {

    /* renamed from: a */
    private final C29959j f81055a;

    /* renamed from: b */
    private final C29823n f81056b;

    /* renamed from: c */
    private final C29835a f81057c;

    public C29930a(C29823n nVar, C29959j jVar, C29835a aVar) {
        this.f81056b = nVar;
        this.f81055a = jVar;
        this.f81057c = aVar;
    }

    /* renamed from: a */
    public final void mo35219a(C29820k kVar, MessageLite messageLite, Throwable th) {
        Object[] objArr = new Object[1];
        objArr[0] = kVar != null ? kVar.mo35009h() : BuildConfig.FLAVOR;
        C30058b.m55795g("BatchUpdateThreadStateCallback", th, "Failed to updated thread state for account: %s.", objArr);
        if (messageLite != null) {
            for (C55595ae aeVar : ((C55597ag) messageLite).f146696c) {
                C29834a b = this.f81057c.mo35160b(17);
                b.mo35145j(kVar);
                b.mo35152q(aeVar.f146689b);
                b.mo35136a();
            }
        }
    }

    /* renamed from: b */
    public final void mo35220b(C29820k kVar, MessageLite messageLite, MessageLite messageLite2) {
        Object[] objArr = new Object[1];
        objArr[0] = kVar != null ? kVar.mo35009h() : BuildConfig.FLAVOR;
        C30058b.m55794f("BatchUpdateThreadStateCallback", "Successfully updated thread state for account: %s.", objArr);
        ArrayList arrayList = new ArrayList();
        for (C55595ae aeVar : ((C55597ag) messageLite).f146696c) {
            C29834a a = this.f81057c.mo35159a(C55489bz.SUCCEED_TO_UPDATE_THREAD_STATE);
            a.mo35145j(kVar);
            a.mo35152q(aeVar.f146689b);
            a.mo35136a();
            C55564bq bqVar = aeVar.f146690c;
            if (bqVar == null) {
                bqVar = C55564bq.f146602f;
            }
            int a2 = C55560bm.m87708a(bqVar.f146608e);
            if (a2 != 0 && a2 == 3) {
                arrayList.addAll(aeVar.f146689b);
            }
        }
        if (!arrayList.isEmpty() && kVar != null) {
            if (!C68958v.m100020c()) {
                try {
                    kVar = this.f81056b.mo35088b(kVar.mo35009h());
                } catch (C29822m e) {
                    C30058b.m55792d("BatchUpdateThreadStateCallback", e, "Account not found in scheduled callback.", new Object[0]);
                    return;
                }
            }
            this.f81055a.mo35249d(kVar, arrayList, 0);
        }
    }
}

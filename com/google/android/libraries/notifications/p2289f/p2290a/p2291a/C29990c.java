package com.google.android.libraries.notifications.p2289f.p2290a.p2291a;

import android.content.Context;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2289f.C29987a;
import com.google.android.libraries.notifications.platform.p2337h.p2338a.C30144a;
import com.google.android.libraries.p1623at.p1633f.C19560a;
import com.google.android.libraries.p1623at.p1633f.C19562b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.p4160bf.p4161a.p4163b.C55489bz;
import java.util.ArrayList;
import java.util.List;
import p5304e.p5305a.p5306a.p5383k.p5384a.C68795d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.notifications.f.a.a.c */
/* compiled from: PG */
public final class C29990c implements C29987a, C19560a, C19562b {

    /* renamed from: a */
    private final C69464a f81197a;

    /* renamed from: b */
    private final C21370a f81198b;

    /* renamed from: c */
    private long f81199c;

    /* renamed from: d */
    private final List f81200d = new ArrayList();

    public C29990c(C69464a aVar, C21370a aVar2, Context context) {
        this.f81197a = aVar;
        this.f81198b = aVar2;
        C30144a.m56002a(context);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo35290a() {
    }

    /* renamed from: b */
    public final synchronized void mo35291b(C29820k kVar, C58485gu guVar) {
        if (C68795d.m99318c()) {
            this.f81200d.add(new C29988a(kVar, this.f81198b.mo26870b(), C58485gu.m89844l((C29827r[]) guVar.toArray(new C29827r[0]))));
        }
    }

    /* renamed from: c */
    public final /* synthetic */ int mo35292c() {
        return 1;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo35293d() {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo35294e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo35295f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo35296g() {
    }

    /* renamed from: h */
    public final /* synthetic */ void mo35297h() {
    }

    /* renamed from: i */
    public final String mo24805i() {
        return "clickduration";
    }

    /* renamed from: j */
    public final synchronized boolean mo24806j() {
        C55489bz bzVar;
        if (C68795d.m99318c()) {
            long b = this.f81198b.mo26870b();
            boolean z = false;
            for (C29989b bVar : this.f81200d) {
                boolean z2 = !z && Math.abs(bVar.mo35298a() - this.f81199c) < 500;
                z |= z2;
                if (z || bVar.mo35298a() > this.f81199c) {
                    if (z2) {
                        bzVar = C55489bz.CLICK_DURATION_CLICK_OPENED_APP;
                    } else {
                        bzVar = C55489bz.CLICK_DURATION_CLICK_WHILE_OPEN;
                    }
                    long a = bVar.mo35298a();
                    C29834a a2 = ((C29835a) this.f81197a.mo17428b()).mo35159a(bzVar);
                    a2.mo35145j(bVar.mo35299b());
                    a2.mo35140e(bVar.mo35300c());
                    a2.mo35141f(b - a);
                    a2.mo35136a();
                }
            }
        }
        this.f81200d.clear();
        return true;
    }

    /* renamed from: k */
    public final synchronized boolean mo24808k() {
        this.f81199c = this.f81198b.mo26870b();
        return true;
    }
}

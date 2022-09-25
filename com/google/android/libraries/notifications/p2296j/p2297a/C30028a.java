package com.google.android.libraries.notifications.p2296j.p2297a;

import com.google.android.libraries.notifications.p2296j.C30033c;
import com.google.android.libraries.notifications.p2296j.C30034d;
import com.google.p4160bf.p4164b.p4165a.C55597ag;
import com.google.p4160bf.p4164b.p4165a.C55599ai;
import com.google.p4160bf.p4164b.p4165a.C55601ak;
import com.google.p4160bf.p4164b.p4165a.C55603am;
import com.google.p4160bf.p4164b.p4165a.C55605ao;
import com.google.p4160bf.p4164b.p4165a.C55607aq;
import com.google.p4160bf.p4164b.p4165a.C55609as;
import com.google.p4160bf.p4164b.p4165a.C55611au;
import com.google.p4160bf.p4164b.p4165a.C55613aw;
import com.google.p4160bf.p4164b.p4165a.C55615ay;
import com.google.p4160bf.p4164b.p4165a.C55618ba;
import com.google.p4160bf.p4164b.p4165a.C55620bc;
import com.google.p4160bf.p4164b.p4165a.C55622be;
import com.google.p4160bf.p4164b.p4165a.C55624bg;
import com.google.p4160bf.p4164b.p4165a.C55626bi;
import com.google.p4160bf.p4164b.p4165a.C55628bk;
import com.google.p4160bf.p4164b.p4165a.C55630bm;
import com.google.p4160bf.p4164b.p4165a.C55632bo;

/* renamed from: com.google.android.libraries.notifications.j.a.a */
/* compiled from: PG */
public final class C30028a implements C30033c {

    /* renamed from: a */
    public C30030c f81263a;

    /* renamed from: a */
    public final C30034d mo35350a(String str, C55597ag agVar) {
        return this.f81263a.mo35359a("/v1/batchupdatethreadstate", str, agVar, C55599ai.f146698a);
    }

    /* renamed from: b */
    public final C30034d mo35351b(String str, C55601ak akVar) {
        return this.f81263a.mo35359a("/v1/createusersubscription", str, akVar, C55603am.f146707a);
    }

    /* renamed from: c */
    public final C30034d mo35352c(String str, C55605ao aoVar) {
        return this.f81263a.mo35359a("/v1/deleteusersubscription", str, aoVar, C55607aq.f146716a);
    }

    /* renamed from: d */
    public final C30034d mo35353d(String str, C55609as asVar) {
        return this.f81263a.mo35359a("/v1/fetchlatestthreads", str, asVar, C55611au.f146727d);
    }

    /* renamed from: e */
    public final C30034d mo35354e(String str, C55613aw awVar) {
        return this.f81263a.mo35359a("/v1/fetchupdatedthreads", str, awVar, C55615ay.f146744c);
    }

    /* renamed from: f */
    public final C30034d mo35355f(String str, C55618ba baVar) {
        return this.f81263a.mo35359a("/v1/removetarget", str, baVar, C55620bc.f146757a);
    }

    /* renamed from: g */
    public final C30034d mo35356g(String str, C55622be beVar) {
        return this.f81263a.mo35359a("/v1/setuserpreference", str, beVar, C55624bg.f146766a);
    }

    /* renamed from: h */
    public final C30034d mo35357h(String str, C55626bi biVar) {
        return this.f81263a.mo35359a("/v1/storetarget", str, biVar, C55628bk.f146780f);
    }

    /* renamed from: i */
    public final C30034d mo35358i(C55630bm bmVar) {
        return this.f81263a.mo35359a("/v1/updatethreadstatebytoken", (String) null, bmVar, C55632bo.f146792a);
    }
}

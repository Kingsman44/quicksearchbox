package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import android.accounts.Account;
import com.google.android.gms.auth.C142903e;
import com.google.android.gms.auth.C142921u;
import com.google.android.gms.auth.C142923w;
import com.google.android.gms.auth.C142924x;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.common.p4522b.C58486gv;
import com.google.common.util.concurrent.C60870cx;
import java.io.IOException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.profile.cookies.gaia.internal.GaiaCookieFetcher$fetchCookies$2", mo61344c = "GaiaCookieFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {38})
/* renamed from: com.google.android.libraries.web.profile.a.b.a.c */
/* compiled from: PG */
final class C44015c extends C69572j implements C69630p {

    /* renamed from: a */
    int f114573a;

    /* renamed from: b */
    final /* synthetic */ C44016d f114574b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44015c(C44016d dVar, C69577g gVar) {
        super(2, gVar);
        this.f114574b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44015c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C146006ab abVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f114573a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44016d dVar = this.f114574b;
            C60870cx a = dVar.f114576b.mo50214a(dVar.f114575a);
            this.f114573a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Account account = (Account) obj;
        C58486gv gvVar = new C58486gv();
        C142924x xVar = this.f114574b.f114577c;
        try {
            abVar = C146021aq.m237850d(new C142923w(xVar.f387828a, new C44014b(gvVar)).mo117819b(account, "https://www.google.com", "https://www.youtube.com"));
        } catch (C142903e | C142921u | IOException e) {
            abVar = C146021aq.m237849c(e);
        }
        if (abVar.mo122490i()) {
            Exception f = abVar.mo122487f();
            if (f == null) {
                return gvVar.mo55417a();
            }
            throw f;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44015c(this.f114574b, gVar);
    }
}

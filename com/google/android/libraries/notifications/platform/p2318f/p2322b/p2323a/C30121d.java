package com.google.android.libraries.notifications.platform.p2318f.p2322b.p2323a;

import android.os.Bundle;
import android.os.Parcel;
import androidx.work.C4381ae;
import androidx.work.C4382af;
import androidx.work.C4383ag;
import androidx.work.C4388al;
import androidx.work.C4390an;
import androidx.work.C4391ao;
import androidx.work.C4410f;
import androidx.work.C4412h;
import androidx.work.C4631l;
import androidx.work.C4632m;
import androidx.work.C4634o;
import androidx.work.impl.C4452ag;
import com.google.android.libraries.notifications.p2298k.p2299a.C30040c;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2318f.p2322b.p2323a.p2324a.C30118a;
import com.google.android.libraries.notifications.platform.registration.AccountRepresentation;
import com.google.common.base.C58847bk;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.notifications.platform.internal.job.impl.GnpJobSchedulingApiImpl$schedule$2", mo61344c = "GnpJobSchedulingApiImpl.kt", mo61345d = "invokeSuspend", mo61346e = {92})
/* renamed from: com.google.android.libraries.notifications.platform.f.b.a.d */
/* compiled from: PG */
final class C30121d extends C69572j implements C69630p {

    /* renamed from: a */
    int f81474a;

    /* renamed from: b */
    Object f81475b;

    /* renamed from: c */
    int f81476c;

    /* renamed from: d */
    final /* synthetic */ C30122e f81477d;

    /* renamed from: e */
    final /* synthetic */ AccountRepresentation f81478e;

    /* renamed from: f */
    final /* synthetic */ Bundle f81479f;

    /* renamed from: g */
    final /* synthetic */ Long f81480g;

    /* renamed from: h */
    final /* synthetic */ C30040c f81481h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30121d(C30040c cVar, C30122e eVar, AccountRepresentation accountRepresentation, Bundle bundle, Long l, C69577g gVar) {
        super(2, gVar);
        this.f81481h = cVar;
        this.f81477d = eVar;
        this.f81478e = accountRepresentation;
        this.f81479f = bundle;
        this.f81480g = l;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C30121d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        String str;
        int i;
        byte[] bArr;
        C4381ae aeVar;
        C4388al alVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        boolean z = false;
        if (this.f81476c != 0) {
            i = this.f81474a;
            str = this.f81475b;
            try {
                C69714l.m101134b(obj);
            } catch (Exception unused) {
            }
        } else {
            C69714l.m101134b(obj);
            int a = this.f81481h.mo35373a();
            String a2 = C30118a.m55954a(this.f81478e, a);
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.notifications.platform.JOB_KEY", this.f81481h.mo35377e());
            hashMap.put("com.google.android.libraries.notifications.platform.JOB_ID", a2);
            Bundle bundle = this.f81479f;
            if (bundle.isEmpty()) {
                bArr = null;
            } else {
                Parcel obtain = Parcel.obtain();
                C69664n.m101060f(obtain, "obtain()");
                bundle.writeToParcel(obtain, 0);
                bArr = obtain.marshall();
                obtain.recycle();
            }
            if (bArr != null) {
                C4631l.m13032c("com.google.android.libraries.notifications.platform.WORKER_PARAMS", bArr, hashMap);
            }
            C4410f fVar = new C4410f();
            if (this.f81481h.mo35380h() - 1 != 1) {
                aeVar = C4381ae.CONNECTED;
            } else {
                aeVar = C4381ae.NOT_REQUIRED;
            }
            fVar.mo9351c(aeVar);
            C4412h a3 = fVar.mo9349a();
            C4632m a4 = C4631l.m13030a(hashMap);
            if (this.f81481h.mo35378f()) {
                C30122e eVar = this.f81477d;
                C30040c cVar = this.f81481h;
                Long l = this.f81480g;
                C4390an anVar = new C4390an((Class) ((C58847bk) eVar.f81483b).f156646a, cVar.mo35374b(), TimeUnit.MILLISECONDS);
                anVar.mo9341f(a4);
                anVar.mo9339d(a3);
                C30117a.m55953a(anVar, cVar, l);
                alVar = C4452ag.m12686j(this.f81477d.f81482a).mo9331e(a2, C4634o.REPLACE, (C4391ao) anVar.mo9337b());
            } else {
                C30122e eVar2 = this.f81477d;
                C30040c cVar2 = this.f81481h;
                Long l2 = this.f81480g;
                C4382af afVar = new C4382af((Class) ((C58847bk) eVar2.f81483b).f156646a);
                afVar.mo9341f(a4);
                afVar.mo9339d(a3);
                C30117a.m55953a(afVar, cVar2, l2);
                alVar = C4452ag.m12686j(this.f81477d.f81482a).mo9335i(a2, 1, Collections.singletonList((C4383ag) afVar.mo9337b()));
            }
            C69664n.m101060f(alVar, "if (job.periodic) {\n    …imeWorkRequest)\n        }");
            try {
                C60870cx a5 = alVar.mo9320a();
                C69664n.m101060f(a5, "scheduleFuture.result");
                this.f81475b = a2;
                this.f81474a = a;
                this.f81476c = 1;
                if (C71663i.m104690c(a5, this) == aVar) {
                    return aVar;
                }
                i = a;
                str = a2;
            } catch (Exception unused2) {
                i = a;
                str = a2;
                C30058b.m55796h("GnpWorkManagerJobSchedulingApiImpl", "Failed to schedule a job for package [%s] with ID: %s, type: %s", this.f81477d.f81482a.getApplicationContext().getPackageName(), str, new Integer(i));
                return Boolean.valueOf(z);
            }
        }
        C30058b.m55789a("GnpWorkManagerJobSchedulingApiImpl", "Successfully scheduled a job for package [%s], with ID: %s, type: %s", this.f81477d.f81482a.getApplicationContext().getPackageName(), str, new Integer(i));
        z = true;
        return Boolean.valueOf(z);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C30121d(this.f81481h, this.f81477d, this.f81478e, this.f81479f, this.f81480g, gVar);
    }
}

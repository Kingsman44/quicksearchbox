package com.google.android.libraries.web.weblayer.p3464f.p3467b;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.web.profile.C44069d;
import com.google.android.p445a.C8850c;
import com.google.apps.tiktok.tracing.C47810es;
import java.util.ArrayList;
import java.util.Set;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72319ao;
import org.chromium.p5643b.p5644a.C72341bj;
import org.chromium.weblayer.C72587aw;
import org.chromium.weblayer.C72604bm;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69588r;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.weblayer.profile.internal.ProfileManagerImpl$clearBrowsingDataOnUiThread$2", mo61344c = "ProfileManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {103})
/* renamed from: com.google.android.libraries.web.weblayer.f.b.c */
/* compiled from: PG */
final class C44250c extends C69572j implements C69630p {

    /* renamed from: a */
    int f115086a;

    /* renamed from: b */
    /* synthetic */ Object f115087b;

    /* renamed from: c */
    final /* synthetic */ Set f115088c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44250c(Set set, C69577g gVar) {
        super(2, gVar);
        this.f115088c = set;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44250c) mo5194c((C72587aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        int i;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115086a != 0) {
            C72587aw awVar = (C72587aw) this.f115087b;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C72587aw awVar2 = (C72587aw) this.f115087b;
            Set<C44069d> set = this.f115088c;
            this.f115087b = awVar2;
            this.f115086a = 1;
            C69588r rVar = new C69588r(C69555b.m100961b(this));
            ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
            for (C44069d dVar : set) {
                C44069d dVar2 = C44069d.COOKIES_AND_SITE_DATA;
                int ordinal = dVar.ordinal();
                if (ordinal == 0) {
                    i = 0;
                } else if (ordinal == 1) {
                    i = 1;
                } else {
                    new StringBuilder("Unexpected DataType value ").append(dVar);
                    throw new AssertionError("Unexpected DataType value ".concat(String.valueOf(dVar)));
                }
                arrayList.add(new Integer(i));
            }
            int[] ae = C69540x.m100849ae(arrayList);
            Runnable q = C47810es.m84977q(new C44249b(rVar));
            C72604bm.m107399a();
            C72604bm.m107399a();
            try {
                C72319ao aoVar = awVar2.f193125g;
                C72341bj bjVar = new C72341bj(q);
                Parcel gA = aoVar.mo17260gA();
                gA.writeIntArray(ae);
                gA.writeLong(0);
                gA.writeLong(Long.MAX_VALUE);
                C8850c.m23499h(gA, bjVar);
                aoVar.mo17262he(2, gA);
                if (rVar.mo61355a() == aVar) {
                    return aVar;
                }
            } catch (RemoteException e) {
                throw new C72304a(e);
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C44250c cVar = new C44250c(this.f115088c, gVar);
        cVar.f115087b = obj;
        return cVar;
    }
}

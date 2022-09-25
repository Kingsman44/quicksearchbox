package com.google.android.libraries.web.weblayer.p3464f.p3467b;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p445a.C8850c;
import java.util.Set;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72319ao;
import org.chromium.p5643b.p5644a.C72341bj;
import org.chromium.weblayer.C72584at;
import org.chromium.weblayer.C72587aw;
import org.chromium.weblayer.C72604bm;
import p3186j$.util.Objects;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69588r;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.weblayer.profile.internal.ProfileManagerImpl$removeWebLayerPersistenceStorage$2", mo61344c = "ProfileManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {61})
/* renamed from: com.google.android.libraries.web.weblayer.f.b.e */
/* compiled from: PG */
final class C44252e extends C69572j implements C69630p {

    /* renamed from: a */
    int f115091a;

    /* renamed from: b */
    /* synthetic */ Object f115092b;

    /* renamed from: c */
    final /* synthetic */ Set f115093c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44252e(Set set, C69577g gVar) {
        super(2, gVar);
        this.f115093c = set;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44252e) mo5194c((C72587aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115091a != 0) {
            C72587aw awVar = (C72587aw) this.f115092b;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C72587aw awVar2 = (C72587aw) this.f115092b;
            Set set = this.f115093c;
            this.f115092b = awVar2;
            this.f115091a = 1;
            C69588r rVar = new C69588r(C69555b.m100961b(this));
            C44251d dVar = new C44251d(rVar, set);
            C72604bm.m107399a();
            if (!awVar2.f193121c.isEmpty()) {
                try {
                    C72319ao aoVar = awVar2.f193125g;
                    Objects.requireNonNull(dVar);
                    C72341bj bjVar = new C72341bj(new C72584at(dVar));
                    Parcel gA = aoVar.mo17260gA();
                    gA.writeStringArray((String[]) set.toArray(new String[set.size()]));
                    C8850c.m23499h(gA, bjVar);
                    aoVar.mo17262he(11, gA);
                    if (rVar.mo61355a() == aVar) {
                        return aVar;
                    }
                } catch (RemoteException e) {
                    throw new C72304a(e);
                }
            } else {
                throw new IllegalStateException("removetBrowserPersistenceStorage() is not applicable to in-memory profiles");
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C44252e eVar = new C44252e(this.f115093c, gVar);
        eVar.f115092b = obj;
        return eVar;
    }
}

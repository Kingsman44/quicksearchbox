package com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p445a.C8850c;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72341bj;
import org.chromium.p5643b.p5644a.C72355n;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72626o;
import org.chromium.weblayer.C72627p;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69588r;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.weblayer.profile.cookies.internal.WLCookieManager$getCookies$2", mo61344c = "WLCookieManager.kt", mo61345d = "invokeSuspend", mo61346e = {85})
/* renamed from: com.google.android.libraries.web.weblayer.f.a.a.j */
/* compiled from: PG */
final class C44236j extends C69572j implements C69630p {

    /* renamed from: a */
    int f115036a;

    /* renamed from: b */
    /* synthetic */ Object f115037b;

    /* renamed from: c */
    final /* synthetic */ String f115038c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44236j(String str, C69577g gVar) {
        super(2, gVar);
        this.f115038c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44236j) mo5194c((C72627p) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115036a != 0) {
            C72627p pVar = (C72627p) this.f115037b;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C72627p pVar2 = (C72627p) this.f115037b;
            String str = this.f115038c;
            this.f115037b = pVar2;
            this.f115036a = 1;
            C69588r rVar = new C69588r(C69555b.m100961b(this));
            Uri parse = Uri.parse(str);
            C44235i iVar = new C44235i(rVar);
            C72604bm.m107399a();
            try {
                C72626o oVar = new C72626o(iVar);
                C72355n nVar = pVar2.f193201a;
                String uri = parse.toString();
                C72341bj bjVar = new C72341bj(oVar);
                Parcel gA = nVar.mo17260gA();
                gA.writeString(uri);
                C8850c.m23499h(gA, bjVar);
                nVar.mo17262he(2, gA);
                obj = rVar.mo61355a();
                if (obj == aVar) {
                    return aVar;
                }
            } catch (RemoteException e) {
                throw new C72304a(e);
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C44236j jVar = new C44236j(this.f115038c, gVar);
        jVar.f115037b = obj;
        return jVar;
    }
}

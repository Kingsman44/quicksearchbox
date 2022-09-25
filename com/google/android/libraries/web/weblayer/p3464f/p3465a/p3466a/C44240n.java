package com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.web.profile.p3431a.C44060h;
import com.google.android.p445a.C8850c;
import kotlinx.coroutines.C71422aw;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72341bj;
import org.chromium.p5643b.p5644a.C72355n;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72625n;
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
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.web.weblayer.profile.cookies.internal.WLCookieManager$setCookiesInternal$2$1$1$1", mo61344c = "WLCookieManager.kt", mo61345d = "invokeSuspend", mo61346e = {250})
/* renamed from: com.google.android.libraries.web.weblayer.f.a.a.n */
/* compiled from: PG */
final class C44240n extends C69572j implements C69630p {

    /* renamed from: a */
    int f115050a;

    /* renamed from: b */
    final /* synthetic */ C44247u f115051b;

    /* renamed from: c */
    final /* synthetic */ C72627p f115052c;

    /* renamed from: d */
    final /* synthetic */ Uri f115053d;

    /* renamed from: e */
    final /* synthetic */ String f115054e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44240n(C44247u uVar, C72627p pVar, Uri uri, String str, C69577g gVar) {
        super(2, gVar);
        this.f115051b = uVar;
        this.f115052c = pVar;
        this.f115053d = uri;
        this.f115054e = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44240n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115050a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C72627p pVar = this.f115052c;
            Uri uri = this.f115053d;
            C69664n.m101060f(uri, "uri");
            String str = this.f115054e;
            this.f115050a = 1;
            C69588r rVar = new C69588r(C69555b.m100961b(this));
            try {
                C44243q qVar = new C44243q(rVar);
                C72604bm.m107399a();
                C72625n nVar = new C72625n(qVar);
                C72355n nVar2 = pVar.f193201a;
                String uri2 = uri.toString();
                C72341bj bjVar = new C72341bj(nVar);
                Parcel gA = nVar2.mo17260gA();
                gA.writeString(uri2);
                gA.writeString(str);
                C8850c.m23499h(gA, bjVar);
                Parcel gT = nVar2.mo17261gT(1, gA);
                boolean i = C8850c.m23500i(gT);
                gT.recycle();
                if (i) {
                    Object a = rVar.mo61355a();
                    if (a != C69554a.COROUTINE_SUSPENDED) {
                        a = C69788q.f186170a;
                    }
                    if (a == aVar) {
                        return aVar;
                    }
                } else {
                    throw new IllegalArgumentException("Invalid cookie: " + str);
                }
            } catch (RemoteException e) {
                throw new C72304a(e);
            } catch (IllegalArgumentException e2) {
                rVar.mo61338mb(C69714l.m101133a(new C44060h("Cookie has invalid format", e2)));
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44240n(this.f115051b, this.f115052c, this.f115053d, this.f115054e, gVar);
    }
}

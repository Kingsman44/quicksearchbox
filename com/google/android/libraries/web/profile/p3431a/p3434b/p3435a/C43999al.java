package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.anb;
import com.google.android.apps.gsa.binaries.satin.app.anc;
import com.google.android.apps.gsa.binaries.satin.app.ang;
import com.google.android.apps.gsa.binaries.satin.app.anh;
import com.google.android.gms.auth.C142924x;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.profile.p3431a.C44058f;
import com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43981c;
import com.google.android.libraries.web.profile.p3439b.C44065d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.web.profile.cookies.gaia.internal.LazyGaiaCookieManager$delegate$1", mo61344c = "GaiaCookieManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {444})
/* renamed from: com.google.android.libraries.web.profile.a.b.a.al */
/* compiled from: PG */
final class C43999al extends C69572j implements C69626l {

    /* renamed from: a */
    Object f114530a;

    /* renamed from: b */
    int f114531b;

    /* renamed from: c */
    final /* synthetic */ C44006as f114532c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43999al(C44006as asVar, C69577g gVar) {
        super(1, gVar);
        this.f114532c = asVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C43999al(this.f114532c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f114531b != 0) {
            obj3 = this.f114530a;
            C69714l.m101134b(obj);
            obj2 = obj;
        } else {
            C69714l.m101134b(obj);
            C44006as asVar = this.f114532c;
            anb anb = asVar.f114552c;
            C69626l lVar = asVar.f114551b;
            this.f114530a = anb;
            this.f114531b = 1;
            obj2 = lVar.mo5761a(this);
            if (obj2 == aVar) {
                return aVar;
            }
            obj3 = anb;
        }
        anb anb2 = (anb) obj3;
        C44065d gw = anb2.f197997a.b.mo66368gw();
        anh anh = anb2.f197997a.b;
        ang ang = anb2.f197997a;
        return new C44037y((Profile) obj2, (AccountId) anb2.f197997a.b.f198239e.mo17428b(), (C46175b) anb2.f197997a.b.f198398h.mo17428b(), (Context) anb2.f197997a.a.g.mo17428b(), gw, new C44016d((AccountId) anh.f198239e.mo17428b(), (C69585o) anh.f198133c.fs.mo17428b(), (C46128f) anh.f198504j.mo17428b(), new C142924x((Context) anh.f198133c.b.f199933a.g.mo17428b())), (C43981c) anb2.f197997a.b.f198110bd.mo17428b(), (C69585o) anb2.f197997a.a.G.mo17428b(), (C71422aw) anb2.f197997a.a.H.mo17428b(), (C44058f) anb2.f197997a.b.f198002B.mo17428b(), (anc) anb2.f197997a.b.f198113bg.mo17428b(), ang.b.f198114bh, ang.a.b.f200513kx);
    }
}

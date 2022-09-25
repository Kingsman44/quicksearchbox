package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6221w.p6222a;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6155a.C78175b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.p6160a.C78190aa;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78253d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6221w.C78850a;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80709ck;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.w.a.m */
/* compiled from: PG */
public final class C78863m implements C78728n {

    /* renamed from: a */
    private final C83358h f217026a;

    /* renamed from: b */
    private final C83363m f217027b = new C83363m();

    /* renamed from: c */
    private final C78850a f217028c;

    public C78863m(C83358h hVar, C83358h hVar2, C83358h hVar3, C83358h hVar4, C78253d dVar, C78190aa aaVar, C78850a aVar, C78175b bVar) {
        C78190aa aaVar2 = aaVar;
        this.f217028c = aVar;
        C83358h hVar5 = hVar;
        this.f217026a = C83349aj.m132655j(hVar, C83349aj.m132650e(hVar, dVar.mo73216p(), hVar3, aaVar2.f215281f, aaVar2.f215277b, hVar2, bVar.mo73110c(), hVar4, C78861k.f217024a), bVar.mo73110c(), C78862l.f217025a);
    }

    /* renamed from: a */
    public static C80709ck m126712a(C78245d dVar) {
        e a = dVar.mo73180b().mo73169a();
        if (a.equals(e.ax)) {
            return C80709ck.DIAGONAL_SWIPE;
        }
        if (a.equals(e.ay)) {
            return C80709ck.SQUEEZE;
        }
        if (a.equals(e.f)) {
            return C80709ck.FOLLOW_ON;
        }
        return C80709ck.UNKNOWN;
    }

    /* renamed from: h */
    public final void mo73112h() {
        this.f217027b.mo76661a();
    }

    /* renamed from: i */
    public final void mo73113i() {
        C83363m mVar = this.f217027b;
        C83358h hVar = this.f217026a;
        C78850a aVar = this.f217028c;
        Objects.requireNonNull(aVar);
        mVar.mo76663c(hVar, new C78860j(aVar));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }
}

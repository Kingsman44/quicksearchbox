package com.google.android.libraries.search.silk.p3162a.p3170h;

import android.app.Activity;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.location.p3029a.C38631bw;
import com.google.android.libraries.search.location.p3029a.C38632bx;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39229e;
import com.google.android.libraries.silk.p3205a.p3223l.C41726a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.android.libraries.silk.p3238b.C41749b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56730f;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56739o;
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.search.silk.a.h.a */
/* compiled from: PG */
public final class C40575a implements C41726a {

    /* renamed from: a */
    private static final C59071e f106492a = C59071e.m91332i("com.google.android.libraries.search.silk.a.h.a");

    /* renamed from: b */
    private final C68214a f106493b;

    /* renamed from: c */
    private final C68214a f106494c;

    /* renamed from: d */
    private final C58833ax f106495d;

    /* renamed from: e */
    private final Fragment f106496e;

    /* renamed from: f */
    private final C47215a f106497f;

    public C40575a(C58833ax axVar, Fragment fragment, C47215a aVar, C68214a aVar2, C68214a aVar3) {
        this.f106495d = axVar;
        this.f106496e = fragment;
        this.f106497f = aVar;
        this.f106493b = aVar2;
        this.f106494c = aVar3;
    }

    /* renamed from: d */
    private final C39226b m70319d() {
        if (!this.f106495d.mo56113h()) {
            return C39226b.TAG_GOOGLE_APP_MINUS_ONE;
        }
        return (C39226b) C39229e.f103352a.get(((Activity) this.f106495d.mo56107c()).getClass().getName());
    }

    /* renamed from: a */
    public final C60870cx mo42528a() {
        C39226b d = m70319d();
        if (d == null) {
            String name = ((Activity) this.f106495d.mo56107c()).getClass().getName();
            return C60856cj.m92899h(new C41742a(C41749b.m73222a("unattributed_usage", "TNG class " + name + " is not registered in SilkGeolocationApiImpl.")));
        }
        C40580f fVar = (C40580f) this.f106493b.mo27525b();
        C47215a aVar = this.f106497f;
        if (fVar.f106505c.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || fVar.f106505c.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            C40578d dVar = new C40578d(fVar, d);
            return C60856cj.m92905n(C47810es.m84965e(dVar), fVar.f106503a);
        }
        C60870cx a = fVar.f106506d.mo42583a(aVar, 10002, "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
        C40579e eVar = new C40579e(fVar, d);
        return C60922j.m93045h(a, C47810es.m84966f(eVar), fVar.f106503a);
    }

    /* renamed from: b */
    public final C60870cx mo42529b(C56730f fVar) {
        C60870cx cxVar;
        C39226b d = m70319d();
        if (d == null) {
            ((C59052c) ((C59052c) f106492a.mo56225c()).mo56372aa(53364)).mo56389s("TNG class %s is not registered in SilkGeolocationApiImpl.", ((Activity) this.f106495d.mo56107c()).getClass().getName());
            return C60856cj.m92899h(new C41742a(C41749b.m73222a("unattributed_usage", "TNG class " + ((Activity) this.f106495d.mo56107c()).getClass().getName() + " is not registered in SilkGeolocationApiImpl.")));
        }
        C40595s sVar = (C40595s) this.f106494c.mo27525b();
        C47215a aVar = this.f106497f;
        Fragment fragment = this.f106496e;
        int a = C56739o.m88221a(fVar.f151415a);
        if (a == 0) {
            a = 1;
        }
        C40582h hVar = (C40582h) fragment.getChildFragmentManager().f634a.mo671c("SilkGeolocationApiWithConsentFragment");
        if (hVar == null) {
            AccountId accountId = sVar.f106543e;
            C40582h hVar2 = new C40582h();
            C68324h.m98669f(hVar2);
            C47247a.m84047b(hVar2, accountId);
            C0154a aVar2 = new C0154a(fragment.getChildFragmentManager());
            aVar2.mo685r(hVar2, "SilkGeolocationApiWithConsentFragment");
            aVar2.mo509f();
            hVar = hVar2;
        }
        C40586l a2 = hVar.mo17754z();
        if (a2.mo42534a().f106546a != null) {
            cxVar = C60856cj.m92899h(new C41742a(C41749b.m73223b("Cannot get device's geolocation, another request is ongoing.")));
        } else {
            C38631bw bwVar = (C38631bw) C38632bx.f102079c.createBuilder();
            bwVar.copyOnWrite();
            C38632bx bxVar = (C38632bx) bwVar.instance;
            bxVar.f102082b = a - 1;
            bxVar.f102081a |= 1;
            a2.f106519d.mo50445g(new C46438d(a2.f106520e.mo41513i((C38632bx) bwVar.build())), new C46436b((Object) null), a2.f106516a);
            cxVar = C2169h.m6027a(new C40584j(a2));
        }
        return C60922j.m93045h(cxVar, C47810es.m84966f(new C40591o(sVar, d, aVar)), sVar.f106539a);
    }

    /* renamed from: c */
    public final C60870cx mo42530c() {
        C40595s sVar = (C40595s) this.f106494c.mo27525b();
        C60870cx b = sVar.f106544f.mo41506b();
        C40592p pVar = C40592p.f106534a;
        return C60922j.m93044g(b, C47810es.m84963c(pVar), sVar.f106539a);
    }
}

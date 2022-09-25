package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service;

import com.google.android.apps.gsa.staticplugins.fedass.trainingcache.p7956b.C101176b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.ad */
/* compiled from: PG */
final class C101202ad extends C101176b {

    /* renamed from: a */
    final /* synthetic */ TrainingCacheService f282481a;

    public C101202ad(TrainingCacheService trainingCacheService) {
        this.f282481a = trainingCacheService;
    }

    /* renamed from: e */
    public final void mo92155e() {
        ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56224b()).mo56372aa(19881)).mo56386p("binder beginSession");
        this.f282481a.mo92174b(C60856cj.m92904m(new C101226x(this), this.f282481a.f282468f), "beginSession failed.");
    }

    /* renamed from: f */
    public final void mo92156f() {
        ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56224b()).mo56372aa(19882)).mo56386p("binder clear");
        this.f282481a.mo92174b(C60856cj.m92904m(new C101227y(this), this.f282481a.f282468f), "clear failed.");
    }

    /* renamed from: g */
    public final void mo92157g(List list) {
        ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56224b()).mo56372aa(19883)).mo56386p("binder clear accounts");
        this.f282481a.mo92174b(C60856cj.m92904m(new C101200ab(this, list), this.f282481a.f282468f), "clear failed.");
    }

    /* renamed from: h */
    public final void mo92158h() {
        ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56224b()).mo56372aa(19884)).mo56386p("binder endSession");
        this.f282481a.mo92174b(C60856cj.m92904m(new C101228z(this), this.f282481a.f282468f), "endSession failed.");
    }

    /* renamed from: i */
    public final void mo92159i() {
        ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56224b()).mo56372aa(19885)).mo56386p("binder initEkho");
        TrainingCacheService trainingCacheService = this.f282481a;
        this.f282481a.mo92174b(C60856cj.m92905n(new C101223u(trainingCacheService), trainingCacheService.f282468f), "initEkho failed.");
    }

    /* renamed from: j */
    public final void mo92160j(int i, byte[] bArr, int i2) {
        ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56224b()).mo56372aa(19886)).mo56386p("binder insertClientEvent");
        this.f282481a.mo92174b(C60856cj.m92904m(new C101201ac(this, i, bArr, i2), this.f282481a.f282468f), "insertClientEvent failed.");
    }

    /* renamed from: k */
    public final void mo92161k(String str) {
        ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56224b()).mo56372aa(19887)).mo56386p("binder onAccountChanged");
        this.f282481a.mo92174b(C60856cj.m92905n(new C101222t(this, str), this.f282481a.f282468f), "onAccountChanged failed.");
    }

    /* renamed from: l */
    public final void mo92162l(List list) {
        ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56224b()).mo56372aa(19888)).mo56386p("binder onAccountsRemoved");
        this.f282481a.mo92174b(C60856cj.m92905n(new C101199aa(this, list), this.f282481a.f282468f), "onAccountsRemoved failed.");
    }

    /* renamed from: m */
    public final void mo92163m(String str) {
        ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56224b()).mo56372aa(19889)).mo56386p("binder onPrefsChanged");
        this.f282481a.mo92174b(C60856cj.m92905n(new C101221s(this, str), this.f282481a.f282468f), "onPrefsChanged failed.");
    }

    /* renamed from: n */
    public final void mo92164n() {
        ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56224b()).mo56372aa(19890)).mo56386p("binder onConfigFlagsChanged");
        TrainingCacheService trainingCacheService = this.f282481a;
        this.f282481a.mo92174b(C60856cj.m92905n(new C101224v(trainingCacheService), trainingCacheService.f282468f), "onConfigFlagsChanged failed.");
    }

    /* renamed from: o */
    public final void mo92165o() {
        ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56224b()).mo56372aa(19891)).mo56386p("binder onStartupFlagsChanged");
        TrainingCacheService trainingCacheService = this.f282481a;
        this.f282481a.mo92174b(C60856cj.m92905n(new C101225w(trainingCacheService), trainingCacheService.f282468f), "onConfigFlagsChanged failed.");
    }
}

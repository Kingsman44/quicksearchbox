package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100768ag;
import com.google.android.apps.gsa.staticplugins.fedass.trainingcache.p7956b.C101176b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* compiled from: PG */
public class TrainingCacheService extends C101198a {

    /* renamed from: a */
    public static final C59071e f282463a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.TrainingCacheService");

    /* renamed from: b */
    public C100768ag f282464b;

    /* renamed from: c */
    public C68214a f282465c;

    /* renamed from: d */
    public C91022f f282466d;

    /* renamed from: e */
    public Executor f282467e;

    /* renamed from: f */
    public Executor f282468f;

    /* renamed from: g */
    private final C101176b f282469g = new C101202ad(this);

    /* renamed from: b */
    public final void mo92174b(C60870cx cxVar, String str) {
        C60856cj.m92911t(C60846c.m92878g(cxVar, Throwable.class, new C101217o(str), this.f282468f), new C101203ae(str), this.f282468f);
    }

    public final IBinder onBind(Intent intent) {
        ((C59052c) ((C59052c) f282463a.mo56224b()).mo56372aa(19893)).mo56386p("onBind");
        return this.f282469g;
    }

    public final void onCreate() {
        C74507e.m120466b(27);
        super.onCreate();
        ((C59052c) ((C59052c) f282463a.mo56224b()).mo56372aa(19913)).mo56386p("onCreate");
        this.f282468f = new C60904dr(this.f282467e);
        this.f282466d.mo85301a(this.f282464b);
    }

    public final void onDestroy() {
        ((C59052c) ((C59052c) f282463a.mo56224b()).mo56372aa(19914)).mo56386p("onDestroy");
        super.onDestroy();
    }
}

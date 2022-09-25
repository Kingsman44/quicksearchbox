package com.google.android.libraries.notifications.entrypoints.restart;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.entrypoints.C29965d;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2268e.p2275d.p2276a.C29842b;
import com.google.android.libraries.notifications.p2268e.p2275d.p2276a.C29843c;
import com.google.android.libraries.notifications.p2268e.p2275d.p2276a.C29844d;
import com.google.android.libraries.notifications.p2289f.C29987a;
import com.google.android.libraries.notifications.p2294i.p2295a.C30019b;
import com.google.android.libraries.notifications.p2298k.C30035a;
import com.google.android.libraries.notifications.p2298k.C30045e;
import com.google.android.libraries.notifications.p2298k.p2299a.C30040c;
import com.google.android.libraries.notifications.p2305m.C30054a;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2309c.C30071a;
import com.google.android.libraries.notifications.platform.p2309c.C30073c;
import com.google.android.libraries.notifications.platform.p2309c.C30075e;
import com.google.android.libraries.notifications.platform.p2318f.p2322b.C30125d;
import com.google.android.libraries.notifications.platform.registration.AccountRepresentation;
import com.google.common.util.concurrent.C60860cn;
import com.google.common.util.concurrent.C60861co;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55540at;
import dagger.C68214a;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.C71802l;
import p5304e.p5305a.p5306a.p5383k.p5384a.C68798g;
import p5304e.p5305a.p5306a.p5383k.p5384a.C68815x;
import p5304e.p5305a.p5306a.p5409o.p5410a.C68940d;
import p5462h.p5466c.C69577g;

/* renamed from: com.google.android.libraries.notifications.entrypoints.restart.b */
/* compiled from: PG */
public final class C29972b implements C29965d {

    /* renamed from: a */
    private final C30075e f81146a;

    /* renamed from: b */
    private final C30054a f81147b;

    /* renamed from: c */
    private final C30045e f81148c;

    /* renamed from: d */
    private final C68214a f81149d;

    /* renamed from: e */
    private final Set f81150e;

    /* renamed from: f */
    private final C29971a f81151f;

    /* renamed from: g */
    private final C30019b f81152g;

    /* renamed from: h */
    private final C29844d f81153h;

    /* renamed from: i */
    private final C29835a f81154i;

    /* renamed from: j */
    private final C30040c f81155j;

    public C29972b(C30075e eVar, C30019b bVar, C30054a aVar, C30045e eVar2, C68214a aVar2, Set set, C29835a aVar3, C29844d dVar, C29971a aVar4, C30040c cVar) {
        this.f81146a = eVar;
        this.f81152g = bVar;
        this.f81147b = aVar;
        this.f81148c = eVar2;
        this.f81149d = aVar2;
        this.f81150e = set;
        this.f81154i = aVar3;
        this.f81153h = dVar;
        this.f81151f = aVar4;
        this.f81155j = cVar;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo35260a(Intent intent) {
        return 10;
    }

    /* renamed from: b */
    public final void mo35261b(Intent intent, C30007h hVar, long j) {
        C55540at atVar;
        C30058b.m55794f("RestartIntentHandler", "Re-surface notifications and sync registrations due to Restart Intent", new Object[0]);
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) && C68798g.f184867a.mo6453a().mo60483c()) {
            this.f81154i.mo35161c(6).mo35136a();
        }
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction()) && C68798g.f184867a.mo6453a().mo60482b()) {
            this.f81154i.mo35161c(7).mo35136a();
        }
        if (((C30073c) ((C30071a) this.f81146a).f81358d).f81379d - 1 == 0) {
            this.f81147b.mo35395d();
        } else if (C68815x.f184891a.mo6453a().mo60501d()) {
            try {
                if (C68940d.m99986c()) {
                    int i = C60861co.f164952a;
                    C60861co.m92916b(C60860cn.f164951a, ((C30125d) this.f81149d.mo27525b()).mo35522a(this.f81155j, (AccountRepresentation) null, new Bundle(), (Long) null), ExecutionException.class);
                } else {
                    this.f81148c.mo35370b((C29820k) null, 10, this.f81151f, new Bundle());
                }
            } catch (C30035a | ExecutionException e) {
                C30058b.m55795g("RestartIntentHandler", e, "Unable to schedule task for refreshing notifications.", new Object[0]);
            }
        } else {
            this.f81147b.mo35393b(hVar);
        }
        for (C29987a a : this.f81150e) {
            a.mo35290a();
        }
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            atVar = C55540at.APP_UPDATED;
        } else {
            atVar = C55540at.DEVICE_START;
        }
        this.f81152g.mo35345a(atVar);
        C29844d dVar = this.f81153h;
        if (C68940d.m99986c()) {
            C71802l.m105039a(new C29843c(dVar, (C69577g) null));
        } else {
            C71802l.m105039a(new C29842b(dVar, (C69577g) null));
        }
    }

    /* renamed from: c */
    public final boolean mo35262c(Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            return true;
        }
        return false;
    }
}

package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.libraries.search.assistant.performer.communication.p2740e.C35697e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2753e.C35990c;
import com.google.android.libraries.search.assistant.performer.p2767j.C36195q;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.util.concurrent.C60888db;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.be */
/* compiled from: PG */
public final class C35546be {

    /* renamed from: a */
    private final C69464a f93343a;

    /* renamed from: b */
    private final C69464a f93344b;

    /* renamed from: c */
    private final C69464a f93345c;

    /* renamed from: d */
    private final C69464a f93346d;

    /* renamed from: e */
    private final C69464a f93347e;

    /* renamed from: f */
    private final C69464a f93348f;

    /* renamed from: g */
    private final C69464a f93349g;

    public C35546be(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7) {
        aVar.getClass();
        this.f93343a = aVar;
        aVar2.getClass();
        this.f93344b = aVar2;
        aVar3.getClass();
        this.f93345c = aVar3;
        aVar4.getClass();
        this.f93346d = aVar4;
        aVar5.getClass();
        this.f93347e = aVar5;
        aVar6.getClass();
        this.f93348f = aVar6;
        this.f93349g = aVar7;
    }

    /* renamed from: a */
    public final ChatMessageExecutor mo39697a(C35470f fVar, C35697e eVar, C37215b bVar) {
        Context context = (Context) this.f93343a.mo17428b();
        context.getClass();
        C36195q qVar = (C36195q) this.f93344b.mo17428b();
        qVar.getClass();
        C60888db dbVar = (C60888db) this.f93345c.mo17428b();
        dbVar.getClass();
        C46428ao aoVar = (C46428ao) this.f93346d.mo17428b();
        aoVar.getClass();
        PackageManager packageManager = (PackageManager) this.f93347e.mo17428b();
        packageManager.getClass();
        fVar.getClass();
        eVar.getClass();
        C35674di diVar = (C35674di) this.f93348f.mo17428b();
        diVar.getClass();
        C35990c cVar = (C35990c) this.f93349g.mo17428b();
        cVar.getClass();
        bVar.getClass();
        return new ChatMessageExecutor(context, qVar, dbVar, aoVar, packageManager, fVar, eVar, diVar, cVar, bVar);
    }
}

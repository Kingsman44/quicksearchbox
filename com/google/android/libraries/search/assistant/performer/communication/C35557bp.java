package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Context;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.permissions.C36197b;
import com.google.android.libraries.search.assistant.performer.permissions.impl.DirectPermissionsRequesterImpl;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.util.concurrent.C60888db;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.bp */
/* compiled from: PG */
public final class C35557bp {

    /* renamed from: a */
    private final C69464a f93371a;

    /* renamed from: b */
    private final C69464a f93372b;

    /* renamed from: c */
    private final C69464a f93373c;

    /* renamed from: d */
    private final C69464a f93374d;

    public C35557bp(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4) {
        aVar.getClass();
        this.f93371a = aVar;
        aVar2.getClass();
        this.f93372b = aVar2;
        aVar3.getClass();
        this.f93373c = aVar3;
        aVar4.getClass();
        this.f93374d = aVar4;
    }

    /* renamed from: a */
    public final C35556bo mo39700a(C35470f fVar, C37215b bVar) {
        Context context = (Context) this.f93371a.mo17428b();
        context.getClass();
        C60888db dbVar = (C60888db) this.f93372b.mo17428b();
        dbVar.getClass();
        C46428ao aoVar = (C46428ao) this.f93373c.mo17428b();
        aoVar.getClass();
        C35573cb cbVar = (C35573cb) this.f93374d.mo17428b();
        cbVar.getClass();
        bVar.getClass();
        return new C35556bo(context, dbVar, fVar, cbVar, new DirectPermissionsRequesterImpl(context, dbVar, aoVar), bVar);
    }

    /* renamed from: b */
    public final C35556bo mo39701b(C35470f fVar, C35558bq bqVar, C36197b bVar, C37215b bVar2) {
        Context context = (Context) this.f93371a.mo17428b();
        context.getClass();
        C60888db dbVar = (C60888db) this.f93372b.mo17428b();
        dbVar.getClass();
        fVar.getClass();
        bqVar.getClass();
        bVar2.getClass();
        return new C35556bo(context, dbVar, fVar, bqVar, bVar, bVar2);
    }
}

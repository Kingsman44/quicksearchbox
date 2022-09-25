package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Context;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.permissions.C36197b;
import com.google.android.libraries.search.assistant.performer.permissions.impl.DirectPermissionsRequesterImpl;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.util.concurrent.C60888db;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.cu */
/* compiled from: PG */
public final class C35592cu {

    /* renamed from: a */
    private final C69464a f93425a;

    /* renamed from: b */
    private final C69464a f93426b;

    /* renamed from: c */
    private final C69464a f93427c;

    public C35592cu(C69464a aVar, C69464a aVar2, C69464a aVar3) {
        aVar.getClass();
        this.f93425a = aVar;
        aVar2.getClass();
        this.f93426b = aVar2;
        aVar3.getClass();
        this.f93427c = aVar3;
    }

    /* renamed from: a */
    public final C35591ct mo39724a(C35470f fVar) {
        Context context = (Context) this.f93425a.mo17428b();
        context.getClass();
        C60888db dbVar = (C60888db) this.f93426b.mo17428b();
        dbVar.getClass();
        C46428ao aoVar = (C46428ao) this.f93427c.mo17428b();
        aoVar.getClass();
        fVar.getClass();
        return new C35591ct(context, dbVar, fVar, new DirectPermissionsRequesterImpl(context, dbVar, aoVar));
    }

    /* renamed from: b */
    public final C35591ct mo39725b(C35470f fVar, C36197b bVar) {
        Context context = (Context) this.f93425a.mo17428b();
        context.getClass();
        C60888db dbVar = (C60888db) this.f93426b.mo17428b();
        dbVar.getClass();
        return new C35591ct(context, dbVar, fVar, bVar);
    }
}

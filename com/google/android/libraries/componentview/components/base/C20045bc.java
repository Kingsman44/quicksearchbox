package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1698e.C20491g;
import com.google.android.libraries.componentview.p1699f.C20511a;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56425d;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.componentview.components.base.bc */
/* compiled from: PG */
public final class C20045bc implements C20511a {

    /* renamed from: a */
    private final C69464a f56200a;

    /* renamed from: b */
    private final C69464a f56201b;

    /* renamed from: c */
    private final C69464a f56202c;

    /* renamed from: d */
    private final C69464a f56203d;

    /* renamed from: e */
    private final C69464a f56204e;

    public C20045bc(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5) {
        this.f56200a = aVar;
        this.f56201b = aVar2;
        this.f56202c = aVar3;
        this.f56203d = aVar4;
        this.f56204e = aVar5;
    }

    /* renamed from: a */
    public final /* synthetic */ C20470a mo25109a(C56425d dVar) {
        Context context = (Context) this.f56200a.mo17428b();
        context.getClass();
        dVar.getClass();
        C20537f a = ((C20491g) this.f56201b).mo17428b();
        Executor executor = (Executor) this.f56202c.mo17428b();
        executor.getClass();
        C20601ca caVar = (C20601ca) this.f56203d.mo17428b();
        caVar.getClass();
        C20566at atVar = (C20566at) this.f56204e.mo17428b();
        atVar.getClass();
        return new C20095t(context, dVar, a, executor, caVar, atVar);
    }
}
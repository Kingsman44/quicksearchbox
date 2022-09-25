package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.base.C19898a;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20103a;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20130b;
import com.google.android.libraries.componentview.p1699f.C20524l;
import com.google.android.libraries.componentview.services.application.C20579bf;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.componentview.components.c.c */
/* compiled from: PG */
public class C20234c extends C19898a {

    /* renamed from: a */
    public final C20524l f56826a;

    /* renamed from: b */
    public final C20579bf f56827b;

    /* renamed from: c */
    public final Executor f56828c;

    /* renamed from: d */
    public final ScheduledExecutorService f56829d;

    /* renamed from: j */
    public final C56429h f56830j;

    /* renamed from: k */
    public C20130b f56831k;

    public C20234c(C56425d dVar, Context context, C20537f fVar, C20524l lVar, C20579bf bfVar, Executor executor, ScheduledExecutorService scheduledExecutorService, C20601ca caVar, C20621l lVar2) {
        super(dVar, context, fVar, caVar, lVar2);
        this.f56826a = lVar;
        this.f56827b = bfVar;
        this.f56828c = executor;
        this.f56829d = scheduledExecutorService;
        C56429h hVar = dVar.f150542d;
        this.f56830j = hVar == null ? C56429h.f150547k : hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C19926b mo25154e() {
        C20130b bVar = this.f56831k;
        if ((bVar.f56429a & 32) == 0) {
            return null;
        }
        C19926b bVar2 = bVar.f56434f;
        return bVar2 == null ? C19926b.f55754e : bVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        C20130b bVar = this.f56831k;
        if ((bVar.f56429a & 1) == 0) {
            return null;
        }
        C56425d dVar = bVar.f56430b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C20103a aVar = (C20103a) this.f56831k.toBuilder();
            aVar.copyOnWrite();
            C20130b bVar = (C20130b) aVar.instance;
            bVar.f56430b = dVar;
            bVar.f56429a |= 1;
            this.f56831k = (C20130b) aVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20130b.f56427h, this.f56831k);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo25129h(View view) {
        view.setOnClickListener(new C20102a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo25130i(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20130b.f56427h);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        this.f56831k = (C20130b) obj;
    }
}

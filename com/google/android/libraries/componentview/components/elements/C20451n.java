package com.google.android.libraries.componentview.components.elements;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.elements.p1696a.C20380e;
import com.google.android.libraries.componentview.components.elements.p1696a.C20381f;
import com.google.android.libraries.componentview.components.elements.views.C20460a;
import com.google.android.libraries.componentview.p1697d.C20475f;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.p4522b.C58485gu;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62971cq;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.componentview.components.elements.n */
/* compiled from: PG */
public abstract class C20451n extends C20061bs implements C20456s, C20475f {

    /* renamed from: a */
    protected C20381f f57510a;

    /* renamed from: b */
    protected List f57511b;

    /* renamed from: c */
    public LinearLayoutManager f57512c;

    /* renamed from: d */
    public C20460a f57513d;

    /* renamed from: e */
    public boolean f57514e = false;

    /* renamed from: f */
    private final C20537f f57515f;

    /* renamed from: g */
    private final C20601ca f57516g;

    /* renamed from: h */
    private final Map f57517h = new HashMap();

    /* renamed from: i */
    private C20449l f57518i;

    public C20451n(Context context, C56425d dVar, C20537f fVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
        this.f57515f = fVar;
        this.f57516g = caVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        C20460a aVar = new C20460a(context);
        this.f57513d = aVar;
        aVar.mHasFixedSize = true;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.f57512c = linearLayoutManager;
        linearLayoutManager.setOrientation(0);
        this.f57513d.setLayoutManager(this.f57512c);
        this.f57513d.setClipToPadding(false);
        return this.f57513d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo25111g(C56425d dVar) {
        C56429h hVar;
        C20381f kF = mo25384kF(dVar);
        this.f57510a = kF;
        C62971cq<C56425d> cqVar = kF.f57307b;
        int i = 0;
        for (C56425d dVar2 : cqVar) {
            if (i < mo25397m()) {
                this.f57517h.put(Integer.valueOf(i), C20449l.m38362a(this, dVar2, this.f57515f, this.f57516g, i));
            }
            i++;
        }
        this.f57518i = new C20449l(this, cqVar, this.f57517h, this.f57515f, this.f57516g);
        ((C20460a) this.f56305p).setAdapter(this.f57518i);
        this.f57511b = cqVar;
        int i2 = this.f57510a.f57308c;
        if (i2 > 0 && i2 < this.f57511b.size()) {
            this.f57513d.getViewTreeObserver().addOnPreDrawListener(new C20447j(this, i2));
        }
        if ((dVar.f150539a & 4) != 0) {
            hVar = dVar.f150542d;
            if (hVar == null) {
                hVar = C56429h.f150547k;
            }
        } else {
            hVar = null;
        }
        C20601ca caVar = this.f57516g;
        if (hVar != null) {
            this.f57513d.f57548a = new C20448k(this, hVar, caVar);
        }
    }

    /* renamed from: kA */
    public final /* bridge */ /* synthetic */ List mo25239kA() {
        return C58485gu.m89842j(this.f57517h.values());
    }

    /* renamed from: kB */
    public final void mo25240kB() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        int findFirstVisibleItemPosition = this.f57512c.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition >= 0) {
            C20380e eVar = (C20380e) this.f57510a.toBuilder();
            eVar.copyOnWrite();
            C20381f fVar = (C20381f) eVar.instance;
            fVar.f57306a |= 1;
            fVar.f57308c = findFirstVisibleItemPosition;
            this.f57510a = (C20381f) eVar.build();
        }
        return mo25385kG(this.f57588z, this.f57510a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo25397m() {
        return 4;
    }
}

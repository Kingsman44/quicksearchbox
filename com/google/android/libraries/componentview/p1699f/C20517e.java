package com.google.android.libraries.componentview.p1699f;

import android.view.View;
import com.google.android.libraries.componentview.p1675a.p1676a.C19740a;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4271bq.C56425d;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.f.e */
/* compiled from: PG */
final class C20517e implements C19740a {

    /* renamed from: a */
    public final SettableFuture f57633a = new SettableFuture();

    /* renamed from: b */
    public final SettableFuture f57634b = new SettableFuture();

    /* renamed from: c */
    final /* synthetic */ C20518f f57635c;

    /* renamed from: d */
    private final C20470a f57636d;

    /* renamed from: e */
    private final C20516d f57637e;

    public C20517e(C20518f fVar, C20470a aVar, Executor executor) {
        this.f57635c = fVar;
        this.f57636d = aVar;
        View kH = aVar.mo25098kH();
        SettableFuture settableFuture = new SettableFuture();
        C58485gu K = aVar.mo25422K(C20470a.class);
        ArrayList arrayList = new ArrayList();
        int size = K.size();
        for (int i = 0; i < size; i++) {
            C60870cx b = ((C20470a) K.get(i)).mo25099b();
            if (b != null) {
                arrayList.add(b);
            }
        }
        C20482m.m38442j(arrayList, executor, settableFuture);
        if (kH == null) {
            C20614e eVar = new C20614e();
            eVar.mo25535e(C19742a.COMPONENT_INFLATION_FAILURE);
            eVar.f57822b = "Unexpected CanvasEmbeddableComponent with no root view";
            C20520h.m38498c("ComponentView", eVar.mo25531a(), fVar.f57638a, new Object[0]);
            C20482m.m38443k(settableFuture, this.f57634b, executor);
            this.f57637e = null;
            return;
        }
        C20516d dVar = new C20516d(this, kH.getContext());
        this.f57637e = dVar;
        dVar.addView(kH);
        dVar.addOnLayoutChangeListener(new C20515c(this, dVar, settableFuture, executor));
    }

    /* renamed from: b */
    public final C60870cx mo25099b() {
        return this.f57634b;
    }

    /* renamed from: c */
    public final String mo25097c() {
        return this.f57636d.mo25097c();
    }

    /* renamed from: d */
    public final C56425d mo25096d() {
        return this.f57636d.mo25096d();
    }

    /* renamed from: kH */
    public final View mo25098kH() {
        return this.f57637e;
    }
}

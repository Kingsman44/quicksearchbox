package com.google.android.apps.gsa.staticplugins.opa.webview;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4522b.C58495hd;
import java.util.concurrent.TimeUnit;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.y */
/* compiled from: PG */
public final /* synthetic */ class C114246y implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C114188ac f316800a;

    public /* synthetic */ C114246y(C114188ac acVar) {
        this.f316800a = acVar;
    }

    public final void accept(Object obj) {
        C114188ac acVar = this.f316800a;
        C114208aw awVar = (C114208aw) obj;
        if (awVar.mo101239b()) {
            C58495hd a = awVar.mo101238a();
            if (!acVar.f316605e && a != null) {
                try {
                    long a2 = (long) C114188ac.m189438a(a, "gsasrt");
                    long a3 = (long) C114188ac.m189438a(a, "aft");
                    long b = acVar.mo101244b();
                    Query query = acVar.f316606f;
                    query.getClass();
                    long j = query.f252747E + b + a2;
                    C89859i iVar = (C89859i) acVar.f316603c.mo27525b();
                    C89856f fVar = new C89856f();
                    fVar.f246201a = C89849ae.SRP_SERVER_RESPONSE_RECEIVED;
                    Query query2 = acVar.f316606f;
                    query2.getClass();
                    fVar.mo83701c("rId", Long.toString(query2.f252749G));
                    fVar.f246204d = TimeUnit.MILLISECONDS.toNanos(j);
                    iVar.mo74236a(fVar.mo83699a());
                    C89856f fVar2 = new C89856f();
                    fVar2.f246201a = C89849ae.SRP_ABOVE_THE_FOLD_CONTENT_RENDERED;
                    Query query3 = acVar.f316606f;
                    query3.getClass();
                    fVar2.mo83701c("rId", Long.toString(query3.f252749G));
                    fVar2.f246204d = TimeUnit.MILLISECONDS.toNanos(a3 + j);
                    iVar.mo74236a(fVar2.mo83699a());
                    acVar.f316605e = true;
                } catch (NumberFormatException unused) {
                }
            }
        }
        C58495hd a4 = awVar.mo101238a();
        try {
            long a5 = (long) C114188ac.m189438a(a4, "qsubts");
            long a6 = (long) C114188ac.m189438a(a4, "iml");
            long a7 = (long) C114188ac.m189438a(a4, "aft");
            long b2 = acVar.mo101244b();
            Query query4 = acVar.f316606f;
            query4.getClass();
            long j2 = query4.f252747E + b2 + a5;
            long j3 = a6 + j2;
            long j4 = a7 + j2;
            C89859i iVar2 = (C89859i) acVar.f316603c.mo27525b();
            if (!acVar.f316605e) {
                acVar.f316605e = true;
                C89856f fVar3 = new C89856f();
                fVar3.f246201a = C89849ae.SRP_SERVER_RESPONSE_RECEIVED;
                Query query5 = acVar.f316606f;
                query5.getClass();
                fVar3.mo83701c("rId", Long.toString(query5.f252749G));
                fVar3.f246204d = TimeUnit.MILLISECONDS.toNanos(j2);
                iVar2.mo74236a(fVar3.mo83699a());
                C89856f fVar4 = new C89856f();
                fVar4.f246201a = C89849ae.SRP_ABOVE_THE_FOLD_CONTENT_RENDERED;
                Query query6 = acVar.f316606f;
                query6.getClass();
                fVar4.mo83701c("rId", Long.toString(query6.f252749G));
                fVar4.f246204d = TimeUnit.MILLISECONDS.toNanos(j4);
                iVar2.mo74236a(fVar4.mo83699a());
            }
            C89856f fVar5 = new C89856f();
            fVar5.f246201a = C89849ae.SRP_IMAGES_LOADED;
            Query query7 = acVar.f316606f;
            query7.getClass();
            fVar5.mo83701c("rId", Long.toString(query7.f252749G));
            fVar5.f246204d = TimeUnit.MILLISECONDS.toNanos(j3);
            iVar2.mo74236a(fVar5.mo83699a());
        } catch (NumberFormatException unused2) {
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

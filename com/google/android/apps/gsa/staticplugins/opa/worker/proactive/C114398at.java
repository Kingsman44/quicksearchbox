package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.service.notification.StatusBarNotification;
import androidx.work.C4632m;
import androidx.work.C4643x;
import androidx.work.C4645z;
import androidx.work.WorkerParameters;
import com.google.android.libraries.search.assistant.proactive.C36221aq;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36267f;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.ajz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.at */
/* compiled from: PG */
public final class C114398at implements C46575i {

    /* renamed from: a */
    private static final C59071e f317212a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.at");

    /* renamed from: b */
    private final C36221aq f317213b;

    /* renamed from: c */
    private final C114418bj f317214c;

    public C114398at(C36221aq aqVar, C114418bj bjVar) {
        this.f317213b = aqVar;
        this.f317214c = bjVar;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C60870cx cxVar;
        try {
            byte[] d = workerParameters.f13989b.mo9569d("dismiss_params");
            if (d == null) {
                ((C59052c) ((C59052c) f317212a.mo56225c()).mo56372aa(29007)).mo56386p("Could not find dismiss params");
                return C60856cj.m92900i(new C4643x(C4632m.f14549a));
            }
            C36267f fVar = (C36267f) C62942bv.parseFrom((C62942bv) C36267f.f94725g, d, C62921ba.m95368a());
            C58833ax b = this.f317213b.mo40030b(fVar.f94728b);
            if (!b.mo56113h()) {
                return C60856cj.m92900i(new C4643x(C4632m.f14549a));
            }
            String group = ((StatusBarNotification) b.mo56107c()).getNotification().getGroup();
            int id = ((StatusBarNotification) b.mo56107c()).getId();
            this.f317213b.mo40039k(id);
            C114418bj bjVar = this.f317214c;
            String str = fVar.f94730d;
            ajz ajz = fVar.f94731e;
            if (ajz == null) {
                ajz = ajz.f158928q;
            }
            boolean z = fVar.f94732f;
            ((C59052c) ((C59052c) C114418bj.f317255a.mo56224b()).mo56372aa(29008)).mo56359L("#logExpiry: %s, %s, %s", str, ajz, Boolean.valueOf(z));
            if (bjVar.f317263i.f94583a) {
                if (z) {
                    cxVar = bjVar.f317259e.mo50254a();
                } else {
                    cxVar = bjVar.f317257c.mo79697b();
                }
                C114414bf bfVar = new C114414bf(bjVar, str, ajz, z);
                C46459k.m82829b(C60922j.m93044g(cxVar, C47810es.m84963c(bfVar), bjVar.f317260f), "GilNotificationLogger.logExpiry failed.", new Object[0]);
            } else {
                C114418bj.m189712e(34, str, ajz, z);
            }
            this.f317213b.mo40035g(group, id);
            return C60856cj.m92900i(new C4645z(C4632m.f14549a));
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f317212a.mo56225c()).mo56382g(e)).mo56372aa(29006)).mo56386p("Could not convert dismiss params");
            return C60856cj.m92900i(new C4643x(C4632m.f14549a));
        }
    }
}

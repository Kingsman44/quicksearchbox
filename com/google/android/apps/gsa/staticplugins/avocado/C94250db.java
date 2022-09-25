package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67224bo;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.db */
/* compiled from: PG */
public final /* synthetic */ class C94250db implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C94256dh f263369a;

    public /* synthetic */ C94250db(C94256dh dhVar) {
        this.f263369a = dhVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Object obj2;
        C94256dh dhVar = this.f263369a;
        try {
            C66611ci k = C94256dh.m155539k((C89057m) obj);
            AvocadoUtils.m155382f(k);
            C62940bt r1 = C62942bv.checkIsLite(C67224bo.f182701c);
            k.mo58887l(r1);
            if (k.f169962ag.mo58857o(r1.f169971d)) {
                C62940bt r12 = C62942bv.checkIsLite(C67224bo.f182701c);
                k.mo58887l(r12);
                Object l = k.f169962ag.mo58854l(r12.f169971d);
                if (l == null) {
                    obj2 = r12.f169969b;
                } else {
                    obj2 = r12.mo58889c(l);
                }
                C94200bf bfVar = dhVar.f263399n;
                bfVar.f263199b.set(((C67224bo) obj2).f182703a);
                ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14319)).mo56386p("Sent successfully.");
                return C60856cj.m92900i(true);
            }
            ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56372aa(14317)).mo56389s("No VideoWriterResponse: %s", AvocadoUtils.m155382f(k));
            return C60856cj.m92899h(new C62974ct("No VideoWriterResponse!"));
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56382g(e)).mo56372aa(14320)).mo56386p("Cannot get s3Response from http response!");
            return C60856cj.m92899h(e);
        }
    }
}

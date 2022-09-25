package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3929l.p3930a.C52695ba;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.p5209a.C66540k;
import com.google.speech.p5208h.p5209a.C66543n;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.co */
/* compiled from: PG */
public final /* synthetic */ class C94236co implements C22864c {
    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Object obj2;
        try {
            C66611ci k = C94256dh.m155539k((C89057m) obj);
            AvocadoUtils.m155382f(k);
            C62940bt r0 = C62942bv.checkIsLite(C66540k.f180971e);
            k.mo58887l(r0);
            if (k.f169962ag.mo58857o(r0.f169971d)) {
                C62940bt r02 = C62942bv.checkIsLite(C66540k.f180971e);
                k.mo58887l(r02);
                Object l = k.f169962ag.mo58854l(r02.f169971d);
                if (l == null) {
                    obj2 = r02.f169969b;
                } else {
                    obj2 = r02.mo58889c(l);
                }
                C66540k kVar = (C66540k) obj2;
                if ((kVar.f180973a & 16) != 0) {
                    C66543n nVar = kVar.f180975c;
                    if (nVar == null) {
                        nVar = C66543n.f180977d;
                    }
                    int a = C52695ba.m86691a(nVar.f180979a);
                    if (a == 0 || a == 1) {
                        return C60856cj.m92899h(new Exception("Haven't received valid status. May Retry."));
                    }
                    C66543n nVar2 = kVar.f180975c;
                    if (nVar2 == null) {
                        nVar2 = C66543n.f180977d;
                    }
                    return C60856cj.m92900i(nVar2);
                }
                ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56372aa(14325)).mo56389s("No ValidationResult: %s", AvocadoUtils.m155382f(k));
                return C60856cj.m92899h(new C62974ct("No ValidationResult!"));
            }
            ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56372aa(14324)).mo56389s("No EnrollmentFetcherResponse: %s", AvocadoUtils.m155382f(k));
            return C60856cj.m92899h(new C62974ct("No EnrollmentFetcherResponse!"));
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56382g(e)).mo56372aa(14326)).mo56386p("Cannot get s3Response from http response!");
            return C60856cj.m92899h(e);
        }
    }
}

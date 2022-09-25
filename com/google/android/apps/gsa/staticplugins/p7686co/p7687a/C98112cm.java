package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import android.util.SparseArray;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7752iq;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.cm */
/* compiled from: PG */
final class C98112cm implements C98113cn {

    /* renamed from: a */
    private final C21370a f273965a;

    /* renamed from: b */
    private final C60870cx f273966b;

    /* renamed from: c */
    private final Queue f273967c;

    /* renamed from: d */
    private final SparseArray f273968d = new SparseArray();

    public C98112cm(C21370a aVar, C60870cx cxVar, Queue queue) {
        this.f273965a = aVar;
        this.f273966b = cxVar;
        this.f273967c = queue;
    }

    /* renamed from: a */
    public final boolean mo90969a(C7718hj hjVar) {
        C7718hj hjVar2;
        try {
            List list = (List) C90877ak.m148472f(this.f273966b);
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    byte[] bArr = (byte[]) list.get(i);
                    C7718hj hjVar3 = (C7718hj) this.f273968d.get(i);
                    if (hjVar3 == null) {
                        hjVar3 = null;
                        C7752iq iqVar = (C7752iq) C62942bv.parseFrom((C62942bv) C7752iq.f27124E, bArr, C62921ba.m95368a());
                        if (iqVar.f27134d == 2) {
                            hjVar2 = (C7718hj) iqVar.f27135e;
                        } else {
                            hjVar2 = C7718hj.f26927af;
                        }
                        this.f273968d.put(i, hjVar2);
                        hjVar3 = hjVar2;
                    }
                    if (hjVar3 != null && C91978bb.m150941g(hjVar, hjVar3)) {
                        return true;
                    }
                }
            }
        } catch (C62974ct unused) {
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof C62974ct)) {
                throw e;
            }
        } catch (InterruptedException e2) {
            C59104x c = C98117cr.f273972a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LocalActionEntryRemover");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(30568)).mo56386p("Interrupted");
            Thread.currentThread().interrupt();
            throw new RuntimeException(e2);
        } catch (ExecutionException e3) {
            C59104x c2 = C98117cr.f273972a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "LocalActionEntryRemover");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e3)).mo56372aa(30569)).mo56386p("Exception in hasMatch");
            Queue queue = this.f273967c;
            long j = hjVar.f26969j;
            long b = this.f273965a.mo26870b();
            C7746ik a = C7746ik.m22834a(hjVar.f26966g);
            if (a == null) {
                a = C7746ik.UNKNOWN;
            }
            queue.add(C98110ck.m162491e(j, b, a));
        }
        return false;
    }
}

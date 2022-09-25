package com.google.android.apps.gsa.tasks;

import androidx.work.C4632m;
import androidx.work.C4643x;
import androidx.work.WorkerParameters;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.tasks.d */
/* compiled from: PG */
public final class C118545d implements C46575i {

    /* renamed from: a */
    private static final C59071e f329139a = C59071e.m91332i("com.google.android.apps.gsa.tasks.d");

    /* renamed from: b */
    private final C68214a f329140b;

    /* renamed from: c */
    private final C68214a f329141c;

    /* renamed from: d */
    private final C118533ch f329142d;

    /* renamed from: e */
    private final C22871g f329143e;

    public C118545d(C68214a aVar, C68214a aVar2, C118533ch chVar, C22871g gVar) {
        this.f329140b = aVar;
        this.f329141c = aVar2;
        this.f329142d = chVar;
        this.f329143e = gVar;
    }

    /* renamed from: a */
    public final void mo103746a(C118485at atVar) {
        C118522by b = C118522by.m196758b(atVar.f328865c);
        if (b == null) {
            b = C118522by.UNKNOWN;
        }
        this.f329142d.mo103742f(b);
        this.f329142d.mo103744h();
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C118485at atVar = C118485at.f328861h;
        try {
            byte[] d = workerParameters.f13989b.mo9569d("data");
            if (d != null) {
                atVar = (C118485at) C62942bv.parseFrom((C62942bv) C118485at.f328861h, d, C62921ba.m95368a());
            }
        } catch (C62974ct e) {
            C89886e b = ((C89911f) this.f329141c.mo27525b()).mo83756b(new C90452a(e, 29, C89885b.INTERNAL_ERROR_GENERIC_BUG_VALUE));
            b.f246283d = workerParameters.f13989b.toString();
            b.f246282c = 143681991;
            b.mo83721a();
            C59104x c = f329139a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaBGTaskWorker");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33970)).mo56386p("Failed to decode task params!");
        }
        C60870cx b2 = ((C118529cd) this.f329140b.mo27525b()).mo103736b(C118542cq.class, atVar);
        if (b2 == null) {
            return C60856cj.m92900i(new C4643x(C4632m.f14549a));
        }
        C90875ai.m148465b(new C118452a(this, atVar), b2, this.f329143e, "BG task counters").mo85223a(new C118492b(this, atVar));
        C60870cx g = C60922j.m93044g(b2, C118524c.f329107a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }
}

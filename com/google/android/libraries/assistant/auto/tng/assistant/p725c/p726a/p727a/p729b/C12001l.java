package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p729b;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.C11989b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.C12023m;
import com.google.android.libraries.search.p2904c.C37321a;
import com.google.android.libraries.search.p2904c.C37416bu;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.p2911c.C37449s;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2951n.C37901c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.b.l */
/* compiled from: PG */
final class C12001l implements C70862aj {

    /* renamed from: a */
    public C2164c f38518a;

    /* renamed from: b */
    final /* synthetic */ C12002m f38519b;

    /* renamed from: c */
    private final C11989b f38520c;

    /* renamed from: d */
    private final C58881cr f38521d;

    /* renamed from: e */
    private final C2164c f38522e;

    /* renamed from: f */
    private final C60870cx f38523f;

    /* renamed from: g */
    private final AtomicBoolean f38524g = new AtomicBoolean(false);

    public C12001l(C12002m mVar, C11989b bVar, C2164c cVar, C58881cr crVar) {
        this.f38519b = mVar;
        this.f38520c = bVar;
        this.f38522e = cVar;
        this.f38521d = crVar;
        this.f38523f = C2169h.m6027a(new C12000k(this));
    }

    /* renamed from: a */
    public final void mo20121a() {
        C11994e a = this.f38519b.f38527c.mo20359a(this.f38520c, C37846as.m66803i(C37519dz.FAILED_OPENING_GRPC_START_LISTENING_STATUS_NOT_RECEIVED), C58836b.f156633a);
        this.f38522e.mo5437b(a);
        this.f38518a.mo5437b(a);
        ((C37449s) this.f38521d.mo6453a()).f99422a.mo40891i();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) C12002m.f38525a.mo56226d()).mo56372aa(43956)).mo56386p("Error in receiving StreamGetConcurrentListeningResponse.");
        mo20121a();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C58833ax axVar;
        C12023m mVar = (C12023m) obj;
        int i = mVar.f38553a;
        if (i == 1) {
            C37561eb ebVar = ((C37416bu) mVar.f38554b).f99350b;
            if (ebVar == null) {
                ebVar = C37561eb.f99800c;
            }
            C11995f fVar = this.f38519b.f38527c;
            C11989b bVar = this.f38520c;
            if (ebVar.f99802a == 1) {
                axVar = C58833ax.m90834k((C37321a) this.f38521d.mo6453a());
            } else {
                axVar = C58836b.f156633a;
            }
            C11994e a = fVar.mo20359a(bVar, ebVar, axVar);
            this.f38522e.mo5437b(a);
            this.f38518a.mo5437b(a);
        } else if (i == 2) {
            C37819l lVar = (C37819l) mVar.f38554b;
            int i2 = lVar.f100343b;
            if (i2 == 1) {
                byte[] N = ((C37680i) lVar.f100344c).f100074b.mo59174N();
                int length = N.length;
                if (length > 0) {
                    try {
                        ((C37449s) this.f38521d.mo6453a()).mo40975b(length, N);
                    } catch (C37901c unused) {
                        if (this.f38524g.compareAndSet(false, true)) {
                            C12002m mVar2 = this.f38519b;
                            C60870cx cxVar = this.f38523f;
                            C11999j jVar = new C11999j();
                            C60856cj.m92911t(cxVar, C47810es.m84974n(jVar), mVar2.f38529e);
                            ((C37449s) this.f38521d.mo6453a()).f99422a.mo40891i();
                        }
                    }
                }
            } else if (i2 == 2) {
                ((C37449s) this.f38521d.mo6453a()).f99422a.mo40891i();
            }
        } else {
            ((C59052c) ((C59052c) C12002m.f38525a.mo56226d()).mo56372aa(43957)).mo56386p("Invalid StreamGetConcurrentListeningResponse.");
        }
    }
}

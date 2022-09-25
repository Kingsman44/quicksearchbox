package com.google.android.libraries.p11016ak.p11023e;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.TimeUnit;
import p5285d.p5290b.p5291a.p5292a.C68142ae;
import p5285d.p5290b.p5291a.p5292a.C68150am;
import p5285d.p5290b.p5291a.p5292a.C68158au;
import p5285d.p5290b.p5291a.p5292a.C68200m;
import p5460g.p5461a.C69464a;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.C70898m;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.ak.e.e */
/* compiled from: PG */
final class C147721e extends C70898m {

    /* renamed from: a */
    final /* synthetic */ C147723g f398623a;

    /* renamed from: b */
    private final C69464a f398624b;

    /* renamed from: c */
    private final C69464a f398625c;

    /* renamed from: d */
    private C70897l f398626d;

    public C147721e(C147723g gVar, C69464a aVar, C69464a aVar2) {
        this.f398623a = gVar;
        this.f398624b = aVar;
        this.f398625c = aVar2;
    }

    /* renamed from: a */
    public final void mo27478a(C70897l lVar, C70334de deVar) {
        this.f398626d = lVar;
    }

    /* renamed from: c */
    public final void mo124424c(C68200m mVar) {
        C68150am amVar;
        C68150am amVar2;
        C58485gu guVar = ((C147717a) this.f398624b).f398618a.f398630d;
        Status status = ((C147718b) this.f398625c).f398619a.f398632f;
        if (guVar.isEmpty() || ((C68142ae) guVar.get(0)).f184425a != 4) {
            this.f398626d.mo27484b(status, new C70334de());
            return;
        }
        this.f398626d.mo27486d();
        this.f398626d.mo27485c(new C70334de());
        this.f398626d.mo27487i((C68142ae) guVar.get(0));
        C68158au auVar = mVar.f184548e;
        if (auVar == null) {
            auVar = C68158au.f184441d;
        }
        if (auVar.f184443a == 1) {
            amVar = (C68150am) auVar.f184444b;
        } else {
            amVar = C68150am.f184434c;
        }
        int i = amVar.f184436a;
        int i2 = i + i + 1;
        C68158au auVar2 = mVar.f184548e;
        if (auVar2 == null) {
            auVar2 = C68158au.f184441d;
        }
        if (auVar2.f184443a == 1) {
            amVar2 = (C68150am) auVar2.f184444b;
        } else {
            amVar2 = C68150am.f184434c;
        }
        int i3 = amVar2.f184437b;
        int i4 = i3 + i3 + i2;
        ((C59052c) ((C59052c) C147723g.f398627a.mo56224b()).mo56372aa(50533)).mo56393w("Requested %d-%d", i2, i4);
        if (i4 <= guVar.size()) {
            while (i2 < i4) {
                this.f398626d.mo27487i((C68142ae) guVar.get(i2));
                this.f398626d.mo27487i((C68142ae) guVar.get(i2 + 1));
                i2 += 2;
            }
            this.f398626d.mo27484b(status, new C70334de());
            return;
        }
        ((C59052c) ((C59052c) C147723g.f398627a.mo56226d()).mo56372aa(50534)).mo56386p("More than provided!");
        this.f398626d.mo27484b(status, new C70334de());
    }

    /* renamed from: d */
    public final void mo27480d(String str, Throwable th) {
    }

    /* renamed from: f */
    public final void mo27481f() {
    }

    /* renamed from: g */
    public final void mo27482g(int i) {
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo27483h(Object obj) {
        C68200m mVar = (C68200m) obj;
        ((C59052c) ((C59052c) C147723g.f398627a.mo56224b()).mo56372aa(50532)).mo56389s("Message: %s", mVar);
        C147723g gVar = this.f398623a;
        long j = gVar.f398629c.f169860a;
        if (j > 0) {
            gVar.f398628b.schedule(new C147720d(this, mVar), j, TimeUnit.SECONDS);
        } else {
            mo124424c(mVar);
        }
    }
}

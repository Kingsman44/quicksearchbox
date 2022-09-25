package com.google.android.apps.search.transcription.p10670f;

import android.content.Context;
import com.google.android.apps.search.transcription.p10666b.C141746e;
import com.google.android.apps.search.transcription.p10666b.C141760s;
import com.google.android.apps.search.transcription.p10669e.C141766a;
import com.google.android.apps.search.transcription.p10670f.p10677f.C141867a;
import com.google.android.apps.search.transcription.p10670f.p10677f.C141868b;
import com.google.android.apps.search.transcription.p10670f.p10677f.C141869c;
import com.google.android.apps.search.transcription.p10670f.p10677f.C141870d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.frameworks.client.data.android.p4638e.C61412g;
import com.google.speech.p5208h.C66652ds;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.function.Supplier;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.apps.search.transcription.f.am */
/* compiled from: PG */
public final class C141794am implements C141847bo {

    /* renamed from: a */
    public static final C59071e f384801a = C59071e.m91332i("com.google.android.apps.search.transcription.f.am");

    /* renamed from: b */
    public final C60888db f384802b;

    /* renamed from: c */
    public final Context f384803c;

    /* renamed from: d */
    public final C141851bs f384804d;

    /* renamed from: e */
    public final C141848bp f384805e;

    /* renamed from: f */
    public final AtomicBoolean f384806f = new AtomicBoolean(false);

    /* renamed from: g */
    public C70862aj f384807g;

    /* renamed from: h */
    private final C60888db f384808h;

    /* renamed from: i */
    private final C66652ds f384809i;

    /* renamed from: j */
    private C70862aj f384810j;

    public C141794am(C60888db dbVar, C60888db dbVar2, C66652ds dsVar, Context context, C141851bs bsVar, C141848bp bpVar) {
        this.f384808h = dbVar;
        this.f384802b = dbVar2;
        this.f384809i = dsVar;
        this.f384803c = context;
        this.f384804d = bsVar;
        this.f384805e = bpVar;
    }

    /* renamed from: b */
    public static Throwable m230065b(Throwable th, Class cls) {
        while (th != null) {
            if (cls.isInstance(th)) {
                return th;
            }
            th = th.getCause();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m230066e() {
        /*
            r4 = this;
            monitor-enter(r4)
            io.grpc.Status r0 = p5488io.grpc.Status.f186904b     // Catch:{ all -> 0x0023 }
            io.grpc.StatusException r0 = r0.asException()     // Catch:{ all -> 0x0023 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f384806f     // Catch:{ all -> 0x0023 }
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            io.grpc.i.aj r1 = r4.f384807g     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0018
            r1.mo20122b(r0)     // Catch:{ all -> 0x0023 }
        L_0x0018:
            io.grpc.i.aj r1 = r4.f384810j     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            r1.mo20122b(r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r4)
            return
        L_0x0021:
            monitor-exit(r4)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.transcription.p10670f.C141794am.m230066e():void");
    }

    /* renamed from: a */
    public final void mo116736a() {
        ((C59052c) ((C59052c) f384801a.mo56224b()).mo56372aa(41863)).mo56386p("#cancel");
        mo116749d(new C141746e());
    }

    /* renamed from: c */
    public final synchronized void mo116738c(Supplier supplier, int i, int i2) {
        C59071e eVar = f384801a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(41865)).mo56386p("Online recognizer - start listening");
        if (this.f384806f.get()) {
            ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(41867)).mo56386p("#closeNetworkIfNeeded called before #startNetworkAndProcessResponses");
            return;
        }
        if (this.f384810j == null) {
            if (this.f384807g == null) {
                C141793al alVar = new C141793al(this, C58485gu.m89849q(new C141867a(), new C141870d(), new C141868b(), new C141869c()));
                this.f384810j = alVar;
                C66652ds dsVar = this.f384809i;
                C70334de deVar = new C70334de();
                deVar.mo62033h(new C70290cs("X-Goog-Api-Key", C70334de.f187481c), "AIzaSyDbHU30I-v5OpOJm1-uff09-NJbd6I8InU");
                deVar.mo62033h(new C70290cs("X-Android-Package", C70334de.f187481c), "com.google.android.googlequicksearchbox");
                deVar.mo62033h(new C70290cs("X-Android-Cert", C70334de.f187481c), "58E1C4133F7441EC3D2C270270A14802DA47BA0E");
                this.f384807g = new C141766a(((C66652ds) ((C66652ds) dsVar.mo62576o(new C70879r(deVar))).mo62577p(C61409d.f166071a, new C61412g())).mo59701b(alVar));
                C141788ag agVar = new C141788ag(this);
                C60870cx l = C60856cj.m92903l(C47810es.m84977q(agVar), this.f384808h);
                C141789ah ahVar = new C141789ah(this, i, i2, (InputStream) supplier.get());
                C60870cx h = C60922j.m93045h(l, C47810es.m84966f(ahVar), this.f384808h);
                C141790ai aiVar = new C141790ai(this);
                C60856cj.m92911t(h, C47810es.m84974n(aiVar), this.f384802b);
                return;
            }
        }
        ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(41866)).mo56386p("#startNetworkAndProcessResponses called twice");
    }

    /* renamed from: d */
    public final void mo116749d(C141760s sVar) {
        ((C59052c) ((C59052c) f384801a.mo56224b()).mo56372aa(41864)).mo56386p("#failWithException");
        this.f384805e.mo116728b(sVar);
        m230066e();
    }
}

package com.google.android.apps.search.transcription.p10669e;

import com.google.common.p4526f.C59052c;
import com.google.speech.p5208h.C66607ce;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.transcription.e.a */
/* compiled from: PG */
public final class C141766a implements C70862aj {

    /* renamed from: a */
    private final C70862aj f384736a;

    public C141766a(C70862aj ajVar) {
        this.f384736a = ajVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        try {
            this.f384736a.mo20121a();
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C141767b.f384737a.mo56226d()).mo56382g(e)).mo56372aa(41828)).mo56386p("Calling onCompleted failed.");
        }
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        try {
            this.f384736a.mo20122b(th);
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C141767b.f384737a.mo56226d()).mo56382g(e)).mo56372aa(41829)).mo56386p("Calling onError failed.");
        }
    }

    /* renamed from: d */
    public final void mo20123c(C66607ce ceVar) {
        try {
            this.f384736a.mo20123c(ceVar);
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C141767b.f384737a.mo56226d()).mo56382g(e)).mo56372aa(41830)).mo56386p("Calling onNext failed.");
        }
    }
}

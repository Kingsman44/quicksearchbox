package com.google.android.apps.search.transcription.p10670f;

import com.google.android.apps.search.transcription.p10666b.C141748g;
import com.google.android.apps.search.transcription.p10666b.C141749h;
import com.google.android.apps.search.transcription.p10666b.C141760s;
import com.google.common.p4526f.C59052c;
import p5488io.grpc.C70761fa;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.apps.search.transcription.f.ak */
/* compiled from: PG */
public final /* synthetic */ class C141792ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141793al f384795a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f384796b;

    public /* synthetic */ C141792ak(C141793al alVar, Throwable th) {
        this.f384795a = alVar;
        this.f384796b = th;
    }

    public final void run() {
        C141793al alVar = this.f384795a;
        Throwable th = this.f384796b;
        Throwable b = C141794am.m230065b(th, C141760s.class);
        if (b != null) {
            ((C59052c) ((C59052c) ((C59052c) C141794am.f384801a.mo56226d()).mo56382g(b)).mo56372aa(41862)).mo56386p("Transcription error");
            alVar.f384798b.f384805e.mo116728b((C141760s) b);
        } else if (th instanceof C70761fa) {
            ((C59052c) ((C59052c) ((C59052c) C141794am.f384801a.mo56226d()).mo56382g(th)).mo56372aa(41861)).mo56386p("Recognizer network error");
            alVar.f384798b.f384805e.mo116728b(new C141749h(((C70761fa) th).f188571a.getCode()));
        } else if (th instanceof StatusException) {
            ((C59052c) ((C59052c) ((C59052c) C141794am.f384801a.mo56226d()).mo56382g(th)).mo56372aa(41860)).mo56386p("Recognizer network error");
            alVar.f384798b.f384805e.mo116728b(new C141749h(((StatusException) th).f186943a.getCode()));
        } else {
            ((C59052c) ((C59052c) ((C59052c) C141794am.f384801a.mo56226d()).mo56382g(th)).mo56372aa(41859)).mo56386p("Recognizer generic error");
            alVar.f384798b.f384805e.mo116728b(new C141748g());
        }
    }
}

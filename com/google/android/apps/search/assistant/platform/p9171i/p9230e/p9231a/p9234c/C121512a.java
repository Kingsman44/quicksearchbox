package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9234c;

import com.google.assistant.p4001w.p4002a.C53506m;
import com.google.assistant.p4001w.p4002a.C53507n;
import com.google.common.p4526f.C59052c;
import java.io.IOException;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.c.a */
/* compiled from: PG */
public final /* synthetic */ class C121512a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C121516e f337212a;

    /* renamed from: b */
    public final /* synthetic */ C53506m f337213b;

    public /* synthetic */ C121512a(C121516e eVar, C53506m mVar) {
        this.f337212a = eVar;
        this.f337213b = mVar;
    }

    public final void run() {
        C121516e eVar = this.f337212a;
        C53506m mVar = this.f337213b;
        if (!eVar.f337223c) {
            try {
                ((C53507n) mVar.build()).writeDelimitedTo(eVar.f337222b);
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) C121516e.f337220a.mo56226d()).mo56382g(e)).mo56372aa(35848)).mo56386p("Failed to log entry to profile log.");
            }
        }
    }
}

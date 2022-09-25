package com.google.android.apps.gsa.p6487s3.producers;

import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.assist.p501a.C9324l;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.s3.producers.v */
/* compiled from: PG */
final class C84323v extends C90888av {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f229482a;

    /* renamed from: b */
    final /* synthetic */ C68214a f229483b;

    /* renamed from: c */
    final /* synthetic */ C9318f f229484c;

    /* renamed from: d */
    final /* synthetic */ C60870cx f229485d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84323v(SettableFuture settableFuture, C68214a aVar, C9318f fVar, C60870cx cxVar) {
        super("assistDataTimeout", 1, 0);
        this.f229482a = settableFuture;
        this.f229483b = aVar;
        this.f229484c = fVar;
        this.f229485d = cxVar;
    }

    public final void run() {
        if (!this.f229482a.isDone()) {
            C59104x c = C84327z.f229493a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "S3RequestUpdatesSchdlr");
            ((C59052c) ((C59052c) c).mo56372aa(7251)).mo56386p("AssistData future timed out.");
            this.f229482a.cancel(true);
            ((C89859i) this.f229483b.mo27525b()).mo74236a(C9324l.m23779a(C89849ae.ASSIST_DATA_SEND_TIMED_OUT, this.f229484c));
        }
        if (!this.f229485d.isDone()) {
            this.f229485d.cancel(true);
        }
    }
}

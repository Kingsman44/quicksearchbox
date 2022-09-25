package com.google.android.apps.search.transcription.p10670f;

import com.google.android.apps.search.transcription.p10666b.C141752k;
import com.google.android.apps.search.transcription.p10666b.C141753l;
import com.google.android.apps.search.transcription.p10666b.C141760s;
import com.google.android.libraries.search.p2904c.p2951n.C37901c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.transcription.f.ai */
/* compiled from: PG */
final class C141790ai implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C141794am f384792a;

    public C141790ai(C141794am amVar) {
        this.f384792a = amVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C141794am.f384801a.mo56226d()).mo56382g(th)).mo56372aa(41857)).mo56386p("Failed uploading data to S3");
        this.f384792a.f384807g.getClass();
        if (C141794am.m230065b(th, C141760s.class) != null) {
            this.f384792a.f384807g.mo20122b(th);
        } else if (C141794am.m230065b(th, C37901c.class) != null) {
            this.f384792a.f384807g.mo20122b(new C141752k());
        } else {
            this.f384792a.f384807g.mo20122b(new C141753l());
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}

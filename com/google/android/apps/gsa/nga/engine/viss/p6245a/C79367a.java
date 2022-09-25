package com.google.android.apps.gsa.nga.engine.viss.p6245a;

import android.content.Intent;
import com.google.android.apps.gsa.search.shared.p6931i.C87573b;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121825ah;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121830am;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121864p;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121874z;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.a.a */
/* compiled from: PG */
public final class C79367a implements C121864p {

    /* renamed from: a */
    private final C87573b f217982a;

    public C79367a(C87573b bVar) {
        C69664n.m101061g(bVar, "voiceInteractionSessionStarter");
        this.f217982a = bVar;
    }

    /* renamed from: a */
    public final Object mo73941a(Intent intent, C34053bp bpVar, C69577g gVar) {
        return C121874z.m201311a(C121830am.UNKNOWN, "Not supported in classic");
    }

    /* renamed from: b */
    public final Object mo73942b(Intent intent, C34053bp bpVar, C69577g gVar) {
        try {
            this.f217982a.mo81707e(intent, 0);
            return C121825ah.m201256b();
        } catch (Throwable th) {
            return C121825ah.m201255a(C121830am.UNKNOWN, th.getMessage());
        }
    }
}

package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9464a.p9465a;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125087bo;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125089bq;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125137dk;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125139dm;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9478r.C126286d;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C125983l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C125137dk f347215a;

    public /* synthetic */ C125983l(C125137dk dkVar) {
        this.f347215a = dkVar;
    }

    public final C60870cx apply(Object obj) {
        C125137dk dkVar = this.f347215a;
        C59071e eVar = C125986o.f347218a;
        C125087bo a = ((C126286d) obj).mo107506a();
        C70888j jVar = a.f189039a;
        C70338di diVar = C125089bq.f345082d;
        if (diVar == null) {
            synchronized (C125089bq.class) {
                diVar = C125089bq.f345082d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService", "GetEmojiPredictions");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C125137dk.f345211b);
                    d.f187486b = C70850d.m103697c(C125139dm.f345214b);
                    diVar = d.mo62040a();
                    C125089bq.f345082d = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, a.f189040b), dkVar);
    }
}

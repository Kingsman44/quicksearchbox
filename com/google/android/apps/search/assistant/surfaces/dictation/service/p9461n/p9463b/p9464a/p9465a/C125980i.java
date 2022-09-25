package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9464a.p9465a;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125056ak;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125057al;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125087bo;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125089bq;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9478r.C126286d;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C125980i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ String f347211a;

    /* renamed from: b */
    public final /* synthetic */ String f347212b;

    public /* synthetic */ C125980i(String str, String str2) {
        this.f347211a = str;
        this.f347212b = str2;
    }

    public final C60870cx apply(Object obj) {
        String str = this.f347211a;
        String str2 = this.f347212b;
        C59071e eVar = C125986o.f347218a;
        C125087bo a = ((C126286d) obj).mo107506a();
        C125056ak akVar = (C125056ak) C125057al.f345027c.createBuilder();
        akVar.copyOnWrite();
        str.getClass();
        ((C125057al) akVar.instance).f345029a = str;
        akVar.copyOnWrite();
        str2.getClass();
        ((C125057al) akVar.instance).f345030b = str2;
        C125057al alVar = (C125057al) akVar.build();
        C70888j jVar = a.f189039a;
        C70338di diVar = C125089bq.f345084f;
        if (diVar == null) {
            synchronized (C125089bq.class) {
                diVar = C125089bq.f345084f;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService", "SetEmojiPreferenceForConcept");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C125057al.f345027c);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    C125089bq.f345084f = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, a.f189040b), alVar);
    }
}

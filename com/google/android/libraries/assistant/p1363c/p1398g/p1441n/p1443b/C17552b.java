package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1445a.C17574a;
import com.google.android.libraries.search.assistant.p2498ac.p2499a.p2500a.C32432a;
import com.google.assistant.p3897e.p3929l.p3930a.C52796x;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.b */
/* compiled from: PG */
public final /* synthetic */ class C17552b implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C17565o f50600a;

    /* renamed from: b */
    public final /* synthetic */ C17485au f50601b;

    /* renamed from: c */
    public final /* synthetic */ Context f50602c;

    /* renamed from: d */
    public final /* synthetic */ Optional f50603d;

    /* renamed from: e */
    public final /* synthetic */ C32432a f50604e;

    /* renamed from: f */
    public final /* synthetic */ C17477am f50605f;

    public /* synthetic */ C17552b(C17565o oVar, C17485au auVar, Context context, Optional optional, C32432a aVar, C17477am amVar) {
        this.f50600a = oVar;
        this.f50601b = auVar;
        this.f50602c = context;
        this.f50603d = optional;
        this.f50604e = aVar;
        this.f50605f = amVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C17564n nVar;
        TextToSpeech textToSpeech;
        C17565o oVar = this.f50600a;
        C17485au auVar = this.f50601b;
        Context context = this.f50602c;
        Optional optional = this.f50603d;
        C32432a aVar = this.f50604e;
        C17477am amVar = this.f50605f;
        C52796x xVar = auVar.f50487e;
        if (xVar == null) {
            xVar = C52796x.f138517c;
        }
        Optional a = C17574a.m34861a(xVar);
        AtomicReference atomicReference = oVar.f50635i;
        AtomicReference atomicReference2 = oVar.f50634h;
        Optional flatMap = a.flatMap(new C17555e(optional));
        if (flatMap.isPresent()) {
            textToSpeech = (TextToSpeech) flatMap.get();
            nVar = new C17564n(textToSpeech, true);
            C59104x b = C17565o.f50627a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
            ((C59052c) ((C59052c) b).mo56372aa(42783)).mo56354G("Using prewarmed TextToSpeech instance for locale %s for sessionToken %s.", a.map(C17556f.f50610a).orElse("n/a"), C17377g.m34655c(amVar));
            ((C2164c) atomicReference.get()).mo5437b((Object) null);
        } else {
            C59104x b2 = C17565o.f50627a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
            ((C59052c) ((C59052c) b2).mo56372aa(42782)).mo56354G("No prewarmed TextToSpeech instance available for locale %s for sessionToken %s. Creating a new one.", a.map(C17556f.f50610a).orElse("n/a"), C17377g.m34655c(amVar));
            TextToSpeech textToSpeech2 = new TextToSpeech(context, new C17559i(amVar, atomicReference));
            nVar = new C17564n(textToSpeech2, false);
            textToSpeech = textToSpeech2;
        }
        textToSpeech.setOnUtteranceProgressListener(new C17563m(amVar, nVar, atomicReference2, aVar));
        textToSpeech.setSpeechRate(1.0f);
        return nVar;
    }
}

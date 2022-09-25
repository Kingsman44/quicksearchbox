package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p739d.p740a;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12036c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12171c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12174f;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.d.a.f */
/* compiled from: PG */
public final /* synthetic */ class C12100f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C12103i f38692a;

    public /* synthetic */ C12100f(C12103i iVar) {
        this.f38692a = iVar;
    }

    public final C60870cx apply(Object obj) {
        C12103i iVar = this.f38692a;
        String str = (String) obj;
        if (iVar.f38705k.get()) {
            return C60856cj.m92898g();
        }
        C12171c cVar = (C12171c) C12174f.f38872d.createBuilder();
        C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
        String string = iVar.f38696b.getString(R.string.lim_con_tts);
        aeVar.copyOnWrite();
        C67190ah ahVar = (C67190ah) aeVar.instance;
        string.getClass();
        ahVar.f182622a |= 1;
        ahVar.f182625d = string;
        aeVar.copyOnWrite();
        C67190ah ahVar2 = (C67190ah) aeVar.instance;
        str.getClass();
        ahVar2.f182622a |= 8192;
        ahVar2.f182632k = str;
        C67190ah ahVar3 = (C67190ah) aeVar.build();
        cVar.copyOnWrite();
        C12174f fVar = (C12174f) cVar.instance;
        ahVar3.getClass();
        fVar.f38875b = ahVar3;
        fVar.f38874a |= 1;
        cVar.copyOnWrite();
        C12174f fVar2 = (C12174f) cVar.instance;
        fVar2.f38876c = 2;
        fVar2.f38874a = 2 | fVar2.f38874a;
        iVar.f38700f.mo22352b(C37179a.f97451aW);
        iVar.f38707m.set(iVar.f38697c.mo20461b((C12174f) cVar.build(), C70967n.LIM_CON));
        return ((C12036c) iVar.f38707m.get()).mo20381a();
    }
}

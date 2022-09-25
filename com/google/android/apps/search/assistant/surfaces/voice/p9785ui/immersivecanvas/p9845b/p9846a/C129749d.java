package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9845b.p9846a;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4580v.C60944c;
import com.google.speech.p5224k.p5225a.C67193ak;
import com.google.speech.p5224k.p5225a.C67194al;
import java.util.HashMap;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C129749d implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C67194al f356051a;

    public /* synthetic */ C129749d(C67194al alVar) {
        this.f356051a = alVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C67194al alVar = this.f356051a;
        C58495hd hdVar = (C58495hd) obj;
        C67193ak akVar = alVar.f182646b;
        if (akVar == null) {
            akVar = C67193ak.f182639c;
        }
        if (hdVar.containsKey(akVar.f182642b)) {
            return hdVar;
        }
        HashMap hashMap = new HashMap(hdVar);
        C67193ak akVar2 = alVar.f182646b;
        if (akVar2 == null) {
            akVar2 = C67193ak.f182639c;
        }
        hashMap.put(akVar2.f182642b, C60944c.m93093f(alVar.f182647c));
        return C58495hd.m89898l(hashMap);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

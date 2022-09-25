package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e;

import com.google.android.libraries.assistant.p1533o.C18505w;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66561ar;
import com.google.speech.p5208h.C66563at;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.e.z */
/* compiled from: PG */
public final /* synthetic */ class C127332z implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C127332z f350669a = new C127332z();

    private /* synthetic */ C127332z() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C18505w wVar = (C18505w) obj;
        C66561ar arVar = (C66561ar) C66563at.f181054f.createBuilder();
        String str = wVar.f52460a;
        arVar.copyOnWrite();
        C66563at atVar = (C66563at) arVar.instance;
        str.getClass();
        atVar.f181056a |= 1;
        atVar.f181057b = str;
        if (!wVar.f52461b.isEmpty()) {
            String str2 = wVar.f52461b;
            arVar.copyOnWrite();
            C66563at atVar2 = (C66563at) arVar.instance;
            str2.getClass();
            atVar2.f181056a |= 2;
            atVar2.f181058c = str2;
        } else {
            C63088z zVar = wVar.f52462c;
            arVar.copyOnWrite();
            C66563at atVar3 = (C66563at) arVar.instance;
            zVar.getClass();
            atVar3.f181056a |= 4;
            atVar3.f181059d = zVar;
        }
        return (C66563at) arVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

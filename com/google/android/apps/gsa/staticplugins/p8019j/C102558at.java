package com.google.android.apps.gsa.staticplugins.p8019j;

import android.util.Base64;
import com.google.android.apps.search.assistant.libraries.p8979j.p8983c.C119436b;
import com.google.android.libraries.assistant.p1533o.C18504v;
import com.google.android.libraries.assistant.p1533o.C18505w;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58131b;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66561ar;
import com.google.speech.p5208h.C66563at;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.at */
/* compiled from: PG */
public final /* synthetic */ class C102558at implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C102558at f286240a = new C102558at();

    private /* synthetic */ C102558at() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58131b b;
        C18505w wVar = (C18505w) obj;
        C66561ar arVar = (C66561ar) C66563at.f181054f.createBuilder();
        if ("X-Client-Data".equals(wVar.f52460a) && "X-Client-Data".equals(wVar.f52460a)) {
            if (!wVar.f52461b.isEmpty()) {
                C58131b a = C119436b.m198169a(wVar.f52461b);
                if (a != null) {
                    String encodeToString = Base64.encodeToString(a.toByteArray(), 10);
                    C18504v vVar = (C18504v) wVar.toBuilder();
                    vVar.copyOnWrite();
                    encodeToString.getClass();
                    ((C18505w) vVar.instance).f52461b = encodeToString;
                    wVar = (C18505w) vVar.build();
                }
            } else if (!wVar.f52462c.mo59173M() && (b = C119436b.m198170b(wVar.f52462c.mo59174N())) != null) {
                C18504v vVar2 = (C18504v) wVar.toBuilder();
                C63088z byteString = b.toByteString();
                vVar2.copyOnWrite();
                byteString.getClass();
                ((C18505w) vVar2.instance).f52462c = byteString;
                wVar = (C18505w) vVar2.build();
            }
        }
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
        }
        if (!wVar.f52462c.mo59173M()) {
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

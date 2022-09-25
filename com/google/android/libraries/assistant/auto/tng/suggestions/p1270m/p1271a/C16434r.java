package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16115bn;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.p1250b.C16246b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16343aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3994s.p3995a.C53308jb;
import com.google.assistant.p3994s.p3995a.C53433ns;
import com.google.assistant.p3994s.p3995a.C53435nu;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.r */
/* compiled from: PG */
public final /* synthetic */ class C16434r implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C16434r f48338a = new C16434r();

    private /* synthetic */ C16434r() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C16115bn bnVar = (C16115bn) obj;
        C16343aq aqVar = (C16343aq) C16344ar.f48114e.createBuilder();
        C53433ns nsVar = (C53433ns) C53435nu.f140233n.createBuilder();
        String e = bnVar.mo22777e();
        nsVar.copyOnWrite();
        C53435nu nuVar = (C53435nu) nsVar.instance;
        e.getClass();
        nuVar.f140236a |= 1;
        nuVar.f140239d = e;
        String d = bnVar.mo22776d();
        nsVar.copyOnWrite();
        C53435nu nuVar2 = (C53435nu) nsVar.instance;
        d.getClass();
        nuVar2.f140236a |= 2;
        nuVar2.f140240e = d;
        C51012dc a = C16246b.m33287a(bnVar.mo22774b());
        nsVar.copyOnWrite();
        C53435nu nuVar3 = (C53435nu) nsVar.instance;
        a.getClass();
        nuVar3.f140244i = a;
        nuVar3.f140236a |= 32;
        C51012dc dcVar = bnVar.mo22774b().f48098g;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        nsVar.copyOnWrite();
        C53435nu nuVar4 = (C53435nu) nsVar.instance;
        dcVar.getClass();
        nuVar4.f140245j = dcVar;
        nuVar4.f140236a |= 64;
        C53308jb b = C16246b.m33288b(bnVar.mo22774b());
        nsVar.copyOnWrite();
        C53435nu nuVar5 = (C53435nu) nsVar.instance;
        b.getClass();
        nuVar5.f140246k = b;
        nuVar5.f140236a |= 512;
        C16246b.m33291e(nsVar, bnVar.mo22773a());
        C53435nu nuVar6 = (C53435nu) nsVar.build();
        aqVar.copyOnWrite();
        C16344ar arVar = (C16344ar) aqVar.instance;
        nuVar6.getClass();
        arVar.f48117b = nuVar6;
        arVar.f48116a |= 1;
        aqVar.copyOnWrite();
        C16344ar arVar2 = (C16344ar) aqVar.instance;
        arVar2.f48118c = 3;
        arVar2.f48116a |= 2;
        return (C16344ar) aqVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

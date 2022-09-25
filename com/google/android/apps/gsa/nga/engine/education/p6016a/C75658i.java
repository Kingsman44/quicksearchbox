package com.google.android.apps.gsa.nga.engine.education.p6016a;

import com.google.android.apps.gsa.assistant.shared.k.a.f;
import com.google.assistant.p4008y.p4009a.C53568ba;
import com.google.assistant.p4008y.p4009a.C53569bb;
import com.google.common.p4580v.C60950i;
import java.util.Locale;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.i */
/* compiled from: PG */
public final /* synthetic */ class C75658i implements Function {

    /* renamed from: a */
    public final /* synthetic */ C75674y f210022a;

    /* renamed from: b */
    public final /* synthetic */ String f210023b;

    public /* synthetic */ C75658i(C75674y yVar, String str) {
        this.f210022a = yVar;
        this.f210023b = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C75674y yVar = this.f210022a;
        f fVar = (f) obj;
        if (!fVar.b.equals(this.f210023b)) {
            return null;
        }
        C60950i iVar = yVar.f210050g;
        long j = fVar.d;
        if (j > 0 && Instant.ofEpochSecond(j).isBefore(iVar.mo57444a())) {
            return null;
        }
        C75644ac l = C75650ai.m121912l();
        C75654e eVar = (C75654e) l;
        eVar.f209998d = C75653d.m121929a(fVar.c);
        eVar.f209996b = "nudge-suggestion-id";
        C53568ba baVar = (C53568ba) C53569bb.f140594i.createBuilder();
        String str = fVar.c;
        baVar.copyOnWrite();
        C53569bb bbVar = (C53569bb) baVar.instance;
        str.getClass();
        bbVar.f140596a |= 1;
        bbVar.f140597b = str;
        baVar.copyOnWrite();
        C53569bb bbVar2 = (C53569bb) baVar.instance;
        bbVar2.f140599d = 18;
        bbVar2.f140596a |= 4;
        l.mo71790g(Optional.m71637of((C53569bb) baVar.build()));
        l.mo71788e((Locale) ((Optional) yVar.f210049f.get()).orElse(Locale.ROOT));
        l.mo71786c(C75675z.f210062b);
        return l.mo71784a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

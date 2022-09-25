package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1446b.C17576b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1446b.C17577c;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1446b.C17578d;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1446b.C17583i;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1446b.C17584j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.h */
/* compiled from: PG */
public final /* synthetic */ class C17558h implements Function {

    /* renamed from: a */
    public final /* synthetic */ Locale f50613a;

    public /* synthetic */ C17558h(Locale locale) {
        this.f50613a = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Locale locale = this.f50613a;
        C17584j jVar = (C17584j) obj;
        C59104x b = C17584j.f50687a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
        ((C59052c) ((C59052c) b).mo56372aa(42801)).mo56354G("Prewarmed with locale: %s & requested locale is: %s", ((Optional) jVar.f50688b.get()).map(C17576b.f50678a).map(C17577c.f50679a).orElse("n/a"), locale);
        if (!((Optional) jVar.f50688b.get()).isPresent() || !((C17583i) ((Optional) jVar.f50688b.get()).get()).mo23397b().equals(locale)) {
            return Optional.empty();
        }
        return ((Optional) jVar.f50688b.get()).map(C17578d.f50680a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

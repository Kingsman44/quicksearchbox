package com.google.android.apps.gsa.nga.engine.education.p6016a;

import com.google.android.apps.gsa.assistant.shared.d.j;
import com.google.assistant.p3775ac.p3779d.C48461a;
import com.google.assistant.p3775ac.p3779d.C48462b;
import com.google.assistant.p4008y.p4009a.C53569bb;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C75643ab implements Function {

    /* renamed from: a */
    public final /* synthetic */ Locale f209987a;

    public /* synthetic */ C75643ab(Locale locale) {
        this.f209987a = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Locale locale = this.f209987a;
        C48461a a = j.a((C53569bb) obj);
        String languageTag = locale.toLanguageTag();
        a.copyOnWrite();
        C48462b bVar = (C48462b) a.instance;
        C48462b bVar2 = C48462b.f125188k;
        languageTag.getClass();
        bVar.f125191a |= 32;
        bVar.f125196f = languageTag;
        return (C48462b) a.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.C17030b;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17035ab;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.q */
/* compiled from: PG */
public final /* synthetic */ class C122365q implements Function {

    /* renamed from: a */
    public final /* synthetic */ Locale f339267a;

    public /* synthetic */ C122365q(Locale locale) {
        this.f339267a = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Locale locale = this.f339267a;
        C17035ab a = ((C17030b) obj).mo23169a();
        String languageTag = locale.toLanguageTag();
        a.copyOnWrite();
        C17036ac acVar = (C17036ac) a.instance;
        C17036ac acVar2 = C17036ac.f49640d;
        languageTag.getClass();
        acVar.f49642a |= 2;
        acVar.f49644c = languageTag;
        return (C17036ac) a.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

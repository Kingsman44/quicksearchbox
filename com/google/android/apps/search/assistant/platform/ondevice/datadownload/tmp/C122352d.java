package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.C17030b;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17035ab;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17039af;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17043aj;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17044ak;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.d */
/* compiled from: PG */
public final /* synthetic */ class C122352d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122356h f339238a;

    /* renamed from: b */
    public final /* synthetic */ Locale f339239b;

    public /* synthetic */ C122352d(C122356h hVar, Locale locale) {
        this.f339238a = hVar;
        this.f339239b = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122356h hVar = this.f339238a;
        Locale locale = this.f339239b;
        C17030b bVar = (C17030b) obj;
        C17043aj ajVar = (C17043aj) C17044ak.f49650c.createBuilder();
        C17035ab a = bVar.mo23169a();
        String languageTag = locale.toLanguageTag();
        a.copyOnWrite();
        C17036ac acVar = (C17036ac) a.instance;
        C17036ac acVar2 = C17036ac.f49640d;
        languageTag.getClass();
        acVar.f49642a |= 2;
        acVar.f49644c = languageTag;
        ajVar.copyOnWrite();
        C17044ak akVar = (C17044ak) ajVar.instance;
        C17036ac acVar3 = (C17036ac) a.build();
        acVar3.getClass();
        akVar.f49653b = acVar3;
        akVar.f49652a |= 1;
        return C60922j.m93044g(((C17039af) hVar.f339243a.mo27525b()).mo23172b((C17044ak) ajVar.build()), C47810es.m84963c(new C122355g(bVar)), hVar.f339244b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

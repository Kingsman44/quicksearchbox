package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p974b.p975a;

import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.C16994a;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17035ab;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17039af;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17043aj;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17044ak;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C13471b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13480k f41328a;

    public /* synthetic */ C13471b(C13480k kVar) {
        this.f41328a = kVar;
    }

    public final C60870cx apply(Object obj) {
        C13480k kVar = this.f41328a;
        C17039af afVar = kVar.f41346i;
        C17043aj ajVar = (C17043aj) C17044ak.f49650c.createBuilder();
        C17035ab a = C16994a.m34087a(kVar.f41347j);
        String languageTag = ((Locale) obj).toLanguageTag();
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
        return C60922j.m93044g(afVar.mo23172b((C17044ak) ajVar.build()), C47810es.m84963c(new C13473d(kVar)), kVar.f41344g);
    }
}

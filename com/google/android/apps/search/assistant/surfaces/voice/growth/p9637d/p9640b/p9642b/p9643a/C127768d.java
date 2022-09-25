package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9643a;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127742c;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127743d;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127745f;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127747h;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127748i;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127749j;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127750k;
import com.google.assistant.p3781ad.p3789d.p3791b.C48734p;
import java.util.Locale;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C127768d implements Function {

    /* renamed from: a */
    public final /* synthetic */ Optional f351692a;

    public /* synthetic */ C127768d(Optional optional) {
        this.f351692a = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional = this.f351692a;
        C48734p pVar = (C48734p) obj;
        C127742c cVar = (C127742c) C127743d.f351634g.createBuilder();
        String str = pVar.f126108b;
        cVar.copyOnWrite();
        str.getClass();
        ((C127743d) cVar.instance).f351636a = str;
        String languageTag = Locale.ROOT.toLanguageTag();
        cVar.copyOnWrite();
        languageTag.getClass();
        ((C127743d) cVar.instance).f351639d = languageTag;
        C127749j jVar = (C127749j) C127750k.f351661d.createBuilder();
        int i = pVar.f126111e;
        jVar.copyOnWrite();
        ((C127750k) jVar.instance).f351664b = i;
        jVar.copyOnWrite();
        ((C127750k) jVar.instance).f351665c = 2;
        C127750k kVar = (C127750k) jVar.build();
        cVar.copyOnWrite();
        kVar.getClass();
        ((C127743d) cVar.instance).f351637b = kVar;
        C127745f fVar = (C127745f) C127748i.f351656e.createBuilder();
        fVar.mo108207b((String) optional.get());
        fVar.mo108206a(C127747h.IN_APP);
        C127748i iVar = (C127748i) fVar.build();
        cVar.copyOnWrite();
        iVar.getClass();
        ((C127743d) cVar.instance).f351641f = iVar;
        return (C127743d) cVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

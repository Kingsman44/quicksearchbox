package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9645c;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127760aj;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127797n;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127804u;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127743d;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b.c.e */
/* compiled from: PG */
public final /* synthetic */ class C127781e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C127782f f351722a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f351723b;

    /* renamed from: c */
    public final /* synthetic */ Locale f351724c;

    /* renamed from: d */
    public final /* synthetic */ Locale f351725d;

    /* renamed from: e */
    public final /* synthetic */ String f351726e;

    public /* synthetic */ C127781e(C127782f fVar, C58485gu guVar, Locale locale, Locale locale2, String str) {
        this.f351722a = fVar;
        this.f351723b = guVar;
        this.f351724c = locale;
        this.f351725d = locale2;
        this.f351726e = str;
    }

    public final Object apply(Object obj) {
        C127782f fVar = this.f351722a;
        C58485gu guVar = this.f351723b;
        Locale locale = this.f351724c;
        Locale locale2 = this.f351725d;
        String str = this.f351726e;
        List list = (List) obj;
        Optional empty = Optional.empty();
        if (!guVar.isEmpty()) {
            empty = fVar.mo108216a(list, C127760aj.m208804a(guVar, locale), locale2, str);
        }
        if (!empty.isPresent()) {
            empty = fVar.mo108216a(list, C127782f.f351727a, locale2, str);
        }
        if (empty.isPresent()) {
            C127804u uVar = fVar.f351729c;
            uVar.f351768a.mo40256t(new C127797n(str, ((C127743d) empty.get()).f351636a), uVar.f351769b);
        }
        return empty;
    }
}

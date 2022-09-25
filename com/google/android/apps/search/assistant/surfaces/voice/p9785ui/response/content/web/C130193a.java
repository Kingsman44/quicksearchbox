package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web;

import com.google.android.libraries.web.contrib.p3372e.C43503a;
import com.google.android.libraries.web.p3353c.C43358c;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import java.io.IOException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.a */
/* compiled from: PG */
public final class C130193a implements C43503a {
    /* renamed from: a */
    public final C43363h mo33710a(IOException iOException) {
        C43358c cVar = (C43358c) C43363h.f113275f.createBuilder();
        C43362g gVar = C43362g.UNSPECIFIED;
        cVar.copyOnWrite();
        C43363h hVar = (C43363h) cVar.instance;
        hVar.f113278b = gVar.f113274h;
        hVar.f113277a |= 1;
        String name = iOException.getCause() == null ? "null" : iOException.getCause().getClass().getName();
        cVar.copyOnWrite();
        C43363h hVar2 = (C43363h) cVar.instance;
        hVar2.f113277a |= 2;
        hVar2.f113279c = "IOException caused by ".concat(String.valueOf(name));
        return (C43363h) cVar.build();
    }
}

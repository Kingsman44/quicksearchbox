package com.google.android.apps.search.sceneviewer.modelviewer;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.p3723ar.p3724a.p3725a.C47891b;
import com.google.p3723ar.p3724a.p3725a.C47892c;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.h */
/* compiled from: PG */
public final /* synthetic */ class C141598h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384384a;

    public /* synthetic */ C141598h(C141584am amVar) {
        this.f384384a = amVar;
    }

    public final C60870cx apply(Object obj) {
        C141584am amVar = this.f384384a;
        String str = (String) obj;
        C47891b bVar = (C47891b) amVar.f384355x.toBuilder();
        str.getClass();
        bVar.copyOnWrite();
        C47892c cVar = (C47892c) bVar.instance;
        cVar.f124000a |= 32;
        cVar.f124006g = str;
        amVar.f384355x = (C47892c) bVar.build();
        Types.StreamingSettings.Builder builder = (Types.StreamingSettings.Builder) amVar.f384356y.toBuilder();
        builder.setAccountName(str);
        amVar.f384356y = (Types.StreamingSettings) builder.build();
        return C60856cj.m92900i(str);
    }
}

package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.android.apps.gsa.unifiedime.C118605w;
import com.google.android.apps.gsa.unifiedime.C118606x;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125064as;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.v */
/* compiled from: PG */
public final class C126345v {
    /* renamed from: a */
    public static C125065at m206599a(C125065at atVar) {
        C125064as asVar = (C125064as) C125065at.f345040b.createBuilder();
        Stream map = Collection.EL.stream(atVar.f345042a).map(C126342s.f348031a);
        Objects.requireNonNull(asVar);
        map.forEach(new C126343t(asVar));
        return (C125065at) asVar.build();
    }

    /* renamed from: b */
    public static C125065at m206600b(String str) {
        C125064as asVar = (C125064as) C125065at.f345040b.createBuilder();
        C118605w wVar = (C118605w) C118606x.f330892g.createBuilder();
        wVar.copyOnWrite();
        C118606x xVar = (C118606x) wVar.instance;
        str.getClass();
        xVar.f330894a |= 1;
        xVar.f330895b = str;
        wVar.copyOnWrite();
        C118606x xVar2 = (C118606x) wVar.instance;
        xVar2.f330894a |= 2;
        xVar2.f330896c = true;
        asVar.mo106794b(wVar);
        return (C125065at) asVar.build();
    }

    /* renamed from: c */
    public static String m206601c(C125065at atVar) {
        return (String) Collection.EL.stream(atVar.f345042a).map(C126341r.f348030a).collect(Collectors.joining());
    }
}

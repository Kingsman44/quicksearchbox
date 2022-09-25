package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6176b;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80716cr;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80724cz;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80726da;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80727db;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128176h;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128178j;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128181m;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3775ac.p3779d.C48468h;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.b.c */
/* compiled from: PG */
public final /* synthetic */ class C78341c implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C78347i f215684a;

    /* renamed from: b */
    public final /* synthetic */ Locale f215685b;

    public /* synthetic */ C78341c(C78347i iVar, Locale locale) {
        this.f215684a = iVar;
        this.f215685b = locale;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C48468h hVar;
        C78347i iVar = this.f215684a;
        Locale locale = this.f215685b;
        C128176h hVar2 = (C128176h) obj;
        if (hVar2.f352607b.isEmpty()) {
            return Optional.empty();
        }
        Map map = (Map) Collection.EL.stream(hVar2.f352607b).collect(Collectors.groupingBy(C78346h.f215694a));
        Optional findFirst = Collection.EL.stream((List) Map.EL.getOrDefault(map, false, C58485gu.m89845m())).findFirst();
        if (findFirst.isEmpty()) {
            return Optional.empty();
        }
        Optional findFirst2 = Collection.EL.stream((List) Map.EL.getOrDefault(map, true, C58485gu.m89845m())).findFirst();
        C128178j jVar = (C128178j) findFirst.get();
        C128182n nVar = hVar2.f352608c;
        if (nVar == null) {
            nVar = C128182n.f352629e;
        }
        C80726da daVar = (C80726da) C80727db.f221610d.createBuilder();
        C80724cz b = C78347i.m125849b((C128178j) findFirst.get());
        daVar.copyOnWrite();
        C80727db dbVar = (C80727db) daVar.instance;
        b.getClass();
        dbVar.f221613b = b;
        dbVar.f221612a |= 1;
        Optional map2 = findFirst2.map(C78343e.f215691a);
        Objects.requireNonNull(daVar);
        map2.ifPresent(new C78344f(daVar));
        C80727db dbVar2 = (C80727db) daVar.build();
        C128182n nVar2 = hVar2.f352608c;
        if (nVar2 == null) {
            nVar2 = C128182n.f352629e;
        }
        C128181m a = C128181m.m209263a(nVar2.f352634d);
        if (a == null) {
            a = C128181m.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            hVar = C48468h.UNKNOWN_MODE;
        } else if (ordinal == 1) {
            hVar = C48468h.NEW_USER_INPUT_PLATE;
        } else if (ordinal == 2) {
            hVar = C48468h.ACTIVATED_USER_INPUT_PLATE;
        } else if (ordinal == 3) {
            hVar = C48468h.OVERAPP_SUGGESTION_INPUT_PLATE;
        } else {
            throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(a))));
        }
        C80716cr a2 = iVar.mo73310a(jVar.f352616e, locale, hVar);
        a2.mo74486j(Optional.m71637of(nVar));
        a2.mo74487k(dbVar2);
        if (jVar.f352619h) {
            a2.mo74480d(Optional.m71637of(iVar.f215697c.mo71827c(locale, Optional.empty())));
        }
        return Optional.m71637of(a2.mo74477a());
    }
}

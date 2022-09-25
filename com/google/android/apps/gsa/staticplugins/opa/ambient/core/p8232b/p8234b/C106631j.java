package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8234b;

import com.google.android.libraries.search.assistant.p2566g.C33393a;
import com.google.android.libraries.search.assistant.p2566g.C33410e;
import com.google.android.libraries.search.assistant.p2566g.C33411f;
import com.google.android.libraries.search.assistant.p2566g.C33414i;
import com.google.android.libraries.search.assistant.p2566g.C33425t;
import com.google.android.libraries.search.assistant.p2566g.C33426u;
import com.google.android.libraries.search.assistant.p2566g.C33427v;
import com.google.assistant.p3886c.p3887a.C50682r;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.b.j */
/* compiled from: PG */
public final /* synthetic */ class C106631j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f297282a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f297283b;

    public /* synthetic */ C106631j(C60870cx cxVar, C60870cx cxVar2) {
        this.f297282a = cxVar;
        this.f297283b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f297282a;
        C60870cx cxVar2 = this.f297283b;
        List<C50682r> list = (List) C60856cj.m92909r(cxVar);
        Optional empty = Optional.empty();
        Optional empty2 = Optional.empty();
        long j = 0;
        for (C50682r rVar : list) {
            long j2 = rVar.f131857c;
            long j3 = rVar.f131858d;
            if (empty.isEmpty() || j2 < ((C33411f) empty.get()).f89481b) {
                C33410e eVar = (C33410e) C33411f.f89478d.createBuilder();
                eVar.copyOnWrite();
                C33411f fVar = (C33411f) eVar.instance;
                fVar.f89480a |= 1;
                fVar.f89481b = j2;
                eVar.copyOnWrite();
                C33411f fVar2 = (C33411f) eVar.instance;
                fVar2.f89480a |= 2;
                fVar2.f89482c = j3;
                empty = Optional.m71637of((C33411f) eVar.build());
            }
            if (empty2.isEmpty() || j2 > ((C33411f) empty2.get()).f89481b) {
                C33410e eVar2 = (C33410e) C33411f.f89478d.createBuilder();
                eVar2.copyOnWrite();
                C33411f fVar3 = (C33411f) eVar2.instance;
                fVar3.f89480a |= 1;
                fVar3.f89481b = j2;
                eVar2.copyOnWrite();
                C33411f fVar4 = (C33411f) eVar2.instance;
                fVar4.f89480a |= 2;
                fVar4.f89482c = j3;
                empty2 = Optional.m71637of((C33411f) eVar2.build());
            }
            if (j3 > j2) {
                j += j3 - j2;
            }
        }
        C33393a aVar = (C33393a) C33414i.f89489h.createBuilder();
        int size = list.size();
        aVar.copyOnWrite();
        C33414i iVar = (C33414i) aVar.instance;
        iVar.f89491a |= 1;
        iVar.f89494d = size;
        aVar.copyOnWrite();
        C33414i iVar2 = (C33414i) aVar.instance;
        iVar2.f89491a |= 2;
        iVar2.f89495e = j;
        Stream map = Collection.EL.stream((C58485gu) C60856cj.m92909r(cxVar2)).map(C106632k.f297284a);
        Objects.requireNonNull(aVar);
        map.forEach(new C106633l(aVar));
        Objects.requireNonNull(aVar);
        empty.ifPresent(new C106634m(aVar));
        Objects.requireNonNull(aVar);
        empty2.ifPresent(new C106635n(aVar));
        C33426u uVar = (C33426u) C33427v.f89523e.createBuilder();
        C33425t tVar = C33425t.ON_DEVICE_MEDIA_APP_SUGGESTIONS_FRESH_BUILD;
        uVar.copyOnWrite();
        C33427v vVar = (C33427v) uVar.instance;
        vVar.f89526b = tVar.f89522p;
        vVar.f89525a |= 1;
        C63088z byteString = ((C33414i) aVar.build()).toByteString();
        uVar.copyOnWrite();
        C33427v vVar2 = (C33427v) uVar.instance;
        byteString.getClass();
        vVar2.f89525a |= 2;
        vVar2.f89527c = byteString;
        return C58485gu.m89846n((C33427v) uVar.build());
    }
}

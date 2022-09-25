package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu;

import com.google.android.apps.gsa.nga.engine.dictation.aa;
import com.google.android.apps.gsa.nga.engine.dictation.ac;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63088z;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.n */
/* compiled from: PG */
public final /* synthetic */ class C125735n implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C125739r f346530a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f346531b;

    /* renamed from: c */
    public final /* synthetic */ C125738q f346532c;

    public /* synthetic */ C125735n(C125739r rVar, C60870cx cxVar, C125738q qVar) {
        this.f346530a = rVar;
        this.f346531b = cxVar;
        this.f346532c = qVar;
    }

    public final Object call() {
        C125739r rVar = this.f346530a;
        C60870cx cxVar = this.f346531b;
        C125738q qVar = this.f346532c;
        C63088z zVar = (C63088z) C60856cj.m92909r(cxVar);
        aa createBuilder = ac.f.createBuilder();
        String languageTag = qVar.mo107094c().toLanguageTag();
        createBuilder.copyOnWrite();
        languageTag.getClass();
        createBuilder.instance.a = languageTag;
        int i = rVar.f346540e;
        createBuilder.copyOnWrite();
        createBuilder.instance.b = i;
        Map map = (Map) Collection.EL.stream(qVar.mo107092a()).filter(C125730i.f346525a).collect(Collectors.toMap(C125731j.f346526a, C125732k.f346527a, C125733l.f346528a, C125734m.f346529a));
        createBuilder.copyOnWrite();
        ac acVar = createBuilder.instance;
        C62995dn dnVar = acVar.d;
        if (!dnVar.f170058b) {
            acVar.d = dnVar.mo58980a();
        }
        acVar.d.putAll(map);
        C58485gu b = qVar.mo107093b();
        createBuilder.copyOnWrite();
        ac acVar2 = createBuilder.instance;
        C62971cq cqVar = acVar2.e;
        if (!cqVar.mo58948c()) {
            acVar2.e = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) b, (List) acVar2.e);
        createBuilder.copyOnWrite();
        zVar.getClass();
        createBuilder.instance.c = zVar;
        return NativeEmojiNluHandler.m205705b(createBuilder.build());
    }
}

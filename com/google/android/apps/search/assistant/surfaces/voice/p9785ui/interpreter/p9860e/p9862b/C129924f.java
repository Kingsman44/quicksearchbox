package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.p9862b;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129918b;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62970cp;
import com.google.protobuf.C62995dn;
import com.google.protobuf.p4746a.C62884c;
import java.util.Collections;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.b.f */
/* compiled from: PG */
public final class C129924f implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ String f356382a;

    /* renamed from: b */
    final /* synthetic */ C129918b f356383b;

    public C129924f(String str, C129918b bVar) {
        this.f356382a = str;
        this.f356383b = bVar;
    }

    public final /* synthetic */ Object apply(Object obj) {
        C129921c cVar = (C129921c) obj;
        C69664n.m101060f(cVar, "it");
        String str = this.f356382a;
        C129918b bVar = this.f356383b;
        C62934bn builder = cVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C129919a aVar = (C129919a) builder;
        C69664n.m101061g(aVar, "builder");
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(new C62970cp(((C129921c) aVar.instance).f356377a, C129921c.f356375c)));
        C69664n.m101060f(unmodifiableMap, "_builder.getSelectedModeByLocalePairMap()");
        new C62884c(unmodifiableMap);
        C69664n.m101061g(bVar, "value");
        bVar.getClass();
        aVar.copyOnWrite();
        C129921c cVar2 = (C129921c) aVar.instance;
        C62995dn dnVar = cVar2.f356377a;
        if (!dnVar.f170058b) {
            cVar2.f356377a = dnVar.mo58980a();
        }
        new C62970cp(cVar2.f356377a, C129921c.f356375c).put(str, bVar);
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C129921c) build;
    }
}

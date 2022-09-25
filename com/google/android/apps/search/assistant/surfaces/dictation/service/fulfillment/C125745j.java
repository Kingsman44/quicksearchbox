package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.C125522a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125690w;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125691x;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126336m;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.protobuf.C63070h;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5462h.p5463a.C69496am;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.j */
/* compiled from: PG */
public final /* synthetic */ class C125745j implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C125522a f346548a;

    public /* synthetic */ C125745j(C125522a aVar) {
        this.f346548a = aVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Optional optional;
        C125522a aVar = this.f346548a;
        C63070h hVar = (C63070h) obj;
        C125708c cVar = (C125708c) obj2;
        C69664n.m101061g(hVar, "buttonPressPayload");
        C69664n.m101061g(cVar, "context");
        if (hVar.f170217a.isEmpty()) {
            ((C59052c) ((C59052c) C126336m.f348024a.mo56226d()).mo56372aa(37002)).mo56386p("Missing button payload. [SD]");
            optional = Optional.empty();
        } else {
            C51805du b = C126336m.m206591b(hVar);
            if (b == null) {
                ((C59052c) ((C59052c) C126336m.f348024a.mo56226d()).mo56372aa(37001)).mo56386p("Malformed button payload. [SD]");
            }
            optional = Optional.ofNullable(b);
        }
        if (!optional.isPresent()) {
            C125044j a = C126336m.m206590a(hVar);
            C59052c cVar2 = (C59052c) C125691x.f346424a.mo56226d();
            C69664n.m101060f(a, "chipId");
            C61301b d = C126288a.m206492d(a);
            cVar2.mo56379ah(new C59094n(36637));
            cVar2.mo56389s("Unimplemented button %s [SD]", d);
            return C60856cj.m92900i(C69496am.f185918a);
        }
        Object obj3 = optional.get();
        C69664n.m101060f(obj3, "clientInput.get()");
        C51805du duVar = (C51805du) obj3;
        C69664n.m101061g(duVar, "clientInput");
        C69664n.m101061g(cVar, "context");
        C125691x xVar = (C125691x) aVar;
        return C71663i.m104688a(C71803m.m105042c(xVar.f346426c, (C69585o) null, (C71424ay) null, new C125690w(xVar, duVar, cVar, (C69577g) null), 3));
    }
}

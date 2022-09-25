package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d;
import com.google.assistant.p3897e.p3921j.p3926e.C51923ec;
import com.google.assistant.p3897e.p3921j.p3926e.C51934en;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51952fe;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.protobuf.C62934bn;
import java.util.List;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.a */
/* compiled from: PG */
final class C33055a implements Consumer {

    /* renamed from: a */
    final /* synthetic */ List f88509a;

    /* renamed from: b */
    final /* synthetic */ C69648ae f88510b;

    public C33055a(List list, C69648ae aeVar) {
        this.f88509a = list;
        this.f88510b = aeVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C69664n.m101061g((C51941eu) obj, "it");
        List list = this.f88509a;
        C62934bn builder = ((C51953ff) this.f88510b.f186027a).toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C51923ec a = C69664n.m101061g((C51934en) builder, "builder");
        C51952fe feVar = C51952fe.FORM_FIELD_STATUS_UPDATE;
        C69664n.m101061g(feVar, "value");
        C51934en enVar = a.f136205a;
        enVar.copyOnWrite();
        C51953ff ffVar = (C51953ff) enVar.instance;
        ffVar.f136326j = feVar.f136314c;
        ffVar.f136317a |= 256;
        list.add(C33116d.m61451j(a.mo53740a()));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

package com.google.android.apps.search.assistant.surfaces.p9485e;

import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17602l;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.x */
/* compiled from: PG */
final class C126623x implements UnaryOperator {

    /* renamed from: a */
    final /* synthetic */ C126624y f348712a;

    /* renamed from: b */
    final /* synthetic */ C70862aj f348713b;

    public C126623x(C126624y yVar, C70862aj ajVar) {
        this.f348712a = yVar;
        this.f348713b = ajVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C126621v vVar = (C126621v) obj;
        if (vVar != null) {
            vVar.mo107633e("New VoiceQuery started while previous one was active.", new C70761fa(Status.f186904b.withDescription("New VoiceQuery started while previous one was active."), (C70334de) null, true));
        }
        C126624y yVar = this.f348712a;
        return yVar.f348719f.mo107606a(new C17602l(yVar.f348718e, this.f348713b), new C126622w(this.f348712a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

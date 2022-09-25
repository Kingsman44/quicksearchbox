package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34013ac;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34014ad;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34016af;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34041bd;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34084ct;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34090cz;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34120b;
import com.google.protobuf.C62934bn;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.a.a.f */
/* compiled from: PG */
final class C34360f extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C34014ad f91333a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34360f(C34014ad adVar) {
        super(1);
        this.f91333a = adVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C34120b bVar = (C34120b) obj;
        C69664n.m101061g(bVar, "it");
        C34014ad adVar = this.f91333a;
        C62934bn builder = ((C34014ad) bVar.f90873b).toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C34016af a = C69664n.m101061g((C34013ac) builder, "builder");
        if ((adVar.f90665a & 1) != 0) {
            String str = adVar.f90666b;
            C69664n.m101060f(str, "snapshotId");
            C69664n.m101061g(str, "value");
            C34013ac acVar = a.f90671a;
            acVar.copyOnWrite();
            C34014ad adVar2 = (C34014ad) acVar.instance;
            str.getClass();
            adVar2.f90665a |= 1;
            adVar2.f90666b = str;
        }
        C34041bd bdVar = adVar.f90668d;
        if (bdVar != null) {
            a.mo39189b(bdVar);
        }
        C34084ct ctVar = adVar.f90667c;
        if (ctVar != null) {
            a.mo39190c(ctVar);
        }
        C34090cz czVar = adVar.f90669e;
        if (czVar != null) {
            C34013ac acVar2 = a.f90671a;
            acVar2.copyOnWrite();
            ((C34014ad) acVar2.instance).f90669e = czVar;
        }
        return C34120b.m62740a(bVar, (C34119a) null, a.mo39188a(), 0, 13);
    }
}

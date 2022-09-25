package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.UUID;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.ai */
/* compiled from: PG */
final class C134204ai implements BiFunction {

    /* renamed from: a */
    final /* synthetic */ C134205aj f365562a;

    /* renamed from: b */
    final /* synthetic */ UUID f365563b;

    /* renamed from: c */
    final /* synthetic */ C37258g f365564c;

    public C134204ai(C134205aj ajVar, UUID uuid, C37258g gVar) {
        this.f365562a = ajVar;
        this.f365563b = uuid;
        this.f365564c = gVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        C134202ag agVar = (C134202ag) obj2;
        C69664n.m101061g((UUID) obj, "<anonymous parameter 0>");
        if (agVar == null) {
            return new C134202ag(this.f365562a, this.f365563b, this.f365564c);
        }
        C59052c cVar = (C59052c) C134205aj.f365565a.mo56226d();
        UUID uuid = this.f365563b;
        cVar.mo56379ah(new C59094n(40256));
        cVar.mo56389s("Request %d already exists; using it.", uuid);
        return agVar;
    }
}

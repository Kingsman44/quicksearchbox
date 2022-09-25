package com.google.android.libraries.home.p1940a.p1941a;

import androidx.p060c.C0977g;
import com.google.android.libraries.home.p1940a.p1943c.C23404ag;
import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.android.libraries.home.p1940a.p1943c.C23571er;
import com.google.android.libraries.home.p1940a.p1943c.C23574eu;
import com.google.android.libraries.home.p1955d.p1956a.C23765a;
import java.util.ArrayList;
import java.util.Collection;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.a.b */
/* compiled from: PG */
final class C23345b implements BiFunction {

    /* renamed from: a */
    final /* synthetic */ C23571er f63876a;

    /* renamed from: b */
    final /* synthetic */ C23347d f63877b;

    /* renamed from: c */
    final /* synthetic */ C23404ag f63878c;

    public C23345b(C23571er erVar, C23347d dVar, C23404ag agVar) {
        this.f63876a = erVar;
        this.f63877b = dVar;
        this.f63878c = agVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        ArrayList arrayList;
        C23574eu euVar = (C23574eu) obj;
        C23571er erVar = (C23571er) obj2;
        C69664n.m101061g(euVar, "traitType");
        if (erVar != null) {
            Collection<C23544dr> b = erVar.mo28849b();
            Collection<C23544dr> b2 = this.f63876a.mo28849b();
            C69664n.m101061g(b, "baseCollection");
            C69664n.m101061g(b2, "overrideCollection");
            ArrayList arrayList2 = new ArrayList();
            C0977g gVar = new C0977g();
            for (C23544dr drVar : b2) {
                if (drVar.mo28914j().isPresent()) {
                    gVar.put(drVar.mo28914j().get(), drVar);
                }
            }
            for (C23544dr drVar2 : b) {
                if (drVar2.mo28914j().isPresent()) {
                    C23544dr drVar3 = (C23544dr) gVar.get(drVar2.mo28914j().get());
                    if (drVar3 == null) {
                        arrayList2.add(drVar2);
                    } else {
                        arrayList2.add(drVar3);
                        gVar.remove(drVar2.mo28914j().get());
                    }
                }
            }
            arrayList2.addAll(gVar.values());
            arrayList = arrayList2;
        } else {
            arrayList = this.f63876a.mo28849b();
        }
        return (C23571er) C23765a.m44264a(this.f63877b.f63882b.mo28890a(euVar, this.f63878c.f63965a.f63992d, arrayList));
    }
}

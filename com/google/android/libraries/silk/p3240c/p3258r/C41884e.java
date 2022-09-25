package com.google.android.libraries.silk.p3240c.p3258r;

import android.support.p031v4.app.C0167am;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3153g.C40508a;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40534c;
import com.google.android.libraries.silk.p3205a.p3212af.C41715a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.apps.tiktok.inject.C47231d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4296af.C56650b;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.p4648g.p4650b.C61640c;
import p3186j$.util.function.Function;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.silk.c.r.e */
/* compiled from: PG */
public final /* synthetic */ class C41884e implements C61640c {

    /* renamed from: a */
    public final /* synthetic */ C69464a f109284a;

    public /* synthetic */ C41884e(C69464a aVar) {
        this.f109284a = aVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C56943g gVar;
        C56650b bVar = (C56650b) obj;
        C41715a aVar = ((C41880a) this.f109284a).f109281a;
        C69664n.m101061g(bVar, "request");
        C0167am activity = ((C40508a) aVar).f106288d.getActivity();
        if (activity == null) {
            return C60856cj.m92899h(new C41742a(C40508a.f106282a));
        }
        if (activity instanceof C47231d) {
            Object z = ((C47231d) activity).mo17754z();
            if (z instanceof C40534c) {
                try {
                    C40534c cVar = (C40534c) z;
                    if (bVar.f151236a == 1) {
                        gVar = (C56943g) bVar.f151237b;
                    } else {
                        gVar = C56943g.f151982f;
                    }
                    C69664n.m101060f(gVar, "request.address");
                    cVar.mo42493e(gVar, bVar.f151238c);
                    return C60866ct.f164955a;
                } catch (Exception unused) {
                    return C60856cj.m92899h(new C41742a(C40508a.f106283b));
                }
            }
        }
        return C60856cj.m92899h(new C41742a(C40508a.f106284c));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

package com.google.android.libraries.search.silk.p3162a.p3180r;

import com.evernote.android.state.BuildConfig;
import com.google.p4184bj.p4204d.p4205a.p4210e.C56022f;
import com.google.protos.p4874ap.p4877b.p4878a.C63697h;
import com.google.protos.p4874ap.p4877b.p4878a.C63698i;
import com.google.protos.p4874ap.p4877b.p4878a.C63709t;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.silk.a.r.d */
/* compiled from: PG */
public final /* synthetic */ class C40639d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C40639d f106648a = new C40639d();

    private /* synthetic */ C40639d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C56022f fVar;
        C63698i iVar = ((C63709t) obj).f172248a;
        if (iVar == null) {
            iVar = C63698i.f172221d;
        }
        C63697h hVar = iVar.f172225c;
        if (hVar == null) {
            hVar = C63697h.f172217c;
        }
        if (hVar.f172219a == 1) {
            fVar = (C56022f) hVar.f172220b;
        } else {
            fVar = C56022f.f149189c;
        }
        return fVar.f149191a == 2 ? (String) fVar.f149192b : BuildConfig.FLAVOR;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

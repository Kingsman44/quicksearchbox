package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import com.google.android.apps.gsa.nga.engine.recognition.C77623f;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80562g;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80563h;
import java.text.SimpleDateFormat;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.g */
/* compiled from: PG */
public final /* synthetic */ class C77639g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C77623f f213858a;

    public /* synthetic */ C77639g(C77623f fVar) {
        this.f213858a = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        float f;
        C77623f fVar = this.f213858a;
        C80563h hVar = (C80563h) obj;
        SimpleDateFormat simpleDateFormat = C77649q.f213868a;
        C80562g gVar = (C80562g) hVar.toBuilder();
        float max = Math.max(hVar.f221143n, fVar.mo72753b());
        gVar.copyOnWrite();
        C80563h hVar2 = (C80563h) gVar.instance;
        hVar2.f221130a |= 4096;
        hVar2.f221143n = max;
        if ((hVar.f221130a & 8192) != 0) {
            f = Math.min(hVar.f221144o, fVar.mo72753b());
        } else {
            f = fVar.mo72753b();
        }
        gVar.copyOnWrite();
        C80563h hVar3 = (C80563h) gVar.instance;
        hVar3.f221130a |= 8192;
        hVar3.f221144o = f;
        return (C80563h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

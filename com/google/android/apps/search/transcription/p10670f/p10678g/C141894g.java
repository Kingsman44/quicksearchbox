package com.google.android.apps.search.transcription.p10670f.p10678g;

import android.os.Bundle;
import com.google.android.apps.p471d.p472a.p477b.p478a.C9029b;
import com.google.android.apps.p471d.p472a.p477b.p478a.C9030c;
import com.google.android.apps.p471d.p472a.p477b.p478a.C9031d;
import com.google.android.apps.p471d.p472a.p477b.p478a.C9033f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.speech.p5218j.C66881d;
import java.util.ArrayList;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.transcription.f.g.g */
/* compiled from: PG */
public final /* synthetic */ class C141894g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C141894g f385011a = new C141894g();

    private /* synthetic */ C141894g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C9031d a = C9031d.m23579a((C58485gu) Collection.EL.stream(((C66881d) obj).f181829a).map(C141898k.f385017a).collect(C58370cn.f155946a));
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("alternative_spans", (ArrayList) Collection.EL.stream(((C9033f) a).f31233a).map(C9029b.f31228a).collect(Collectors.toCollection(C9030c.f31229a)));
        return bundle;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

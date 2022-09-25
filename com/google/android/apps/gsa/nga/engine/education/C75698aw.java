package com.google.android.apps.gsa.nga.engine.education;

import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p4008y.p4009a.C53577bj;
import com.google.assistant.p4008y.p4009a.C53579bl;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.aw */
/* compiled from: PG */
public final /* synthetic */ class C75698aw implements Function {

    /* renamed from: a */
    public final /* synthetic */ C75743bc f210128a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f210129b;

    public /* synthetic */ C75698aw(C75743bc bcVar, C58495hd hdVar) {
        this.f210128a = bcVar;
        this.f210129b = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C75743bc bcVar = this.f210128a;
        C58495hd hdVar = this.f210129b;
        C75650ai aiVar = (C75650ai) obj;
        C22871g gVar = bcVar.f210221b;
        Optional f = aiVar.mo71802f();
        if (f.isEmpty()) {
            ((C58970a) ((C58970a) C75743bc.f210220a.mo56226d()).mo56372aa(3285)).mo56386p("Empty priority context - defaulting to LOW priority");
            cxVar = C60856cj.m92900i(C53577bj.PRIORITY_LOW);
        } else {
            C53579bl blVar = (C53579bl) f.get();
            cxVar = bcVar.f210221b.mo28209i(C80905at.m128760d(bcVar.f210221b, "[NGA] Get first matching rule's priority", (C58485gu) Collection.EL.stream(blVar.f140629c).map(new C75741ba(bcVar, hdVar)).collect(C58370cn.f155946a)), "[NGA] Get actual priority", new C75691ap(blVar));
        }
        return gVar.mo28209i(cxVar, "[NGA] Assign priority to suggestion.", new C75692aq(aiVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

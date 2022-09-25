package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9988q;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123772cl;
import com.google.assistant.p3886c.C50818do;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.q.b */
/* compiled from: PG */
public final /* synthetic */ class C131535b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131539f f359412a;

    public /* synthetic */ C131535b(C131539f fVar) {
        this.f359412a = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C131539f fVar = this.f359412a;
        C123744bk bkVar = (C123744bk) obj;
        C123772cl clVar = bkVar.f341816k;
        if (clVar == null) {
            clVar = C123772cl.f341902h;
        }
        if ((clVar.f341904a & 32) != 0) {
            try {
                C123772cl clVar2 = bkVar.f341816k;
                if (clVar2 == null) {
                    clVar2 = C123772cl.f341902h;
                }
                return Optional.m71637of((C50818do) C62942bv.parseFrom((C62942bv) C50818do.f132293H, clVar2.f341910g, C62921ba.m95368a()));
            } catch (C62974ct e) {
                ((C58970a) ((C58970a) ((C58970a) fVar.f359418b.mo56226d()).mo56382g(e)).mo56372aa(39306)).mo56395y("Rendering content is not a Smartspace card, dataType: %s, dataId: %s", bkVar.f341810e, bkVar.f341812g);
            }
        } else {
            ((C58970a) ((C58970a) fVar.f359418b.mo56226d()).mo56372aa(39305)).mo56395y("proactiveData doesn't contain Smartspace card, dataType: %s, dataId: %s", bkVar.f341810e, bkVar.f341812g);
            return Optional.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

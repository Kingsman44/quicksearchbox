package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9972f;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123708ab;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10000f.C131660a;
import com.google.assistant.p3886c.C50818do;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.f.d */
/* compiled from: PG */
public final /* synthetic */ class C131315d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131318g f359007a;

    public /* synthetic */ C131315d(C131318g gVar) {
        this.f359007a = gVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C50818do doVar;
        C131318g gVar = this.f359007a;
        C123744bk bkVar = (C123744bk) obj;
        ((C58970a) ((C58970a) gVar.f359012b.mo56224b()).mo56372aa(39199)).mo56386p("#Generate grocery card");
        C131660a aVar = gVar.f359013c;
        C59104x b = C131660a.f359736a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SmartspaceGroceryIH");
        ((C59052c) ((C59052c) b).mo56372aa(39159)).mo56386p("handle grocery proactive data input.");
        if (bkVar.f341808c == 36) {
            doVar = aVar.mo110247a((C123708ab) bkVar.f341809d);
        } else {
            C59104x d = C131660a.f359736a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SmartspaceGroceryIH");
            ((C59052c) ((C59052c) d).mo56372aa(39160)).mo56386p("proactive data doesn't contain grocery data.");
            doVar = null;
        }
        Optional ofNullable = Optional.ofNullable(doVar);
        if (ofNullable.isPresent()) {
            return gVar.f359014d.mo110131e((C50818do) ofNullable.get());
        }
        return C60856cj.m92900i(ofNullable);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

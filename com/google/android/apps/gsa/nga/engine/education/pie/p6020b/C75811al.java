package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.google.android.apps.gsa.nga.engine.education.pie.C75909j;
import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.al */
/* compiled from: PG */
public final class C75811al implements C75910k {

    /* renamed from: a */
    private static final C58974d f210393a = C58974d.m91136j();

    /* renamed from: b */
    private final C81459h f210394b;

    public C75811al(C22871g gVar) {
        this.f210394b = new C81459h(gVar, C75809aj.f210391a, C75810ak.f210392a);
    }

    /* renamed from: a */
    public final void mo71909a(C75909j jVar) {
        this.f210394b.mo75092c(jVar);
    }

    /* renamed from: b */
    public final void mo71910b(ProtoLiteParcelable protoLiteParcelable) {
        try {
            C80203ax axVar = (C80203ax) protoLiteParcelable.mo84191d(C80203ax.f220047c.getParserForType());
            if (axVar == null) {
                ((C58970a) ((C58970a) f210393a.mo56225c()).mo56372aa(3372)).mo56386p("Request proto missing");
            } else {
                this.f210394b.mo75090a(axVar);
            }
        } catch (Exception e) {
            ((C58970a) ((C58970a) ((C58970a) f210393a.mo56225c()).mo56382g(e)).mo56372aa(3373)).mo56386p("Error parsing request");
        }
    }

    /* renamed from: c */
    public final void mo71911c(C75909j jVar) {
        this.f210394b.mo75093d(jVar);
    }
}

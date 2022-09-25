package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8806b.p8807a;

import com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85718f;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.auto.ondevice.p713e.C11897m;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.b.a.z */
/* compiled from: PG */
public final class C117799z extends C68247h {

    /* renamed from: a */
    private final C68283d f326950a;

    /* renamed from: c */
    private final C68283d f326951c;

    /* renamed from: d */
    private final C68283d f326952d;

    /* renamed from: e */
    private final C68283d f326953e;

    /* renamed from: f */
    private final C68283d f326954f;

    /* renamed from: g */
    private final C68283d f326955g;

    public C117799z(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C117799z.class), aVar);
        this.f326950a = C68236af.m98549d(dVar);
        this.f326951c = C68236af.m98549d(dVar2);
        this.f326952d = C68236af.m98549d(dVar3);
        this.f326953e = C68236af.m98549d(dVar4);
        this.f326954f = C68236af.m98549d(dVar5);
        this.f326955g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C58833ax axVar2 = (C58833ax) list.get(1);
        C58833ax axVar3 = (C58833ax) list.get(2);
        Query query = (Query) list.get(3);
        C58974d dVar = (C58974d) list.get(4);
        ((C85700a) list.get(5)).mo79332n(query);
        if (axVar.mo56113h()) {
            ((C11897m) axVar.mo56107c()).mo20285f(query);
        }
        if (axVar2.mo56113h()) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(18639)).mo56389s("Built AssistantResponse with ClientOps %s", new C117796w(axVar2));
            axVar2.mo56107c();
            if (axVar.mo56113h()) {
                C11897m mVar = (C11897m) axVar.mo56107c();
                C52081en enVar = ((C51195j) axVar2.mo56107c()).f133275j;
                if (enVar == null) {
                    enVar = C52081en.f136679i;
                }
                mVar.mo20282c(query, enVar);
            }
            obj2 = C58833ax.m90834k(C85718f.m137720b((C51195j) axVar2.mo56107c()));
        } else if (axVar3.mo56113h()) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(18637)).mo56386p("Built ActionData");
            ((ActionData) axVar3.mo56107c()).mo81107s();
            if (axVar.mo56113h()) {
                ((C11897m) axVar.mo56107c()).mo20281b(query, (ActionData) axVar3.mo56107c());
            }
            obj2 = C58833ax.m90834k(C85718f.m137719a((ActionData) axVar3.mo56107c()));
        } else {
            if (!query.f252770i.equals("##.##.##.#############!!!")) {
                ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(18635)).mo56386p("No Fulfillment logic built");
                if (axVar.mo56113h()) {
                    ((C11897m) axVar.mo56107c()).mo20287h(query);
                }
            }
            obj2 = C58836b.f156633a;
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326950a.mo60297gq(), this.f326951c.mo60297gq(), this.f326952d.mo60297gq(), this.f326953e.mo60297gq(), this.f326954f.mo60297gq(), this.f326955g.mo60297gq());
    }
}

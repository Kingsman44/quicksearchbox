package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import android.database.Cursor;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123731ay;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123732az;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123780i;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123781j;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.k */
/* compiled from: PG */
public final /* synthetic */ class C123634k implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ C123610ac f341557a;

    /* renamed from: b */
    public final /* synthetic */ List f341558b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f341559c;

    /* renamed from: d */
    public final /* synthetic */ C123777f f341560d;

    public /* synthetic */ C123634k(C123610ac acVar, List list, C53306j jVar, C123777f fVar) {
        this.f341557a = acVar;
        this.f341558b = list;
        this.f341559c = jVar;
        this.f341560d = fVar;
    }

    /* renamed from: a */
    public final Object mo45922a(C42847bf bfVar) {
        C123781j jVar;
        C123610ac acVar = this.f341557a;
        List list = this.f341558b;
        C53306j jVar2 = this.f341559c;
        C123777f fVar = this.f341560d;
        try {
            Cursor d = bfVar.mo45932d(C123611ad.m202951j(new ArrayList(), list, jVar2, false));
            try {
                C58526ih ihVar = new C58526ih();
                while (d.moveToNext()) {
                    if (!acVar.mo106069m(d, fVar)) {
                        C123731ay ayVar = (C123731ay) C123732az.f341771d.createBuilder();
                        long j = d.getLong(d.getColumnIndexOrThrow("last_update_timestamp"));
                        C123744bk o = C123610ac.m202927o(d, ayVar);
                        C123780i iVar = (C123780i) C123781j.f341939e.createBuilder();
                        iVar.copyOnWrite();
                        C123781j jVar3 = (C123781j) iVar.instance;
                        o.getClass();
                        jVar3.f341942b = o;
                        jVar3.f341941a |= 1;
                        C123732az azVar = (C123732az) ayVar.build();
                        iVar.copyOnWrite();
                        C123781j jVar4 = (C123781j) iVar.instance;
                        azVar.getClass();
                        jVar4.f341943c = azVar;
                        jVar4.f341941a |= 2;
                        C63042fg i = C62953e.m95484i(j);
                        iVar.copyOnWrite();
                        C123781j jVar5 = (C123781j) iVar.instance;
                        i.getClass();
                        jVar5.f341944d = i;
                        jVar5.f341941a |= 4;
                        jVar = (C123781j) iVar.build();
                        ihVar.mo55373c(jVar);
                    }
                }
                C58528ij f = ihVar.mo55486f();
                if (d == null) {
                    return f;
                }
                d.close();
                return f;
            } catch (C62974ct e) {
                int i2 = d.getInt(d.getColumnIndexOrThrow("CLIENT_DATA_TYPE"));
                String string = d.getString(d.getColumnIndexOrThrow("CLIENT_DATA_ID"));
                C59104x d2 = C123610ac.f341528a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "PCP.Database");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(35169)).mo56395y("Error converting DataType %s DataId %s for ProactiveData", i2, string);
                jVar = C123781j.f341939e;
            } catch (Throwable th) {
                if (d != null) {
                    d.close();
                }
                throw th;
            }
        } catch (InterruptedException e2) {
            C59104x c = C123610ac.f341528a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PCP.Database");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(35178)).mo56386p("#getProactiveClientDataForClientWithoutValidityCheck failed");
            return C58733pz.f156496a;
        } catch (Throwable th2) {
            C123633j.m203004a(th, th2);
        }
    }
}

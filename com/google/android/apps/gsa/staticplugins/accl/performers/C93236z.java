package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.nga.api.a.bz;
import com.google.android.apps.gsa.nga.api.a.cb;
import com.google.android.apps.gsa.nga.api.a.t;
import com.google.android.apps.gsa.nga.api.a.u;
import com.google.android.apps.gsa.nga.api.a.v;
import com.google.android.apps.gsa.nga.api.a.w;
import com.google.android.apps.gsa.staticplugins.nga.p8044a.p8046b.C102999b;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1852f.C22587n;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.z */
/* compiled from: PG */
public final /* synthetic */ class C93236z implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C92866aa f259995a;

    public /* synthetic */ C93236z(C92866aa aaVar) {
        this.f259995a = aaVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C92866aa aaVar = this.f259995a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C59104x b = C92866aa.f259086a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsTtsPerformer");
            ((C59052c) ((C59052c) b).mo56372aa(13066)).mo56386p("Sending TTS to NGA");
            t createBuilder = u.c.createBuilder();
            v createBuilder2 = w.b.createBuilder();
            C63088z b2 = ((C22587n) axVar.mo56107c()).mo27672b();
            createBuilder2.copyOnWrite();
            b2.getClass();
            createBuilder2.instance.a = b2;
            w build = createBuilder2.build();
            createBuilder.copyOnWrite();
            u uVar = createBuilder.instance;
            build.getClass();
            uVar.b = build;
            uVar.a = 1;
            u build2 = createBuilder.build();
            bz createBuilder3 = cb.d.createBuilder();
            createBuilder3.copyOnWrite();
            cb cbVar = createBuilder3.instance;
            build2.getClass();
            cbVar.b = build2;
            cbVar.a = 12;
            ((C102999b) ((C58833ax) aaVar.f259087b.mo27525b()).mo56107c()).mo93556a(createBuilder3.build());
        }
        return C60856cj.m92900i(C22402a.f61894b);
    }
}

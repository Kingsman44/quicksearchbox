package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.libraries.assistant.pcp.p1573k.C18922b;
import com.google.android.libraries.assistant.pcp.p1573k.C18930j;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import java.util.List;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.br */
/* compiled from: PG */
public final class C18845br implements C18930j {

    /* renamed from: b */
    private static final C59071e f53082b = C59071e.m91332i("com.google.android.libraries.assistant.pcp.k.a.br");

    /* renamed from: a */
    final ConcurrentHashMap f53083a = new ConcurrentHashMap();

    /* renamed from: c */
    private final C18821au f53084c;

    public C18845br(C18821au auVar) {
        this.f53084c = auVar;
    }

    /* renamed from: a */
    public final C60870cx mo24192a(ComponentName componentName, C53306j jVar, List list) {
        if (componentName == null) {
            C59104x d = f53082b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TNG.MediaManager");
            ((C59052c) ((C59052c) d).mo56372aa(47464)).mo56386p("#getMediaItemListByComponentName() Component name is NULL.");
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C18821au auVar = this.f53084c;
        Context context = (Context) auVar.f52997a.mo17428b();
        context.getClass();
        C18922b bVar = (C18922b) auVar.f52998b.mo17428b();
        bVar.getClass();
        ((C18909x) auVar.f52999c.mo17428b()).getClass();
        C18830bc bcVar = (C18830bc) auVar.f53000d.mo17428b();
        bcVar.getClass();
        C46428ao aoVar = (C46428ao) auVar.f53001e.mo17428b();
        aoVar.getClass();
        C60887da daVar = (C60887da) auVar.f53002f.mo17428b();
        daVar.getClass();
        C60888db dbVar = (C60888db) auVar.f53003g.mo17428b();
        dbVar.getClass();
        C18820at atVar = r1;
        C18821au auVar2 = auVar;
        C18820at atVar2 = new C18820at(componentName, context, bVar, bcVar, aoVar, daVar, dbVar, auVar.f53004h, auVar.f53005i, auVar.f53006j, auVar.f53007k, auVar.f53008l, auVar.f53009m, auVar.f53010n, auVar2.f53011o, auVar2.f53012p, auVar2.f53013q, auVar2.f53014r);
        C18820at atVar3 = atVar;
        this.f53083a.put(componentName, atVar3);
        return atVar3.mo24165a(jVar, list);
    }
}

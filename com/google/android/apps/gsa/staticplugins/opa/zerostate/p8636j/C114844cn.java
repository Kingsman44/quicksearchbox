package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3994s.p3995a.C53156dl;
import com.google.assistant.p3994s.p3995a.C53157dm;
import com.google.assistant.p3994s.p3995a.C53158dn;
import com.google.assistant.p3994s.p3995a.C53159do;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.cn */
/* compiled from: PG */
public final /* synthetic */ class C114844cn implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C53156dl f318629a;

    /* renamed from: b */
    public final /* synthetic */ Uri f318630b;

    public /* synthetic */ C114844cn(C53156dl dlVar, Uri uri) {
        this.f318629a = dlVar;
        this.f318630b = uri;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C53156dl dlVar = this.f318629a;
        Uri uri = this.f318630b;
        C58833ax axVar = (C58833ax) obj;
        C59071e eVar = C114860dc.f318661a;
        if (axVar.mo56113h()) {
            C63087y v = C63088z.m96150v();
            ((Bitmap) axVar.mo56107c()).compress(C114860dc.f318662b, 80, v);
            C53158dn dnVar = (C53158dn) C53159do.f139327d.createBuilder();
            String uri2 = uri.toString();
            dnVar.copyOnWrite();
            C53159do doVar = (C53159do) dnVar.instance;
            uri2.getClass();
            doVar.f139329a |= 1;
            doVar.f139330b = uri2;
            C63088z b = v.mo59165b();
            dnVar.copyOnWrite();
            C53159do doVar2 = (C53159do) dnVar.instance;
            b.getClass();
            doVar2.f139329a |= 4;
            doVar2.f139331c = b;
            dlVar.copyOnWrite();
            C53157dm dmVar = (C53157dm) dlVar.instance;
            C53159do doVar3 = (C53159do) dnVar.build();
            C53157dm dmVar2 = C53157dm.f139323c;
            doVar3.getClass();
            dmVar.f139326b = doVar3;
            dmVar.f139325a = 2;
        }
        return (C53157dm) dlVar.build();
    }
}

package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.net.Uri;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.MessageLite;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.q */
/* compiled from: PG */
public final /* synthetic */ class C110387q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110318ad f307660a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f307661b;

    /* renamed from: c */
    public final /* synthetic */ Uri f307662c;

    public /* synthetic */ C110387q(C110318ad adVar, MessageLite messageLite, Uri uri) {
        this.f307660a = adVar;
        this.f307661b = messageLite;
        this.f307662c = uri;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110318ad adVar = this.f307660a;
        MessageLite messageLite = this.f307661b;
        Uri uri = this.f307662c;
        Map map = (Map) obj;
        map.put("Accept", "application/protobuf");
        map.put("Content-Type", "application/protobuf");
        C58976aa aaVar = C58975e.f156826a;
        C89068x a = C89009ag.m144715a(ByteBuffer.wrap(messageLite.toByteArray()), adVar.f307480g);
        C89356b a2 = adVar.f307483j.mo78025a("photos request", 131, 200);
        C89019aq d = C89020ar.m144759d();
        d.mo82994f(uri.toString());
        d.f241245k = 68;
        d.mo82991c(map);
        return adVar.f307481h.mo80852a(a2, C89066v.f241382a, new C89018ap(d.mo82989a(), a));
    }
}

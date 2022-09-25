package com.google.android.apps.gsa.staticplugins.p7385ak;

import android.text.TextUtils;
import com.google.android.apps.gsa.p5850f.C74523c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.p7385ak.p7386a.C93891d;
import com.google.android.apps.gsa.staticplugins.p7385ak.p7386a.C93892e;
import com.google.android.apps.gsa.staticplugins.p7385ak.p7386a.C93893f;
import com.google.android.apps.gsa.staticplugins.p7385ak.p7386a.C93894g;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import java.util.List;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.ak.f */
/* compiled from: PG */
public final /* synthetic */ class C93901f implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93914s f262248a;

    public /* synthetic */ C93901f(C93914s sVar) {
        this.f262248a = sVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93914s sVar = this.f262248a;
        List list = (List) obj;
        String F = sVar.f262267b.mo79659F();
        if (TextUtils.isEmpty(F)) {
            C58976aa aaVar = C58975e.f156826a;
            return C118826c.f331422a;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C93894g gVar = sVar.f262276m;
        Instant ofEpochMilli = Instant.ofEpochMilli(sVar.f262273j.mo26870b());
        C90875ai.m148465b(new C93892e(ofEpochMilli), gVar.f262240b.mo46039a(new C93891d(ofEpochMilli), C60826bg.f164896a), gVar.f262241c, "update last sync time").mo85223a(C93893f.f262238a);
        sVar.f262272i.mo88213a(F, (C74523c) null);
        return C118826c.f331422a;
    }
}

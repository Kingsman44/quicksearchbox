package com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9157a;

import com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9158b.C121092b;
import com.google.android.libraries.search.assistant.p2868z.p2869a.C37165c;
import com.google.android.libraries.search.assistant.p2868z.p2869a.C37168f;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.search.assistant.platform.h.f.a.k */
/* compiled from: PG */
public final class C121083k implements C43019v {

    /* renamed from: a */
    public static final C59071e f336494a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.h.f.a.k");

    /* renamed from: b */
    private final C60887da f336495b;

    /* renamed from: c */
    private final C37165c f336496c;

    /* renamed from: d */
    private final boolean f336497d;

    public C121083k(boolean z, C37165c cVar, C60887da daVar) {
        this.f336496c = cVar;
        this.f336495b = daVar;
        this.f336497d = z;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C60870cx mo18055b(MessageLite messageLite) {
        C121092b bVar = (C121092b) messageLite;
        if (bVar.f336509d) {
            return C60856cj.m92900i(bVar);
        }
        C37165c cVar = this.f336496c;
        C37168f fVar = new C37168f();
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 268435456;
        acv.f128968x = true;
        fVar.mo40666b((acv) acu.build());
        fVar.mo40667c(getClass().getSimpleName());
        return C60846c.m92878g(C60922j.m93044g(cVar.mo40669a(fVar.mo40665a()), C47810es.m84963c(new C121081i(bVar)), this.f336495b), Throwable.class, C47810es.m84963c(new C121082j(bVar)), this.f336495b);
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        ((C59052c) ((C59052c) f336494a.mo56224b()).mo56372aa(35708)).mo56389s("#shouldMigrate(): allowMobileLocaleSettingsDataMigration = %b,", Boolean.valueOf(this.f336497d));
        return C60856cj.m92900i(Boolean.valueOf(this.f336497d));
    }
}

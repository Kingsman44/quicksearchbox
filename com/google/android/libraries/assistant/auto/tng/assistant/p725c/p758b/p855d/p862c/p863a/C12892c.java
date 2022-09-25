package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p862c.p863a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.c.a.c */
/* compiled from: PG */
public final class C12892c {

    /* renamed from: a */
    public static final C59071e f40152a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.c.a.c");

    /* renamed from: b */
    public final Map f40153b;

    /* renamed from: c */
    public final Executor f40154c;

    public C12892c(Map map, Executor executor) {
        this.f40153b = map;
        this.f40154c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20838a(C12989g gVar) {
        if (!this.f40153b.containsKey(gVar)) {
            ((C59052c) ((C59052c) f40152a.mo56226d()).mo56372aa(44534)).mo56389s("Unable to retrieve dialog token ProtoDataStore for entrySurface: %s", gVar.name());
            return C60856cj.m92900i(C63088z.f170246b);
        }
        C60870cx d = ((C42876ab) this.f40153b.get(gVar)).mo46042d();
        C12891b bVar = C12891b.f40151a;
        return C60922j.m93044g(d, C47810es.m84963c(bVar), this.f40154c);
    }
}

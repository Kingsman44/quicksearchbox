package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63088z;
import java.util.concurrent.ExecutionException;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.z */
/* compiled from: PG */
public final /* synthetic */ class C131416z implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C131377ai f359222a;

    /* renamed from: b */
    public final /* synthetic */ C58490gz f359223b;

    public /* synthetic */ C131416z(C131377ai aiVar, C58490gz gzVar) {
        this.f359222a = aiVar;
        this.f359223b = gzVar;
    }

    public final void accept(Object obj, Object obj2) {
        C131377ai aiVar = this.f359222a;
        String str = (String) obj;
        try {
            this.f359223b.mo55429h(str, (C63088z) C60856cj.m92909r((C47633f) obj2));
        } catch (ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) aiVar.f359119b.mo56225c()).mo56382g(e)).mo56372aa(39245)).mo56389s("Error loading image. URL: %s", str);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}

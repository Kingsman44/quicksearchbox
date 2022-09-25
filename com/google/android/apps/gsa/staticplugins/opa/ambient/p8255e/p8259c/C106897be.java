package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63088z;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.be */
/* compiled from: PG */
public final /* synthetic */ class C106897be implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C106918bz f297797a;

    /* renamed from: b */
    public final /* synthetic */ Map f297798b;

    public /* synthetic */ C106897be(C106918bz bzVar, Map map) {
        this.f297797a = bzVar;
        this.f297798b = map;
    }

    public final void accept(Object obj, Object obj2) {
        C106918bz bzVar = this.f297797a;
        String str = (String) obj;
        try {
            this.f297798b.put(str, (C63088z) C60856cj.m92909r((C47633f) obj2));
        } catch (ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) bzVar.f297829d.mo56225c()).mo56382g(e)).mo56372aa(23388)).mo56389s("Error loading image. URL: %s", str);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}

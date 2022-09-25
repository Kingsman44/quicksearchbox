package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1252d;

import com.google.assistant.p3980n.p3985c.C53020k;
import com.google.common.p4526f.C59071e;
import java.util.List;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.d.p */
/* compiled from: PG */
public final /* synthetic */ class C16263p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ List f47882a;

    /* renamed from: b */
    public final /* synthetic */ String f47883b;

    public /* synthetic */ C16263p(List list, String str) {
        this.f47882a = list;
        this.f47883b = str;
    }

    public final void accept(Object obj) {
        List list = this.f47882a;
        String str = this.f47883b;
        C59071e eVar = C16267t.f47888a;
        list.addAll(C16267t.m33300b(((C53020k) obj).f138974c, Optional.empty(), str));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

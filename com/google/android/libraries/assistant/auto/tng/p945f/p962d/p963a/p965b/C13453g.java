package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f;
import com.google.common.base.C58817ah;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.b.g */
/* compiled from: PG */
public final /* synthetic */ class C13453g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Map.Entry f41287a;

    public /* synthetic */ C13453g(Map.Entry entry) {
        this.f41287a = entry;
    }

    public final Object apply(Object obj) {
        Map.Entry entry = this.f41287a;
        if (((Boolean) obj).booleanValue()) {
            return Optional.m71637of((C13530f) entry.getKey());
        }
        return Optional.empty();
    }
}

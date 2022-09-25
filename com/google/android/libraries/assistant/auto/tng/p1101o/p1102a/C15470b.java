package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a;

import com.google.common.p4526f.C59052c;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.b */
/* compiled from: PG */
public final /* synthetic */ class C15470b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C15478d f46399a;

    /* renamed from: b */
    public final /* synthetic */ Long f46400b;

    public /* synthetic */ C15470b(C15478d dVar, Long l) {
        this.f46399a = dVar;
        this.f46400b = l;
    }

    public final Object call() {
        C15478d dVar = this.f46399a;
        Long l = this.f46400b;
        if (dVar.f46427b.containsKey(l)) {
            Long l2 = (Long) dVar.f46427b.remove(l);
            l2.getClass();
            return Optional.m71637of(l2);
        }
        ((C59052c) ((C59052c) C15478d.f46426a.mo56226d()).mo56372aa(45162)).mo56389s("#getTag(): No tag for request id %s.", l);
        return Optional.empty();
    }
}

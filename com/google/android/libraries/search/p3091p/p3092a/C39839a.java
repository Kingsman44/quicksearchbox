package com.google.android.libraries.search.p3091p.p3092a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17268f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5208h.C66611ci;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.p.a.a */
/* compiled from: PG */
public final class C39839a implements C17268f {

    /* renamed from: a */
    private static final C59071e f104748a = C59071e.m91332i("com.google.android.libraries.search.p.a.a");

    /* renamed from: b */
    private final Set f104749b;

    public C39839a(Set set) {
        this.f104749b = set;
    }

    /* renamed from: a */
    public final void mo23256a() {
        ((C59052c) ((C59052c) f104748a.mo56224b()).mo56372aa(53874)).mo56386p("#onCompleted");
        for (C17268f a : this.f104749b) {
            a.mo23256a();
        }
    }

    /* renamed from: b */
    public final void mo23257b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f104748a.mo56226d()).mo56382g(th)).mo56372aa(53875)).mo56386p("#onError");
        for (C17268f b : this.f104749b) {
            b.mo23257b(th);
        }
    }

    /* renamed from: c */
    public final void mo23258c(C66611ci ciVar) {
        ((C59052c) ((C59052c) f104748a.mo56224b()).mo56372aa(53876)).mo56386p("#onNext");
        for (C17268f c : this.f104749b) {
            c.mo23258c(ciVar);
        }
    }
}

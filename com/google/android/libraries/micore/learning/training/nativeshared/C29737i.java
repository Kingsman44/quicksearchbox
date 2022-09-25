package com.google.android.libraries.micore.learning.training.nativeshared;

import com.google.android.libraries.micore.learning.base.C29715g;
import com.google.android.libraries.micore.learning.training.util.StatusOr;
import com.google.fcp.client.C61091d;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.micore.learning.training.nativeshared.i */
/* compiled from: PG */
public final class C29737i implements NativeFiles, Closeable {

    /* renamed from: a */
    public final C29715g f80512a;

    /* renamed from: b */
    public final List f80513b = new ArrayList();

    /* renamed from: c */
    private final C61091d f80514c;

    public C29737i(C29715g gVar, C61091d dVar) {
        this.f80512a = gVar;
        this.f80514c = dVar;
    }

    public final void close() {
        this.f80514c.mo57646b(new C29736h(this));
    }

    public final StatusOr createTempFile(String str, String str2) {
        return (StatusOr) this.f80514c.mo57645a(new C29735g(this, str, str2));
    }
}

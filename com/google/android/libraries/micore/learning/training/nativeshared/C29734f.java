package com.google.android.libraries.micore.learning.training.nativeshared;

import com.google.android.libraries.micore.learning.training.C29727c;
import com.google.fcp.client.C61091d;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.micore.learning.training.nativeshared.f */
/* compiled from: PG */
public final class C29734f implements Closeable {

    /* renamed from: a */
    public final C29727c f80503a;

    /* renamed from: b */
    public final Object f80504b = new Object();

    /* renamed from: c */
    public final List f80505c;

    /* renamed from: d */
    public final C61091d f80506d;

    /* renamed from: e */
    public final boolean f80507e;

    public C29734f(C29727c cVar, C61091d dVar, boolean z) {
        this.f80503a = cVar;
        this.f80505c = new ArrayList();
        this.f80506d = dVar;
        this.f80507e = z;
    }

    public final void close() {
        this.f80506d.mo57646b(new C29729a(this));
    }
}

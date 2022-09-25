package com.google.android.apps.gsa.searchbox.p6960ui;

import android.net.Uri;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.f */
/* compiled from: PG */
public final class C88705f {

    /* renamed from: a */
    private final C68214a f239829a;

    /* renamed from: b */
    private C91189au f239830b;

    public C88705f(C68214a aVar) {
        this.f239829a = aVar;
    }

    /* renamed from: a */
    public final C91189au mo82427a() {
        if (this.f239830b == null) {
            this.f239830b = (C91189au) this.f239829a.mo27525b();
        }
        return this.f239830b;
    }

    /* renamed from: b */
    public final C60870cx mo82428b(Uri uri) {
        return mo82427a().mo85418e(uri, 7);
    }
}

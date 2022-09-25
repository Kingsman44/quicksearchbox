package com.google.android.apps.search.weather.p10684c;

import android.content.Intent;
import com.google.android.apps.search.weather.p10685d.C142073b;
import com.google.android.libraries.search.p2998g.C38387c;
import com.google.android.libraries.search.p2998g.C38389e;
import com.google.android.libraries.search.p2998g.C38392h;
import com.google.android.libraries.search.p2998g.C38393i;
import com.google.android.libraries.search.p2998g.C38395k;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.search.weather.c.a */
/* compiled from: PG */
public final class C142070a implements C38393i {

    /* renamed from: a */
    private final boolean f385461a;

    public C142070a(boolean z) {
        this.f385461a = z;
    }

    /* renamed from: a */
    public final C38392h mo41409a(C38395k kVar) {
        if (!this.f385461a) {
            return new C38387c("Weather untrusted session deeplinks are disabled");
        }
        Intent intent = new Intent();
        C142073b.m230648b(intent);
        intent.putExtra("source", "and.gsa.deeplink");
        return C38389e.m67663a(C58485gu.m89846n(intent));
    }
}

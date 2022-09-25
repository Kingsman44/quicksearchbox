package com.google.android.apps.search.googleapp.googleappbrowser.p10264e.p10267c;

import com.google.android.libraries.web.weblayer.contrib.footprints.C44205b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47637j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import java.util.List;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.e.c.a */
/* compiled from: PG */
public final class C135577a implements C44205b {

    /* renamed from: a */
    private final C135581e f369300a;

    /* renamed from: b */
    private final boolean f369301b;

    /* renamed from: c */
    private final Duration f369302c;

    public C135577a(C135581e eVar, boolean z, C62910ar arVar) {
        this.f369300a = eVar;
        this.f369301b = z;
        this.f369302c = C62950b.m95473d(arVar);
    }

    /* renamed from: a */
    public final Duration mo47140a() {
        return this.f369302c;
    }

    /* renamed from: b */
    public final boolean mo47141b() {
        return this.f369301b;
    }

    /* renamed from: c */
    public final void mo47142c(String str, String str2, String str3, String str4, boolean z, boolean z2, int i, int i2, List list) {
        C135581e eVar = this.f369300a;
        C60870cx a = eVar.f369319d.mo112395a();
        C47637j d = C47638k.m84753d(a, eVar.f369317b);
        C135578b bVar = r1;
        C135578b bVar2 = new C135578b(eVar, a, str, str2, str3, str4, z, z2, i, i2, list);
        C46459k.m82829b(d.mo51521b(bVar, eVar.f369318c), "Failed to send footprints to the clearcut.", new Object[0]);
    }
}

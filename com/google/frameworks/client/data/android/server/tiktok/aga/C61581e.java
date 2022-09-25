package com.google.frameworks.client.data.android.server.tiktok.aga;

import com.google.android.libraries.search.p2476a.C32160b;
import com.google.android.libraries.search.p2476a.p2479c.C32204e;
import com.google.frameworks.client.data.android.p4641h.C61488i;
import java.util.Arrays;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70899n;
import p5488io.grpc.C70903r;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.aga.e */
/* compiled from: PG */
public final class C61581e {

    /* renamed from: a */
    public static final Status f166427a = Status.f186904b.withDescription("Primary account changed");

    /* renamed from: b */
    public final C32160b f166428b;

    /* renamed from: c */
    public final C32204e f166429c;

    public C61581e(C32160b bVar, C32204e eVar) {
        this.f166428b = bVar;
        this.f166429c = eVar;
    }

    /* renamed from: a */
    public final C70888j mo58133a(C70888j jVar) {
        return C70903r.m103829a(jVar, Arrays.asList(new C70899n[]{C61488i.m94204b(new C61578b(this))}));
    }
}

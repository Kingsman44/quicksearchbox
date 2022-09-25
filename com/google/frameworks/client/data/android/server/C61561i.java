package com.google.frameworks.client.data.android.server;

import android.content.ComponentName;
import android.os.Build;
import com.google.android.libraries.p3340w.C43210b;
import com.google.common.base.C58833ax;
import java.util.Map;
import p5460g.p5461a.C69464a;
import p5488io.grpc.C70888j;
import p5488io.grpc.binder.C70175a;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70234n;

/* renamed from: com.google.frameworks.client.data.android.server.i */
/* compiled from: PG */
public final class C61561i {

    /* renamed from: a */
    private final C61559g f166386a;

    /* renamed from: b */
    private final C58833ax f166387b;

    /* renamed from: c */
    private final C70229i f166388c;

    /* renamed from: d */
    private final String f166389d;

    /* renamed from: e */
    private final Map f166390e;

    /* renamed from: f */
    private final C69464a f166391f;

    public C61561i(C58833ax axVar, C70229i iVar, String str, Map map, C69464a aVar, C61559g gVar) {
        this.f166386a = gVar;
        this.f166387b = axVar;
        this.f166388c = iVar;
        this.f166389d = str;
        this.f166390e = map;
        this.f166391f = aVar;
    }

    /* renamed from: a */
    public final C70888j mo58123a(String str) {
        if (str.equals(this.f166389d) || "robolectric".equals(Build.FINGERPRINT)) {
            return (C70888j) this.f166391f.mo17428b();
        }
        C43210b.m76196a();
        return this.f166386a.mo58120a(C70175a.m102186a((ComponentName) this.f166390e.get(str)), C70234n.m102384a(), this.f166388c, this.f166387b);
    }
}

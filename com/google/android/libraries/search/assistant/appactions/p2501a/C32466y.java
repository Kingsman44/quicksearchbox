package com.google.android.libraries.search.assistant.appactions.p2501a;

import android.content.ComponentName;
import com.google.frameworks.client.data.android.server.tiktok.C61606u;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70286co;
import p5488io.grpc.binder.C70175a;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70235o;

/* renamed from: com.google.android.libraries.search.assistant.appactions.a.y */
/* compiled from: PG */
public final class C32466y {

    /* renamed from: a */
    private final C61606u f87004a;

    /* renamed from: b */
    private final C70235o f87005b;

    public C32466y(C61606u uVar, C70235o oVar) {
        C69664n.m101061g(oVar, "securityPolicy");
        this.f87004a = uVar;
        this.f87005b = oVar;
    }

    /* renamed from: a */
    public final C70286co mo38085a(String str, String str2) {
        C69664n.m101061g(str, "appPackage");
        C69664n.m101061g(str2, "targetClass");
        C61606u uVar = this.f87004a;
        C70286co a = uVar.f166475a.mo58125a(C70175a.m102186a(new ComponentName(str, str2)), this.f87005b, new C70229i(true, C70229i.f187211a.f187213c));
        C69664n.m101060f(a, "remoteEndpoints.create(\n…alues(true).build()\n    )");
        return a;
    }
}

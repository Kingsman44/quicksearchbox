package com.google.apps.tiktok.cache;

import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: com.google.apps.tiktok.cache.h */
/* compiled from: PG */
public final /* synthetic */ class C46393h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C46394i f121438a;

    /* renamed from: b */
    public final /* synthetic */ Map f121439b;

    public /* synthetic */ C46393h(C46394i iVar, Map map) {
        this.f121438a = iVar;
        this.f121439b = map;
    }

    public final Object call() {
        C46394i iVar = this.f121438a;
        Map map = this.f121439b;
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : map.entrySet()) {
            gzVar.mo55429h((MessageLite) entry.getKey(), (MessageLite) C60856cj.m92909r((Future) entry.getValue()));
        }
        C58495hd f = gzVar.mo55427f(true);
        synchronized (iVar.f121440a) {
            C46400o oVar = iVar.f121441b;
            long b = oVar.f121449a.mo26870b();
            for (Map.Entry entry2 : f.entrySet()) {
                oVar.mo50377e(new C46399n((MessageLite) entry2.getKey(), (MessageLite) entry2.getValue(), b));
            }
        }
        return null;
    }
}

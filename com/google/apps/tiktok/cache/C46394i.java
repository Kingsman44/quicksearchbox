package com.google.apps.tiktok.cache;

import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.cache.i */
/* compiled from: PG */
public final class C46394i implements C46407v {

    /* renamed from: a */
    public final Object f121440a = new Object();

    /* renamed from: b */
    public final C46400o f121441b;

    /* renamed from: c */
    private final Executor f121442c;

    private C46394i(Executor executor, long j, long j2, C21370a aVar) {
        this.f121442c = executor;
        this.f121441b = new C46400o(j, j2, aVar);
    }

    @Deprecated
    /* renamed from: a */
    public static C46407v m82709a(Executor executor, C46396k kVar, C21370a aVar) {
        return new C46394i(executor, kVar.mo50353b(), (long) kVar.mo50352a(), aVar);
    }

    /* renamed from: b */
    public final C60870cx mo50342b(MessageLite messageLite) {
        C60870cx i;
        synchronized (this.f121440a) {
            try {
                i = C60856cj.m92900i(this.f121441b.mo50374b(messageLite));
            } catch (Throwable th) {
                return C60856cj.m92899h(th);
            }
        }
        return i;
    }

    /* renamed from: c */
    public final C60870cx mo50343c() {
        C60870cx cxVar;
        synchronized (this.f121440a) {
            try {
                C46400o oVar = this.f121441b;
                oVar.f121450b.clear();
                oVar.f121451c = 0;
                cxVar = C60866ct.f164955a;
            } catch (Throwable th) {
                return C60856cj.m92899h(th);
            }
        }
        return cxVar;
    }

    /* renamed from: d */
    public final C60870cx mo50344d(MessageLite messageLite, C60870cx cxVar) {
        C46392g gVar = new C46392g(this, messageLite);
        return C60922j.m93044g(cxVar, C47810es.m84963c(gVar), this.f121442c);
    }

    /* renamed from: e */
    public final C60870cx mo50345e(MessageLite messageLite) {
        C60870cx i;
        synchronized (this.f121440a) {
            try {
                i = C60856cj.m92900i(this.f121441b.mo50375c(messageLite));
            } catch (Throwable th) {
                return C60856cj.m92899h(th);
            }
        }
        return i;
    }

    /* renamed from: f */
    public final C60870cx mo50346f(MessageLite messageLite, C60870cx cxVar) {
        C58838bb.m90869d(messageLite != null, "Cannot write to cache with a null key");
        return C60922j.m93044g(cxVar, C47810es.m84963c(C47810es.m84963c(new C46391f(this, messageLite))), this.f121442c);
    }

    /* renamed from: g */
    public final C60870cx mo50347g(Map map) {
        return C47638k.m84752c(map.values()).mo51520a(C47810es.m84978r(new C46393h(this, map)), this.f121442c);
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* renamed from: h */
    public final C60870cx mo50348h(MessageLite messageLite, C58817ah ahVar) {
        C58833ax axVar;
        C60870cx i;
        synchronized (this.f121440a) {
            try {
                C46400o oVar = this.f121441b;
                long b = oVar.f121449a.mo26870b();
                C58833ax j = C58833ax.m90833j((C46399n) oVar.f121450b.get(messageLite));
                C46386ax axVar2 = (C46386ax) ahVar.apply(j.mo56106b(C46397l.f121443a));
                if (axVar2.f121417a == null) {
                    axVar = j.mo56106b(C46398m.f121444a);
                } else {
                    oVar.mo50374b(messageLite);
                    C46399n a = oVar.mo50373a(messageLite, axVar2.f121417a, b);
                    oVar.mo50377e(a);
                    axVar = C58833ax.m90834k(a.mo50372a());
                }
                i = C60856cj.m92900i(axVar);
            } catch (Throwable th) {
                return C60856cj.m92899h(th);
            }
        }
        return i;
    }
}

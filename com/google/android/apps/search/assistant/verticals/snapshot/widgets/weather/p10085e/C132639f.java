package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.e.f */
/* compiled from: PG */
public final class C132639f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C132639f f361971e;

    /* renamed from: f */
    private static volatile C63010eb f361972f;

    /* renamed from: a */
    public int f361973a;

    /* renamed from: b */
    public C62971cq f361974b = emptyProtobufList();

    /* renamed from: c */
    public C63042fg f361975c;

    /* renamed from: d */
    public C62971cq f361976d = emptyProtobufList();

    static {
        C132639f fVar = new C132639f();
        f361971e = fVar;
        C62942bv.registerDefaultInstance(C132639f.class, fVar);
    }

    private C132639f() {
    }

    /* renamed from: a */
    public final void mo110846a() {
        C62971cq cqVar = this.f361974b;
        if (!cqVar.mo58948c()) {
            this.f361974b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo110847b() {
        C62971cq cqVar = this.f361976d;
        if (!cqVar.mo58948c()) {
            this.f361976d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f361971e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002ဉ\u0000\u0003\u001b\u0004\u001b", new Object[]{"a", C45240c.f118157a, "d", C132636c.class, "b", C132638e.class});
            case 3:
                return new C132639f();
            case 4:
                return new C132634a();
            case 5:
                return f361971e;
            case 6:
                C63010eb ebVar = f361972f;
                if (ebVar == null) {
                    synchronized (C132639f.class) {
                        ebVar = f361972f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f361971e);
                            f361972f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.apps.search.podcasts.p10590o;

import com.google.p4017at.p4082j.p4083a.C54432ed;
import com.google.p4017at.p4082j.p4083a.C54440el;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.o.w */
/* compiled from: PG */
public final class C140730w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C140730w f382160c;

    /* renamed from: d */
    private static volatile C63010eb f382161d;

    /* renamed from: a */
    public C62971cq f382162a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f382163b = emptyProtobufList();

    static {
        C140730w wVar = new C140730w();
        f382160c = wVar;
        C62942bv.registerDefaultInstance(C140730w.class, wVar);
    }

    private C140730w() {
    }

    /* renamed from: a */
    public final void mo115844a() {
        C62971cq cqVar = this.f382162a;
        if (!cqVar.mo58948c()) {
            this.f382162a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo115845b() {
        C62971cq cqVar = this.f382163b;
        if (!cqVar.mo58948c()) {
            this.f382163b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f382160c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C54440el.class, "b", C54432ed.class});
            case 3:
                return new C140730w();
            case 4:
                return new C140729v();
            case 5:
                return f382160c;
            case 6:
                C63010eb ebVar = f382161d;
                if (ebVar == null) {
                    synchronized (C140730w.class) {
                        ebVar = f382161d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f382160c);
                            f382161d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

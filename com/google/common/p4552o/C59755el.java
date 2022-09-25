package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.el */
/* compiled from: PG */
public final class C59755el extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59755el f161455d;

    /* renamed from: e */
    private static volatile C63010eb f161456e;

    /* renamed from: a */
    public int f161457a;

    /* renamed from: b */
    public String f161458b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f161459c = emptyProtobufList();

    static {
        C59755el elVar = new C59755el();
        f161455d = elVar;
        C62942bv.registerDefaultInstance(C59755el.class, elVar);
    }

    private C59755el() {
    }

    /* renamed from: a */
    public final void mo57055a() {
        C62971cq cqVar = this.f161459c;
        if (!cqVar.mo58948c()) {
            this.f161459c = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f161455d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C59757en.class});
            case 3:
                return new C59755el();
            case 4:
                return new C59754ek();
            case 5:
                return f161455d;
            case 6:
                C63010eb ebVar = f161456e;
                if (ebVar == null) {
                    synchronized (C59755el.class) {
                        ebVar = f161456e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161455d);
                            f161456e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.libraries.appdoctor.p575c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.appdoctor.c.f */
/* compiled from: PG */
public final class C10474f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C10474f f35237b;

    /* renamed from: c */
    private static volatile C63010eb f35238c;

    /* renamed from: a */
    public C62971cq f35239a = emptyProtobufList();

    static {
        C10474f fVar = new C10474f();
        f35237b = fVar;
        C62942bv.registerDefaultInstance(C10474f.class, fVar);
    }

    private C10474f() {
    }

    /* renamed from: a */
    public final void mo18508a() {
        C62971cq cqVar = this.f35239a;
        if (!cqVar.mo58948c()) {
            this.f35239a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f35237b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C10471c.class});
            case 3:
                return new C10474f();
            case 4:
                return new C10469a();
            case 5:
                return f35237b;
            case 6:
                C63010eb ebVar = f35238c;
                if (ebVar == null) {
                    synchronized (C10474f.class) {
                        ebVar = f35238c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f35237b);
                            f35238c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

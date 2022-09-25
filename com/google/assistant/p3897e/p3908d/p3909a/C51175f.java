package com.google.assistant.p3897e.p3908d.p3909a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.d.a.f */
/* compiled from: PG */
public final class C51175f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51175f f133205f;

    /* renamed from: g */
    private static volatile C63010eb f133206g;

    /* renamed from: a */
    public int f133207a;

    /* renamed from: b */
    public int f133208b;

    /* renamed from: c */
    public C62961ch f133209c = emptyIntList();

    /* renamed from: d */
    public C62961ch f133210d = emptyIntList();

    /* renamed from: e */
    public C62961ch f133211e = emptyIntList();

    static {
        C51175f fVar = new C51175f();
        f133205f = fVar;
        C62942bv.registerDefaultInstance(C51175f.class, fVar);
    }

    private C51175f() {
    }

    /* renamed from: a */
    public final void mo53534a() {
        C62961ch chVar = this.f133209c;
        if (!chVar.mo58948c()) {
            this.f133209c = C62942bv.mutableCopy(chVar);
        }
    }

    /* renamed from: b */
    public final void mo53535b() {
        C62961ch chVar = this.f133210d;
        if (!chVar.mo58948c()) {
            this.f133210d = C62942bv.mutableCopy(chVar);
        }
    }

    /* renamed from: c */
    public final void mo53536c() {
        C62961ch chVar = this.f133211e;
        if (!chVar.mo58948c()) {
            this.f133211e = C62942bv.mutableCopy(chVar);
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
                return newMessageInfo(f133205f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001င\u0000\u0002\u0016\u0003\u0016\u0004\u0016", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C51175f();
            case 4:
                return new C51174e();
            case 5:
                return f133205f;
            case 6:
                C63010eb ebVar = f133206g;
                if (ebVar == null) {
                    synchronized (C51175f.class) {
                        ebVar = f133206g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133205f);
                            f133206g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

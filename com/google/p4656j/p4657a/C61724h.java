package com.google.p4656j.p4657a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.j.a.h */
/* compiled from: PG */
public final class C61724h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C61724h f166754f;

    /* renamed from: h */
    private static volatile C63010eb f166755h;

    /* renamed from: a */
    public long f166756a;

    /* renamed from: b */
    public long f166757b;

    /* renamed from: c */
    public long f166758c;

    /* renamed from: d */
    public C62971cq f166759d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f166760e = emptyProtobufList();

    /* renamed from: g */
    private int f166761g;

    static {
        C61724h hVar = new C61724h();
        f166754f = hVar;
        C62942bv.registerDefaultInstance(C61724h.class, hVar);
    }

    private C61724h() {
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
                return newMessageInfo(f166754f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004\u001c\u0005\u001b", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e", C61722f.class});
            case 3:
                return new C61724h();
            case 4:
                return new C61723g();
            case 5:
                return f166754f;
            case 6:
                C63010eb ebVar = f166755h;
                if (ebVar == null) {
                    synchronized (C61724h.class) {
                        ebVar = f166755h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166754f);
                            f166755h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

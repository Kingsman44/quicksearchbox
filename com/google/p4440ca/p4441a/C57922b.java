package com.google.p4440ca.p4441a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p417d.p418a.C8541au;
import com.google.p395al.p417d.p418a.C8592s;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ca.a.b */
/* compiled from: PG */
public final class C57922b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C57922b f154923g;

    /* renamed from: h */
    private static volatile C63010eb f154924h;

    /* renamed from: a */
    public int f154925a;

    /* renamed from: b */
    public C8592s f154926b;

    /* renamed from: c */
    public int f154927c;

    /* renamed from: d */
    public C62961ch f154928d = emptyIntList();

    /* renamed from: e */
    public C62971cq f154929e = emptyProtobufList();

    /* renamed from: f */
    public int f154930f;

    static {
        C57922b bVar = new C57922b();
        f154923g = bVar;
        C62942bv.registerDefaultInstance(C57922b.class, bVar);
    }

    private C57922b() {
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
                return newMessageInfo(f154923g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002င\u0001\u0003\u0016\u0004\u001b\u0005င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C8541au.class, C10662f.f35572a});
            case 3:
                return new C57922b();
            case 4:
                return new C57921a();
            case 5:
                return f154923g;
            case 6:
                C63010eb ebVar = f154924h;
                if (ebVar == null) {
                    synchronized (C57922b.class) {
                        ebVar = f154924h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154923g);
                            f154924h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

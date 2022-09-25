package com.google.android.libraries.search.assistant.p2566g;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.g.i */
/* compiled from: PG */
public final class C33414i extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C33414i f89489h;

    /* renamed from: i */
    private static volatile C63010eb f89490i;

    /* renamed from: a */
    public int f89491a;

    /* renamed from: b */
    public C62971cq f89492b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f89493c = emptyProtobufList();

    /* renamed from: d */
    public int f89494d;

    /* renamed from: e */
    public long f89495e;

    /* renamed from: f */
    public C33411f f89496f;

    /* renamed from: g */
    public C33411f f89497g;

    static {
        C33414i iVar = new C33414i();
        f89489h = iVar;
        C62942bv.registerDefaultInstance(C33414i.class, iVar);
    }

    private C33414i() {
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
                return newMessageInfo(f89489h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003င\u0000\u0004ဂ\u0001\u0005ဉ\u0002\u0006ဉ\u0003", new Object[]{"a", "b", C33413h.class, C45240c.f118157a, C33409d.class, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C33414i();
            case 4:
                return new C33393a();
            case 5:
                return f89489h;
            case 6:
                C63010eb ebVar = f89490i;
                if (ebVar == null) {
                    synchronized (C33414i.class) {
                        ebVar = f89490i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89489h);
                            f89490i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

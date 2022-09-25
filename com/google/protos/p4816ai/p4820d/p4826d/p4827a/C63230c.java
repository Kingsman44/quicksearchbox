package com.google.protos.p4816ai.p4820d.p4826d.p4827a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4701g.C62331d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.d.a.c */
/* compiled from: PG */
public final class C63230c extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63230c f170826f;

    /* renamed from: g */
    private static volatile C63010eb f170827g;

    /* renamed from: a */
    public int f170828a;

    /* renamed from: b */
    public int f170829b;

    /* renamed from: c */
    public boolean f170830c;

    /* renamed from: d */
    public C62971cq f170831d = emptyProtobufList();

    /* renamed from: e */
    public C63240m f170832e;

    static {
        C63230c cVar = new C63230c();
        f170826f = cVar;
        C62942bv.registerDefaultInstance(C63230c.class, cVar);
    }

    private C63230c() {
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
                return newMessageInfo(f170826f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"a", "b", C62331d.m94768b(), C45240c.f118157a, "d", C63232e.class, "e"});
            case 3:
                return new C63230c();
            case 4:
                return new C63229b();
            case 5:
                return f170826f;
            case 6:
                C63010eb ebVar = f170827g;
                if (ebVar == null) {
                    synchronized (C63230c.class) {
                        ebVar = f170827g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170826f);
                            f170827g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.cn */
/* compiled from: PG */
public final class C57416cn extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C57416cn f153384f;

    /* renamed from: g */
    private static volatile C63010eb f153385g;

    /* renamed from: a */
    public int f153386a;

    /* renamed from: b */
    public String f153387b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f153388c = emptyProtobufList();

    /* renamed from: d */
    public int f153389d;

    /* renamed from: e */
    public int f153390e;

    static {
        C57416cn cnVar = new C57416cn();
        f153384f = cnVar;
        C62942bv.registerDefaultInstance(C57416cn.class, cnVar);
    }

    private C57416cn() {
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
                return newMessageInfo(f153384f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0004င\u0001\u0005င\u0002", new Object[]{"a", "b", C45240c.f118157a, C57430da.class, "d", "e"});
            case 3:
                return new C57416cn();
            case 4:
                return new C57415cm();
            case 5:
                return f153384f;
            case 6:
                C63010eb ebVar = f153385g;
                if (ebVar == null) {
                    synchronized (C57416cn.class) {
                        ebVar = f153385g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153384f);
                            f153385g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

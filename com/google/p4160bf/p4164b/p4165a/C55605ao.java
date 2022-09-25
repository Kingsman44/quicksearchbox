package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.ao */
/* compiled from: PG */
public final class C55605ao extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55605ao f146709f;

    /* renamed from: g */
    private static volatile C63010eb f146710g;

    /* renamed from: a */
    public int f146711a;

    /* renamed from: b */
    public String f146712b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f146713c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62971cq f146714d = emptyProtobufList();

    /* renamed from: e */
    public C55543aw f146715e;

    static {
        C55605ao aoVar = new C55605ao();
        f146709f = aoVar;
        C62942bv.registerDefaultInstance(C55605ao.class, aoVar);
    }

    private C55605ao() {
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
                return newMessageInfo(f146709f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001b\u0004ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d", C55657cm.class, "e"});
            case 3:
                return new C55605ao();
            case 4:
                return new C55604an();
            case 5:
                return f146709f;
            case 6:
                C63010eb ebVar = f146710g;
                if (ebVar == null) {
                    synchronized (C55605ao.class) {
                        ebVar = f146710g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146709f);
                            f146710g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

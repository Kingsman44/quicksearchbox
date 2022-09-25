package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aef */
/* compiled from: PG */
public final class aef extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aef f158453e;

    /* renamed from: f */
    private static volatile C63010eb f158454f;

    /* renamed from: a */
    public int f158455a;

    /* renamed from: b */
    public String f158456b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f158457c;

    /* renamed from: d */
    public C62971cq f158458d = emptyProtobufList();

    static {
        aef aef = new aef();
        f158453e = aef;
        C62942bv.registerDefaultInstance(aef.class, aef);
    }

    private aef() {
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
                return newMessageInfo(f158453e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002က\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", aee.class});
            case 3:
                return new aef();
            case 4:
                return new aec();
            case 5:
                return f158453e;
            case 6:
                C63010eb ebVar = f158454f;
                if (ebVar == null) {
                    synchronized (aef.class) {
                        ebVar = f158454f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158453e);
                            f158454f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

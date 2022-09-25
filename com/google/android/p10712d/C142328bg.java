package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.bg */
/* compiled from: PG */
public final class C142328bg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C142328bg f386139f;

    /* renamed from: g */
    private static volatile C63010eb f386140g;

    /* renamed from: a */
    public int f386141a;

    /* renamed from: b */
    public C62971cq f386142b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C142355cg f386143c;

    /* renamed from: d */
    public C62971cq f386144d;

    /* renamed from: e */
    public String f386145e;

    static {
        C142328bg bgVar = new C142328bg();
        f386139f = bgVar;
        C62942bv.registerDefaultInstance(C142328bg.class, bgVar);
    }

    private C142328bg() {
        C62942bv.emptyProtobufList();
        this.f386144d = C62942bv.emptyProtobufList();
        this.f386145e = BuildConfig.FLAVOR;
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
                return newMessageInfo(f386139f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001\u001a\u0003ဉ\u0000\u0004\u001a\u0005ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C142328bg();
            case 4:
                return new C142327bf();
            case 5:
                return f386139f;
            case 6:
                C63010eb ebVar = f386140g;
                if (ebVar == null) {
                    synchronized (C142328bg.class) {
                        ebVar = f386140g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386139f);
                            f386140g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

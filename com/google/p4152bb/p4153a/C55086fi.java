package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.fi */
/* compiled from: PG */
public final class C55086fi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55086fi f144949b;

    /* renamed from: d */
    private static volatile C63010eb f144950d;

    /* renamed from: a */
    public String f144951a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f144952c;

    static {
        C55086fi fiVar = new C55086fi();
        f144949b = fiVar;
        C62942bv.registerDefaultInstance(C55086fi.class, fiVar);
    }

    private C55086fi() {
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
                return newMessageInfo(f144949b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C55086fi();
            case 4:
                return new C55085fh();
            case 5:
                return f144949b;
            case 6:
                C63010eb ebVar = f144950d;
                if (ebVar == null) {
                    synchronized (C55086fi.class) {
                        ebVar = f144950d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144949b);
                            f144950d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

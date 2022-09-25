package com.google.assistant.p3861at;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.wz */
/* compiled from: PG */
public final class C50435wz extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50435wz f131253e;

    /* renamed from: g */
    private static volatile C63010eb f131254g;

    /* renamed from: a */
    public int f131255a;

    /* renamed from: b */
    public C50434wy f131256b;

    /* renamed from: c */
    public C50434wy f131257c;

    /* renamed from: d */
    public C50434wy f131258d;

    /* renamed from: f */
    private int f131259f;

    static {
        C50435wz wzVar = new C50435wz();
        f131253e = wzVar;
        C62942bv.registerDefaultInstance(C50435wz.class, wzVar);
    }

    private C50435wz() {
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
                return newMessageInfo(f131253e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{C10662f.f35572a, "a", C50429wt.f131247a, "b", C45240c.f118157a, "d"});
            case 3:
                return new C50435wz();
            case 4:
                return new C50428ws();
            case 5:
                return f131253e;
            case 6:
                C63010eb ebVar = f131254g;
                if (ebVar == null) {
                    synchronized (C50435wz.class) {
                        ebVar = f131254g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131253e);
                            f131254g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

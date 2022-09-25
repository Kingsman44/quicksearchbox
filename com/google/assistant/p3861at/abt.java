package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.abt */
/* compiled from: PG */
public final class abt extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final abt f128804g;

    /* renamed from: h */
    private static volatile C63010eb f128805h;

    /* renamed from: a */
    public int f128806a;

    /* renamed from: b */
    public aaz f128807b;

    /* renamed from: c */
    public String f128808c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f128809d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f128810e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f128811f = BuildConfig.FLAVOR;

    static {
        abt abt = new abt();
        f128804g = abt;
        C62942bv.registerDefaultInstance(abt.class, abt);
    }

    private abt() {
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
                return newMessageInfo(f128804g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0003\u0003ဈ\u0004\u0004ဈ\u0001\u0006ဈ\u0005", new Object[]{"a", "b", "d", "e", C45240c.f118157a, C10662f.f35572a});
            case 3:
                return new abt();
            case 4:
                return new abs();
            case 5:
                return f128804g;
            case 6:
                C63010eb ebVar = f128805h;
                if (ebVar == null) {
                    synchronized (abt.class) {
                        ebVar = f128805h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128804g);
                            f128805h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

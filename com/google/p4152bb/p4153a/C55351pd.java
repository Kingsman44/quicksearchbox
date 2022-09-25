package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bb.a.pd */
/* compiled from: PG */
public final class C55351pd extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55351pd f145839f;

    /* renamed from: g */
    private static volatile C63010eb f145840g;

    /* renamed from: a */
    public int f145841a;

    /* renamed from: b */
    public String f145842b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f145843c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f145844d;

    /* renamed from: e */
    public boolean f145845e;

    static {
        C55351pd pdVar = new C55351pd();
        f145839f = pdVar;
        C62942bv.registerDefaultInstance(C55351pd.class, pdVar);
    }

    private C55351pd() {
        C63088z zVar = C63088z.f170246b;
        emptyProtobufList();
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
                return newMessageInfo(f145839f, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\tဇ\u0004\nဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C55351pd();
            case 4:
                return new C55350pc();
            case 5:
                return f145839f;
            case 6:
                C63010eb ebVar = f145840g;
                if (ebVar == null) {
                    synchronized (C55351pd.class) {
                        ebVar = f145840g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145839f);
                            f145840g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.mf */
/* compiled from: PG */
public final class C51560mf extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51560mf f134382g;

    /* renamed from: h */
    private static volatile C63010eb f134383h;

    /* renamed from: a */
    public int f134384a;

    /* renamed from: b */
    public String f134385b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f134386c;

    /* renamed from: d */
    public long f134387d;

    /* renamed from: e */
    public long f134388e;

    /* renamed from: f */
    public C62971cq f134389f = emptyProtobufList();

    static {
        C51560mf mfVar = new C51560mf();
        f134382g = mfVar;
        C62942bv.registerDefaultInstance(C51560mf.class, mfVar);
    }

    private C51560mf() {
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
                return newMessageInfo(f134382g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"a", "b", C45240c.f118157a, C51559me.m86217b(), "d", "e", C10662f.f35572a, C51564mj.class});
            case 3:
                return new C51560mf();
            case 4:
                return new C51557mc();
            case 5:
                return f134382g;
            case 6:
                C63010eb ebVar = f134383h;
                if (ebVar == null) {
                    synchronized (C51560mf.class) {
                        ebVar = f134383h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134382g);
                            f134383h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

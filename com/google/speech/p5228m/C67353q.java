package com.google.speech.p5228m;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.q */
/* compiled from: PG */
public final class C67353q extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67353q f183075e;

    /* renamed from: f */
    private static volatile C63010eb f183076f;

    /* renamed from: a */
    public int f183077a;

    /* renamed from: b */
    public String f183078b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f183079c;

    /* renamed from: d */
    public long f183080d;

    static {
        C67353q qVar = new C67353q();
        f183075e = qVar;
        C62942bv.registerDefaultInstance(C67353q.class, qVar);
    }

    private C67353q() {
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
                return newMessageInfo(f183075e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C67353q();
            case 4:
                return new C67352p();
            case 5:
                return f183075e;
            case 6:
                C63010eb ebVar = f183076f;
                if (ebVar == null) {
                    synchronized (C67353q.class) {
                        ebVar = f183076f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183075e);
                            f183076f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

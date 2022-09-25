package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.iq */
/* compiled from: PG */
public final class C52192iq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52192iq f136983d;

    /* renamed from: e */
    private static volatile C63010eb f136984e;

    /* renamed from: a */
    public int f136985a;

    /* renamed from: b */
    public C52428rj f136986b;

    /* renamed from: c */
    public long f136987c;

    static {
        C52192iq iqVar = new C52192iq();
        f136983d = iqVar;
        C62942bv.registerDefaultInstance(C52192iq.class, iqVar);
    }

    private C52192iq() {
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
                return newMessageInfo(f136983d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52192iq();
            case 4:
                return new C52191ip();
            case 5:
                return f136983d;
            case 6:
                C63010eb ebVar = f136984e;
                if (ebVar == null) {
                    synchronized (C52192iq.class) {
                        ebVar = f136984e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136983d);
                            f136984e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

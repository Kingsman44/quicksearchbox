package com.google.assistant.p3861at;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aem */
/* compiled from: PG */
public final class aem extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aem f129110e;

    /* renamed from: g */
    private static volatile C63010eb f129111g;

    /* renamed from: a */
    public ael f129112a;

    /* renamed from: b */
    public ael f129113b;

    /* renamed from: c */
    public ael f129114c;

    /* renamed from: d */
    public ael f129115d;

    /* renamed from: f */
    private int f129116f;

    static {
        aem aem = new aem();
        f129110e = aem;
        C62942bv.registerDefaultInstance(aem.class, aem);
    }

    private aem() {
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
                return newMessageInfo(f129110e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new aem();
            case 4:
                return new aeh();
            case 5:
                return f129110e;
            case 6:
                C63010eb ebVar = f129111g;
                if (ebVar == null) {
                    synchronized (aem.class) {
                        ebVar = f129111g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129110e);
                            f129111g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

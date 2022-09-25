package com.google.speech.p5208h;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.h.do */
/* compiled from: PG */
public final class C66648do extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66648do f181316e;

    /* renamed from: g */
    private static volatile C63010eb f181317g;

    /* renamed from: a */
    public int f181318a;

    /* renamed from: b */
    public float f181319b;

    /* renamed from: c */
    public boolean f181320c;

    /* renamed from: d */
    public C62961ch f181321d = emptyIntList();

    /* renamed from: f */
    private C66646dm f181322f;

    static {
        C66648do doVar = new C66648do();
        f181316e = doVar;
        C62942bv.registerDefaultInstance(C66648do.class, doVar);
    }

    private C66648do() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(f181316e, "\u0001\u0004\u0000\u0001\u0001\r\u0004\u0000\u0001\u0000\u0001ခ\u0000\u0002ဇ\u0001\b\u001e\rဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C66686t.m97301b(), C10662f.f35572a});
            case 3:
                return new C66648do();
            case 4:
                return new C66647dn();
            case 5:
                return f181316e;
            case 6:
                C63010eb ebVar = f181317g;
                if (ebVar == null) {
                    synchronized (C66648do.class) {
                        ebVar = f181317g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181316e);
                            f181317g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

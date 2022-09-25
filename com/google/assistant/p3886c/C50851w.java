package com.google.assistant.p3886c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.c.w */
/* compiled from: PG */
public final class C50851w extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50851w f132415e;

    /* renamed from: f */
    private static volatile C63010eb f132416f;

    /* renamed from: a */
    public int f132417a;

    /* renamed from: b */
    public C62971cq f132418b = emptyProtobufList();

    /* renamed from: c */
    public C63042fg f132419c;

    /* renamed from: d */
    public C62995dn f132420d = C62995dn.f170057a;

    static {
        C50851w wVar = new C50851w();
        f132415e = wVar;
        C62942bv.registerDefaultInstance(C50851w.class, wVar);
    }

    private C50851w() {
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
                return newMessageInfo(f132415e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u00032", new Object[]{"a", "b", C50850v.class, C45240c.f118157a, "d", C50848t.f132406a});
            case 3:
                return new C50851w();
            case 4:
                return new C50847s();
            case 5:
                return f132415e;
            case 6:
                C63010eb ebVar = f132416f;
                if (ebVar == null) {
                    synchronized (C50851w.class) {
                        ebVar = f132416f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132415e);
                            f132416f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

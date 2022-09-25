package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.fc */
/* compiled from: PG */
public final class C52097fc extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52097fc f136720f;

    /* renamed from: g */
    private static volatile C63010eb f136721g;

    /* renamed from: a */
    public C62971cq f136722a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f136723b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C62971cq f136724c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62995dn f136725d = C62995dn.f170057a;

    /* renamed from: e */
    public C62995dn f136726e = C62995dn.f170057a;

    static {
        C52097fc fcVar = new C52097fc();
        f136720f = fcVar;
        C62942bv.registerDefaultInstance(C52097fc.class, fcVar);
    }

    private C52097fc() {
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
                return newMessageInfo(f136720f, "\u0001\u0005\u0000\u0000\u0001\u0005\u0005\u0002\u0003\u0000\u0001\u001a\u0002\u001a\u0003\u001a\u00042\u00052", new Object[]{"a", "b", C45240c.f118157a, "d", C52096fb.f136719a, "e", C52095fa.f136718a});
            case 3:
                return new C52097fc();
            case 4:
                return new C52093ez();
            case 5:
                return f136720f;
            case 6:
                C63010eb ebVar = f136721g;
                if (ebVar == null) {
                    synchronized (C52097fc.class) {
                        ebVar = f136721g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136720f);
                            f136721g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.common.p4552o.p4553a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80251f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.bl */
/* compiled from: PG */
public final class C59488bl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59488bl f157829c;

    /* renamed from: d */
    private static volatile C63010eb f157830d;

    /* renamed from: a */
    public C62961ch f157831a = emptyIntList();

    /* renamed from: b */
    public C62961ch f157832b = emptyIntList();

    static {
        C59488bl blVar = new C59488bl();
        f157829c = blVar;
        C62942bv.registerDefaultInstance(C59488bl.class, blVar);
    }

    private C59488bl() {
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
                return newMessageInfo(f157829c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001e", new Object[]{"a", C80251f.m128107b(), "b", C80251f.m128107b()});
            case 3:
                return new C59488bl();
            case 4:
                return new C59487bk();
            case 5:
                return f157829c;
            case 6:
                C63010eb ebVar = f157830d;
                if (ebVar == null) {
                    synchronized (C59488bl.class) {
                        ebVar = f157830d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157829c);
                            f157830d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

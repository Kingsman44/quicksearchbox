package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.e */
/* compiled from: PG */
public final class C80348e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80348e f220469b;

    /* renamed from: c */
    private static volatile C63010eb f220470c;

    /* renamed from: a */
    public C62995dn f220471a = C62995dn.f170057a;

    static {
        C80348e eVar = new C80348e();
        f220469b = eVar;
        C62942bv.registerDefaultInstance(C80348e.class, eVar);
    }

    private C80348e() {
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
                return newMessageInfo(f220469b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C80347d.f220468a});
            case 3:
                return new C80348e();
            case 4:
                return new C80332c();
            case 5:
                return f220469b;
            case 6:
                C63010eb ebVar = f220470c;
                if (ebVar == null) {
                    synchronized (C80348e.class) {
                        ebVar = f220470c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220469b);
                            f220470c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

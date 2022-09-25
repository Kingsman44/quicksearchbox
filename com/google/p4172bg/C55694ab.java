package com.google.p4172bg;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.ab */
/* compiled from: PG */
public final class C55694ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55694ab f146930c;

    /* renamed from: d */
    private static volatile C63010eb f146931d;

    /* renamed from: a */
    public C62995dn f146932a = C62995dn.f170057a;

    /* renamed from: b */
    public String f146933b = BuildConfig.FLAVOR;

    static {
        C55694ab abVar = new C55694ab();
        f146930c = abVar;
        C62942bv.registerDefaultInstance(C55694ab.class, abVar);
    }

    private C55694ab() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f146930c, "\u0000\u0002\u0000\u0000\u0001\u0005\u0002\u0001\u0000\u0000\u00012\u0005Ȉ", new Object[]{"a", C55693aa.f146929a, "b"});
            case 3:
                return new C55694ab();
            case 4:
                return new C55765z();
            case 5:
                return f146930c;
            case 6:
                C63010eb ebVar = f146931d;
                if (ebVar == null) {
                    synchronized (C55694ab.class) {
                        ebVar = f146931d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146930c);
                            f146931d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

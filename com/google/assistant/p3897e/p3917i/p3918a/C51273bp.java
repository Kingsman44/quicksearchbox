package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.bp */
/* compiled from: PG */
public final class C51273bp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51273bp f133483c;

    /* renamed from: d */
    private static volatile C63010eb f133484d;

    /* renamed from: a */
    public int f133485a;

    /* renamed from: b */
    public String f133486b = BuildConfig.FLAVOR;

    static {
        C51273bp bpVar = new C51273bp();
        f133483c = bpVar;
        C62942bv.registerDefaultInstance(C51273bp.class, bpVar);
    }

    private C51273bp() {
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
                return newMessageInfo(f133483c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51273bp();
            case 4:
                return new C51272bo();
            case 5:
                return f133483c;
            case 6:
                C63010eb ebVar = f133484d;
                if (ebVar == null) {
                    synchronized (C51273bp.class) {
                        ebVar = f133484d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133483c);
                            f133484d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

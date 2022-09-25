package com.google.assistant.p3897e.p3902c.p3903a.p3904a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.a.a.d */
/* compiled from: PG */
public final class C50901d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50901d f132529b;

    /* renamed from: d */
    private static volatile C63010eb f132530d;

    /* renamed from: a */
    public String f132531a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f132532c;

    static {
        C50901d dVar = new C50901d();
        f132529b = dVar;
        C62942bv.registerDefaultInstance(C50901d.class, dVar);
    }

    private C50901d() {
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
                return newMessageInfo(f132529b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50901d();
            case 4:
                return new C50900c();
            case 5:
                return f132529b;
            case 6:
                C63010eb ebVar = f132530d;
                if (ebVar == null) {
                    synchronized (C50901d.class) {
                        ebVar = f132530d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132529b);
                            f132530d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

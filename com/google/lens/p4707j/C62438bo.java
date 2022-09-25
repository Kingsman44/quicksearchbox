package com.google.lens.p4707j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.bo */
/* compiled from: PG */
public final class C62438bo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62438bo f168599c;

    /* renamed from: d */
    private static volatile C63010eb f168600d;

    /* renamed from: a */
    public int f168601a;

    /* renamed from: b */
    public String f168602b = BuildConfig.FLAVOR;

    static {
        C62438bo boVar = new C62438bo();
        f168599c = boVar;
        C62942bv.registerDefaultInstance(C62438bo.class, boVar);
    }

    private C62438bo() {
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
                return newMessageInfo(f168599c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62438bo();
            case 4:
                return new C62437bn();
            case 5:
                return f168599c;
            case 6:
                C63010eb ebVar = f168600d;
                if (ebVar == null) {
                    synchronized (C62438bo.class) {
                        ebVar = f168600d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168599c);
                            f168600d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.dl */
/* compiled from: PG */
public final class C14282dl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14282dl f43195b;

    /* renamed from: d */
    private static volatile C63010eb f43196d;

    /* renamed from: a */
    public C123746bm f43197a;

    /* renamed from: c */
    private byte f43198c = 2;

    static {
        C14282dl dlVar = new C14282dl();
        f43195b = dlVar;
        C62942bv.registerDefaultInstance(C14282dl.class, dlVar);
    }

    private C14282dl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43198c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f43198c = b;
                return null;
            case 2:
                return newMessageInfo(f43195b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C14282dl();
            case 4:
                return new C14281dk();
            case 5:
                return f43195b;
            case 6:
                C63010eb ebVar = f43196d;
                if (ebVar == null) {
                    synchronized (C14282dl.class) {
                        ebVar = f43196d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43195b);
                            f43196d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

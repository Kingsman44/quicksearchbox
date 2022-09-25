package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.b.c.ac */
/* compiled from: PG */
public final class C17036ac extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C17036ac f49640d;

    /* renamed from: f */
    private static volatile C63010eb f49641f;

    /* renamed from: a */
    public int f49642a;

    /* renamed from: b */
    public String f49643b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f49644c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f49645e = 2;

    static {
        C17036ac acVar = new C17036ac();
        f49640d = acVar;
        C62942bv.registerDefaultInstance(C17036ac.class, acVar);
    }

    private C17036ac() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f49645e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f49645e = b;
                return null;
            case 2:
                return newMessageInfo(f49640d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C17036ac();
            case 4:
                return new C17035ab();
            case 5:
                return f49640d;
            case 6:
                C63010eb ebVar = f49641f;
                if (ebVar == null) {
                    synchronized (C17036ac.class) {
                        ebVar = f49641f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49640d);
                            f49641f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

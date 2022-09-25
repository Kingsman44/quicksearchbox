package com.google.android.libraries.search.assistant.p2566g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50544l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.g.y */
/* compiled from: PG */
public final class C33430y extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C33430y f89529d;

    /* renamed from: f */
    private static volatile C63010eb f89530f;

    /* renamed from: a */
    public int f89531a;

    /* renamed from: b */
    public String f89532b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C50544l f89533c;

    /* renamed from: e */
    private byte f89534e = 2;

    static {
        C33430y yVar = new C33430y();
        f89529d = yVar;
        C62942bv.registerDefaultInstance(C33430y.class, yVar);
    }

    private C33430y() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f89534e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f89534e = b;
                return null;
            case 2:
                return newMessageInfo(f89529d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C33430y();
            case 4:
                return new C33429x();
            case 5:
                return f89529d;
            case 6:
                C63010eb ebVar = f89530f;
                if (ebVar == null) {
                    synchronized (C33430y.class) {
                        ebVar = f89530f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89529d);
                            f89530f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

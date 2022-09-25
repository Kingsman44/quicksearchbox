package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.aa */
/* compiled from: PG */
public final class C12969aa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C12969aa f40337e;

    /* renamed from: g */
    private static volatile C63010eb f40338g;

    /* renamed from: a */
    public int f40339a;

    /* renamed from: b */
    public int f40340b = 0;

    /* renamed from: c */
    public Object f40341c;

    /* renamed from: d */
    public boolean f40342d;

    /* renamed from: f */
    private byte f40343f = 2;

    static {
        C12969aa aaVar = new C12969aa();
        f40337e = aaVar;
        C62942bv.registerDefaultInstance(C12969aa.class, aaVar);
    }

    private C12969aa() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f40343f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f40343f = b;
                return null;
            case 2:
                return newMessageInfo(f40337e, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ျ\u0000\u0003်\u0000\u0004ဇ\u0003\u0005ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C16330ad.class});
            case 3:
                return new C12969aa();
            case 4:
                return new C13008z();
            case 5:
                return f40337e;
            case 6:
                C63010eb ebVar = f40338g;
                if (ebVar == null) {
                    synchronized (C12969aa.class) {
                        ebVar = f40338g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40337e);
                            f40338g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

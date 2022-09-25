package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.d */
/* compiled from: PG */
public final class C34684d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C34684d f92090g;

    /* renamed from: i */
    private static volatile C63010eb f92091i;

    /* renamed from: a */
    public int f92092a;

    /* renamed from: b */
    public int f92093b;

    /* renamed from: c */
    public C34038ba f92094c;

    /* renamed from: d */
    public boolean f92095d;

    /* renamed from: e */
    public C34697g f92096e;

    /* renamed from: f */
    public C34660b f92097f;

    /* renamed from: h */
    private byte f92098h = 2;

    static {
        C34684d dVar = new C34684d();
        f92090g = dVar;
        C62942bv.registerDefaultInstance(C34684d.class, dVar);
    }

    private C34684d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f92098h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f92098h = b;
                return null;
            case 2:
                return newMessageInfo(f92090g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C34043bf.m62693b(), C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C34684d();
            case 4:
                return new C34666c();
            case 5:
                return f92090g;
            case 6:
                C63010eb ebVar = f92091i;
                if (ebVar == null) {
                    synchronized (C34684d.class) {
                        ebVar = f92091i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92090g);
                            f92091i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.p427am.p432b.p433a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.bh */
/* compiled from: PG */
public final class C8656bh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8656bh f29949f;

    /* renamed from: g */
    private static volatile C63010eb f29950g;

    /* renamed from: a */
    public boolean f29951a;

    /* renamed from: b */
    public boolean f29952b;

    /* renamed from: c */
    public boolean f29953c;

    /* renamed from: d */
    public boolean f29954d;

    /* renamed from: e */
    public boolean f29955e;

    static {
        C8656bh bhVar = new C8656bh();
        f29949f = bhVar;
        C62942bv.registerDefaultInstance(C8656bh.class, bhVar);
    }

    private C8656bh() {
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
                return newMessageInfo(f29949f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C8656bh();
            case 4:
                return new C8655bg();
            case 5:
                return f29949f;
            case 6:
                C63010eb ebVar = f29950g;
                if (ebVar == null) {
                    synchronized (C8656bh.class) {
                        ebVar = f29950g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29949f);
                            f29950g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

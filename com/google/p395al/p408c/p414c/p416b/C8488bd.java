package com.google.p395al.p408c.p414c.p416b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4934ay.p4935a.p4936a.C64272b;
import com.google.speech.p5204e.C66498i;

/* renamed from: com.google.al.c.c.b.bd */
/* compiled from: PG */
public final class C8488bd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f29448c = new C8486bb();

    /* renamed from: d */
    public static final C8488bd f29449d;

    /* renamed from: f */
    private static volatile C63010eb f29450f;

    /* renamed from: a */
    public int f29451a;

    /* renamed from: b */
    public C62961ch f29452b = emptyIntList();

    /* renamed from: e */
    private int f29453e;

    static {
        C8488bd bdVar = new C8488bd();
        f29449d = bdVar;
        C62942bv.registerDefaultInstance(C8488bd.class, bdVar);
    }

    private C8488bd() {
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
                return newMessageInfo(f29449d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001e", new Object[]{"e", "a", C66498i.m97223b(), "b", C64272b.m96375b()});
            case 3:
                return new C8488bd();
            case 4:
                return new C8487bc();
            case 5:
                return f29449d;
            case 6:
                C63010eb ebVar = f29450f;
                if (ebVar == null) {
                    synchronized (C8488bd.class) {
                        ebVar = f29450f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29449d);
                            f29450f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

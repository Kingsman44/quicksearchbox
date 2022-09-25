package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.be */
/* compiled from: PG */
public final class C14221be extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14221be f43041c;

    /* renamed from: e */
    private static volatile C63010eb f43042e;

    /* renamed from: a */
    public int f43043a = 0;

    /* renamed from: b */
    public Object f43044b;

    /* renamed from: d */
    private byte f43045d = 2;

    static {
        C14221be beVar = new C14221be();
        f43041c = beVar;
        C62942bv.registerDefaultInstance(C14221be.class, beVar);
    }

    private C14221be() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43045d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43045d = b;
                return null;
            case 2:
                return newMessageInfo(f43041c, "\u0000\u000b\u0001\u0000\u0002\u0010\u000b\u0000\u0000\u0004\u0002<\u0000\u0003<\u0000\u0004м\u0000\u0007м\u0000\tм\u0000\n<\u0000\u000b<\u0000\r<\u0000\u000eм\u0000\u000f<\u0000\u0010<\u0000", new Object[]{"b", "a", C14342fr.class, C14538my.class, C14338fn.class, C14282dl.class, C14299eb.class, C14546nf.class, C14532ms.class, C14239bw.class, C14215az.class, C14210au.class, C14228bl.class});
            case 3:
                return new C14221be();
            case 4:
                return new C14220bd();
            case 5:
                return f43041c;
            case 6:
                C63010eb ebVar = f43042e;
                if (ebVar == null) {
                    synchronized (C14221be.class) {
                        ebVar = f43042e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43041c);
                            f43042e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.libraries.assistant.p1594s.p1599c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.grammar.pumpkin.C66525q;

/* renamed from: com.google.android.libraries.assistant.s.c.l */
/* compiled from: PG */
public final class C19210l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19210l f53791b;

    /* renamed from: e */
    private static volatile C63010eb f53792e;

    /* renamed from: a */
    public C66525q f53793a;

    /* renamed from: c */
    private int f53794c;

    /* renamed from: d */
    private byte f53795d = 2;

    static {
        C19210l lVar = new C19210l();
        f53791b = lVar;
        C62942bv.registerDefaultInstance(C19210l.class, lVar);
    }

    private C19210l() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53795d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f53795d = b;
                return null;
            case 2:
                return newMessageInfo(f53791b, "\u0001\u0001\u0000\u000155\u0001\u0000\u0000\u00015ᐉ\u0010", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C19210l();
            case 4:
                return new C19209k();
            case 5:
                return f53791b;
            case 6:
                C63010eb ebVar = f53792e;
                if (ebVar == null) {
                    synchronized (C19210l.class) {
                        ebVar = f53792e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53791b);
                            f53792e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

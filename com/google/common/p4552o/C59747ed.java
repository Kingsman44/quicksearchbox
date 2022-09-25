package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ed */
/* compiled from: PG */
public final class C59747ed extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C59747ed f161427h;

    /* renamed from: i */
    private static volatile C63010eb f161428i;

    /* renamed from: a */
    public int f161429a;

    /* renamed from: b */
    public C59745eb f161430b;

    /* renamed from: c */
    public C59745eb f161431c;

    /* renamed from: d */
    public C62971cq f161432d = emptyProtobufList();

    /* renamed from: e */
    public C59745eb f161433e;

    /* renamed from: f */
    public C59745eb f161434f;

    /* renamed from: g */
    public C59745eb f161435g;

    static {
        C59747ed edVar = new C59747ed();
        f161427h = edVar;
        C62942bv.registerDefaultInstance(C59747ed.class, edVar);
    }

    private C59747ed() {
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
                return newMessageInfo(f161427h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C59745eb.class, "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C59747ed();
            case 4:
                return new C59746ec();
            case 5:
                return f161427h;
            case 6:
                C63010eb ebVar = f161428i;
                if (ebVar == null) {
                    synchronized (C59747ed.class) {
                        ebVar = f161428i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161427h);
                            f161428i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

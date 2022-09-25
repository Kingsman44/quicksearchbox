package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.ak */
/* compiled from: PG */
public final class C17881ak extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C17881ak f51231h;

    /* renamed from: k */
    private static volatile C63010eb f51232k;

    /* renamed from: a */
    public int f51233a;

    /* renamed from: b */
    public C17920v f51234b;

    /* renamed from: c */
    public C17880aj f51235c;

    /* renamed from: d */
    public C17916r f51236d;

    /* renamed from: e */
    public C62971cq f51237e = emptyProtobufList();

    /* renamed from: f */
    public C17913o f51238f;

    /* renamed from: g */
    public C62961ch f51239g = emptyIntList();

    /* renamed from: i */
    private C17922x f51240i;

    /* renamed from: j */
    private byte f51241j = 2;

    static {
        C17881ak akVar = new C17881ak();
        f51231h = akVar;
        C62942bv.registerDefaultInstance(C17881ak.class, akVar);
    }

    private C17881ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f51241j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f51241j = b;
                return null;
            case 2:
                return newMessageInfo(f51231h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006ᐉ\u0004\u0007\u001e", new Object[]{"a", "b", C45240c.f118157a, "d", "i", "e", C17902d.class, C10662f.f35572a, C30325g.f82003a, C17918t.m35112b()});
            case 3:
                return new C17881ak();
            case 4:
                return new C17914p();
            case 5:
                return f51231h;
            case 6:
                C63010eb ebVar = f51232k;
                if (ebVar == null) {
                    synchronized (C17881ak.class) {
                        ebVar = f51232k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51231h);
                            f51232k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

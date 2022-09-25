package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.co */
/* compiled from: PG */
public final class C79994co extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C79994co f219450j;

    /* renamed from: k */
    private static volatile C63010eb f219451k;

    /* renamed from: a */
    public int f219452a;

    /* renamed from: b */
    public float f219453b;

    /* renamed from: c */
    public float f219454c;

    /* renamed from: d */
    public C62971cq f219455d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C62971cq f219456e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public float f219457f;

    /* renamed from: g */
    public float f219458g;

    /* renamed from: h */
    public float f219459h;

    /* renamed from: i */
    public float f219460i;

    static {
        C79994co coVar = new C79994co();
        f219450j = coVar;
        C62942bv.registerDefaultInstance(C79994co.class, coVar);
    }

    private C79994co() {
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
                return newMessageInfo(f219450j, "\u0001\b\u0000\u0001\u0002\t\b\u0000\u0002\u0000\u0002ခ\u0000\u0003ခ\u0001\u0004\u001a\u0005\u001a\u0006ခ\u0002\u0007ခ\u0003\bခ\u0004\tခ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C79994co();
            case 4:
                return new C79993cn();
            case 5:
                return f219450j;
            case 6:
                C63010eb ebVar = f219451k;
                if (ebVar == null) {
                    synchronized (C79994co.class) {
                        ebVar = f219451k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219450j);
                            f219451k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

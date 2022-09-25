package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.aq */
/* compiled from: PG */
public final class C79942aq extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C79942aq f219213i;

    /* renamed from: j */
    private static volatile C63010eb f219214j;

    /* renamed from: a */
    public int f219215a;

    /* renamed from: b */
    public float f219216b;

    /* renamed from: c */
    public float f219217c;

    /* renamed from: d */
    public float f219218d;

    /* renamed from: e */
    public float f219219e;

    /* renamed from: f */
    public float f219220f;

    /* renamed from: g */
    public float f219221g;

    /* renamed from: h */
    public float f219222h;

    static {
        C79942aq aqVar = new C79942aq();
        f219213i = aqVar;
        C62942bv.registerDefaultInstance(C79942aq.class, aqVar);
    }

    private C79942aq() {
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
                return newMessageInfo(f219213i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C79942aq();
            case 4:
                return new C79941ap();
            case 5:
                return f219213i;
            case 6:
                C63010eb ebVar = f219214j;
                if (ebVar == null) {
                    synchronized (C79942aq.class) {
                        ebVar = f219214j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219213i);
                            f219214j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

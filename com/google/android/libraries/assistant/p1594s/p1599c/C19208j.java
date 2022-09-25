package com.google.android.libraries.assistant.p1594s.p1599c;

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

/* renamed from: com.google.android.libraries.assistant.s.c.j */
/* compiled from: PG */
public final class C19208j extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C19208j f53782h;

    /* renamed from: i */
    private static volatile C63010eb f53783i;

    /* renamed from: a */
    public int f53784a;

    /* renamed from: b */
    public int f53785b;

    /* renamed from: c */
    public C62971cq f53786c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62971cq f53787d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C62961ch f53788e = emptyIntList();

    /* renamed from: f */
    public boolean f53789f;

    /* renamed from: g */
    public boolean f53790g;

    static {
        C19208j jVar = new C19208j();
        f53782h = jVar;
        C62942bv.registerDefaultInstance(C19208j.class, jVar);
    }

    private C19208j() {
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
                return newMessageInfo(f53782h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001ဋ\u0000\u0002\u001a\u0003\u001a\u0004\u0016\u0005ဇ\u0001\u0006ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C19208j();
            case 4:
                return new C19207i();
            case 5:
                return f53782h;
            case 6:
                C63010eb ebVar = f53783i;
                if (ebVar == null) {
                    synchronized (C19208j.class) {
                        ebVar = f53783i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53782h);
                            f53783i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

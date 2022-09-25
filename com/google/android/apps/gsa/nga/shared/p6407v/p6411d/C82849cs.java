package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.apps.gsa.nga.engine.gestureclassifier.C76118h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.cs */
/* compiled from: PG */
public final class C82849cs extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C82849cs f225909d;

    /* renamed from: f */
    private static volatile C63010eb f225910f;

    /* renamed from: a */
    public int f225911a;

    /* renamed from: b */
    public C76118h f225912b;

    /* renamed from: c */
    public double f225913c;

    /* renamed from: e */
    private byte f225914e = 2;

    static {
        C82849cs csVar = new C82849cs();
        f225909d = csVar;
        C62942bv.registerDefaultInstance(C82849cs.class, csVar);
    }

    private C82849cs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f225914e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f225914e = b;
                return null;
            case 2:
                return newMessageInfo(f225909d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C82849cs();
            case 4:
                return new C82848cr();
            case 5:
                return f225909d;
            case 6:
                C63010eb ebVar = f225910f;
                if (ebVar == null) {
                    synchronized (C82849cs.class) {
                        ebVar = f225910f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225909d);
                            f225910f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

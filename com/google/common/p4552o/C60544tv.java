package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.tv */
/* compiled from: PG */
public final class C60544tv extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C60544tv f164021h;

    /* renamed from: i */
    private static volatile C63010eb f164022i;

    /* renamed from: a */
    public int f164023a;

    /* renamed from: b */
    public int f164024b;

    /* renamed from: c */
    public long f164025c;

    /* renamed from: d */
    public long f164026d;

    /* renamed from: e */
    public long f164027e;

    /* renamed from: f */
    public C62995dn f164028f = C62995dn.f170057a;

    /* renamed from: g */
    public C62995dn f164029g = C62995dn.f170057a;

    static {
        C60544tv tvVar = new C60544tv();
        f164021h = tvVar;
        C62942bv.registerDefaultInstance(C60544tv.class, tvVar);
    }

    private C60544tv() {
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
                return newMessageInfo(f164021h, "\u0001\u0006\u0000\u0001\u0001b\u0006\u0002\u0000\u0000\u0001ဋ\u0000\u0002ဃ\u0002\u0003ဃ\u0003\b2\t2bဃ\u0001", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C60542tt.f164019a, C30325g.f82003a, C60543tu.f164020a, C45240c.f118157a});
            case 3:
                return new C60544tv();
            case 4:
                return new C60541ts();
            case 5:
                return f164021h;
            case 6:
                C63010eb ebVar = f164022i;
                if (ebVar == null) {
                    synchronized (C60544tv.class) {
                        ebVar = f164022i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164021h);
                            f164022i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

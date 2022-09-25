package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ty */
/* compiled from: PG */
public final class C8057ty extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C8057ty f28350i;

    /* renamed from: j */
    private static volatile C63010eb f28351j;

    /* renamed from: a */
    public int f28352a;

    /* renamed from: b */
    public float f28353b;

    /* renamed from: c */
    public int f28354c;

    /* renamed from: d */
    public int f28355d;

    /* renamed from: e */
    public boolean f28356e;

    /* renamed from: f */
    public int f28357f;

    /* renamed from: g */
    public int f28358g;

    /* renamed from: h */
    public boolean f28359h;

    static {
        C8057ty tyVar = new C8057ty();
        f28350i = tyVar;
        C62942bv.registerDefaultInstance(C8057ty.class, tyVar);
    }

    private C8057ty() {
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
                return newMessageInfo(f28350i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C8057ty();
            case 4:
                return new C8056tx();
            case 5:
                return f28350i;
            case 6:
                C63010eb ebVar = f28351j;
                if (ebVar == null) {
                    synchronized (C8057ty.class) {
                        ebVar = f28351j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28350i);
                            f28351j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4257f.p4262c.C56340b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.f */
/* compiled from: PG */
public final class C80426f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f220736b = new C80423c();

    /* renamed from: e */
    public static final C62962ci f220737e = new C80424d();

    /* renamed from: f */
    public static final C80426f f220738f;

    /* renamed from: h */
    private static volatile C63010eb f220739h;

    /* renamed from: a */
    public C62961ch f220740a = emptyIntList();

    /* renamed from: c */
    public float f220741c;

    /* renamed from: d */
    public C62961ch f220742d = emptyIntList();

    /* renamed from: g */
    private int f220743g;

    static {
        C80426f fVar = new C80426f();
        f220738f = fVar;
        C62942bv.registerDefaultInstance(C80426f.class, fVar);
    }

    private C80426f() {
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
                return newMessageInfo(f220738f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001e\u0002ခ\u0000\u0003\u001e", new Object[]{C30325g.f82003a, "a", C56340b.m87977b(), C45240c.f118157a, "d", C80422b.m128156b()});
            case 3:
                return new C80426f();
            case 4:
                return new C80425e();
            case 5:
                return f220738f;
            case 6:
                C63010eb ebVar = f220739h;
                if (ebVar == null) {
                    synchronized (C80426f.class) {
                        ebVar = f220739h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220738f);
                            f220739h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

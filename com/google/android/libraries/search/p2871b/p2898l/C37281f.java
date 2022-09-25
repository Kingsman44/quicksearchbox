package com.google.android.libraries.search.p2871b.p2898l;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.b.l.f */
/* compiled from: PG */
public final class C37281f extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C37281f f99067i;

    /* renamed from: k */
    private static volatile C63010eb f99068k;

    /* renamed from: a */
    public int f99069a;

    /* renamed from: b */
    public C37277b f99070b;

    /* renamed from: c */
    public long f99071c;

    /* renamed from: d */
    public int f99072d;

    /* renamed from: e */
    public String f99073e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f99074f = emptyProtobufList();

    /* renamed from: g */
    public C57915d f99075g;

    /* renamed from: h */
    public long f99076h;

    /* renamed from: j */
    private byte f99077j = 2;

    static {
        C37281f fVar = new C37281f();
        f99067i = fVar;
        C62942bv.registerDefaultInstance(C37281f.class, fVar);
    }

    private C37281f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f99077j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f99077j = b;
                return null;
            case 2:
                return newMessageInfo(f99067i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005\u001b\u0006ᐉ\u0004\u0007ဂ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C37285j.class, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C37281f();
            case 4:
                return new C37280e();
            case 5:
                return f99067i;
            case 6:
                C63010eb ebVar = f99068k;
                if (ebVar == null) {
                    synchronized (C37281f.class) {
                        ebVar = f99068k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99067i);
                            f99068k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

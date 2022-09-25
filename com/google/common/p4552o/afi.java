package com.google.common.p4552o;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80363t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4140ba.p4147b.p4148a.p4149a.C54937b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.afi */
/* compiled from: PG */
public final class afi extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final afi f158536i;

    /* renamed from: k */
    private static volatile C63010eb f158537k;

    /* renamed from: a */
    public int f158538a;

    /* renamed from: b */
    public boolean f158539b;

    /* renamed from: c */
    public C54937b f158540c;

    /* renamed from: d */
    public int f158541d;

    /* renamed from: e */
    public int f158542e;

    /* renamed from: f */
    public int f158543f;

    /* renamed from: g */
    public boolean f158544g;

    /* renamed from: h */
    public int f158545h;

    /* renamed from: j */
    private byte f158546j = 2;

    static {
        afi afi = new afi();
        f158536i = afi;
        C62942bv.registerDefaultInstance(afi.class, afi);
    }

    private afi() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f158546j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f158546j = b;
                return null;
            case 2:
                return newMessageInfo(f158536i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဇ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C80515d.m128186b(), "e", C80517f.m128188b(), C10662f.f35572a, C82831ca.m132407b(), C30325g.f82003a, C19618h.f54585a, C80363t.m128123b()});
            case 3:
                return new afi();
            case 4:
                return new afh();
            case 5:
                return f158536i;
            case 6:
                C63010eb ebVar = f158537k;
                if (ebVar == null) {
                    synchronized (afi.class) {
                        ebVar = f158537k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158536i);
                            f158537k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.frameworks.client.p4624a.p4629b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60110ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;

/* renamed from: com.google.frameworks.client.a.b.i */
/* compiled from: PG */
public final class C61312i extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C61312i f165816i;

    /* renamed from: k */
    private static volatile C63010eb f165817k;

    /* renamed from: a */
    public int f165818a;

    /* renamed from: b */
    public int f165819b;

    /* renamed from: c */
    public long f165820c;

    /* renamed from: d */
    public C71207aq f165821d;

    /* renamed from: e */
    public C61305b f165822e;

    /* renamed from: f */
    public C60110ab f165823f;

    /* renamed from: g */
    public C61307d f165824g;

    /* renamed from: h */
    public C62971cq f165825h;

    /* renamed from: j */
    private byte f165826j = 2;

    static {
        C61312i iVar = new C61312i();
        f165816i = iVar;
        C62942bv.registerDefaultInstance(C61312i.class, iVar);
    }

    private C61312i() {
        C63088z zVar = C63088z.f170246b;
        this.f165825h = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f165826j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f165826j = b;
                return null;
            case 2:
                return newMessageInfo(f165816i, "\u0001\u0007\u0000\u0001\u0002\u000e\u0007\u0000\u0001\u0002\u0002ဉ\u0004\u0003ᐉ\u0005\u0007ဉ\u0006\t\u001b\fဌ\u0000\rဂ\u0001\u000eᐉ\u0002", new Object[]{"a", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C61317n.class, "b", C61311h.f165815a, C45240c.f118157a, "d"});
            case 3:
                return new C61312i();
            case 4:
                return new C61310g();
            case 5:
                return f165816i;
            case 6:
                C63010eb ebVar = f165817k;
                if (ebVar == null) {
                    synchronized (C61312i.class) {
                        ebVar = f165817k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165816i);
                            f165817k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

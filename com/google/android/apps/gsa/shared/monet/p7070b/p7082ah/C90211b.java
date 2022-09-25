package com.google.android.apps.gsa.shared.monet.p7070b.p7082ah;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.p489g.p494d.C9212cu;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7818lb;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.ah.b */
/* compiled from: PG */
public final class C90211b extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C90211b f252001n;

    /* renamed from: p */
    private static volatile C63010eb f252002p;

    /* renamed from: a */
    public int f252003a;

    /* renamed from: b */
    public String f252004b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f252005c;

    /* renamed from: d */
    public C62971cq f252006d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f252007e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f252008f = emptyProtobufList();

    /* renamed from: g */
    public long f252009g;

    /* renamed from: h */
    public String f252010h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C9212cu f252011i;

    /* renamed from: j */
    public float f252012j;

    /* renamed from: k */
    public String f252013k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C7718hj f252014l;

    /* renamed from: m */
    public int f252015m;

    /* renamed from: o */
    private byte f252016o = 2;

    static {
        C90211b bVar = new C90211b();
        f252001n = bVar;
        C62942bv.registerDefaultInstance(C90211b.class, bVar);
    }

    private C90211b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f252016o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f252016o = b;
                return null;
            case 2:
                return newMessageInfo(f252001n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\u0001\u0001ဈ\u0000\u0002ဂ\u0001\u0003\u001b\u0004\u001b\u0005ဂ\u0002\u0006ဈ\u0003\u0007ဉ\u0004\bခ\u0005\t\u001b\nဈ\u0006\u000bᐉ\u0007\fဌ\b", new Object[]{"a", "b", C45240c.f118157a, "d", C7818lb.class, "e", C7818lb.class, C30325g.f82003a, C19618h.f54585a, "i", "j", C10662f.f35572a, C7818lb.class, C19621k.f54601a, "l", "m", C8142xb.m22955b()});
            case 3:
                return new C90211b();
            case 4:
                return new C90210a();
            case 5:
                return f252001n;
            case 6:
                C63010eb ebVar = f252002p;
                if (ebVar == null) {
                    synchronized (C90211b.class) {
                        ebVar = f252002p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252001n);
                            f252002p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

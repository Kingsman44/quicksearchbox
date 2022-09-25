package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ee */
/* compiled from: PG */
public final class C82889ee extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C82889ee f226094j;

    /* renamed from: l */
    private static volatile C63010eb f226095l;

    /* renamed from: a */
    public int f226096a;

    /* renamed from: b */
    public int f226097b;

    /* renamed from: c */
    public long f226098c;

    /* renamed from: d */
    public C82885ea f226099d;

    /* renamed from: e */
    public long f226100e;

    /* renamed from: f */
    public int f226101f;

    /* renamed from: g */
    public C83320io f226102g;

    /* renamed from: h */
    public long f226103h;

    /* renamed from: i */
    public long f226104i;

    /* renamed from: k */
    private byte f226105k = 2;

    static {
        C82889ee eeVar = new C82889ee();
        f226094j = eeVar;
        C62942bv.registerDefaultInstance(C82889ee.class, eeVar);
    }

    private C82889ee() {
    }

    /* renamed from: a */
    public final C82885ea mo76630a() {
        C82885ea eaVar = this.f226099d;
        return eaVar == null ? C82885ea.f225977c : eaVar;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f226105k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f226105k = b;
                return null;
            case 2:
                return newMessageInfo(f226094j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဂ\u0001\u0003ᐉ\u0002\u0004ဂ\u0003\u0005ဉ\u0005\u0006ဌ\u0004\u0007ဂ\u0006\bဂ\u0007", new Object[]{"a", "b", C82887ec.m132417b(), C45240c.f118157a, "d", "e", C30325g.f82003a, C10662f.f35572a, C82916fe.f226212a, C19618h.f54585a, "i"});
            case 3:
                return new C82889ee();
            case 4:
                return new C82888ed();
            case 5:
                return f226094j;
            case 6:
                C63010eb ebVar = f226095l;
                if (ebVar == null) {
                    synchronized (C82889ee.class) {
                        ebVar = f226095l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226094j);
                            f226095l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

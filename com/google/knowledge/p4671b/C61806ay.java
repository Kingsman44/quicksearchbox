package com.google.knowledge.p4671b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.b.ay */
/* compiled from: PG */
public final class C61806ay extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C61806ay f166956i;

    /* renamed from: k */
    private static volatile C63010eb f166957k;

    /* renamed from: a */
    public int f166958a;

    /* renamed from: b */
    public C55093fp f166959b;

    /* renamed from: c */
    public C62971cq f166960c = emptyProtobufList();

    /* renamed from: d */
    public String f166961d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f166962e;

    /* renamed from: f */
    public int f166963f;

    /* renamed from: g */
    public long f166964g;

    /* renamed from: h */
    public String f166965h = BuildConfig.FLAVOR;

    /* renamed from: j */
    private byte f166966j = 2;

    static {
        C61806ay ayVar = new C61806ay();
        f166956i = ayVar;
        C62942bv.registerDefaultInstance(C61806ay.class, ayVar);
    }

    private C61806ay() {
    }

    /* renamed from: a */
    public final void mo58196a() {
        C62971cq cqVar = this.f166960c;
        if (!cqVar.mo58948c()) {
            this.f166960c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166966j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166966j = b;
                return null;
            case 2:
                return newMessageInfo(f166956i, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002ᐉ\u0001\u0003\u001b\u0004ဈ\u0002\u0005ဂ\u0003\u0006ဌ\u0004\u0007ဂ\u0005\bဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, C61809ba.class, "d", "e", C10662f.f35572a, C61805ax.m94467b(), C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C61806ay();
            case 4:
                return new C61803av();
            case 5:
                return f166956i;
            case 6:
                C63010eb ebVar = f166957k;
                if (ebVar == null) {
                    synchronized (C61806ay.class) {
                        ebVar = f166957k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166956i);
                            f166957k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

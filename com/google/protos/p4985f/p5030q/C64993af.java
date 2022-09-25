package com.google.protos.p4985f.p5030q;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4986a.C64708r;

/* renamed from: com.google.protos.f.q.af */
/* compiled from: PG */
public final class C64993af extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C64993af f176001j;

    /* renamed from: l */
    private static volatile C63010eb f176002l;

    /* renamed from: a */
    public int f176003a;

    /* renamed from: b */
    public int f176004b;

    /* renamed from: c */
    public String f176005c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f176006d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f176007e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f176008f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public String f176009g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C64708r f176010h;

    /* renamed from: i */
    public C64989ab f176011i;

    /* renamed from: k */
    private byte f176012k = 2;

    static {
        C64993af afVar = new C64993af();
        f176001j = afVar;
        C62942bv.registerDefaultInstance(C64993af.class, afVar);
    }

    private C64993af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176012k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176012k = b;
                return null;
            case 2:
                return newMessageInfo(f176001j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005\u001a\u0006ဈ\u0004\u0007ᐉ\u0005\bဉ\u0006", new Object[]{"a", "b", C55421x.m87687b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C64993af();
            case 4:
                return new C64992ae();
            case 5:
                return f176001j;
            case 6:
                C63010eb ebVar = f176002l;
                if (ebVar == null) {
                    synchronized (C64993af.class) {
                        ebVar = f176002l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176001j);
                            f176002l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

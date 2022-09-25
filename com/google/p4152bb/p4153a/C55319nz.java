package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.nz */
/* compiled from: PG */
public final class C55319nz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55319nz f145736c;

    /* renamed from: d */
    public static final C62940bt f145737d;

    /* renamed from: f */
    private static volatile C63010eb f145738f;

    /* renamed from: a */
    public String f145739a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f145740b = C62942bv.emptyProtobufList();

    /* renamed from: e */
    private int f145741e;

    static {
        C55319nz nzVar = new C55319nz();
        f145736c = nzVar;
        C62942bv.registerDefaultInstance(C55319nz.class, nzVar);
        f145737d = C62942bv.newSingularGeneratedExtension(C55317nx.f145731c, nzVar, nzVar, (C62958ce) null, 120389812, C63066gd.MESSAGE, C55319nz.class);
    }

    private C55319nz() {
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
                return newMessageInfo(f145736c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"e", "a", "b"});
            case 3:
                return new C55319nz();
            case 4:
                return new C55318ny();
            case 5:
                return f145736c;
            case 6:
                C63010eb ebVar = f145738f;
                if (ebVar == null) {
                    synchronized (C55319nz.class) {
                        ebVar = f145738f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145736c);
                            f145738f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

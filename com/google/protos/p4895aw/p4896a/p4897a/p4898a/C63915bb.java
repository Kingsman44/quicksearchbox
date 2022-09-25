package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.bb */
/* compiled from: PG */
public final class C63915bb extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C63915bb f172826g;

    /* renamed from: h */
    private static volatile C63010eb f172827h;

    /* renamed from: a */
    public int f172828a;

    /* renamed from: b */
    public C63899am f172829b;

    /* renamed from: c */
    public C62995dn f172830c = C62995dn.f170057a;

    /* renamed from: d */
    public C62995dn f172831d;

    /* renamed from: e */
    public C62995dn f172832e;

    /* renamed from: f */
    public C63901ao f172833f;

    static {
        C63915bb bbVar = new C63915bb();
        f172826g = bbVar;
        C62942bv.registerDefaultInstance(C63915bb.class, bbVar);
    }

    private C63915bb() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f172831d = dnVar;
        this.f172832e = dnVar;
    }

    /* renamed from: a */
    public final C62995dn mo59240a() {
        C62995dn dnVar = this.f172832e;
        if (!dnVar.f170058b) {
            this.f172832e = dnVar.mo58980a();
        }
        return this.f172832e;
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
                return newMessageInfo(f172826g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0003\u0000\u0000\u0001ဉ\u0000\u00022\u00032\u00042\u0005ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a, C63912az.f172823a, "d", C63911ay.f172822a, "e", C63914ba.f172825a, C10662f.f35572a});
            case 3:
                return new C63915bb();
            case 4:
                return new C63910ax();
            case 5:
                return f172826g;
            case 6:
                C63010eb ebVar = f172827h;
                if (ebVar == null) {
                    synchronized (C63915bb.class) {
                        ebVar = f172827h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172826g);
                            f172827h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4887at.p4888a.p4889a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.at.a.a.m */
/* compiled from: PG */
public final class C63810m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63810m f172574e;

    /* renamed from: g */
    private static volatile C63010eb f172575g;

    /* renamed from: a */
    public int f172576a;

    /* renamed from: b */
    public int f172577b;

    /* renamed from: c */
    public int f172578c;

    /* renamed from: d */
    public int f172579d;

    /* renamed from: f */
    private int f172580f;

    static {
        C63810m mVar = new C63810m();
        f172574e = mVar;
        C62942bv.registerDefaultInstance(C63810m.class, mVar);
    }

    private C63810m() {
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
                Object[] objArr = new Object[9];
                objArr[0] = C10662f.f35572a;
                objArr[1] = "a";
                objArr[2] = C63806i.f172572a;
                objArr[3] = "b";
                objArr[4] = C63808k.f172573a;
                objArr[5] = C45240c.f118157a;
                C62959cf cfVar = C63804g.f172571a;
                objArr[8] = cfVar;
                objArr[6] = cfVar;
                objArr[7] = "d";
                return newMessageInfo(f172574e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", objArr);
            case 3:
                return new C63810m();
            case 4:
                return new C63803f();
            case 5:
                return f172574e;
            case 6:
                C63010eb ebVar = f172575g;
                if (ebVar == null) {
                    synchronized (C63810m.class) {
                        ebVar = f172575g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172574e);
                            f172575g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

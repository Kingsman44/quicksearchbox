package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.o */
/* compiled from: PG */
public final class C54924o extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C54924o f144380h;

    /* renamed from: i */
    private static volatile C63010eb f144381i;

    /* renamed from: a */
    public int f144382a;

    /* renamed from: b */
    public float f144383b;

    /* renamed from: c */
    public float f144384c;

    /* renamed from: d */
    public float f144385d;

    /* renamed from: e */
    public float f144386e;

    /* renamed from: f */
    public float f144387f;

    /* renamed from: g */
    public float f144388g;

    static {
        C54924o oVar = new C54924o();
        f144380h = oVar;
        C62942bv.registerDefaultInstance(C54924o.class, oVar);
    }

    private C54924o() {
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
                return newMessageInfo(f144380h, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0000\u0000\u0002ခ\u0000\u0003ခ\u0001\u0006ခ\u0002\u0007ခ\u0003\bခ\u0004\tခ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C54924o();
            case 4:
                return new C54923n();
            case 5:
                return f144380h;
            case 6:
                C63010eb ebVar = f144381i;
                if (ebVar == null) {
                    synchronized (C54924o.class) {
                        ebVar = f144381i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144380h);
                            f144381i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

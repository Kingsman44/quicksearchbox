package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.i */
/* compiled from: PG */
public final class C54918i extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C54918i f144358h;

    /* renamed from: i */
    private static volatile C63010eb f144359i;

    /* renamed from: a */
    public int f144360a;

    /* renamed from: b */
    public float f144361b;

    /* renamed from: c */
    public float f144362c;

    /* renamed from: d */
    public float f144363d;

    /* renamed from: e */
    public float f144364e;

    /* renamed from: f */
    public float f144365f;

    /* renamed from: g */
    public float f144366g;

    static {
        C54918i iVar = new C54918i();
        f144358h = iVar;
        C62942bv.registerDefaultInstance(C54918i.class, iVar);
    }

    private C54918i() {
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
                return newMessageInfo(f144358h, "\u0001\u0006\u0000\u0001\u0006\u000b\u0006\u0000\u0000\u0000\u0006ခ\u0000\u0007ခ\u0001\bခ\u0002\tခ\u0003\nခ\u0004\u000bခ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C54918i();
            case 4:
                return new C54917h();
            case 5:
                return f144358h;
            case 6:
                C63010eb ebVar = f144359i;
                if (ebVar == null) {
                    synchronized (C54918i.class) {
                        ebVar = f144359i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144358h);
                            f144359i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

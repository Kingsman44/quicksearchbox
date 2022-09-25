package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.t */
/* compiled from: PG */
public final class C54929t extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C54929t f144397i;

    /* renamed from: j */
    private static volatile C63010eb f144398j;

    /* renamed from: a */
    public int f144399a;

    /* renamed from: b */
    public float f144400b;

    /* renamed from: c */
    public float f144401c;

    /* renamed from: d */
    public float f144402d;

    /* renamed from: e */
    public float f144403e;

    /* renamed from: f */
    public float f144404f;

    /* renamed from: g */
    public float f144405g;

    /* renamed from: h */
    public float f144406h;

    static {
        C54929t tVar = new C54929t();
        f144397i = tVar;
        C62942bv.registerDefaultInstance(C54929t.class, tVar);
    }

    private C54929t() {
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
                return newMessageInfo(f144397i, "\u0001\u0007\u0000\u0001\u0002\t\u0007\u0000\u0000\u0000\u0002ခ\u0000\u0003ခ\u0001\u0004ခ\u0002\u0006ခ\u0004\u0007ခ\u0005\bခ\u0006\tခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "e"});
            case 3:
                return new C54929t();
            case 4:
                return new C54928s();
            case 5:
                return f144397i;
            case 6:
                C63010eb ebVar = f144398j;
                if (ebVar == null) {
                    synchronized (C54929t.class) {
                        ebVar = f144398j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144397i);
                            f144398j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

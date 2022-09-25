package com.google.android.apps.gsa.shared.p7004aw.p7005a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.aw.a.u */
/* compiled from: PG */
public final class C89317u extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C89317u f242144e;

    /* renamed from: f */
    private static volatile C63010eb f242145f;

    /* renamed from: a */
    public boolean f242146a;

    /* renamed from: b */
    public long f242147b;

    /* renamed from: c */
    public long f242148c;

    /* renamed from: d */
    public int f242149d;

    static {
        C89317u uVar = new C89317u();
        f242144e = uVar;
        C62942bv.registerDefaultInstance(C89317u.class, uVar);
    }

    private C89317u() {
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
                return newMessageInfo(f242144e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0002\u0003\u0002\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C89317u();
            case 4:
                return new C89316t();
            case 5:
                return f242144e;
            case 6:
                C63010eb ebVar = f242145f;
                if (ebVar == null) {
                    synchronized (C89317u.class) {
                        ebVar = f242145f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242144e);
                            f242145f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

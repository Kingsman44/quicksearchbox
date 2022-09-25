package com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.c.l */
/* compiled from: PG */
public final class C137254l extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C137254l f373407g;

    /* renamed from: i */
    private static volatile C63010eb f373408i;

    /* renamed from: a */
    public int f373409a = 0;

    /* renamed from: b */
    public Object f373410b;

    /* renamed from: c */
    public C57569am f373411c;

    /* renamed from: d */
    public C137256n f373412d;

    /* renamed from: e */
    public C57648i f373413e;

    /* renamed from: f */
    public boolean f373414f;

    /* renamed from: h */
    private byte f373415h = 2;

    static {
        C137254l lVar = new C137254l();
        f373407g = lVar;
        C62942bv.registerDefaultInstance(C137254l.class, lVar);
    }

    private C137254l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373415h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f373415h = b;
                return null;
            case 2:
                return newMessageInfo(f373407g, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0004\u0001Љ\u0002м\u0000\u0003Ȼ\u0000\u0004Љ\u0005м\u0000\u0006\t\u0007\u0007", new Object[]{"b", "a", C45240c.f118157a, C57578av.class, "d", C57578av.class, "e", C10662f.f35572a});
            case 3:
                return new C137254l();
            case 4:
                return new C137253k();
            case 5:
                return f373407g;
            case 6:
                C63010eb ebVar = f373408i;
                if (ebVar == null) {
                    synchronized (C137254l.class) {
                        ebVar = f373408i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373407g);
                            f373408i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.apps.search.googleapp.saves.savefeature;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
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

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.h */
/* compiled from: PG */
public final class C137300h extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C137300h f373505h;

    /* renamed from: j */
    private static volatile C63010eb f373506j;

    /* renamed from: a */
    public boolean f373507a;

    /* renamed from: b */
    public int f373508b;

    /* renamed from: c */
    public C57569am f373509c;

    /* renamed from: d */
    public C57578av f373510d;

    /* renamed from: e */
    public int f373511e;

    /* renamed from: f */
    public C57648i f373512f;

    /* renamed from: g */
    public boolean f373513g;

    /* renamed from: i */
    private byte f373514i = 2;

    static {
        C137300h hVar = new C137300h();
        f373505h = hVar;
        C62942bv.registerDefaultInstance(C137300h.class, hVar);
    }

    private C137300h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373514i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f373514i = b;
                return null;
            case 2:
                return newMessageInfo(f373505h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0002\u0001\u0007\u0002\f\u0003Љ\u0004Љ\u0005\f\u0006\t\u0007\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C137300h();
            case 4:
                return new C137299g();
            case 5:
                return f373505h;
            case 6:
                C63010eb ebVar = f373506j;
                if (ebVar == null) {
                    synchronized (C137300h.class) {
                        ebVar = f373506j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373505h);
                            f373506j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.a.a.aa */
/* compiled from: PG */
public final class C107462aa extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C107462aa f299031h;

    /* renamed from: j */
    private static volatile C63010eb f299032j;

    /* renamed from: a */
    public int f299033a;

    /* renamed from: b */
    public C51953ff f299034b;

    /* renamed from: c */
    public C52507uh f299035c;

    /* renamed from: d */
    public C62971cq f299036d = emptyProtobufList();

    /* renamed from: e */
    public int f299037e;

    /* renamed from: f */
    public int f299038f;

    /* renamed from: g */
    public long f299039g;

    /* renamed from: i */
    private byte f299040i = 2;

    static {
        C107462aa aaVar = new C107462aa();
        f299031h = aaVar;
        C62942bv.registerDefaultInstance(C107462aa.class, aaVar);
    }

    private C107462aa() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f299040i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f299040i = b;
                return null;
            case 2:
                return newMessageInfo(f299031h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006\u001b", new Object[]{"a", "b", C45240c.f118157a, "e", C107497w.f299097a, C10662f.f35572a, C107499y.f299098a, C30325g.f82003a, "d", C51809dy.class});
            case 3:
                return new C107462aa();
            case 4:
                return new C107496v();
            case 5:
                return f299031h;
            case 6:
                C63010eb ebVar = f299032j;
                if (ebVar == null) {
                    synchronized (C107462aa.class) {
                        ebVar = f299032j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299031h);
                            f299032j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

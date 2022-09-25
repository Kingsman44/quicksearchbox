package com.google.assistant.p3897e.p3921j;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aeu */
/* compiled from: PG */
public final class aeu extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final aeu f134959h;

    /* renamed from: i */
    private static volatile C63010eb f134960i;

    /* renamed from: a */
    public int f134961a;

    /* renamed from: b */
    public boolean f134962b;

    /* renamed from: c */
    public int f134963c;

    /* renamed from: d */
    public boolean f134964d;

    /* renamed from: e */
    public boolean f134965e;

    /* renamed from: f */
    public boolean f134966f;

    /* renamed from: g */
    public boolean f134967g;

    static {
        aeu aeu = new aeu();
        f134959h = aeu;
        C62942bv.registerDefaultInstance(aeu.class, aeu);
    }

    private aeu() {
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
                return newMessageInfo(f134959h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, aet.m86301b(), "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new aeu();
            case 4:
                return new aer();
            case 5:
                return f134959h;
            case 6:
                C63010eb ebVar = f134960i;
                if (ebVar == null) {
                    synchronized (aeu.class) {
                        ebVar = f134960i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134959h);
                            f134960i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

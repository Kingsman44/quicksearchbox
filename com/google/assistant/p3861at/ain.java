package com.google.assistant.p3861at;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ain */
/* compiled from: PG */
public final class ain extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final ain f129411h;

    /* renamed from: i */
    private static volatile C63010eb f129412i;

    /* renamed from: a */
    public int f129413a;

    /* renamed from: b */
    public int f129414b = 0;

    /* renamed from: c */
    public Object f129415c;

    /* renamed from: d */
    public aik f129416d;

    /* renamed from: e */
    public aim f129417e;

    /* renamed from: f */
    public boolean f129418f;

    /* renamed from: g */
    public boolean f129419g;

    static {
        ain ain = new ain();
        f129411h = ain;
        C62942bv.registerDefaultInstance(ain.class, ain);
    }

    private ain() {
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
                return newMessageInfo(f129411h, "\u0001\u0005\u0001\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0007ဇ\u0005\bဇ\u0006", new Object[]{C45240c.f118157a, "b", "a", ahh.class, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new ain();
            case 4:
                return new aii();
            case 5:
                return f129411h;
            case 6:
                C63010eb ebVar = f129412i;
                if (ebVar == null) {
                    synchronized (ain.class) {
                        ebVar = f129412i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129411h);
                            f129412i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

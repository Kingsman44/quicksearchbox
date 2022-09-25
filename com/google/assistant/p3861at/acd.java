package com.google.assistant.p3861at;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.acd */
/* compiled from: PG */
public final class acd extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final acd f128836g;

    /* renamed from: h */
    private static volatile C63010eb f128837h;

    /* renamed from: a */
    public int f128838a;

    /* renamed from: b */
    public int f128839b = 0;

    /* renamed from: c */
    public Object f128840c;

    /* renamed from: d */
    public int f128841d = 1;

    /* renamed from: e */
    public C62961ch f128842e = emptyIntList();

    /* renamed from: f */
    public acb f128843f;

    static {
        acd acd = new acd();
        f128836g = acd;
        C62942bv.registerDefaultInstance(acd.class, acd);
    }

    private acd() {
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
                return newMessageInfo(f128836g, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဌ\u0004\u0005\u001e\u0006ြ\u0000\u0007ဉ\u0005", new Object[]{C45240c.f118157a, "b", "a", abb.class, C50515zy.class, aat.class, "d", acc.f128835a, "e", abz.f128825a, aai.class, C10662f.f35572a});
            case 3:
                return new acd();
            case 4:
                return new aby();
            case 5:
                return f128836g;
            case 6:
                C63010eb ebVar = f128837h;
                if (ebVar == null) {
                    synchronized (acd.class) {
                        ebVar = f128837h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128836g);
                            f128837h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

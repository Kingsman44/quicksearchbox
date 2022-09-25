package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5036r.C65318d;

/* renamed from: com.google.assistant.at.en */
/* compiled from: PG */
public final class C49937en extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49937en f129795e;

    /* renamed from: g */
    private static volatile C63010eb f129796g;

    /* renamed from: a */
    public int f129797a;

    /* renamed from: b */
    public String f129798b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129799c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C49935el f129800d;

    /* renamed from: f */
    private int f129801f;

    static {
        C49937en enVar = new C49937en();
        f129795e = enVar;
        C62942bv.registerDefaultInstance(C49937en.class, enVar);
    }

    private C49937en() {
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
                return newMessageInfo(f129795e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဉ\u0004", new Object[]{C10662f.f35572a, "a", C65318d.f176653a, "b", C45240c.f118157a, "d"});
            case 3:
                return new C49937en();
            case 4:
                return new C49936em();
            case 5:
                return f129795e;
            case 6:
                C63010eb ebVar = f129796g;
                if (ebVar == null) {
                    synchronized (C49937en.class) {
                        ebVar = f129796g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129795e);
                            f129796g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

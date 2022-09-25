package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.at.ni */
/* compiled from: PG */
public final class C50175ni extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50175ni f130433d;

    /* renamed from: e */
    private static volatile C63010eb f130434e;

    /* renamed from: a */
    public int f130435a;

    /* renamed from: b */
    public String f130436b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f130437c;

    static {
        C50175ni niVar = new C50175ni();
        f130433d = niVar;
        C62942bv.registerDefaultInstance(C50175ni.class, niVar);
    }

    private C50175ni() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f130433d, "\u0001\u0002\u0000\u0001\u0001\u000b\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u000bဇ\u0006", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50175ni();
            case 4:
                return new C50174nh();
            case 5:
                return f130433d;
            case 6:
                C63010eb ebVar = f130434e;
                if (ebVar == null) {
                    synchronized (C50175ni.class) {
                        ebVar = f130434e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130433d);
                            f130434e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

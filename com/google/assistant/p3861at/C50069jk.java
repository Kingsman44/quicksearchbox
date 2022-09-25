package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.jk */
/* compiled from: PG */
public final class C50069jk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50069jk f130176d;

    /* renamed from: e */
    private static volatile C63010eb f130177e;

    /* renamed from: a */
    public int f130178a;

    /* renamed from: b */
    public String f130179b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130180c = BuildConfig.FLAVOR;

    static {
        C50069jk jkVar = new C50069jk();
        f130176d = jkVar;
        C62942bv.registerDefaultInstance(C50069jk.class, jkVar);
    }

    private C50069jk() {
        emptyProtobufList();
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
                return newMessageInfo(f130176d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50069jk();
            case 4:
                return new C50068jj();
            case 5:
                return f130176d;
            case 6:
                C63010eb ebVar = f130177e;
                if (ebVar == null) {
                    synchronized (C50069jk.class) {
                        ebVar = f130177e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130176d);
                            f130177e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

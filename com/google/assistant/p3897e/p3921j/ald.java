package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ald */
/* compiled from: PG */
public final class ald extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final ald f135310b;

    /* renamed from: d */
    private static volatile C63010eb f135311d;

    /* renamed from: a */
    public String f135312a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f135313c;

    static {
        ald ald = new ald();
        f135310b = ald;
        C62942bv.registerDefaultInstance(ald.class, ald);
    }

    private ald() {
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
                return newMessageInfo(f135310b, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဈ\u0004", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new ald();
            case 4:
                return new alc();
            case 5:
                return f135310b;
            case 6:
                C63010eb ebVar = f135311d;
                if (ebVar == null) {
                    synchronized (ald.class) {
                        ebVar = f135311d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135310b);
                            f135311d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

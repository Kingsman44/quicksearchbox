package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aih */
/* compiled from: PG */
public final class aih extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final aih f129393g;

    /* renamed from: i */
    private static volatile C63010eb f129394i;

    /* renamed from: a */
    public int f129395a;

    /* renamed from: b */
    public C62971cq f129396b = emptyProtobufList();

    /* renamed from: c */
    public String f129397c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public aic f129398d;

    /* renamed from: e */
    public aig f129399e;

    /* renamed from: f */
    public aie f129400f;

    /* renamed from: h */
    private byte f129401h = 2;

    static {
        aih aih = new aih();
        f129393g = aih;
        C62942bv.registerDefaultInstance(aih.class, aih);
    }

    private aih() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f129401h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f129401h = b;
                return null;
            case 2:
                return newMessageInfo(f129393g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0002\u0001Л\u0002ဈ\u0001\u0004ဉ\u0002\u0005ᐉ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", ahz.class, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new aih();
            case 4:
                return new aia();
            case 5:
                return f129393g;
            case 6:
                C63010eb ebVar = f129394i;
                if (ebVar == null) {
                    synchronized (aih.class) {
                        ebVar = f129394i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129393g);
                            f129394i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

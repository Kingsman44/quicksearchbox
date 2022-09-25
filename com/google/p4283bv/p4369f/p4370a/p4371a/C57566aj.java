package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.aj */
/* compiled from: PG */
public final class C57566aj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f153790d = new C57564ah();

    /* renamed from: e */
    public static final C57566aj f153791e;

    /* renamed from: f */
    private static volatile C63010eb f153792f;

    /* renamed from: a */
    public String f153793a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f153794b;

    /* renamed from: c */
    public C62961ch f153795c = emptyIntList();

    static {
        C57566aj ajVar = new C57566aj();
        f153791e = ajVar;
        C62942bv.registerDefaultInstance(C57566aj.class, ajVar);
    }

    private C57566aj() {
    }

    /* renamed from: a */
    public final void mo54518a() {
        C62961ch chVar = this.f153795c;
        if (!chVar.mo58948c()) {
            this.f153795c = C62942bv.mutableCopy(chVar);
        }
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
                return newMessageInfo(f153791e, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003,", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57566aj();
            case 4:
                return new C57565ai();
            case 5:
                return f153791e;
            case 6:
                C63010eb ebVar = f153792f;
                if (ebVar == null) {
                    synchronized (C57566aj.class) {
                        ebVar = f153792f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153791e);
                            f153792f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

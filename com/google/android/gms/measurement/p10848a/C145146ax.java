package com.google.android.gms.measurement.p10848a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.ax */
/* compiled from: PG */
public final class C145146ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C145146ax f392307c;

    /* renamed from: e */
    private static volatile C63010eb f392308e;

    /* renamed from: a */
    public String f392309a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f392310b = emptyProtobufList();

    /* renamed from: d */
    private int f392311d;

    static {
        C145146ax axVar = new C145146ax();
        f392307c = axVar;
        C62942bv.registerDefaultInstance(C145146ax.class, axVar);
    }

    private C145146ax() {
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
                return newMessageInfo(f392307c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C145153bd.class});
            case 3:
                return new C145146ax();
            case 4:
                return new C145145aw();
            case 5:
                return f392307c;
            case 6:
                C63010eb ebVar = f392308e;
                if (ebVar == null) {
                    synchronized (C145146ax.class) {
                        ebVar = f392308e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392307c);
                            f392308e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

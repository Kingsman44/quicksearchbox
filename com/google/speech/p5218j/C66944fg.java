package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.fg */
/* compiled from: PG */
public final class C66944fg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66944fg f181963e;

    /* renamed from: f */
    public static final C62940bt f181964f;

    /* renamed from: g */
    private static volatile C63010eb f181965g;

    /* renamed from: a */
    public int f181966a;

    /* renamed from: b */
    public C62971cq f181967b = emptyProtobufList();

    /* renamed from: c */
    public String f181968c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f181969d = BuildConfig.FLAVOR;

    static {
        C66944fg fgVar = new C66944fg();
        f181963e = fgVar;
        C62942bv.registerDefaultInstance(C66944fg.class, fgVar);
        f181964f = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, fgVar, fgVar, (C62958ce) null, 420374974, C63066gd.MESSAGE, C66944fg.class);
    }

    private C66944fg() {
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
                return newMessageInfo(f181963e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C67165nl.class, C45240c.f118157a, "d"});
            case 3:
                return new C66944fg();
            case 4:
                return new C66943ff();
            case 5:
                return f181963e;
            case 6:
                C63010eb ebVar = f181965g;
                if (ebVar == null) {
                    synchronized (C66944fg.class) {
                        ebVar = f181965g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181963e);
                            f181965g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

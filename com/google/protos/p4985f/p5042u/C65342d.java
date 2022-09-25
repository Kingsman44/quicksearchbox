package com.google.protos.p4985f.p5042u;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C52030ib;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.f.u.d */
/* compiled from: PG */
public final class C65342d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65342d f176699e;

    /* renamed from: f */
    public static final C62940bt f176700f;

    /* renamed from: i */
    private static volatile C63010eb f176701i;

    /* renamed from: a */
    public String f176702a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f176703b;

    /* renamed from: c */
    public String f176704c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f176705d = emptyProtobufList();

    /* renamed from: g */
    private int f176706g;

    /* renamed from: h */
    private byte f176707h = 2;

    static {
        C65342d dVar = new C65342d();
        f176699e = dVar;
        C62942bv.registerDefaultInstance(C65342d.class, dVar);
        f176700f = C62942bv.newSingularGeneratedExtension(C52030ib.f136561a, dVar, dVar, (C62958ce) null, 324609612, C63066gd.MESSAGE, C65342d.class);
    }

    private C65342d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176707h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176707h = b;
                return null;
            case 2:
                return newMessageInfo(f176699e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0005ဈ\u0002\u0006Л", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", C65342d.class});
            case 3:
                return new C65342d();
            case 4:
                return new C65341c();
            case 5:
                return f176699e;
            case 6:
                C63010eb ebVar = f176701i;
                if (ebVar == null) {
                    synchronized (C65342d.class) {
                        ebVar = f176701i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176699e);
                            f176701i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

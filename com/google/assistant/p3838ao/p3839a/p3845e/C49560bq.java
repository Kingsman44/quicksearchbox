package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ao.a.e.bq */
/* compiled from: PG */
public final class C49560bq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49560bq f127879e;

    /* renamed from: f */
    public static final C62940bt f127880f;

    /* renamed from: h */
    private static volatile C63010eb f127881h;

    /* renamed from: a */
    public boolean f127882a;

    /* renamed from: b */
    public boolean f127883b;

    /* renamed from: c */
    public boolean f127884c;

    /* renamed from: d */
    public boolean f127885d;

    /* renamed from: g */
    private int f127886g;

    static {
        C49560bq bqVar = new C49560bq();
        f127879e = bqVar;
        C62942bv.registerDefaultInstance(C49560bq.class, bqVar);
        f127880f = C62942bv.newSingularGeneratedExtension(C49520ad.f127756b, bqVar, bqVar, (C62958ce) null, 284529186, C63066gd.MESSAGE, C49560bq.class);
    }

    private C49560bq() {
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
                return newMessageInfo(f127879e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C49560bq();
            case 4:
                return new C49559bp();
            case 5:
                return f127879e;
            case 6:
                C63010eb ebVar = f127881h;
                if (ebVar == null) {
                    synchronized (C49560bq.class) {
                        ebVar = f127881h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127879e);
                            f127881h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

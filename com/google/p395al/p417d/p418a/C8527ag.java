package com.google.p395al.p417d.p418a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.al.d.a.ag */
/* compiled from: PG */
public final class C8527ag extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8527ag f29575d;

    /* renamed from: e */
    public static final C62940bt f29576e;

    /* renamed from: h */
    private static volatile C63010eb f29577h;

    /* renamed from: a */
    public int f29578a;

    /* renamed from: b */
    public String f29579b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f29580c = C63088z.f170246b;

    /* renamed from: f */
    private C54229ar f29581f;

    /* renamed from: g */
    private byte f29582g = 2;

    static {
        C8527ag agVar = new C8527ag();
        f29575d = agVar;
        C62942bv.registerDefaultInstance(C8527ag.class, agVar);
        f29576e = C62942bv.newSingularGeneratedExtension(C8523ac.f29564e, agVar, agVar, (C62958ce) null, 100, C63066gd.MESSAGE, C8527ag.class);
    }

    private C8527ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29582g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29582g = b;
                return null;
            case 2:
                return newMessageInfo(f29575d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ည\u0003", new Object[]{"a", "b", C10662f.f35572a, C45240c.f118157a});
            case 3:
                return new C8527ag();
            case 4:
                return new C8526af();
            case 5:
                return f29575d;
            case 6:
                C63010eb ebVar = f29577h;
                if (ebVar == null) {
                    synchronized (C8527ag.class) {
                        ebVar = f29577h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29575d);
                            f29577h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

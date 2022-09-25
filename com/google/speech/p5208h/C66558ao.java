package com.google.speech.p5208h;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.ao */
/* compiled from: PG */
public final class C66558ao extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66558ao f181041c;

    /* renamed from: d */
    public static final C62940bt f181042d;

    /* renamed from: g */
    private static volatile C63010eb f181043g;

    /* renamed from: a */
    public C62971cq f181044a = emptyProtobufList();

    /* renamed from: b */
    public String f181045b = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f181046e;

    /* renamed from: f */
    private byte f181047f = 2;

    static {
        C66558ao aoVar = new C66558ao();
        f181041c = aoVar;
        C62942bv.registerDefaultInstance(C66558ao.class, aoVar);
        f181042d = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, aoVar, aoVar, (C62958ce) null, 250816231, C63066gd.MESSAGE, C66558ao.class);
    }

    private C66558ao() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181047f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181047f = b;
                return null;
            case 2:
                return newMessageInfo(f181041c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000", new Object[]{"e", "a", C66690x.class, "b"});
            case 3:
                return new C66558ao();
            case 4:
                return new C66557an();
            case 5:
                return f181041c;
            case 6:
                C63010eb ebVar = f181043g;
                if (ebVar == null) {
                    synchronized (C66558ao.class) {
                        ebVar = f181043g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181041c);
                            f181043g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.p4102au.p4103a.p4104a.p4105a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.au.a.a.a.f */
/* compiled from: PG */
public final class C54568f extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C54568f f143266b;

    /* renamed from: c */
    public static final C62940bt f143267c;

    /* renamed from: k */
    private static volatile C63010eb f143268k;

    /* renamed from: a */
    public String f143269a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f143270d;

    /* renamed from: e */
    private C60220t f143271e;

    /* renamed from: f */
    private C60220t f143272f;

    /* renamed from: g */
    private C60218r f143273g;

    /* renamed from: h */
    private C54570h f143274h;

    /* renamed from: i */
    private C63771b f143275i;

    /* renamed from: j */
    private byte f143276j = 2;

    static {
        C54568f fVar = new C54568f();
        f143266b = fVar;
        C62942bv.registerDefaultInstance(C54568f.class, fVar);
        f143267c = C62942bv.newSingularGeneratedExtension(C63771b.f172510a, fVar, fVar, (C62958ce) null, 12223638, C63066gd.MESSAGE, C54568f.class);
    }

    private C54568f() {
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143276j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f143276j = b;
                return null;
            case 2:
                return newMessageInfo(f143266b, "\u0001\u0006\u0000\u0001\u0001;\u0006\u0000\u0000\u0005\u0001ဈ\u0000\u0002ᐉ\u0004\u0016ᐉ\u0017\"ᐉ\u001a0ᐉ\u0005;ᐉ\u0006", new Object[]{"d", "a", "e", C19618h.f54585a, "i", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C54568f();
            case 4:
                return new C54567e();
            case 5:
                return f143266b;
            case 6:
                C63010eb ebVar = f143268k;
                if (ebVar == null) {
                    synchronized (C54568f.class) {
                        ebVar = f143268k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143266b);
                            f143268k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

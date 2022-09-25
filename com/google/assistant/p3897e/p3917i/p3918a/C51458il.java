package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.e.i.a.il */
/* compiled from: PG */
public final class C51458il extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C51458il f134042h;

    /* renamed from: i */
    public static final C62940bt f134043i;

    /* renamed from: j */
    private static volatile C63010eb f134044j;

    /* renamed from: a */
    public int f134045a;

    /* renamed from: b */
    public String f134046b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51470ix f134047c;

    /* renamed from: d */
    public C51462ip f134048d;

    /* renamed from: e */
    public C51468iv f134049e;

    /* renamed from: f */
    public C51466it f134050f;

    /* renamed from: g */
    public C52321nk f134051g;

    static {
        C51458il ilVar = new C51458il();
        f134042h = ilVar;
        C62942bv.registerDefaultInstance(C51458il.class, ilVar);
        f134043i = C62942bv.newSingularGeneratedExtension(C51406gn.f133887s, ilVar, ilVar, (C62958ce) null, 224388883, C63066gd.MESSAGE, C51458il.class);
    }

    private C51458il() {
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
                return newMessageInfo(f134042h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0004\u0006ဉ\u0003\u0007ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, "e", C30325g.f82003a});
            case 3:
                return new C51458il();
            case 4:
                return new C51457ik();
            case 5:
                return f134042h;
            case 6:
                C63010eb ebVar = f134044j;
                if (ebVar == null) {
                    synchronized (C51458il.class) {
                        ebVar = f134044j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134042h);
                            f134044j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

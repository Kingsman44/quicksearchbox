package com.google.speech.p5208h.p5209a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5208h.C66607ce;

/* renamed from: com.google.speech.h.a.i */
/* compiled from: PG */
public final class C66538i extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C66538i f180961g;

    /* renamed from: h */
    public static final C62940bt f180962h;

    /* renamed from: i */
    private static volatile C63010eb f180963i;

    /* renamed from: a */
    public int f180964a;

    /* renamed from: b */
    public int f180965b = 1;

    /* renamed from: c */
    public String f180966c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f180967d = true;

    /* renamed from: e */
    public String f180968e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f180969f;

    static {
        C66538i iVar = new C66538i();
        f180961g = iVar;
        C62942bv.registerDefaultInstance(C66538i.class, iVar);
        f180962h = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, iVar, iVar, (C62958ce) null, 144480581, C63066gd.MESSAGE, C66538i.class);
    }

    private C66538i() {
        emptyIntList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f180961g, "\u0001\u0005\u0000\u0001\u0001\f\u0005\u0000\u0000\u0000\u0001ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\tဌ\u0000\fဇ\u0005", new Object[]{"a", C45240c.f118157a, "d", "e", "b", C66537h.f180960a, C10662f.f35572a});
            case 3:
                return new C66538i();
            case 4:
                return new C66536g();
            case 5:
                return f180961g;
            case 6:
                C63010eb ebVar = f180963i;
                if (ebVar == null) {
                    synchronized (C66538i.class) {
                        ebVar = f180963i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180961g);
                            f180963i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

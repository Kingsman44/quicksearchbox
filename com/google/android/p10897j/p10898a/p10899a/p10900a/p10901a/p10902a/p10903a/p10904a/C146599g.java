package com.google.android.p10897j.p10898a.p10899a.p10900a.p10901a.p10902a.p10903a.p10904a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.p2566g.C33423r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.j.a.a.a.a.a.a.a.g */
/* compiled from: PG */
public final class C146599g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C146599g f395957c;

    /* renamed from: d */
    public static final C62940bt f395958d;

    /* renamed from: e */
    private static volatile C63010eb f395959e;

    /* renamed from: a */
    public int f395960a;

    /* renamed from: b */
    public String f395961b = BuildConfig.FLAVOR;

    static {
        C146599g gVar = new C146599g();
        f395957c = gVar;
        C62942bv.registerDefaultInstance(C146599g.class, gVar);
        f395958d = C62942bv.newSingularGeneratedExtension(C33423r.f89502a, gVar, gVar, (C62958ce) null, 411524377, C63066gd.MESSAGE, C146599g.class);
    }

    private C146599g() {
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
                return newMessageInfo(f395957c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C146599g();
            case 4:
                return new C146598f();
            case 5:
                return f395957c;
            case 6:
                C63010eb ebVar = f395959e;
                if (ebVar == null) {
                    synchronized (C146599g.class) {
                        ebVar = f395959e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f395957c);
                            f395959e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

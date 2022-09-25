package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.p1106b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13044f;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.b.b.b */
/* compiled from: PG */
public final class C15476b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C15476b f46416f;

    /* renamed from: g */
    public static final C62940bt f46417g;

    /* renamed from: h */
    private static volatile C63010eb f46418h;

    /* renamed from: a */
    public int f46419a;

    /* renamed from: b */
    public String f46420b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C13044f f46421c;

    /* renamed from: d */
    public int f46422d;

    /* renamed from: e */
    public String f46423e = BuildConfig.FLAVOR;

    static {
        C15476b bVar = new C15476b();
        f46416f = bVar;
        C62942bv.registerDefaultInstance(C15476b.class, bVar);
        f46417g = C62942bv.newSingularGeneratedExtension(C15474b.f46404j, bVar, bVar, (C62958ce) null, 376245640, C63066gd.MESSAGE, C15476b.class);
    }

    private C15476b() {
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
                return newMessageInfo(f46416f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C62722b.m94932b(), "e"});
            case 3:
                return new C15476b();
            case 4:
                return new C15475a();
            case 5:
                return f46416f;
            case 6:
                C63010eb ebVar = f46418h;
                if (ebVar == null) {
                    synchronized (C15476b.class) {
                        ebVar = f46418h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f46416f);
                            f46418h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

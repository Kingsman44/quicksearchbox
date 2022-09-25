package com.google.p395al.p398b.p399a.p400a.p401a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p398b.p399a.p402b.p403a.p407d.C8441b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.b.a.a.a.b */
/* compiled from: PG */
public final class C8417b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C8417b f29273g;

    /* renamed from: j */
    private static volatile C63010eb f29274j;

    /* renamed from: a */
    public String f29275a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f29276b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f29277c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f29278d;

    /* renamed from: e */
    public String f29279e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C8441b f29280f;

    /* renamed from: h */
    private int f29281h;

    /* renamed from: i */
    private byte f29282i = 2;

    static {
        C8417b bVar = new C8417b();
        f29273g = bVar;
        C62942bv.registerDefaultInstance(C8417b.class, bVar);
    }

    private C8417b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29282i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29282i = b;
                return null;
            case 2:
                return newMessageInfo(f29273g, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\tဉ\b", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C8417b();
            case 4:
                return new C8416a();
            case 5:
                return f29273g;
            case 6:
                C63010eb ebVar = f29274j;
                if (ebVar == null) {
                    synchronized (C8417b.class) {
                        ebVar = f29274j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29273g);
                            f29274j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

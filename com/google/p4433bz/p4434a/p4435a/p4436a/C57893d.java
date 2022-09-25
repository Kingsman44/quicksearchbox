package com.google.p4433bz.p4434a.p4435a.p4436a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bz.a.a.a.d */
/* compiled from: PG */
public final class C57893d extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C57893d f154853h;

    /* renamed from: j */
    private static volatile C63010eb f154854j;

    /* renamed from: a */
    public int f154855a;

    /* renamed from: b */
    public String f154856b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f154857c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f154858d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f154859e;

    /* renamed from: f */
    public String f154860f = "en";

    /* renamed from: g */
    public String f154861g;

    /* renamed from: i */
    private byte f154862i = 2;

    static {
        C57893d dVar = new C57893d();
        f154853h = dVar;
        C62942bv.registerDefaultInstance(C57893d.class, dVar);
    }

    private C57893d() {
        emptyProtobufList();
        this.f154861g = BuildConfig.FLAVOR;
        emptyProtobufList();
        emptyLongList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154862i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154862i = b;
                return null;
            case 2:
                return newMessageInfo(f154853h, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဌ\u0003\u0006ဈ\u0004\fဈ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C57891b.f154852a, C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C57893d();
            case 4:
                return new C57890a();
            case 5:
                return f154853h;
            case 6:
                C63010eb ebVar = f154854j;
                if (ebVar == null) {
                    synchronized (C57893d.class) {
                        ebVar = f154854j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154853h);
                            f154854j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* compiled from: PG */
public final class DirectUpdatePropertiesOuterClass$DirectUpdateProperties extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final DirectUpdatePropertiesOuterClass$DirectUpdateProperties f179517a;

    /* renamed from: b */
    public static final C62940bt f179518b;

    /* renamed from: d */
    private static volatile C63010eb f179519d;

    /* renamed from: c */
    private byte f179520c = 2;

    static {
        DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties = new DirectUpdatePropertiesOuterClass$DirectUpdateProperties();
        f179517a = directUpdatePropertiesOuterClass$DirectUpdateProperties;
        C62942bv.registerDefaultInstance(DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class, directUpdatePropertiesOuterClass$DirectUpdateProperties);
        f179518b = C62942bv.newSingularGeneratedExtension(C66208dv.f180040a, directUpdatePropertiesOuterClass$DirectUpdateProperties, directUpdatePropertiesOuterClass$DirectUpdateProperties, (C62958ce) null, 402418170, C63066gd.MESSAGE, DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class);
    }

    private DirectUpdatePropertiesOuterClass$DirectUpdateProperties() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179520c);
            case 1:
                this.f179520c = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f179517a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new DirectUpdatePropertiesOuterClass$DirectUpdateProperties();
            case 4:
                return new C66147bz();
            case 5:
                return f179517a;
            case 6:
                C63010eb ebVar = f179519d;
                if (ebVar == null) {
                    synchronized (DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class) {
                        ebVar = f179519d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179517a);
                            f179519d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.libraries.social.populous.android.p3287a;

import android.os.Parcel;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.social.populous.android.a.a */
/* compiled from: PG */
public final class C42162a {
    private C42162a() {
    }

    /* renamed from: a */
    public static C58833ax m74077a(Parcel parcel, C62958ce ceVar) {
        return parcel.readByte() == 1 ? C58833ax.m90834k(ceVar.mo23993a(parcel.readInt())) : C58836b.f156633a;
    }

    /* renamed from: b */
    public static C58485gu m74078b(Parcel parcel, Class cls) {
        int[] createIntArray = parcel.createIntArray();
        C58480gp e = C58485gu.m89837e();
        for (int i : createIntArray) {
            e.mo55395g(((Enum[]) cls.getEnumConstants())[i]);
        }
        return e.mo55394f();
    }

    /* renamed from: c */
    public static C58485gu m74079c(Parcel parcel, C62958ce ceVar) {
        int[] createIntArray = parcel.createIntArray();
        C58480gp e = C58485gu.m89837e();
        for (int a : createIntArray) {
            e.mo55395g(ceVar.mo23993a(a));
        }
        return e.mo55394f();
    }

    /* renamed from: d */
    public static MessageLite m74080d(Parcel parcel, MessageLite messageLite) {
        if (parcel.readInt() == 1) {
            return ProtoParsers.m95521d(parcel, messageLite, C62921ba.m95368a());
        }
        return null;
    }

    /* renamed from: e */
    public static void m74081e(Parcel parcel, Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Enum) it.next()).ordinal();
            i++;
        }
        parcel.writeIntArray(iArr);
    }

    /* renamed from: f */
    public static void m74082f(Parcel parcel, MessageLite messageLite) {
        parcel.writeInt(messageLite != null ? 1 : 0);
        if (messageLite != null) {
            ProtoParsers.m95530m(parcel, messageLite);
        }
    }

    /* renamed from: g */
    public static void m74083g(Parcel parcel, C58833ax axVar) {
        parcel.writeByte(axVar.mo56113h() ? (byte) 1 : 0);
        if (axVar.mo56113h()) {
            parcel.writeInt(((C62957cd) axVar.mo56107c()).getNumber());
        }
    }

    /* renamed from: h */
    public static void m74084h(Parcel parcel, Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((C62957cd) it.next()).getNumber();
            i++;
        }
        parcel.writeIntArray(iArr);
    }

    /* renamed from: i */
    public static C58485gu m74085i(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readParcelableList(arrayList, C42162a.class.getClassLoader());
        return C58485gu.m89842j(arrayList);
    }
}

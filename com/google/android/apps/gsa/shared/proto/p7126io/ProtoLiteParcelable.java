package com.google.android.apps.gsa.shared.proto.p7126io;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable */
/* compiled from: PG */
public class ProtoLiteParcelable extends AbstractProtoParcelable {
    public static final Parcelable.Creator CREATOR = new C90451d();

    public ProtoLiteParcelable(MessageLite messageLite) {
        super((Object) messageLite);
    }

    /* renamed from: e */
    public static MessageLite m147134e(byte[] bArr, C63010eb ebVar) {
        if (bArr == null) {
            return null;
        }
        try {
            return (MessageLite) ebVar.mo59015n(bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    /* renamed from: f */
    public static MessageLite m147135f(Parcel parcel, MessageLite messageLite) {
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        try {
            return messageLite.toBuilder().mergeFrom(createByteArray, C62921ba.m95368a()).build();
        } catch (C62974ct e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: g */
    public static MessageLite m147136g(Parcel parcel, MessageLite messageLite) {
        MessageLite f = m147135f(parcel, messageLite);
        return f != null ? f : messageLite;
    }

    /* renamed from: h */
    public static List m147137h(Parcel parcel, C63010eb ebVar) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, ProtoLiteParcelable.class.getClassLoader());
        return m147138i(arrayList, ebVar);
    }

    /* renamed from: i */
    public static List m147138i(List list, C63010eb ebVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProtoLiteParcelable) it.next()).mo84191d(ebVar));
        }
        return arrayList;
    }

    /* renamed from: j */
    public static void m147139j(List list, Parcel parcel) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProtoLiteParcelable((MessageLite) it.next()));
        }
        parcel.writeList(arrayList);
    }

    @Deprecated
    /* renamed from: k */
    public static void m147140k(MessageLite messageLite, Parcel parcel) {
        parcel.writeByteArray(messageLite != null ? messageLite.toByteArray() : null);
    }

    /* renamed from: l */
    public static void m147141l(MessageLite messageLite, Parcel parcel) {
        parcel.writeByteArray(messageLite.toByteArray());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ byte[] mo84180b(Object obj) {
        return ((MessageLite) obj).toByteArray();
    }

    @Deprecated
    /* renamed from: c */
    public final MessageLite mo84190c(MessageLite messageLite) {
        MessageLite messageLite2 = (MessageLite) mo84179a(new C90450c(messageLite));
        return messageLite2 == null ? messageLite : messageLite2;
    }

    /* renamed from: d */
    public final MessageLite mo84191d(C63010eb ebVar) {
        return (MessageLite) mo84179a(new C90449b(ebVar));
    }

    /* renamed from: m */
    public final boolean mo84192m() {
        return this.f252674a ? this.f252675b != null : this.f252676c != null;
    }

    public ProtoLiteParcelable(byte[] bArr) {
        super(bArr);
    }
}

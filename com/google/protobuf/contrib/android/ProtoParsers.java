package com.google.protobuf.contrib.android;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;
import com.google.common.p4541l.C59337t;
import com.google.protobuf.C62906an;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public final class ProtoParsers {

    /* compiled from: PG */
    public final class InternalDontUse implements ParcelableProto {
        public static final Parcelable.Creator CREATOR = new C62969a();

        /* renamed from: a */
        private volatile byte[] f170005a;

        /* renamed from: b */
        private volatile MessageLite f170006b;

        public InternalDontUse(byte[] bArr, MessageLite messageLite) {
            boolean z = true;
            if (bArr == null && messageLite == null) {
                z = false;
            }
            C58838bb.m90869d(z, "Must have a message or bytes");
            this.f170005a = bArr;
            this.f170006b = messageLite;
        }

        /* renamed from: a */
        public final MessageLite mo58938a(MessageLite messageLite, C62921ba baVar) {
            try {
                return mo58939b(messageLite, baVar);
            } catch (C62974ct e) {
                throw new IllegalStateException(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final MessageLite mo58939b(MessageLite messageLite, C62921ba baVar) {
            if (this.f170006b == null) {
                this.f170006b = messageLite.toBuilder().mergeFrom(this.f170005a, baVar).build();
            }
            return this.f170006b;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            if (this.f170005a == null) {
                byte[] bArr = new byte[this.f170006b.getSerializedSize()];
                try {
                    this.f170006b.writeTo(C62906an.m95324Q(bArr));
                    this.f170005a = bArr;
                } catch (IOException e) {
                    throw new AssertionError(e);
                }
            }
            parcel.writeInt(this.f170005a.length);
            parcel.writeByteArray(this.f170005a);
        }
    }

    /* compiled from: PG */
    public interface ParcelableProto extends Parcelable {
        /* renamed from: a */
        MessageLite mo58938a(MessageLite messageLite, C62921ba baVar);
    }

    /* renamed from: a */
    public static MessageLite m95518a(Parcel parcel, MessageLite messageLite, C62921ba baVar) {
        return m95534q((InternalDontUse) parcel.readTypedObject(InternalDontUse.CREATOR), messageLite, baVar);
    }

    /* renamed from: b */
    public static MessageLite m95519b(Intent intent, String str, MessageLite messageLite, C62921ba baVar) {
        InternalDontUse internalDontUse;
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (parcelableExtra instanceof Bundle) {
            Bundle bundle = (Bundle) parcelableExtra;
            bundle.setClassLoader(InternalDontUse.class.getClassLoader());
            internalDontUse = (InternalDontUse) bundle.getParcelable("protoparsers");
        } else {
            internalDontUse = (InternalDontUse) parcelableExtra;
        }
        return m95534q(internalDontUse, messageLite, baVar);
    }

    /* renamed from: c */
    public static MessageLite m95520c(Bundle bundle, String str, MessageLite messageLite, C62921ba baVar) {
        InternalDontUse internalDontUse;
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(InternalDontUse.class.getClassLoader());
            internalDontUse = (InternalDontUse) bundle2.getParcelable("protoparsers");
        } else {
            internalDontUse = (InternalDontUse) parcelable;
        }
        return m95534q(internalDontUse, messageLite, baVar);
    }

    /* renamed from: d */
    public static MessageLite m95521d(Parcel parcel, MessageLite messageLite, C62921ba baVar) {
        try {
            return m95518a(parcel, messageLite, baVar);
        } catch (C62974ct e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    public static MessageLite m95522e(Bundle bundle, String str, MessageLite messageLite, C62921ba baVar) {
        try {
            return m95520c(bundle, str, messageLite, baVar);
        } catch (C62974ct e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: f */
    public static MessageLite m95523f(byte[] bArr, MessageLite messageLite) {
        try {
            return messageLite.toBuilder().mergeFrom(bArr).build();
        } catch (C62974ct e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public static MessageLite m95524g(byte[] bArr, MessageLite messageLite, C62921ba baVar) {
        try {
            return messageLite.toBuilder().mergeFrom(bArr, baVar).build();
        } catch (C62974ct e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h */
    public static MessageLite m95525h(Context context, C63010eb ebVar, int i) {
        try {
            InputStream openRawResource = context.getResources().openRawResource(i);
            if (C19559g.m37305d(Thread.currentThread())) {
                if (openRawResource.available() > 1024) {
                    throw new IllegalStateException("parseFromRawRes can only parse small Protocol Buffers on the UI thread. This provides a best effort protection against dropping frames for parsing.");
                }
            }
            MessageLite messageLite = (MessageLite) ebVar.mo59009h(openRawResource);
            C59337t.m92221a(openRawResource);
            return messageLite;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            C59337t.m92221a((InputStream) null);
            throw th;
        }
    }

    /* renamed from: i */
    public static ArrayList m95526i(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new InternalDontUse((byte[]) null, (MessageLite) it.next()));
        }
        return arrayList;
    }

    /* renamed from: j */
    public static List m95527j(List list, MessageLite messageLite, C62921ba baVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m95534q((InternalDontUse) it.next(), messageLite, baVar));
        }
        return arrayList;
    }

    /* renamed from: k */
    public static List m95528k(Bundle bundle, String str, MessageLite messageLite, C62921ba baVar) {
        ArrayList arrayList;
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(InternalDontUse.class.getClassLoader());
            arrayList = bundle2.getParcelableArrayList("protoparsers");
        } else {
            arrayList = (ArrayList) parcelable;
        }
        return m95527j(arrayList, messageLite, baVar);
    }

    /* renamed from: l */
    public static List m95529l(Bundle bundle, String str, MessageLite messageLite, C62921ba baVar) {
        try {
            return m95528k(bundle, str, messageLite, baVar);
        } catch (C62974ct e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    public static void m95530m(Parcel parcel, MessageLite messageLite) {
        parcel.writeTypedObject(new InternalDontUse((byte[]) null, messageLite), 0);
    }

    /* renamed from: n */
    public static void m95531n(Intent intent, String str, MessageLite messageLite) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("protoparsers", new InternalDontUse((byte[]) null, messageLite));
        intent.putExtra(str, bundle);
    }

    /* renamed from: o */
    public static void m95532o(Bundle bundle, String str, MessageLite messageLite) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("protoparsers", new InternalDontUse((byte[]) null, messageLite));
        bundle.putParcelable(str, bundle2);
    }

    /* renamed from: p */
    public static void m95533p(Bundle bundle, String str, List list) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("protoparsers", m95526i(list));
        bundle.putParcelable(str, bundle2);
    }

    /* renamed from: q */
    private static MessageLite m95534q(InternalDontUse internalDontUse, MessageLite messageLite, C62921ba baVar) {
        return internalDontUse.mo58939b(messageLite.getDefaultInstanceForType(), baVar);
    }
}

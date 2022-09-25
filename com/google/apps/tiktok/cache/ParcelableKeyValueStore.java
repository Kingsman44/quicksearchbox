package com.google.apps.tiktok.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public final class ParcelableKeyValueStore implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C46368af();

    /* renamed from: a */
    public final Object f121360a;

    /* renamed from: b */
    public final Map f121361b;

    /* renamed from: c */
    public MessageLite f121362c;

    /* renamed from: d */
    public C62921ba f121363d;

    /* renamed from: e */
    private boolean f121364e;

    /* renamed from: f */
    private ParcelableEntry[] f121365f;

    /* compiled from: PG */
    public final class ParcelableEntry implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C46369ag();

        /* renamed from: a */
        public final ProtoParsers.ParcelableProto f121366a;

        /* renamed from: b */
        public final ProtoParsers.ParcelableProto f121367b;

        /* renamed from: c */
        public final long f121368c;

        public ParcelableEntry(ProtoParsers.ParcelableProto parcelableProto, ProtoParsers.ParcelableProto parcelableProto2, long j) {
            this.f121366a = parcelableProto;
            this.f121367b = parcelableProto2;
            this.f121368c = j;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f121366a, 0);
            parcel.writeParcelable(this.f121367b, 0);
            parcel.writeLong(this.f121368c);
        }
    }

    ParcelableKeyValueStore() {
        this(new ParcelableEntry[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C46370ah mo50327a(MessageLite messageLite) {
        C46370ah ahVar;
        synchronized (this.f121360a) {
            mo50328b(messageLite);
            ahVar = (C46370ah) this.f121361b.get(messageLite);
        }
        return ahVar;
    }

    /* renamed from: b */
    public final void mo50328b(MessageLite messageLite) {
        this.f121362c.getClass();
        this.f121363d.getClass();
        if (this.f121364e) {
            for (ParcelableEntry parcelableEntry : this.f121365f) {
                this.f121361b.put(parcelableEntry.f121366a.mo58938a(messageLite.getDefaultInstanceForType(), this.f121363d), new C46370ah(parcelableEntry.f121367b.mo58938a(this.f121362c, this.f121363d), parcelableEntry.f121368c));
            }
            this.f121365f = null;
            this.f121364e = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo50329c(MessageLite messageLite, C46370ah ahVar) {
        synchronized (this.f121360a) {
            mo50328b(messageLite);
            this.f121361b.put(messageLite, ahVar);
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this.f121360a) {
            if (this.f121364e) {
                parcel.writeInt(this.f121365f.length);
                for (ParcelableEntry writeParcelable : this.f121365f) {
                    parcel.writeParcelable(writeParcelable, 0);
                }
            } else {
                parcel.writeInt(this.f121361b.size());
                for (Map.Entry entry : this.f121361b.entrySet()) {
                    C46370ah ahVar = (C46370ah) entry.getValue();
                    parcel.writeParcelable(new ParcelableEntry(new ProtoParsers.InternalDontUse((byte[]) null, (MessageLite) entry.getKey()), new ProtoParsers.InternalDontUse((byte[]) null, ahVar.f121384a), ahVar.f121385b), 0);
                }
            }
        }
    }

    public ParcelableKeyValueStore(ParcelableEntry[] parcelableEntryArr) {
        this.f121360a = new Object();
        this.f121364e = true;
        this.f121365f = parcelableEntryArr;
        this.f121361b = new HashMap();
    }
}

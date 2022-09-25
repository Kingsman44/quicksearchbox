package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.LazyParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public final class ImmutableEnumListUtils implements C23274s {

    /* renamed from: a */
    private final C23263h f63727a;

    /* renamed from: b */
    private final Enum[] f63728b;

    /* compiled from: PG */
    public final class ListWrapper implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C23262g();

        /* renamed from: a */
        public List f63729a;

        /* renamed from: b */
        public List f63730b;

        public ListWrapper(Parcel parcel) {
            this.f63729a = new ArrayList();
            int readInt = parcel.readInt();
            for (int i = 0; i < readInt; i++) {
                List list = this.f63729a;
                list.getClass();
                list.add(Integer.valueOf(parcel.readInt()));
            }
        }

        public ListWrapper(List list) {
            this.f63730b = list;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            List<Enum> list = this.f63730b;
            if (list != null) {
                parcel.writeInt(list.size());
                for (Enum ordinal : list) {
                    parcel.writeInt(ordinal.ordinal());
                }
                return;
            }
            List<Integer> list2 = this.f63729a;
            if (list2 != null) {
                parcel.writeInt(list2.size());
                for (Integer intValue : list2) {
                    parcel.writeInt(intValue.intValue());
                }
                return;
            }
            throw new IllegalStateException("Both serialized and unserialized lists are null.");
        }
    }

    public ImmutableEnumListUtils(C23263h hVar, Enum[] enumArr) {
        this.f63727a = hVar;
        this.f63728b = enumArr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28732a() {
        return (List) this.f63727a.mo28589a(Collections.emptyList());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28733b(String str, C23120p pVar) {
        C23263h hVar = this.f63727a;
        LazyParcelable lazyParcelable = (LazyParcelable) pVar.f63472a.getParcelable(str);
        lazyParcelable.getClass();
        ClassLoader classLoader = getClass().getClassLoader();
        classLoader.getClass();
        ListWrapper listWrapper = (ListWrapper) lazyParcelable.mo28508a(classLoader);
        Enum[] enumArr = this.f63728b;
        List list = listWrapper.f63730b;
        if (list == null) {
            if (listWrapper.f63729a != null) {
                list = new ArrayList();
                for (Integer intValue : listWrapper.f63729a) {
                    list.add(enumArr[intValue.intValue()]);
                }
                listWrapper.f63729a = null;
                listWrapper.f63730b = list;
            } else {
                throw new IllegalStateException("Both serialized and unserialized lists are null.");
            }
        }
        return (List) hVar.mo28589a(list);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo28734c(String str, Object obj, Bundle bundle) {
        bundle.putParcelable(str, new LazyParcelable((Parcelable) new ListWrapper((List) obj)));
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        return ((List) obj).equals((List) obj2);
    }
}

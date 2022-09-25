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
public final class ImmutableListUtils implements C23274s {

    /* renamed from: a */
    private final C23263h f63731a;

    /* compiled from: PG */
    public final class ListWrapper implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C23264i();

        /* renamed from: a */
        public final List f63732a;

        public ListWrapper(Parcel parcel) {
            ClassLoader classLoader = getClass().getClassLoader();
            classLoader.getClass();
            this.f63732a = new ArrayList();
            int readInt = parcel.readInt();
            for (int i = 0; i < readInt; i++) {
                this.f63732a.add(parcel.readValue(classLoader));
            }
        }

        public ListWrapper(List list) {
            this.f63732a = list;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f63732a.size());
            for (Object writeValue : this.f63732a) {
                parcel.writeValue(writeValue);
            }
        }
    }

    public ImmutableListUtils(C23263h hVar) {
        this.f63731a = hVar;
    }

    /* renamed from: f */
    public static final void m43582f(String str, List list, Bundle bundle) {
        bundle.putParcelable(str, new LazyParcelable((Parcelable) new ListWrapper(list)));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28732a() {
        return (List) this.f63731a.mo28589a(Collections.emptyList());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo28734c(String str, Object obj, Bundle bundle) {
        m43582f(str, (List) obj, bundle);
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        return ((List) obj).equals((List) obj2);
    }

    /* renamed from: e */
    public final List mo28733b(String str, C23120p pVar) {
        C23263h hVar = this.f63731a;
        LazyParcelable lazyParcelable = (LazyParcelable) pVar.f63472a.getParcelable(str);
        lazyParcelable.getClass();
        ClassLoader classLoader = getClass().getClassLoader();
        classLoader.getClass();
        return (List) hVar.mo28589a(((ListWrapper) lazyParcelable.mo28508a(classLoader)).f63732a);
    }
}

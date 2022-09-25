package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.LazyParcelable;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public final class ProtoListUtils implements C23274s {

    /* renamed from: a */
    private final C63010eb f63733a;

    /* renamed from: b */
    private final C62921ba f63734b;

    /* renamed from: c */
    private final C23263h f63735c;

    public ProtoListUtils(C23263h hVar, C63010eb ebVar, C62921ba baVar) {
        this.f63735c = hVar;
        this.f63733a = ebVar;
        this.f63734b = baVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28732a() {
        return (List) this.f63735c.mo28589a(Collections.emptyList());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28733b(String str, C23120p pVar) {
        C23263h hVar = this.f63735c;
        LazyParcelable lazyParcelable = (LazyParcelable) pVar.f63472a.getParcelable(str);
        lazyParcelable.getClass();
        ClassLoader classLoader = getClass().getClassLoader();
        classLoader.getClass();
        ListWrapper listWrapper = (ListWrapper) lazyParcelable.mo28508a(classLoader);
        C63010eb ebVar = this.f63733a;
        C62921ba baVar = this.f63734b;
        if (listWrapper.f63736a == null) {
            C23087a aVar = new C23087a();
            List<ProtoParcelable> list = listWrapper.f63737b;
            list.getClass();
            for (ProtoParcelable b : list) {
                C62942bv b2 = C23245b.m43557b(b, ebVar, baVar, true);
                b2.getClass();
                aVar.mo28530a(b2);
            }
            listWrapper.f63736a = new C23088b(aVar.f63434a);
        }
        List list2 = listWrapper.f63736a;
        list2.getClass();
        return (List) hVar.mo28589a(list2);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo28734c(String str, Object obj, Bundle bundle) {
        bundle.putParcelable(str, new LazyParcelable((Parcelable) new ListWrapper((List) obj)));
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        return ((List) obj).equals((List) obj2);
    }

    /* compiled from: PG */
    public final class ListWrapper implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C23270o();

        /* renamed from: a */
        public List f63736a;

        /* renamed from: b */
        public List f63737b;

        public ListWrapper(List list) {
            this.f63736a = list;
        }

        public ListWrapper(List list, byte[] bArr) {
            this.f63736a = null;
            this.f63737b = list;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            if (this.f63737b == null) {
                C23087a aVar = new C23087a();
                List<C62942bv> list = this.f63736a;
                list.getClass();
                for (C62942bv a : list) {
                    aVar.mo28530a(C23245b.m43556a(a));
                }
                this.f63737b = new C23088b(aVar.f63434a);
            }
            List list2 = this.f63737b;
            list2.getClass();
            parcel.writeInt(list2.size());
            List<ProtoParcelable> list3 = this.f63737b;
            list3.getClass();
            for (ProtoParcelable writeValue : list3) {
                parcel.writeValue(writeValue);
            }
        }
    }
}

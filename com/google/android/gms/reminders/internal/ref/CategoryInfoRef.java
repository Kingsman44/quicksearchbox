package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145830b;
import com.google.android.gms.reminders.model.CategoryInfo;
import com.google.android.gms.reminders.model.CategoryInfoEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public class CategoryInfoRef extends C145815a implements CategoryInfo {
    public CategoryInfoRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: k */
    public static boolean m237159k(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo119320d(m237273v(str, "category_id"), i, i2) && dataHolder.mo119320d(m237273v(str, "place_types"), i, i2) && dataHolder.mo119320d(m237273v(str, "display_name"), i, i2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CategoryInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return CategoryInfoEntity.m237315c(this, (CategoryInfo) obj);
    }

    /* renamed from: h */
    public final String mo121978h() {
        return mo119337kv(mo122100u("category_id"));
    }

    public final int hashCode() {
        return CategoryInfoEntity.m237314b(this);
    }

    /* renamed from: i */
    public final String mo121979i() {
        return mo119337kv(mo122100u("display_name"));
    }

    /* renamed from: j */
    public final List mo121980j() {
        ArrayList arrayList = new ArrayList();
        String kv = mo119337kv(mo122100u("place_types"));
        if (!TextUtils.isEmpty(kv)) {
            TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
            simpleStringSplitter.setString(kv);
            Iterator<String> it = simpleStringSplitter.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145830b.m237575a(new CategoryInfoEntity(this), parcel);
    }
}

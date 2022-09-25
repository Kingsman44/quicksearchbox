package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.wearable.C146528k;
import com.google.android.gms.wearable.C146529l;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public class DataItemParcelable extends AbstractSafeParcelable implements C146528k {
    public static final Parcelable.Creator CREATOR = new C146426ak();

    /* renamed from: a */
    public final Uri f395571a;

    /* renamed from: b */
    public byte[] f395572b;

    /* renamed from: c */
    private final Map f395573c;

    public DataItemParcelable(Uri uri, Bundle bundle, byte[] bArr) {
        this.f395571a = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        C143919bh.m233958a(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            C143919bh.m233958a(parcelable);
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.f395573c = hashMap;
        this.f395572b = bArr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: b */
    public final Uri mo123132b() {
        throw null;
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    public final String toString() {
        Object obj;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f395572b;
        if (bArr == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(bArr.length);
        }
        sb.append(",dataSz=".concat(obj.toString()));
        int size = this.f395573c.size();
        sb.append(", numAssets=" + size);
        sb.append(", uri=".concat(String.valueOf(String.valueOf(this.f395571a))));
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.f395573c.keySet()) {
            String valueOf = String.valueOf(this.f395573c.get(str));
            sb.append("\n    " + str + ": " + valueOf);
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f395571a, i);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        C143919bh.m233958a(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.f395573c.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((C146529l) entry.getValue()));
        }
        C143947c.m234093l(parcel, 4, bundle);
        C143947c.m234094m(parcel, 5, this.f395572b);
        C143947c.m234083b(parcel, a);
    }
}

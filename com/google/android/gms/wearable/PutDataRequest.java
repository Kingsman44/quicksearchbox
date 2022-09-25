package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public class PutDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146533p();

    /* renamed from: e */
    private static final long f395478e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final Uri f395479a;

    /* renamed from: b */
    public final Bundle f395480b;

    /* renamed from: c */
    public byte[] f395481c;

    /* renamed from: d */
    public long f395482d;

    static {
        new SecureRandom();
    }

    public PutDataRequest(Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.f395479a = uri;
        this.f395480b = bundle;
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        C143919bh.m233958a(classLoader);
        bundle.setClassLoader(classLoader);
        this.f395481c = bArr;
        this.f395482d = j;
    }

    /* renamed from: a */
    public static PutDataRequest m238328a(String str) {
        C143919bh.m233971n(str, "path must not be null");
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        } else if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        } else if (!str.startsWith("//")) {
            return m238329b(new Uri.Builder().scheme("wear").path(str).build());
        } else {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
    }

    /* renamed from: b */
    public static PutDataRequest m238329b(Uri uri) {
        C143919bh.m233971n(uri, "uri must not be null");
        return new PutDataRequest(uri, new Bundle(), (byte[]) null, f395478e);
    }

    /* renamed from: c */
    public final Map mo123078c() {
        HashMap hashMap = new HashMap();
        for (String str : this.f395480b.keySet()) {
            hashMap.put(str, (Asset) this.f395480b.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final void mo123079d(String str, Asset asset) {
        C143919bh.m233958a(str);
        C143919bh.m233958a(asset);
        this.f395480b.putParcelable(str, asset);
    }

    public final String toString() {
        Object obj;
        boolean isLoggable = Log.isLoggable("DataMap", 3);
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.f395481c;
        if (bArr == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(bArr.length);
        }
        sb.append("dataSz=".concat(obj.toString()));
        int size = this.f395480b.size();
        sb.append(", numAssets=" + size);
        sb.append(", uri=".concat(String.valueOf(String.valueOf(this.f395479a))));
        long j = this.f395482d;
        sb.append(", syncDeadline=" + j);
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.f395480b.keySet()) {
            String valueOf = String.valueOf(this.f395480b.getParcelable(str));
            sb.append("\n    " + str + ": " + valueOf);
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C143919bh.m233971n(parcel, "dest must not be null");
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f395479a, i);
        C143947c.m234093l(parcel, 4, this.f395480b);
        C143947c.m234094m(parcel, 5, this.f395481c);
        C143947c.m234090i(parcel, 6, this.f395482d);
        C143947c.m234083b(parcel, a);
    }
}

package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.common.util.C144011k;
import com.google.android.googlequicksearchbox.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145022f();

    /* renamed from: a */
    public String f392016a;

    public MapStyleOptions(String str) {
        C143919bh.m233971n(str, "json must not be null");
        this.f392016a = str;
    }

    /* renamed from: a */
    public static MapStyleOptions m235676a(Context context) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream openRawResource = context.getResources().openRawResource(R.raw.map_style);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openRawResource.read(bArr, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    C144011k.m234190a(openRawResource);
                    C144011k.m234190a(byteArrayOutputStream);
                    return new MapStyleOptions(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                }
            }
        } catch (IOException e) {
            throw new Resources.NotFoundException("Failed to read resource 2132017454: ".concat(e.toString()));
        } catch (Throwable th) {
            C144011k.m234190a(openRawResource);
            C144011k.m234190a(byteArrayOutputStream);
            throw th;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f392016a);
        C143947c.m234083b(parcel, a);
    }
}

package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.common.util.C144012l;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: PG */
public class SessionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143372bc();

    /* renamed from: a */
    public final MediaLoadRequestData f388733a;

    /* renamed from: b */
    String f388734b;

    /* renamed from: c */
    private final JSONObject f388735c;

    public SessionState(MediaLoadRequestData mediaLoadRequestData, JSONObject jSONObject) {
        this.f388733a = mediaLoadRequestData;
        this.f388735c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionState)) {
            return false;
        }
        SessionState sessionState = (SessionState) obj;
        if (!C144012l.m234191a(this.f388735c, sessionState.f388735c)) {
            return false;
        }
        return C143912ba.m233950b(this.f388733a, sessionState.f388733a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f388733a, String.valueOf(this.f388735c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f388735c;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f388734b = str;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f388733a, i);
        C143947c.m234106y(parcel, 3, this.f388734b);
        C143947c.m234083b(parcel, a);
    }
}

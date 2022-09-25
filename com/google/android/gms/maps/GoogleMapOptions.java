package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.maps.model.C145018b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.p10845a.C144996a;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import java.util.ArrayList;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C145006c();

    /* renamed from: t */
    private static final Integer f391967t = Integer.valueOf(Color.argb(PrivateKeyType.INVALID, 236, 233, 225));

    /* renamed from: a */
    public Boolean f391968a;

    /* renamed from: b */
    public Boolean f391969b;

    /* renamed from: c */
    public int f391970c = -1;

    /* renamed from: d */
    public CameraPosition f391971d;

    /* renamed from: e */
    public Boolean f391972e;

    /* renamed from: f */
    public Boolean f391973f;

    /* renamed from: g */
    public Boolean f391974g;

    /* renamed from: h */
    public Boolean f391975h;

    /* renamed from: i */
    public Boolean f391976i;

    /* renamed from: j */
    public Boolean f391977j;

    /* renamed from: k */
    public Boolean f391978k;

    /* renamed from: l */
    public Boolean f391979l;

    /* renamed from: m */
    public Boolean f391980m;

    /* renamed from: n */
    public Float f391981n = null;

    /* renamed from: o */
    public Float f391982o = null;

    /* renamed from: p */
    public LatLngBounds f391983p = null;

    /* renamed from: q */
    public Boolean f391984q;

    /* renamed from: r */
    public Integer f391985r = null;

    /* renamed from: s */
    public String f391986s = null;

    public GoogleMapOptions() {
    }

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str) {
        this.f391968a = C144996a.m235661b(b);
        this.f391969b = C144996a.m235661b(b2);
        this.f391970c = i;
        this.f391971d = cameraPosition;
        this.f391972e = C144996a.m235661b(b3);
        this.f391973f = C144996a.m235661b(b4);
        this.f391974g = C144996a.m235661b(b5);
        this.f391975h = C144996a.m235661b(b6);
        this.f391976i = C144996a.m235661b(b7);
        this.f391977j = C144996a.m235661b(b8);
        this.f391978k = C144996a.m235661b(b9);
        this.f391979l = C144996a.m235661b(b10);
        this.f391980m = C144996a.m235661b(b11);
        this.f391981n = f;
        this.f391982o = f2;
        this.f391983p = latLngBounds;
        this.f391984q = C144996a.m235661b(b12);
        this.f391985r = num;
        this.f391986s = str;
    }

    /* renamed from: a */
    public static GoogleMapOptions m235658a(Context context, AttributeSet attributeSet) {
        String string;
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C145014k.f392006a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(15)) {
            googleMapOptions.f391970c = obtainAttributes.getInt(15, -1);
        }
        if (obtainAttributes.hasValue(25)) {
            googleMapOptions.f391968a = Boolean.valueOf(obtainAttributes.getBoolean(25, false));
        }
        if (obtainAttributes.hasValue(24)) {
            googleMapOptions.f391969b = Boolean.valueOf(obtainAttributes.getBoolean(24, false));
        }
        if (obtainAttributes.hasValue(16)) {
            googleMapOptions.f391973f = Boolean.valueOf(obtainAttributes.getBoolean(16, true));
        }
        if (obtainAttributes.hasValue(18)) {
            googleMapOptions.f391977j = Boolean.valueOf(obtainAttributes.getBoolean(18, true));
        }
        if (obtainAttributes.hasValue(20)) {
            googleMapOptions.f391984q = Boolean.valueOf(obtainAttributes.getBoolean(20, true));
        }
        if (obtainAttributes.hasValue(19)) {
            googleMapOptions.f391974g = Boolean.valueOf(obtainAttributes.getBoolean(19, true));
        }
        if (obtainAttributes.hasValue(21)) {
            googleMapOptions.f391976i = Boolean.valueOf(obtainAttributes.getBoolean(21, true));
        }
        if (obtainAttributes.hasValue(23)) {
            googleMapOptions.f391975h = Boolean.valueOf(obtainAttributes.getBoolean(23, true));
        }
        if (obtainAttributes.hasValue(22)) {
            googleMapOptions.f391972e = Boolean.valueOf(obtainAttributes.getBoolean(22, true));
        }
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.f391978k = Boolean.valueOf(obtainAttributes.getBoolean(13, false));
        }
        if (obtainAttributes.hasValue(17)) {
            googleMapOptions.f391979l = Boolean.valueOf(obtainAttributes.getBoolean(17, true));
        }
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.f391980m = Boolean.valueOf(obtainAttributes.getBoolean(0, false));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.f391981n = Float.valueOf(obtainAttributes.getFloat(4, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.f391982o = Float.valueOf(obtainAttributes.getFloat(3, Float.POSITIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(1)) {
            googleMapOptions.f391985r = Integer.valueOf(obtainAttributes.getColor(1, f391967t.intValue()));
        }
        if (obtainAttributes.hasValue(14) && (string = obtainAttributes.getString(14)) != null && !string.isEmpty()) {
            googleMapOptions.f391986s = string;
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, C145014k.f392006a);
        float f = 0.0f;
        Float valueOf = obtainAttributes2.hasValue(11) ? Float.valueOf(obtainAttributes2.getFloat(11, 0.0f)) : null;
        Float valueOf2 = obtainAttributes2.hasValue(12) ? Float.valueOf(obtainAttributes2.getFloat(12, 0.0f)) : null;
        Float valueOf3 = obtainAttributes2.hasValue(9) ? Float.valueOf(obtainAttributes2.getFloat(9, 0.0f)) : null;
        Float valueOf4 = obtainAttributes2.hasValue(10) ? Float.valueOf(obtainAttributes2.getFloat(10, 0.0f)) : null;
        obtainAttributes2.recycle();
        if (!(valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null)) {
            latLngBounds = new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
        }
        googleMapOptions.f391983p = latLngBounds;
        TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, C145014k.f392006a);
        LatLng latLng = new LatLng((double) (obtainAttributes3.hasValue(5) ? obtainAttributes3.getFloat(5, 0.0f) : 0.0f), (double) (obtainAttributes3.hasValue(6) ? obtainAttributes3.getFloat(6, 0.0f) : 0.0f));
        float f2 = obtainAttributes3.hasValue(8) ? obtainAttributes3.getFloat(8, 0.0f) : 0.0f;
        float f3 = obtainAttributes3.hasValue(2) ? obtainAttributes3.getFloat(2, 0.0f) : 0.0f;
        if (obtainAttributes3.hasValue(7)) {
            f = obtainAttributes3.getFloat(7, 0.0f);
        }
        obtainAttributes3.recycle();
        googleMapOptions.f391971d = C145018b.m235677a(latLng, f2, f, f3);
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("MapType", Integer.valueOf(this.f391970c), arrayList);
        C143910az.m233947b("LiteMode", this.f391978k, arrayList);
        C143910az.m233947b(MediaUtilities.CAMERA_FOLDER, this.f391971d, arrayList);
        C143910az.m233947b("CompassEnabled", this.f391973f, arrayList);
        C143910az.m233947b("ZoomControlsEnabled", this.f391972e, arrayList);
        C143910az.m233947b("ScrollGesturesEnabled", this.f391974g, arrayList);
        C143910az.m233947b("ZoomGesturesEnabled", this.f391975h, arrayList);
        C143910az.m233947b("TiltGesturesEnabled", this.f391976i, arrayList);
        C143910az.m233947b("RotateGesturesEnabled", this.f391977j, arrayList);
        C143910az.m233947b("ScrollGesturesEnabledDuringRotateOrZoom", this.f391984q, arrayList);
        C143910az.m233947b("MapToolbarEnabled", this.f391979l, arrayList);
        C143910az.m233947b("AmbientEnabled", this.f391980m, arrayList);
        C143910az.m233947b("MinZoomPreference", this.f391981n, arrayList);
        C143910az.m233947b("MaxZoomPreference", this.f391982o, arrayList);
        C143910az.m233947b("BackgroundColor", this.f391985r, arrayList);
        C143910az.m233947b("LatLngBoundsForCameraTarget", this.f391983p, arrayList);
        C143910az.m233947b("ZOrderOnTop", this.f391968a, arrayList);
        C143910az.m233947b("UseViewLifecycleInFragment", this.f391969b, arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234085d(parcel, 2, C144996a.m235660a(this.f391968a));
        C143947c.m234085d(parcel, 3, C144996a.m235660a(this.f391969b));
        C143947c.m234089h(parcel, 4, this.f391970c);
        C143947c.m234105x(parcel, 5, this.f391971d, i);
        C143947c.m234085d(parcel, 6, C144996a.m235660a(this.f391972e));
        C143947c.m234085d(parcel, 7, C144996a.m235660a(this.f391973f));
        C143947c.m234085d(parcel, 8, C144996a.m235660a(this.f391974g));
        C143947c.m234085d(parcel, 9, C144996a.m235660a(this.f391975h));
        C143947c.m234085d(parcel, 10, C144996a.m235660a(this.f391976i));
        C143947c.m234085d(parcel, 11, C144996a.m235660a(this.f391977j));
        C143947c.m234085d(parcel, 12, C144996a.m235660a(this.f391978k));
        C143947c.m234085d(parcel, 14, C144996a.m235660a(this.f391979l));
        C143947c.m234085d(parcel, 15, C144996a.m235660a(this.f391980m));
        C143947c.m234097p(parcel, 16, this.f391981n);
        C143947c.m234097p(parcel, 17, this.f391982o);
        C143947c.m234105x(parcel, 18, this.f391983p, i);
        C143947c.m234085d(parcel, 19, C144996a.m235660a(this.f391984q));
        C143947c.m234101t(parcel, 20, this.f391985r);
        C143947c.m234106y(parcel, 21, this.f391986s);
        C143947c.m234083b(parcel, a);
    }
}

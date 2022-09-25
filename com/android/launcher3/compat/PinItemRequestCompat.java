package com.android.launcher3.compat;

import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.launcher3.Utilities;

/* compiled from: PG */
public class PinItemRequestCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public PinItemRequestCompat createFromParcel(Parcel parcel) {
            return new PinItemRequestCompat(parcel.readParcelable((ClassLoader) null));
        }

        public PinItemRequestCompat[] newArray(int i) {
            return new PinItemRequestCompat[i];
        }
    };
    public static final String EXTRA_PIN_ITEM_REQUEST = "android.content.pm.extra.PIN_ITEM_REQUEST";
    public static final int REQUEST_TYPE_APPWIDGET = 2;
    public static final int REQUEST_TYPE_SHORTCUT = 1;
    private final Parcelable mObject;

    private PinItemRequestCompat(Parcelable parcelable) {
        this.mObject = parcelable;
    }

    public static PinItemRequestCompat getPinItemRequest(Intent intent) {
        Parcelable parcelableExtra;
        if (Utilities.ATLEAST_O && (parcelableExtra = intent.getParcelableExtra(EXTRA_PIN_ITEM_REQUEST)) != null) {
            return new PinItemRequestCompat(parcelableExtra);
        }
        return null;
    }

    private Object invokeMethod(String str) {
        try {
            return this.mObject.getClass().getDeclaredMethod(str, new Class[0]).invoke(this.mObject, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean accept() {
        return ((Boolean) invokeMethod("accept")).booleanValue();
    }

    public int describeContents() {
        return 0;
    }

    public AppWidgetProviderInfo getAppWidgetProviderInfo(Context context) {
        try {
            return (AppWidgetProviderInfo) this.mObject.getClass().getDeclaredMethod("getAppWidgetProviderInfo", new Class[]{Context.class}).invoke(this.mObject, new Object[]{context});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Bundle getExtras() {
        try {
            return (Bundle) this.mObject.getClass().getDeclaredMethod("getExtras", new Class[0]).invoke(this.mObject, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public int getRequestType() {
        return ((Integer) invokeMethod("getRequestType")).intValue();
    }

    public ShortcutInfo getShortcutInfo() {
        return (ShortcutInfo) invokeMethod("getShortcutInfo");
    }

    public boolean isValid() {
        return ((Boolean) invokeMethod("isValid")).booleanValue();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mObject, i);
    }

    public boolean accept(Bundle bundle) {
        try {
            return ((Boolean) this.mObject.getClass().getDeclaredMethod("accept", new Class[]{Bundle.class}).invoke(this.mObject, new Object[]{bundle})).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

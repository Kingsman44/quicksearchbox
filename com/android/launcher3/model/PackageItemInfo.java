package com.android.launcher3.model;

import android.graphics.Bitmap;
import com.android.launcher3.ItemInfo;
import java.util.Arrays;

/* compiled from: PG */
public final class PackageItemInfo extends ItemInfo {
    public Bitmap iconBitmap;
    public final String packageName;
    public String titleSectionName;
    public boolean usingLowResIcon;

    public PackageItemInfo(String str) {
        this.packageName = str;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.title);
        long j = this.f16556id;
        int i = this.itemType;
        long j2 = this.container;
        long j3 = this.screenId;
        int i2 = this.cellX;
        int i3 = this.cellY;
        int i4 = this.spanX;
        int i5 = this.spanY;
        String arrays = Arrays.toString((int[]) null);
        String valueOf2 = String.valueOf(this.user);
        return "PackageItemInfo(title=" + valueOf + " id=" + j + " type=" + i + " container=" + j2 + " screen=" + j3 + " cellX=" + i2 + " cellY=" + i3 + " spanX=" + i4 + " spanY=" + i5 + " dropPos=" + arrays + " user=" + valueOf2 + ")";
    }
}

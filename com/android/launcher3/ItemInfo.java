package com.android.launcher3;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.compat.UserManagerCompat;
import java.util.Arrays;

/* compiled from: PG */
public class ItemInfo {
    public int cellX;
    public int cellY;
    public long container;
    public CharSequence contentDescription;
    public int[] dropPos;

    /* renamed from: id */
    public long f16556id;
    public int itemType;
    public int minSpanX;
    public int minSpanY;
    public int rank;
    public boolean requiresDbUpdate;
    public long screenId;
    public int spanX;
    public int spanY;
    public CharSequence title;
    public UserHandleCompat user;

    public ItemInfo() {
        this.f16556id = -1;
        this.container = -1;
        this.screenId = -1;
        this.cellX = -1;
        this.cellY = -1;
        this.spanX = 1;
        this.spanY = 1;
        this.minSpanX = 1;
        this.minSpanY = 1;
        this.rank = 0;
        this.requiresDbUpdate = false;
        this.dropPos = null;
        this.user = UserHandleCompat.myUserHandle();
    }

    static void writeBitmap(ContentValues contentValues, Bitmap bitmap) {
        if (bitmap != null) {
            contentValues.put("icon", Utilities.flattenBitmap(bitmap));
        }
    }

    public final void copyFrom(ItemInfo itemInfo) {
        this.f16556id = itemInfo.f16556id;
        this.cellX = itemInfo.cellX;
        this.cellY = itemInfo.cellY;
        this.spanX = itemInfo.spanX;
        this.spanY = itemInfo.spanY;
        this.rank = itemInfo.rank;
        this.screenId = itemInfo.screenId;
        this.itemType = itemInfo.itemType;
        this.container = itemInfo.container;
        this.user = itemInfo.user;
        this.contentDescription = itemInfo.contentDescription;
    }

    public Intent getIntent() {
        return null;
    }

    public ComponentName getTargetComponent() {
        if (getIntent() == null) {
            return null;
        }
        return getIntent().getComponent();
    }

    public boolean isDisabled() {
        return false;
    }

    public void onAddToDatabase(Context context, ContentValues contentValues) {
        contentValues.put("itemType", Integer.valueOf(this.itemType));
        contentValues.put("container", Long.valueOf(this.container));
        contentValues.put("screen", Long.valueOf(this.screenId));
        contentValues.put("cellX", Integer.valueOf(this.cellX));
        contentValues.put("cellY", Integer.valueOf(this.cellY));
        contentValues.put("spanX", Integer.valueOf(this.spanX));
        contentValues.put("spanY", Integer.valueOf(this.spanY));
        contentValues.put("rank", Integer.valueOf(this.rank));
        contentValues.put("profileId", Long.valueOf(UserManagerCompat.getInstance(context).getSerialNumberForUser(this.user)));
        if (this.screenId == -201) {
            throw new RuntimeException("Screen id should not be EXTRA_EMPTY_SCREEN_ID");
        }
    }

    public String toString() {
        long j = this.f16556id;
        int i = this.itemType;
        long j2 = this.container;
        long j3 = this.screenId;
        int i2 = this.cellX;
        int i3 = this.cellY;
        int i4 = this.spanX;
        int i5 = this.spanY;
        String arrays = Arrays.toString((int[]) null);
        String valueOf = String.valueOf(this.user);
        return "Item(id=" + j + " type=" + i + " container=" + j2 + " screen=" + j3 + " cellX=" + i2 + " cellY=" + i3 + " spanX=" + i4 + " spanY=" + i5 + " dropPos=" + arrays + " user=" + valueOf + ")";
    }

    public void unbind() {
    }

    public ItemInfo(ItemInfo itemInfo) {
        this.f16556id = -1;
        this.container = -1;
        this.screenId = -1;
        this.cellX = -1;
        this.cellY = -1;
        this.spanX = 1;
        this.spanY = 1;
        this.minSpanX = 1;
        this.minSpanY = 1;
        this.rank = 0;
        this.requiresDbUpdate = false;
        this.dropPos = null;
        copyFrom(itemInfo);
        LauncherModel.checkItemInfo(this);
    }
}

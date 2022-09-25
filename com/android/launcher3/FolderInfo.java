package com.android.launcher3;

import android.content.ContentValues;
import android.content.Context;
import com.android.launcher3.compat.UserHandleCompat;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public final class FolderInfo extends ItemInfo {
    public final ArrayList contents = new ArrayList();
    final ArrayList listeners = new ArrayList();
    boolean opened;
    public int options;

    /* compiled from: PG */
    interface FolderListener {
        void onAdd(ShortcutInfo shortcutInfo);

        void onItemsChanged();

        void onRemove(ShortcutInfo shortcutInfo);

        void onTitleChanged(CharSequence charSequence);
    }

    public FolderInfo() {
        this.itemType = 2;
        this.user = UserHandleCompat.myUserHandle();
    }

    public final void add(ShortcutInfo shortcutInfo) {
        this.contents.add(shortcutInfo);
        for (int i = 0; i < this.listeners.size(); i++) {
            ((FolderListener) this.listeners.get(i)).onAdd(shortcutInfo);
        }
        itemsChanged();
    }

    public final boolean hasOption(int i) {
        return (i & this.options) != 0;
    }

    /* access modifiers changed from: package-private */
    public final void itemsChanged() {
        for (int i = 0; i < this.listeners.size(); i++) {
            ((FolderListener) this.listeners.get(i)).onItemsChanged();
        }
    }

    public final void onAddToDatabase(Context context, ContentValues contentValues) {
        super.onAddToDatabase(context, contentValues);
        contentValues.put("title", this.title.toString());
        contentValues.put("options", Integer.valueOf(this.options));
    }

    public final void remove(ShortcutInfo shortcutInfo) {
        this.contents.remove(shortcutInfo);
        for (int i = 0; i < this.listeners.size(); i++) {
            ((FolderListener) this.listeners.get(i)).onRemove(shortcutInfo);
        }
        itemsChanged();
    }

    public final void setOption(int i, boolean z, Context context) {
        int i2 = this.options;
        int i3 = z ? i | i2 : (i ^ -1) & i2;
        this.options = i3;
        if (context != null && i2 != i3) {
            LauncherModel.updateItemInDatabase(context, this);
        }
    }

    public final String toString() {
        long j = this.f16556id;
        int i = this.itemType;
        long j2 = this.container;
        long j3 = this.screenId;
        int i2 = this.cellX;
        int i3 = this.cellY;
        int i4 = this.spanX;
        int i5 = this.spanY;
        String arrays = Arrays.toString((int[]) null);
        return "FolderInfo(id=" + j + " type=" + i + " container=" + j2 + " screen=" + j3 + " cellX=" + i2 + " cellY=" + i3 + " spanX=" + i4 + " spanY=" + i5 + " dropPos=" + arrays + ")";
    }

    public final void unbind() {
        this.listeners.clear();
    }
}

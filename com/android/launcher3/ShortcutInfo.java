package com.android.launcher3;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.launcher3.compat.DeferredLauncherActivityInfo;
import com.android.launcher3.compat.LauncherActivityInfoCompat;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.android.launcher3.shortcuts.ShortcutInfoCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: PG */
public class ShortcutInfo extends ItemInfo {
    public boolean customIcon;
    CharSequence disabledMessage;
    int flags = 0;
    public Intent.ShortcutIconResource iconResource;
    Intent intent;
    int isDisabled = 0;
    public Bitmap mIcon;
    public int mInstallProgress;
    Intent promisedIntent;
    int status;
    boolean usingFallbackIcon;
    boolean usingLowResIcon;

    public ShortcutInfo() {
        this.itemType = 1;
    }

    /* access modifiers changed from: protected */
    public Bitmap getBadgedIcon(Bitmap bitmap, ShortcutInfoCompat shortcutInfoCompat, IconCache iconCache, Context context) {
        Bitmap addShadowToIcon = Utilities.addShadowToIcon(bitmap);
        AppInfo appInfo = new AppInfo();
        appInfo.user = this.user;
        appInfo.componentName = shortcutInfoCompat.getActivity();
        try {
            iconCache.getTitleAndIcon(appInfo, new DeferredLauncherActivityInfo(shortcutInfoCompat.getActivity(), shortcutInfoCompat.getUserHandle(), context), false);
            Utilities.badgeWithBitmap$ar$ds(addShadowToIcon, appInfo.iconBitmap, context);
            return addShadowToIcon;
        } catch (NullPointerException unused) {
            return Utilities.badgeIconForUser(addShadowToIcon, this.user, context);
        }
    }

    public final String getDeepShortcutId() {
        if (this.itemType == 6) {
            return getPromisedIntent().getStringExtra("shortcut_id");
        }
        return null;
    }

    public final Bitmap getIcon(IconCache iconCache) {
        if (this.mIcon == null) {
            updateIcon(iconCache, shouldUseLowResIcon());
        }
        return this.mIcon;
    }

    public final Intent getIntent() {
        return this.intent;
    }

    public final Intent getPromisedIntent() {
        Intent intent2 = this.promisedIntent;
        return intent2 != null ? intent2 : this.intent;
    }

    public final ComponentName getTargetComponent() {
        Intent intent2 = this.promisedIntent;
        if (intent2 == null) {
            intent2 = this.intent;
        }
        return intent2.getComponent();
    }

    public final boolean hasStatusFlag(int i) {
        return (i & this.status) != 0;
    }

    public final boolean isDisabled() {
        return this.isDisabled != 0;
    }

    public final void onAddToDatabase(Context context, ContentValues contentValues) {
        super.onAddToDatabase(context, contentValues);
        CharSequence charSequence = this.title;
        String str = null;
        contentValues.put("title", charSequence != null ? charSequence.toString() : null);
        Intent intent2 = this.promisedIntent;
        if (intent2 != null) {
            str = intent2.toUri(0);
        } else {
            Intent intent3 = this.intent;
            if (intent3 != null) {
                str = intent3.toUri(0);
            }
        }
        contentValues.put("intent", str);
        contentValues.put("restored", Integer.valueOf(this.status));
        if (this.customIcon) {
            contentValues.put("iconType", 1);
            writeBitmap(contentValues, this.mIcon);
            return;
        }
        if (!this.usingFallbackIcon) {
            writeBitmap(contentValues, this.mIcon);
        }
        if (this.iconResource != null) {
            contentValues.put("iconType", 0);
            contentValues.put("iconPackage", this.iconResource.packageName);
            contentValues.put("iconResource", this.iconResource.resourceName);
        }
    }

    public final void setInstallProgress(int i) {
        this.mInstallProgress = i;
        this.status |= 4;
    }

    public final boolean shouldUseLowResIcon() {
        return this.usingLowResIcon && this.container >= 0 && this.rank >= 3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.title);
        String valueOf2 = String.valueOf(this.intent);
        long j = this.f16556id;
        int i = this.itemType;
        long j2 = this.container;
        long j3 = this.screenId;
        int i2 = this.cellX;
        int i3 = this.cellY;
        int i4 = this.spanX;
        int i5 = this.spanY;
        String arrays = Arrays.toString((int[]) null);
        return "ShortcutInfo(title=" + valueOf + "intent=" + valueOf2 + "id=" + j + " type=" + i + " container=" + j2 + " screen=" + j3 + " cellX=" + i2 + " cellY=" + i3 + " spanX=" + i4 + " spanY=" + i5 + " dropPos=" + arrays + " user=" + String.valueOf(this.user) + ")";
    }

    public final void updateFromDeepShortcutInfo(ShortcutInfoCompat shortcutInfoCompat, Context context) {
        CharSequence charSequence;
        Bitmap bitmap;
        this.intent = shortcutInfoCompat.makeIntent(context);
        this.title = shortcutInfoCompat.getShortLabel();
        CharSequence longLabel = shortcutInfoCompat.getLongLabel();
        if (TextUtils.isEmpty(longLabel)) {
            longLabel = shortcutInfoCompat.getShortLabel();
        }
        this.contentDescription = UserManagerCompat.getInstance(context).getBadgedLabelForUser(longLabel, this.user);
        if (shortcutInfoCompat.isEnabled()) {
            this.isDisabled &= -17;
        } else {
            this.isDisabled |= 16;
        }
        try {
            charSequence = (CharSequence) shortcutInfoCompat.mShortcutInfoClass.getMethod("getDisabledMessage", new Class[0]).invoke(shortcutInfoCompat.mShortcutInfo, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            charSequence = null;
        }
        this.disabledMessage = charSequence;
        LauncherAppState instance = LauncherAppState.getInstance();
        Drawable shortcutIconDrawable = instance.mDeepShortcutManager.getShortcutIconDrawable(shortcutInfoCompat, instance.mInvariantDeviceProfile.fillResIconDpi);
        IconCache iconCache = instance.mIconCache;
        if (shortcutIconDrawable == null) {
            bitmap = iconCache.getDefaultIcon(UserHandleCompat.myUserHandle());
        } else {
            bitmap = Utilities.createScaledBitmapWithoutShadow(shortcutIconDrawable, context);
        }
        this.mIcon = getBadgedIcon(bitmap, shortcutInfoCompat, iconCache, context);
    }

    public final void updateIcon(IconCache iconCache, boolean z) {
        if (this.itemType == 0) {
            Intent intent2 = this.promisedIntent;
            if (intent2 == null) {
                intent2 = this.intent;
            }
            iconCache.getTitleAndIcon(this, intent2, this.user, z);
        }
    }

    public ShortcutInfo(AppInfo appInfo) {
        super(appInfo);
        this.title = Utilities.trim(appInfo.title);
        this.intent = new Intent(appInfo.intent);
        this.customIcon = false;
        this.flags = appInfo.flags;
        this.isDisabled = appInfo.isDisabled;
    }

    public ShortcutInfo(ShortcutInfo shortcutInfo) {
        super(shortcutInfo);
        this.title = shortcutInfo.title;
        this.intent = new Intent(shortcutInfo.intent);
        this.iconResource = shortcutInfo.iconResource;
        this.mIcon = shortcutInfo.mIcon;
        this.flags = shortcutInfo.flags;
        this.status = shortcutInfo.status;
        this.mInstallProgress = shortcutInfo.mInstallProgress;
        this.isDisabled = shortcutInfo.isDisabled;
        this.usingFallbackIcon = shortcutInfo.usingFallbackIcon;
    }

    public ShortcutInfo(LauncherActivityInfoCompat launcherActivityInfoCompat, Context context) {
        this.user = launcherActivityInfoCompat.getUser();
        this.title = Utilities.trim(launcherActivityInfoCompat.getLabel());
        this.contentDescription = UserManagerCompat.getInstance(context).getBadgedLabelForUser(launcherActivityInfoCompat.getLabel(), launcherActivityInfoCompat.getUser());
        this.intent = AppInfo.makeLaunchIntent(context, launcherActivityInfoCompat, launcherActivityInfoCompat.getUser());
        this.itemType = 0;
        this.flags = AppInfo.initFlags(launcherActivityInfoCompat);
    }

    public ShortcutInfo(ShortcutInfoCompat shortcutInfoCompat, Context context) {
        this.user = shortcutInfoCompat.getUserHandle();
        this.itemType = 6;
        this.flags = 0;
        updateFromDeepShortcutInfo(shortcutInfoCompat, context);
    }
}

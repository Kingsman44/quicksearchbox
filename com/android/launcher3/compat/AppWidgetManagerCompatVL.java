package com.android.launcher3.compat;

import android.app.Activity;
import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.widget.Toast;
import com.android.launcher3.IconCache;
import com.android.launcher3.LauncherAppWidgetProviderInfo;
import com.android.launcher3.util.ComponentKey;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
class AppWidgetManagerCompatVL extends AppWidgetManagerCompat {
    private final PackageManager mPm;
    private final UserManager mUserManager;

    public AppWidgetManagerCompatVL(Context context) {
        super(context);
        this.mPm = context.getPackageManager();
        this.mUserManager = (UserManager) context.getSystemService("user");
    }

    public boolean bindAppWidgetIdIfAllowed(int i, AppWidgetProviderInfo appWidgetProviderInfo, Bundle bundle) {
        return this.mAppWidgetManager.bindAppWidgetIdIfAllowed(i, appWidgetProviderInfo.getProfile(), appWidgetProviderInfo.provider, bundle);
    }

    public LauncherAppWidgetProviderInfo findProvider(ComponentName componentName, UserHandleCompat userHandleCompat) {
        for (AppWidgetProviderInfo next : this.mAppWidgetManager.getInstalledProvidersForProfile(userHandleCompat.getUser())) {
            if (next.provider.equals(componentName)) {
                return LauncherAppWidgetProviderInfo.fromProviderInfo$ar$ds(next);
            }
        }
        return null;
    }

    public List getAllProviders() {
        ArrayList arrayList = new ArrayList();
        for (UserHandle installedProvidersForProfile : this.mUserManager.getUserProfiles()) {
            arrayList.addAll(this.mAppWidgetManager.getInstalledProvidersForProfile(installedProvidersForProfile));
        }
        return arrayList;
    }

    public HashMap getAllProvidersMap() {
        HashMap hashMap = new HashMap();
        for (UserHandle next : this.mUserManager.getUserProfiles()) {
            UserHandleCompat fromUser = UserHandleCompat.fromUser(next);
            for (AppWidgetProviderInfo next2 : this.mAppWidgetManager.getInstalledProvidersForProfile(next)) {
                hashMap.put(new ComponentKey(next2.provider, fromUser), next2);
            }
        }
        return hashMap;
    }

    public Bitmap getBadgeBitmap(LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo, Bitmap bitmap, int i, int i2) {
        boolean z = launcherAppWidgetProviderInfo.isCustomWidget;
        if (launcherAppWidgetProviderInfo.getProfile().equals(Process.myUserHandle())) {
            return bitmap;
        }
        Resources resources = this.mContext.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.profile_badge_minimum_top);
        int min = Math.min(resources.getDimensionPixelSize(R.dimen.profile_badge_size), Math.min(i, i2 - dimensionPixelSize));
        Rect rect = new Rect(0, 0, min, min);
        int max = Math.max(i2 - min, dimensionPixelSize);
        if (resources.getConfiguration().getLayoutDirection() == 1) {
            rect.offset(0, max);
        } else {
            rect.offset(bitmap.getWidth() - min, max);
        }
        Drawable userBadgedDrawableForDensity = this.mPm.getUserBadgedDrawableForDensity(new BitmapDrawable(resources, bitmap), launcherAppWidgetProviderInfo.getProfile(), rect, 0);
        if (userBadgedDrawableForDensity instanceof BitmapDrawable) {
            return ((BitmapDrawable) userBadgedDrawableForDensity).getBitmap();
        }
        bitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmap);
        userBadgedDrawableForDensity.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        userBadgedDrawableForDensity.draw(canvas);
        canvas.setBitmap((Bitmap) null);
        return bitmap;
    }

    public UserHandleCompat getUser(AppWidgetProviderInfo appWidgetProviderInfo) {
        return UserHandleCompat.fromUser(appWidgetProviderInfo.getProfile());
    }

    public Drawable loadIcon(LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo, IconCache iconCache) {
        return launcherAppWidgetProviderInfo.getIcon$ar$ds(this.mContext);
    }

    public String loadLabel(LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo) {
        return launcherAppWidgetProviderInfo.getLabel(this.mPm);
    }

    public Drawable loadPreview(AppWidgetProviderInfo appWidgetProviderInfo) {
        return appWidgetProviderInfo.loadPreviewImage(this.mContext, 0);
    }

    public void startConfigActivity(AppWidgetProviderInfo appWidgetProviderInfo, int i, Activity activity, AppWidgetHost appWidgetHost, int i2) {
        try {
            appWidgetHost.startAppWidgetConfigureActivityForResult(activity, i, 0, i2, (Bundle) null);
        } catch (ActivityNotFoundException | SecurityException unused) {
            Toast.makeText(activity, R.string.activity_not_found, 0).show();
        }
    }
}

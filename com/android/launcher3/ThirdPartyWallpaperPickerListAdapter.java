package com.android.launcher3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.android.launcher3.WallpaperPickerActivity;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public final class ThirdPartyWallpaperPickerListAdapter extends BaseAdapter implements ListAdapter {
    private final int mIconSize;
    private final LayoutInflater mInflater;
    private final PackageManager mPackageManager;
    private List mThirdPartyWallpaperPickers = new ArrayList();

    /* compiled from: PG */
    public final class ThirdPartyWallpaperTile extends WallpaperPickerActivity.WallpaperTileInfo {
        final ResolveInfo mResolveInfo;

        public ThirdPartyWallpaperTile(ResolveInfo resolveInfo) {
            this.mResolveInfo = resolveInfo;
        }

        public final void onClick(WallpaperPickerActivity wallpaperPickerActivity) {
            ComponentName componentName = new ComponentName(this.mResolveInfo.activityInfo.packageName, this.mResolveInfo.activityInfo.name);
            Intent intent = new Intent("android.intent.action.SET_WALLPAPER");
            intent.setComponent(componentName).putExtra("com.android.launcher3.WALLPAPER_OFFSET", wallpaperPickerActivity.mWallpaperParallaxOffset);
            Utilities.startActivityForResultSafely(wallpaperPickerActivity, intent, 6);
        }
    }

    public ThirdPartyWallpaperPickerListAdapter(Context context) {
        this.mInflater = LayoutInflater.from(context);
        PackageManager packageManager = context.getPackageManager();
        this.mPackageManager = packageManager;
        this.mIconSize = context.getResources().getDimensionPixelSize(R.dimen.wallpaperItemIconSize);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.SET_WALLPAPER"), 0);
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent, 0);
        ComponentName[] componentNameArr = new ComponentName[queryIntentActivities2.size()];
        for (int i = 0; i < queryIntentActivities2.size(); i++) {
            ActivityInfo activityInfo = queryIntentActivities2.get(i).activityInfo;
            componentNameArr[i] = new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        for (ResolveInfo next : queryIntentActivities) {
            String packageName = new ComponentName(next.activityInfo.packageName, next.activityInfo.name).getPackageName();
            if (!packageName.equals(context.getPackageName()) && !packageName.equals("com.android.launcher") && !packageName.equals("com.android.wallpaper.livepicker")) {
                Iterator<ResolveInfo> it = queryIntentActivities2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (packageName.equals(it.next().activityInfo.packageName)) {
                            break;
                        }
                    } else {
                        this.mThirdPartyWallpaperPickers.add(new ThirdPartyWallpaperTile(next));
                        break;
                    }
                }
            }
        }
    }

    public final int getCount() {
        return this.mThirdPartyWallpaperPickers.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return (ThirdPartyWallpaperTile) this.mThirdPartyWallpaperPickers.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.mInflater.inflate(R.layout.wallpaper_picker_third_party_item, viewGroup, false);
        }
        ResolveInfo resolveInfo = ((ThirdPartyWallpaperTile) this.mThirdPartyWallpaperPickers.get(i)).mResolveInfo;
        TextView textView = (TextView) view.findViewById(R.id.wallpaper_item_label);
        textView.setText(resolveInfo.loadLabel(this.mPackageManager));
        Drawable loadIcon = resolveInfo.loadIcon(this.mPackageManager);
        int i2 = this.mIconSize;
        loadIcon.setBounds(new Rect(0, 0, i2, i2));
        textView.setCompoundDrawables((Drawable) null, loadIcon, (Drawable) null, (Drawable) null);
        return view;
    }
}

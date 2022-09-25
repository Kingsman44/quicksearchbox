package com.android.launcher3;

import android.app.WallpaperInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.android.launcher3.WallpaperPickerActivity;
import com.google.android.googlequicksearchbox.R;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
public final class LiveWallpaperListAdapter extends BaseAdapter implements ListAdapter {
    private final LayoutInflater mInflater;
    private final PackageManager mPackageManager;
    final List mWallpapers = new ArrayList();

    /* compiled from: PG */
    final class LiveWallpaperEnumerator extends AsyncTask {
        private final Context mContext;
        private int mWallpaperPosition = 0;

        public LiveWallpaperEnumerator(Context context) {
            this.mContext = context;
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            doInBackground$ar$ds((List[]) objArr);
            return null;
        }

        /* access modifiers changed from: protected */
        public final void doInBackground$ar$ds(List... listArr) {
            final PackageManager packageManager = this.mContext.getPackageManager();
            List<ResolveInfo> list = listArr[0];
            Collections.sort(list, new Comparator() {
                final Collator mCollator = Collator.getInstance();

                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    return this.mCollator.compare(((ResolveInfo) obj).loadLabel(packageManager), ((ResolveInfo) obj2).loadLabel(packageManager));
                }
            });
            for (ResolveInfo resolveInfo : list) {
                try {
                    WallpaperInfo wallpaperInfo = new WallpaperInfo(this.mContext, resolveInfo);
                    Drawable loadThumbnail = wallpaperInfo.loadThumbnail(packageManager);
                    new Intent("android.service.wallpaper.WallpaperService").setClassName(wallpaperInfo.getPackageName(), wallpaperInfo.getServiceName());
                    publishProgress(new LiveWallpaperTile[]{new LiveWallpaperTile(loadThumbnail, wallpaperInfo)});
                } catch (XmlPullParserException e) {
                    Log.w("LiveWallpaperListAdapter", "Skipping wallpaper ".concat(String.valueOf(String.valueOf(resolveInfo.serviceInfo))), e);
                } catch (IOException e2) {
                    Log.w("LiveWallpaperListAdapter", "Skipping wallpaper ".concat(String.valueOf(String.valueOf(resolveInfo.serviceInfo))), e2);
                }
            }
            publishProgress(new LiveWallpaperTile[]{null});
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
            for (LiveWallpaperTile liveWallpaperTile : (LiveWallpaperTile[]) objArr) {
                if (liveWallpaperTile == null) {
                    LiveWallpaperListAdapter.this.notifyDataSetChanged();
                    return;
                }
                Drawable drawable = liveWallpaperTile.mThumbnail;
                if (drawable != null) {
                    drawable.setDither(true);
                }
                if (this.mWallpaperPosition < LiveWallpaperListAdapter.this.mWallpapers.size()) {
                    LiveWallpaperListAdapter.this.mWallpapers.set(this.mWallpaperPosition, liveWallpaperTile);
                } else {
                    LiveWallpaperListAdapter.this.mWallpapers.add(liveWallpaperTile);
                }
                this.mWallpaperPosition++;
            }
        }
    }

    /* compiled from: PG */
    public final class LiveWallpaperTile extends WallpaperPickerActivity.WallpaperTileInfo {
        final WallpaperInfo mInfo;
        final Drawable mThumbnail;

        public LiveWallpaperTile(Drawable drawable, WallpaperInfo wallpaperInfo) {
            this.mThumbnail = drawable;
            this.mInfo = wallpaperInfo;
        }

        public final void onClick(WallpaperPickerActivity wallpaperPickerActivity) {
            Intent intent = new Intent("android.service.wallpaper.CHANGE_LIVE_WALLPAPER");
            intent.putExtra("android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT", this.mInfo.getComponent());
            Utilities.startActivityForResultSafely(wallpaperPickerActivity, intent, 6);
        }
    }

    public LiveWallpaperListAdapter(Context context) {
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        PackageManager packageManager = context.getPackageManager();
        this.mPackageManager = packageManager;
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.service.wallpaper.WallpaperService"), 128);
        new LiveWallpaperEnumerator(context).execute(new List[]{queryIntentServices});
    }

    public final int getCount() {
        List list = this.mWallpapers;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return (LiveWallpaperTile) this.mWallpapers.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.mInflater.inflate(R.layout.wallpaper_picker_live_wallpaper_item, viewGroup, false);
        }
        LiveWallpaperTile liveWallpaperTile = (LiveWallpaperTile) this.mWallpapers.get(i);
        liveWallpaperTile.mView = view;
        ImageView imageView = (ImageView) view.findViewById(R.id.wallpaper_image);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.wallpaper_icon);
        Drawable drawable = liveWallpaperTile.mThumbnail;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            imageView2.setVisibility(8);
        } else {
            imageView2.setImageDrawable(liveWallpaperTile.mInfo.loadIcon(this.mPackageManager));
            imageView2.setVisibility(0);
        }
        ((TextView) view.findViewById(R.id.wallpaper_item_label)).setText(liveWallpaperTile.mInfo.loadLabel(this.mPackageManager));
        return view;
    }
}

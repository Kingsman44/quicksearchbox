package com.android.launcher3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.android.launcher3.WallpaperCropActivity;
import com.android.launcher3.WallpaperPickerActivity;
import com.android.p261d.p262a.C5037a;
import com.android.p271h.p272a.C5156d;
import com.evernote.android.state.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

/* compiled from: PG */
public final class SavedWallpaperImages extends BaseAdapter implements ListAdapter {
    final Context mContext;
    public final ImageDb mDb;
    ArrayList mImages;
    final LayoutInflater mLayoutInflater;

    /* compiled from: PG */
    final class ImageDb extends SQLiteOpenHelper {
        public ImageDb(Context context) {
            super(context, context.getDatabasePath("saved_wallpaper_images.db").getPath(), (SQLiteDatabase.CursorFactory) null, 2);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS saved_wallpaper_images (id INTEGER NOT NULL, image_thumbnail TEXT NOT NULL, image TEXT NOT NULL, extras TEXT, PRIMARY KEY (id ASC) );");
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i == 1) {
                sQLiteDatabase.execSQL("ALTER TABLE saved_wallpaper_images ADD COLUMN extras TEXT;");
            } else if (i != i2) {
                sQLiteDatabase.execSQL("DELETE FROM saved_wallpaper_images");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS saved_wallpaper_images (id INTEGER NOT NULL, image_thumbnail TEXT NOT NULL, image TEXT NOT NULL, extras TEXT, PRIMARY KEY (id ASC) );");
            }
        }
    }

    /* compiled from: PG */
    public final class SavedWallpaperTile extends WallpaperPickerActivity.FileWallpaperInfo {
        private final int mDbId;
        public final Float[] mExtras;

        public SavedWallpaperTile(int i, File file, Drawable drawable, Float[] fArr) {
            super(file, drawable);
            this.mDbId = i;
            this.mExtras = (fArr == null || fArr.length != 3) ? null : fArr;
        }

        /* access modifiers changed from: protected */
        public final WallpaperCropActivity.CropViewScaleAndOffsetProvider getCropViewScaleAndOffsetProvider() {
            if (this.mExtras != null) {
                return new WallpaperCropActivity.CropViewScaleAndOffsetProvider() {
                    public final void updateCropView(WallpaperCropActivity wallpaperCropActivity, C5156d dVar) {
                        wallpaperCropActivity.mCropView.setScaleAndCenter(SavedWallpaperTile.this.mExtras[0].floatValue(), SavedWallpaperTile.this.mExtras[1].floatValue(), SavedWallpaperTile.this.mExtras[2].floatValue());
                    }
                };
            }
            return null;
        }

        public final void onDelete(WallpaperPickerActivity wallpaperPickerActivity) {
            Pair pair;
            SavedWallpaperImages savedWallpaperImages = wallpaperPickerActivity.mSavedImages;
            int i = this.mDbId;
            Cursor query = savedWallpaperImages.mDb.getReadableDatabase().query("saved_wallpaper_images", new String[]{"image_thumbnail", "image"}, "id = ?", new String[]{Integer.toString(i)}, (String) null, (String) null, (String) null, (String) null);
            if (query.getCount() > 0) {
                query.moveToFirst();
                String string = query.getString(0);
                String string2 = query.getString(1);
                query.close();
                pair = new Pair(string, string2);
            } else {
                pair = null;
            }
            new File(savedWallpaperImages.mContext.getFilesDir(), (String) pair.first).delete();
            new File(savedWallpaperImages.mContext.getFilesDir(), (String) pair.second).delete();
            savedWallpaperImages.mDb.getWritableDatabase().delete("saved_wallpaper_images", "id = ?", new String[]{Integer.toString(i)});
        }

        public final void onSave(WallpaperPickerActivity wallpaperPickerActivity) {
            if (this.mExtras != null) {
                wallpaperPickerActivity.cropImageAndSetWallpaper$ar$ds(Uri.fromFile(this.mFile), (C5037a) null, wallpaperPickerActivity.mWallpaperParallaxOffset == 0.0f);
            } else {
                super.onSave(wallpaperPickerActivity);
            }
        }
    }

    public SavedWallpaperImages(Context context) {
        File file = new File(context.getCacheDir(), "saved_wallpaper_images.db");
        File databasePath = context.getDatabasePath("saved_wallpaper_images.db");
        if (file.exists()) {
            file.renameTo(databasePath);
        }
        this.mDb = new ImageDb(context);
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    public final int getCount() {
        return this.mImages.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return (SavedWallpaperTile) this.mImages.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Drawable drawable = ((SavedWallpaperTile) this.mImages.get(i)).mThumb;
        if (drawable == null) {
            Log.e("Launcher3.SavedWallpaperImages", "Error decoding thumbnail for wallpaper #" + i);
        }
        return WallpaperPickerActivity.createImageTileView(this.mLayoutInflater, view, viewGroup, drawable);
    }

    public final void writeImage(Bitmap bitmap, InputStream inputStream, Float[] fArr) {
        File createTempFile = File.createTempFile("wallpaper", BuildConfig.FLAVOR, this.mContext.getFilesDir());
        FileOutputStream openFileOutput = this.mContext.openFileOutput(createTempFile.getName(), 0);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            openFileOutput.write(bArr, 0, read);
        }
        openFileOutput.close();
        inputStream.close();
        File createTempFile2 = File.createTempFile("wallpaperthumb", BuildConfig.FLAVOR, this.mContext.getFilesDir());
        FileOutputStream openFileOutput2 = this.mContext.openFileOutput(createTempFile2.getName(), 0);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 95, openFileOutput2);
        openFileOutput2.close();
        SQLiteDatabase writableDatabase = this.mDb.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("image_thumbnail", createTempFile2.getName());
        contentValues.put("image", createTempFile.getName());
        if (fArr != null) {
            contentValues.put("extras", TextUtils.join(",", fArr));
        }
        writableDatabase.insert("saved_wallpaper_images", (String) null, contentValues);
    }
}

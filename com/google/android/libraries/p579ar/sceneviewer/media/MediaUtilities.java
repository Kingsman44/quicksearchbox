package com.google.android.libraries.p579ar.sceneviewer.media;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Environment;
import android.text.format.DateFormat;
import android.util.Size;
import com.google.android.libraries.p579ar.sceneviewer.media.gallery.ThumbnailResult;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.MediaUtilities */
/* compiled from: PG */
public final class MediaUtilities {
    public static final String BUCKET_DISPLAY_NAME = "SceneViewer";
    public static final String CAMERA_FOLDER = "Camera";
    public static final String DCIM_PATH;
    static final int DEFAULT_THUMBNAIL_SIZE_PIXELS = 256;
    static final String KEY_LAST_THUMBNAIL_TYPE = "last_thumbnail_type";
    static final String KEY_LAST_THUMBNAIL_URI = "last_thumbnail_uri";
    public static final String MIME_TYPE = "video/mp4";
    public static final String VIDEO_FILE_DATETIME_FORMAT = "yyyyMMdd_HHmmss";
    public static final String VIDEO_FILE_EXTENSION = ".mp4";
    public static final String VIDEO_FILE_PREFIX = "VID_";
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.media.MediaUtilities");

    static {
        String str = Environment.DIRECTORY_DCIM;
        String str2 = File.separator;
        DCIM_PATH = str + str2 + CAMERA_FOLDER;
    }

    private MediaUtilities() {
    }

    public static void clearPreference(Activity activity) {
        activity.getPreferences(0).edit().clear().commit();
    }

    private static ThumbnailResult createThumbnailForImage(Bitmap bitmap, Uri uri, int i) {
        return ThumbnailResult.create(ThumbnailUtils.extractThumbnail(bitmap, i, i), uri);
    }

    public static Bitmap cropToSquare(Bitmap bitmap, int i, int i2) {
        int min = Math.min(bitmap.getWidth() - i, bitmap.getHeight() - i2);
        if (min == bitmap.getWidth() && min == bitmap.getHeight()) {
            return bitmap;
        }
        return Bitmap.createBitmap(bitmap, i, i2, min, min);
    }

    public static Bitmap getBitmapWithUri(ContentResolver contentResolver, Uri uri, MediaType mediaType) {
        MediaType mediaType2 = MediaType.IMAGE;
        int ordinal = mediaType.ordinal();
        if (ordinal == 0) {
            try {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, uri));
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) logger.mo56226d()).mo56382g(e)).mo56372aa(42344)).mo56389s("Failed in getting bitmap with image uri %s.", uri);
                return null;
            }
        } else if (ordinal != 1) {
            return null;
        } else {
            try {
                return contentResolver.loadThumbnail(uri, new Size(512, 384), (CancellationSignal) null);
            } catch (IOException | RuntimeException e2) {
                ((C59052c) ((C59052c) ((C59052c) logger.mo56226d()).mo56382g(e2)).mo56372aa(42345)).mo56389s("Failed in getting bitmap with video uri %s.", uri);
                return null;
            }
        }
    }

    public static MediaFileInfo getLatestCameraFileInfo(ContentResolver contentResolver) {
        MediaFileInfo latestMediaFileInfo = getLatestMediaFileInfo(contentResolver, MediaType.IMAGE);
        MediaFileInfo latestMediaFileInfo2 = getLatestMediaFileInfo(contentResolver, MediaType.VIDEO);
        if (latestMediaFileInfo == null) {
            return latestMediaFileInfo2;
        }
        return (latestMediaFileInfo2 != null && ((C10720a) latestMediaFileInfo).f35658c.compareTo(((C10720a) latestMediaFileInfo2).f35658c) < 0) ? latestMediaFileInfo2 : latestMediaFileInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        if (r4 != null) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.libraries.p579ar.sceneviewer.media.MediaFileInfo getLatestMediaFileInfo(android.content.ContentResolver r4, com.google.android.libraries.p579ar.sceneviewer.media.MediaType r5) {
        /*
            com.google.android.libraries.ar.sceneviewer.media.MediaType r0 = com.google.android.libraries.p579ar.sceneviewer.media.MediaType.IMAGE
            if (r5 != r0) goto L_0x0007
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L_0x0009
        L_0x0007:
            android.net.Uri r0 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
        L_0x0009:
            r1 = 0
            android.database.Cursor r4 = queryLatestCameraMediaFile(r4, r0)     // Catch:{ SQLiteException -> 0x004b, NullPointerException -> 0x0049, IllegalArgumentException -> 0x0047, all -> 0x0045 }
            r4.getClass()
            boolean r2 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0043, NullPointerException -> 0x0041, IllegalArgumentException -> 0x003f }
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = "_id"
            int r2 = r4.getColumnIndexOrThrow(r2)     // Catch:{ SQLiteException -> 0x0043, NullPointerException -> 0x0041, IllegalArgumentException -> 0x003f }
            int r2 = r4.getInt(r2)     // Catch:{ SQLiteException -> 0x0043, NullPointerException -> 0x0041, IllegalArgumentException -> 0x003f }
            long r2 = (long) r2     // Catch:{ SQLiteException -> 0x0043, NullPointerException -> 0x0041, IllegalArgumentException -> 0x003f }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r0, r2)     // Catch:{ SQLiteException -> 0x0043, NullPointerException -> 0x0041, IllegalArgumentException -> 0x003f }
            java.lang.String r2 = "datetaken"
            int r2 = r4.getColumnIndexOrThrow(r2)     // Catch:{ SQLiteException -> 0x0043, NullPointerException -> 0x0041, IllegalArgumentException -> 0x003f }
            java.lang.String r2 = r4.getString(r2)     // Catch:{ SQLiteException -> 0x0043, NullPointerException -> 0x0041, IllegalArgumentException -> 0x003f }
            com.google.android.libraries.ar.sceneviewer.media.MediaFileInfo r5 = com.google.android.libraries.p579ar.sceneviewer.media.MediaFileInfo.create(r5, r0, r2)     // Catch:{ SQLiteException -> 0x0043, NullPointerException -> 0x0041, IllegalArgumentException -> 0x003f }
            r4.close()
            return r5
        L_0x0038:
            r4.close()
            goto L_0x0071
        L_0x003c:
            r5 = move-exception
            r1 = r4
            goto L_0x0072
        L_0x003f:
            r0 = move-exception
            goto L_0x004e
        L_0x0041:
            r0 = move-exception
            goto L_0x004e
        L_0x0043:
            r0 = move-exception
            goto L_0x004e
        L_0x0045:
            r5 = move-exception
            goto L_0x0072
        L_0x0047:
            r4 = move-exception
            goto L_0x004c
        L_0x0049:
            r4 = move-exception
            goto L_0x004c
        L_0x004b:
            r4 = move-exception
        L_0x004c:
            r0 = r4
            r4 = r1
        L_0x004e:
            com.google.common.f.e r2 = logger     // Catch:{ all -> 0x003c }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x003c }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x003c }
            com.google.common.f.x r0 = r2.mo56382g(r0)     // Catch:{ all -> 0x003c }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x003c }
            r2 = 42346(0xa56a, float:5.934E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x003c }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x003c }
            java.lang.String r2 = "Failed in getting latest camera %s file ."
            java.lang.String r5 = r5.name()     // Catch:{ all -> 0x003c }
            r0.mo56389s(r2, r5)     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x0071
            goto L_0x0038
        L_0x0071:
            return r1
        L_0x0072:
            if (r1 == 0) goto L_0x0077
            r1.close()
        L_0x0077:
            goto L_0x0079
        L_0x0078:
            throw r5
        L_0x0079:
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities.getLatestMediaFileInfo(android.content.ContentResolver, com.google.android.libraries.ar.sceneviewer.media.MediaType):com.google.android.libraries.ar.sceneviewer.media.MediaFileInfo");
    }

    public static String getVideoBaseName() {
        String valueOf = String.valueOf(DateFormat.format(VIDEO_FILE_DATETIME_FORMAT, new Date()));
        return VIDEO_FILE_PREFIX + valueOf + VIDEO_FILE_EXTENSION;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r10 == null) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isUriValid(android.content.ContentResolver r10, android.net.Uri r11) {
        /*
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]
            r0 = 0
            java.lang.String r7 = "is_pending"
            r3[r0] = r7
            r8 = 1
            java.lang.String r9 = "is_trashed"
            r3[r8] = r9
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r10
            r2 = r11
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6)
            r10.getClass()
            boolean r1 = r10.moveToFirst()     // Catch:{ NullPointerException -> 0x0040, IllegalArgumentException -> 0x003e }
            if (r1 == 0) goto L_0x0038
            int r1 = r10.getColumnIndexOrThrow(r7)     // Catch:{ NullPointerException -> 0x0040, IllegalArgumentException -> 0x003e }
            int r1 = r10.getInt(r1)     // Catch:{ NullPointerException -> 0x0040, IllegalArgumentException -> 0x003e }
            int r2 = r10.getColumnIndexOrThrow(r9)     // Catch:{ NullPointerException -> 0x0040, IllegalArgumentException -> 0x003e }
            int r11 = r10.getInt(r2)     // Catch:{ NullPointerException -> 0x0040, IllegalArgumentException -> 0x003e }
            if (r1 != 0) goto L_0x0034
            if (r11 != 0) goto L_0x0034
            r0 = 1
        L_0x0034:
            r10.close()
            return r0
        L_0x0038:
            r10.close()
            goto L_0x0060
        L_0x003c:
            r11 = move-exception
            goto L_0x0061
        L_0x003e:
            r1 = move-exception
            goto L_0x0041
        L_0x0040:
            r1 = move-exception
        L_0x0041:
            com.google.common.f.e r2 = logger     // Catch:{ all -> 0x003c }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x003c }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x003c }
            com.google.common.f.x r1 = r2.mo56382g(r1)     // Catch:{ all -> 0x003c }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x003c }
            r2 = 42350(0xa56e, float:5.9345E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x003c }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x003c }
            java.lang.String r2 = "Failed in getting is_pending and is_trashed for uri %s"
            r1.mo56389s(r2, r11)     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x0060
            goto L_0x0038
        L_0x0060:
            return r0
        L_0x0061:
            if (r10 != 0) goto L_0x0064
            goto L_0x0067
        L_0x0064:
            r10.close()
        L_0x0067:
            goto L_0x0069
        L_0x0068:
            throw r11
        L_0x0069:
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities.isUriValid(android.content.ContentResolver, android.net.Uri):boolean");
    }

    private static Cursor queryLatestCameraMediaFile(ContentResolver contentResolver, Uri uri) {
        return contentResolver.query(uri, new String[]{"_id", "datetaken"}, Build.VERSION.SDK_INT >= 30 ? "bucket_display_name = ? and is_pending = ? and is_trashed = ?" : "bucket_display_name = ? and is_pending = ?", Build.VERSION.SDK_INT >= 30 ? new String[]{CAMERA_FOLDER, "0", "0"} : new String[]{CAMERA_FOLDER, "0"}, "datetaken DESC");
    }

    public static void removeLastThumbnailUriPreferenceForTest(Activity activity) {
        activity.getPreferences(0).edit().remove(KEY_LAST_THUMBNAIL_URI).commit();
    }

    public static ThumbnailResult retrieveRecentThumbnail(Activity activity, int i) {
        String string = activity.getPreferences(0).getString(KEY_LAST_THUMBNAIL_URI, (String) null);
        String string2 = activity.getPreferences(0).getString(KEY_LAST_THUMBNAIL_TYPE, (String) null);
        if (string == null || string2 == null) {
            return null;
        }
        Uri parse = Uri.parse(string);
        MediaType valueOf = MediaType.valueOf(string2);
        ContentResolver contentResolver = activity.getContentResolver();
        if (Build.VERSION.SDK_INT >= 30 && !isUriValid(contentResolver, parse)) {
            return ThumbnailResult.create((Bitmap) null, parse);
        }
        Bitmap bitmapWithUri = getBitmapWithUri(contentResolver, parse, valueOf);
        if (bitmapWithUri != null) {
            if (i < 0) {
                i = 256;
            }
            return createThumbnailForImage(bitmapWithUri, parse, i);
        }
        ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42348)).mo56389s("No valid media file found for: %s", string);
        return ThumbnailResult.create((Bitmap) null, parse);
    }

    public static void setLastThumbnailUriPreferenceForTest(Activity activity, Uri uri) {
        setPreference(activity, uri, MediaType.IMAGE);
    }

    public static void setPreference(Activity activity, Uri uri, MediaType mediaType) {
        activity.getPreferences(0).edit().putString(KEY_LAST_THUMBNAIL_URI, uri.toString()).putString(KEY_LAST_THUMBNAIL_TYPE, mediaType.name()).commit();
    }
}

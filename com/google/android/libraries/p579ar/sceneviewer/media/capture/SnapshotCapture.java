package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.format.DateFormat;
import android.view.View;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.SnapshotCapture */
/* compiled from: PG */
public final class SnapshotCapture {
    private static final int BITMAP_QUALITY = 100;
    private static final String EXIF_DATETIME_FORMAT = "yyyy:MM:dd HH:mm:ss";
    private static final String MEDIA_MIME_TYPE = "image/jpg";
    private static final String SNAPSHOT_TITLE_DATETIME_FORMAT = "yyyyMMdd_HHmmss";
    private static final String SNAPSHOT_TITLE_EXTENSION = ".jpg";
    private static final String SNAPSHOT_TITLE_PREFIX = "IMG_";
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.media.capture.SnapshotCapture");
    /* access modifiers changed from: private */
    public final CaptureListener listener;
    private final ContentResolver resolver;
    private final View view;

    private SnapshotCapture(ContentResolver contentResolver, View view2, CaptureListener captureListener) {
        this.resolver = contentResolver;
        this.view = view2;
        this.listener = captureListener;
    }

    public static SnapshotCapture create(ContentResolver contentResolver, View view2, CaptureListener captureListener) {
        return new SnapshotCapture(contentResolver, view2, captureListener);
    }

    private static String getSnapshotTitle() {
        String obj = DateFormat.format("yyyyMMdd_HHmmss", new Date()).toString();
        return SNAPSHOT_TITLE_PREFIX + obj + SNAPSHOT_TITLE_EXTENSION;
    }

    private Uri insertContent(String str) {
        ContentValues contentValues = new ContentValues();
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        contentValues.put("datetaken", valueOf);
        contentValues.put("date_added", valueOf);
        contentValues.put("mime_type", MEDIA_MIME_TYPE);
        contentValues.put("_display_name", str);
        contentValues.put("title", str);
        contentValues.put("bucket_display_name", MediaUtilities.BUCKET_DISPLAY_NAME);
        contentValues.put("relative_path", MediaUtilities.DCIM_PATH);
        return this.resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    static /* synthetic */ void lambda$scanMedia$0(File file, SettableFuture settableFuture, String str, Uri uri) {
        file.getAbsolutePath();
        settableFuture.mo57356n(uri);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void saveBitmapInBackground(android.graphics.Bitmap r6) {
        /*
            r5 = this;
            java.lang.String r0 = getSnapshotTitle()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r2 = "Failed to save bitmap to disk: %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r2 = 0
            if (r6 != 0) goto L_0x001b
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Bitmap snapshot failed. Bitmap is null."
            r3.<init>(r4)
            goto L_0x001c
        L_0x001b:
            r3 = r2
        L_0x001c:
            if (r3 != 0) goto L_0x002f
            com.google.common.util.concurrent.cx r6 = r5.saveBitmapWithExternalUri(r6, r0, r1)     // Catch:{ IOException -> 0x0029, SecurityException -> 0x0027, InterruptedException -> 0x0025, ExecutionException -> 0x0023 }
            goto L_0x0030
        L_0x0023:
            r6 = move-exception
            goto L_0x002a
        L_0x0025:
            r6 = move-exception
            goto L_0x002a
        L_0x0027:
            r6 = move-exception
            goto L_0x002a
        L_0x0029:
            r6 = move-exception
        L_0x002a:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r1, r6)
        L_0x002f:
            r6 = r2
        L_0x0030:
            if (r6 == 0) goto L_0x003d
            com.google.android.libraries.ar.sceneviewer.media.capture.d r0 = new com.google.android.libraries.ar.sceneviewer.media.capture.d
            r0.<init>(r5)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r6, r0, r1)
            return
        L_0x003d:
            r5.triggerListenerInMainThread(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p579ar.sceneviewer.media.capture.SnapshotCapture.saveBitmapInBackground(android.graphics.Bitmap):void");
    }

    /* JADX INFO: finally extract failed */
    private C60870cx saveBitmapWithExternalFilePath(Bitmap bitmap, String str, String str2) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        String str3 = File.separator;
        File file = new File(externalStoragePublicDirectory, MediaUtilities.CAMERA_FOLDER + str3 + str);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            writeExif(new ExifInterface(file.getAbsolutePath()));
            return scanMedia(file);
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    private C60870cx saveBitmapWithExternalUri(Bitmap bitmap, String str, String str2) {
        OutputStream openOutputStream;
        Uri insertContent = insertContent(str);
        if (insertContent != null) {
            try {
                openOutputStream = this.resolver.openOutputStream(insertContent);
                if (openOutputStream != null) {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, openOutputStream);
                    ParcelFileDescriptor openFileDescriptor = this.resolver.openFileDescriptor(insertContent, "rw");
                    if (openFileDescriptor != null) {
                        writeExif(new ExifInterface(openFileDescriptor.getFileDescriptor()));
                        openOutputStream.close();
                        return C60856cj.m92900i(insertContent);
                    }
                    throw new IOException("ParcelFileDescriptor is null.");
                }
                throw new IOException(str2);
            } catch (IOException e) {
                this.resolver.delete(insertContent, (String) null, (String[]) null);
                throw e;
            } catch (Throwable th) {
                SnapshotCapture$$ExternalSyntheticBackport0.m25732m(th, th);
            }
        } else {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42354)).mo56389s("Failed to get URI for: %s", str);
            throw new IOException(str2);
        }
        throw th;
    }

    private C60870cx scanMedia(File file) {
        SettableFuture settableFuture = new SettableFuture();
        MediaScannerConnection.scanFile(this.view.getContext(), new String[]{file.toString()}, new String[]{MEDIA_MIME_TYPE}, new SnapshotCapture$$ExternalSyntheticLambda1(file, settableFuture));
        return settableFuture;
    }

    /* access modifiers changed from: private */
    public void triggerListenerInMainThread(Uri uri, Throwable th) {
        if (this.listener != null) {
            new Handler(Looper.getMainLooper()).post(new C10726c(this, th, uri));
        }
    }

    private void writeExif(ExifInterface exifInterface) {
        if (exifInterface == null) {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42356)).mo56386p("exifInterface is null.");
            return;
        }
        String format = new SimpleDateFormat(EXIF_DATETIME_FORMAT, this.view.getResources().getConfiguration().getLocales().get(0)).format(Calendar.getInstance().getTime());
        exifInterface.setAttribute("DateTime", format);
        exifInterface.setAttribute("DateTimeOriginal", format);
        exifInterface.saveAttributes();
    }

    public void onGetRenderedImage(Bitmap bitmap) {
        ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.SNAPSHOT);
        saveBitmapInBackground(bitmap);
    }
}

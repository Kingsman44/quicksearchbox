package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import com.google.common.base.C58838bb;
import java.io.File;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.AndroidPAndBelowMediaHandler */
/* compiled from: PG */
public final class AndroidPAndBelowMediaHandler implements MediaHandler {
    private static final String VIDEO_TITLE = "Scene Viewer Video";
    private final ContentResolver contentResolver;
    private String videoAbsolutePath;
    private final File videoDirectory = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), MediaUtilities.CAMERA_FOLDER.concat(String.valueOf(File.separator)));

    public AndroidPAndBelowMediaHandler(Context context) {
        this.contentResolver = context.getContentResolver();
    }

    public void buildFileName() {
        String videoBaseName = MediaUtilities.getVideoBaseName();
        File file = new File(this.videoDirectory, videoBaseName);
        C58838bb.m90867b(file, "Failed to create file in DCIM folder for %s.", videoBaseName);
        File parentFile = file.getParentFile();
        parentFile.getClass();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        this.videoAbsolutePath = file.getAbsolutePath();
    }

    public void setOutputFile(MediaRecorder mediaRecorder) {
        mediaRecorder.setOutputFile(this.videoAbsolutePath);
    }

    public Uri stopRecording() {
        ContentValues contentValues = new ContentValues();
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        contentValues.put("datetaken", valueOf);
        contentValues.put("date_added", valueOf);
        contentValues.put("mime_type", MediaUtilities.MIME_TYPE);
        contentValues.put("_display_name", VIDEO_TITLE);
        contentValues.put("title", VIDEO_TITLE);
        contentValues.put("_data", this.videoAbsolutePath);
        contentValues.put("bucket_display_name", MediaUtilities.BUCKET_DISPLAY_NAME);
        return this.contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
    }
}

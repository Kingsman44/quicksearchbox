package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaRecorder;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.libraries.p11029ao.p11032c.C147806g;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.IOException;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.AndroidQAndAboveMediaHandler */
/* compiled from: PG */
public final class AndroidQAndAboveMediaHandler implements MediaHandler {
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.media.capture.AndroidQAndAboveMediaHandler");
    private final ContentResolver contentResolver;
    private final Context context;
    private Uri videoUri;

    public AndroidQAndAboveMediaHandler(Context context2) {
        this.context = context2;
        this.contentResolver = context2.getContentResolver();
    }

    public void buildFileName() {
        String videoBaseName = MediaUtilities.getVideoBaseName();
        ContentValues contentValues = new ContentValues();
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        contentValues.put("datetaken", valueOf);
        contentValues.put("date_added", valueOf);
        contentValues.put("mime_type", MediaUtilities.MIME_TYPE);
        contentValues.put("_display_name", videoBaseName);
        contentValues.put("title", videoBaseName);
        contentValues.put("bucket_display_name", MediaUtilities.BUCKET_DISPLAY_NAME);
        contentValues.put("relative_path", MediaUtilities.DCIM_PATH);
        contentValues.put("is_pending", 1);
        Uri insert = this.contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (insert != null) {
            this.videoUri = insert;
        } else {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42351)).mo56389s("Failed to insert content for %s into contentResolver.", videoBaseName);
            throw new IOException("Failed to insert content.");
        }
    }

    public void setOutputFile(MediaRecorder mediaRecorder) {
        AssetFileDescriptor e = C147806g.m240911e(this.context, this.videoUri);
        e.getClass();
        mediaRecorder.setOutputFile(e.getFileDescriptor());
    }

    public Uri stopRecording() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_pending", 0);
        this.contentResolver.update(this.videoUri, contentValues, (String) null, (String[]) null);
        return this.videoUri;
    }
}

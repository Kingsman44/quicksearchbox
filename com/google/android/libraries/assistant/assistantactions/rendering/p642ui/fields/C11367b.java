package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.b */
/* compiled from: PG */
public final /* synthetic */ class C11367b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ AudioRecorderField f37096a;

    public /* synthetic */ C11367b(AudioRecorderField audioRecorderField) {
        this.f37096a = audioRecorderField;
    }

    public final Object call() {
        AudioRecorderField audioRecorderField = this.f37096a;
        String c = audioRecorderField.mo19811c();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(audioRecorderField.f37159r, Uri.parse(c));
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (extractMetadata != null) {
            return Integer.valueOf(Integer.parseInt(extractMetadata));
        }
        throw new IOException("Failed to get file duration.");
    }
}

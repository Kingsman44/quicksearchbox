package com.google.android.apps.search.transcription.p10670f.p10671a.p10672a;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.google.android.apps.search.transcription.recording.AudioRecordingProvider;
import com.google.android.apps.search.transcription.recording.C141933a;
import com.google.android.libraries.p590as.p591a.C10770d;
import com.google.android.libraries.p590as.p591a.C10771e;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63088z;
import com.google.speech.recognizer.p5233a.C67451at;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.transcription.f.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C141774e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C141780k f384742a;

    public /* synthetic */ C141774e(C141780k kVar) {
        this.f384742a = kVar;
    }

    public final Object call() {
        C141780k kVar = this.f384742a;
        if (!kVar.f384748c.mo116826h().isPresent()) {
            return Uri.EMPTY;
        }
        AudioRecordingProvider audioRecordingProvider = kVar.f384750e;
        C37360ay f = kVar.mo116725f();
        InputStream c = kVar.mo116719c();
        C10770d a = C10770d.m25763a((C67451at) kVar.f384748c.mo116826h().get());
        File file = new File(new File(audioRecordingProvider.f385131b.getFilesDir(), "recordings"), "recording.amr");
        Context context = audioRecordingProvider.f385131b;
        Uri a2 = FileProvider.m5057a(context, String.valueOf(context.getPackageName()).concat(".AudioRecordingProvider")).mo5044a(file);
        audioRecordingProvider.f385131b.revokeUriPermission(a2, 1);
        byte[] N = C63088z.m96144F(c).mo59174N();
        int a3 = C10771e.m25764a(a.f35762h);
        int i = f.f99228c;
        if (i != a3) {
            int length = N.length;
            ((C59052c) ((C59052c) C141933a.f385132a.mo56224b()).mo56372aa(41953)).mo56393w("Resampling from %d to %d", i, a3);
            if (i != a3) {
                if (i >= a3) {
                    int i2 = i / a3;
                    int i3 = length / i2;
                    if ((i3 & 1) == 1) {
                        i3++;
                    }
                    int i4 = i3 - 1;
                    C58838bb.m90880o(i4 < length, "The src array does not have enough space to hold the downsampled audio.  Downsampling would write from src[%s] to src[%s], but src terminates at src[%s].", 0, Integer.valueOf(i4), Integer.valueOf(length - 1));
                    for (int i5 = 0; i5 < i3; i5 += 2) {
                        int i6 = i5 * i2;
                        N[i5] = N[i6];
                        N[i5 + 1] = N[i6 + 1];
                    }
                    length = i3;
                } else {
                    throw new UnsupportedOperationException("Upsampling is not supported yet");
                }
            }
            N = Arrays.copyOf(N, length);
        }
        byte[] f2 = C10771e.m25769f(a, N);
        File file2 = new File(audioRecordingProvider.f385131b.getFilesDir(), "recordings");
        file2.mkdir();
        File file3 = new File(file2, "recording.amr");
        file3.createNewFile();
        ((C59052c) ((C59052c) AudioRecordingProvider.f385130a.mo56224b()).mo56372aa(41952)).mo56389s("Writing audio to file %s", file3);
        FileOutputStream fileOutputStream = new FileOutputStream(file3);
        try {
            fileOutputStream.write(f2);
            return a2;
        } finally {
            fileOutputStream.close();
        }
    }
}

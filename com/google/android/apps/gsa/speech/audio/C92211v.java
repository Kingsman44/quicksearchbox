package com.google.android.apps.gsa.speech.audio;

import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.gsa.speech.audio.v */
/* compiled from: PG */
public abstract class C92211v extends InputStream implements InputStreamRetargetInterface {
    /* renamed from: a */
    public abstract int mo86824a();

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

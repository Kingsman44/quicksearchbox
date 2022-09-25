package com.bumptech.glide.load.p297b;

import android.util.Log;
import com.bumptech.glide.load.C5819c;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.p291h.C5616c;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.b.l */
/* compiled from: PG */
public final class C5804l implements C5819c {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo12285a(Object obj, File file, C5960s sVar) {
        try {
            C5616c.m14584e((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}

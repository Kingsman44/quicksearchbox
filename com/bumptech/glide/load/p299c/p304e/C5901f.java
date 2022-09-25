package com.bumptech.glide.load.p299c.p304e;

import android.util.Log;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5963v;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.p291h.C5616c;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.c.e.f */
/* compiled from: PG */
public final class C5901f implements C5963v {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo12285a(Object obj, File file, C5960s sVar) {
        try {
            C5616c.m14584e(((C5900e) ((C5679av) obj).mo12160c()).mo12351b(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    /* renamed from: b */
    public final int mo12325b() {
        return 1;
    }
}

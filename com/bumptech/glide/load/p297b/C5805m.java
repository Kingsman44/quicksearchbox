package com.bumptech.glide.load.p297b;

import android.util.Log;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.data.C5929d;
import com.bumptech.glide.load.data.C5930e;
import com.bumptech.glide.p291h.C5616c;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.b.m */
/* compiled from: PG */
final class C5805m implements C5930e {

    /* renamed from: a */
    private final File f17394a;

    public C5805m(File file) {
        this.f17394a = file;
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return C5637a.LOCAL;
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return ByteBuffer.class;
    }

    /* renamed from: c */
    public final void mo11923c() {
    }

    /* renamed from: d */
    public final void mo11924d() {
    }

    /* renamed from: e */
    public final void mo11925e(C5997p pVar, C5929d dVar) {
        try {
            dVar.mo12183f(C5616c.m14581b(this.f17394a));
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
            }
            dVar.mo12184g(e);
        }
    }
}

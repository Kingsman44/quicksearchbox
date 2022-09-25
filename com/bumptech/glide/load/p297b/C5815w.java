package com.bumptech.glide.load.p297b;

import android.util.Log;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.data.C5929d;
import com.bumptech.glide.load.data.C5930e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.b.w */
/* compiled from: PG */
final class C5815w implements C5930e {

    /* renamed from: a */
    private final File f17399a;

    /* renamed from: b */
    private final C5816x f17400b;

    /* renamed from: c */
    private Object f17401c;

    public C5815w(File file, C5816x xVar) {
        this.f17399a = file;
        this.f17400b = xVar;
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return C5637a.LOCAL;
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return this.f17400b.mo12289a();
    }

    /* renamed from: c */
    public final void mo11923c() {
    }

    /* renamed from: d */
    public final void mo11924d() {
        Object obj = this.f17401c;
        if (obj != null) {
            try {
                this.f17400b.mo12291c(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: e */
    public final void mo11925e(C5997p pVar, C5929d dVar) {
        try {
            Object b = this.f17400b.mo12290b(this.f17399a);
            this.f17401c = b;
            dVar.mo12183f(b);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("FileLoader", 3)) {
                Log.d("FileLoader", "Failed to open file", e);
            }
            dVar.mo12184g(e);
        }
    }
}

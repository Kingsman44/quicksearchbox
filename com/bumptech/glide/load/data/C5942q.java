package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5637a;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.q */
/* compiled from: PG */
public abstract class C5942q implements C5930e {

    /* renamed from: a */
    private final Uri f17599a;

    /* renamed from: b */
    private final ContentResolver f17600b;

    /* renamed from: c */
    private Object f17601c;

    public C5942q(ContentResolver contentResolver, Uri uri) {
        this.f17600b = contentResolver;
        this.f17599a = uri;
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return C5637a.LOCAL;
    }

    /* renamed from: c */
    public final void mo11923c() {
    }

    /* renamed from: d */
    public final void mo11924d() {
        Object obj = this.f17601c;
        if (obj != null) {
            try {
                mo12378g(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: e */
    public final void mo11925e(C5997p pVar, C5929d dVar) {
        try {
            Object f = mo12377f(this.f17599a, this.f17600b);
            this.f17601c = f;
            dVar.mo12183f(f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            dVar.mo12184g(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Object mo12377f(Uri uri, ContentResolver contentResolver);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo12378g(Object obj);
}

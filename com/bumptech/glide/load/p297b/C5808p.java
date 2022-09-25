package com.bumptech.glide.load.p297b;

import android.util.Base64;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.data.C5929d;
import com.bumptech.glide.load.data.C5930e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.p */
/* compiled from: PG */
final class C5808p implements C5930e {

    /* renamed from: a */
    private final String f17395a;

    /* renamed from: b */
    private Object f17396b;

    public C5808p(String str) {
        this.f17395a = str;
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return C5637a.LOCAL;
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return InputStream.class;
    }

    /* renamed from: c */
    public final void mo11923c() {
    }

    /* renamed from: d */
    public final void mo11924d() {
        try {
            ((InputStream) this.f17396b).close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: e */
    public final void mo11925e(C5997p pVar, C5929d dVar) {
        try {
            String str = this.f17395a;
            if (str.startsWith("data:image")) {
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                } else if (str.substring(0, indexOf).endsWith(";base64")) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    this.f17396b = byteArrayInputStream;
                    dVar.mo12183f(byteArrayInputStream);
                } else {
                    throw new IllegalArgumentException("Not a base64 image data URL.");
                }
            } else {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        } catch (IllegalArgumentException e) {
            dVar.mo12184g(e);
        }
    }
}

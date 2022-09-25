package com.google.android.gms.vision;

/* renamed from: com.google.android.gms.vision.b */
/* compiled from: PG */
public final class C146301b {

    /* renamed from: a */
    public final C146303d f395156a = new C146303d();

    /* renamed from: a */
    public final C146303d mo122865a() {
        C146303d dVar = this.f395156a;
        if (dVar.f395163b != null || dVar.f395164c != null) {
            return dVar;
        }
        throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
    }
}

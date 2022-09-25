package com.google.android.libraries.elements.p1705a.p1706a;

import com.google.android.libraries.elements.interfaces.ContentMode;
import com.google.android.libraries.elements.interfaces.ImageFormatHint;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.internal.C21359t;
import com.youtube.p5283a.p5284a.C68051an;
import com.youtube.p5283a.p5284a.C68052ao;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.elements.a.a.f */
/* compiled from: PG */
public final class C20682f extends ImageProxy {

    /* renamed from: a */
    public final C68051an f57965a;

    /* renamed from: b */
    public final ArrayList f57966b;

    public C20682f(C68051an anVar) {
        this.f57965a = anVar;
        this.f57966b = new ArrayList(anVar.mo60122g());
        for (int i = 0; i < anVar.mo60122g(); i++) {
            ArrayList arrayList = this.f57966b;
            C68052ao aoVar = new C68052ao();
            int a = anVar.mo16913a(4);
            if (a != 0) {
                int b = anVar.mo16914b(a) + (i * 4);
                aoVar.mo16917e(b + anVar.f24704b.getInt(b), anVar.f24704b);
            } else {
                aoVar = null;
            }
            arrayList.add(new C20683g(aoVar));
        }
    }

    public final ContentMode contentMode() {
        C68051an anVar = this.f57965a;
        int a = anVar.mo16913a(6);
        if (a != 0) {
            int i = anVar.f24704b.getInt(a + anVar.f24703a);
            if (i == 1) {
                return ContentMode.CONTENT_MODE_SCALE_TO_FILL;
            }
            if (i == 2) {
                return ContentMode.CONTENT_MODE_SCALE_ASPECT_FIT;
            }
            if (i == 3) {
                return ContentMode.CONTENT_MODE_SCALE_ASPECT_FILL;
            }
            if (i == 4) {
                return ContentMode.CONTENT_MODE_CENTER;
            }
        }
        return ContentMode.CONTENT_MODE_UNKNOWN;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20682f)) {
            return false;
        }
        return C21359t.m40387m(this.f57965a, ((C20682f) obj).f57965a);
    }

    public final boolean flipForRtlLayout() {
        C68051an anVar = this.f57965a;
        int a = anVar.mo16913a(10);
        return (a == 0 || anVar.f24704b.get(a + anVar.f24703a) == 0) ? false : true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f57965a);
    }

    public final ImageFormatHint imageFormatHint() {
        C68051an anVar = this.f57965a;
        int a = anVar.mo16913a(12);
        if (a != 0) {
            int i = anVar.f24704b.getInt(a + anVar.f24703a);
            if (i == 1) {
                return ImageFormatHint.IMAGE_FORMAT_STATIC_WEBP;
            }
            if (i == 2) {
                return ImageFormatHint.IMAGE_FORMAT_STATIC_GIF;
            }
            if (i == 3) {
                return ImageFormatHint.IMAGE_FORMAT_ANIMATED_WEBP;
            }
            if (i == 4) {
                return ImageFormatHint.IMAGE_FORMAT_ANIMATED_GIF;
            }
        }
        return ImageFormatHint.IMAGE_FORMAT_DEFAULT;
    }

    public final ArrayList sources() {
        return this.f57966b;
    }
}

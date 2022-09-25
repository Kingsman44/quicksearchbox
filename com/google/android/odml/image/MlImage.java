package com.google.android.odml.image;

import android.graphics.Rect;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public class MlImage implements Closeable {

    /* renamed from: a */
    private final Map f117618a;

    /* renamed from: b */
    private final Rect f117619b;

    /* renamed from: c */
    private int f117620c = 1;

    MlImage(ImageContainer imageContainer, int i, Rect rect, long j, int i2, int i3) {
        HashMap hashMap = new HashMap();
        this.f117618a = hashMap;
        hashMap.put(imageContainer.getImageProperties(), imageContainer);
        Rect rect2 = new Rect();
        this.f117619b = rect2;
        rect2.set(rect);
    }

    public final synchronized void close() {
        int i = this.f117620c - 1;
        this.f117620c = i;
        if (i == 0) {
            for (ImageContainer close : this.f117618a.values()) {
                close.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ImageContainer getContainer() {
        return (ImageContainer) this.f117618a.values().iterator().next();
    }

    /* access modifiers changed from: package-private */
    public ImageContainer getContainer(int i) {
        for (Map.Entry entry : this.f117618a.entrySet()) {
            if (((ImageProperties) entry.getKey()).mo48851b() == i) {
                return (ImageContainer) entry.getValue();
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public ImageContainer getContainer(ImageProperties imageProperties) {
        return (ImageContainer) this.f117618a.get(imageProperties);
    }
}

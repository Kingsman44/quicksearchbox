package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;

/* renamed from: androidx.media.au */
/* compiled from: PG */
public class C2423au {

    /* renamed from: a */
    public int f6697a;

    /* renamed from: b */
    private final int f6698b;

    /* renamed from: c */
    private final int f6699c;

    /* renamed from: d */
    private final String f6700d;

    /* renamed from: e */
    private VolumeProvider f6701e;

    public C2423au(int i, int i2, int i3, String str) {
        this.f6698b = i;
        this.f6699c = i2;
        this.f6697a = i3;
        this.f6700d = str;
    }

    /* renamed from: a */
    public final Object mo5847a() {
        if (this.f6701e == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f6701e = new C2420ar(this, this.f6698b, this.f6699c, this.f6697a, this.f6700d);
            } else {
                this.f6701e = new C2421as(this, this.f6698b, this.f6699c, this.f6697a);
            }
        }
        return this.f6701e;
    }

    /* renamed from: b */
    public void mo5848b(int i) {
        throw null;
    }

    /* renamed from: c */
    public void mo5849c(int i) {
        throw null;
    }
}

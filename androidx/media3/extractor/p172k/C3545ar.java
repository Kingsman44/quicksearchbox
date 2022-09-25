package androidx.media3.extractor.p172k;

import android.support.p033v7.widget.LinearLayoutManager;
import com.evernote.android.state.BuildConfig;

/* renamed from: androidx.media3.extractor.k.ar */
/* compiled from: PG */
public final class C3545ar {

    /* renamed from: a */
    public int f11108a;

    /* renamed from: b */
    public String f11109b;

    /* renamed from: c */
    private final String f11110c;

    /* renamed from: d */
    private final int f11111d;

    /* renamed from: e */
    private final int f11112e;

    public C3545ar(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = BuildConfig.FLAVOR;
        }
        this.f11110c = str;
        this.f11111d = i2;
        this.f11112e = i3;
        this.f11108a = LinearLayoutManager.INVALID_OFFSET;
        this.f11109b = BuildConfig.FLAVOR;
    }

    /* renamed from: a */
    public final void mo7462a() {
        int i = this.f11108a;
        int i2 = i == Integer.MIN_VALUE ? this.f11111d : i + this.f11112e;
        this.f11108a = i2;
        String str = this.f11110c;
        this.f11109b = str + i2;
    }

    /* renamed from: b */
    public final void mo7463b() {
        if (this.f11108a == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}

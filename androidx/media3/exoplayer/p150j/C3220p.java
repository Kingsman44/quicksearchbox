package androidx.media3.exoplayer.p150j;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import androidx.media3.common.C2654bp;
import androidx.media3.common.p136b.C2612ak;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;

/* renamed from: androidx.media3.exoplayer.j.p */
/* compiled from: PG */
public final class C3220p extends C2654bp {

    /* renamed from: q */
    public boolean f9665q;

    /* renamed from: r */
    public boolean f9666r;

    /* renamed from: s */
    public boolean f9667s;

    /* renamed from: t */
    public boolean f9668t;

    /* renamed from: u */
    public boolean f9669u;

    /* renamed from: v */
    public boolean f9670v;

    /* renamed from: w */
    public final SparseArray f9671w;

    /* renamed from: x */
    public final SparseBooleanArray f9672x;

    @Deprecated
    public C3220p() {
        this.f9671w = new SparseArray();
        this.f9672x = new SparseBooleanArray();
        m9425a();
    }

    /* renamed from: a */
    private final void m9425a() {
        this.f9665q = true;
        this.f9666r = true;
        this.f9667s = true;
        this.f9668t = true;
        this.f9669u = true;
        this.f9670v = true;
    }

    public C3220p(Context context) {
        int i = C2612ak.f7249a;
        CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            this.f7372n = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f7371m = C58485gu.m89846n(locale.toLanguageTag());
            }
        }
        Point C = C2612ak.m6920C(context);
        int i2 = C.x;
        int i3 = C.y;
        this.f7363e = i2;
        this.f7364f = i3;
        this.f7365g = true;
        this.f9671w = new SparseArray();
        this.f9672x = new SparseBooleanArray();
        m9425a();
    }
}

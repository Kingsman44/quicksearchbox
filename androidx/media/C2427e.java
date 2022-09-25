package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Handler;
import androidx.core.p097i.C1968c;

/* renamed from: androidx.media.e */
/* compiled from: PG */
public final class C2427e {

    /* renamed from: b */
    public static final /* synthetic */ int f6703b = 0;

    /* renamed from: a */
    public final Object f6704a;

    /* renamed from: c */
    private final int f6705c;

    /* renamed from: d */
    private final AudioManager.OnAudioFocusChangeListener f6706d;

    /* renamed from: e */
    private final Handler f6707e;

    /* renamed from: f */
    private final AudioAttributesCompat f6708f;

    /* renamed from: g */
    private final boolean f6709g = false;

    static {
        int i = AudioAttributesCompat.f6633b;
        C2425c cVar = new C2425c();
        cVar.f6702a.setUsage(1);
        C2400a.m6428a(cVar);
    }

    public C2427e(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat) {
        this.f6705c = i;
        this.f6707e = handler;
        this.f6708f = audioAttributesCompat;
        this.f6706d = onAudioFocusChangeListener;
        this.f6704a = C2426d.m6452a(i, (AudioAttributes) audioAttributesCompat.f6635a.mo5809a(), false, onAudioFocusChangeListener, handler);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2427e)) {
            return false;
        }
        C2427e eVar = (C2427e) obj;
        if (this.f6705c == eVar.f6705c) {
            boolean z = eVar.f6709g;
            return C1968c.m5305b(this.f6706d, eVar.f6706d) && C1968c.m5305b(this.f6707e, eVar.f6707e) && C1968c.m5305b(this.f6708f, eVar.f6708f);
        }
    }

    public final int hashCode() {
        return C1968c.m5304a(Integer.valueOf(this.f6705c), this.f6706d, this.f6707e, this.f6708f, false);
    }
}

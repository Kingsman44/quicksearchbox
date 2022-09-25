package android.support.p031v4.media.session;

import android.os.Bundle;
import android.support.p031v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.ao */
/* compiled from: PG */
public final class C0298ao {

    /* renamed from: a */
    public long f1024a;

    /* renamed from: b */
    public long f1025b;

    /* renamed from: c */
    public int f1026c;

    /* renamed from: d */
    public CharSequence f1027d;

    /* renamed from: e */
    public long f1028e;

    /* renamed from: f */
    public Bundle f1029f;

    /* renamed from: g */
    private final List f1030g;

    /* renamed from: h */
    private int f1031h;

    /* renamed from: i */
    private long f1032i;

    /* renamed from: j */
    private float f1033j;

    /* renamed from: k */
    private long f1034k;

    public C0298ao() {
        this.f1030g = new ArrayList();
        this.f1028e = -1;
    }

    /* renamed from: a */
    public final PlaybackStateCompat mo982a() {
        return new PlaybackStateCompat(this.f1031h, this.f1032i, this.f1024a, this.f1033j, this.f1025b, this.f1026c, this.f1027d, this.f1034k, this.f1030g, this.f1028e, this.f1029f);
    }

    /* renamed from: b */
    public final void mo983b(PlaybackStateCompat.CustomAction customAction) {
        if (customAction != null) {
            this.f1030g.add(customAction);
            return;
        }
        throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
    }

    /* renamed from: c */
    public final void mo984c(int i, long j, float f, long j2) {
        this.f1031h = i;
        this.f1032i = j;
        this.f1034k = j2;
        this.f1033j = f;
    }

    public C0298ao(PlaybackStateCompat playbackStateCompat) {
        ArrayList arrayList = new ArrayList();
        this.f1030g = arrayList;
        this.f1028e = -1;
        this.f1031h = playbackStateCompat.f994a;
        this.f1032i = playbackStateCompat.f995b;
        this.f1033j = playbackStateCompat.f997d;
        this.f1034k = playbackStateCompat.f1001h;
        this.f1024a = playbackStateCompat.f996c;
        this.f1025b = playbackStateCompat.f998e;
        this.f1026c = playbackStateCompat.f999f;
        this.f1027d = playbackStateCompat.f1000g;
        List list = playbackStateCompat.f1002i;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f1028e = playbackStateCompat.f1003j;
        this.f1029f = playbackStateCompat.f1004k;
    }
}

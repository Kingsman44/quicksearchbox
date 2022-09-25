package com.google.android.libraries.lens.view.vision;

import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.vision.r */
/* compiled from: PG */
public final class C28176r {

    /* renamed from: a */
    private int f76688a;

    /* renamed from: b */
    private int f76689b;

    /* renamed from: c */
    private int f76690c;

    /* renamed from: d */
    private int f76691d;

    /* renamed from: e */
    private boolean f76692e;

    /* renamed from: a */
    public final synchronized C28175q mo33692a() {
        C28163e eVar;
        eVar = new C28163e(this.f76688a, this.f76689b, this.f76691d);
        this.f76688a = 0;
        this.f76689b = 0;
        this.f76690c = 0;
        this.f76691d = 0;
        this.f76692e = false;
        return eVar;
    }

    /* renamed from: b */
    public final synchronized void mo33693b() {
        int i;
        boolean z = this.f76692e;
        this.f76688a++;
        if (!z) {
            this.f76689b++;
            this.f76690c = 1;
            i = 1;
        } else {
            i = this.f76690c + 1;
            this.f76690c = i;
        }
        if (i > this.f76691d) {
            this.f76691d = i;
        }
        this.f76692e = true;
    }

    /* renamed from: c */
    public final synchronized void mo33694c() {
        this.f76692e = false;
    }

    public final synchronized String toString() {
        return String.format(Locale.US, "NotTrackedFramesStatsCollector  totalNotTrackedFrames: %d, notTrackedIntervalCount: %d, currentNotTrackedSequenceLength: %d,  longestNotTrackedSequenceLength: %d, lastFrameNotTracked: %b", new Object[]{Integer.valueOf(this.f76688a), Integer.valueOf(this.f76689b), Integer.valueOf(this.f76690c), Integer.valueOf(this.f76691d), Boolean.valueOf(this.f76692e)});
    }
}

package com.google.android.apps.gsa.speech.microdetection.p7303a.p7304a;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90727ak;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.speech.micro.GoogleHotwordData;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.a.a */
/* compiled from: PG */
public final class C92488a {

    /* renamed from: a */
    private static C92488a f258111a;

    /* renamed from: b */
    private final Object f258112b = new Object();

    /* renamed from: c */
    private boolean f258113c = false;

    private C92488a() {
    }

    /* renamed from: a */
    public static synchronized C92488a m152144a() {
        C92488a aVar;
        synchronized (C92488a.class) {
            if (f258111a == null) {
                f258111a = new C92488a();
            }
            aVar = f258111a;
        }
        return aVar;
    }

    /* renamed from: b */
    public final GoogleHotwordData mo87258b(byte[] bArr, int i, int i2, int i3, boolean z) {
        synchronized (this.f258112b) {
            if (!this.f258113c) {
                C90476a aVar = C91018d.f254254a;
                C90727ak.m148184a("google_speech_micro_jni");
                this.f258113c = true;
            }
        }
        return new GoogleHotwordData(bArr, i, i2, i3, z);
    }
}

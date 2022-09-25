package com.google.android.libraries.search.p2904c.p2907ab;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.ab.a */
/* compiled from: PG */
public final class C37334a extends C37336c {

    /* renamed from: a */
    public final C37335b f99173a;

    /* renamed from: b */
    private final C37360ay f99174b;

    /* renamed from: c */
    private final C60870cx f99175c;

    public C37334a(C37335b bVar, C37360ay ayVar, C60870cx cxVar) {
        if (bVar != null) {
            this.f99173a = bVar;
            if (ayVar != null) {
                this.f99174b = ayVar;
                this.f99175c = cxVar;
                return;
            }
            throw new NullPointerException("Null audioLibInputParams");
        }
        throw new NullPointerException("Null writeableAudioBuffer");
    }

    /* renamed from: a */
    public final C37360ay mo40884a() {
        return this.f99174b;
    }

    /* renamed from: b */
    public final C37335b mo40885b() {
        return this.f99173a;
    }

    /* renamed from: c */
    public final C60870cx mo40886c() {
        return this.f99175c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37336c) {
            C37336c cVar = (C37336c) obj;
            return this.f99173a.equals(cVar.mo40885b()) && this.f99174b.equals(cVar.mo40884a()) && this.f99175c.equals(cVar.mo40886c());
        }
    }

    public final int hashCode() {
        return ((((this.f99173a.hashCode() ^ 1000003) * 1000003) ^ this.f99174b.hashCode()) * 1000003) ^ this.f99175c.hashCode();
    }

    public final String toString() {
        String obj = this.f99173a.toString();
        String obj2 = this.f99174b.toString();
        String obj3 = this.f99175c.toString();
        return "WriteableAudioBufferData{writeableAudioBuffer=" + obj + ", audioLibInputParams=" + obj2 + ", audioSourceOpeningStatus=" + obj3 + "}";
    }
}

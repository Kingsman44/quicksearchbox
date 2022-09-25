package com.google.android.apps.search.transcription.p10670f.p10673b;

import android.net.Uri;
import com.google.android.apps.search.transcription.p10666b.C141743b;
import com.google.android.apps.search.transcription.p10670f.C141806ay;
import com.google.android.apps.search.transcription.p10670f.C141921o;

/* renamed from: com.google.android.apps.search.transcription.f.b.b */
/* compiled from: PG */
final class C141810b extends C141832x {

    /* renamed from: a */
    public final String f384860a;

    /* renamed from: b */
    public final C141806ay f384861b;

    /* renamed from: c */
    public final C141921o f384862c;

    /* renamed from: d */
    public final boolean f384863d;

    /* renamed from: e */
    public final Boolean f384864e;

    /* renamed from: f */
    public final C141743b f384865f;

    /* renamed from: g */
    public final int f384866g;

    /* renamed from: h */
    public final Uri f384867h;

    /* renamed from: i */
    public final boolean f384868i;

    public C141810b(String str, C141806ay ayVar, C141921o oVar, boolean z, Boolean bool, C141743b bVar, int i, Uri uri, boolean z2) {
        this.f384860a = str;
        this.f384861b = ayVar;
        this.f384862c = oVar;
        this.f384863d = z;
        this.f384864e = bool;
        this.f384865f = bVar;
        this.f384866g = i;
        this.f384867h = uri;
        this.f384868i = z2;
    }

    /* renamed from: a */
    public final int mo116772a() {
        return this.f384866g;
    }

    /* renamed from: b */
    public final Uri mo116773b() {
        return this.f384867h;
    }

    /* renamed from: c */
    public final C141743b mo116774c() {
        return this.f384865f;
    }

    /* renamed from: d */
    public final C141921o mo116775d() {
        return this.f384862c;
    }

    /* renamed from: e */
    public final C141806ay mo116776e() {
        return this.f384861b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r1 = r4.f384864e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        r1 = r4.f384865f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0084, code lost:
        r1 = r4.f384867h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.search.transcription.p10670f.p10673b.C141832x
            r2 = 0
            if (r1 == 0) goto L_0x00a3
            com.google.android.apps.search.transcription.f.b.x r5 = (com.google.android.apps.search.transcription.p10670f.p10673b.C141832x) r5
            java.lang.String r1 = r4.f384860a
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r5.mo116780h()
            if (r1 != 0) goto L_0x00a3
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r5.mo116780h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a3
        L_0x0020:
            com.google.android.apps.search.transcription.f.ay r1 = r4.f384861b
            if (r1 != 0) goto L_0x002b
            com.google.android.apps.search.transcription.f.ay r1 = r5.mo116776e()
            if (r1 != 0) goto L_0x00a3
            goto L_0x0035
        L_0x002b:
            com.google.android.apps.search.transcription.f.ay r3 = r5.mo116776e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a3
        L_0x0035:
            com.google.android.apps.search.transcription.f.o r1 = r4.f384862c
            if (r1 != 0) goto L_0x0040
            com.google.android.apps.search.transcription.f.o r1 = r5.mo116775d()
            if (r1 != 0) goto L_0x00a3
            goto L_0x004a
        L_0x0040:
            com.google.android.apps.search.transcription.f.o r3 = r5.mo116775d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a3
        L_0x004a:
            boolean r1 = r4.f384863d
            boolean r3 = r5.mo116782i()
            if (r1 != r3) goto L_0x00a3
            java.lang.Boolean r1 = r4.f384864e
            if (r1 != 0) goto L_0x005d
            java.lang.Boolean r1 = r5.mo116779g()
            if (r1 != 0) goto L_0x00a3
            goto L_0x0067
        L_0x005d:
            java.lang.Boolean r3 = r5.mo116779g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a3
        L_0x0067:
            com.google.android.apps.search.transcription.b.b r1 = r4.f384865f
            if (r1 != 0) goto L_0x0072
            com.google.android.apps.search.transcription.b.b r1 = r5.mo116774c()
            if (r1 != 0) goto L_0x00a3
            goto L_0x007c
        L_0x0072:
            com.google.android.apps.search.transcription.b.b r3 = r5.mo116774c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a3
        L_0x007c:
            int r1 = r4.f384866g
            int r3 = r5.mo116772a()
            if (r1 != r3) goto L_0x00a3
            android.net.Uri r1 = r4.f384867h
            if (r1 != 0) goto L_0x008f
            android.net.Uri r1 = r5.mo116773b()
            if (r1 != 0) goto L_0x00a3
            goto L_0x009a
        L_0x008f:
            android.net.Uri r3 = r5.mo116773b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x009a
            goto L_0x00a3
        L_0x009a:
            boolean r1 = r4.f384868i
            boolean r5 = r5.mo116783j()
            if (r1 != r5) goto L_0x00a3
            return r0
        L_0x00a3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.transcription.p10670f.p10673b.C141810b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C141831w mo116778f() {
        return new C141809a(this);
    }

    /* renamed from: g */
    public final Boolean mo116779g() {
        return this.f384864e;
    }

    /* renamed from: h */
    public final String mo116780h() {
        return this.f384860a;
    }

    /* renamed from: i */
    public final boolean mo116782i() {
        return this.f384863d;
    }

    /* renamed from: j */
    public final boolean mo116783j() {
        return this.f384868i;
    }

    public final String toString() {
        String str = this.f384860a;
        String valueOf = String.valueOf(this.f384861b);
        String valueOf2 = String.valueOf(this.f384862c);
        boolean z = this.f384863d;
        Boolean bool = this.f384864e;
        String valueOf3 = String.valueOf(this.f384865f);
        int i = this.f384866g;
        String valueOf4 = String.valueOf(this.f384867h);
        boolean z2 = this.f384868i;
        return "TranscriptionState{language=" + str + ", liveTranscription=" + valueOf + ", finalRecognitionResults=" + valueOf2 + ", hasStartOfSpeech=" + z + ", isMicOpen=" + bool + ", appflowErrorStatus=" + valueOf3 + ", speechLevel=" + i + ", audioUri=" + valueOf4 + ", lastAudioRationaleToastTimestampLoaded=" + z2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f384860a;
        int i5 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        C141806ay ayVar = this.f384861b;
        if (ayVar == null) {
            i = 0;
        } else {
            i = ayVar.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        C141921o oVar = this.f384862c;
        if (oVar == null) {
            i2 = 0;
        } else {
            i2 = oVar.hashCode();
        }
        int i7 = 1237;
        int i8 = (((i6 ^ i2) * 1000003) ^ (true != this.f384863d ? 1237 : 1231)) * 1000003;
        Boolean bool = this.f384864e;
        if (bool == null) {
            i3 = 0;
        } else {
            i3 = bool.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        C141743b bVar = this.f384865f;
        if (bVar == null) {
            i4 = 0;
        } else {
            i4 = bVar.hashCode();
        }
        int i10 = (((i9 ^ i4) * 1000003) ^ this.f384866g) * 1000003;
        Uri uri = this.f384867h;
        if (uri != null) {
            i5 = uri.hashCode();
        }
        int i11 = (i10 ^ i5) * 1000003;
        if (true == this.f384868i) {
            i7 = 1231;
        }
        return i11 ^ i7;
    }
}

package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.o */
/* compiled from: PG */
public final /* synthetic */ class C122315o {
    /* renamed from: a */
    public static /* synthetic */ long m201825a(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(j ^ -1) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(-1 ^ j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            boolean z = true;
            boolean z2 = j >= 0;
            if (j2 == Long.MIN_VALUE) {
                z = false;
            }
            if (z || z2) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }
}

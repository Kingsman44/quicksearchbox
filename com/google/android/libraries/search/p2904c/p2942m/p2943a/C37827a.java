package com.google.android.libraries.search.p2904c.p2942m.p2943a;

import android.media.AudioRecord;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.p2906aa.C37329d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.c.m.a.a */
/* compiled from: PG */
public final class C37827a {

    /* renamed from: a */
    private static final C59071e f100354a = C59071e.m91332i("com.google.android.libraries.search.c.m.a.a");

    /* renamed from: a */
    public static int m66750a(C37360ay ayVar) {
        int i = ayVar.f99228c;
        return Math.max(C37329d.m66334b(ayVar) * (i > 16000 ? 128000 / i : 8), AudioRecord.getMinBufferSize(ayVar.f99228c, ayVar.f99229d, ayVar.f99230e));
    }

    /* renamed from: b */
    public static int m66751b(C37360ay ayVar) {
        int i = 8;
        int i2 = (ayVar.f99226a & 16) != 0 ? ayVar.f99231f : 8;
        if (i2 <= 0) {
            ((C59052c) ((C59052c) f100354a.mo56226d()).mo56372aa(52815)).mo56386p("#audio# The length of buffered audio cannot be 0 or less, using the default.");
        } else {
            i = i2;
        }
        if (i > 20) {
            ((C59052c) ((C59052c) f100354a.mo56226d()).mo56372aa(52814)).mo56386p("#audio# The length of buffered audio cannot exceed 20 seconds.");
            i = 20;
        }
        return C37329d.m66334b(ayVar) * i;
    }
}

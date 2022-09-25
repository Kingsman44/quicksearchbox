package androidx.media3.exoplayer.dash;

import android.net.Uri;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p151k.C3258x;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: androidx.media3.exoplayer.dash.o */
/* compiled from: PG */
final class C2946o implements C3258x {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6768a(Uri uri, InputStream inputStream) {
        return Long.valueOf(C2612ak.m6999x(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
    }
}

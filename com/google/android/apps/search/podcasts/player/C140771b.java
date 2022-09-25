package com.google.android.apps.search.podcasts.player;

import android.content.Context;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.exoplayer.C2758ac;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.C3231k;
import androidx.media3.exoplayer.C3270r;
import androidx.media3.exoplayer.C3271s;
import androidx.media3.exoplayer.p145h.C3022ae;
import androidx.media3.exoplayer.p145h.C3086bx;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.extractor.C3331af;
import androidx.media3.extractor.C3632v;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2504h;
import androidx.media3.p132b.C2513q;
import androidx.media3.p132b.C2514r;
import com.google.android.apps.search.podcasts.p10601r.C140958b;
import dagger.p5294a.C68220f;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.b */
/* compiled from: PG */
public final class C140771b implements C68220f {
    /* renamed from: a */
    public static C2759ad m228566a(Context context, Executor executor, String str, C140958b bVar, boolean z) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(executor, "executor");
        C69664n.m101061g(str, "versionName");
        String format = String.format(Locale.US, "GSA/%s", Arrays.copyOf(new Object[]{str}, 1));
        C69664n.m101060f(format, "format(locale, format, *args)");
        C3632v vVar = new C3632v();
        vVar.mo7642c();
        C2758ac acVar = new C2758ac(context, new C3270r(context), new C3271s(new C3022ae(context, (C3331af) vVar)));
        C2514r rVar = new C2514r();
        rVar.f6916a = format;
        rVar.f6919d = !z;
        acVar.mo6458e(new C3086bx(new C2513q(context, (C2495an) null, (C2504h) new C140791i(rVar, bVar))));
        C3231k.m9433b(120000, 0, "backBufferDurationMs", "0");
        C3231k.m9433b(2500, 0, "bufferForPlaybackMs", "0");
        C3231k.m9433b(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        C3231k.m9433b(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        C3231k.m9433b(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        C3231k.m9433b(900000, 50000, "maxBufferMs", "minBufferMs");
        acVar.mo6456c(new C3231k(new C3241g(), 900000, 120000));
        C2601a.m6832d(!acVar.f7660w);
        acVar.f7650m = true;
        C2601a.m6832d(!acVar.f7660w);
        acVar.f7649l = 2;
        C2601a.m6832d(!acVar.f7660w);
        acVar.f7654q = 10000;
        C2601a.m6832d(!acVar.f7660w);
        acVar.f7655r = 30000;
        return acVar.mo6454a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}

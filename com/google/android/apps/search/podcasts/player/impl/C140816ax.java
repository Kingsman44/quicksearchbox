package com.google.android.apps.search.podcasts.player.impl;

import android.net.Uri;
import androidx.media3.common.C2646bh;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10588n.C140676e;
import com.google.android.apps.search.podcasts.player.p10597d.C140785a;
import com.google.android.apps.search.podcasts.player.p10597d.C140786b;
import com.google.android.p10890h.p10891a.p10892a.C146553h;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5462h.p5472e.C69598b;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69762k;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.ax */
/* compiled from: PG */
public final class C140816ax implements C146553h {

    /* renamed from: a */
    public final C140806an f382424a;

    /* renamed from: b */
    private final C47770dh f382425b;

    /* renamed from: c */
    private final C140676e f382426c;

    /* renamed from: d */
    private final Executor f382427d;

    /* renamed from: e */
    private final C58974d f382428e = C58974d.m91134h("PodcastAudioPlayer");

    public C140816ax(C47770dh dhVar, C140676e eVar, Executor executor, C140806an anVar) {
        this.f382425b = dhVar;
        this.f382426c = eVar;
        this.f382427d = executor;
        this.f382424a = anVar;
    }

    /* renamed from: a */
    public final long mo23146a() {
        return 50176;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        p5462h.p5472e.C69598b.m101013a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23147b(boolean r4) {
        /*
            r3 = this;
            com.google.common.f.a.d r0 = r3.f382428e
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r1 = "onPrepare playWhenReady: %s"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.mo56389s(r1, r4)
            com.google.apps.tiktok.tracing.dh r4 = r3.f382425b
            java.lang.String r0 = "onPrepare"
            com.google.apps.tiktok.tracing.ax r4 = r4.mo51613c(r0)
            com.google.android.apps.search.podcasts.player.impl.an r0 = r3.f382424a     // Catch:{ all -> 0x003a }
            com.google.common.f.a.d r1 = r0.f382337L     // Catch:{ all -> 0x003a }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x003a }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "prepareOnMainThread"
            r1.mo56386p(r2)     // Catch:{ all -> 0x003a }
            com.google.android.libraries.p1623at.p1632e.C19559g.m37304c()     // Catch:{ all -> 0x003a }
            androidx.media3.common.bh r1 = r0.f382385w     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            r1.mo6017x()     // Catch:{ all -> 0x003a }
        L_0x0032:
            r0.mo115918w()     // Catch:{ all -> 0x003a }
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r4, r0)
            return
        L_0x003a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.player.impl.C140816ax.mo23147b(boolean):void");
    }

    /* renamed from: d */
    public final void mo23148d(Uri uri, boolean z) {
        C69664n.m101061g(uri, "uri");
        ((C58970a) this.f382428e.mo56226d()).mo56389s("Unhandled operation: onPrepareFromUri playWhenReady: %s", Boolean.valueOf(z));
    }

    /* renamed from: e */
    public final void mo23149e(String str, boolean z) {
        Throwable th;
        String str2 = str;
        C69664n.m101061g(str, "mediaId");
        ((C58970a) this.f382428e.mo56224b()).mo56355H("onPrepareFromMediaId mediaId: %s, playWhenReady: %s", str, z);
        C47538ax c = this.f382425b.mo51613c("onPrepareFromMediaId");
        try {
            C69664n.m101061g(str, "mediaId");
            if (C69764m.m101234m(str, "episode:")) {
                String substring = str.substring(8);
                C69664n.m101060f(substring, "this as java.lang.String).substring(startIndex)");
                Object[] array = new C69762k("___").mo61433a(substring, 3).toArray(new String[0]);
                C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
                if (strArr.length == 3) {
                    C140509u a = C140509u.m228215a(Integer.parseInt(strArr[0]));
                    if (a == null) {
                        a = C140509u.AUTOPLAY_DEFAULT;
                    }
                    C69664n.m101060f(a, "AutoplayContext.forNumbe…yContext.AUTOPLAY_DEFAULT");
                    C140785a aVar = new C140785a(C140786b.m228596a(strArr[1]), C140786b.m228596a(strArr[2]), a);
                    C60870cx a2 = this.f382426c.mo115825a(aVar.f382277a, aVar.f382278b);
                    C60870cx d = this.f382424a.mo115882d();
                    C60870cx e = this.f382424a.mo115883e();
                    C46459k.m82829b(C47638k.m84753d(a2, d, e).mo51520a(new C140815aw(a2, d, e, this, aVar, z), this.f382427d), "Failed to convert media Id to EpisodeItem or failed to retrieve playback parameters", new Object[0]);
                    C69598b.m101013a(c, (Throwable) null);
                    return;
                }
                throw new IllegalArgumentException(String.valueOf(str).concat(" is invalid episode media id, and could not get context, feed url, guid when splitting it by the separator."));
            }
            throw new IllegalArgumentException(String.valueOf(str).concat(" has invalid episode media id prefix."));
        } catch (Throwable th2) {
            Throwable th3 = th2;
            C69598b.m101013a(c, th);
            throw th3;
        }
    }

    /* renamed from: f */
    public final void mo23150f(String str, boolean z) {
        C69664n.m101061g(str, "query");
        ((C58970a) this.f382428e.mo56226d()).mo56389s("Unhandled operation: onPrepareFromSearch playWhenReady: %s", Boolean.valueOf(z));
    }

    /* renamed from: j */
    public final boolean mo23151j(C2646bh bhVar, String str) {
        C69664n.m101061g(bhVar, "player");
        C69664n.m101061g(str, "command");
        return false;
    }
}

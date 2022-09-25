package com.google.android.apps.search.podcasts.player.impl;

import android.os.Bundle;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10890h.p10891a.p10892a.C146548c;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.aq */
/* compiled from: PG */
public final class C140809aq implements C146548c {

    /* renamed from: a */
    final /* synthetic */ C140811as f382392a;

    /* renamed from: b */
    final /* synthetic */ C140806an f382393b;

    public C140809aq(C140811as asVar, C140806an anVar) {
        this.f382392a = asVar;
        this.f382393b = anVar;
    }

    /* renamed from: a */
    public final PlaybackStateCompat.CustomAction mo115922a() {
        String string = this.f382392a.f382398c.getResources().getString(R.string.podcasts_content_description_rewind_10_secs);
        if (TextUtils.isEmpty("ACTION_REWIND")) {
            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
        } else if (!TextUtils.isEmpty(string)) {
            return new PlaybackStateCompat.CustomAction("ACTION_REWIND", string, R.drawable.quantum_gm_ic_replay_10_white_48, (Bundle) null);
        } else {
            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        p5462h.p5472e.C69598b.m101013a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115923b(androidx.media3.common.C2646bh r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "player"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)
            java.lang.String r4 = "action"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r4)
            com.google.android.apps.search.podcasts.player.impl.as r4 = r3.f382392a
            com.google.apps.tiktok.tracing.dh r4 = r4.f382397b
            java.lang.String r0 = "onCustomAction: rewind"
            com.google.apps.tiktok.tracing.ax r4 = r4.mo51613c(r0)
            com.google.android.apps.search.podcasts.player.impl.an r1 = r3.f382393b
            java.lang.String r2 = "ACTION_REWIND"
            boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r2)     // Catch:{ all -> 0x0031 }
            if (r5 == 0) goto L_0x002c
            com.google.common.f.a.d r5 = com.google.android.apps.search.podcasts.player.impl.C140811as.f382396a     // Catch:{ all -> 0x0031 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ all -> 0x0031 }
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5     // Catch:{ all -> 0x0031 }
            r5.mo56386p(r0)     // Catch:{ all -> 0x0031 }
            r1.mo115890l()     // Catch:{ all -> 0x0031 }
        L_0x002c:
            r5 = 0
            p5462h.p5472e.C69598b.m101013a(r4, r5)
            return
        L_0x0031:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.player.impl.C140809aq.mo115923b(androidx.media3.common.bh, java.lang.String):void");
    }
}

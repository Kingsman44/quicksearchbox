package com.google.android.apps.search.transcription.voiceime;

import com.google.android.apps.search.transcription.C141741b;
import com.google.android.apps.search.transcription.p10670f.C141804aw;
import com.google.android.apps.search.transcription.p10670f.C141853bu;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10985l;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.time.Duration;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.search.transcription.voiceime.ak */
/* compiled from: PG */
public final class C141972ak {

    /* renamed from: a */
    public static final Duration f385236a = Duration.ofDays(90);

    /* renamed from: b */
    public static final C59071e f385237b = C59071e.m91332i("com.google.android.apps.search.transcription.voiceime.ak");

    /* renamed from: c */
    public final C141804aw f385238c;

    /* renamed from: d */
    public final C46723bg f385239d;

    /* renamed from: e */
    public final C142040t f385240e;

    /* renamed from: f */
    public final C141853bu f385241f;

    /* renamed from: g */
    public final C60888db f385242g;

    /* renamed from: h */
    public final C42876ab f385243h;

    /* renamed from: i */
    public final C10985l f385244i;

    /* renamed from: j */
    public final C21370a f385245j;

    /* renamed from: k */
    public final ConcurrentHashMap f385246k = new ConcurrentHashMap();

    /* renamed from: l */
    public final AtomicLong f385247l = new AtomicLong(0);

    /* renamed from: m */
    private final C46778cv f385248m;

    public C141972ak(C141804aw awVar, C46723bg bgVar, C46778cv cvVar, C142040t tVar, C141853bu buVar, C60888db dbVar, C42876ab abVar, C10985l lVar, C21370a aVar) {
        this.f385238c = awVar;
        this.f385239d = bgVar;
        this.f385248m = cvVar;
        this.f385240e = tVar;
        this.f385241f = buVar;
        this.f385242g = dbVar;
        this.f385243h = abVar;
        this.f385244i = lVar;
        this.f385245j = aVar;
    }

    /* renamed from: a */
    public final void mo116931a(C141741b bVar) {
        if (bVar != null) {
            ((C59052c) ((C59052c) f385237b.mo56224b()).mo56372aa(41977)).mo56386p("#cancelRecognition");
            C141971aj ajVar = (C141971aj) this.f385246k.get(Long.valueOf(bVar.f384722b));
            if (ajVar != null) {
                ajVar.f385235b.mo116754a();
            }
        }
    }

    /* renamed from: b */
    public final void mo116932b(C141741b bVar) {
        if (bVar != null) {
            ((C59052c) ((C59052c) f385237b.mo56224b()).mo56372aa(41979)).mo56386p("#finishRecognition");
            mo116931a(bVar);
            this.f385246k.remove(Long.valueOf(bVar.f384722b));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r8 = r5.f385248m;
        r0 = com.google.common.util.concurrent.C60866ct.f164955a;
        r8.mo50787a(r0, "VoiceIME:transcriptionState:" + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r8.equals(r2) != false) goto L_?;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116933c(long r6, com.google.common.base.C58817ah r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            j$.util.concurrent.ConcurrentHashMap r0 = r5.f385246k     // Catch:{ all -> 0x0042 }
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0042 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0042 }
            com.google.android.apps.search.transcription.voiceime.aj r0 = (com.google.android.apps.search.transcription.voiceime.C141971aj) r0     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            return
        L_0x0011:
            com.google.android.apps.search.transcription.f.b.x r2 = r0.f385234a     // Catch:{ all -> 0x0042 }
            java.lang.Object r8 = r8.apply(r2)     // Catch:{ all -> 0x0042 }
            com.google.android.apps.search.transcription.f.b.x r8 = (com.google.android.apps.search.transcription.p10670f.p10673b.C141832x) r8     // Catch:{ all -> 0x0042 }
            j$.util.concurrent.ConcurrentHashMap r3 = r5.f385246k     // Catch:{ all -> 0x0042 }
            com.google.android.apps.search.transcription.voiceime.aj r4 = new com.google.android.apps.search.transcription.voiceime.aj     // Catch:{ all -> 0x0042 }
            com.google.android.apps.search.transcription.f.av r0 = r0.f385235b     // Catch:{ all -> 0x0042 }
            r4.<init>(r8, r0)     // Catch:{ all -> 0x0042 }
            r3.put(r1, r4)     // Catch:{ all -> 0x0042 }
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0041
            com.google.apps.tiktok.dataservice.cv r8 = r5.f385248m
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "VoiceIME:transcriptionState:"
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r8.mo50787a(r0, r6)
        L_0x0041:
            return
        L_0x0042:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.transcription.voiceime.C141972ak.mo116933c(long, com.google.common.base.ah):void");
    }
}

package com.google.android.libraries.assistant.hotword;

import android.media.AudioRecord;
import com.google.android.libraries.assistant.soda.C19244ag;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.nio.channels.FileChannel;

/* renamed from: com.google.android.libraries.assistant.hotword.d */
/* compiled from: PG */
public final class C18352d {

    /* renamed from: a */
    final /* synthetic */ C18368e f52047a;

    /* renamed from: b */
    private final int f52048b;

    /* renamed from: c */
    private boolean f52049c;

    /* renamed from: d */
    private FileChannel f52050d;

    /* renamed from: e */
    private C18370g f52051e;

    /* renamed from: f */
    private final AudioRecord f52052f;

    /* renamed from: g */
    private final byte[] f52053g;

    /* renamed from: h */
    private final C19244ag f52054h = new C19244ag();

    public C18352d(C18368e eVar, AudioRecord audioRecord, int i) {
        this.f52047a = eVar;
        if (i <= 0) {
            C59104x d = C18368e.f52098a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AlwaysOpenAudioRead");
            ((C59052c) ((C59052c) d).mo56372aa(47092)).mo56387q("CaptureTask created with readSize %d bytes", i);
            i = 2;
        }
        this.f52052f = audioRecord;
        this.f52048b = i;
        this.f52053g = new byte[i];
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043 A[SYNTHETIC, Splitter:B:11:0x0043] */
    /* renamed from: a */
    public final void mo23813a() {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IllegalStateException -> 0x002a }
            android.media.AudioRecord r2 = r8.f52052f     // Catch:{ IllegalStateException -> 0x002a }
            r2.startRecording()     // Catch:{ IllegalStateException -> 0x002a }
            android.media.AudioRecord r2 = r8.f52052f
            int r2 = r2.getRecordingState()
            r3 = 3
            if (r2 == r3) goto L_0x0028
            com.google.common.f.e r2 = com.google.android.libraries.assistant.hotword.C18368e.f52098a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "AlwaysOpenAudioRead"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "recording stopped, not in RECORDSTATE_RECORDING state"
            r4 = 47105(0xb801, float:6.6008E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            goto L_0x0040
        L_0x0028:
            r2 = 1
            goto L_0x0041
        L_0x002a:
            r2 = move-exception
            com.google.common.f.e r3 = com.google.android.libraries.assistant.hotword.C18368e.f52098a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "AlwaysOpenAudioRead"
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "Not able to start recording"
            r5 = 47106(0xb802, float:6.601E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r5)).mo56386p(r4)
        L_0x0040:
            r2 = 0
        L_0x0041:
            if (r2 == 0) goto L_0x00d9
            android.media.AudioRecord r3 = r8.f52052f     // Catch:{ IllegalStateException -> 0x00c4 }
            byte[] r4 = r8.f52053g     // Catch:{ IllegalStateException -> 0x00c4 }
            com.google.android.libraries.assistant.hotword.e r5 = r8.f52047a     // Catch:{ IllegalStateException -> 0x00c4 }
            int r5 = r5.f52099b     // Catch:{ IllegalStateException -> 0x00c4 }
            int r3 = r3.read(r4, r1, r5)     // Catch:{ IllegalStateException -> 0x00c4 }
            if (r3 <= 0) goto L_0x00d9
            monitor-enter(r8)
            boolean r4 = r8.f52049c     // Catch:{ all -> 0x00c1 }
            java.nio.channels.FileChannel r5 = r8.f52050d     // Catch:{ all -> 0x00c1 }
            com.google.android.libraries.assistant.hotword.g r6 = r8.f52051e     // Catch:{ all -> 0x00c1 }
            monitor-exit(r8)     // Catch:{ all -> 0x00c1 }
            if (r4 != 0) goto L_0x0065
            if (r6 == 0) goto L_0x0065
            monitor-enter(r8)
            r8.f52049c = r0     // Catch:{ all -> 0x0062 }
            monitor-exit(r8)     // Catch:{ all -> 0x0062 }
            goto L_0x0065
        L_0x0062:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0062 }
            throw r0
        L_0x0065:
            if (r5 == 0) goto L_0x0041
            com.google.android.libraries.assistant.soda.ag r4 = r8.f52054h     // Catch:{ AsynchronousCloseException -> 0x00ba, IOException -> 0x007a }
            java.nio.ByteBuffer r4 = r4.mo24395a(r3)     // Catch:{ AsynchronousCloseException -> 0x00ba, IOException -> 0x007a }
            byte[] r7 = r8.f52053g     // Catch:{ AsynchronousCloseException -> 0x00ba, IOException -> 0x007a }
            java.nio.ByteBuffer r3 = r4.put(r7, r1, r3)     // Catch:{ AsynchronousCloseException -> 0x00ba, IOException -> 0x007a }
            r3.flip()     // Catch:{ AsynchronousCloseException -> 0x00ba, IOException -> 0x007a }
            r5.write(r3)     // Catch:{ AsynchronousCloseException -> 0x00ba, IOException -> 0x007a }
            goto L_0x0041
        L_0x007a:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            if (r4 == 0) goto L_0x009f
            java.lang.String r5 = "Broken pipe"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x009f
            com.google.common.f.e r3 = com.google.android.libraries.assistant.hotword.C18368e.f52098a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "AlwaysOpenAudioRead"
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "File channel write interrupt by IOException"
            r5 = 47100(0xb7fc, float:6.6001E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            goto L_0x00b4
        L_0x009f:
            com.google.common.f.e r4 = com.google.android.libraries.assistant.hotword.C18368e.f52098a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "AlwaysOpenAudioRead"
            r4.mo56378ag(r5, r7)
            java.lang.String r5 = "IOException"
            r7 = 47099(0xb7fb, float:6.6E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r7)).mo56386p(r5)
        L_0x00b4:
            if (r6 == 0) goto L_0x0041
            r6.mo23775a(r0)
            goto L_0x0041
        L_0x00ba:
            if (r6 == 0) goto L_0x0041
            r6.mo23775a(r0)
            goto L_0x0041
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00c1 }
            throw r0
        L_0x00c4:
            com.google.common.f.e r0 = com.google.android.libraries.assistant.hotword.C18368e.f52098a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "AlwaysOpenAudioRead"
            r0.mo56378ag(r1, r3)
            java.lang.String r1 = "AudioRecord#read get IllegalStateException!!!!!!"
            r3 = 47101(0xb7fd, float:6.6003E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)
        L_0x00d9:
            monitor-enter(r8)
            com.google.android.libraries.assistant.hotword.g r0 = r8.f52051e     // Catch:{ all -> 0x00e8 }
            monitor-exit(r8)     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00e2
            r0.mo23775a(r2)
        L_0x00e2:
            com.google.android.libraries.assistant.hotword.e r0 = r8.f52047a
            r0.mo23851c()
            return
        L_0x00e8:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00e8 }
            goto L_0x00ec
        L_0x00eb:
            throw r0
        L_0x00ec:
            goto L_0x00eb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.hotword.C18352d.mo23813a():void");
    }

    /* renamed from: b */
    public final synchronized void mo23814b(FileChannel fileChannel, C18370g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f52049c = false;
        this.f52050d = fileChannel;
        this.f52051e = gVar;
    }

    public final String toString() {
        return "CaptureTask with read size. with read size " + this.f52048b + " bytes";
    }
}

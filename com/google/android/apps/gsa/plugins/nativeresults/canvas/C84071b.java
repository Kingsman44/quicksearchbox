package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import android.os.Bundle;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0310l;
import com.google.android.libraries.componentview.components.p1682a.C19830p;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.b */
/* compiled from: PG */
final class C84071b extends C0310l {

    /* renamed from: d */
    final /* synthetic */ C84108l f228976d;

    public C84071b(C84108l lVar) {
        this.f228976d = lVar;
    }

    /* renamed from: d */
    public final void mo1005d(MediaMetadataCompat mediaMetadataCompat) {
        if (this.f228976d.f229029h != null) {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f228976d.mo77538k() && mediaMetadataCompat.f945b.containsKey("android.media.metadata.TRACK_NUMBER")) {
                C19830p pVar = this.f228976d.f229029h;
                pVar.getClass();
                pVar.mo25136b((int) mediaMetadataCompat.mo816a("android.media.metadata.TRACK_NUMBER"));
            }
        }
    }

    /* renamed from: i */
    public final void mo1010i() {
        C59104x b = C84108l.f229022a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CanvasAudioService");
        ((C59052c) ((C59052c) b).mo56372aa(7010)).mo56386p("onSessionDestroyed");
        C19830p pVar = this.f228976d.f229029h;
        if (pVar != null) {
            pVar.mo25137c();
        }
        this.f228976d.mo77537i();
    }

    /* renamed from: j */
    public final void mo1011j(String str, Bundle bundle) {
        if (str.equals("com.google.android.apps.gsa.search.core.work.audioplayer.EVENT_DISCONNECT_MEDIA_SESSION")) {
            C58976aa aaVar = C58975e.f156826a;
            C19830p pVar = this.f228976d.f229029h;
            if (pVar != null) {
                pVar.mo25137c();
            }
            this.f228976d.mo77537i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        if (r5 == 6) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1006e(android.support.p031v4.media.session.PlaybackStateCompat r8) {
        /*
            r7 = this;
            com.google.android.apps.gsa.plugins.nativeresults.canvas.l r0 = r7.f228976d
            com.google.android.libraries.componentview.components.a.p r0 = r0.f229029h
            if (r0 == 0) goto L_0x00e5
            r0 = 5
            r1 = 4
            r2 = 2
            r3 = 1
            r4 = 3
            if (r8 == 0) goto L_0x0047
            int r5 = r8.f994a
            if (r5 != 0) goto L_0x0012
            goto L_0x0047
        L_0x0012:
            android.os.Bundle r5 = r8.f1004k
            if (r5 == 0) goto L_0x0020
            java.lang.String r6 = "PlaybackState.ENDED"
            byte r6 = r5.getByte(r6)
            if (r6 == 0) goto L_0x0020
            r8 = 4
            goto L_0x0048
        L_0x0020:
            if (r5 == 0) goto L_0x002c
            java.lang.String r6 = "PlaybackState.SUSPENDED"
            byte r5 = r5.getByte(r6)
            if (r5 == 0) goto L_0x002c
        L_0x002a:
            r8 = 3
            goto L_0x0048
        L_0x002c:
            int r5 = r8.f994a
            r6 = 7
            if (r5 != r6) goto L_0x003a
            int r8 = r8.f999f
            r5 = 11
            if (r8 == r5) goto L_0x0039
            r8 = 5
            goto L_0x0048
        L_0x0039:
            r5 = 7
        L_0x003a:
            if (r5 == r3) goto L_0x002a
            if (r5 != r2) goto L_0x003f
            goto L_0x002a
        L_0x003f:
            if (r5 != r4) goto L_0x0043
            r8 = 2
            goto L_0x0048
        L_0x0043:
            r8 = 6
            if (r5 != r8) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r8 = 1
        L_0x0048:
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r8 = r8 + -1
            if (r8 == r3) goto L_0x00bd
            if (r8 == r2) goto L_0x0096
            if (r8 == r4) goto L_0x0096
            if (r8 == r1) goto L_0x006a
            if (r8 == r0) goto L_0x0057
            goto L_0x00ca
        L_0x0057:
            com.google.android.apps.gsa.plugins.nativeresults.canvas.l r8 = r7.f228976d
            com.google.android.libraries.componentview.components.a.p r8 = r8.f229029h
            r8.getClass()
            com.google.android.libraries.componentview.components.a.q r8 = r8.f55419a
            int r0 = r8.f55442l
            if (r0 == r4) goto L_0x00ca
            r8.f55442l = r4
            r8.mo25140k()
            return
        L_0x006a:
            com.google.android.apps.gsa.plugins.nativeresults.canvas.l r8 = r7.f228976d
            com.google.android.libraries.componentview.components.a.p r8 = r8.f229029h
            r8.getClass()
            com.google.android.libraries.componentview.components.a.q r0 = r8.f55419a
            int r2 = r0.f55442l
            if (r2 == r1) goto L_0x0081
            r0.f55442l = r1
            r0.mo25140k()
            com.google.android.libraries.componentview.components.a.q r8 = r8.f55419a
            r8.mo25141l()
        L_0x0081:
            com.google.common.f.e r8 = com.google.android.apps.gsa.plugins.nativeresults.canvas.C84108l.f229022a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "CanvasAudioService"
            r8.mo56378ag(r0, r1)
            java.lang.String r0 = "Error while trying to play audio."
            r1 = 7009(0x1b61, float:9.822E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0096:
            com.google.android.apps.gsa.plugins.nativeresults.canvas.l r8 = r7.f228976d
            com.google.android.libraries.componentview.components.a.p r8 = r8.f229029h
            r8.getClass()
            com.google.android.libraries.componentview.components.a.q r0 = r8.f55419a
            r0.f55442l = r3
            boolean r1 = r0.f55435e
            if (r1 == 0) goto L_0x00b7
            com.google.android.libraries.componentview.services.application.b r0 = r0.f55432b
            int r0 = r0.mo25497a()
            if (r0 < 0) goto L_0x00b7
            com.google.android.libraries.componentview.components.a.q r0 = r8.f55419a
            com.google.android.libraries.componentview.services.application.b r1 = r0.f55432b
            int r1 = r1.mo25497a()
            r0.f55438h = r1
        L_0x00b7:
            com.google.android.libraries.componentview.components.a.q r8 = r8.f55419a
            r8.mo25140k()
            return
        L_0x00bd:
            com.google.android.apps.gsa.plugins.nativeresults.canvas.l r8 = r7.f228976d
            com.google.android.libraries.componentview.components.a.p r8 = r8.f229029h
            r8.getClass()
            com.google.android.libraries.componentview.components.a.q r0 = r8.f55419a
            int r1 = r0.f55442l
            if (r1 != r2) goto L_0x00cb
        L_0x00ca:
            return
        L_0x00cb:
            r0.f55442l = r2
            r0.mo25140k()
            com.google.android.libraries.componentview.components.a.q r0 = r8.f55419a
            r0.mo25141l()
            com.google.android.libraries.componentview.components.a.q r0 = r8.f55419a
            android.widget.SeekBar r1 = r0.f55440j
            com.google.android.libraries.componentview.components.a.o r2 = new com.google.android.libraries.componentview.components.a.o
            com.google.android.libraries.componentview.services.application.ca r0 = r0.f55433c
            com.google.android.libraries.componentview.a.b.a r3 = com.google.android.libraries.componentview.p1675a.p1677b.C19742a.ON_DRAW_EXCEPTION
            r2.<init>(r8, r0, r3)
            r1.post(r2)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.plugins.nativeresults.canvas.C84071b.mo1006e(android.support.v4.media.session.PlaybackStateCompat):void");
    }
}

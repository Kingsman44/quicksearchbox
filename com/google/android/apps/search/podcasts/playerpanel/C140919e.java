package com.google.android.apps.search.podcasts.playerpanel;

import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.e */
/* compiled from: PG */
final class C140919e implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C140921g f382648a;

    public C140919e(C140921g gVar) {
        this.f382648a = gVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0032, code lost:
        r2 = r2.f382282c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo20961j(java.lang.Object r13) {
        /*
            r12 = this;
            j$.util.Optional r13 = (p3186j$.util.Optional) r13
            com.google.android.apps.search.podcasts.playerpanel.g r0 = r12.f382648a
            r1 = 0
            java.lang.Object r13 = r13.orElse(r1)
            com.google.android.apps.search.podcasts.player.e r13 = (com.google.android.apps.search.podcasts.player.C140787e) r13
            r0.f382656g = r13
            com.google.android.apps.search.podcasts.playerpanel.g r13 = r12.f382648a
            com.google.android.apps.search.podcasts.playerpanel.d r0 = r13.f382650a
            android.view.View r0 = r0.requireView()
            java.lang.String r2 = "fragment.requireView()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            android.widget.ImageView r2 = com.google.android.apps.search.podcasts.playerpanel.C140922h.m228870a(r0)
            java.lang.String r3 = "rootView.getToggleButton()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.android.apps.search.podcasts.player.e r3 = r13.f382656g
            r4 = 2131234349(0x7f080e2d, float:1.8084861E38)
            r5 = 2131234971(0x7f08109b, float:1.8086123E38)
            com.google.android.apps.search.podcasts.playerpanel.C140913bb.m228843d(r2, r3, r4, r5)
            com.google.android.apps.search.podcasts.player.e r2 = r13.f382656g
            if (r2 == 0) goto L_0x0039
            com.google.android.apps.search.podcasts.m.a.b r2 = r2.f382282c
            if (r2 == 0) goto L_0x0039
            java.lang.String r2 = r2.f381976c
            goto L_0x003a
        L_0x0039:
            r2 = r1
        L_0x003a:
            android.widget.TextView r3 = com.google.android.apps.search.podcasts.playerpanel.C140922h.m228872c(r0)
            java.lang.CharSequence r3 = r3.getText()
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r2)
            if (r3 != 0) goto L_0x004f
            android.widget.TextView r3 = com.google.android.apps.search.podcasts.playerpanel.C140922h.m228872c(r0)
            r3.setText(r2)
        L_0x004f:
            com.google.android.apps.search.podcasts.player.e r2 = r13.f382656g
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0068
            com.google.android.apps.search.podcasts.m.a.b r2 = r2.f382282c
            if (r2 == 0) goto L_0x0068
            com.google.android.apps.search.podcasts.m.b.b r2 = r2.f381974a
            if (r2 != 0) goto L_0x005f
            com.google.android.apps.search.podcasts.m.b.b r2 = com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b.f381993r
        L_0x005f:
            if (r2 == 0) goto L_0x0068
            java.lang.String r2 = r2.f381996b
            if (r2 != 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r5 = r2
            goto L_0x0069
        L_0x0068:
            r5 = r3
        L_0x0069:
            com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView r4 = com.google.android.apps.search.podcasts.playerpanel.C140922h.m228873d(r0)
            java.lang.String r2 = "rootView\n      .getThumbnail()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r2)
            com.google.android.apps.search.podcasts.player.e r2 = r13.f382656g
            if (r2 == 0) goto L_0x0089
            com.google.android.apps.search.podcasts.m.a.b r2 = r2.f382282c
            if (r2 == 0) goto L_0x0089
            com.google.android.apps.search.podcasts.m.b.b r2 = r2.f381974a
            if (r2 != 0) goto L_0x0080
            com.google.android.apps.search.podcasts.m.b.b r2 = com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b.f381993r
        L_0x0080:
            if (r2 == 0) goto L_0x0089
            java.lang.String r2 = r2.f381998d
            if (r2 != 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r6 = r2
            goto L_0x008a
        L_0x0089:
            r6 = r3
        L_0x008a:
            com.google.apps.tiktok.media.e r7 = r13.f382654e
            com.google.android.apps.search.podcasts.player.e r2 = r13.f382656g
            if (r2 == 0) goto L_0x009e
            com.google.android.apps.search.podcasts.m.a.b r2 = r2.f382282c
            if (r2 == 0) goto L_0x009e
            com.google.android.apps.search.podcasts.m.b.b r2 = r2.f381974a
            if (r2 != 0) goto L_0x009a
            com.google.android.apps.search.podcasts.m.b.b r2 = com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b.f381993r
        L_0x009a:
            if (r2 == 0) goto L_0x009e
            java.lang.String r1 = r2.f382003i
        L_0x009e:
            r8 = r1
            r9 = 0
            r10 = 0
            r11 = 48
            com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView.m229315d(r4, r5, r6, r7, r8, r9, r10, r11)
            android.widget.ProgressBar r0 = com.google.android.apps.search.podcasts.playerpanel.C140922h.m228871b(r0)
            java.lang.String r1 = "progressBar"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.android.apps.search.podcasts.player.e r2 = r13.f382656g
            com.google.android.libraries.f.a r3 = r13.f382653d
            com.google.android.apps.search.podcasts.playerpanel.C140913bb.m228841b(r0, r2, r3)
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.android.apps.search.podcasts.player.e r1 = r13.f382656g
            com.google.android.apps.search.podcasts.playerpanel.C140913bb.m228842c(r0, r1)
            com.google.android.apps.search.podcasts.player.e r13 = r13.f382656g
            boolean r13 = com.google.android.apps.search.podcasts.player.C140752a.m228545e(r13)
            r0.setEnabled(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.playerpanel.C140919e.mo20961j(java.lang.Object):void");
    }
}

package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a;

import android.view.View;
import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import com.google.android.youtube.player.p3560a.C45439a;
import com.google.android.youtube.player.p3561b.C45463av;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.a.d */
/* compiled from: PG */
final class C105003d extends C105018s {

    /* renamed from: a */
    public final C45439a f292555a;

    /* renamed from: b */
    public final YouTubeEmbedSupportFragment f292556b;

    /* renamed from: c */
    public final String f292557c;

    /* renamed from: d */
    public final View f292558d;

    /* renamed from: e */
    public final C45463av f292559e;

    public C105003d(C45463av avVar, C45439a aVar, YouTubeEmbedSupportFragment youTubeEmbedSupportFragment, String str, View view) {
        this.f292559e = avVar;
        this.f292555a = aVar;
        this.f292556b = youTubeEmbedSupportFragment;
        this.f292557c = str;
        this.f292558d = view;
    }

    /* renamed from: a */
    public final View mo94460a() {
        return this.f292558d;
    }

    /* renamed from: b */
    public final C105017r mo94461b() {
        return new C105002c(this);
    }

    /* renamed from: c */
    public final YouTubeEmbedSupportFragment mo94462c() {
        return this.f292556b;
    }

    /* renamed from: d */
    public final C45439a mo94463d() {
        return this.f292555a;
    }

    /* renamed from: e */
    public final String mo94464e() {
        return this.f292557c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r1 = r4.f292558d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a.C105018s
            r2 = 0
            if (r1 == 0) goto L_0x0052
            com.google.android.apps.gsa.staticplugins.nowcards.i.b.a.s r5 = (com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a.C105018s) r5
            com.google.android.youtube.player.b.av r1 = r4.f292559e
            com.google.android.youtube.player.b.av r3 = r5.mo94466f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0052
            com.google.android.youtube.player.a.a r1 = r4.f292555a
            com.google.android.youtube.player.a.a r3 = r5.mo94463d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0052
            com.google.android.youtube.player.YouTubeEmbedSupportFragment r1 = r4.f292556b
            com.google.android.youtube.player.YouTubeEmbedSupportFragment r3 = r5.mo94462c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0052
            java.lang.String r1 = r4.f292557c
            java.lang.String r3 = r5.mo94464e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0052
            android.view.View r1 = r4.f292558d
            if (r1 != 0) goto L_0x0046
            android.view.View r5 = r5.mo94460a()
            if (r5 != 0) goto L_0x0052
            goto L_0x0051
        L_0x0046:
            android.view.View r5 = r5.mo94460a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            return r0
        L_0x0052:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a.C105003d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C45463av mo94466f() {
        return this.f292559e;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((this.f292559e.hashCode() ^ 1000003) * 1000003) ^ this.f292555a.hashCode()) * 1000003) ^ this.f292556b.hashCode()) * 1000003) ^ this.f292557c.hashCode()) * 1000003;
        View view = this.f292558d;
        if (view == null) {
            i = 0;
        } else {
            i = view.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f292559e.toString();
        String obj2 = this.f292555a.toString();
        String obj3 = this.f292556b.toString();
        String str = this.f292557c;
        String valueOf = String.valueOf(this.f292558d);
        return "YouTubeFragmentInitInfo{youTubeInitializationResult=" + obj + ", youTubeInitializationResultListener=" + obj2 + ", youTubeEmbedFragment=" + obj3 + ", youtubeFragmentTag=" + str + ", attachedView=" + valueOf + "}";
    }
}

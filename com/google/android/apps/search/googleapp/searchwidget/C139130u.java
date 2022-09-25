package com.google.android.apps.search.googleapp.searchwidget;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.gsa.h.p.a;
import com.google.android.apps.gsa.h.p.f;
import com.google.android.apps.gsa.h.p.i;
import com.google.android.apps.gsa.p5855h.p5860q.C74540c;
import com.google.android.apps.gsa.p5855h.p5860q.C74541e;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.searchwidget.p10478b.C138928b;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139001ae;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139025y;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2051ab.C24970c;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.lens.p4707j.C62433bj;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.u */
/* compiled from: PG */
public final class C139130u {

    /* renamed from: a */
    private final Context f378377a;

    /* renamed from: b */
    private final Optional f378378b;

    /* renamed from: c */
    private final C139135z f378379c;

    /* renamed from: d */
    private final C139025y f378380d;

    /* renamed from: e */
    private final C139001ae f378381e;

    /* renamed from: f */
    private final C138928b f378382f;

    /* renamed from: g */
    private final boolean f378383g;

    /* renamed from: h */
    private final C42876ab f378384h;

    /* renamed from: i */
    private final C138926b f378385i;

    public C139130u(Context context, C138926b bVar, Optional optional, C139135z zVar, C139025y yVar, C139001ae aeVar, C71422aw awVar, C138928b bVar2, boolean z, C42876ab abVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(optional, "badgeCreatorOptional");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(abVar, "searchWidgetDoodleInfoDataStore");
        this.f378377a = context;
        this.f378385i = bVar;
        this.f378378b = optional;
        this.f378379c = zVar;
        this.f378380d = yVar;
        this.f378381e = aeVar;
        this.f378382f = bVar2;
        this.f378383g = z;
        this.f378384h = abVar;
    }

    /* renamed from: h */
    private final Object m225994h(Bundle bundle, boolean z, C69577g gVar) {
        int i = bundle.getInt("appWidgetMinWidth");
        Resources resources = this.f378377a.getResources();
        if (i < resources.getInteger(R.integer.googleapp_min_widget_width_zero_right_icons_dp)) {
            return mo114754e(z, gVar);
        }
        if (i < resources.getInteger(R.integer.googleapp_min_widget_width_one_right_icon_dp)) {
            return mo114755f(z, gVar);
        }
        if (i < resources.getInteger(R.integer.googleapp_min_widget_width_two_right_icons_dp)) {
            return mo114753d(z, gVar);
        }
        return mo114754e(z, gVar);
    }

    /* renamed from: i */
    private final void m225995i(RemoteViews remoteViews) {
        C138926b bVar = this.f378385i;
        Context context = this.f378377a;
        C139921f fVar = bVar.f377857a;
        C24970c cVar = new C24970c();
        cVar.f68102j = context.getPackageName();
        cVar.f68105m = C62433bj.LENS_IN_QSB_WIDGET.f168594ao;
        Intent a = fVar.mo115337a(cVar.mo30192a());
        ClipData clipData = C147798a.f398772a;
        PendingIntent activity = PendingIntent.getActivity(context, 10, C147798a.m240896b(a, 201326592, 0), 201326592);
        activity.getClass();
        remoteViews.setOnClickPendingIntent(R.id.googleapp_search_widget_lens_btn, activity);
    }

    /* renamed from: j */
    private final void m225996j(RemoteViews remoteViews) {
        remoteViews.setOnClickPendingIntent(R.id.googleapp_search_widget_google_logo, this.f378385i.mo114636a(this.f378377a));
    }

    /* renamed from: k */
    private final void m225997k(RemoteViews remoteViews) {
        C138926b bVar = this.f378385i;
        Context context = this.f378377a;
        Intent intent = new Intent();
        if (!bVar.f377858b) {
            intent.setAction("android.search.action.GLOBAL_SEARCH");
            intent.setClassName("com.google.android.googlequicksearchbox", e.b());
            intent.setFlags(268468224);
        } else if (bVar.f377859c.mo113716a()) {
            C136128i l = C136129j.m221208l();
            l.mo112776k(C139779t.SEARCH);
            l.mo112767b(true);
            C136127h.m221196a(intent, l.mo112766a());
        } else {
            f createBuilder = i.f.createBuilder();
            createBuilder.copyOnWrite();
            i iVar = createBuilder.instance;
            iVar.d = 6;
            iVar.a |= 4;
            i build = createBuilder.build();
            int a = C74540c.m120514a(build.d);
            if (a == 0) {
                a = 1;
            }
            intent = C74541e.m120515a(a);
            a.d(build, intent);
        }
        intent.putExtra("source", "and.gsa.widget.text");
        ClipData clipData = C147798a.f398772a;
        PendingIntent activity = PendingIntent.getActivity(context, 1, C147798a.m240896b(intent, 201326592, 0), 201326592);
        activity.getClass();
        remoteViews.setOnClickPendingIntent(R.id.googleapp_search_widget_background, activity);
    }

    /* renamed from: l */
    private final void m225998l(RemoteViews remoteViews) {
        C138926b bVar = this.f378385i;
        Context context = this.f378377a;
        Intent intent = new Intent();
        if (!bVar.f377858b) {
            intent.setAction("com.google.android.googlequicksearchbox.action.CLASSIC_GSA_VOICE_SEARCH");
            intent.setClassName("com.google.android.googlequicksearchbox", e.b());
            intent.setFlags(268468224);
        } else if (bVar.f377860d.mo112951a()) {
            C136128i l = C136129j.m221208l();
            l.mo112776k(C139779t.SEARCH);
            C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
            eVar.copyOnWrite();
            C137418g gVar = (C137418g) eVar.instance;
            gVar.f373769a |= 32;
            gVar.f373776h = true;
            eVar.copyOnWrite();
            C137418g gVar2 = (C137418g) eVar.instance;
            gVar2.f373779k = 2;
            gVar2.f373769a |= 512;
            l.mo112775j(Optional.m71637of((C137418g) eVar.build()));
            l.mo112767b(true);
            C136127h.m221196a(intent, l.mo112766a());
        } else {
            intent = e.c(4, Optional.m71637of("and.gsa.widget.mic"));
            intent.setFlags(268468224);
        }
        intent.putExtra("source", "and.gsa.widget.mic");
        ClipData clipData = C147798a.f398772a;
        PendingIntent activity = PendingIntent.getActivity(context, 3, C147798a.m240896b(intent, 201326592, 0), 201326592);
        activity.getClass();
        remoteViews.setOnClickPendingIntent(R.id.googleapp_search_widget_voice_btn, activity);
    }

    /* renamed from: m */
    private final void m225999m() {
        if (this.f378378b.isPresent()) {
            ((C138923a) this.f378378b.get()).mo114635a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114750a(p5462h.p5466c.C69577g r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r1 instanceof com.google.android.apps.search.googleapp.searchwidget.C139036n
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.google.android.apps.search.googleapp.searchwidget.n r2 = (com.google.android.apps.search.googleapp.searchwidget.C139036n) r2
            int r3 = r2.f378135k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f378135k = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.googleapp.searchwidget.n r2 = new com.google.android.apps.search.googleapp.searchwidget.n
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f378133i
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f378135k
            r5 = 4
            r6 = 0
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r4 == 0) goto L_0x00aa
            if (r4 == r9) goto L_0x008a
            if (r4 == r8) goto L_0x0069
            if (r4 == r7) goto L_0x004d
            if (r4 != r5) goto L_0x0045
            int r7 = r2.f378132h
            java.lang.Object r3 = r2.f378127c
            android.util.SizeF r3 = (android.util.SizeF) r3
            java.lang.Object r4 = r2.f378126b
            h.i[] r4 = (p5462h.C69685i[]) r4
            java.lang.Object r2 = r2.f378125a
            h.i[] r2 = (p5462h.C69685i[]) r2
            p5462h.C69714l.m101134b(r1)
            goto L_0x0175
        L_0x0045:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004d:
            int r8 = r2.f378132h
            java.lang.Object r4 = r2.f378129e
            android.util.SizeF r4 = (android.util.SizeF) r4
            java.lang.Object r9 = r2.f378128d
            h.i[] r9 = (p5462h.C69685i[]) r9
            java.lang.Object r11 = r2.f378127c
            h.i[] r11 = (p5462h.C69685i[]) r11
            java.lang.Object r12 = r2.f378126b
            android.util.SizeF r12 = (android.util.SizeF) r12
            java.lang.Object r13 = r2.f378125a
            com.google.android.apps.search.googleapp.searchwidget.u r13 = (com.google.android.apps.search.googleapp.searchwidget.C139130u) r13
            p5462h.C69714l.m101134b(r1)
            r5 = r12
            goto L_0x0153
        L_0x0069:
            int r9 = r2.f378132h
            java.lang.Object r4 = r2.f378130f
            android.util.SizeF r4 = (android.util.SizeF) r4
            java.lang.Object r11 = r2.f378129e
            h.i[] r11 = (p5462h.C69685i[]) r11
            java.lang.Object r12 = r2.f378128d
            h.i[] r12 = (p5462h.C69685i[]) r12
            java.lang.Object r13 = r2.f378127c
            android.util.SizeF r13 = (android.util.SizeF) r13
            java.lang.Object r14 = r2.f378126b
            android.util.SizeF r14 = (android.util.SizeF) r14
            java.lang.Object r15 = r2.f378125a
            com.google.android.apps.search.googleapp.searchwidget.u r15 = (com.google.android.apps.search.googleapp.searchwidget.C139130u) r15
            p5462h.C69714l.m101134b(r1)
            r5 = r13
            r13 = r15
            goto L_0x012f
        L_0x008a:
            int r4 = r2.f378132h
            java.lang.Object r11 = r2.f378131g
            java.lang.Object r12 = r2.f378130f
            h.i[] r12 = (p5462h.C69685i[]) r12
            java.lang.Object r13 = r2.f378129e
            h.i[] r13 = (p5462h.C69685i[]) r13
            java.lang.Object r14 = r2.f378128d
            android.util.SizeF r14 = (android.util.SizeF) r14
            java.lang.Object r15 = r2.f378127c
            android.util.SizeF r15 = (android.util.SizeF) r15
            java.lang.Object r7 = r2.f378126b
            android.util.SizeF r7 = (android.util.SizeF) r7
            java.lang.Object r8 = r2.f378125a
            com.google.android.apps.search.googleapp.searchwidget.u r8 = (com.google.android.apps.search.googleapp.searchwidget.C139130u) r8
            p5462h.C69714l.m101134b(r1)
            goto L_0x0109
        L_0x00aa:
            p5462h.C69714l.m101134b(r1)
            android.content.Context r1 = r0.f378377a
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131493041(0x7f0c00b1, float:1.860955E38)
            int r4 = r1.getInteger(r4)
            r7 = 2131493044(0x7f0c00b4, float:1.8609557E38)
            int r7 = r1.getInteger(r7)
            r8 = 2131493042(0x7f0c00b2, float:1.8609553E38)
            int r8 = r1.getInteger(r8)
            r11 = 2131493043(0x7f0c00b3, float:1.8609555E38)
            int r1 = r1.getInteger(r11)
            float r4 = (float) r4
            android.util.SizeF r11 = new android.util.SizeF
            r12 = 0
            r11.<init>(r12, r4)
            android.util.SizeF r12 = new android.util.SizeF
            float r7 = (float) r7
            r12.<init>(r7, r4)
            android.util.SizeF r15 = new android.util.SizeF
            float r7 = (float) r8
            r15.<init>(r7, r4)
            android.util.SizeF r7 = new android.util.SizeF
            float r1 = (float) r1
            r7.<init>(r1, r4)
            h.i[] r1 = new p5462h.C69685i[r5]
            r2.f378125a = r0
            r2.f378126b = r12
            r2.f378127c = r15
            r2.f378128d = r7
            r2.f378129e = r1
            r2.f378130f = r1
            r2.f378131g = r11
            r2.f378132h = r10
            r2.f378135k = r9
            java.lang.Object r4 = r0.mo114754e(r10, r2)
            if (r4 == r3) goto L_0x0186
            r8 = r0
            r13 = r1
            r14 = r7
            r7 = r12
            r12 = r13
            r1 = r4
            r4 = 0
        L_0x0109:
            h.i r5 = new h.i
            r5.<init>(r11, r1)
            r12[r4] = r5
            r2.f378125a = r8
            r2.f378126b = r15
            r2.f378127c = r14
            r2.f378128d = r13
            r2.f378129e = r13
            r2.f378130f = r7
            r2.f378131g = r6
            r2.f378132h = r9
            r1 = 2
            r2.f378135k = r1
            java.lang.Object r1 = r8.mo114755f(r10, r2)
            if (r1 == r3) goto L_0x0186
            r4 = r7
            r11 = r13
            r12 = r11
            r5 = r14
            r14 = r15
            r13 = r8
        L_0x012f:
            h.i r7 = new h.i
            r7.<init>(r4, r1)
            r11[r9] = r7
            r2.f378125a = r13
            r2.f378126b = r5
            r2.f378127c = r12
            r2.f378128d = r12
            r2.f378129e = r14
            r2.f378130f = r6
            r1 = 2
            r2.f378132h = r1
            r4 = 3
            r2.f378135k = r4
            java.lang.Object r4 = r13.mo114753d(r10, r2)
            if (r4 == r3) goto L_0x0186
            r1 = r4
            r9 = r12
            r11 = r9
            r4 = r14
            r8 = 2
        L_0x0153:
            h.i r7 = new h.i
            r7.<init>(r4, r1)
            r9[r8] = r7
            r2.f378125a = r11
            r2.f378126b = r11
            r2.f378127c = r5
            r2.f378128d = r6
            r2.f378129e = r6
            r1 = 3
            r2.f378132h = r1
            r4 = 4
            r2.f378135k = r4
            java.lang.Object r2 = r13.mo114754e(r10, r2)
            if (r2 == r3) goto L_0x0186
            r1 = r2
            r3 = r5
            r2 = r11
            r4 = r2
            r7 = 3
        L_0x0175:
            h.i r5 = new h.i
            r5.<init>(r3, r1)
            r4[r7] = r5
            java.util.Map r1 = p5462h.p5463a.C69505av.m100867i(r2)
            android.widget.RemoteViews r2 = new android.widget.RemoteViews
            r2.<init>(r1)
            return r2
        L_0x0186:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.searchwidget.C139130u.mo114750a(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114751b(android.os.Bundle r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.googleapp.searchwidget.C139037o
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.googleapp.searchwidget.o r0 = (com.google.android.apps.search.googleapp.searchwidget.C139037o) r0
            int r1 = r0.f378139d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f378139d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.searchwidget.o r0 = new com.google.android.apps.search.googleapp.searchwidget.o
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f378137b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f378139d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r7 = r0.f378136a
            p5462h.C69714l.m101134b(r8)
            goto L_0x005b
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            p5462h.C69714l.m101134b(r8)
            android.widget.RemoteViews r8 = new android.widget.RemoteViews
            android.content.Context r2 = r6.f378377a
            java.lang.String r2 = r2.getPackageName()
            r4 = 2131625378(0x7f0e05a2, float:1.8877962E38)
            r8.<init>(r2, r4)
            r6.m225999m()
            r6.m225996j(r8)
            r6.m225998l(r8)
            r6.m225995i(r8)
            r0.f378136a = r8
            r0.f378139d = r3
            java.lang.Object r7 = r6.m225994h(r7, r3, r0)
            if (r7 == r1) goto L_0x0065
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x005b:
            android.widget.RemoteViews r8 = (android.widget.RemoteViews) r8
            android.widget.RemoteViews r0 = new android.widget.RemoteViews
            android.widget.RemoteViews r7 = (android.widget.RemoteViews) r7
            r0.<init>(r7, r8)
            return r0
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.searchwidget.C139130u.mo114751b(android.os.Bundle, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: android.os.Bundle} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114752c(android.os.Bundle r19, int r20, p5462h.p5466c.C69577g r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            boolean r3 = r2 instanceof com.google.android.apps.search.googleapp.searchwidget.C139038p
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.apps.search.googleapp.searchwidget.p r3 = (com.google.android.apps.search.googleapp.searchwidget.C139038p) r3
            int r4 = r3.f378144e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f378144e = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.apps.search.googleapp.searchwidget.p r3 = new com.google.android.apps.search.googleapp.searchwidget.p
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f378142c
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f378144e
            r6 = 0
            r7 = 0
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 1
            if (r5 == 0) goto L_0x0053
            if (r5 == r11) goto L_0x004f
            if (r5 == r10) goto L_0x0046
            if (r5 == r9) goto L_0x0041
            if (r5 != r8) goto L_0x0039
            p5462h.C69714l.m101134b(r2)
            goto L_0x015d
        L_0x0039:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0041:
            p5462h.C69714l.m101134b(r2)
            goto L_0x013b
        L_0x0046:
            java.lang.Object r1 = r3.f378141b
            java.lang.Object r5 = r3.f378140a
            p5462h.C69714l.m101134b(r2)
            goto L_0x00f6
        L_0x004f:
            p5462h.C69714l.m101134b(r2)
            goto L_0x0065
        L_0x0053:
            p5462h.C69714l.m101134b(r2)
            boolean r2 = com.google.android.apps.search.googleapp.searchwidget.C139135z.m226021o(r19)
            if (r2 == 0) goto L_0x0066
            r3.f378144e = r11
            java.lang.Object r2 = r0.mo114751b(r1, r3)
            if (r2 != r4) goto L_0x0065
            return r4
        L_0x0065:
            return r2
        L_0x0066:
            com.google.android.apps.search.googleapp.searchwidget.z r2 = r0.f378379c
            boolean r5 = r2.mo114763l()
            if (r5 == 0) goto L_0x0148
            boolean r5 = r2.mo114764m()
            if (r5 != 0) goto L_0x0148
            android.content.Context r2 = r2.f378400b
            android.appwidget.AppWidgetManager r2 = android.appwidget.AppWidgetManager.getInstance(r2)
            r5 = r20
            android.appwidget.AppWidgetProviderInfo r2 = r2.getAppWidgetInfo(r5)
            if (r2 == 0) goto L_0x0090
            android.content.ComponentName r5 = r2.provider
            if (r5 == 0) goto L_0x0090
            android.content.ComponentName r2 = r2.provider
            android.content.ComponentName r5 = com.google.android.apps.search.googleapp.searchwidget.C139135z.f378397a
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0148
        L_0x0090:
            com.google.android.apps.search.googleapp.searchwidget.d.y r2 = r0.f378380d
            com.google.android.apps.search.googleapp.searchwidget.z r5 = r2.f378080b
            boolean r5 = r5.mo114765n()
            if (r5 != 0) goto L_0x009d
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x00e9
        L_0x009d:
            com.google.android.apps.search.googleapp.searchwidget.z r5 = r2.f378080b
            java.lang.String r5 = r5.mo114758g()
            com.google.android.libraries.search.b.b r8 = r2.f378085g
            com.google.android.libraries.search.b.i.g r12 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98236iw
            r8.mo19974a(r12)
            com.google.frameworks.client.data.android.o r8 = r2.f378081c
            com.google.frameworks.client.data.android.ae r12 = new com.google.frameworks.client.data.android.ae
            r12.<init>()
            java.lang.String r13 = "https://www.gstatic.com/android_search/search_providers/v1/search_providers.pb"
            r12.f165930a = r13
            com.google.frameworks.client.data.android.ag r13 = new com.google.frameworks.client.data.android.ag
            r13.<init>(r12)
            com.google.common.util.concurrent.cx r8 = r8.mo42484a(r13)
            com.google.apps.tiktok.tracing.contrib.b.f r8 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r8)
            com.google.android.apps.search.googleapp.searchwidget.d.v r12 = new com.google.android.apps.search.googleapp.searchwidget.d.v
            r12.<init>(r2)
            com.google.common.util.concurrent.da r13 = r2.f378082d
            com.google.apps.tiktok.tracing.contrib.b.f r8 = r8.mo51515h(r12, r13)
            com.google.android.apps.search.googleapp.searchwidget.d.w r12 = new com.google.android.apps.search.googleapp.searchwidget.d.w
            r12.<init>(r2)
            com.google.common.util.concurrent.da r13 = r2.f378082d
            java.lang.Class<java.lang.RuntimeException> r14 = java.lang.RuntimeException.class
            com.google.apps.tiktok.tracing.contrib.b.f r8 = r8.mo51513e(r14, r12, r13)
            com.google.android.apps.search.googleapp.searchwidget.d.s r12 = new com.google.android.apps.search.googleapp.searchwidget.d.s
            r12.<init>(r2, r5)
            com.google.common.util.concurrent.da r2 = r2.f378082d
            com.google.common.util.concurrent.s r5 = com.google.apps.tiktok.tracing.C47810es.m84966f(r12)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60922j.m93045h(r8, r5, r2)
        L_0x00e9:
            r3.f378140a = r0
            r3.f378141b = r1
            r3.f378144e = r10
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r3)
            if (r2 == r4) goto L_0x0147
            r5 = r0
        L_0x00f6:
            r2 = r5
            com.google.android.apps.search.googleapp.searchwidget.u r2 = (com.google.android.apps.search.googleapp.searchwidget.C139130u) r2
            com.google.android.apps.search.googleapp.searchwidget.d.ae r2 = r2.f378381e
            com.google.android.libraries.storage.protostore.ab r8 = r2.f378018d
            com.google.common.util.concurrent.cx r14 = r8.mo46042d()
            com.google.android.libraries.storage.protostore.ab r8 = r2.f378019e
            com.google.common.util.concurrent.cx r15 = r8.mo46042d()
            com.google.android.libraries.storage.protostore.ab r8 = r2.f378020f
            com.google.common.util.concurrent.cx r16 = r8.mo46042d()
            com.google.common.util.concurrent.cx[] r8 = new com.google.common.util.concurrent.C60870cx[r9]
            r8[r7] = r14
            r8[r11] = r15
            r8[r10] = r16
            com.google.common.util.concurrent.cf r7 = com.google.common.util.concurrent.C60856cj.m92893b(r8)
            com.google.android.apps.search.googleapp.searchwidget.d.ac r8 = new com.google.android.apps.search.googleapp.searchwidget.d.ac
            r17 = r1
            android.os.Bundle r17 = (android.os.Bundle) r17
            r12 = r8
            r13 = r2
            r12.<init>(r13, r14, r15, r16, r17)
            com.google.common.util.concurrent.r r1 = com.google.apps.tiktok.tracing.C47810es.m84965e(r8)
            com.google.common.util.concurrent.db r2 = r2.f378017c
            com.google.common.util.concurrent.cx r1 = r7.mo57335b(r1, r2)
            r3.f378140a = r5
            r3.f378141b = r6
            r3.f378144e = r9
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r3)
            if (r2 != r4) goto L_0x013b
            return r4
        L_0x013b:
            j$.util.Optional r2 = (p3186j$.util.Optional) r2
            java.lang.String r1 = "thirdPartyRemoteViewsOptional"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r1)
            java.lang.Object r1 = r2.orElse(r6)
            return r1
        L_0x0147:
            return r4
        L_0x0148:
            r3.f378144e = r8
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r2 >= r5) goto L_0x0155
            java.lang.Object r1 = r0.m225994h(r1, r7, r3)
            goto L_0x0159
        L_0x0155:
            java.lang.Object r1 = r0.mo114750a(r3)
        L_0x0159:
            r2 = r1
            if (r2 != r4) goto L_0x015d
            return r4
        L_0x015d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.searchwidget.C139130u.mo114752c(android.os.Bundle, int, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (r10 != r1) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114753d(boolean r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.searchwidget.C139039q
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.searchwidget.q r0 = (com.google.android.apps.search.googleapp.searchwidget.C139039q) r0
            int r1 = r0.f378150f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f378150f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.searchwidget.q r0 = new com.google.android.apps.search.googleapp.searchwidget.q
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f378148d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f378150f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r10)
            goto L_0x008e
        L_0x002a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0032:
            boolean r9 = r0.f378147c
            java.lang.Object r2 = r0.f378146b
            java.lang.Object r4 = r0.f378145a
            p5462h.C69714l.m101134b(r10)
            goto L_0x0062
        L_0x003c:
            p5462h.C69714l.m101134b(r10)
            android.widget.RemoteViews r2 = new android.widget.RemoteViews
            android.content.Context r10 = r8.f378377a
            java.lang.String r10 = r10.getPackageName()
            r5 = 2131625377(0x7f0e05a1, float:1.887796E38)
            r2.<init>(r10, r5)
            r8.m225999m()
            r8.m225996j(r2)
            r0.f378145a = r8
            r0.f378146b = r2
            r0.f378147c = r9
            r0.f378150f = r4
            java.lang.Object r10 = r8.mo114756g(r2, r0)
            if (r10 == r1) goto L_0x0097
            r4 = r8
        L_0x0062:
            com.google.android.apps.search.googleapp.searchwidget.u r4 = (com.google.android.apps.search.googleapp.searchwidget.C139130u) r4
            r10 = r2
            android.widget.RemoteViews r10 = (android.widget.RemoteViews) r10
            r4.m225997k(r10)
            r4.m225995i(r10)
            java.lang.String r5 = "setImageAlpha"
            r6 = 230(0xe6, float:3.22E-43)
            r7 = 2131431859(0x7f0b11b3, float:1.848546E38)
            r10.setInt(r7, r5, r6)
            if (r9 == 0) goto L_0x007a
            goto L_0x0096
        L_0x007a:
            com.google.android.apps.search.googleapp.searchwidget.b.b r9 = r4.f378382f
            r2 = 0
            com.google.common.util.concurrent.cx r9 = r9.mo114638a(r10, r2)
            r10 = 0
            r0.f378145a = r10
            r0.f378146b = r10
            r0.f378150f = r3
            java.lang.Object r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r10 == r1) goto L_0x0097
        L_0x008e:
            java.lang.String r9 = "customizedWidgetRenderer…/ false)\n        .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r9)
            r2 = r10
            android.widget.RemoteViews r2 = (android.widget.RemoteViews) r2
        L_0x0096:
            return r2
        L_0x0097:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.searchwidget.C139130u.mo114753d(boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008e, code lost:
        if (r11 != r1) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114754e(boolean r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.googleapp.searchwidget.C139040r
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.googleapp.searchwidget.r r0 = (com.google.android.apps.search.googleapp.searchwidget.C139040r) r0
            int r1 = r0.f378156f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f378156f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.searchwidget.r r0 = new com.google.android.apps.search.googleapp.searchwidget.r
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f378154d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f378156f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0090
        L_0x002a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0032:
            boolean r10 = r0.f378153c
            java.lang.Object r2 = r0.f378152b
            java.lang.Object r5 = r0.f378151a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0062
        L_0x003c:
            p5462h.C69714l.m101134b(r11)
            android.widget.RemoteViews r2 = new android.widget.RemoteViews
            android.content.Context r11 = r9.f378377a
            java.lang.String r11 = r11.getPackageName()
            r5 = 2131625380(0x7f0e05a4, float:1.8877966E38)
            r2.<init>(r11, r5)
            r9.m225999m()
            r9.m225996j(r2)
            r0.f378151a = r9
            r0.f378152b = r2
            r0.f378153c = r10
            r0.f378156f = r4
            java.lang.Object r11 = r9.mo114756g(r2, r0)
            if (r11 == r1) goto L_0x0099
            r5 = r9
        L_0x0062:
            com.google.android.apps.search.googleapp.searchwidget.u r5 = (com.google.android.apps.search.googleapp.searchwidget.C139130u) r5
            r11 = r2
            android.widget.RemoteViews r11 = (android.widget.RemoteViews) r11
            r5.m225997k(r11)
            r5.m225998l(r11)
            r5.m225995i(r11)
            java.lang.String r6 = "setImageAlpha"
            r7 = 230(0xe6, float:3.22E-43)
            r8 = 2131431859(0x7f0b11b3, float:1.848546E38)
            r11.setInt(r8, r6, r7)
            if (r10 == 0) goto L_0x007d
            goto L_0x0098
        L_0x007d:
            com.google.android.apps.search.googleapp.searchwidget.b.b r10 = r5.f378382f
            com.google.common.util.concurrent.cx r10 = r10.mo114638a(r11, r4)
            r11 = 0
            r0.f378151a = r11
            r0.f378152b = r11
            r0.f378156f = r3
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r10, r0)
            if (r11 == r1) goto L_0x0099
        L_0x0090:
            java.lang.String r10 = "customizedWidgetRenderer…*/ true)\n        .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r10)
            r2 = r11
            android.widget.RemoteViews r2 = (android.widget.RemoteViews) r2
        L_0x0098:
            return r2
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.searchwidget.C139130u.mo114754e(boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0086, code lost:
        if (r10 != r1) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114755f(boolean r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.searchwidget.C139041s
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.searchwidget.s r0 = (com.google.android.apps.search.googleapp.searchwidget.C139041s) r0
            int r1 = r0.f378162f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f378162f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.searchwidget.s r0 = new com.google.android.apps.search.googleapp.searchwidget.s
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f378160d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f378162f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r10)
            goto L_0x0088
        L_0x002a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0032:
            boolean r9 = r0.f378159c
            java.lang.Object r2 = r0.f378158b
            java.lang.Object r4 = r0.f378157a
            p5462h.C69714l.m101134b(r10)
            goto L_0x0062
        L_0x003c:
            p5462h.C69714l.m101134b(r10)
            android.widget.RemoteViews r2 = new android.widget.RemoteViews
            android.content.Context r10 = r8.f378377a
            java.lang.String r10 = r10.getPackageName()
            r5 = 2131625381(0x7f0e05a5, float:1.8877968E38)
            r2.<init>(r10, r5)
            r8.m225999m()
            r8.m225996j(r2)
            r0.f378157a = r8
            r0.f378158b = r2
            r0.f378159c = r9
            r0.f378162f = r4
            java.lang.Object r10 = r8.mo114756g(r2, r0)
            if (r10 == r1) goto L_0x0091
            r4 = r8
        L_0x0062:
            r10 = r2
            android.widget.RemoteViews r10 = (android.widget.RemoteViews) r10
            java.lang.String r5 = "setImageAlpha"
            r6 = 230(0xe6, float:3.22E-43)
            r7 = 2131431859(0x7f0b11b3, float:1.848546E38)
            r10.setInt(r7, r5, r6)
            if (r9 == 0) goto L_0x0072
            goto L_0x0090
        L_0x0072:
            com.google.android.apps.search.googleapp.searchwidget.u r4 = (com.google.android.apps.search.googleapp.searchwidget.C139130u) r4
            com.google.android.apps.search.googleapp.searchwidget.b.b r9 = r4.f378382f
            r2 = 0
            com.google.common.util.concurrent.cx r9 = r9.mo114638a(r10, r2)
            r10 = 0
            r0.f378157a = r10
            r0.f378158b = r10
            r0.f378162f = r3
            java.lang.Object r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r10 == r1) goto L_0x0091
        L_0x0088:
            java.lang.String r9 = "customizedWidgetRenderer…/ false)\n        .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r9)
            r2 = r10
            android.widget.RemoteViews r2 = (android.widget.RemoteViews) r2
        L_0x0090:
            return r2
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.searchwidget.C139130u.mo114755f(boolean, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.googleapp.searchwidget.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.apps.search.googleapp.searchwidget.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.apps.search.googleapp.searchwidget.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114756g(android.widget.RemoteViews r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.searchwidget.C139129t
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.searchwidget.t r0 = (com.google.android.apps.search.googleapp.searchwidget.C139129t) r0
            int r1 = r0.f378376e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f378376e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.searchwidget.t r0 = new com.google.android.apps.search.googleapp.searchwidget.t
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f378374c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f378376e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r6 = r0.f378373b
            java.lang.Object r0 = r0.f378372a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0052
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r7)
            boolean r7 = r5.f378383g
            if (r7 == 0) goto L_0x00b2
            com.google.android.libraries.storage.protostore.ab r7 = r5.f378384h
            com.google.common.util.concurrent.cx r7 = r7.mo46042d()
            java.lang.String r2 = "searchWidgetDoodleInfoDataStore.data"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            r0.f378372a = r5
            r0.f378373b = r6
            r0.f378376e = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 == r1) goto L_0x00b1
            r0 = r5
        L_0x0052:
            com.google.android.apps.search.googleapp.searchwidget.i r7 = (com.google.android.apps.search.googleapp.searchwidget.C139031i) r7
            int r1 = r7.f378100a
            r1 = r1 & 2
            if (r1 == 0) goto L_0x00ae
            com.google.protobuf.z r1 = r7.f378103d
            java.lang.String r2 = "searchWidgetDoodleInfo.doodleImage"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            byte[] r2 = r1.mo59174N()
            int r1 = r1.mo59031d()
            r3 = 0
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r2, r3, r1)
            int r2 = r7.f378100a
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0077
            java.lang.String r7 = r7.f378104e
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            if (r7 != 0) goto L_0x008a
            r7 = r0
            com.google.android.apps.search.googleapp.searchwidget.u r7 = (com.google.android.apps.search.googleapp.searchwidget.C139130u) r7
            android.content.Context r7 = r7.f378377a
            android.content.res.Resources r7 = r7.getResources()
            r2 = 2132087189(0x7f151195, float:1.9814626E38)
            java.lang.String r7 = r7.getString(r2)
        L_0x008a:
            android.widget.RemoteViews r6 = (android.widget.RemoteViews) r6
            r2 = 2131431862(0x7f0b11b6, float:1.8485465E38)
            r4 = 8
            r6.setViewVisibility(r2, r4)
            r2 = 2131431861(0x7f0b11b5, float:1.8485463E38)
            r6.setImageViewBitmap(r2, r1)
            r6.setContentDescription(r2, r7)
            r6.setViewVisibility(r2, r3)
            com.google.android.apps.search.googleapp.searchwidget.u r0 = (com.google.android.apps.search.googleapp.searchwidget.C139130u) r0
            com.google.android.apps.search.googleapp.searchwidget.b r7 = r0.f378385i
            android.content.Context r0 = r0.f378377a
            android.app.PendingIntent r7 = r7.mo114636a(r0)
            r6.setOnClickPendingIntent(r2, r7)
            goto L_0x00b2
        L_0x00ae:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x00b1:
            return r1
        L_0x00b2:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.searchwidget.C139130u.mo114756g(android.widget.RemoteViews, h.c.g):java.lang.Object");
    }
}

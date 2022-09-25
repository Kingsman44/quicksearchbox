package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.RemoteViews;
import androidx.core.p094f.C1888a;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.ad;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.p6995aq.C89258ab;
import com.google.android.apps.gsa.shared.p6995aq.C89272o;
import com.google.android.apps.gsa.shared.p6995aq.C89276s;
import com.google.android.apps.gsa.shared.p6995aq.C89277t;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.lens.view.p2051ab.C24970c;
import com.google.android.libraries.searchbox.shared.response.C41658m;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4707j.C62433bj;
import dagger.C68214a;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.bg */
/* compiled from: PG */
public final class C117239bg {

    /* renamed from: a */
    public static final C59071e f325455a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchwidget.bg");

    /* renamed from: b */
    public final C86124t f325456b;

    /* renamed from: c */
    public final C86338r f325457c;

    /* renamed from: d */
    public final Context f325458d;

    /* renamed from: e */
    C41658m f325459e;

    /* renamed from: f */
    private final C117293x f325460f;

    /* renamed from: g */
    private int f325461g;

    /* renamed from: h */
    private int f325462h;

    /* renamed from: i */
    private int f325463i;

    /* renamed from: j */
    private int f325464j;

    /* renamed from: k */
    private final C68214a f325465k;

    /* renamed from: l */
    private final int f325466l;

    /* renamed from: m */
    private final C84515a f325467m;

    /* renamed from: n */
    private final C139921f f325468n;

    /* renamed from: o */
    private final C68214a f325469o;

    /* renamed from: p */
    private final C68214a f325470p;

    /* renamed from: q */
    private final C22871g f325471q;

    public C117239bg(Context context, C117293x xVar, C86124t tVar, C86338r rVar, C68214a aVar, int i, C84515a aVar2, C139921f fVar, C68214a aVar3, C68214a aVar4, C22871g gVar) {
        this.f325460f = xVar;
        this.f325456b = tVar;
        this.f325457c = rVar;
        this.f325465k = aVar;
        this.f325466l = i;
        this.f325458d = context;
        this.f325467m = aVar2;
        this.f325468n = fVar;
        this.f325469o = aVar3;
        this.f325470p = aVar4;
        this.f325471q = gVar;
    }

    /* renamed from: g */
    private static PendingIntent m194832g(Context context, Intent intent, int i, int i2, boolean z) {
        intent.putExtra("widget_ver", i);
        if (z) {
            intent.addCategory("com.google.android.googlequicksearchbox.category.RECENTS_SEARCH_WIDGET");
        } else {
            intent.addCategory("com.google.android.googlequicksearchbox.category.SEARCH_WIDGET");
        }
        return PendingIntent.getActivity(context, i2 + i, intent, 201326592);
    }

    /* renamed from: h */
    private static Bitmap m194833h(String str) {
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    /* renamed from: i */
    private final void m194834i(Context context, boolean z) {
        if (z) {
            this.f325464j = C90686c.m148057c(context, this.f325462h, true, 1);
        } else {
            this.f325463i = C90686c.m148057c(context, this.f325461g, true, 1);
        }
    }

    /* renamed from: j */
    private static C60870cx m194835j(Context context, int i, boolean z, C84515a aVar, C41658m mVar, int i2, C68214a aVar2) {
        if (((C84486a) aVar2.mo27525b()).mo78207n()) {
            Intent intent = new Intent();
            intent.setFlags(268468224);
            C136128i l = C136129j.m221208l();
            l.mo112776k(C139779t.SEARCH);
            C136129j a = l.mo112766a();
            intent.putExtra("source", "and.gsa.widget.text");
            C136127h.m221196a(intent, a);
            return C60856cj.m92900i(PendingIntent.getActivity(context, i + 1, intent, 201326592));
        }
        Intent d = aVar.mo78221d("and.gsa.widget.text", i2, mVar);
        d.putExtra("eager_application_initializer", mVar == null);
        d.putExtra("extra-widget-id", i2);
        return C60856cj.m92900i(m194832g(context, d, i, Arrays.hashCode(new Object[]{1, Integer.valueOf(i2)}), z));
    }

    /* renamed from: k */
    private static PendingIntent m194836k(Context context, C86124t tVar, C68214a aVar, int i, boolean z, C84515a aVar2, C68214a aVar3) {
        if (ad.a(tVar, (C58833ax) aVar.mo27525b(), true)) {
            C87565h hVar = new C87565h();
            hVar.f236560f = 2;
            hVar.f236556b = e.aI;
            hVar.f236558d = 1;
            hVar.f236523a = "and.gsa.widget.mic";
            hVar.f236497A = ad.b(tVar);
            return m194832g(context, C87566i.m142321t(context, hVar), i, 3, z);
        } else if (!((C84486a) aVar3.mo27525b()).mo78208o()) {
            return m194832g(context, aVar2.mo78222e("and.gsa.widget.mic"), i, 3, z);
        } else {
            Intent intent = new Intent();
            intent.setFlags(268468224);
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
            C136129j a = l.mo112766a();
            intent.putExtra("source", "and.gsa.widget.mic");
            C136127h.m221196a(intent, a);
            return PendingIntent.getActivity(context, i + 3, intent, 201326592);
        }
    }

    /* renamed from: a */
    public final int mo103208a(Bundle bundle, int i) {
        if (C1888a.m5149c() && i != 0) {
            return i;
        }
        if (bundle != null) {
            int i2 = bundle.getInt("appWidgetMinWidth");
            int i3 = bundle.getInt("appWidgetMaxWidth");
            Resources resources = this.f325458d.getResources();
            boolean z = false;
            boolean z2 = resources.getConfiguration().orientation == 1;
            if (resources.getConfiguration().orientation == 2) {
                z = true;
            }
            int integer = resources.getInteger(R.integer.min_widget_width_small_layout_dp);
            int integer2 = resources.getInteger(R.integer.min_widget_width_medium_layout_dp);
            int integer3 = resources.getInteger(R.integer.min_widget_width_big_layout_dp);
            if ((z2 && i2 < integer) || (z && i3 < integer)) {
                return 1;
            }
            if (z2 && i2 < integer2) {
                return 3;
            }
            if (z && i3 < integer2) {
                return 3;
            }
            if ((!z2 || i2 >= integer3) && (!z || i3 >= integer3)) {
                return 1;
            }
            return 2;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r4 = com.google.android.apps.gsa.shared.p6995aq.C89280w.m145217a(r4);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo103209b(com.google.android.apps.gsa.shared.p6995aq.C89283z r4, android.os.Bundle r5, int r6) {
        /*
            r3 = this;
            int r4 = r4.f242078d
            int r0 = com.google.android.apps.gsa.shared.p6995aq.C89280w.m145217a(r4)
            r1 = 2131435642(0x7f0b207a, float:1.8493132E38)
            if (r0 != 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r2 = 2
            if (r0 == r2) goto L_0x0025
        L_0x000f:
            int r4 = com.google.android.apps.gsa.shared.p6995aq.C89280w.m145217a(r4)
            if (r4 != 0) goto L_0x0016
            goto L_0x001a
        L_0x0016:
            r0 = 3
            if (r4 != r0) goto L_0x001a
            goto L_0x0025
        L_0x001a:
            int r4 = r3.mo103208a(r5, r6)
            r5 = 1
            if (r4 != r5) goto L_0x0025
            r4 = 2131435638(0x7f0b2076, float:1.8493124E38)
            return r4
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchwidget.C117239bg.mo103209b(com.google.android.apps.gsa.shared.aq.z, android.os.Bundle, int):int");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (r4 != false) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0121  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo103210c(android.os.Bundle r16, int r17, int r18, com.google.android.apps.gsa.shared.p6995aq.C89283z r19, boolean r20, int r21) {
        /*
            r15 = this;
            r7 = r15
            r6 = r16
            r5 = r18
            boolean r8 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.m194763k(r16)
            android.content.Context r0 = r7.f325458d
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.content.Context r1 = r7.f325458d
            java.lang.String r2 = "display"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            r2 = 0
            android.view.Display r1 = r1.getDisplay(r2)
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>()
            r1.getRealSize(r3)
            int r1 = r0.orientation
            r4 = 1
            r9 = 2
            if (r1 != r9) goto L_0x0032
            r1 = 1
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            if (r1 == 0) goto L_0x003a
            int r10 = r3.x
            int r3 = r3.y
            goto L_0x003e
        L_0x003a:
            int r10 = r3.y
            int r3 = r3.x
        L_0x003e:
            int r11 = r7.f325462h
            if (r11 != r10) goto L_0x0046
            int r11 = r7.f325461g
            if (r11 == r3) goto L_0x006d
        L_0x0046:
            r7.f325462h = r10
            r7.f325461g = r3
            android.content.Context r3 = r7.f325458d
            r15.m194834i(r3, r1)
            android.content.res.Configuration r3 = new android.content.res.Configuration
            r3.<init>(r0)
            int r10 = r0.screenWidthDp
            r3.screenHeightDp = r10
            int r0 = r0.screenHeightDp
            r3.screenWidthDp = r0
            if (r4 == r1) goto L_0x0060
            r0 = 2
            goto L_0x0061
        L_0x0060:
            r0 = 1
        L_0x0061:
            r3.orientation = r0
            android.content.Context r0 = r7.f325458d
            android.content.Context r0 = r0.createConfigurationContext(r3)
            r1 = r1 ^ r4
            r15.m194834i(r0, r1)
        L_0x006d:
            r0 = -1
            r10 = r17
            if (r10 != r9) goto L_0x00c4
            com.google.android.apps.gsa.search.core.preferences.r r1 = r7.f325457c
            java.lang.String r3 = "last_gel_app_widget_id"
            int r0 = r1.getInt(r3, r0)
            if (r5 != r0) goto L_0x007e
            r0 = 1
            goto L_0x007f
        L_0x007e:
            r0 = 0
        L_0x007f:
            boolean r1 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.m194764l(r16)
            if (r1 != 0) goto L_0x0089
            if (r0 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r4 = 0
        L_0x0089:
            boolean r1 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.m194763k(r16)
            java.lang.String r9 = "vertical-layout"
            boolean r9 = r6.getBoolean(r9, r2)
            if (r1 == 0) goto L_0x0097
            int r2 = r7.f325464j
        L_0x0097:
            if (r4 == 0) goto L_0x009b
            if (r9 != 0) goto L_0x009f
        L_0x009b:
            if (r1 == 0) goto L_0x00bc
            if (r4 == 0) goto L_0x00ad
        L_0x009f:
            if (r0 != 0) goto L_0x00ad
            com.google.android.apps.gsa.search.core.preferences.r r0 = r7.f325457c
            com.google.android.apps.gsa.search.core.preferences.q r0 = r0.mo80076b()
            r0.mo80070e(r3, r5)
            r0.apply()
        L_0x00ad:
            r1 = 2131626778(0x7f0e0b1a, float:1.8880802E38)
            r0 = r15
            r3 = r16
            r4 = r19
            r5 = r18
            com.google.common.util.concurrent.cx r0 = r0.mo103213f(r1, r2, r3, r4, r5)
            goto L_0x00be
        L_0x00bc:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
        L_0x00be:
            r12 = r19
            r11 = r21
            goto L_0x0132
        L_0x00c4:
            if (r8 == 0) goto L_0x00c9
            int r1 = r7.f325463i
            r2 = r1
        L_0x00c9:
            boolean r1 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.m194763k(r16)
            if (r1 == 0) goto L_0x00da
            r0 = 2131626779(0x7f0e0b1b, float:1.8880804E38)
            r12 = r19
            r11 = r21
            r1 = 2131626779(0x7f0e0b1b, float:1.8880804E38)
            goto L_0x0127
        L_0x00da:
            boolean r1 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.m194764l(r16)
            if (r1 == 0) goto L_0x00eb
            r0 = 2131626785(0x7f0e0b21, float:1.8880816E38)
            r12 = r19
            r11 = r21
            r1 = 2131626785(0x7f0e0b21, float:1.8880816E38)
            goto L_0x0127
        L_0x00eb:
            if (r6 == 0) goto L_0x011a
            r11 = r21
            int r1 = r15.mo103208a(r6, r11)
            r3 = 3
            r12 = r19
            if (r1 != r3) goto L_0x011e
            int r1 = r12.f242077c
            int r4 = com.google.android.apps.gsa.shared.p6995aq.C89269l.m145214a(r1)
            if (r4 != 0) goto L_0x0101
            goto L_0x0107
        L_0x0101:
            if (r4 != r9) goto L_0x0107
            r1 = 2131626781(0x7f0e0b1d, float:1.8880808E38)
            goto L_0x011f
        L_0x0107:
            int r1 = com.google.android.apps.gsa.shared.p6995aq.C89269l.m145214a(r1)
            r4 = 2131626780(0x7f0e0b1c, float:1.8880806E38)
            if (r1 != 0) goto L_0x0114
        L_0x0110:
            r1 = 2131626780(0x7f0e0b1c, float:1.8880806E38)
            goto L_0x011f
        L_0x0114:
            if (r1 != r3) goto L_0x0110
            r1 = 2131626782(0x7f0e0b1e, float:1.888081E38)
            goto L_0x011f
        L_0x011a:
            r12 = r19
            r11 = r21
        L_0x011e:
            r1 = -1
        L_0x011f:
            if (r1 != r0) goto L_0x0127
            r0 = 2131626773(0x7f0e0b15, float:1.8880792E38)
            r1 = 2131626773(0x7f0e0b15, float:1.8880792E38)
        L_0x0127:
            r0 = r15
            r3 = r16
            r4 = r19
            r5 = r18
            com.google.common.util.concurrent.cx r0 = r0.mo103213f(r1, r2, r3, r4, r5)
        L_0x0132:
            r9 = r0
            if (r20 == 0) goto L_0x0136
            return r9
        L_0x0136:
            com.google.android.libraries.gsa.k.g r13 = r7.f325471q
            com.google.android.apps.gsa.staticplugins.searchwidget.bd r14 = new com.google.android.apps.gsa.staticplugins.searchwidget.bd
            r0 = r14
            r1 = r15
            r2 = r19
            r3 = r16
            r4 = r17
            r5 = r8
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "set widget properties"
            com.google.common.util.concurrent.cx r0 = r13.mo28209i(r9, r0, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchwidget.C117239bg.mo103210c(android.os.Bundle, int, int, com.google.android.apps.gsa.shared.aq.z, boolean, int):com.google.common.util.concurrent.cx");
    }

    /* renamed from: e */
    public final boolean mo103212e(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        long j = (long) bundle.getInt("appWidgetMinWidth");
        long j2 = (long) bundle.getInt("appWidgetMaxWidth");
        Resources resources = this.f325458d.getResources();
        int i = resources.getConfiguration().orientation;
        int i2 = resources.getConfiguration().orientation;
        long a = this.f325456b.mo79743a(C90110fh.f250686bp);
        if (a <= 0) {
            a = (long) resources.getDimension(R.dimen.voice_search_discovery_search_widget_minimum_width);
        }
        if (((i != 1 || j <= a) && (i2 != 2 || j2 <= a)) || !this.f325456b.mo79746e(C90110fh.f250648at)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C60870cx mo103213f(int i, int i2, Bundle bundle, C89283z zVar, int i3) {
        C89258ab abVar;
        C89849ae aeVar;
        C59687cb cbVar;
        int i4 = i3;
        RemoteViews remoteViews = new RemoteViews(this.f325458d.getPackageName(), i);
        remoteViews.setViewPadding(R.id.search_plate_padding_frame, i2, 0, i2, 0);
        int i5 = bundle.getInt("appWidgetMinWidth");
        C117293x xVar = this.f325460f;
        String packageName = this.f325458d.getPackageName();
        if (!xVar.f325590a.mo78057B()) {
            int b = C117293x.m194927b(zVar);
            List d = xVar.mo103241d();
            List c = xVar.mo103240c();
            String str = (String) C58557jl.m90130k(d, BuildConfig.FLAVOR);
            String str2 = (String) C58557jl.m90130k(c, BuildConfig.FLAVOR);
            if (TextUtils.isEmpty(str)) {
                xVar.mo103245h(remoteViews, b, BuildConfig.FLAVOR);
                abVar = C89258ab.EMPTY;
                xVar.mo103244g(i4, abVar);
                this.f325459e = this.f325467m.mo78224g();
                boolean k = C117204as.m194763k(bundle);
                PendingIntent k2 = m194836k(this.f325458d, this.f325456b, this.f325465k, this.f325466l, k, this.f325467m, this.f325469o);
                C60870cx i6 = C60856cj.m92900i(m194832g(this.f325458d, this.f325467m.mo78218a("and.gsa.widget.logo", C90208n.INTERESTS_TAB, true), this.f325466l, 2, k));
                C60870cx j = m194835j(this.f325458d, this.f325466l, k, this.f325467m, this.f325459e, i3, this.f325469o);
                return C60856cj.m92893b(i6, j).mo57334a(new C117235bc(this, i6, j, remoteViews, bundle, k2), (Executor) this.f325470p.mo27525b());
            }
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (xVar.mo103247j(i, zVar, i5, str, b)) {
                xVar.mo103245h(remoteViews, b, str);
                xVar.mo103244g(i4, C89258ab.BIG_HINT);
                aeVar = C89849ae.HINT_TEXT_RENDER_BIG_HINT;
                C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
                ajVar.mo57009f(str);
                cbVar = (C59687cb) ajVar.build();
            } else if (TextUtils.isEmpty(str2) || !xVar.mo103247j(i, zVar, i5, str2, b)) {
                xVar.mo103245h(remoteViews, b, charSequence);
                xVar.mo103244g(i4, C89258ab.HIDDEN);
                aeVar = C89849ae.HINT_TEXT_RENDER_INSUFFICIENT_SPACE;
                C59582aj ajVar2 = (C59582aj) C59687cb.f160034bf.createBuilder();
                ajVar2.mo57009f(str);
                cbVar = (C59687cb) ajVar2.build();
            } else {
                xVar.mo103245h(remoteViews, b, str2);
                xVar.mo103244g(i4, C89258ab.SMALL_HINT);
                aeVar = C89849ae.HINT_TEXT_RENDER_SMALL_HINT;
                C59582aj ajVar3 = (C59582aj) C59687cb.f160034bf.createBuilder();
                ajVar3.mo57009f(str2);
                cbVar = (C59687cb) ajVar3.build();
            }
        } else {
            int b2 = C117293x.m194927b(zVar);
            List d2 = xVar.mo103241d();
            List c2 = xVar.mo103240c();
            if (d2.isEmpty()) {
                xVar.mo103246i(packageName, remoteViews, b2, C58485gu.m89845m());
                abVar = C89258ab.EMPTY;
                xVar.mo103244g(i4, abVar);
                this.f325459e = this.f325467m.mo78224g();
                boolean k3 = C117204as.m194763k(bundle);
                PendingIntent k22 = m194836k(this.f325458d, this.f325456b, this.f325465k, this.f325466l, k3, this.f325467m, this.f325469o);
                C60870cx i62 = C60856cj.m92900i(m194832g(this.f325458d, this.f325467m.mo78218a("and.gsa.widget.logo", C90208n.INTERESTS_TAB, true), this.f325466l, 2, k3));
                C60870cx j2 = m194835j(this.f325458d, this.f325466l, k3, this.f325467m, this.f325459e, i3, this.f325469o);
                return C60856cj.m92893b(i62, j2).mo57334a(new C117235bc(this, i62, j2, remoteViews, bundle, k22), (Executor) this.f325470p.mo27525b());
            }
            C117293x xVar2 = xVar;
            int i7 = i;
            int i8 = i5;
            C89283z zVar2 = zVar;
            List e = xVar2.mo103242e(d2, i7, i8, zVar2, b2);
            List e2 = xVar2.mo103242e(c2, i7, i8, zVar2, b2);
            if (e.isEmpty() && e2.isEmpty()) {
                xVar.mo103246i(packageName, remoteViews, b2, C58485gu.m89845m());
                xVar.mo103244g(i4, C89258ab.HIDDEN);
                aeVar = C89849ae.HINT_TEXT_RENDER_INSUFFICIENT_SPACE;
                C59582aj ajVar4 = (C59582aj) C59687cb.f160034bf.createBuilder();
                ajVar4.mo57007d(d2);
                cbVar = (C59687cb) ajVar4.build();
            } else if (e.size() >= e2.size()) {
                xVar.mo103246i(packageName, remoteViews, b2, e);
                xVar.mo103244g(i4, C89258ab.BIG_HINT);
                C89849ae aeVar2 = C89849ae.HINT_TEXT_RENDER_BIG_HINT;
                C59582aj ajVar5 = (C59582aj) C59687cb.f160034bf.createBuilder();
                ajVar5.mo57007d(e);
                xVar.mo103243f(aeVar2, (C59687cb) ajVar5.build());
                this.f325459e = this.f325467m.mo78224g();
                boolean k32 = C117204as.m194763k(bundle);
                PendingIntent k222 = m194836k(this.f325458d, this.f325456b, this.f325465k, this.f325466l, k32, this.f325467m, this.f325469o);
                C60870cx i622 = C60856cj.m92900i(m194832g(this.f325458d, this.f325467m.mo78218a("and.gsa.widget.logo", C90208n.INTERESTS_TAB, true), this.f325466l, 2, k32));
                C60870cx j22 = m194835j(this.f325458d, this.f325466l, k32, this.f325467m, this.f325459e, i3, this.f325469o);
                return C60856cj.m92893b(i622, j22).mo57334a(new C117235bc(this, i622, j22, remoteViews, bundle, k222), (Executor) this.f325470p.mo27525b());
            } else {
                xVar.mo103246i(packageName, remoteViews, b2, e2);
                xVar.mo103244g(i4, C89258ab.SMALL_HINT);
                aeVar = C89849ae.HINT_TEXT_RENDER_SMALL_HINT;
                C59582aj ajVar6 = (C59582aj) C59687cb.f160034bf.createBuilder();
                ajVar6.mo57007d(e2);
                cbVar = (C59687cb) ajVar6.build();
            }
        }
        xVar.mo103243f(aeVar, cbVar);
        this.f325459e = this.f325467m.mo78224g();
        boolean k322 = C117204as.m194763k(bundle);
        PendingIntent k2222 = m194836k(this.f325458d, this.f325456b, this.f325465k, this.f325466l, k322, this.f325467m, this.f325469o);
        C60870cx i6222 = C60856cj.m92900i(m194832g(this.f325458d, this.f325467m.mo78218a("and.gsa.widget.logo", C90208n.INTERESTS_TAB, true), this.f325466l, 2, k322));
        C60870cx j222 = m194835j(this.f325458d, this.f325466l, k322, this.f325467m, this.f325459e, i3, this.f325469o);
        return C60856cj.m92893b(i6222, j222).mo57334a(new C117235bc(this, i6222, j222, remoteViews, bundle, k2222), (Executor) this.f325470p.mo27525b());
    }

    /* renamed from: d */
    public final void mo103211d(RemoteViews remoteViews, int i, C89283z zVar, C89277t tVar, int i2, boolean z) {
        RemoteViews remoteViews2 = remoteViews;
        int i3 = i;
        C89283z zVar2 = zVar;
        C89277t tVar2 = tVar;
        boolean z2 = z;
        int a = C89276s.m145216a(tVar2.f242052b);
        int i4 = 1;
        if (a == 0) {
            a = 1;
        }
        int i5 = a - 1;
        if (i5 == 1) {
            if ((tVar2.f242051a & 2) != 0) {
                remoteViews2.setImageViewBitmap(i3, m194833h(tVar2.f242053c));
            } else {
                remoteViews2.setImageViewResource(i3, R.drawable.ic_search);
            }
            remoteViews2.setContentDescription(i3, this.f325458d.getString(R.string.accessibility_google_search_button));
            new C90873ag(m194835j(this.f325458d, this.f325466l, z, this.f325467m, this.f325459e, -1, this.f325469o), this.f325471q, "update dynamic icon", new C117237be(remoteViews2, i3)).mo85223a(C117238bf.f325454a);
        } else if (i5 == 2) {
            if ((tVar2.f242051a & 2) != 0) {
                remoteViews2.setImageViewBitmap(i3, m194833h(tVar2.f242053c));
            } else {
                remoteViews2.setImageViewResource(i3, R.drawable.ic_mic_color);
            }
            remoteViews2.setContentDescription(i3, this.f325458d.getString(R.string.accessibility_voice_search_button));
            remoteViews2.setOnClickPendingIntent(i3, m194836k(this.f325458d, this.f325456b, this.f325465k, this.f325466l, z, this.f325467m, this.f325469o));
        } else if (i5 == 3) {
            if ((tVar2.f242051a & 2) != 0) {
                remoteViews2.setImageViewBitmap(i3, m194833h(tVar2.f242053c));
            } else {
                remoteViews2.setImageViewResource(i3, R.drawable.product_logo_lens_camera_color_24);
            }
            remoteViews2.setContentDescription(i3, this.f325458d.getString(R.string.accessibility_lens_button));
            Context context = this.f325458d;
            C139921f fVar = this.f325468n;
            int i6 = this.f325466l;
            C24970c cVar = new C24970c();
            cVar.f68102j = context.getPackageName();
            cVar.f68105m = C62433bj.LENS_IN_QSB_WIDGET.f168594ao;
            remoteViews2.setOnClickPendingIntent(i3, m194832g(context, fVar.mo115337a(cVar.mo30192a()), i6, 10, z2));
        } else if (i5 == 4) {
            if ((tVar2.f242051a & 2) != 0) {
                remoteViews2.setImageViewBitmap(i3, m194833h(tVar2.f242053c));
            } else {
                remoteViews2.setImageViewResource(i3, R.drawable.ic_spark_color_24dp);
            }
            remoteViews2.setContentDescription(i3, this.f325458d.getString(R.string.accessibility_feed_button));
            Context context2 = this.f325458d;
            remoteViews2.setOnClickPendingIntent(i3, m194832g(context2, C89429a.m145443a(context2, "and.gsa.widget.feed"), this.f325466l, 7, z2));
        } else if (i5 == 5) {
            int i7 = tVar2.f242051a;
            if ((i7 & 2) != 0 && (i7 & 16) != 0) {
                remoteViews2.setImageViewBitmap(i3, m194833h(tVar2.f242053c));
                if ((tVar2.f242051a & 8) != 0) {
                    remoteViews2.setContentDescription(i3, tVar2.f242055e);
                }
                try {
                    remoteViews2.setOnClickPendingIntent(i3, m194832g(this.f325458d, Intent.parseUri(tVar2.f242056f, 1), this.f325466l, i2, z2));
                } catch (URISyntaxException unused) {
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        int i8 = 0;
        remoteViews2.setViewVisibility(i3, 0);
        int i9 = zVar2.f242083i;
        int a2 = C89272o.m145215a(i9);
        if (a2 != 0 && a2 != 1) {
            Context context3 = this.f325458d;
            int a3 = C89272o.m145215a(i9);
            if (a3 != 0) {
                i4 = a3;
            }
            i8 = C117243bk.m194851b(context3, i4, zVar2.f242087m);
        } else if ((tVar2.f242051a & 4) != 0) {
            i8 = Color.parseColor(tVar2.f242054d);
        }
        remoteViews2.setInt(i3, "setColorFilter", i8);
    }
}

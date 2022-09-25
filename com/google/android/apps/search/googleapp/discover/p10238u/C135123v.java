package com.google.android.apps.search.googleapp.discover.p10238u;

import android.content.Context;
import com.google.android.apps.gsa.sidekick.main.p7214j.p7215a.C91444a;
import com.google.android.apps.p486f.p487a.p488a.C9113a;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134281m;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134283o;
import com.google.android.apps.search.googleapp.discover.p10203o.C134475d;
import com.google.android.apps.search.googleapp.discover.settings.p10218c.C134646g;
import com.google.android.gms.p10725a.p10730b.p10731a.C142672a;
import com.google.android.libraries.search.integrations.p3013a.p3014a.C38487e;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57317dr;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57330m;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.v */
/* compiled from: PG */
public final class C135123v implements C134283o {

    /* renamed from: a */
    public static final C59071e f368020a = C59071e.m91331h();

    /* renamed from: b */
    public static final C57317dr f368021b;

    /* renamed from: c */
    public final C69585o f368022c;

    /* renamed from: d */
    public final C69585o f368023d;

    /* renamed from: e */
    public final Context f368024e;

    /* renamed from: f */
    public final C57330m f368025f;

    /* renamed from: g */
    public final C134475d f368026g;

    /* renamed from: h */
    public final C134646g f368027h;

    /* renamed from: i */
    public final C60950i f368028i;

    /* renamed from: j */
    public final C91444a f368029j;

    /* renamed from: k */
    private final C71422aw f368030k;

    /* renamed from: l */
    private final C38487e f368031l;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r0.equals("armeabi") == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57317dr.ARM;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57317dr.UNKNOWN_ARCHITECTURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        f368021b = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (r0.equals("armeabi-v7a") != false) goto L_0x004b;
     */
    static {
        /*
            com.google.common.f.e r0 = com.google.common.p4526f.C59071e.m91331h()
            f368020a = r0
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
            r1 = 0
            r0 = r0[r1]
            java.lang.String r1 = "Build.SUPPORTED_ABIS[0]"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            int r1 = r0.hashCode()
            switch(r1) {
                case -1073971299: goto L_0x0059;
                case -806050265: goto L_0x004e;
                case -738963905: goto L_0x0042;
                case 117110: goto L_0x0037;
                case 3351711: goto L_0x002c;
                case 145444210: goto L_0x0023;
                case 1431565292: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0064
        L_0x0018:
            java.lang.String r1 = "arm64-v8a"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            com.google.bv.e.b.c.a.dr r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57317dr.ARM64
            goto L_0x0066
        L_0x0023:
            java.lang.String r1 = "armeabi-v7a"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            goto L_0x004b
        L_0x002c:
            java.lang.String r1 = "mips"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            com.google.bv.e.b.c.a.dr r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57317dr.MIPS
            goto L_0x0066
        L_0x0037:
            java.lang.String r1 = "x86"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            com.google.bv.e.b.c.a.dr r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57317dr.X86
            goto L_0x0066
        L_0x0042:
            java.lang.String r1 = "armeabi"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004b
            goto L_0x0064
        L_0x004b:
            com.google.bv.e.b.c.a.dr r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57317dr.ARM
            goto L_0x0066
        L_0x004e:
            java.lang.String r1 = "x86_64"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            com.google.bv.e.b.c.a.dr r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57317dr.X86_64
            goto L_0x0066
        L_0x0059:
            java.lang.String r1 = "mips64"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            com.google.bv.e.b.c.a.dr r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57317dr.MIPS64
            goto L_0x0066
        L_0x0064:
            com.google.bv.e.b.c.a.dr r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57317dr.UNKNOWN_ARCHITECTURE
        L_0x0066:
            f368021b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C135123v.<clinit>():void");
    }

    public C135123v(C71422aw awVar, C69585o oVar, C69585o oVar2, C38487e eVar, Context context, C57330m mVar, C9113a aVar, C134475d dVar, C142672a aVar2, C134646g gVar, C91444a aVar3, C60950i iVar) {
        C69664n.m101061g(awVar, "scope");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(oVar2, "backgroundContext");
        C69664n.m101061g(eVar, "clientInstanceIdGenerator");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "gGoDiscoverOverrides");
        C69664n.m101061g(dVar, "minusOneDataManager");
        C69664n.m101061g(aVar2, "advertisingIdInfoProvider");
        C69664n.m101061g(gVar, "discoverLanguageSetting");
        C69664n.m101061g(aVar3, "appLevelDataSaverSettingReader");
        C69664n.m101061g(iVar, "timeSource");
        this.f368030k = awVar;
        this.f368022c = oVar;
        this.f368023d = oVar2;
        this.f368031l = eVar;
        this.f368024e = context;
        this.f368025f = mVar;
        this.f368026g = dVar;
        this.f368027h = gVar;
        this.f368029j = aVar3;
        this.f368028i = iVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo111527a() {
        return C134281m.m217855a(this);
    }

    /* renamed from: b */
    public final Object mo112127b(C69577g gVar) {
        return C71803m.m105040a(this.f368022c, new C135116o(this, (C69577g) null), gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111529c(p5462h.p5466c.C69577g r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.discover.p10238u.C135120s
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.discover.u.s r0 = (com.google.android.apps.search.googleapp.discover.p10238u.C135120s) r0
            int r1 = r0.f368015c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368015c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.u.s r0 = new com.google.android.apps.search.googleapp.discover.u.s
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f368013a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368015c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r10)
            goto L_0x003a
        L_0x0027:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x002f:
            p5462h.C69714l.m101134b(r10)
            r0.f368015c = r3
            java.lang.Object r10 = r9.mo112128e(r0)
            if (r10 == r1) goto L_0x0147
        L_0x003a:
            com.google.bv.e.b.c.a.u r10 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r10
            com.google.android.apps.search.googleapp.discover.feedback.a.d r0 = new com.google.android.apps.search.googleapp.discover.feedback.a.d
            r0.<init>()
            java.util.List r1 = r0.f365788a
            com.google.android.apps.search.googleapp.discover.feedback.a.p r2 = com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p.NOT_SENSITIVE_OR_PII
            java.lang.String r4 = "sensitivity"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r10.f153184b
            com.google.bv.e.b.c.a.t r6 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57337t.m88327a(r6)
            if (r6 != 0) goto L_0x0059
            com.google.bv.e.b.c.a.t r6 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57337t.UNKNOWN_PLATFORM
        L_0x0059:
            java.lang.String r7 = "clientInfo.platformType"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            java.lang.String r7 = "Platform Type"
            com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q.m217879c(r7, r6, r2, r5)
            int r6 = r10.f153186d
            com.google.bv.e.b.c.a.m r6 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57330m.m88321a(r6)
            if (r6 != 0) goto L_0x006d
            com.google.bv.e.b.c.a.m r6 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57330m.UNKNOWN_APP
        L_0x006d:
            java.lang.String r7 = "clientInfo.appType"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            java.lang.String r7 = "App Type"
            com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q.m217879c(r7, r6, r2, r5)
            p5462h.p5463a.C69540x.m100811r(r1, r5)
            java.util.List r1 = r0.f365788a
            com.google.android.apps.search.googleapp.discover.feedback.a.p r2 = com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p.SENSITIVE
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r10.f153183a
            r6 = r6 & 16
            java.lang.String r7 = "NOT_SET"
            if (r6 == 0) goto L_0x0091
            java.lang.String r6 = r10.f153188f
            goto L_0x0092
        L_0x0091:
            r6 = r7
        L_0x0092:
            java.lang.String r8 = "if (clientInfo.hasLocale…nfo.locale else \"NOT_SET\""
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)
            java.lang.String r8 = "Locale"
            com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q.m217880d(r8, r6, r2, r5)
            p5462h.p5463a.C69540x.m100811r(r1, r5)
            java.util.List r1 = r0.f365788a
            com.google.android.apps.search.googleapp.discover.feedback.a.p r2 = com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p.PII
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r10.f153183a
            r6 = r6 & 64
            if (r6 == 0) goto L_0x00b3
            java.lang.String r7 = r10.f153191i
        L_0x00b3:
            java.lang.String r6 = "if (clientInfo.hasAdvert…ertisingId else \"NOT_SET\""
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r6)
            java.lang.String r6 = "Ad Id"
            com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q.m217880d(r6, r7, r2, r5)
            p5462h.p5463a.C69540x.m100811r(r1, r5)
            com.google.bv.e.b.c.a.dv r1 = r10.f153185c
            if (r1 != 0) goto L_0x00c6
            com.google.bv.e.b.c.a.dv r1 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57321dv.f153009i
        L_0x00c6:
            java.lang.String r2 = "clientInfo.platformVersion"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            java.lang.String r2 = "Platform Version"
            com.google.android.apps.search.googleapp.discover.feedback.a.i r1 = com.google.android.apps.search.googleapp.discover.p10238u.C135112k.m219118c(r1, r2)
            com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c.m217847b(r1, r0)
            com.google.bv.e.b.c.a.dv r1 = r10.f153187e
            if (r1 != 0) goto L_0x00da
            com.google.bv.e.b.c.a.dv r1 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57321dv.f153009i
        L_0x00da:
            java.lang.String r2 = "clientInfo.appVersion"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            java.lang.String r2 = "App Version"
            com.google.android.apps.search.googleapp.discover.feedback.a.i r1 = com.google.android.apps.search.googleapp.discover.p10238u.C135112k.m219118c(r1, r2)
            com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c.m217847b(r1, r0)
            com.google.protobuf.cq r10 = r10.f153189g
            java.lang.String r1 = "clientInfo.displayInfoList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r1)
            com.google.android.apps.search.googleapp.discover.feedback.a.d r1 = new com.google.android.apps.search.googleapp.discover.feedback.a.d
            r1.<init>()
            java.util.List r2 = r1.f365788a
            com.google.android.apps.search.googleapp.discover.feedback.a.p r5 = com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p.NOT_SENSITIVE_OR_PII
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r6 = "Number of screens"
            int r7 = r10.size()
            com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q.m217877a(r6, r7, r5, r4)
            p5462h.p5463a.C69540x.m100811r(r2, r4)
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L_0x0122
            r2 = 0
            java.lang.Object r2 = r10.get(r2)
            com.google.bv.e.b.c.a.ak r2 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57229ak) r2
            java.lang.String r4 = "Primary Screen"
            com.google.android.apps.search.googleapp.discover.feedback.a.i r2 = com.google.android.apps.search.googleapp.discover.p10238u.C135112k.m219117b(r4, r2)
            com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c.m217847b(r2, r1)
        L_0x0122:
            int r2 = r10.size()
            if (r2 <= r3) goto L_0x0137
            java.lang.Object r10 = r10.get(r3)
            com.google.bv.e.b.c.a.ak r10 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57229ak) r10
            java.lang.String r2 = "Secondary Screen"
            com.google.android.apps.search.googleapp.discover.feedback.a.i r10 = com.google.android.apps.search.googleapp.discover.p10238u.C135112k.m219117b(r2, r10)
            com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c.m217847b(r10, r1)
        L_0x0137:
            java.lang.String r10 = "Displays"
            com.google.android.apps.search.googleapp.discover.feedback.a.i r10 = com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c.m217846a(r10, r1)
            com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c.m217847b(r10, r0)
            java.lang.String r10 = "ClientInfo"
            com.google.android.apps.search.googleapp.discover.feedback.a.i r10 = com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c.m217846a(r10, r0)
            return r10
        L_0x0147:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C135123v.mo111529c(h.c.g):java.lang.Object");
    }

    /* renamed from: d */
    public final C71422aw mo111530d() {
        return this.f368030k;
    }

    /* renamed from: e */
    public final Object mo112128e(C69577g gVar) {
        return C71803m.m105040a(this.f368022c, new C135118q(this, (C69577g) null), gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112129f(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.googleapp.discover.p10238u.C135119r
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.googleapp.discover.u.r r0 = (com.google.android.apps.search.googleapp.discover.p10238u.C135119r) r0
            int r1 = r0.f368012c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368012c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.u.r r0 = new com.google.android.apps.search.googleapp.discover.u.r
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f368010a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368012c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.libraries.search.integrations.a.a.e r5 = r4.f368031l
            com.google.apps.tiktok.tracing.contrib.b.f r5 = r5.mo41441a()
            java.lang.String r2 = "clientInstanceIdGenerator.generate()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f368012c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            j$.util.Optional r5 = (p3186j$.util.Optional) r5
            r0 = 0
            java.lang.Object r5 = r5.orElse(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C135123v.mo112129f(h.c.g):java.lang.Object");
    }
}

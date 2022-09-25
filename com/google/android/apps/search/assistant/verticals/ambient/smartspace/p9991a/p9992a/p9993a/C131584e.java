package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131253v;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.C131579a;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.assistant.p3886c.p3889c.C50763a;
import com.google.assistant.p3886c.p3889c.C50764b;
import com.google.assistant.p3886c.p3889c.C50765c;
import com.google.assistant.p3886c.p3889c.C50767e;
import com.google.assistant.p3886c.p3889c.C50769g;
import com.google.assistant.p3886c.p3889c.C50770h;
import com.google.assistant.p3886c.p3889c.C50772j;
import com.google.assistant.p3886c.p3889c.C50774l;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Instant;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.e */
/* compiled from: PG */
public final class C131584e implements C131579a {

    /* renamed from: a */
    private final C123787p f359499a;

    /* renamed from: b */
    private final int f359500b;

    /* renamed from: c */
    private final boolean f359501c;

    /* renamed from: d */
    private final Context f359502d;

    /* renamed from: e */
    private final C131251t f359503e;

    /* renamed from: f */
    private final C71422aw f359504f;

    /* renamed from: g */
    private final C60950i f359505g;

    /* renamed from: h */
    private final boolean f359506h;

    /* renamed from: i */
    private final C130603a f359507i;

    /* renamed from: j */
    private final C58974d f359508j;

    /* renamed from: k */
    private final Instant f359509k;

    /* renamed from: l */
    private final Instant f359510l;

    public C131584e(C123787p pVar, int i, boolean z, Context context, C131251t tVar, C71422aw awVar, C60950i iVar, boolean z2, C130603a aVar) {
        Instant instant;
        C69664n.m101061g(pVar, "eventData");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(aVar, "aaFileFluentLoggerFactory");
        this.f359499a = pVar;
        this.f359500b = i;
        this.f359501c = z;
        this.f359502d = context;
        this.f359503e = tVar;
        this.f359504f = awVar;
        this.f359505g = iVar;
        this.f359506h = z2;
        this.f359507i = aVar;
        this.f359508j = aVar.mo109739a("CalendarTempParser");
        Instant ofEpochSecond = Instant.ofEpochSecond(pVar.f341954e);
        C69664n.m101060f(ofEpochSecond, "ofEpochSecond(eventData.startTimeSeconds)");
        this.f359509k = ofEpochSecond;
        if ((pVar.f341950a & 16) != 0) {
            instant = Instant.ofEpochSecond(pVar.f341955f);
            C69664n.m101060f(instant, "ofEpochSecond(eventData.endTimeSeconds)");
        } else {
            instant = Instant.EPOCH;
            C69664n.m101060f(instant, "EPOCH");
        }
        this.f359510l = instant;
    }

    /* renamed from: d */
    private final String m213983d(long j, long j2) {
        CharSequence charSequence;
        long epochMilli = Instant.ofEpochSecond(j).toEpochMilli();
        long epochMilli2 = Instant.ofEpochSecond(j2).toEpochMilli();
        CharSequence c = C131253v.m213756c(this.f359502d, epochMilli, this.f359505g.mo57444a().toEpochMilli(), this.f359506h);
        if (C131253v.m213754a(epochMilli, epochMilli2)) {
            charSequence = C131253v.m213755b(this.f359502d, epochMilli2, this.f359506h);
        } else {
            charSequence = C131253v.m213756c(this.f359502d, epochMilli2, this.f359505g.mo57444a().toEpochMilli(), this.f359506h);
        }
        String string = this.f359502d.getString(R.string.assistant_calendar_event_time_range, new Object[]{c, charSequence});
        C69664n.m101060f(string, "context.getString(R.stri…ange, startTime, endTime)");
        return string;
    }

    /* renamed from: e */
    private static final C50770h m213984e(C50723h hVar, C50723h hVar2, C50733r rVar, C50729n nVar, C50767e eVar) {
        C50763a aVar = (C50763a) C50770h.f132124g.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C50772j a = C69664n.m101061g(aVar, "builder");
        a.mo53449d(C50769g.DEFAULT);
        C50764b bVar = (C50764b) C50765c.f132101g.createBuilder();
        C69664n.m101060f(bVar, "newBuilder()");
        C50774l a2 = C69664n.m101061g(bVar, "builder");
        a2.mo53454e(hVar);
        a2.mo53453d(rVar);
        a2.mo53452c(eVar);
        a.mo53447b(a2.mo53450a());
        C50764b bVar2 = (C50764b) C50765c.f132101g.createBuilder();
        C69664n.m101060f(bVar2, "newBuilder()");
        C50774l a3 = C69664n.m101061g(bVar2, "builder");
        a3.mo53454e(hVar2);
        a3.mo53451b(nVar);
        a.mo53448c(a3.mo53450a());
        return a.mo53446a();
    }

    /* renamed from: a */
    public final C60870cx mo110197a() {
        return C71663i.m104692e(this.f359504f, (C71424ay) null, new C131583d(this, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.protobuf.bn} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110199b(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131581b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.b r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131581b) r0
            int r1 = r0.f359488e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f359488e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.b r0 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f359486c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f359488e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r1 = r0.f359485b
            java.lang.Object r0 = r0.f359484a
            p5462h.C69714l.m101134b(r6)
            goto L_0x006a
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            com.google.assistant.c.b.n r6 = com.google.assistant.p3886c.p3888b.C50729n.f132007g
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.c.b.m r6 = (com.google.assistant.p3886c.p3888b.C50728m) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r2 = r6.instance
            com.google.assistant.c.b.n r2 = (com.google.assistant.p3886c.p3888b.C50729n) r2
            int r4 = r2.f132009a
            r4 = r4 | r3
            r2.f132009a = r4
            java.lang.String r4 = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON"
            r2.f132010b = r4
            com.google.android.apps.search.assistant.verticals.ambient.q.e.t r2 = r5.f359503e
            com.google.assistant.c.cr r4 = com.google.assistant.p3886c.C50794cr.CALENDAR
            com.google.common.util.concurrent.cx r2 = r2.mo110129c(r4)
            java.lang.String r4 = "smartspaceSharedUtils.getIconByCardType(CALENDAR)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            r0.f359484a = r6
            r0.f359485b = r6
            r0.f359488e = r3
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)
            if (r0 == r1) goto L_0x009f
            r1 = r6
            r6 = r0
            r0 = r1
        L_0x006a:
            j$.util.Optional r6 = (p3186j$.util.Optional) r6
            if (r6 == 0) goto L_0x0093
            boolean r2 = r6.isPresent()
            if (r2 == 0) goto L_0x0093
            java.lang.Object r6 = r6.get()
            com.google.protobuf.z r6 = (com.google.protobuf.C63088z) r6
            r2 = r1
            com.google.protobuf.bn r2 = (com.google.protobuf.C62934bn) r2
            r2.copyOnWrite()
            com.google.assistant.c.b.m r1 = (com.google.assistant.p3886c.p3888b.C50728m) r1
            com.google.protobuf.bv r1 = r1.instance
            com.google.assistant.c.b.n r1 = (com.google.assistant.p3886c.p3888b.C50729n) r1
            com.google.assistant.c.b.n r2 = com.google.assistant.p3886c.p3888b.C50729n.f132007g
            r6.getClass()
            int r2 = r1.f132009a
            r2 = r2 | 16
            r1.f132009a = r2
            r1.f132013e = r6
        L_0x0093:
            com.google.protobuf.bn r0 = (com.google.protobuf.C62934bn) r0
            com.google.protobuf.bv r6 = r0.build()
            java.lang.String r0 = "newBuilder()\n      .appl… }\n      }\n      .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            return r6
        L_0x009f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131584e.mo110199b(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110200c(p5462h.p5466c.C69577g r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            boolean r2 = r1 instanceof com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131582c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.c r2 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131582c) r2
            int r4 = r2.f359496h
            r5 = r4 & r3
            if (r5 == 0) goto L_0x0017
            int r4 = r4 - r3
            r2.f359496h = r4
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.c r2 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.c
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f359494f
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r2.f359496h
            java.lang.String r6 = "eventData.title"
            r7 = 2
            java.lang.String r8 = "newBuilder()"
            r9 = 1
            if (r5 == 0) goto L_0x0043
            if (r5 != r9) goto L_0x003b
            java.lang.Object r4 = r2.f359493e
            java.lang.Object r5 = r2.f359492d
            java.lang.Object r10 = r2.f359491c
            java.lang.Object r11 = r2.f359490b
            java.lang.Object r2 = r2.f359489a
            p5462h.C69714l.m101134b(r1)
            goto L_0x027c
        L_0x003b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0043:
            p5462h.C69714l.m101134b(r1)
            com.google.assistant.c.b.e r1 = com.google.assistant.p3886c.p3888b.C50720e.f131985f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.c.b.b r1 = (com.google.assistant.p3886c.p3888b.C50717b) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r8)
            com.google.assistant.c.b.l r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.android.apps.search.assistant.platform.pcp.f.p r5 = r0.f359499a
            java.lang.String r5 = r5.f341953d
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r1.mo53439c(r5)
            com.google.assistant.c.b.g r5 = com.google.assistant.p3886c.p3888b.C50722g.MIDDLE
            r1.mo53440d(r5)
            com.google.assistant.c.b.d r5 = com.google.assistant.p3886c.p3888b.C50719d.FIXED_STRING
            r1.mo53438b(r5)
            com.google.assistant.c.b.e r1 = r1.mo53437a()
            com.google.assistant.c.b.e r5 = com.google.assistant.p3886c.p3888b.C50720e.f131985f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.c.b.b r5 = (com.google.assistant.p3886c.p3888b.C50717b) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r8)
            com.google.assistant.c.b.l r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            com.google.assistant.c.b.g r10 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r5.mo53440d(r10)
            com.google.assistant.c.b.d r10 = com.google.assistant.p3886c.p3888b.C50719d.EVENT_START_TIME
            r5.mo53438b(r10)
            com.google.assistant.c.b.b r10 = r5.f132006a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.assistant.c.b.e r10 = (com.google.assistant.p3886c.p3888b.C50720e) r10
            int r11 = r10.f131987a
            r11 = r11 | 8
            r10.f131987a = r11
            r10.f131991e = r9
            com.google.assistant.c.b.e r5 = r5.mo53437a()
            com.google.assistant.c.b.h r10 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.c.b.a r10 = (com.google.assistant.p3886c.p3888b.C50716a) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r8)
            com.google.assistant.c.b.j r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            android.content.Context r11 = r0.f359502d
            java.lang.Object[] r12 = new java.lang.Object[r7]
            r13 = 0
            java.lang.String r14 = "%1$s"
            r12[r13] = r14
            java.lang.String r15 = "%2$s"
            r12[r9] = r15
            r3 = 2132083448(0x7f1502f8, float:1.9807039E38)
            java.lang.String r3 = r11.getString(r3, r12)
            java.lang.String r11 = "context.getString(R.stri…nt_pre, \"%1\\$s\", \"%2\\$s\")"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r11)
            r10.mo53433b(r3)
            r10.mo53436e()
            r10.mo53435d(r1)
            r10.mo53436e()
            r10.mo53435d(r5)
            com.google.assistant.c.b.g r3 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r10.mo53434c(r3)
            com.google.assistant.c.b.h r11 = r10.mo53432a()
            com.google.assistant.c.b.e r3 = com.google.assistant.p3886c.p3888b.C50720e.f131985f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.c.b.b r3 = (com.google.assistant.p3886c.p3888b.C50717b) r3
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r8)
            com.google.assistant.c.b.l r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")
            com.google.android.apps.search.assistant.platform.pcp.f.p r5 = r0.f359499a
            java.lang.String r5 = r5.f341953d
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r3.mo53439c(r5)
            com.google.assistant.c.b.g r5 = com.google.assistant.p3886c.p3888b.C50722g.MIDDLE
            r3.mo53440d(r5)
            com.google.assistant.c.b.d r5 = com.google.assistant.p3886c.p3888b.C50719d.FIXED_STRING
            r3.mo53438b(r5)
            com.google.assistant.c.b.b r5 = r3.f132006a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.assistant.c.b.e r5 = (com.google.assistant.p3886c.p3888b.C50720e) r5
            int r10 = r5.f131987a
            r10 = r10 | 8
            r5.f131987a = r10
            r5.f131991e = r13
            com.google.assistant.c.b.e r3 = r3.mo53437a()
            com.google.assistant.c.b.h r5 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.c.b.a r5 = (com.google.assistant.p3886c.p3888b.C50716a) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r8)
            com.google.assistant.c.b.j r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            android.content.Context r10 = r0.f359502d
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r13] = r14
            r13 = 2132083447(0x7f1502f7, float:1.9807037E38)
            java.lang.String r10 = r10.getString(r13, r12)
            java.lang.String r12 = "context.getString(R.stri…ar_event_during, \"%1\\$s\")"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r12)
            r5.mo53433b(r10)
            r5.mo53436e()
            r5.mo53435d(r3)
            com.google.assistant.c.b.g r3 = com.google.assistant.p3886c.p3888b.C50722g.MIDDLE
            r5.mo53434c(r3)
            com.google.assistant.c.b.h r10 = r5.mo53432a()
            com.google.android.apps.search.assistant.platform.pcp.f.p r3 = r0.f359499a
            long r12 = r3.f341954e
            int r5 = r3.f341950a
            r16 = r5 & 16
            if (r16 == 0) goto L_0x0155
            r17 = r10
            long r9 = r3.f341955f
            goto L_0x0158
        L_0x0155:
            r17 = r10
            r9 = r12
        L_0x0158:
            r5 = r5 & 32
            if (r5 == 0) goto L_0x0165
            java.lang.String r3 = r3.f341956g
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            java.lang.String r5 = "of(whereField)"
            goto L_0x016b
        L_0x0165:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            java.lang.String r5 = "empty()"
        L_0x016b:
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)
            boolean r5 = r3.isPresent()
            if (r5 == 0) goto L_0x0191
            java.lang.String r5 = r0.m213983d(r12, r9)
            java.lang.Object r3 = r3.get()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r5 = " · "
            r9.append(r5)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            goto L_0x0199
        L_0x0191:
            java.lang.String r3 = r0.m213983d(r12, r9)
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L_0x0199:
            com.google.assistant.c.b.h r5 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.c.b.a r5 = (com.google.assistant.p3886c.p3888b.C50716a) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r8)
            com.google.assistant.c.b.j r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            r5.mo53433b(r3)
            com.google.assistant.c.b.g r3 = com.google.assistant.p3886c.p3888b.C50722g.MIDDLE
            r5.mo53434c(r3)
            com.google.assistant.c.b.h r5 = r5.mo53432a()
            com.google.android.apps.search.assistant.platform.pcp.f.p r3 = r0.f359499a
            com.google.assistant.c.b.h r9 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.c.b.a r9 = (com.google.assistant.p3886c.p3888b.C50716a) r9
            java.lang.String r3 = r3.f341956g
            java.lang.String r10 = "whereField"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r10)
            int r3 = r3.length()
            if (r3 != 0) goto L_0x01de
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.assistant.c.b.h r3 = (com.google.assistant.p3886c.p3888b.C50723h) r3
            int r10 = r3.f132001a
            r12 = 1
            r10 = r10 | r12
            r3.f132001a = r10
            r3.f132002b = r14
            r9.mo53428a(r1)
            goto L_0x0246
        L_0x01de:
            r12 = 1
            android.content.Context r3 = r0.f359502d
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r13 = 0
            r10[r13] = r14
            r10[r12] = r15
            r13 = 2132083449(0x7f1502f9, float:1.980704E38)
            java.lang.String r3 = r3.getString(r13, r10)
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.c.b.h r10 = (com.google.assistant.p3886c.p3888b.C50723h) r10
            r3.getClass()
            int r13 = r10.f132001a
            r13 = r13 | r12
            r10.f132001a = r13
            r10.f132002b = r3
            android.content.Context r3 = r0.f359502d
            j$.time.Instant r10 = r0.f359509k
            long r19 = r10.toEpochMilli()
            com.google.common.v.i r10 = r0.f359505g
            j$.time.Instant r10 = r10.mo57444a()
            long r21 = r10.toEpochMilli()
            boolean r10 = r0.f359506h
            r18 = r3
            r23 = r10
            java.lang.CharSequence r3 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131253v.m213756c(r18, r19, r21, r23)
            com.google.assistant.c.b.e r10 = com.google.assistant.p3886c.p3888b.C50720e.f131985f
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.c.b.b r10 = (com.google.assistant.p3886c.p3888b.C50717b) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r8)
            com.google.assistant.c.b.l r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            java.lang.String r3 = r3.toString()
            r10.mo53439c(r3)
            com.google.assistant.c.b.g r3 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r10.mo53440d(r3)
            com.google.assistant.c.b.d r3 = com.google.assistant.p3886c.p3888b.C50719d.FIXED_STRING
            r10.mo53438b(r3)
            com.google.assistant.c.b.e r3 = r10.mo53437a()
            r9.mo53428a(r1)
            r9.mo53428a(r3)
        L_0x0246:
            com.google.assistant.c.b.g r1 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.assistant.c.b.h r3 = (com.google.assistant.p3886c.p3888b.C50723h) r3
            int r1 = r1.f131998e
            r3.f132003c = r1
            int r1 = r3.f132001a
            r1 = r1 | r7
            r3.f132001a = r1
            com.google.protobuf.bv r1 = r9.build()
            java.lang.String r3 = "newBuilder()\n      .appl…ED\n      }\n      .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
            com.google.assistant.c.b.h r1 = (com.google.assistant.p3886c.p3888b.C50723h) r1
            r2.f359489a = r0
            r2.f359490b = r11
            r3 = r17
            r2.f359491c = r3
            r2.f359492d = r5
            r2.f359493e = r1
            r9 = 1
            r2.f359496h = r9
            java.lang.Object r2 = r0.mo110199b(r2)
            if (r2 == r4) goto L_0x05ee
            r4 = r1
            r1 = r2
            r10 = r3
            r2 = r0
        L_0x027c:
            com.google.assistant.c.b.n r1 = (com.google.assistant.p3886c.p3888b.C50729n) r1
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.e r2 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131584e) r2
            com.google.android.apps.search.assistant.platform.pcp.f.p r3 = r2.f359499a
            boolean r12 = r3.f341962m
            r12 = r12 ^ r9
            boolean r9 = r2.f359501c
            android.content.Intent r13 = new android.content.Intent
            java.lang.String r14 = "android.intent.action.VIEW"
            r13.<init>(r14)
            android.net.Uri r14 = android.provider.CalendarContract.Events.CONTENT_URI
            r15 = r8
            long r7 = r3.f341952c
            android.net.Uri r3 = android.content.ContentUris.withAppendedId(r14, r7)
            java.lang.String r7 = "withAppendedId(CalendarC…T_URI, eventData.eventId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r7)
            r13.setData(r3)
            j$.time.Instant r3 = r2.f359509k
            long r7 = r3.toEpochMilli()
            java.lang.String r3 = "beginTime"
            r13.putExtra(r3, r7)
            j$.time.Instant r3 = r2.f359510l
            j$.time.Instant r7 = p3186j$.time.Instant.EPOCH
            boolean r3 = r3.isAfter(r7)
            if (r3 == 0) goto L_0x02bf
            j$.time.Instant r3 = r2.f359510l
            long r7 = r3.toEpochMilli()
            java.lang.String r3 = "endTime"
            r13.putExtra(r3, r7)
        L_0x02bf:
            r3 = 268435457(0x10000001, float:2.5243552E-29)
            r13.addFlags(r3)
            com.google.assistant.c.cr r3 = com.google.assistant.p3886c.C50794cr.CALENDAR
            com.google.assistant.c.b.p r7 = com.google.assistant.p3886c.p3888b.C50731p.START_ACTIVITY
            r8 = 0
            android.content.Intent r3 = com.google.android.apps.gsa.h.c.a.a(r13, r8, r3, r7)
            if (r12 == 0) goto L_0x02d7
            java.lang.String r7 = "com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_DATA_FROM_THIRD_PARTY_APP"
            r8 = 1
            r3.putExtra(r7, r8)
            goto L_0x02d8
        L_0x02d7:
            r8 = 1
        L_0x02d8:
            if (r9 == 0) goto L_0x02df
            java.lang.String r7 = "com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_WORK_PROFILE"
            r3.putExtra(r7, r8)
        L_0x02df:
            com.google.assistant.c.b.r r7 = com.google.assistant.p3886c.p3888b.C50733r.f132021d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.c.b.q r7 = (com.google.assistant.p3886c.p3888b.C50732q) r7
            r9 = r15
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r9)
            com.google.assistant.c.b.t r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            com.google.assistant.c.b.p r13 = com.google.assistant.p3886c.p3888b.C50731p.START_ACTIVITY
            r7.mo53443b(r13)
            java.lang.String r3 = r3.toUri(r8)
            java.lang.String r8 = "wrappedIntent.toUri(Intent.URI_INTENT_SCHEME)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r8)
            r7.mo53444c(r3)
            com.google.assistant.c.b.r r3 = r7.mo53442a()
            int r7 = r2.f359500b
            com.google.android.apps.d.a.a.b.a.a r8 = com.google.android.apps.p471d.p472a.p473a.p475b.p476a.C9027a.CALENDAR
            com.google.assistant.c.c.e r7 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131593n.m214002a(r7, r8)
            com.google.common.f.a.d r8 = r2.f359508j
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.a.a r8 = (com.google.common.p4526f.p4527a.C58970a) r8
            java.lang.String r13 = "#getParsedCard: calendar card, cardId: %s"
            int r14 = r2.f359500b
            r8.mo56387q(r13, r14)
            com.google.assistant.c.do r8 = com.google.assistant.p3886c.C50818do.f132293H
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.c.cn r8 = (com.google.assistant.p3886c.C50790cn) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            com.google.assistant.c.dr r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            int r13 = r2.f359500b
            com.google.assistant.c.cn r14 = r8.f132334a
            r14.copyOnWrite()
            com.google.protobuf.bv r14 = r14.instance
            com.google.assistant.c.do r14 = (com.google.assistant.p3886c.C50818do) r14
            int r15 = r14.f132304a
            r15 = r15 | 4
            r14.f132304a = r15
            r14.f132307d = r13
            r8.mo53477g()
            com.google.assistant.c.cp r13 = com.google.assistant.p3886c.C50792cp.PRIMARY
            r8.mo53472b(r13)
            com.google.assistant.c.cr r13 = com.google.assistant.p3886c.C50794cr.CALENDAR
            r8.mo53473c(r13)
            com.google.common.v.i r13 = r2.f359505g
            j$.time.Instant r13 = r13.mo57444a()
            long r13 = r13.toEpochMilli()
            com.google.assistant.c.cn r15 = r8.f132334a
            r15.copyOnWrite()
            com.google.protobuf.bv r15 = r15.instance
            com.google.assistant.c.do r15 = (com.google.assistant.p3886c.C50818do) r15
            int r0 = r15.f132304a
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r15.f132304a = r0
            r15.f132317n = r13
            j$.time.Instant r0 = r2.f359509k
            long r13 = r0.toEpochMilli()
            com.google.assistant.c.cn r0 = r8.f132334a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            int r15 = r0.f132304a
            r15 = r15 | 8192(0x2000, float:1.14794E-41)
            r0.f132304a = r15
            r0.f132318o = r13
            j$.time.Instant r0 = r2.f359509k
            j$.time.Instant r13 = r2.f359510l
            j$.time.Duration r0 = p3186j$.time.Duration.between(r0, r13)
            long r13 = r0.toMillis()
            com.google.assistant.c.cn r0 = r8.f132334a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            int r15 = r0.f132304a
            r15 = r15 | 16384(0x4000, float:2.2959E-41)
            r0.f132304a = r15
            r0.f132319p = r13
            com.google.assistant.c.ct r0 = com.google.assistant.p3886c.C50796ct.f132223c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.c.cs r0 = (com.google.assistant.p3886c.C50795cs) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)
            com.google.assistant.c.dt r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            j$.time.Instant r13 = r2.f359509k
            long r14 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d.f358773i
            j$.time.Instant r13 = r13.plusSeconds(r14)
            long r13 = r13.toEpochMilli()
            com.google.assistant.c.cs r15 = r0.f132335a
            r15.copyOnWrite()
            com.google.protobuf.bv r15 = r15.instance
            com.google.assistant.c.ct r15 = (com.google.assistant.p3886c.C50796ct) r15
            r17 = r6
            int r6 = r15.f132225a
            r16 = 1
            r6 = r6 | 1
            r15.f132225a = r6
            r15.f132226b = r13
            com.google.assistant.c.ct r0 = r0.mo53478a()
            r8.mo53475e(r0)
            com.google.assistant.c.dn r0 = com.google.assistant.p3886c.C50817dn.f132287e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.c.dk r0 = (com.google.assistant.p3886c.C50814dk) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)
            java.lang.String r6 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)
            com.google.assistant.c.dm r13 = com.google.assistant.p3886c.C50816dm.f132281e
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.c.dl r13 = (com.google.assistant.p3886c.C50815dl) r13
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r9)
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r6)
            j$.time.Instant r14 = r2.f359509k
            r18 = r3
            r15 = r4
            long r3 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d.f358772h
            j$.time.Instant r3 = r14.minusSeconds(r3)
            long r3 = r3.toEpochMilli()
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.c.dm r14 = (com.google.assistant.p3886c.C50816dm) r14
            r19 = r6
            int r6 = r14.f132283a
            r16 = 1
            r6 = r6 | 1
            r14.f132283a = r6
            r14.f132284b = r3
            j$.time.Instant r3 = r2.f359509k
            r4 = r15
            long r14 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d.f358773i
            j$.time.Instant r3 = r3.plusSeconds(r14)
            long r14 = r3.toEpochMilli()
            r13.copyOnWrite()
            com.google.protobuf.bv r3 = r13.instance
            com.google.assistant.c.dm r3 = (com.google.assistant.p3886c.C50816dm) r3
            int r6 = r3.f132283a
            r20 = 2
            r6 = r6 | 2
            r3.f132283a = r6
            r3.f132285c = r14
            com.google.protobuf.a.b r6 = new com.google.protobuf.a.b
            com.google.protobuf.ck r3 = r3.f132286d
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            java.lang.String r14 = "_builder.getCheckpointMillisList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r14)
            r6.<init>(r3)
            j$.time.Instant r3 = r2.f359509k
            long r14 = r3.toEpochMilli()
            r13.mo53468a(r14)
            com.google.protobuf.bv r3 = r13.build()
            java.lang.String r6 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r6)
            com.google.assistant.c.dm r3 = (com.google.assistant.p3886c.C50816dm) r3
            java.lang.String r13 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r13)
            r0.copyOnWrite()
            com.google.protobuf.bv r14 = r0.instance
            com.google.assistant.c.dn r14 = (com.google.assistant.p3886c.C50817dn) r14
            r3.getClass()
            r14.f132292d = r3
            int r3 = r14.f132289a
            r3 = r3 | 8
            r14.f132289a = r3
            com.google.protobuf.bv r0 = r0.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            com.google.assistant.c.dn r0 = (com.google.assistant.p3886c.C50817dn) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r13)
            com.google.assistant.c.cn r3 = r8.f132334a
            r3.copyOnWrite()
            com.google.protobuf.bv r3 = r3.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            r0.getClass()
            r3.f132295A = r0
            int r0 = r3.f132304a
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 | r14
            r3.f132304a = r0
            r8.mo53476f()
            com.google.assistant.c.cn r0 = r8.f132334a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            int r3 = r0.f132304a
            r14 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 | r14
            r0.f132304a = r3
            r0.f132323t = r12
            boolean r0 = r2.f359501c
            com.google.assistant.c.cn r3 = r8.f132334a
            r3.copyOnWrite()
            com.google.protobuf.bv r3 = r3.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            int r12 = r3.f132304a
            r14 = 131072(0x20000, float:1.83671E-40)
            r12 = r12 | r14
            r3.f132304a = r12
            r3.f132322s = r0
            com.google.assistant.c.cn r0 = r8.f132334a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            int r3 = r0.f132304a
            r12 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r12
            r0.f132304a = r3
            r3 = 1
            r0.f132324u = r3
            java.lang.String r0 = "loggingInfo"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)
            com.google.assistant.c.b.h r10 = (com.google.assistant.p3886c.p3888b.C50723h) r10
            com.google.assistant.c.b.h r5 = (com.google.assistant.p3886c.p3888b.C50723h) r5
            r0 = r18
            com.google.assistant.c.c.h r3 = m213984e(r10, r5, r0, r1, r7)
            r8.mo53474d(r3)
            com.google.assistant.c.b.h r11 = (com.google.assistant.p3886c.p3888b.C50723h) r11
            com.google.assistant.c.c.h r3 = m213984e(r11, r5, r0, r1, r7)
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r13)
            com.google.assistant.c.cn r10 = r8.f132334a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.assistant.c.do r10 = (com.google.assistant.p3886c.C50818do) r10
            r3.getClass()
            r10.f132298D = r3
            int r3 = r10.f132304a
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r3 | r11
            r10.f132304a = r3
            com.google.assistant.c.b.h r4 = (com.google.assistant.p3886c.p3888b.C50723h) r4
            com.google.assistant.c.c.h r0 = m213984e(r4, r5, r0, r1, r7)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r13)
            com.google.assistant.c.cn r1 = r8.f132334a
            r1.copyOnWrite()
            com.google.protobuf.bv r1 = r1.instance
            com.google.assistant.c.do r1 = (com.google.assistant.p3886c.C50818do) r1
            r0.getClass()
            r1.f132300F = r0
            int r0 = r1.f132304a
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r3
            r1.f132304a = r0
            com.google.android.apps.search.assistant.platform.pcp.f.p r0 = r2.f359499a
            java.lang.String r0 = r0.f341953d
            r1 = r17
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            int r0 = r0.length()
            if (r0 == 0) goto L_0x05e0
            com.google.assistant.c.dh r0 = com.google.assistant.p3886c.C50811dh.f132269h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.c.da r0 = (com.google.assistant.p3886c.C50804da) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)
            r1 = r19
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.c.dh r1 = (com.google.assistant.p3886c.C50811dh) r1
            int r3 = r1.f132271a
            r4 = 1
            r3 = r3 | r4
            r1.f132271a = r3
            java.lang.String r3 = "com.google.android.calendar"
            r1.f132272b = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.c.dh r1 = (com.google.assistant.p3886c.C50811dh) r1
            int r3 = r1.f132271a
            r4 = 2
            r3 = r3 | r4
            r1.f132271a = r3
            java.lang.String r3 = "REMINDERS"
            r1.f132273c = r3
            com.google.assistant.c.de r1 = com.google.assistant.p3886c.C50808de.NOTIFICATION_TITLE
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r13)
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.c.dh r3 = (com.google.assistant.p3886c.C50811dh) r3
            int r1 = r1.f132262d
            r3.f132274d = r1
            int r1 = r3.f132271a
            r1 = r1 | 4
            r3.f132271a = r1
            com.google.android.apps.search.assistant.platform.pcp.f.p r1 = r2.f359499a
            java.lang.String r1 = r1.f341953d
            java.lang.String r1 = java.util.regex.Pattern.quote(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[‪‫‬‎‏]*"
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.c.dh r2 = (com.google.assistant.p3886c.C50811dh) r2
            int r3 = r2.f132271a
            r3 = r3 | 8
            r2.f132271a = r3
            r2.f132275e = r1
            com.google.assistant.c.dg r1 = com.google.assistant.p3886c.C50810dg.MATCH_ENTIRE
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r13)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.c.dh r2 = (com.google.assistant.p3886c.C50811dh) r2
            int r1 = r1.f132268d
            r2.f132276f = r1
            int r1 = r2.f132271a
            r1 = r1 | 16
            r2.f132271a = r1
            com.google.assistant.c.dc r1 = com.google.assistant.p3886c.C50806dc.HIDE
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r13)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.c.dh r2 = (com.google.assistant.p3886c.C50811dh) r2
            int r1 = r1.f132256d
            r2.f132277g = r1
            int r1 = r2.f132271a
            r1 = r1 | 32
            r2.f132271a = r1
            com.google.protobuf.bv r0 = r0.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            com.google.assistant.c.dh r0 = (com.google.assistant.p3886c.C50811dh) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r13)
            com.google.assistant.c.cn r1 = r8.f132334a
            r1.copyOnWrite()
            com.google.protobuf.bv r1 = r1.instance
            com.google.assistant.c.do r1 = (com.google.assistant.p3886c.C50818do) r1
            r0.getClass()
            r1.f132296B = r0
            int r0 = r1.f132304a
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 | r2
            r1.f132304a = r0
        L_0x05e0:
            com.google.assistant.c.do r0 = r8.mo53471a()
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            java.lang.String r1 = "of(\n      smartspaceCard…}\n        }\n      }\n    )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            return r0
        L_0x05ee:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131584e.mo110200c(h.c.g):java.lang.Object");
    }
}

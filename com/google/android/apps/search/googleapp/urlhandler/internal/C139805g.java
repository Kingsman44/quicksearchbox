package com.google.android.apps.search.googleapp.urlhandler.internal;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.gsa.h.e.a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.apps.search.googleapp.p10335j.C136370a;
import com.google.android.apps.search.googleapp.urlhandler.C139780a;
import com.google.android.apps.search.googleapp.urlhandler.C139796g;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.C139787a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.internal.g */
/* compiled from: PG */
public final class C139805g {

    /* renamed from: a */
    public static final C59071e f379974a = C59071e.m91332i("com.google.android.apps.search.googleapp.urlhandler.internal.g");

    /* renamed from: b */
    public final C139796g f379975b;

    /* renamed from: c */
    public final Fragment f379976c;

    /* renamed from: d */
    public final C139809j f379977d;

    /* renamed from: e */
    public final C62921ba f379978e;

    /* renamed from: f */
    public final C136370a f379979f;

    /* renamed from: g */
    public final boolean f379980g;

    /* renamed from: h */
    public final boolean f379981h;

    /* renamed from: i */
    public final a f379982i;

    /* renamed from: j */
    public final C46440f f379983j = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
            if (th instanceof C139804f) {
                if (th.getCause() instanceof CancellationException) {
                    ((C59052c) ((C59052c) ((C59052c) C139805g.f379974a.mo56224b()).mo56382g(th)).mo56372aa(41427)).mo56386p("Not opening URL because the launch was cancelled.");
                    C139787a aVar = C139805g.this.f379977d.f380005b;
                    C139789b b = C139809j.m227320b((C139823j) parcelableProto.mo58938a(C139823j.f380066m, C139805g.this.f379978e));
                    C69664n.m101061g(b, "loggingData");
                    C37215b bVar = aVar.f379927a;
                    C37252a c = C37182a.f97827bF.mo40805c(C62722b.UNAVAILABLE);
                    C139787a.m227254h(c, b);
                    bVar.mo19974a(c);
                    C139805g.this.f379975b.mo113492b();
                }
                Throwable cause = th.getCause();
                if ((cause instanceof ExecutionException ? cause.getCause() : null) instanceof C139780a) {
                    ((C59052c) ((C59052c) ((C59052c) C139805g.f379974a.mo56226d()).mo56382g(th)).mo56372aa(41426)).mo56386p("Not opening URL because of an expected error.");
                } else {
                    C95883aa.m158984e(C139805g.f379974a.mo56225c(), "Failed to get the URL", 41425, C38505d.f101864b, 153658384, th);
                }
            } else if (th instanceof C139801c) {
                C95883aa.m158984e(C139805g.f379974a.mo56225c(), "Not launching blocked URI.", 41424, C38505d.f101864b, 200272883, th);
            } else {
                C95883aa.m158984e(C139805g.f379974a.mo56225c(), "Failed to resolve intent for URL", 41423, C38505d.f101864b, 149486418, th);
            }
            Snackbar.m79660p(C139805g.this.mo115281a(), R.string.googleapp_unable_to_open_link, -1).mo48343h();
            C139787a aVar2 = C139805g.this.f379977d.f380005b;
            C139789b b2 = C139809j.m227320b((C139823j) parcelableProto.mo58938a(C139823j.f380066m, C139805g.this.f379978e));
            C69664n.m101061g(b2, "loggingData");
            C37215b bVar2 = aVar2.f379927a;
            C37252a c2 = C37182a.f97827bF.mo40805c(C62722b.UNAVAILABLE);
            C139787a.m227254h(c2, b2);
            bVar2.mo19974a(c2);
            C139805g.this.f379975b.mo113492b();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
            mo115282d((UrlIntentResult) obj2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0354  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0136  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x013f  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0264  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0295  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo115282d(com.google.android.apps.search.googleapp.urlhandler.internal.UrlIntentResult r17) {
            /*
                r16 = this;
                r1 = r16
                com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto r0 = r17.mo115254c()
                com.google.android.apps.search.googleapp.urlhandler.internal.l r2 = com.google.android.apps.search.googleapp.urlhandler.internal.C139811l.f380009g
                com.google.android.apps.search.googleapp.urlhandler.internal.g r3 = com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.this
                com.google.protobuf.ba r3 = r3.f379978e
                com.google.protobuf.MessageLite r0 = r0.mo58938a(r2, r3)
                com.google.android.apps.search.googleapp.urlhandler.internal.l r0 = (com.google.android.apps.search.googleapp.urlhandler.internal.C139811l) r0
                boolean r2 = r17.mo115260h()
                r3 = 0
                if (r2 == 0) goto L_0x001e
                android.content.Intent r2 = r17.mo115252a()
                goto L_0x001f
            L_0x001e:
                r2 = r3
            L_0x001f:
                com.google.android.apps.search.googleapp.urlhandler.internal.g r4 = com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.this
                com.google.android.apps.search.googleapp.urlhandler.internal.j r4 = r4.f379977d
                com.google.android.apps.search.googleapp.urlhandler.q r5 = com.google.android.apps.search.googleapp.urlhandler.C139851q.UNKNOWN
                int r5 = r17.mo115265l()
                int r6 = r5 + -1
                if (r5 == 0) goto L_0x03b0
                r5 = 4
                r7 = 2
                r8 = 1
                if (r6 == 0) goto L_0x00f3
                java.lang.String r9 = "loggingData"
                if (r6 == r8) goto L_0x0087
                if (r6 == r7) goto L_0x006b
                r10 = 3
                if (r6 == r10) goto L_0x003f
                if (r6 == r5) goto L_0x003f
                goto L_0x0103
            L_0x003f:
                com.google.android.apps.gsa.shared.logger.b.i r6 = r4.f380004a
                com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_NOT_LAUNCHED
                com.google.android.apps.gsa.shared.logger.b.g r10 = com.google.android.apps.search.googleapp.urlhandler.internal.C139809j.m227319a(r10, r0)
                r6.mo74236a(r10)
                com.google.android.apps.search.googleapp.urlhandler.b.a r6 = r4.f380005b
                com.google.android.apps.search.googleapp.urlhandler.j r10 = r0.f380012b
                if (r10 != 0) goto L_0x0052
                com.google.android.apps.search.googleapp.urlhandler.j r10 = com.google.android.apps.search.googleapp.urlhandler.C139823j.f380066m
            L_0x0052:
                com.google.android.apps.search.googleapp.urlhandler.b.a.b r10 = com.google.android.apps.search.googleapp.urlhandler.internal.C139809j.m227320b(r10)
                p5462h.p5473f.p5475b.C69664n.m101061g(r10, r9)
                com.google.android.libraries.search.b.b r6 = r6.f379927a
                com.google.android.libraries.search.b.i.f r9 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97977dx
                com.google.net.a.a.b r11 = com.google.net.p4726a.p4727a.C62722b.OK
                com.google.android.libraries.search.b.i.a r9 = r9.mo40805c(r11)
                com.google.android.apps.search.googleapp.urlhandler.p10529b.C139787a.m227254h(r9, r10)
                r6.mo19974a(r9)
                goto L_0x0103
            L_0x006b:
                com.google.android.apps.gsa.shared.logger.b.i r6 = r4.f380004a
                com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_NOT_LAUNCHED
                com.google.android.apps.gsa.shared.logger.b.g r9 = com.google.android.apps.search.googleapp.urlhandler.internal.C139809j.m227319a(r9, r0)
                r6.mo74236a(r9)
                com.google.android.apps.search.googleapp.urlhandler.b.a r6 = r4.f380005b
                com.google.android.apps.search.googleapp.urlhandler.j r9 = r0.f380012b
                if (r9 != 0) goto L_0x007e
                com.google.android.apps.search.googleapp.urlhandler.j r9 = com.google.android.apps.search.googleapp.urlhandler.C139823j.f380066m
            L_0x007e:
                com.google.android.apps.search.googleapp.urlhandler.b.a.b r9 = com.google.android.apps.search.googleapp.urlhandler.internal.C139809j.m227320b(r9)
                r6.mo115238a(r9)
                goto L_0x0103
            L_0x0087:
                boolean r6 = r4.f380008e
                if (r6 == 0) goto L_0x0094
                com.google.android.apps.search.googleapp.urlhandler.b.a r6 = r4.f380005b
                com.google.android.libraries.search.b.b r6 = r6.f379927a
                com.google.android.libraries.search.b.i.g r10 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98209iQ
                r6.mo19974a(r10)
            L_0x0094:
                com.google.android.apps.gsa.shared.logger.b.i r6 = r4.f380004a
                com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_INTENT_STARTED
                r6.mo83702b(r10)
                java.lang.Integer r6 = r17.mo115269n()
                if (r6 != 0) goto L_0x00cf
                boolean r6 = r4.f380008e
                if (r6 == 0) goto L_0x00c4
                com.google.android.apps.search.googleapp.urlhandler.b.a r6 = r4.f380005b
                com.google.android.apps.search.googleapp.urlhandler.j r10 = r0.f380012b
                if (r10 != 0) goto L_0x00ad
                com.google.android.apps.search.googleapp.urlhandler.j r10 = com.google.android.apps.search.googleapp.urlhandler.C139823j.f380066m
            L_0x00ad:
                com.google.android.apps.search.googleapp.urlhandler.b.a.b r10 = com.google.android.apps.search.googleapp.urlhandler.internal.C139809j.m227320b(r10)
                p5462h.p5473f.p5475b.C69664n.m101061g(r10, r9)
                com.google.android.libraries.search.b.b r6 = r6.f379927a
                com.google.android.libraries.search.b.i.f r11 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98210iR
                com.google.net.a.a.b r12 = com.google.net.p4726a.p4727a.C62722b.UNKNOWN
                com.google.android.libraries.search.b.i.a r11 = r11.mo40805c(r12)
                com.google.android.apps.search.googleapp.urlhandler.p10529b.C139787a.m227254h(r11, r10)
                r6.mo19974a(r11)
            L_0x00c4:
                com.google.android.apps.gsa.shared.logger.b.i r6 = r4.f380004a
                com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_LAUNCHED_WITHOUT_SESSION
                com.google.android.apps.gsa.shared.logger.b.g r10 = com.google.android.apps.search.googleapp.urlhandler.internal.C139809j.m227319a(r10, r0)
                r6.mo74236a(r10)
            L_0x00cf:
                boolean r6 = r4.f380008e
                if (r6 != 0) goto L_0x0103
                com.google.android.apps.search.googleapp.urlhandler.b.a r6 = r4.f380005b
                com.google.android.apps.search.googleapp.urlhandler.j r10 = r0.f380012b
                if (r10 != 0) goto L_0x00db
                com.google.android.apps.search.googleapp.urlhandler.j r10 = com.google.android.apps.search.googleapp.urlhandler.C139823j.f380066m
            L_0x00db:
                com.google.android.apps.search.googleapp.urlhandler.b.a.b r10 = com.google.android.apps.search.googleapp.urlhandler.internal.C139809j.m227320b(r10)
                p5462h.p5473f.p5475b.C69664n.m101061g(r10, r9)
                com.google.android.libraries.search.b.b r6 = r6.f379927a
                com.google.android.libraries.search.b.i.f r9 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97826bE
                com.google.net.a.a.b r11 = com.google.net.p4726a.p4727a.C62722b.OK
                com.google.android.libraries.search.b.i.a r9 = r9.mo40805c(r11)
                com.google.android.apps.search.googleapp.urlhandler.p10529b.C139787a.m227254h(r9, r10)
                r6.mo19974a(r9)
                goto L_0x0103
            L_0x00f3:
                com.google.android.apps.gsa.shared.logger.b.i r6 = r4.f380004a
                com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_INTENT_STARTED
                r6.mo83702b(r9)
                com.google.android.apps.search.googleapp.urlhandler.b.a r6 = r4.f380005b
                com.google.android.libraries.search.b.b r6 = r6.f379927a
                com.google.android.libraries.search.b.i.g r9 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97856bi
                r6.mo19974a(r9)
            L_0x0103:
                java.lang.Integer r6 = r17.mo115269n()
                com.google.android.apps.search.googleapp.customtabs.d.j r9 = r4.f380007d
                com.google.android.apps.search.googleapp.customtabs.d.a.y r9 = r9.mo111383a()
                if (r9 == 0) goto L_0x012c
                if (r6 != 0) goto L_0x0112
                goto L_0x012c
            L_0x0112:
                int r6 = r6.intValue()
                java.util.concurrent.ConcurrentMap r9 = r9.f364260c
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r6 = r9.get(r6)
                java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
                if (r6 != 0) goto L_0x0125
                goto L_0x012c
            L_0x0125:
                java.lang.Object r6 = r6.get()
                com.google.android.apps.search.googleapp.customtabs.d.a.q r6 = (com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133731q) r6
                goto L_0x012d
            L_0x012c:
                r6 = r3
            L_0x012d:
                r9 = 0
                if (r6 == 0) goto L_0x0136
                boolean r10 = r6.f364243l
                if (r10 == 0) goto L_0x0136
                r10 = 1
                goto L_0x0137
            L_0x0136:
                r10 = 0
            L_0x0137:
                int r11 = r17.mo115265l()
                if (r11 != r8) goto L_0x013f
                goto L_0x0262
            L_0x013f:
                com.google.common.o.uf r11 = com.google.common.p4552o.C60555uf.f164065cO
                com.google.protobuf.bn r11 = r11.createBuilder()
                com.google.common.o.tz r11 = (com.google.common.p4552o.C60548tz) r11
                r11.copyOnWrite()
                com.google.protobuf.bv r12 = r11.instance
                com.google.common.o.uf r12 = (com.google.common.p4552o.C60555uf) r12
                int r13 = r12.f164093a
                r13 = r13 | r7
                r12.f164093a = r13
                r13 = 624(0x270, float:8.74E-43)
                r12.f164258m = r13
                com.google.common.o.sa r12 = com.google.common.p4552o.C60496sa.f163764k
                com.google.protobuf.bn r12 = r12.createBuilder()
                com.google.common.o.rv r12 = (com.google.common.p4552o.C60490rv) r12
                int r13 = r17.mo115265l()
                if (r13 != r7) goto L_0x0167
                r13 = 1
                goto L_0x0168
            L_0x0167:
                r13 = 0
            L_0x0168:
                r12.copyOnWrite()
                com.google.protobuf.bv r14 = r12.instance
                com.google.common.o.sa r14 = (com.google.common.p4552o.C60496sa) r14
                int r15 = r14.f163766a
                r15 = r15 | r8
                r14.f163766a = r15
                r14.f163767b = r13
                java.lang.Integer r13 = r17.mo115269n()
                if (r13 == 0) goto L_0x017e
                r13 = 1
                goto L_0x017f
            L_0x017e:
                r13 = 0
            L_0x017f:
                r12.copyOnWrite()
                com.google.protobuf.bv r14 = r12.instance
                com.google.common.o.sa r14 = (com.google.common.p4552o.C60496sa) r14
                int r15 = r14.f163766a
                r15 = r15 | 64
                r14.f163766a = r15
                r14.f163773h = r13
                r12.copyOnWrite()
                com.google.protobuf.bv r13 = r12.instance
                com.google.common.o.sa r13 = (com.google.common.p4552o.C60496sa) r13
                int r14 = r13.f163766a
                r14 = r14 | 128(0x80, float:1.794E-43)
                r13.f163766a = r14
                r13.f163774i = r10
                boolean r10 = r17.mo115263j()
                r12.copyOnWrite()
                com.google.protobuf.bv r13 = r12.instance
                com.google.common.o.sa r13 = (com.google.common.p4552o.C60496sa) r13
                int r14 = r13.f163766a
                r14 = r14 | 8
                r13.f163766a = r14
                r13.f163770e = r10
                boolean r10 = r17.mo115264k()
                r12.copyOnWrite()
                com.google.protobuf.bv r13 = r12.instance
                com.google.common.o.sa r13 = (com.google.common.p4552o.C60496sa) r13
                int r14 = r13.f163766a
                r14 = r14 | 16
                r13.f163766a = r14
                r13.f163771f = r10
                boolean r10 = r17.mo115264k()
                r12.copyOnWrite()
                com.google.protobuf.bv r13 = r12.instance
                com.google.common.o.sa r13 = (com.google.common.p4552o.C60496sa) r13
                int r14 = r13.f163766a
                r14 = r14 | 32
                r13.f163766a = r14
                r13.f163772g = r10
                boolean r10 = r17.mo115262i()
                if (r10 == 0) goto L_0x01e1
                com.google.common.o.rx r10 = r17.mo115253b()
                goto L_0x01e2
            L_0x01e1:
                r10 = r3
            L_0x01e2:
                com.google.common.base.C58893dc.m90996a(r10)
                r12.copyOnWrite()
                com.google.protobuf.bv r13 = r12.instance
                com.google.common.o.sa r13 = (com.google.common.p4552o.C60496sa) r13
                int r10 = r10.f163738q
                r13.f163768c = r10
                int r10 = r13.f163766a
                r10 = r10 | r7
                r13.f163766a = r10
                com.google.android.apps.search.googleapp.urlhandler.j r10 = r0.f380012b
                if (r10 != 0) goto L_0x01fb
                com.google.android.apps.search.googleapp.urlhandler.j r10 = com.google.android.apps.search.googleapp.urlhandler.C139823j.f380066m
            L_0x01fb:
                int r10 = r10.f380069b
                com.google.android.apps.search.googleapp.urlhandler.q r10 = com.google.android.apps.search.googleapp.urlhandler.C139851q.m227396a(r10)
                if (r10 != 0) goto L_0x0205
                com.google.android.apps.search.googleapp.urlhandler.q r10 = com.google.android.apps.search.googleapp.urlhandler.C139851q.UNKNOWN
            L_0x0205:
                com.google.common.o.rz r10 = com.google.android.apps.search.googleapp.urlhandler.internal.C139803e.m227311a(r10)
                r12.copyOnWrite()
                com.google.protobuf.bv r13 = r12.instance
                com.google.common.o.sa r13 = (com.google.common.p4552o.C60496sa) r13
                int r10 = r10.f163762v
                r13.f163769d = r10
                int r10 = r13.f163766a
                r10 = r10 | r5
                r13.f163766a = r10
                com.google.protobuf.bv r10 = r12.build()
                com.google.common.o.sa r10 = (com.google.common.p4552o.C60496sa) r10
                r11.copyOnWrite()
                com.google.protobuf.bv r12 = r11.instance
                com.google.common.o.uf r12 = (com.google.common.p4552o.C60555uf) r12
                r10.getClass()
                r12.f164103aJ = r10
                int r10 = r12.f164250e
                r13 = 33554432(0x2000000, float:9.403955E-38)
                r10 = r10 | r13
                r12.f164250e = r10
                long r12 = r0.f380013c
                r11.copyOnWrite()
                com.google.protobuf.bv r10 = r11.instance
                com.google.common.o.uf r10 = (com.google.common.p4552o.C60555uf) r10
                int r14 = r10.f164093a
                r14 = r14 | 16
                r10.f164093a = r14
                r10.f164261p = r12
                com.google.android.apps.search.googleapp.urlhandler.j r0 = r0.f380012b
                if (r0 != 0) goto L_0x0249
                com.google.android.apps.search.googleapp.urlhandler.j r0 = com.google.android.apps.search.googleapp.urlhandler.C139823j.f380066m
            L_0x0249:
                long r12 = r0.f380071d
                r11.copyOnWrite()
                com.google.protobuf.bv r0 = r11.instance
                com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
                int r10 = r0.f164252g
                r14 = 268435456(0x10000000, float:2.5243549E-29)
                r10 = r10 | r14
                r0.f164252g = r10
                r0.f164192bt = r12
                com.google.android.libraries.search.logging.a.am r0 = r4.f380006c
                com.google.common.o.e.a r4 = com.google.common.p4552o.p4559e.C59743a.USER_EVENT_CUSTOM_TABS_OPEN
                r0.mo41599k(r4, r11)
            L_0x0262:
                if (r6 == 0) goto L_0x027f
                com.google.android.apps.search.googleapp.customtabs.d.a.a.a r0 = r6.f364236e
                com.google.android.libraries.p1623at.p1632e.C19559g.m37304c()
                java.lang.Long r4 = r0.f364193j
                if (r4 != 0) goto L_0x026e
                r9 = 1
            L_0x026e:
                java.lang.String r4 = "The intent should only be started once"
                com.google.common.base.C58838bb.m90884s(r9, r4)
                com.google.android.libraries.f.a r4 = r0.f364184a
                long r9 = r4.mo26874f()
                java.lang.Long r4 = java.lang.Long.valueOf(r9)
                r0.f364193j = r4
            L_0x027f:
                com.google.android.apps.search.googleapp.urlhandler.internal.g r0 = com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.this
                com.google.android.apps.search.googleapp.j.a r0 = r0.f379979f
                boolean r0 = r0.mo112949a()
                if (r0 == 0) goto L_0x0354
                int r0 = r17.mo115265l()
                if (r0 != r8) goto L_0x0354
                com.google.android.apps.search.googleapp.urlhandler.internal.g r0 = com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.this
                boolean r0 = r0.f379980g
                if (r0 == 0) goto L_0x0354
                com.google.common.base.C58893dc.m90996a(r2)
                com.google.android.apps.search.googleapp.googleappbrowser.a.h r0 = com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135458d.m219648a(r2)
                com.google.protobuf.bn r0 = r0.toBuilder()
                com.google.android.apps.search.googleapp.googleappbrowser.a.e r0 = (com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135459e) r0
                r0.copyOnWrite()
                com.google.protobuf.bv r2 = r0.instance
                com.google.android.apps.search.googleapp.googleappbrowser.a.h r2 = (com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h) r2
                int r4 = r2.f369061a
                r4 = r4 | 128(0x80, float:1.794E-43)
                r2.f369061a = r4
                r2.f369069i = r8
                com.google.protobuf.bv r0 = r0.build()
                com.google.android.apps.search.googleapp.googleappbrowser.a.h r0 = (com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h) r0
                com.google.android.apps.search.googleapp.u.h r2 = com.google.android.apps.search.googleapp.p10527u.C139767h.f379869k
                com.google.protobuf.bn r2 = r2.createBuilder()
                com.google.android.apps.search.googleapp.u.f r2 = (com.google.android.apps.search.googleapp.p10527u.C139765f) r2
                com.google.android.apps.search.googleapp.u.t r4 = com.google.android.apps.search.googleapp.p10527u.C139779t.GOOGLE_APP_BROWSER
                r2.copyOnWrite()
                com.google.protobuf.bv r6 = r2.instance
                com.google.android.apps.search.googleapp.u.h r6 = (com.google.android.apps.search.googleapp.p10527u.C139767h) r6
                int r4 = r4.f379907i
                r6.f379872b = r4
                int r4 = r6.f379871a
                r4 = r4 | r8
                r6.f379871a = r4
                com.google.android.apps.search.googleapp.urlhandler.internal.g r4 = com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.this
                boolean r4 = r4.f379981h
                r2.copyOnWrite()
                com.google.protobuf.bv r6 = r2.instance
                com.google.android.apps.search.googleapp.u.h r6 = (com.google.android.apps.search.googleapp.p10527u.C139767h) r6
                int r9 = r6.f379871a
                r7 = r7 | r9
                r6.f379871a = r7
                r4 = r4 ^ r8
                r6.f379873c = r4
                com.google.android.apps.search.googleapp.u.k r4 = com.google.android.apps.search.googleapp.p10527u.C139770k.f379882c
                com.google.protobuf.bn r4 = r4.createBuilder()
                com.google.android.apps.search.googleapp.u.j r4 = (com.google.android.apps.search.googleapp.p10527u.C139769j) r4
                r4.copyOnWrite()
                com.google.protobuf.bv r6 = r4.instance
                com.google.android.apps.search.googleapp.u.k r6 = (com.google.android.apps.search.googleapp.p10527u.C139770k) r6
                r0.getClass()
                r6.f379885b = r0
                r6.f379884a = r5
                com.google.protobuf.bv r4 = r4.build()
                com.google.android.apps.search.googleapp.u.k r4 = (com.google.android.apps.search.googleapp.p10527u.C139770k) r4
                r2.copyOnWrite()
                com.google.protobuf.bv r5 = r2.instance
                com.google.android.apps.search.googleapp.u.h r5 = (com.google.android.apps.search.googleapp.p10527u.C139767h) r5
                r4.getClass()
                r5.f379877g = r4
                int r4 = r5.f379871a
                r4 = r4 | 16
                r5.f379871a = r4
                int r4 = r0.f369061a
                r4 = r4 & 8
                if (r4 == 0) goto L_0x032c
                java.lang.String r0 = r0.f369065e
                r2.copyOnWrite()
                com.google.protobuf.bv r4 = r2.instance
                com.google.android.apps.search.googleapp.u.h r4 = (com.google.android.apps.search.googleapp.p10527u.C139767h) r4
                r0.getClass()
                int r5 = r4.f379871a
                r5 = r5 | 128(0x80, float:1.794E-43)
                r4.f379871a = r5
                r4.f379880j = r0
            L_0x032c:
                com.google.protobuf.bv r0 = r2.build()
                com.google.android.apps.search.googleapp.u.h r0 = (com.google.android.apps.search.googleapp.p10527u.C139767h) r0
                com.google.android.apps.search.googleapp.u.a r2 = new com.google.android.apps.search.googleapp.u.a
                r2.<init>(r0)
                com.google.android.apps.search.googleapp.urlhandler.internal.g r0 = com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.this
                android.support.v4.app.Fragment r0 = r0.f379976c
            L_0x033b:
                android.view.View r4 = r0.getView()
                if (r4 != 0) goto L_0x0349
                android.support.v4.app.Fragment r0 = r0.getParentFragment()
                if (r0 == 0) goto L_0x0348
                goto L_0x033b
            L_0x0348:
                throw r3
            L_0x0349:
                com.google.apps.tiktok.p3674l.p3679c.C47393f.m84236g(r2, r0)
                com.google.android.apps.search.googleapp.urlhandler.internal.g r0 = com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.this
                com.google.android.apps.search.googleapp.urlhandler.g r0 = r0.f379975b
                r0.mo113491a()
                return
            L_0x0354:
                int r0 = r17.mo115265l()
                r3 = 5
                if (r0 != r3) goto L_0x0372
                com.google.android.apps.search.googleapp.urlhandler.internal.g r0 = com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.this
                com.google.android.apps.gsa.h.e.a r0 = r0.f379982i
                java.lang.String r2 = r17.mo115256e()
                com.google.android.apps.gsa.h.e.d r2 = com.google.android.apps.gsa.h.e.a.b(r2)
                r0.mo41490e(r2)
                com.google.android.apps.search.googleapp.urlhandler.internal.g r0 = com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.this
                com.google.android.apps.search.googleapp.urlhandler.g r0 = r0.f379975b
                r0.mo113491a()
                return
            L_0x0372:
                com.google.common.base.C58893dc.m90996a(r2)
                com.google.android.apps.search.googleapp.urlhandler.internal.g r0 = com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.this     // Catch:{ ActivityNotFoundException -> 0x0388 }
                android.support.v4.app.Fragment r0 = r0.f379976c     // Catch:{ ActivityNotFoundException -> 0x0388 }
                android.content.Context r0 = r0.requireContext()     // Catch:{ ActivityNotFoundException -> 0x0388 }
                r0.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x0388 }
                com.google.android.apps.search.googleapp.urlhandler.internal.g r0 = com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.this     // Catch:{ ActivityNotFoundException -> 0x0388 }
                com.google.android.apps.search.googleapp.urlhandler.g r0 = r0.f379975b     // Catch:{ ActivityNotFoundException -> 0x0388 }
                r0.mo113491a()     // Catch:{ ActivityNotFoundException -> 0x0388 }
                return
            L_0x0388:
                r0 = move-exception
                com.google.common.f.e r2 = com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.f379974a
                com.google.common.f.x r2 = r2.mo56226d()
                java.lang.String r3 = "Unable to launch intent"
                r4 = 41429(0xa1d5, float:5.8054E-41)
                ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
                com.google.android.apps.search.googleapp.urlhandler.internal.g r0 = com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.this
                android.view.View r0 = r0.mo115281a()
                r2 = 2132090092(0x7f151cec, float:1.9820514E38)
                r3 = -1
                com.google.android.material.snackbar.Snackbar r0 = com.google.android.material.snackbar.Snackbar.m79660p(r0, r2, r3)
                r0.mo48343h()
                com.google.android.apps.search.googleapp.urlhandler.internal.g r0 = com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.this
                com.google.android.apps.search.googleapp.urlhandler.g r0 = r0.f379975b
                r0.mo113492b()
                return
            L_0x03b0:
                goto L_0x03b2
            L_0x03b1:
                throw r3
            L_0x03b2:
                goto L_0x03b1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.urlhandler.internal.C139805g.C1398061.mo115282d(com.google.android.apps.search.googleapp.urlhandler.internal.UrlIntentResult):void");
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
        }
    };

    /* renamed from: k */
    private final C47215a f379984k;

    public C139805g(C139796g gVar, Fragment fragment, C47215a aVar, C139809j jVar, C62921ba baVar, C136370a aVar2, boolean z, boolean z2, a aVar3) {
        this.f379975b = gVar;
        this.f379976c = fragment;
        this.f379984k = aVar;
        this.f379977d = jVar;
        this.f379978e = baVar;
        this.f379979f = aVar2;
        this.f379980g = z;
        this.f379981h = z2;
        this.f379982i = aVar3;
    }

    /* renamed from: a */
    public final View mo115281a() {
        return this.f379984k.mo51123r().findViewById(16908290);
    }
}

package com.google.android.apps.gsa.staticplugins.bisto.p7530v;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Base64;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.bisto.C89652g;
import com.google.android.apps.gsa.shared.bisto.C89681t;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89636g;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95300f;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95853d;
import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96625a;
import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d;
import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96629e;
import com.google.android.apps.gsa.staticplugins.bisto.p7534y.C96633c;
import com.google.android.apps.gsa.staticplugins.bisto.p7534y.C96634d;
import com.google.android.apps.gsa.staticplugins.bisto.p7534y.C96635e;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96460ar;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96461as;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60105ky;
import com.google.common.p4552o.C60229lc;
import com.google.common.p4552o.C60231le;
import com.google.common.p4552o.C60291nd;
import com.google.common.p4552o.C60292ne;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.v.d */
/* compiled from: PG */
public final class C96511d implements AutoCloseable {

    /* renamed from: a */
    private final Context f270022a;

    /* renamed from: b */
    private final C21370a f270023b;

    /* renamed from: c */
    private final C96510c f270024c;

    /* renamed from: d */
    private final C68214a f270025d;

    /* renamed from: e */
    private final C68214a f270026e;

    /* renamed from: f */
    private C96509b f270027f;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d6, code lost:
        com.google.android.apps.gsa.shared.bisto.C89655j.m145957a(java.lang.String.format("Failed to restore state %s", new java.lang.Object[]{r0}));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00d3 A[ExcHandler: ct (e com.google.protobuf.ct), Splitter:B:3:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C96511d(android.content.Context r16, com.google.android.libraries.p1730f.C21370a r17, dagger.C68214a r18, com.google.android.apps.gsa.staticplugins.bisto.p7530v.C96510c r19, dagger.C68214a r20, com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a r21) {
        /*
            r15 = this;
            r1 = r15
            r0 = r19
            r15.<init>()
            r2 = r16
            r1.f270022a = r2
            r2 = r17
            r1.f270023b = r2
            r2 = r18
            r1.f270026e = r2
            r1.f270024c = r0
            r2 = r20
            r1.f270025d = r2
            java.lang.Object r2 = r20.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.x.d r2 = (com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d) r2
            java.lang.String r3 = "oobe_notification_state"
            r4 = 0
            java.lang.String r2 = r2.mo90297j(r3, r4)
            if (r2 == 0) goto L_0x00e3
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3 = 0
            r4 = 1
            byte[] r2 = android.util.Base64.decode(r2, r3)     // Catch:{ IllegalArgumentException -> 0x00d5, ct -> 0x00d3 }
            com.google.android.apps.gsa.staticplugins.bisto.y.d r5 = com.google.android.apps.gsa.staticplugins.bisto.p7534y.C96634d.f270324e     // Catch:{ IllegalArgumentException -> 0x00d5, ct -> 0x00d3 }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (byte[]) r2)     // Catch:{ IllegalArgumentException -> 0x00d5, ct -> 0x00d3 }
            r14 = r2
            com.google.android.apps.gsa.staticplugins.bisto.y.d r14 = (com.google.android.apps.gsa.staticplugins.bisto.p7534y.C96634d) r14     // Catch:{ IllegalArgumentException -> 0x00d5, ct -> 0x00d3 }
            int r2 = r14.f270327b     // Catch:{ IllegalArgumentException -> 0x00d5, ct -> 0x00d3 }
            int r5 = com.google.android.apps.gsa.staticplugins.bisto.p7534y.C96635e.m160134b(r2)     // Catch:{ IllegalArgumentException -> 0x00d5, ct -> 0x00d3 }
            if (r5 != 0) goto L_0x0041
            r5 = 1
        L_0x0041:
            int r5 = r5 + -2
            if (r5 == r4) goto L_0x0063
            java.lang.String r0 = "Unexpected type %s"
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ IllegalArgumentException -> 0x00d5, ct -> 0x00d3 }
            int r2 = com.google.android.apps.gsa.staticplugins.bisto.p7534y.C96635e.m160134b(r2)     // Catch:{ IllegalArgumentException -> 0x00d5, ct -> 0x00d3 }
            if (r2 != 0) goto L_0x0050
            r2 = 1
        L_0x0050:
            int r2 = com.google.android.apps.gsa.staticplugins.bisto.p7534y.C96635e.m160133a(r2)     // Catch:{ IllegalArgumentException -> 0x00d5, ct -> 0x00d3 }
            java.lang.String r2 = java.lang.Integer.toString(r2)     // Catch:{ IllegalArgumentException -> 0x00d5, ct -> 0x00d3 }
            r5[r3] = r2     // Catch:{ IllegalArgumentException -> 0x00d5, ct -> 0x00d3 }
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch:{ IllegalArgumentException -> 0x00d5, ct -> 0x00d3 }
            com.google.android.apps.gsa.shared.bisto.C89655j.m145957a(r0)     // Catch:{ IllegalArgumentException -> 0x00d5, ct -> 0x00d3 }
            goto L_0x00e3
        L_0x0063:
            com.google.android.apps.gsa.staticplugins.bisto.v.b r2 = new com.google.android.apps.gsa.staticplugins.bisto.v.b     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            g.a.a r5 = r0.f270014a     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            java.lang.Object r5 = r5.mo17428b()     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r6 = r5
            android.content.Context r6 = (android.content.Context) r6     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r6.getClass()     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            g.a.a r5 = r0.f270015b     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            java.lang.Object r5 = r5.mo17428b()     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r7 = r5
            com.google.android.apps.gsa.staticplugins.bisto.f.f r7 = (com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95300f) r7     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r7.getClass()     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            g.a.a r5 = r0.f270016c     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            java.lang.Object r5 = r5.mo17428b()     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r8 = r5
            com.google.common.util.concurrent.db r8 = (com.google.common.util.concurrent.C60888db) r8     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r8.getClass()     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            g.a.a r5 = r0.f270017d     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            dagger.a.l r5 = (dagger.p5294a.C68226l) r5     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            g.a.a r5 = r5.f184585a     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            dagger.a r9 = dagger.p5294a.C68219e.m98518a(r5)     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r9.getClass()     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            g.a.a r5 = r0.f270018e     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            java.lang.Object r5 = r5.mo17428b()     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r10 = r5
            com.google.android.libraries.f.a r10 = (com.google.android.libraries.p1730f.C21370a) r10     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r10.getClass()     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            g.a.a r5 = r0.f270019f     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            dagger.a.l r5 = (dagger.p5294a.C68226l) r5     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            g.a.a r5 = r5.f184585a     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            dagger.a r11 = dagger.p5294a.C68219e.m98518a(r5)     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r11.getClass()     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            g.a.a r5 = r0.f270020g     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            dagger.a.l r5 = (dagger.p5294a.C68226l) r5     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            g.a.a r5 = r5.f184585a     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            dagger.a r12 = dagger.p5294a.C68219e.m98518a(r5)     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r12.getClass()     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            g.a.a r0 = r0.f270021h     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            dagger.a.l r0 = (dagger.p5294a.C68226l) r0     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            g.a.a r0 = r0.f184585a     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            dagger.a r13 = dagger.p5294a.C68219e.m98518a(r0)     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r13.getClass()     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r14.getClass()     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            r1.f270027f = r2     // Catch:{ IllegalArgumentException -> 0x00e3, ct -> 0x00d3 }
            goto L_0x00e3
        L_0x00d3:
            r0 = move-exception
            goto L_0x00d6
        L_0x00d5:
            r0 = move-exception
        L_0x00d6:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            java.lang.String r0 = "Failed to restore state %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            com.google.android.apps.gsa.shared.bisto.C89655j.m145957a(r0)
        L_0x00e3:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2 = r21
            java.util.concurrent.ConcurrentLinkedDeque r0 = r2.f268408a
            r0.add(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7530v.C96511d.<init>(android.content.Context, com.google.android.libraries.f.a, dagger.a, com.google.android.apps.gsa.staticplugins.bisto.v.c, dagger.a, com.google.android.apps.gsa.staticplugins.bisto.r.a):void");
    }

    /* renamed from: a */
    public final void mo90198a() {
        C96509b bVar = this.f270027f;
        if (bVar != null) {
            bVar.f270012o.cancel(20);
            C58976aa aaVar = C58975e.f156826a;
            bVar.mo90196f();
        }
        ((NotificationManager) this.f270022a.getSystemService("notification")).cancel(20);
        C58976aa aaVar2 = C58975e.f156826a;
    }

    /* renamed from: b */
    public final void mo90199b(String str, C124548d dVar, String str2) {
        boolean z;
        Notification notification;
        String str3;
        C58833ax axVar;
        C96509b bVar = this.f270027f;
        if (bVar == null) {
            z = C96509b.m159892a((NotificationManager) this.f270022a.getSystemService("notification"), str) != null;
        } else {
            String str4 = str;
            z = bVar.mo90197g();
        }
        if (!z) {
            if (bVar != null) {
                C58976aa aaVar = C58975e.f156826a;
                bVar.mo90196f();
            }
            this.f270027f = null;
            if (C96461as.m159828e((C91142g) this.f270026e.mo27525b(), this.f270023b)) {
                C58976aa aaVar2 = C58975e.f156826a;
            } else if (C96461as.m159829f((C91142g) this.f270026e.mo27525b(), this.f270023b)) {
                C58976aa aaVar3 = C58975e.f156826a;
            } else {
                C96510c cVar = this.f270024c;
                Context context = (Context) cVar.f270014a.mo17428b();
                context.getClass();
                C95300f fVar = (C95300f) cVar.f270015b.mo17428b();
                fVar.getClass();
                C60888db dbVar = (C60888db) cVar.f270016c.mo17428b();
                dbVar.getClass();
                C68214a a = C68219e.m98518a(((C68226l) cVar.f270017d).f184585a);
                a.getClass();
                C21370a aVar = (C21370a) cVar.f270018e.mo17428b();
                aVar.getClass();
                C68214a a2 = C68219e.m98518a(((C68226l) cVar.f270019f).f184585a);
                a2.getClass();
                C68214a a3 = C68219e.m98518a(((C68226l) cVar.f270020g).f184585a);
                a3.getClass();
                C68214a a4 = C68219e.m98518a(((C68226l) cVar.f270021h).f184585a);
                a4.getClass();
                str.getClass();
                C96509b bVar2 = new C96509b(context, fVar, dbVar, a, aVar, a2, a3, a4, str, dVar, str2);
                this.f270027f = bVar2;
                if (bVar2.f270009l.mo26870b() - ((C96628d) bVar2.f270000c.mo27525b()).mo90289a("prefs", "last_oobe_timestamp", 0) >= C96509b.f269998a) {
                    if (bVar2.f270005h != null) {
                        boolean checkBluetoothAddress = BluetoothAdapter.checkBluetoothAddress(bVar2.f270006i);
                        int i = 3;
                        if (checkBluetoothAddress && C89681t.m146046l(C89652g.m145951a().mo83542c(bVar2.f270006i).f343619a)) {
                            C58976aa aaVar4 = C58975e.f156826a;
                            i = 4;
                        }
                        if (bVar2.f270005h.mo106504d() >= i) {
                            C58976aa aaVar5 = C58975e.f156826a;
                            return;
                        }
                    }
                    C58976aa aaVar6 = C58975e.f156826a;
                    if (bVar2.f270005h == null || !"wired".equals(bVar2.f270006i)) {
                        PendingIntent c = bVar2.mo90193c();
                        Intent a5 = C89636g.m145895a(bVar2.f270010m, bVar2.f270006i, bVar2.mo90194d(), 0, C60105ky.ANDROID_OOBE_NOTIFICATION_TRADITIONAL);
                        a5.putExtra("dont_ask_again", true);
                        PendingIntent activity = PendingIntent.getActivity(bVar2.f270010m, 1001, a5, 201326592);
                        PendingIntent b = bVar2.mo90192b();
                        String str5 = bVar2.f270003f;
                        if (str5 == null) {
                            str3 = bVar2.f270010m.getString(R.string.bisto_pairing_card_title_without_device_name);
                        } else {
                            str3 = bVar2.f270010m.getString(R.string.pairing_notification_title, new Object[]{str5});
                        }
                        C124548d dVar2 = bVar2.f270005h;
                        if (dVar2 != null) {
                            axVar = C58833ax.m90834k(dVar2.mo106513k());
                        } else {
                            axVar = C58836b.f156633a;
                        }
                        Context context2 = bVar2.f270010m;
                        C1839z b2 = C96460ar.m159822b(context2, str3, context2.getString(R.string.pairing_notification_text_v2), C96460ar.f269856c, axVar);
                        b2.f5687g = c;
                        b2.mo5016e(0, bVar2.f270010m.getString(R.string.pairing_notification_button_text_v2), c);
                        b2.mo5016e(0, bVar2.f270010m.getString(R.string.pairing_notification_dont_ask_again_v2), activity);
                        b2.f5679J.deleteIntent = b;
                        bVar2.mo90195e(b2);
                        notification = b2.mo5013a();
                    } else {
                        PendingIntent c2 = bVar2.mo90193c();
                        PendingIntent b3 = bVar2.mo90192b();
                        C124548d dVar3 = bVar2.f270005h;
                        C58833ax k = dVar3 != null ? C58833ax.m90834k(dVar3.mo106513k()) : C58836b.f156633a;
                        Context context3 = bVar2.f270010m;
                        C1839z b4 = C96460ar.m159822b(context3, context3.getString(R.string.educational_oobe_notification_title), bVar2.f270010m.getString(R.string.educational_oobe_notification_content), C96460ar.f269856c, k);
                        b4.f5687g = c2;
                        b4.mo5016e(0, bVar2.f270010m.getString(R.string.educational_oobe_notification_more_info), c2);
                        b4.f5679J.deleteIntent = b3;
                        bVar2.mo90195e(b4);
                        notification = b4.mo5013a();
                    }
                    if (bVar2.f270005h == null) {
                        bVar2.f270005h = ((C89492cd) bVar2.f270008k.mo27525b()).mo83401b(bVar2.f270006i);
                    }
                    C124548d dVar4 = bVar2.f270005h;
                    if (dVar4 != null && dVar4.mo106513k() == C124719q.CAR_ACCESSORY && ((PowerManager) bVar2.f270010m.getSystemService("power")).isInteractive() && !((C84516aa) bVar2.f270002e.mo27525b()).f230023b.isDeviceLocked()) {
                        ((C95853d) bVar2.f270001d.mo27525b()).mo89823a(C89636g.m145895a(bVar2.f270010m, bVar2.f270006i, bVar2.f270005h.mo106481V(), 0, C60105ky.ANDROID_OOBE_NOTIFICATION_TRADITIONAL));
                    } else if (!bVar2.mo90197g()) {
                        bVar2.f270012o.notify(20, notification);
                        C95299e a6 = bVar2.f269999b.mo89238a();
                        String str6 = bVar2.f270004g;
                        C124548d dVar5 = bVar2.f270005h;
                        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
                        C60291nd a7 = a6.mo89231a(str6, dVar5);
                        nkVar.copyOnWrite();
                        C60300nm nmVar = (C60300nm) nkVar.instance;
                        C60292ne neVar = (C60292ne) a7.build();
                        neVar.getClass();
                        nmVar.f163151e = neVar;
                        nmVar.f163147a |= 512;
                        C60229lc lcVar = (C60229lc) C60231le.f162958c.createBuilder();
                        lcVar.copyOnWrite();
                        C60231le leVar = (C60231le) lcVar.instance;
                        leVar.f162961b = 1;
                        leVar.f162960a = 1 | leVar.f162960a;
                        nkVar.copyOnWrite();
                        C60300nm nmVar2 = (C60300nm) nkVar.instance;
                        C60231le leVar2 = (C60231le) lcVar.build();
                        leVar2.getClass();
                        nmVar2.f163168v = leVar2;
                        nmVar2.f163148b |= 16;
                        a6.mo89234d(nkVar);
                    } else {
                        return;
                    }
                    C96508a aVar2 = new C96508a(bVar2);
                    bVar2.mo90196f();
                    bVar2.f270013p = bVar2.f270007j.mo29164d(aVar2, 1500, TimeUnit.MILLISECONDS);
                    return;
                }
                C58976aa aaVar7 = C58975e.f156826a;
            }
        }
    }

    public final void close() {
        C96634d dVar;
        C96509b bVar = this.f270027f;
        String str = null;
        if (bVar != null) {
            if (!bVar.mo90197g()) {
                C58976aa aaVar = C58975e.f156826a;
                dVar = null;
            } else {
                C96633c cVar = (C96633c) C96634d.f270324e.createBuilder();
                String str2 = bVar.f270006i;
                cVar.copyOnWrite();
                str2.getClass();
                ((C96634d) cVar.instance).f270326a = str2;
                cVar.copyOnWrite();
                ((C96634d) cVar.instance).f270327b = C96635e.m160133a(3);
                long j = bVar.f270011n;
                cVar.copyOnWrite();
                ((C96634d) cVar.instance).f270329d = j;
                String str3 = bVar.f270003f;
                if (str3 != null) {
                    cVar.copyOnWrite();
                    ((C96634d) cVar.instance).f270328c = str3;
                }
                dVar = (C96634d) cVar.build();
            }
            if (dVar != null) {
                str = Base64.encodeToString(dVar.toByteArray(), 0);
            }
        }
        C96628d dVar2 = (C96628d) this.f270025d.mo27525b();
        if (str == null) {
            C96625a b = dVar2.mo90290b();
            b.f270315b.remove(C96629e.m160121c("prefs", "oobe_notification_state"));
            b.mo90284a();
            return;
        }
        dVar2.mo90294g("oobe_notification_state", str);
    }
}

package com.google.android.apps.gsa.staticplugins.opa.promo;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.app.C1793aj;
import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.assistant.shared.bl;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.bo;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.p6790a.p6791a.C85776a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90771bo;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.staticplugins.opa.promo.p8407a.C109889k;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p4008y.p4013d.C53653e;
import com.google.assistant.p4008y.p4013d.C53654f;
import com.google.assistant.p4008y.p4013d.C53655g;
import com.google.assistant.p4008y.p4013d.C53657i;
import com.google.assistant.p4008y.p4013d.C53658j;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.ah */
/* compiled from: PG */
public final class C109912ah implements bo, bl {

    /* renamed from: a */
    public static final C59071e f306243a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.promo.ah");

    /* renamed from: h */
    private static final long f306244h = TimeUnit.HOURS.toMillis(48);

    /* renamed from: i */
    private static final long f306245i = TimeUnit.DAYS.toMillis(2);

    /* renamed from: b */
    public final C68214a f306246b;

    /* renamed from: c */
    public final C86124t f306247c;

    /* renamed from: d */
    public final SharedPreferences f306248d;

    /* renamed from: e */
    public final C21370a f306249e;

    /* renamed from: f */
    public final l f306250f;

    /* renamed from: g */
    public final C86054o f306251g;

    /* renamed from: j */
    private final Context f306252j;

    /* renamed from: k */
    private final C69464a f306253k;

    /* renamed from: l */
    private final C58833ax f306254l;

    /* renamed from: m */
    private final C109941r f306255m;

    /* renamed from: n */
    private final C22871g f306256n;

    /* renamed from: o */
    private final C118561t f306257o;

    /* renamed from: p */
    private final C1800aq f306258p;

    /* renamed from: q */
    private final C68214a f306259q;

    /* renamed from: r */
    private final C109889k f306260r;

    /* renamed from: s */
    private final C109935l f306261s;

    /* renamed from: t */
    private final C85776a f306262t;

    public C109912ah(Context context, C69464a aVar, C58833ax axVar, C86124t tVar, SharedPreferences sharedPreferences, C118561t tVar2, C1800aq aqVar, C21370a aVar2, C68214a aVar3, C109889k kVar, C109941r rVar, C22871g gVar, C68214a aVar4, l lVar, C86054o oVar, C109935l lVar2, C85776a aVar5) {
        this.f306252j = context;
        this.f306253k = aVar;
        this.f306247c = tVar;
        this.f306248d = sharedPreferences;
        this.f306257o = tVar2;
        this.f306258p = aqVar;
        this.f306255m = rVar;
        this.f306256n = gVar;
        this.f306249e = aVar2;
        this.f306259q = aVar3;
        this.f306260r = kVar;
        this.f306254l = axVar;
        this.f306246b = aVar4;
        this.f306250f = lVar;
        this.f306251g = oVar;
        this.f306261s = lVar2;
        this.f306262t = aVar5;
    }

    /* renamed from: A */
    private final int m183050A() {
        int i = this.f306248d.getInt("opa_multi_day_upgrade_promo_notification_count", 0);
        C58485gu o = this.f306247c.mo79749o(C90014bt.f247474ho);
        if (i >= o.size()) {
            return 0;
        }
        return ((Integer) o.get(i)).intValue();
    }

    /* renamed from: B */
    private final Intent m183051B(String str) {
        return new Intent().setClassName(this.f306252j, "com.google.android.apps.gsa.search.core.service.SearchService").setAction(str);
    }

    /* renamed from: C */
    private final C1839z m183052C() {
        C1839z a = C89095d.m144923a(this.f306252j, (String) null);
        a.f5679J.icon = R.drawable.ic_assistant_light;
        a.f5670A = this.f306252j.getResources().getColor(R.color.google_blue);
        a.f5671B = 1;
        a.mo5015d(16, true);
        return a;
    }

    /* renamed from: D */
    private final void m183053D(SharedPreferences.Editor editor, String str) {
        editor.putInt(str, this.f306248d.getInt(str, 0) + 1);
    }

    /* renamed from: E */
    private static void m183054E(Intent intent, C28292j jVar) {
        C60214n g = C28285c.m52880g(jVar);
        if (g != null) {
            intent.putExtra("ved", C28294l.m52913c(g));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b9  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m183055F(int r10, int r11) {
        /*
            r9 = this;
            r0 = 8
            r1 = 2
            r2 = 32
            r3 = 4
            r4 = 1
            if (r11 == r1) goto L_0x0037
            r5 = 3
            if (r11 == r5) goto L_0x0023
            if (r11 == r3) goto L_0x000f
            return
        L_0x000f:
            r11 = 911(0x38f, float:1.277E-42)
            if (r10 == r3) goto L_0x004c
            if (r10 != r0) goto L_0x0016
            goto L_0x004c
        L_0x0016:
            if (r10 != r4) goto L_0x001b
            r11 = 930(0x3a2, float:1.303E-42)
            goto L_0x004c
        L_0x001b:
            if (r10 != r2) goto L_0x0020
            r11 = 1386(0x56a, float:1.942E-42)
            goto L_0x0047
        L_0x0020:
            r11 = 1011(0x3f3, float:1.417E-42)
            goto L_0x004c
        L_0x0023:
            r11 = 910(0x38e, float:1.275E-42)
            if (r10 == r3) goto L_0x004c
            if (r10 != r0) goto L_0x002a
            goto L_0x004c
        L_0x002a:
            if (r10 != r4) goto L_0x002f
            r11 = 929(0x3a1, float:1.302E-42)
            goto L_0x004c
        L_0x002f:
            if (r10 != r2) goto L_0x0034
            r11 = 1384(0x568, float:1.94E-42)
            goto L_0x0047
        L_0x0034:
            r11 = 1012(0x3f4, float:1.418E-42)
            goto L_0x004c
        L_0x0037:
            r11 = 909(0x38d, float:1.274E-42)
            if (r10 == r3) goto L_0x004c
            if (r10 != r0) goto L_0x003e
            goto L_0x004c
        L_0x003e:
            if (r10 != r4) goto L_0x0043
            r11 = 928(0x3a0, float:1.3E-42)
            goto L_0x004c
        L_0x0043:
            if (r10 != r2) goto L_0x004a
            r11 = 1385(0x569, float:1.941E-42)
        L_0x0047:
            r10 = 32
            goto L_0x004c
        L_0x004a:
            r11 = 1010(0x3f2, float:1.415E-42)
        L_0x004c:
            com.google.common.o.uf r2 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.tz r2 = (com.google.common.p4552o.C60548tz) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.common.o.uf r5 = (com.google.common.p4552o.C60555uf) r5
            int r6 = r5.f164093a
            r6 = r6 | r1
            r5.f164093a = r6
            r5.f164258m = r11
            com.google.common.o.akd r11 = com.google.common.p4552o.akd.f158953f
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.common.o.akc r11 = (com.google.common.p4552o.akc) r11
            r5 = 0
            if (r10 == r4) goto L_0x00b9
            if (r10 == r3) goto L_0x0086
            if (r10 == r0) goto L_0x0079
            com.google.protobuf.bv r10 = r11.build()
            com.google.common.o.akd r10 = (com.google.common.p4552o.akd) r10
            goto L_0x00f3
        L_0x0079:
            int r10 = r9.m183050A()
            android.content.SharedPreferences r6 = r9.f306248d
            java.lang.String r7 = "opa_multi_day_upgrade_promo_notification_count"
            int r6 = r6.getInt(r7, r5)
            goto L_0x00c2
        L_0x0086:
            android.content.SharedPreferences r10 = r9.f306248d
            java.lang.String r6 = "opa_upgrade_promo_notification_count"
            int r6 = r10.getInt(r6, r5)
            android.content.SharedPreferences r10 = r9.f306248d
            java.lang.String r7 = "opa_upgrade_promo_notification_trigger"
            int r10 = r10.getInt(r7, r5)
            if (r10 != r4) goto L_0x00a8
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.common.o.akd r10 = (com.google.common.p4552o.akd) r10
            r10.f158956b = r4
            int r7 = r10.f158955a
            r7 = r7 | r4
            r10.f158955a = r7
        L_0x00a6:
            r10 = 0
            goto L_0x00c2
        L_0x00a8:
            if (r10 != r1) goto L_0x00a6
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.common.o.akd r10 = (com.google.common.p4552o.akd) r10
            r10.f158956b = r1
            int r7 = r10.f158955a
            r7 = r7 | r4
            r10.f158955a = r7
            goto L_0x00a6
        L_0x00b9:
            android.content.SharedPreferences r10 = r9.f306248d
            java.lang.String r6 = "opa_tooltip_promo_notification_count"
            int r6 = r10.getInt(r6, r5)
            r10 = 1
        L_0x00c2:
            r11.copyOnWrite()
            com.google.protobuf.bv r7 = r11.instance
            com.google.common.o.akd r7 = (com.google.common.p4552o.akd) r7
            int r8 = r7.f158955a
            r3 = r3 | r8
            r7.f158955a = r3
            r7.f158958d = r5
            r11.copyOnWrite()
            com.google.protobuf.bv r3 = r11.instance
            com.google.common.o.akd r3 = (com.google.common.p4552o.akd) r3
            int r5 = r3.f158955a
            r0 = r0 | r5
            r3.f158955a = r0
            r3.f158959e = r10
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.common.o.akd r10 = (com.google.common.p4552o.akd) r10
            int r0 = r10.f158955a
            r0 = r0 | r1
            r10.f158955a = r0
            int r6 = r6 + r4
            r10.f158957c = r6
            com.google.protobuf.bv r10 = r11.build()
            com.google.common.o.akd r10 = (com.google.common.p4552o.akd) r10
        L_0x00f3:
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.common.o.uf r11 = (com.google.common.p4552o.C60555uf) r11
            r10.getClass()
            r11.f164195bw = r10
            int r10 = r11.f164253h
            r10 = r10 | r4
            r11.f164253h = r10
            com.google.protobuf.bv r10 = r2.build()
            com.google.common.o.uf r10 = (com.google.common.p4552o.C60555uf) r10
            r11 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r10, r11, r11, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.promo.C109912ah.m183055F(int, int):void");
    }

    /* renamed from: G */
    private final void m183056G(boolean z) {
        if (!this.f306247c.mo79746e(C90037cp.f248430aK) || this.f306247c.mo79746e(C90037cp.f248424aE)) {
            return;
        }
        if (this.f306247c.mo79746e(C90014bt.f247268du)) {
            if (!this.f306247c.mo79746e(C90037cp.f248424aE) && this.f306248d.getLong("opa_multi_day_upgrade_notification_schedule_timestamp", 0) == 0 && this.f306248d.getLong("opa_eligibility_change_timestamp", 0) != 0 && !this.f306248d.getBoolean("opa_user_turned_off_multiday_notification", false)) {
                this.f306257o.mo103752c(C118522by.OPA_UPGRADE_PROMO_NOTIFICATION);
                mo98240l(Math.max(0, (this.f306248d.getLong("opa_eligibility_change_timestamp", 0) + TimeUnit.MINUTES.toMillis(this.f306247c.mo79743a(C90014bt.f247475hp))) - this.f306249e.mo26870b()));
            }
        } else if (z) {
            mo98253y(C118522by.OPA_UPGRADE_PROMO_NOTIFICATION, TimeUnit.HOURS.toMillis(72));
        }
    }

    /* renamed from: H */
    private final void m183057H(C53653e eVar) {
        C60870cx h = C60922j.m93045h(((C108013bm) this.f306246b.mo27525b()).mo96369z(), new C109906ab(this, eVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        new C90873ag(h, this.f306256n, "recordOptOut", C109907ac.f306238a).mo85223a(C109908ad.f306239a);
        this.f306258p.f5622a.cancel("op", C89885b.OKHTTP_HOSTNAME_NOT_VERIFIED_VALUE);
    }

    /* renamed from: I */
    private static boolean m183058I(int i) {
        return i == 3 || i == 4;
    }

    /* renamed from: J */
    private final boolean m183059J() {
        return ((bm) this.f306253k.mo17428b()).m();
    }

    /* renamed from: K */
    private static void m183060K(String str, int i) {
        C60321oe l = C28285c.m52885l(str, i);
        if (l != null) {
            C89949q.m146521e(l, false);
        }
    }

    /* renamed from: z */
    private final int m183061z() {
        return m183059J() ? 3 : 5;
    }

    /* renamed from: b */
    public final int mo98229b(int i, int i2) {
        String str;
        if (i == 1) {
            str = "opa_tooltip_promo_notification_state";
        } else if (i == 4) {
            str = "opa_upgrade_promo_notification_state";
        } else if (i != 8) {
            return i2;
        } else {
            str = "opa_multi_day_upgrade_promo_notification_state";
        }
        return this.f306248d.getInt(str, i2);
    }

    /* renamed from: c */
    public final PendingIntent mo98230c(PendingIntent pendingIntent, C28292j jVar) {
        Intent putExtra = m183051B("com.google.android.search.core.action.OPA_NOTIFICATION_TAPPED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 128);
        if (pendingIntent != null) {
            putExtra.putExtra("opa-target-pending-intent", pendingIntent);
        }
        m183054E(putExtra, jVar);
        return PendingIntent.getService(this.f306252j, 0, putExtra, 1409286144);
    }

    /* renamed from: d */
    public final PendingIntent mo98231d(Intent intent, C28292j jVar) {
        Intent putExtra = m183051B("com.google.android.search.core.action.OPA_NOTIFICATION_TAPPED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 128);
        putExtra.putExtra("opa-nga-target-intent", intent);
        m183054E(putExtra, jVar);
        return PendingIntent.getService(this.f306252j, 0, putExtra, 1409286144);
    }

    /* renamed from: e */
    public final void mo98232e() {
        C58976aa aaVar = C58975e.f156826a;
        this.f306258p.f5622a.cancel("op", C89885b.OKHTTP_HTTP_PROXY_AUTH_VALUE);
    }

    /* renamed from: f */
    public final void mo98233f() {
        this.f306255m.mo98262a();
        long b = this.f306249e.mo26870b();
        if (this.f306247c.mo79746e(C90014bt.f247798nu) && ((bm) this.f306253k.mo17428b()).u() && !this.f306248d.getBoolean("opa_update_settings_on_device_activation", false) && b - this.f306248d.getLong("opa_eligibility_change_timestamp", 0) < f306244h) {
            C60856cj.m92911t(this.f306262t.mo79439a(), new C109910af(this), C60826bg.f164896a);
        }
        if (!((bm) this.f306253k.mo17428b()).n()) {
            long b2 = this.f306249e.mo26870b();
            long j = b2 - this.f306248d.getLong("opa_eligibility_change_timestamp", b2);
            long j2 = f306245i;
            if (!this.f306247c.mo79746e(C90037cp.f248453ah) || C90771bo.m148273b(this.f306252j, UserHandleCompat.m148154a()) || !((bm) this.f306253k.mo17428b()).u() || !this.f306254l.mo56113h() || !((C74713bn) this.f306254l.mo56107c()).mo71078c() || !this.f306255m.mo98263b() || this.f306247c.mo79746e(C90037cp.f248424aE) || (j >= j2 && !this.f306247c.mo79746e(C90037cp.f248455aj))) {
                C58976aa aaVar = C58975e.f156826a;
            } else {
                new C90873ag(((C108013bm) this.f306246b.mo27525b()).mo96369z(), this.f306256n, "handleNgaNotificationCreative", new C109947x(this)).mo85223a(C109948y.f306358a);
            }
        } else {
            m183056G(false);
        }
    }

    /* renamed from: g */
    public final void mo98234g(boolean z) {
        if (!z && ((bm) this.f306253k.mo17428b()).n()) {
            int i = -1;
            int b = mo98229b(4, -1);
            int b2 = mo98229b(8, -1);
            if (b == -1) {
                if (b2 == -1) {
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 937;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                } else {
                    i = b2;
                }
                b = -1;
            } else {
                i = b2;
            }
            if (i == 2) {
                mo98243o(8, 1);
            }
            if (b == 2) {
                mo98252x(1, 1);
            }
        }
        this.f306255m.mo98262a();
        this.f306261s.mo98260b();
    }

    /* renamed from: i */
    public final void mo98236i(C53658j jVar, String str) {
        C53655g gVar = (C53655g) jVar.toBuilder();
        C63042fg i = C62953e.m95484i(this.f306249e.mo26870b());
        gVar.copyOnWrite();
        C53658j jVar2 = (C53658j) gVar.instance;
        i.getClass();
        jVar2.f140836g = i;
        jVar2.f140830a |= 4;
        new C90873ag(((C108013bm) this.f306246b.mo27525b()).mo96353D((C53658j) gVar.build()), this.f306256n, "updateClientState", C109949z.f306359a).mo85223a(new C109905aa(jVar));
        if (!TextUtils.isEmpty(str)) {
            int a = C53657i.m86881a(jVar.f140835f);
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 3) {
                m183060K(str, 22);
            } else if (i2 == 4 || i2 == 6) {
                m183060K(str, 5);
            }
        }
    }

    /* renamed from: j */
    public final void mo98237j() {
        C53653e eVar = (C53653e) C53654f.f140821e.createBuilder();
        eVar.copyOnWrite();
        C53654f fVar = (C53654f) eVar.instance;
        fVar.f140823a |= 1;
        fVar.f140824b = false;
        m183057H(eVar);
    }

    /* renamed from: jM */
    public final void mo98238jM(boolean z) {
        if (!z) {
            this.f306248d.edit().putInt("opa_upgrade_promo_notification_state", 1).putInt("opa_tooltip_promo_notification_state", 1).putInt("opa_welcome_promo_notification_state", 1).apply();
        } else if (((bm) this.f306253k.mo17428b()).n()) {
            m183056G(true);
            if (this.f306247c.mo79746e(C90037cp.f248424aE)) {
                C109889k kVar = this.f306260r;
                if (!((bm) kVar.f306188c.mo27525b()).n()) {
                    C59104x c = C109889k.f306186a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "AcquNotifServMngr");
                    ((C59052c) ((C59052c) c).mo56372aa(25476)).mo56386p(" User is not awaiting upgrade.");
                    return;
                }
                C118561t tVar = kVar.f306187b;
                C118522by byVar = C118522by.OPA_ACQUISITION_NOTIFICATION_REQUEST;
                C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                afVar.copyOnWrite();
                C118472ag agVar = (C118472ag) afVar.instance;
                agVar.f328824d = 1;
                agVar.f328821a |= 4;
                tVar.mo103754e(byVar, (C118472ag) afVar.build());
                C58976aa aaVar = C58975e.f156826a;
            }
        }
    }

    /* renamed from: k */
    public final void mo98239k() {
        C53653e eVar = (C53653e) C53654f.f140821e.createBuilder();
        eVar.copyOnWrite();
        C53654f fVar = (C53654f) eVar.instance;
        fVar.f140823a |= 2;
        fVar.f140825c = true;
        m183057H(eVar);
    }

    /* renamed from: l */
    public final void mo98240l(long j) {
        if (this.f306247c.mo79746e(C90014bt.f247623ke)) {
            SecureRandom secureRandom = new SecureRandom();
            long a = this.f306247c.mo79743a(C90014bt.f247471hl);
            int a2 = (int) this.f306247c.mo79743a(C90014bt.f247470hk);
            int a3 = (int) this.f306247c.mo79743a(C90014bt.f247469hj);
            int a4 = (int) this.f306247c.mo79743a(C90014bt.f247468hi);
            long b = this.f306249e.mo26870b();
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(b + j);
            int i = instance.get(11);
            if (i < ((int) a) || i >= a2) {
                if (i >= a2) {
                    instance.add(5, 1);
                }
                instance.set(11, a3 + secureRandom.nextInt(a4 - a3));
                j = instance.getTimeInMillis() - b;
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        C118522by byVar = C118522by.OPA_UPGRADE_PROMO_NOTIFICATION;
        long millis = TimeUnit.MINUTES.toMillis(10);
        C118561t tVar = this.f306257o;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a = 1 | agVar.f328821a;
        agVar.f328822b = j;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328821a |= 2;
        agVar2.f328823c = millis;
        Integer b2 = tVar.mo103751b(byVar, (C118472ag) afVar.build());
        if (b2 != null) {
            this.f306248d.edit().putInt("opa_multi_day_upgrade_notification_task_id", b2.intValue()).putLong("opa_multi_day_upgrade_notification_schedule_timestamp", this.f306249e.mo26870b() + j).apply();
            return;
        }
        C59104x c = f306243a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OpaNotificationMrgImpl");
        ((C59052c) ((C59052c) c).mo56372aa(25448)).mo56386p("Failed to schedule multi-day upgrade promo notification");
    }

    /* renamed from: m */
    public final void mo98241m() {
        mo98253y(C118522by.OPA_TOOLTIP_PROMO_NOTIFICATION, TimeUnit.HOURS.toMillis(this.f306247c.mo79743a(C90014bt.f247705mG)));
    }

    /* renamed from: n */
    public final void mo98242n() {
        this.f306248d.edit().putBoolean("opa_launched_from_lph_since_upgrade", true).apply();
        mo98243o(1, 1);
    }

    /* renamed from: p */
    public final boolean mo98244p() {
        return this.f306248d.getBoolean("opa_launched_from_lph_since_upgrade", false);
    }

    /* renamed from: q */
    public final boolean mo98245q() {
        if (this.f306247c.mo79746e(C90037cp.f248424aE) || !this.f306247c.mo79746e(C90014bt.f247268du) || !this.f306247c.mo79746e(C90037cp.f248430aK) || !((bm) this.f306253k.mo17428b()).n() || !((bm) this.f306253k.mo17428b()).w() || ((C85651bb) this.f306259q.mo27525b()).mo79139L() || this.f306248d.getBoolean("opa_user_turned_off_multiday_notification", false) || ((int) this.f306247c.mo79743a(C90014bt.f247472hm)) - this.f306248d.getInt("opa_multi_day_upgrade_promo_notification_count", 0) <= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo98246r() {
        int i = this.f306248d.getInt("opa_tooltip_promo_notification_count", 0);
        if (!((bm) this.f306253k.mo17428b()).u() || !((bm) this.f306253k.mo17428b()).w() || !((bm) this.f306253k.mo17428b()).m() || !((bm) this.f306253k.mo17428b()).l() || ((C85651bb) this.f306259q.mo27525b()).mo79139L() || mo98244p() || ((long) i) >= this.f306247c.mo79743a(C90014bt.f247704mF)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final boolean mo98247s(boolean z, int i) {
        int i2;
        if (!this.f306247c.mo79746e(C90037cp.f248424aE) && this.f306247c.mo79746e(C90037cp.f248430aK) && ((bm) this.f306253k.mo17428b()).n() && ((bm) this.f306253k.mo17428b()).w() && mo98229b(4, -1) != 2 && mo98229b(8, -1) != 2) {
            long j = this.f306248d.getLong("opa_upgrade_promo_notification_timestamp", 0);
            long millis = TimeUnit.HOURS.toMillis(24);
            if (m183059J()) {
                i2 = this.f306248d.getInt("opa_upgrade_promo_notification_count_when_upgrading", 0);
            } else {
                i2 = this.f306248d.getInt("opa_upgrade_promo_notification_count", 0);
            }
            if (j < this.f306249e.mo26870b() - millis && i2 < m183061z() && !((C85651bb) this.f306259q.mo27525b()).mo79139L()) {
                if (!z || i != 2) {
                    if (i == 3) {
                        return this.f306247c.mo79746e(C90014bt.f247325ey);
                    }
                    return true;
                } else if (((bm) this.f306253k.mo17428b()).s()) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: t */
    public final Notification mo98248t() {
        Pair pair;
        PendingIntent service = PendingIntent.getService(this.f306252j, 0, m183051B("com.google.android.search.core.action.OPA_NOTIFICATION_TAPPED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 4), 335544320);
        PendingIntent service2 = PendingIntent.getService(this.f306252j, 0, m183051B("com.google.android.search.core.action.NOTIFICATION_DISMISSED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 32), 335544320);
        if (this.f306248d.getInt("opa_upgrade_promo_notification_trigger", 0) == 2) {
            pair = Pair.create(this.f306252j.getResources().getString(R.string.opa_voicesearch_upgrade_promo_notification_title), this.f306252j.getResources().getString(R.string.opa_voicesearch_upgrade_promo_notification_content));
        } else {
            char J = m183059J();
            pair = Pair.create(this.f306252j.getResources().getStringArray(R.array.opa_upgrade_promo_notification_title)[J], this.f306252j.getResources().getStringArray(R.array.opa_upgrade_promo_notification_content)[J]);
        }
        C1839z C = m183052C();
        C.f5685e = C1839z.m5037c((CharSequence) pair.first);
        C.f5686f = C1839z.m5037c((CharSequence) pair.second);
        C.f5687g = service;
        C.f5679J.deleteIntent = service2;
        C.f5690j = 0;
        return C.mo5013a();
    }

    /* renamed from: u */
    public final PendingIntent mo98249u(C28292j jVar) {
        return mo98250v(jVar, -1);
    }

    /* renamed from: v */
    public final PendingIntent mo98250v(C28292j jVar, long j) {
        Intent putExtra = m183051B("com.google.android.search.core.action.OPA_NOTIFICATION_DISMISSED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 128);
        if (j > 0) {
            putExtra.putExtra("opa-nga-auto-dismiss-timestamp", j);
        }
        m183054E(putExtra, jVar);
        return PendingIntent.getService(this.f306252j, 0, putExtra, 335544320);
    }

    /* renamed from: w */
    public final void mo98251w(String str, int i) {
        m183060K(str, i);
    }

    /* renamed from: x */
    public final void mo98252x(int i, int i2) {
        if (i2 != 1) {
            this.f306248d.edit().putInt("opa_upgrade_promo_notification_trigger", i2 - 1).apply();
        }
        mo98243o(4, i);
        if (this.f306247c.mo79746e(C90014bt.f247268du) && i != 1) {
            long j = this.f306248d.getLong("opa_multi_day_upgrade_notification_schedule_timestamp", 0) - this.f306249e.mo26870b();
            long millis = TimeUnit.HOURS.toMillis(24);
            if (j > 0 && j < millis) {
                int i3 = this.f306248d.getInt("opa_multi_day_upgrade_notification_task_id", 0);
                if (i3 != 0) {
                    this.f306257o.mo103753d(i3);
                } else {
                    C59104x c = f306243a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "OpaNotificationMrgImpl");
                    ((C59052c) ((C59052c) c).mo56372aa(25454)).mo56386p("Failed to find task ID of scheduled non-exclusive task");
                }
                mo98240l(millis);
            }
        }
    }

    /* renamed from: y */
    public final void mo98253y(C118522by byVar, long j) {
        C58976aa aaVar = C58975e.f156826a;
        long millis = TimeUnit.MINUTES.toMillis(10);
        C118561t tVar = this.f306257o;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = j;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328821a |= 2;
        agVar2.f328823c = millis;
        if (!tVar.mo103754e(byVar, (C118472ag) afVar.build())) {
            C59104x c = f306243a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpaNotificationMrgImpl");
            ((C59052c) ((C59052c) c).mo56372aa(25446)).mo56389s("Failed to schedule exclusive background task: %s", byVar);
        }
    }

    /* renamed from: o */
    public final void mo98243o(int i, int i2) {
        String str;
        int i3;
        String str2;
        if (i == 1) {
            i3 = (int) this.f306247c.mo79743a(C90014bt.f247704mF);
            str2 = "opa_tooltip_promo_notification_state";
            str = "opa_tooltip_promo_notification_count";
        } else if (i == 4) {
            str = true != m183059J() ? "opa_upgrade_promo_notification_count" : "opa_upgrade_promo_notification_count_when_upgrading";
            i3 = m183061z();
            str2 = "opa_upgrade_promo_notification_state";
        } else if (i == 8) {
            i3 = (int) this.f306247c.mo79743a(C90014bt.f247472hm);
            str2 = "opa_multi_day_upgrade_promo_notification_state";
            str = "opa_multi_day_upgrade_promo_notification_count";
        } else if (i == 16) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        } else if (i == 32) {
            m183055F(i, i2);
            return;
        } else if (i != 64) {
            C59104x d = f306243a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaNotificationMrgImpl");
            ((C59052c) ((C59052c) d).mo56372aa(25449)).mo56387q("Can't set notification state for unknown notification type: %d", i);
            int i4 = C90755l.f253831a;
            return;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            return;
        }
        int i5 = this.f306248d.getInt(str2, -1);
        if (i5 == i2) {
            C58976aa aaVar3 = C58975e.f156826a;
        } else if (!m183058I(i5) || !m183058I(i2)) {
            SharedPreferences.Editor edit = this.f306248d.edit();
            edit.putInt(str2, i2);
            if (i2 == 2) {
                boolean b = C1793aj.m4937b(this.f306258p.f5622a);
                C58976aa aaVar4 = C58975e.f156826a;
                if (b) {
                    C118522by byVar = C118522by.UNKNOWN;
                    this.f306257o.mo103752c(C118522by.OPA_NOTIFICATION_STATUS_CHECK);
                    mo98253y(C118522by.OPA_NOTIFICATION_STATUS_CHECK, TimeUnit.HOURS.toMillis(this.f306247c.mo79743a(C90014bt.f247451hR)));
                }
            } else if (i2 == 3) {
                if (i != 4) {
                    if (i == 8) {
                        i = 8;
                    }
                    m183053D(edit, str);
                }
                edit.putLong("opa_upgrade_promo_notification_timestamp", this.f306249e.mo26870b());
                m183053D(edit, str);
            } else if (i2 == 4 || i2 == 1) {
                if (i != 4) {
                    if (i == 8) {
                        i = 8;
                    }
                    if (i != 8 || i == 4) {
                        m183053D(edit, str);
                    } else {
                        edit.putInt(str, i3);
                    }
                }
                edit.putLong("opa_upgrade_promo_notification_timestamp", this.f306249e.mo26870b());
                if (i != 8) {
                }
                m183053D(edit, str);
            }
            if (i2 != 1) {
                m183055F(i, i2);
            }
            edit.apply();
        } else {
            C58976aa aaVar5 = C58975e.f156826a;
        }
    }

    /* renamed from: h */
    public final void mo98235h(int i) {
        C109920ap apVar;
        int i2 = i;
        char c = 1;
        if (i2 == 1) {
            C58976aa aaVar = C58975e.f156826a;
            C1800aq aqVar = this.f306258p;
            PendingIntent activity = PendingIntent.getActivity(this.f306252j, 0, C87566i.m142322u(this.f306252j, true), 201326592);
            PendingIntent service = PendingIntent.getService(this.f306252j, 0, m183051B("com.google.android.search.core.action.OPA_NOTIFICATION_DISMISSED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 1), 201326592);
            String[] stringArray = this.f306252j.getResources().getStringArray(R.array.opa_tooltip_promo_notification_title);
            String[] stringArray2 = this.f306252j.getResources().getStringArray(R.array.opa_tooltip_promo_notification_content);
            if (stringArray.length <= 1 || stringArray2.length <= 1) {
                c = 0;
            }
            C1839z C = m183052C();
            C.f5685e = C1839z.m5037c(stringArray[c]);
            C.f5686f = C1839z.m5037c(stringArray2[c]);
            C.f5687g = activity;
            C.f5679J.deleteIntent = service;
            C.f5690j = 0;
            aqVar.mo5003b("op", C89885b.OKHTTP_HTTP_PROXY_AUTH_VALUE, C.mo5013a());
        } else if (i2 == 8) {
            C58976aa aaVar2 = C58975e.f156826a;
            C1800aq aqVar2 = this.f306258p;
            int A = m183050A();
            String[] stringArray3 = this.f306252j.getResources().getStringArray(R.array.opa_multi_day_upgrade_promo_notification_title);
            String[] stringArray4 = this.f306252j.getResources().getStringArray(R.array.opa_multi_day_upgrade_promo_notification_content);
            if (!this.f306247c.mo79746e(C90014bt.f247269dv) || A >= stringArray3.length || A >= stringArray4.length) {
                int[] intArray = this.f306252j.getResources().getIntArray(R.array.opa_multi_day_upgrade_promo_notification_vpid);
                C109919ao aoVar = (C109919ao) C109920ap.f306268h.createBuilder();
                String str = stringArray3[A];
                aoVar.copyOnWrite();
                C109920ap apVar2 = (C109920ap) aoVar.instance;
                str.getClass();
                apVar2.f306270a |= 1;
                apVar2.f306271b = str;
                String str2 = stringArray4[A];
                aoVar.copyOnWrite();
                C109920ap apVar3 = (C109920ap) aoVar.instance;
                str2.getClass();
                apVar3.f306270a |= 2;
                apVar3.f306272c = str2;
                int i3 = intArray[A];
                aoVar.copyOnWrite();
                C109920ap apVar4 = (C109920ap) aoVar.instance;
                apVar4.f306270a |= 4;
                apVar4.f306273d = i3;
                apVar = (C109920ap) aoVar.build();
            } else {
                C109919ao aoVar2 = (C109919ao) C109920ap.f306268h.createBuilder();
                String str3 = stringArray3[A];
                aoVar2.copyOnWrite();
                C109920ap apVar5 = (C109920ap) aoVar2.instance;
                str3.getClass();
                apVar5.f306270a |= 1;
                apVar5.f306271b = str3;
                String str4 = stringArray4[A];
                aoVar2.copyOnWrite();
                C109920ap apVar6 = (C109920ap) aoVar2.instance;
                str4.getClass();
                apVar6.f306270a |= 2;
                apVar6.f306272c = str4;
                aoVar2.copyOnWrite();
                C109920ap apVar7 = (C109920ap) aoVar2.instance;
                apVar7.f306270a |= 4;
                apVar7.f306273d = 0;
                apVar = (C109920ap) aoVar2.build();
            }
            PendingIntent service2 = PendingIntent.getService(this.f306252j, 0, m183051B("com.google.android.search.core.action.OPA_NOTIFICATION_TAPPED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 8).putExtra("value_prop_id", apVar.f306273d), 201326592);
            PendingIntent service3 = PendingIntent.getService(this.f306252j, 0, m183051B("com.google.android.search.core.action.OPA_NOTIFICATION_DISMISSED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 8), 201326592);
            PendingIntent service4 = PendingIntent.getService(this.f306252j, 0, m183051B("com.google.android.search.core.action.OPA_NOTIFICATION_ACTION_PRESSED").putExtra("com.google.android.search.core.extra.NOTIFICATION_ACTION_FLAG", 1).putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 8), 201326592);
            C1839z C2 = m183052C();
            C2.f5685e = C1839z.m5037c(apVar.f306271b);
            C2.f5686f = C1839z.m5037c(apVar.f306272c);
            C2.f5687g = service2;
            C2.f5679J.deleteIntent = service3;
            C2.mo5016e(0, this.f306252j.getResources().getText(R.string.opa_pre_upgrade_notifs_disable_text), service4);
            C2.f5690j = 0;
            aqVar2.mo5003b("op", C89885b.OKHTTP_HTTP_PROXY_AUTH_VALUE, C2.mo5013a());
        } else if (i2 != 32) {
            C59104x d = f306243a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaNotificationMrgImpl");
            ((C59052c) ((C59052c) d).mo56372aa(25441)).mo56387q("Can't post notification for type: %d", i2);
            int i4 = C90755l.f253831a;
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            C1800aq aqVar3 = this.f306258p;
            PendingIntent service5 = PendingIntent.getService(this.f306252j, 0, m183051B("com.google.android.search.core.action.OPA_NOTIFICATION_TAPPED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 32), 335544320);
            PendingIntent service6 = PendingIntent.getService(this.f306252j, 0, m183051B("com.google.android.search.core.action.OPA_NOTIFICATION_DISMISSED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 32), 201326592);
            C1839z C3 = m183052C();
            C3.f5685e = C1839z.m5037c(this.f306252j.getResources().getString(R.string.learn_opa_notification_title));
            C3.f5686f = C1839z.m5037c(this.f306252j.getResources().getString(R.string.learn_opa_notification_content));
            C3.f5687g = service5;
            C3.f5679J.deleteIntent = service6;
            aqVar3.mo5003b("op", C89885b.OKHTTP_HTTP_PROXY_AUTH_VALUE, C3.mo5013a());
        }
    }
}

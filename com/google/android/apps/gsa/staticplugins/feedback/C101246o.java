package com.google.android.apps.gsa.staticplugins.feedback;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.RemoteException;
import android.view.ContextThemeWrapper;
import com.google.android.apps.gsa.search.shared.multiuser.C87605h;
import com.google.android.apps.gsa.search.shared.multiuser.C87609l;
import com.google.android.apps.gsa.search.shared.multiuser.C87613p;
import com.google.android.apps.gsa.search.shared.multiuser.C87616s;
import com.google.android.apps.gsa.search.shared.multiuser.C87618u;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90466h;
import com.google.android.apps.gsa.shared.p7129r.C90468j;
import com.google.android.apps.gsa.shared.p7129r.C90469k;
import com.google.android.apps.gsa.shared.p7129r.C90473o;
import com.google.android.apps.gsa.shared.util.C91070p;
import com.google.android.apps.gsa.shared.util.debug.C91027k;
import com.google.android.apps.gsa.shared.util.debug.FeedbackData;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59315ac;
import com.google.common.p4552o.C59796fx;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60852cf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p375ai.p378b.C7642eo;
import dagger.C68214a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.o */
/* compiled from: PG */
public final class C101246o extends C90461c implements C90469k, C90473o {

    /* renamed from: z */
    public static final C59071e f282539z = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.feedback.o");

    /* renamed from: A */
    public final Context f282540A;

    /* renamed from: B */
    public Activity f282541B;

    /* renamed from: C */
    public boolean f282542C;

    /* renamed from: D */
    public final C90466h f282543D;

    /* renamed from: E */
    public final AccountManager f282544E;

    /* renamed from: F */
    public final boolean f282545F;

    /* renamed from: G */
    public final C87618u f282546G;

    /* renamed from: H */
    public final C69464a f282547H;

    /* renamed from: I */
    public final C69464a f282548I;

    /* renamed from: J */
    public final C68214a f282549J;

    /* renamed from: K */
    private final C91027k f282550K;

    /* renamed from: L */
    private final C69464a f282551L;

    /* renamed from: M */
    private final C90468j f282552M;

    /* renamed from: N */
    private final C68214a f282553N;

    /* renamed from: O */
    private final C68214a f282554O;

    /* renamed from: P */
    private final C22871g f282555P;

    /* renamed from: Q */
    private final C22871g f282556Q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C101246o(android.app.Activity r16, com.google.android.apps.gsa.shared.p7129r.C90466h r17, com.google.android.apps.gsa.shared.p7129r.C90461c r18, com.google.android.apps.gsa.search.shared.multiuser.C87618u r19, p5460g.p5461a.C69464a r20, p5460g.p5461a.C69464a r21, com.google.android.libraries.gcoreclient.p1782o.p1783a.C21590b r22, com.google.android.libraries.gcoreclient.p1782o.p1783a.C21593e r23, com.google.android.libraries.gcoreclient.p1782o.p1783a.C21594f r24, com.google.android.apps.gsa.shared.p7129r.C90468j r25, com.google.android.apps.gsa.shared.util.debug.C91027k r26, dagger.C68214a r27, p5460g.p5461a.C69464a r28, dagger.C68214a r29, com.google.android.libraries.gsa.p1876k.C22871g r30, com.google.android.libraries.gsa.p1876k.C22871g r31, dagger.C68214a r32) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.f282541B = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.feedback.C101246o.<init>(android.app.Activity, com.google.android.apps.gsa.shared.r.h, com.google.android.apps.gsa.shared.r.c, com.google.android.apps.gsa.search.shared.multiuser.u, g.a.a, g.a.a, com.google.android.libraries.gcoreclient.o.a.b, com.google.android.libraries.gcoreclient.o.a.e, com.google.android.libraries.gcoreclient.o.a.f, com.google.android.apps.gsa.shared.r.j, com.google.android.apps.gsa.shared.util.debug.k, dagger.a, g.a.a, dagger.a, com.google.android.libraries.gsa.k.g, com.google.android.libraries.gsa.k.g, dagger.a):void");
    }

    /* renamed from: k */
    private final Account m167483k() {
        C58838bb.m90883r(this.f282544E != null);
        for (Account account : this.f282544E.getAccountsByType("com.google")) {
            if (account.name.endsWith("@google.com")) {
                return account;
            }
        }
        return null;
    }

    /* renamed from: l */
    private static void m167484l(Canvas canvas, int i, int i2, int i3, Paint paint, Paint paint2) {
        int i4 = i;
        int i5 = i2;
        int i6 = i4 + i3;
        canvas.drawRect(0.0f, (float) i4, (float) i5, (float) i6, paint);
        canvas.drawRect(1.0f, (float) (i4 + 1), (float) (i5 - 1), (float) (i6 - 1), paint2);
    }

    /* renamed from: a */
    public final void mo84222a(boolean z, int i) {
        mo92191i(mo92188f(z, i), z, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Account mo92187e() {
        C58838bb.m90883r(this.f282544E != null);
        Account k = m167483k();
        return k != null ? k : this.f252691c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final FeedbackData mo92188f(boolean z, int i) {
        String str;
        FeedbackData feedbackData;
        Bitmap bitmap;
        int i2;
        int i3;
        Paint paint;
        Paint paint2;
        float f;
        boolean z2 = z;
        if (this.f252707s != 0) {
            mo84200d(this.f282540A.getResources().getString(R.string.feedback_entrypoint), this.f282540A.getResources().getString(this.f252707s));
        }
        int i4 = 0;
        try {
            long b = ((C21370a) this.f282553N.mo27525b()).mo26870b() - this.f282540A.getPackageManager().getPackageInfo(this.f282540A.getPackageName(), 0).lastUpdateTime;
            C58976aa aaVar = C58975e.f156826a;
            if (b > 0) {
                mo84200d("time_since_last_upgrade_ms", String.valueOf(b));
            }
        } catch (Exception e) {
            C59104x d = f282539z.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SendGoogleFeedback");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(19925)).mo56386p("setting time since last upgrade PSD failed.");
        }
        C91018d.m148680c();
        Account account = this.f252691c;
        if (this.f252701m && account != null) {
            mo84199c("google_app_discover", ((C101250s) this.f282554O.mo27525b()).mo92194a(account));
        }
        if (i == 1) {
            try {
                String g = mo92189g(false);
                String g2 = mo92189g(true);
                if (!(g == null || g2 == null)) {
                    this.f252694f = g;
                    this.f252695g = g2;
                }
            } finally {
            }
        }
        if (z2) {
            str = this.f252695g;
        } else {
            str = this.f252694f;
        }
        Bitmap bitmap2 = null;
        if (str == null) {
            feedbackData = this.f282550K.mo85306a(this.f252710v, this.f252711w, false, z2);
        } else {
            feedbackData = new FeedbackData(str, (C59796fx) null, this.f252710v, this.f252711w);
        }
        if (this.f252699k || !this.f252709u.isEmpty()) {
            Bitmap a = this.f252699k ? this.f282552M.mo84218a(this.f252689a, this.f282541B, this.f252705q) : null;
            if (!this.f252709u.isEmpty()) {
                if (a != null) {
                    i3 = a.getWidth() + 2;
                    i2 = a.getHeight() + 2;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
                for (Bitmap bitmap3 : this.f252709u) {
                    i3 = Math.max(i3, bitmap3.getWidth() + 2);
                    i2 += bitmap3.getHeight() + 2;
                }
                Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint3 = new Paint();
                paint3.setColor(-12303292);
                Paint paint4 = new Paint();
                paint4.setColor(this.f252705q);
                if (a != null) {
                    f = 1.0f;
                    paint2 = paint4;
                    paint = paint3;
                    m167484l(canvas, 0, a.getWidth() + 2, a.getHeight() + 2, paint3, paint2);
                    canvas.drawBitmap(a, 1.0f, 1.0f, (Paint) null);
                    i4 = a.getHeight() + 2;
                } else {
                    paint2 = paint4;
                    paint = paint3;
                    f = 1.0f;
                }
                for (Bitmap bitmap4 : this.f252709u) {
                    Bitmap bitmap5 = a;
                    Bitmap bitmap6 = bitmap4;
                    m167484l(canvas, i4, bitmap4.getWidth() + 2, bitmap4.getHeight() + 2, paint, paint2);
                    canvas.drawBitmap(bitmap6, f, (float) (i4 + 1), (Paint) null);
                    i4 += bitmap6.getHeight() + 2;
                    a = bitmap5;
                }
                bitmap = a;
                Point b2 = C90468j.m147188b(i3, i2);
                if (b2 != null) {
                    bitmap2 = Bitmap.createScaledBitmap(createBitmap, b2.x, b2.y, true);
                } else {
                    bitmap2 = createBitmap;
                }
            } else {
                bitmap = a;
            }
            feedbackData.f254178d = bitmap2 != null ? bitmap2 : bitmap;
        }
        feedbackData.f254177c = this.f252693e;
        feedbackData.f254180f = this.f252713y;
        return feedbackData;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final String mo92189g(boolean z) {
        File file = new File(this.f282540A.getCacheDir(), true != z ? "shake_redacted_state_dump" : "shake_nonredacted_state_dump");
        if (!file.exists()) {
            return null;
        }
        try {
            return new String(new C59315ac(file).mo56803a(), "UTF-8");
        } catch (IOException e) {
            C59104x c = f282539z.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SendGoogleFeedback");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19918)).mo56386p("Reading shake dump failed because of an exception.");
            return null;
        }
    }

    /* renamed from: h */
    public final void mo92190h() {
        if (this.f252698j) {
            Context context = this.f282540A;
            C7642eo eoVar = C7642eo.SEND_FEEDBACK_OVERLAY;
            Intent intent = new Intent("com.google.android.apps.gsa.sidekick.ENTRY_SYNC_USER_REFRESH");
            intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.sidekick.main.entry.EntriesRefreshIntentService");
            intent.putExtra("com.google.android.apps.sidekick.TRACE", eoVar.f26533bC);
            intent.putExtra("com.google.android.apps.sidekick.PAGINATION", true);
            intent.putExtra("com.google.android.apps.sidekick.SAVE_CALL_LOG", true);
            intent.putExtra("com.google.android.apps.sidekick.SKIP_IF_OPTED_OUT", true);
            C91070p.m148777b(context, intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo92191i(FeedbackData feedbackData, boolean z, boolean z2) {
        C60870cx cxVar;
        SettableFuture settableFuture;
        if (m167483k() == null) {
            C22871g gVar = this.f282555P;
            C87616s sVar = new C87616s(this.f282546G);
            if (!sVar.mo81749b()) {
                cxVar = C60856cj.m92900i(false);
            } else {
                try {
                    C87613p a = this.f282546G.mo81753a();
                    if (a != null) {
                        C58976aa aaVar = C58975e.f156826a;
                        C87609l lVar = C87609l.f236675a;
                        SettableFuture settableFuture2 = new SettableFuture();
                        a.mo81746a(lVar, new C87605h(settableFuture2));
                        settableFuture = settableFuture2;
                        C60870cx e = C90877ak.m148471e(settableFuture, 5, TimeUnit.SECONDS, this.f282556Q);
                        C60852cf b = C60856cj.m92893b(e);
                        Objects.requireNonNull(sVar);
                        b.mo57336c(new C101241j(sVar), new C101240i(this.f282555P));
                        cxVar = C60922j.m93044g(C60846c.m92878g(C60838bs.m92859i(e), Throwable.class, C101237f.f282525a, C60826bg.f164896a), C101238g.f282526a, C60826bg.f164896a);
                    } else {
                        throw new RemoteException("Not connected");
                    }
                } catch (RemoteException e2) {
                    settableFuture = C60856cj.m92899h(e2);
                }
            }
            C90877ak.m148481o(gVar.mo28209i(cxVar, "SendGoogleFeedback: start feedback activity after checking work profile", new C101239h(this, feedbackData, z, z2)), "SendGoogleFeedback", "SendGoogleFeedback: start feedback activity after checking work profile success", "SendGoogleFeedback: start feedback activity after checking work profile failure");
        } else {
            mo92192j(feedbackData, z, z2);
        }
        mo92190h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ef  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92192j(com.google.android.apps.gsa.shared.util.debug.FeedbackData r12, boolean r13, boolean r14) {
        /*
            r11 = this;
            java.lang.String r0 = "SendGoogleFeedback"
            android.accounts.Account r1 = r11.mo92187e()
            r2 = 0
            if (r13 == 0) goto L_0x002f
            boolean r13 = r11.f282542C
            if (r13 == 0) goto L_0x002f
            com.google.common.o.uf r13 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.common.o.tz r13 = (com.google.common.p4552o.C60548tz) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r3 = r13.instance
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            int r4 = r3.f164093a
            r4 = r4 | 2
            r3.f164093a = r4
            r4 = 451(0x1c3, float:6.32E-43)
            r3.f164258m = r4
            com.google.protobuf.bv r13 = r13.build()
            com.google.common.o.uf r13 = (com.google.common.p4552o.C60555uf) r13
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r13, r2, r2, r2)
        L_0x002f:
            com.google.common.o.uf r13 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.common.o.tz r13 = (com.google.common.p4552o.C60548tz) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r3 = r13.instance
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            int r4 = r3.f164093a
            r4 = r4 | 2
            r3.f164093a = r4
            r4 = 459(0x1cb, float:6.43E-43)
            r3.f164258m = r4
            com.google.common.o.fx r3 = r12.f254176b
            if (r3 == 0) goto L_0x005c
            r13.copyOnWrite()
            com.google.protobuf.bv r4 = r13.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            r4.f164138as = r3
            int r3 = r4.f164249d
            r5 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 | r5
            r4.f164249d = r3
        L_0x005c:
            com.google.protobuf.bv r13 = r13.build()
            com.google.common.o.uf r13 = (com.google.common.p4552o.C60555uf) r13
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r13, r2, r2, r2)
            com.google.android.gms.feedback.l r13 = new com.google.android.gms.feedback.l
            android.content.Context r2 = r11.f282540A
            r13.<init>(r2)
            com.google.android.apps.gsa.staticplugins.feedback.m r2 = new com.google.android.apps.gsa.staticplugins.feedback.m
            r2.<init>(r12, r14)
            r14 = 1
            r13.mo119742b(r14)
            r13.f390628g = r2
            r2 = 0
            android.content.Context r3 = r11.f282540A     // Catch:{ NameNotFoundException -> 0x00b0 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00b0 }
            java.lang.String r4 = "com.google.android.gms"
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x00b0 }
            com.google.common.f.e r4 = f282539z     // Catch:{ NameNotFoundException -> 0x00b0 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ NameNotFoundException -> 0x00b0 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ NameNotFoundException -> 0x00b0 }
            r4.mo56378ag(r5, r0)     // Catch:{ NameNotFoundException -> 0x00b0 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ NameNotFoundException -> 0x00b0 }
            r5 = 19931(0x4ddb, float:2.7929E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ NameNotFoundException -> 0x00b0 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ NameNotFoundException -> 0x00b0 }
            java.lang.String r5 = "gms ver: %d"
            int r6 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x00b0 }
            r4.mo56387q(r5, r6)     // Catch:{ NameNotFoundException -> 0x00b0 }
            int r0 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x00b0 }
            long r3 = (long) r0
            r5 = 222154000(0xd3dcd10, double:1.097586595E-315)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00c3
            r8 = 1
            r9 = 1
            r10 = 1
            goto L_0x00c6
        L_0x00b0:
            r14 = move-exception
            com.google.common.f.e r3 = f282539z
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r0)
            java.lang.String r0 = "cannot find gms."
            r4 = 19932(0x4ddc, float:2.793E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r14)).mo56372aa(r4)).mo56386p(r0)
        L_0x00c3:
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x00c6:
            com.google.android.gms.feedback.LogOptions r14 = new com.google.android.gms.feedback.LogOptions
            r6 = 0
            r7 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r13.f390627f = r14
            android.graphics.Bitmap r14 = r12.f254178d
            if (r14 == 0) goto L_0x00d7
            r13.mo119744d(r14)
        L_0x00d7:
            if (r1 == 0) goto L_0x00dd
            java.lang.String r14 = r1.name
            r13.f390622a = r14
        L_0x00dd:
            java.lang.String r14 = r12.f254177c
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x00e7
            r13.f390624c = r14
        L_0x00e7:
            java.lang.String r12 = r12.f254180f
            boolean r14 = android.text.TextUtils.isEmpty(r12)
            if (r14 != 0) goto L_0x00f1
            r13.f390623b = r12
        L_0x00f1:
            com.google.android.gms.feedback.FeedbackOptions r12 = r13.mo119741a()
            g.a.a r13 = r11.f282551L
            java.lang.Object r13 = r13.mo17428b()
            com.google.android.gms.feedback.k r13 = (com.google.android.gms.feedback.C144206k) r13
            r13.mo119740d(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.feedback.C101246o.mo92192j(com.google.android.apps.gsa.shared.util.debug.FeedbackData, boolean, boolean):void");
    }

    public C101246o(Context context, C90466h hVar, C90461c cVar, C87618u uVar, C69464a aVar, C69464a aVar2, C90468j jVar, C91027k kVar, C68214a aVar3, C69464a aVar4, C68214a aVar5, C22871g gVar, C22871g gVar2, C68214a aVar6) {
        super(cVar);
        context.getClass();
        this.f282540A = context;
        this.f282554O = aVar5;
        this.f282545F = context instanceof ContextThemeWrapper;
        this.f282543D = hVar;
        this.f282544E = (AccountManager) context.getSystemService("account");
        this.f282546G = uVar;
        this.f282551L = aVar;
        this.f282547H = aVar2;
        this.f282552M = jVar;
        this.f282550K = kVar;
        this.f282553N = aVar3;
        this.f282548I = aVar4;
        this.f282555P = gVar;
        this.f282556Q = gVar2;
        this.f282549J = aVar6;
    }
}

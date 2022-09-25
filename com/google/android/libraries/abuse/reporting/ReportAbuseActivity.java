package com.google.android.libraries.abuse.reporting;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p028c.C0125a;
import android.support.p031v4.app.C0167am;
import android.util.Pair;
import android.view.Menu;
import android.widget.Toast;
import com.google.android.gms.auth.C142915o;
import com.google.android.gms.common.C143875g;
import com.google.android.googlequicksearchbox.R;
import com.google.p335a.p336a.C6580b;
import com.google.p335a.p336a.C6586h;
import com.google.p335a.p336a.C6595q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
public class ReportAbuseActivity extends C0167am implements C146713ab, C146717af {

    /* renamed from: A */
    public String f396149A;

    /* renamed from: B */
    public String f396150B;

    /* renamed from: C */
    public String f396151C;

    /* renamed from: D */
    public HashSet f396152D;

    /* renamed from: E */
    public String f396153E;

    /* renamed from: F */
    public boolean f396154F;

    /* renamed from: G */
    public C143875g f396155G;

    /* renamed from: H */
    public C142915o f396156H;

    /* renamed from: I */
    private String f396157I;

    /* renamed from: j */
    public Context f396158j;

    /* renamed from: k */
    protected C146718ag f396159k;

    /* renamed from: l */
    public C146740i f396160l;

    /* renamed from: m */
    public Executor f396161m;

    /* renamed from: n */
    public UrlRequest.Callback f396162n;

    /* renamed from: o */
    public UrlRequest.Callback f396163o;

    /* renamed from: p */
    public UrlRequest.Callback f396164p;

    /* renamed from: q */
    public C146711a f396165q;

    /* renamed from: r */
    public boolean f396166r;

    /* renamed from: s */
    public String f396167s;

    /* renamed from: t */
    public String f396168t;

    /* renamed from: u */
    public C6586h f396169u;

    /* renamed from: v */
    public C6580b f396170v;

    /* renamed from: w */
    public boolean f396171w;

    /* renamed from: x */
    public String f396172x;

    /* renamed from: y */
    public C6595q f396173y;

    /* renamed from: z */
    public String f396174z;

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C0125a.m129b(this);
    }

    /* renamed from: j */
    public final void mo123511j() {
        new C146747p(this).execute(new Void[0]);
    }

    /* renamed from: k */
    public final void mo123512k(Exception exc, int i) {
        mo123518p(new C146743l(this, exc, i));
    }

    /* renamed from: l */
    public final void mo123513l() {
        this.f396159k.mo123546b();
    }

    /* renamed from: m */
    public final void mo123514m(int i, int i2) {
        this.f396159k.mo123514m(i, i2);
    }

    /* renamed from: n */
    public final void mo123515n(int i, int i2, String str) {
        this.f396159k.mo123515n(i, i2, str);
    }

    /* renamed from: o */
    public final void mo123516o(boolean z, int i, int i2, String str, List list) {
        if (!this.f396166r) {
            this.f396166r = true;
            Intent intent = new Intent(getIntent());
            Intent flags = intent.setFlags(intent.getFlags() & -196);
            flags.putExtra("report_submitted", z);
            if (str != null) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri parse = Uri.parse(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        String str2 = (String) pair.second;
                        if (((String) pair.second).equals("ITEM_ID")) {
                            str2 = this.f396174z;
                        }
                        parse = parse.buildUpon().appendQueryParameter((String) pair.first, str2).build();
                    }
                }
                if (parse.getScheme() == null) {
                    parse = parse.buildUpon().scheme("https").build();
                }
                intent2.setData(parse);
                startActivity(intent2);
            }
            if (i >= 0) {
                flags.putExtra("reported_abuse_type", i);
            } else {
                flags.putExtra("reported_abuse_type", -1);
            }
            if (i2 >= 0) {
                flags.putExtra("additional_action", i2);
            } else {
                flags.putExtra("additional_action", -1);
            }
            setResult(-1, flags);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0) {
            Toast.makeText(this.f396158j, getString(R.string.uraw_play_services_error_text), 0).show();
            finish();
        } else if (i == 1000) {
            mo123511j();
        } else if (i == 1001) {
            new C146749r(this).execute(new Void[0]);
        } else if (i == 1003) {
            mo123520r();
        } else if (i == 1002) {
            mo123519q(this.f396170v);
        }
    }

    public final void onBackPressed() {
        int i;
        C146718ag agVar = this.f396159k;
        if (agVar == null || !agVar.f396214c.isVisible()) {
            this.f396166r = true;
            mo123516o(false, -1, -1, (String) null, (List) null);
            return;
        }
        C146718ag agVar2 = this.f396159k;
        ReportAbuseCardConfigParcel c = agVar2.f396215d.mo123527c();
        if (c == null || (i = c.f396180f) == 0) {
            agVar2.mo123546b();
        } else {
            agVar2.mo123514m(1, i);
        }
    }

    /* JADX WARNING: type inference failed for: r3v29, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            r0 = 1
            r11.requestWindowFeature(r0)
            android.view.Window r1 = r11.getWindow()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r2)
            android.view.Window r1 = r11.getWindow()
            r2 = 2131103542(0x7f060f36, float:1.7819553E38)
            int r2 = androidx.core.content.C1878d.m5128a(r11, r2)
            r1.setStatusBarColor(r2)
            android.content.Context r1 = r11.getApplicationContext()
            r11.f396158j = r1
            r1 = 0
            r11.f396166r = r1
            android.content.Intent r2 = r11.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            java.lang.String r3 = "client_environment"
            java.lang.String r3 = r2.getString(r3)
            r11.f396157I = r3
            if (r3 != 0) goto L_0x003d
            java.lang.String r3 = "prod"
            r11.f396157I = r3
        L_0x003d:
            com.google.android.libraries.at.a.a r3 = com.google.android.libraries.p1623at.p1624a.C19458a.m37144a(r11)
            java.lang.Class<com.google.android.libraries.abuse.reporting.ap> r4 = com.google.android.libraries.abuse.reporting.C146727ap.class
            java.lang.Object r3 = r3.mo24649c(r4)
            com.google.android.libraries.abuse.reporting.ap r3 = (com.google.android.libraries.abuse.reporting.C146727ap) r3
            if (r3 != 0) goto L_0x004f
            com.google.android.libraries.abuse.reporting.aq r3 = com.google.android.libraries.abuse.reporting.C146728aq.f396252a
            com.google.android.libraries.abuse.reporting.ap r3 = r3.f396253b
        L_0x004f:
            com.google.android.gms.auth.o r4 = r3.mo65070b()
            r11.f396156H = r4
            r4.getClass()
            com.google.android.gms.common.g r3 = r3.mo65069a()
            r11.f396155G = r3
            r3.getClass()
            com.google.android.libraries.at.a.a r3 = com.google.android.libraries.p1623at.p1624a.C19458a.m37144a(r11)
            java.lang.Class<com.google.android.libraries.abuse.reporting.au> r4 = com.google.android.libraries.abuse.reporting.C146732au.class
            java.lang.Object r3 = r3.mo24649c(r4)
            com.google.android.libraries.abuse.reporting.au r3 = (com.google.android.libraries.abuse.reporting.C146732au) r3
            r4 = 0
            if (r3 == 0) goto L_0x007b
            org.chromium.net.CronetEngine r5 = r3.mo123569b()
            java.util.concurrent.Executor r3 = r3.mo123568a()
            r11.f396161m = r3
            goto L_0x007c
        L_0x007b:
            r5 = r4
        L_0x007c:
            if (r5 == 0) goto L_0x0086
            com.google.android.libraries.abuse.reporting.h r3 = new com.google.android.libraries.abuse.reporting.h
            r3.<init>(r5)
            r11.f396160l = r3
            goto L_0x008d
        L_0x0086:
            com.google.android.libraries.abuse.reporting.m r3 = new com.google.android.libraries.abuse.reporting.m
            r3.<init>(r11)
            r11.f396160l = r3
        L_0x008d:
            java.util.concurrent.Executor r3 = r11.f396161m
            if (r3 != 0) goto L_0x0095
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor()
        L_0x0095:
            r11.f396161m = r3
            com.google.android.libraries.at.a.a r3 = com.google.android.libraries.p1623at.p1624a.C19458a.m37144a(r11)
            java.lang.Class<com.google.android.libraries.abuse.reporting.as> r5 = com.google.android.libraries.abuse.reporting.C146730as.class
            java.lang.Object r3 = r3.mo24649c(r5)
            com.google.android.libraries.abuse.reporting.as r3 = (com.google.android.libraries.abuse.reporting.C146730as) r3
            if (r3 == 0) goto L_0x00df
            com.google.android.libraries.abuse.reporting.f r5 = r3.mo123567b()
            com.google.android.libraries.abuse.reporting.o r6 = new com.google.android.libraries.abuse.reporting.o
            r6.<init>(r11)
            r5.f396257a = r6
            com.google.android.libraries.abuse.reporting.g r5 = r5.mo123573a()
            r11.f396162n = r5
            com.google.android.libraries.abuse.reporting.f r5 = r3.mo123567b()
            com.google.android.libraries.abuse.reporting.t r6 = new com.google.android.libraries.abuse.reporting.t
            r6.<init>(r11)
            r5.f396257a = r6
            com.google.android.libraries.abuse.reporting.g r5 = r5.mo123573a()
            r11.f396163o = r5
            com.google.android.libraries.abuse.reporting.f r5 = r3.mo123567b()
            com.google.android.libraries.abuse.reporting.w r6 = new com.google.android.libraries.abuse.reporting.w
            r6.<init>(r11)
            r5.f396257a = r6
            com.google.android.libraries.abuse.reporting.g r5 = r5.mo123573a()
            r11.f396164p = r5
            com.google.android.libraries.abuse.reporting.a r3 = r3.mo123566a()
            r11.f396165q = r3
            goto L_0x011d
        L_0x00df:
            com.google.android.libraries.abuse.reporting.f r3 = new com.google.android.libraries.abuse.reporting.f
            r3.<init>()
            com.google.android.libraries.abuse.reporting.o r5 = new com.google.android.libraries.abuse.reporting.o
            r5.<init>(r11)
            r3.f396257a = r5
            com.google.android.libraries.abuse.reporting.g r5 = r3.mo123573a()
            r11.f396162n = r5
            com.google.android.libraries.abuse.reporting.t r5 = new com.google.android.libraries.abuse.reporting.t
            r5.<init>(r11)
            r3.f396257a = r5
            com.google.android.libraries.abuse.reporting.g r5 = r3.mo123573a()
            r11.f396163o = r5
            com.google.android.libraries.abuse.reporting.w r5 = new com.google.android.libraries.abuse.reporting.w
            r5.<init>(r11)
            r3.f396257a = r5
            com.google.android.libraries.abuse.reporting.g r3 = r3.mo123573a()
            r11.f396164p = r3
            com.google.android.libraries.abuse.reporting.a r3 = new com.google.android.libraries.abuse.reporting.a
            com.google.android.gms.auth.o r6 = r11.f396156H
            android.content.Context r7 = r11.f396158j
            java.util.concurrent.Executor r8 = r11.f396161m
            com.google.android.libraries.abuse.reporting.i r9 = r11.f396160l
            java.lang.String r10 = r11.f396157I
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            r11.f396165q = r3
        L_0x011d:
            if (r12 != 0) goto L_0x0120
            goto L_0x0129
        L_0x0120:
            java.lang.String r3 = "component"
            android.os.Parcelable r3 = r12.getParcelable(r3)
            r4 = r3
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r4 = (com.google.android.libraries.abuse.reporting.ReportAbuseComponentState) r4
        L_0x0129:
            java.lang.String r3 = "REPORT_ABUSE_ACTIVITY"
            if (r2 != 0) goto L_0x0139
            java.lang.String r12 = "Missing arguments in Intent for ReportAbuseActivity"
            android.util.Log.e(r3, r12)
            r11.setResult(r1)
            r11.finish()
            return
        L_0x0139:
            java.lang.String r5 = "config_name"
            java.lang.String r5 = r2.getString(r5)
            r11.f396167s = r5
            if (r5 == 0) goto L_0x0149
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x014e
        L_0x0149:
            java.lang.String r5 = "Report Abuse Activity called with missing config name."
            android.util.Log.e(r3, r5)
        L_0x014e:
            java.lang.String r5 = "language"
            java.lang.String r5 = r2.getString(r5)
            r11.f396168t = r5
            java.lang.String r5 = "reported_item_id"
            java.lang.String r5 = r2.getString(r5)
            r11.f396174z = r5
            if (r5 == 0) goto L_0x0166
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x016b
        L_0x0166:
            java.lang.String r5 = "Report Abuse Activity called with missing reported item ID."
            android.util.Log.e(r3, r5)
        L_0x016b:
            java.lang.String r3 = "reported_content"
            java.lang.String r3 = r2.getString(r3)
            r11.f396149A = r3
            java.lang.String r3 = "no_report_mode"
            boolean r3 = r2.getBoolean(r3)
            r11.f396171w = r3
            java.lang.String r3 = "app_source"
            java.lang.String r3 = r2.getString(r3)
            r11.f396153E = r3
            java.lang.String r3 = "reporter_account_name"
            java.lang.String r3 = r2.getString(r3)
            r11.f396151C = r3
            if (r3 == 0) goto L_0x0197
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0194
            goto L_0x0197
        L_0x0194:
            r11.f396154F = r1
            goto L_0x0199
        L_0x0197:
            r11.f396154F = r0
        L_0x0199:
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r3 = "reporter_role"
            java.io.Serializable r0 = r0.getSerializableExtra(r3)
            com.google.a.a.q r0 = (com.google.p335a.p336a.C6595q) r0
            r11.f396173y = r0
            if (r0 != 0) goto L_0x01ad
            com.google.a.a.q r0 = com.google.p335a.p336a.C6595q.UNSPECIFIED
            r11.f396173y = r0
        L_0x01ad:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r11.f396152D = r0
            java.lang.String r0 = "fulfilled_requirements"
            java.lang.String[] r0 = r2.getStringArray(r0)
            if (r0 == 0) goto L_0x01ca
            int r3 = r0.length
            r5 = 0
        L_0x01be:
            if (r5 >= r3) goto L_0x01ca
            r6 = r0[r5]
            java.util.HashSet r7 = r11.f396152D
            r7.add(r6)
            int r5 = r5 + 1
            goto L_0x01be
        L_0x01ca:
            java.lang.String r0 = "sample_demo_theme"
            r3 = -1
            int r5 = r2.getInt(r0, r3)
            if (r5 == r3) goto L_0x01db
            int r0 = r2.getInt(r0)
            r11.setTheme(r0)
            goto L_0x01e1
        L_0x01db:
            r0 = 2132151131(0x7f160b5b, float:1.9944316E38)
            r11.setTheme(r0)
        L_0x01e1:
            if (r4 == 0) goto L_0x0219
            com.google.android.libraries.abuse.reporting.ag r0 = new com.google.android.libraries.abuse.reporting.ag
            android.support.v4.app.FragmentManager r1 = r11.mo545jw()
            r0.<init>(r11, r1, r4)
            r11.f396159k = r0
            java.lang.String r0 = "reporter_id"
            java.lang.String r0 = r12.getString(r0)
            r11.f396172x = r0
            java.lang.String r0 = "undo_report_id"
            java.lang.String r12 = r12.getString(r0)
            r11.f396150B = r12
            com.google.android.libraries.abuse.reporting.ag r12 = r11.f396159k
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r0 = r12.f396215d
            com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel r0 = r0.mo123527c()
            if (r0 != 0) goto L_0x020c
            r12.mo123547c()
            return
        L_0x020c:
            android.os.Handler r0 = r12.f396216e
            com.google.android.libraries.abuse.reporting.ad r1 = new com.google.android.libraries.abuse.reporting.ad
            r1.<init>(r12)
            r2 = 100
            r0.postDelayed(r1, r2)
            return
        L_0x0219:
            com.google.android.libraries.abuse.reporting.r r12 = new com.google.android.libraries.abuse.reporting.r
            r12.<init>(r11)
            java.lang.Void[] r0 = new java.lang.Void[r1]
            r12.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.reporting.ReportAbuseActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public final void onDestroy() {
        this.f396166r = true;
        C146718ag agVar = this.f396159k;
        if (agVar != null) {
            agVar.f396216e.removeCallbacksAndMessages((Object) null);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C146718ag agVar = this.f396159k;
        if (agVar != null) {
            ReportAbuseComponentState reportAbuseComponentState = agVar.f396215d;
            if (reportAbuseComponentState.f396186a != null) {
                bundle.putParcelable("component", reportAbuseComponentState);
            }
        }
        bundle.putString("reporter_id", this.f396172x);
        bundle.putString("undo_report_id", this.f396150B);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: p */
    public final void mo123518p(Runnable runnable) {
        runOnUiThread(new C146741j(this, runnable));
    }

    /* renamed from: q */
    public final void mo123519q(C6580b bVar) {
        this.f396159k.f396214c.mo123562g();
        new C146752u(this).execute(new C6580b[]{bVar});
    }

    /* renamed from: r */
    public final void mo123520r() {
        this.f396159k.f396214c.mo123562g();
        new C146755x(this).execute(new Void[0]);
    }
}

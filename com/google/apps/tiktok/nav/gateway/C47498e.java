package com.google.apps.tiktok.nav.gateway;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.apps.tiktok.nav.gateway.e */
/* compiled from: PG */
public final class C47498e {

    /* renamed from: a */
    public static final C59071e f123325a = C59071e.m91332i("com.google.apps.tiktok.nav.gateway.e");

    /* renamed from: h */
    private static final String f123326h;

    /* renamed from: b */
    public final C46439e f123327b;

    /* renamed from: c */
    public final C47506l f123328c;

    /* renamed from: d */
    public final boolean f123329d;

    /* renamed from: e */
    public final C46440f f123330e = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C47498e.f123325a.mo56225c()).mo56382g(th)).mo56372aa(54747)).mo56386p("Couldn't get redirect intent.");
            C47498e.this.mo51360b(GatewayHandler.GatewayDestination.m84513a((String) null));
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            C47498e.this.mo51360b((GatewayHandler.GatewayDestination) obj2);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: f */
    public int f123331f;

    /* renamed from: g */
    public int f123332g;

    /* renamed from: i */
    private final Activity f123333i;

    /* renamed from: j */
    private final C45987ay f123334j = new C47497d(this);

    static {
        long currentTimeMillis = System.currentTimeMillis();
        f123326h = "$GA$" + currentTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47498e(android.app.Activity r8, java.util.Map r9, p5460g.p5461a.C69464a r10, com.google.apps.tiktok.concurrent.futuresmixin.C46439e r11) {
        /*
            r7 = this;
            r7.<init>()
            com.google.apps.tiktok.nav.gateway.d r0 = new com.google.apps.tiktok.nav.gateway.d
            r0.<init>(r7)
            r7.f123334j = r0
            com.google.apps.tiktok.nav.gateway.e$1 r0 = new com.google.apps.tiktok.nav.gateway.e$1
            r0.<init>()
            r7.f123330e = r0
            r7.f123333i = r8
            r7.f123327b = r11
            android.content.Intent r11 = r8.getIntent()
            android.content.ComponentName r0 = r11.getComponent()
            r0.getClass()
            java.lang.String r1 = r0.getClassName()
            java.lang.Object r9 = r9.get(r1)
            g.a.a r9 = (p5460g.p5461a.C69464a) r9
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L_0x0045
            android.net.Uri r1 = r11.getData()
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = r11.getDataString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r2 = r11.getType()
            r11.setDataAndType(r1, r2)
        L_0x0045:
            r1 = 0
            r2 = 0
            if (r9 == 0) goto L_0x0134
            android.content.pm.PackageManager r3 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x006a }
            android.content.ComponentName r4 = r8.getComponentName()     // Catch:{ NameNotFoundException -> 0x006a }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x006a }
            android.os.Bundle r3 = r3.metaData
            if (r3 == 0) goto L_0x006b
            java.lang.String r4 = "com.google.apps.tiktok.nav.gateway.require_explicit_intent"
            boolean r3 = r3.getBoolean(r4)
            if (r3 == 0) goto L_0x006b
            java.lang.String r3 = r11.getAction()
            if (r3 != 0) goto L_0x0134
            goto L_0x00b1
        L_0x006a:
        L_0x006b:
            java.lang.String r3 = r11.getAction()
            if (r3 != 0) goto L_0x0073
            goto L_0x0134
        L_0x0073:
            java.lang.String r3 = r0.getClassName()
            android.app.Activity r4 = r7.f123333i
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.Intent r5 = r11.cloneFilter()
            android.content.Intent r5 = r5.setComponent(r2)
            r5.setSelector(r2)
            android.app.Activity r6 = r7.f123333i
            java.lang.String r6 = r6.getPackageName()
            r5.setPackage(r6)
            r6 = 131072(0x20000, float:1.83671E-40)
            java.util.List r4 = r4.queryIntentActivities(r5, r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x009b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0134
            java.lang.Object r5 = r4.next()
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            java.lang.String r5 = r5.name
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x009b
        L_0x00b1:
            m84530f(r11)
            com.google.apps.tiktok.nav.gateway.m r0 = new com.google.apps.tiktok.nav.gateway.m
            java.lang.String r2 = r8.getCallingPackage()
            r0.<init>(r11, r2)
            java.lang.Object r9 = r9.mo17428b()
            com.google.apps.tiktok.nav.gateway.GatewayHandler r9 = (com.google.apps.tiktok.nav.gateway.GatewayHandler) r9
            com.google.apps.tiktok.nav.gateway.l r9 = r9.mo20007a(r0)
            r7.f123328c = r9
            if (r9 == 0) goto L_0x0131
            com.google.common.base.ax r9 = r9.mo20004c()
            boolean r11 = r9.mo56113h()
            r7.f123329d = r11
            if (r11 == 0) goto L_0x0130
            com.google.apps.tiktok.account.api.controller.bw r8 = com.google.apps.tiktok.account.api.controller.C46013bx.m82201e(r8)
            java.lang.Object r9 = r9.mo56107c()
            com.google.apps.tiktok.nav.gateway.i r9 = (com.google.apps.tiktok.nav.gateway.C47503i) r9
            java.util.List r11 = r9.mo51355c()
            java.util.Iterator r11 = r11.iterator()
        L_0x00e9:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r0 = r11.next()
            java.lang.Class r0 = (java.lang.Class) r0
            com.google.common.b.gp r1 = r8.mo50147b()
            r1.mo55395g(r0)
            goto L_0x00e9
        L_0x00fd:
            java.lang.Object r10 = r10.mo17428b()
            com.google.apps.tiktok.account.api.controller.b r10 = (com.google.apps.tiktok.account.api.controller.C45989b) r10
            com.google.common.b.gu r11 = r9.mo51353a()
            r0 = r8
            com.google.apps.tiktok.account.api.controller.bu r0 = (com.google.apps.tiktok.account.api.controller.C46010bu) r0
            r0.f120853a = r11
            com.google.apps.tiktok.account.api.controller.bx r8 = r8.mo50146a()
            r10.mo50083f(r8)
            com.google.apps.tiktok.account.api.controller.ay r8 = r7.f123334j
            r10.mo50082e(r8)
            java.util.List r8 = r9.mo51354b()
            java.util.Iterator r8 = r8.iterator()
        L_0x0120:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0130
            java.lang.Object r9 = r8.next()
            com.google.apps.tiktok.account.api.controller.ay r9 = (com.google.apps.tiktok.account.api.controller.C45987ay) r9
            r10.mo50082e(r9)
            goto L_0x0120
        L_0x0130:
            return
        L_0x0131:
            r7.f123329d = r1
            return
        L_0x0134:
            r7.f123328c = r2
            r7.f123329d = r1
            com.google.common.f.e r8 = f123325a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.frameworks.client.a.a.b r9 = new com.google.frameworks.client.a.a.b
            com.google.frameworks.client.a.a.a r10 = com.google.frameworks.client.p4624a.p4625a.C61284a.NO_USER_DATA
            java.lang.String r11 = r0.getClassName()
            r9.<init>(r10, r11)
            java.lang.String r10 = "Missing handler for %s."
            r11 = 54748(0xd5dc, float:7.6718E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r11)).mo56389s(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.nav.gateway.C47498e.<init>(android.app.Activity, java.util.Map, g.a.a, com.google.apps.tiktok.concurrent.futuresmixin.e):void");
    }

    /* renamed from: d */
    private static void m84528d(Intent intent) {
        C58838bb.m90884s((intent.getFlags() & 195) == 0, "Redirects to external apps must not grant Uri access.");
    }

    /* renamed from: e */
    private static void m84529e(Intent intent) {
        C58838bb.m90884s(!intent.hasExtra(f123326h), "GatewayHandlers must not blindly forward all intent extras.");
    }

    /* renamed from: f */
    private static void m84530f(Intent intent) {
        String str = f123326h;
        intent.putExtra(str, str);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str2 : extras.keySet()) {
                Object obj = extras.get(str2);
                if (obj instanceof Intent) {
                    m84530f((Intent) obj);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51359a() {
        int i = this.f123331f;
        if (i != 0) {
            this.f123333i.setTheme(i);
        }
        int i2 = this.f123332g;
        if (i2 != 0) {
            this.f123333i.setContentView(i2);
        }
    }

    /* renamed from: c */
    public final void mo51361c(C47505k kVar) {
        C60870cx d = this.f123328c.mo20005d(kVar);
        if (!d.isDone()) {
            this.f123331f = this.f123328c.mo20003b();
            this.f123332g = this.f123328c.mo20002a();
            mo51359a();
        }
        this.f123327b.mo50430j(new C46438d(d), new C46436b((Object) null), this.f123330e);
    }

    /* renamed from: b */
    public final void mo51360b(GatewayHandler.GatewayDestination gatewayDestination) {
        Intent intent;
        int i = gatewayDestination.f123315a;
        boolean z = true;
        if (i == 1) {
            List<Intent> list = gatewayDestination.f123316b;
            C58838bb.m90883r(!list.isEmpty());
            String packageName = this.f123333i.getPackageName();
            for (Intent intent2 : list) {
                m84529e(intent2);
                intent2.setPackage(packageName);
                if (intent2.getData() != null && intent2.getType() == null && "content".equals(intent2.getData().getScheme())) {
                    ((C59052c) ((C59052c) f123325a.mo56225c()).mo56372aa(54754)).mo56386p("Intent with [data] was missing [type]. Both must be set.");
                }
            }
            Intent intent3 = (Intent) list.get(list.size() - 1);
            if (list.size() == 1) {
                intent3.addFlags(33554432);
            } else if (list.size() > 1) {
                if ((((Intent) list.get(0)).getFlags() & 268435456) == 0) {
                    z = false;
                }
                C58838bb.m90869d(z, "Adding multiple activities requires using a new task.");
            }
            intent3.addFlags(65536);
            try {
                this.f123333i.startActivities((Intent[]) list.toArray(new Intent[0]));
            } catch (ActivityNotFoundException | SecurityException e) {
                ((C59052c) ((C59052c) ((C59052c) f123325a.mo56225c()).mo56382g(e)).mo56372aa(54753)).mo56386p("Missing internal activity.");
            }
            this.f123333i.finish();
        } else if (i == 2) {
            Intent intent4 = (Intent) C58557jl.m90133n(gatewayDestination.f123316b);
            m84529e(intent4);
            m84528d(intent4);
            try {
                this.f123333i.startActivity(intent4);
            } catch (ActivityNotFoundException | SecurityException e2) {
                ((C59052c) ((C59052c) ((C59052c) f123325a.mo56225c()).mo56382g(e2)).mo56372aa(54752)).mo56389s("Missing external activity for %s.", intent4);
            }
            this.f123333i.finish();
        } else if (i == 3) {
            Intent intent5 = this.f123333i.getIntent();
            if (intent5.getPackage() != null) {
                this.f123333i.finish();
            }
            Uri data = intent5.getData();
            if (data == null || (!"https".equals(data.getScheme()) && !"http".equals(data.getScheme()))) {
                ((C59052c) ((C59052c) f123325a.mo56225c()).mo56372aa(54750)).mo56386p("Can't redirect non-http(s) intent to browser.");
                this.f123333i.finish();
                return;
            }
            Activity activity = this.f123333i;
            Intent intent6 = new Intent("android.intent.action.VIEW", Uri.parse("https://*"));
            intent6.addCategory("android.intent.category.BROWSABLE");
            String packageName2 = activity.getPackageName();
            Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent6, 65536).iterator();
            while (true) {
                if (!it.hasNext()) {
                    intent = null;
                    break;
                }
                ActivityInfo activityInfo = it.next().activityInfo;
                if (!packageName2.equals(activityInfo.packageName)) {
                    intent = new Intent("android.intent.action.VIEW", data);
                    intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    break;
                }
            }
            if (intent != null) {
                intent.addFlags(524288);
                this.f123333i.startActivity(intent);
            } else {
                ((C59052c) ((C59052c) f123325a.mo56224b()).mo56372aa(54751)).mo56386p("No browser is installed on the device.");
            }
            this.f123333i.finish();
        } else if (i == 4) {
            if (!gatewayDestination.f123316b.isEmpty()) {
                Intent intent7 = (Intent) C58557jl.m90133n(gatewayDestination.f123316b);
                m84528d(intent7);
                m84529e(intent7);
                this.f123333i.setResult(-1, intent7);
            }
            this.f123333i.finish();
        } else if (i == 5) {
            this.f123333i.finish();
        }
    }
}

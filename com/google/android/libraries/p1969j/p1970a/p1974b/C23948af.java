package com.google.android.libraries.p1969j.p1970a.p1974b;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.C147488c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58371co;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58723pp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60895di;
import com.google.common.util.concurrent.C60922j;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55928ab;
import com.google.p4184bj.p4193c.p4197c.C55937ak;
import com.google.p4184bj.p4193c.p4197c.C55938al;
import com.google.p4184bj.p4193c.p4197c.C55945as;
import com.google.p4184bj.p4193c.p4197c.C55946at;
import com.google.p4184bj.p4193c.p4197c.C55960bg;
import com.google.p4184bj.p4193c.p4197c.C55978n;
import com.google.p4184bj.p4193c.p4197c.C55979o;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;
import com.google.p4651h.p4652a.C61644a;
import com.google.p4651h.p4652a.C61647d;
import com.google.p5274y.p5275a.p5276a.C67966c;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import p5304e.p5305a.p5306a.p5388m.p5389a.C68820a;
import p5488io.grpc.C70286co;
import p5488io.grpc.p5520a.C70136d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.j.a.b.af */
/* compiled from: PG */
final class C23948af {

    /* renamed from: a */
    public static final C58495hd f65486a;

    /* renamed from: b */
    public static final C58495hd f65487b = new C58723pp(new Object[]{2, true, 3, false}, 2);

    /* renamed from: c */
    public static final C59071e f65488c = C59071e.m91332i("com.google.android.libraries.j.a.b.af");

    /* renamed from: d */
    public static final long f65489d = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: e */
    static final Map f65490e = new HashMap();

    /* renamed from: h */
    private static final long f65491h = TimeUnit.HOURS.toMillis(1);

    /* renamed from: f */
    public final C147488c f65492f;

    /* renamed from: g */
    public C70286co f65493g = null;

    /* renamed from: i */
    private final C23957g f65494i;

    static {
        C55912b bVar = C55912b.SUPPLEMENTAL_WEB_AND_APP_ACTIVITY;
        C56116b bVar2 = C56116b.SUPPL_WEB_AND_APP_DEVICE_LEVEL;
        C58371co.m89406a(bVar, bVar2);
        f65486a = new C58723pp(new Object[]{bVar, bVar2}, 1);
        C58371co.m89406a(2, true);
        C58371co.m89406a(3, false);
    }

    public C23948af() {
        C23957g gVar = C23959i.f65516b;
        C58838bb.m90866a(gVar, "Did you call ConsentFlow.setGrpcChannelFactory?");
        C147488c cVar = C23959i.f65517c;
        this.f65494i = gVar;
        this.f65492f = cVar;
        if (C68820a.m99375e() || C68820a.m99374d()) {
            C58838bb.m90866a(cVar, "Did you call ConsentFlow.setGmsCoreFacsCacheFactory?");
        }
    }

    /* renamed from: a */
    public static C61647d m44534a(Context context, Account account) {
        return new C61647d(new C61644a(AccountManager.get(context).blockingGetAuthToken(account, "oauth2:https://www.googleapis.com/auth/webhistory", true), new Date(System.currentTimeMillis() + f65491h)));
    }

    /* renamed from: d */
    public static final C55979o m44535d(Context context, C55960bg bgVar) {
        try {
            String packageName = context.getApplicationContext().getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            C55978n nVar = (C55978n) C55979o.f149075f.createBuilder();
            nVar.copyOnWrite();
            C55979o oVar = (C55979o) nVar.instance;
            oVar.f149078b = bgVar.f149026ao;
            oVar.f149077a |= 1;
            nVar.copyOnWrite();
            C55979o oVar2 = (C55979o) nVar.instance;
            packageName.getClass();
            oVar2.f149077a |= 2;
            oVar2.f149079c = packageName;
            int a = C67966c.m98222a();
            nVar.copyOnWrite();
            C55979o oVar3 = (C55979o) nVar.instance;
            oVar3.f149077a |= 8;
            oVar3.f149081e = a;
            if (packageInfo.versionName != null) {
                String str = packageInfo.versionName;
                nVar.copyOnWrite();
                C55979o oVar4 = (C55979o) nVar.instance;
                str.getClass();
                oVar4.f149077a |= 4;
                oVar4.f149080d = str;
            }
            return (C55979o) nVar.build();
        } catch (PackageManager.NameNotFoundException e) {
            throw af$$ExternalSyntheticBackport0.m44539m("Unable to get package name.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo29362b(Context context, Account account, C55912b bVar, String str, C55960bg bgVar, boolean z) {
        C60870cx cxVar;
        C60870cx g;
        Account account2 = account;
        C55912b bVar2 = bVar;
        C23942a aVar = new C23942a(account2.name, bVar2, str);
        Map map = f65490e;
        synchronized (map) {
            C23946ad adVar = (C23946ad) map.get(aVar);
            if (adVar == null || z || SystemClock.elapsedRealtime() >= adVar.f65485b + (C68820a.f184897a.mo6453a().mo60505c() * 1000)) {
                if (C68820a.m99374d()) {
                    this.f65493g = null;
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    if (((C56116b) f65486a.get(bVar2)) == null) {
                        g = C60856cj.m92900i(C58836b.f156633a);
                    } else {
                        g = C60922j.m93044g(this.f65492f.mo124244a(account2).mo124240h(), C23943aa.f65482a, C60826bg.f164896a);
                    }
                    cxVar = C60922j.m93045h(g, new C23974x(this, context, account, bVar, str, bgVar), newSingleThreadExecutor);
                    C60856cj.m92911t(cxVar, new C23944ab(this), newSingleThreadExecutor);
                } else {
                    cxVar = C60895di.m92995a(Executors.newSingleThreadExecutor()).mo19399b(new C23972v(this, bVar, str, context, bgVar, account));
                }
                C60870cx h = C60846c.m92879h(cxVar, Exception.class, new C23976z(aVar), C60826bg.f164896a);
                map.put(aVar, new C23946ad(h, SystemClock.elapsedRealtime()));
                return h;
            }
            C60870cx cxVar2 = adVar.f65484a;
            return cxVar2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C60870cx mo29363c(Context context, Account account, C55912b bVar, String str, C55960bg bgVar, C58833ax axVar) {
        try {
            C61647d a = m44534a(context, account);
            this.f65493g = mo29364e();
            C55945as asVar = (C55945as) C55946at.f148915f.createBuilder();
            int i = bVar.f148826V;
            asVar.copyOnWrite();
            C55946at atVar = (C55946at) asVar.instance;
            atVar.f148917a |= 1;
            atVar.f148918b = i;
            asVar.copyOnWrite();
            C55946at atVar2 = (C55946at) asVar.instance;
            str.getClass();
            atVar2.f148917a |= 4;
            atVar2.f148920d = str;
            C55979o d = m44535d(context, bgVar);
            asVar.copyOnWrite();
            C55946at atVar3 = (C55946at) asVar.instance;
            d.getClass();
            atVar3.f148921e = d;
            atVar3.f148917a |= 8;
            C55946at atVar4 = (C55946at) asVar.build();
            if (axVar.mo56113h()) {
                C55945as asVar2 = (C55945as) atVar4.toBuilder();
                C55928ab abVar = (C55928ab) axVar.mo56107c();
                asVar2.copyOnWrite();
                C55946at atVar5 = (C55946at) asVar2.instance;
                abVar.getClass();
                atVar5.f148919c = abVar;
                atVar5.f148917a |= 2;
                atVar4 = (C55946at) asVar2.build();
            }
            ((C59052c) ((C59052c) f65488c.mo56224b()).mo56372aa(47950)).mo56389s("GetSettingTextRequest sent to FPOP with DL settings from Facs Cache: %s.", atVar4);
            C55937ak akVar = (C55937ak) ((C55937ak) C55938al.m87863a(this.f65493g).mo62574m(new C70136d(a, C70136d.f186958b))).mo62575n(C68820a.m99373b(), TimeUnit.MILLISECONDS);
            return C70876o.m103760a(akVar.f189039a.mo39510a(C55938al.m87864b(), akVar.f189040b), atVar4);
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: e */
    public final C70286co mo29364e() {
        return this.f65494i.mo29368a(C68820a.f184897a.mo6453a().mo60506d(), (int) C68820a.f184897a.mo6453a().mo60504b());
    }
}

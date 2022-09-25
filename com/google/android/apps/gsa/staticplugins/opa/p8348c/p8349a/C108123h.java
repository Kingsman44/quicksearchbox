package com.google.android.apps.gsa.staticplugins.opa.p8348c.p8349a;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.apps.gsa.opa.C83609f;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90032ck;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90879am;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.assistant.assistantactions.p621c.p622a.C11059d;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21471s;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21478z;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2847b.C36972g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.assistant.p3897e.C50864a;
import com.google.assistant.p3897e.C50871b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.c.a.h */
/* compiled from: PG */
public final class C108123h implements C83609f {

    /* renamed from: a */
    public static final C59071e f300733a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.c.a.h");

    /* renamed from: b */
    static final String[] f300734b = {"internal.3p:Alarm_cross_device", "internal.3p:Timer_cross_device", "internal.3p:Stopwatch_cross_device"};

    /* renamed from: c */
    public final C86124t f300735c;

    /* renamed from: d */
    public final C68214a f300736d;

    /* renamed from: e */
    public final C58881cr f300737e = C58886cw.m90973a(new C108120e());

    /* renamed from: f */
    public final PackageManager f300738f;

    /* renamed from: g */
    public final C37215b f300739g;

    /* renamed from: h */
    public final C69464a f300740h;

    /* renamed from: i */
    public final C36972g f300741i;

    /* renamed from: j */
    private final C90931ca f300742j;

    /* renamed from: k */
    private final C11059d f300743k;

    public C108123h(PackageManager packageManager, C21471s sVar, C86124t tVar, C90931ca caVar, C21478z zVar, C68214a aVar, C11059d dVar, C36972g gVar, C37215b bVar, C69464a aVar2) {
        this.f300735c = tVar;
        this.f300742j = caVar;
        this.f300736d = aVar;
        this.f300738f = packageManager;
        this.f300743k = dVar;
        this.f300741i = gVar;
        this.f300739g = bVar;
        this.f300740h = aVar2;
    }

    /* renamed from: d */
    public static C58833ax m179492d(C86124t tVar, C36972g gVar) {
        ((C59052c) ((C59052c) f300733a.mo56224b()).mo56372aa(23602)).mo56386p("Get preferred clock app package name for create alarm");
        try {
            String str = (String) C90877ak.m148473g(gVar.mo40495a(), tVar.mo79743a(C90032ck.f248329n), TimeUnit.MILLISECONDS);
            if (str.isEmpty()) {
                return C58836b.f156633a;
            }
            return C58833ax.m90834k(str);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((C59052c) ((C59052c) ((C59052c) f300733a.mo56226d()).mo56382g(e)).mo56372aa(23603)).mo56386p("Failed to get create alarm preferred clock app package name from clockAppSelectionDataService.");
            return C58836b.f156633a;
        }
    }

    /* renamed from: e */
    public static C58833ax m179493e(C86124t tVar, C36972g gVar) {
        ((C59052c) ((C59052c) f300733a.mo56224b()).mo56372aa(23604)).mo56386p("Get preferred clock app package name for create timer");
        try {
            String str = (String) C90877ak.m148473g(gVar.mo40496b(), tVar.mo79743a(C90032ck.f248329n), TimeUnit.MILLISECONDS);
            if (str.isEmpty()) {
                return C58836b.f156633a;
            }
            return C58833ax.m90834k(str);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((C59052c) ((C59052c) ((C59052c) f300733a.mo56226d()).mo56382g(e)).mo56372aa(23605)).mo56386p("Failed to get create timer preferred clock app package name from clockAppSelectionDataService.");
            return C58836b.f156633a;
        }
    }

    /* renamed from: a */
    public final C60870cx mo76968a() {
        return this.f300742j.mo85138c(new C90879am("getClockContext", 1, 12, new C108121f(this)));
    }

    /* renamed from: b */
    public final C50871b mo96463b(Intent intent) {
        C50864a aVar = (C50864a) C50871b.f132454d.createBuilder();
        String action = intent.getAction();
        if (action != null) {
            aVar.copyOnWrite();
            C50871b bVar = (C50871b) aVar.instance;
            bVar.f132456a |= 1;
            bVar.f132457b = action;
            List<ResolveInfo> queryIntentActivities = this.f300738f.queryIntentActivities(intent, 0);
            ((C59052c) ((C59052c) f300733a.mo56224b()).mo56372aa(23600)).mo56387q("[getClockAndroidIntentCapabilities] resolveInfos size: %d", queryIntentActivities.size());
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str = resolveInfo.activityInfo.applicationInfo.packageName;
                ((C59052c) ((C59052c) f300733a.mo56224b()).mo56372aa(23601)).mo56354G("[getClockAndroidIntentCapabilities] intent action: %s, packageName: %s", intent.getAction(), str);
                aVar.mo53486a(str);
            }
        }
        return (C50871b) aVar.build();
    }

    /* renamed from: c */
    public final C58833ax mo96464c(String str) {
        ((C59052c) ((C59052c) f300733a.mo56224b()).mo56372aa(23606)).mo56389s("Get user preferred app package name for: %s", str);
        try {
            String str2 = (String) C90877ak.m148473g(this.f300743k.mo19528b(str), this.f300735c.mo79743a(C90032ck.f248329n), TimeUnit.MILLISECONDS);
            if (str2.isEmpty()) {
                return C58836b.f156633a;
            }
            return C58833ax.m90834k(str2);
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) f300733a.mo56225c()).mo56382g(e)).mo56372aa(23607)).mo56389s("getUserPreferredAppPackageName: failed to get value for %s from fluidActionsDataStore, encountered ExecutionException", str);
            return C58836b.f156633a;
        } catch (InterruptedException e2) {
            ((C59052c) ((C59052c) ((C59052c) f300733a.mo56225c()).mo56382g(e2)).mo56372aa(23608)).mo56389s("getUserPreferredAppPackageName: failed to get value for %s from fluidActionsDataStore, encountered InterruptedException", str);
            return C58836b.f156633a;
        } catch (TimeoutException e3) {
            ((C59052c) ((C59052c) ((C59052c) f300733a.mo56225c()).mo56382g(e3)).mo56372aa(23609)).mo56389s("getUserPreferredAppPackageName: failed to get value for %s from fluidActionsDataStore, encountered TimeoutException", str);
            return C58836b.f156633a;
        }
    }
}

package com.google.android.libraries.search.silk.p3162a.p3163a;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.apps.gsa.h.v.a;
import com.google.android.apps.gsa.h.v.b;
import com.google.android.apps.gsa.h.v.c;
import com.google.android.apps.search.weather.p10685d.C142072a;
import com.google.android.apps.search.weather.p10685d.C142073b;
import com.google.android.apps.search.weather.p10685d.C142075d;
import com.google.android.apps.search.weather.p10685d.C142076e;
import com.google.android.libraries.silk.p3205a.p3213b.C41716a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4297b.C56654b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4297b.C56655c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4297b.C56656d;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4297b.C56658f;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4297b.C56659g;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4297b.C56660h;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4297b.C56662j;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4297b.C56663k;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4297b.C56664l;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4297b.C56666n;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: com.google.android.libraries.search.silk.a.a.a */
/* compiled from: PG */
public final class C40550a implements C41716a {

    /* renamed from: a */
    private static final C59071e f106422a = C59071e.m91332i("com.google.android.libraries.search.silk.a.a.a");

    /* renamed from: b */
    private static final C56848d f106423b;

    /* renamed from: c */
    private static final C56848d f106424c;

    /* renamed from: d */
    private final PackageManager f106425d;

    /* renamed from: e */
    private final Context f106426e;

    /* renamed from: f */
    private final a f106427f;

    /* renamed from: g */
    private final C142072a f106428g;

    static {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        cVar.copyOnWrite();
        C56848d dVar = (C56848d) cVar.instance;
        dVar.f151671a |= 1;
        dVar.f151672b = "launch_app_failed";
        cVar.copyOnWrite();
        C56848d dVar2 = (C56848d) cVar.instance;
        dVar2.f151671a |= 2;
        dVar2.f151673c = "failed to launch app";
        f106423b = (C56848d) cVar.build();
        C56847c cVar2 = (C56847c) C56848d.f151669d.createBuilder();
        cVar2.copyOnWrite();
        C56848d dVar3 = (C56848d) cVar2.instance;
        dVar3.f151671a |= 1;
        dVar3.f151672b = "activity_not_found";
        cVar2.copyOnWrite();
        C56848d dVar4 = (C56848d) cVar2.instance;
        dVar4.f151671a |= 2;
        dVar4.f151673c = "No activity can open given url";
        f106424c = (C56848d) cVar2.build();
    }

    public C40550a(Context context, a aVar, C142072a aVar2) {
        this.f106426e = context;
        this.f106425d = context.getPackageManager();
        this.f106427f = aVar;
        this.f106428g = aVar2;
    }

    /* renamed from: e */
    private static Intent m70287e(ComponentName componentName) {
        return new Intent("android.intent.action.MAIN").setFlags(268435456).addCategory("android.intent.category.LAUNCHER").setComponent(componentName);
    }

    /* renamed from: f */
    private static Intent m70288f(String str) {
        return new Intent("android.intent.action.MAIN").setFlags(268435456).addCategory("android.intent.category.LAUNCHER").setPackage(str);
    }

    /* renamed from: a */
    public final C60870cx mo42507a(C56654b bVar) {
        String str = bVar.f151245a;
        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
        Intent intent = null;
        if (unflattenFromString != null) {
            Intent e = m70287e(unflattenFromString);
            if (true != this.f106425d.queryIntentActivities(e, 0).isEmpty()) {
                intent = e;
            }
        } else {
            List<ResolveInfo> queryIntentActivityOptions = this.f106425d.queryIntentActivityOptions((ComponentName) null, new Intent[]{m70288f(str).addCategory("android.intent.category.DEFAULT")}, m70288f(str), 0);
            if (queryIntentActivityOptions != null && !queryIntentActivityOptions.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentActivityOptions.get(0);
                intent = m70287e(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
            }
        }
        if (intent != null) {
            C56655c cVar = (C56655c) C56656d.f151247c.createBuilder();
            cVar.copyOnWrite();
            C56656d dVar = (C56656d) cVar.instance;
            dVar.f151249a |= 1;
            dVar.f151250b = true;
            return C60856cj.m92900i((C56656d) cVar.build());
        }
        C56655c cVar2 = (C56655c) C56656d.f151247c.createBuilder();
        cVar2.copyOnWrite();
        C56656d dVar2 = (C56656d) cVar2.instance;
        dVar2.f151249a |= 1;
        dVar2.f151250b = false;
        return C60856cj.m92900i((C56656d) cVar2.build());
    }

    /* renamed from: b */
    public final C60870cx mo42508b(C56662j jVar) {
        String str = jVar.f151262a;
        if (str.startsWith("intent:") || str.startsWith("android-app:")) {
            try {
                boolean isEmpty = this.f106425d.queryIntentActivities(Intent.parseUri(str, 1), 0).isEmpty();
                C56663k kVar = (C56663k) C56664l.f151264c.createBuilder();
                kVar.copyOnWrite();
                C56664l lVar = (C56664l) kVar.instance;
                lVar.f151266a |= 1;
                lVar.f151267b = !isEmpty;
                return C60856cj.m92900i((C56664l) kVar.build());
            } catch (URISyntaxException unused) {
                ((C59052c) ((C59052c) f106422a.mo56224b()).mo56372aa(53352)).mo56386p("Malformed intent: URI");
                C56663k kVar2 = (C56663k) C56664l.f151264c.createBuilder();
                kVar2.copyOnWrite();
                C56664l lVar2 = (C56664l) kVar2.instance;
                lVar2.f151266a = 1 | lVar2.f151266a;
                lVar2.f151267b = false;
                return C60856cj.m92900i((C56664l) kVar2.build());
            }
        } else {
            C56663k kVar3 = (C56663k) C56664l.f151264c.createBuilder();
            kVar3.copyOnWrite();
            C56664l lVar3 = (C56664l) kVar3.instance;
            lVar3.f151266a = 1 | lVar3.f151266a;
            lVar3.f151267b = false;
            return C60856cj.m92900i((C56664l) kVar3.build());
        }
    }

    /* renamed from: c */
    public final C60870cx mo42509c(C56658f fVar) {
        String str = fVar.f151253a;
        String str2 = fVar.f151254b;
        if (str.startsWith("intent:") || str.startsWith("android-app:")) {
            try {
                boolean isEmpty = this.f106425d.queryIntentActivities(Intent.parseUri(str, 1).setPackage(str2), 0).isEmpty();
                C56659g gVar = (C56659g) C56660h.f151256c.createBuilder();
                gVar.copyOnWrite();
                C56660h hVar = (C56660h) gVar.instance;
                hVar.f151258a |= 1;
                hVar.f151259b = !isEmpty;
                return C60856cj.m92900i((C56660h) gVar.build());
            } catch (URISyntaxException unused) {
                ((C59052c) ((C59052c) f106422a.mo56224b()).mo56372aa(53353)).mo56386p("Malformed intent: URI");
                C56659g gVar2 = (C56659g) C56660h.f151256c.createBuilder();
                gVar2.copyOnWrite();
                C56660h hVar2 = (C56660h) gVar2.instance;
                hVar2.f151258a |= 1;
                hVar2.f151259b = false;
                return C60856cj.m92900i((C56660h) gVar2.build());
            }
        } else {
            C56659g gVar3 = (C56659g) C56660h.f151256c.createBuilder();
            gVar3.copyOnWrite();
            C56660h hVar3 = (C56660h) gVar3.instance;
            hVar3.f151258a |= 1;
            hVar3.f151259b = false;
            return C60856cj.m92900i((C56660h) gVar3.build());
        }
    }

    /* renamed from: d */
    public final C60870cx mo42510d(C56666n nVar) {
        String str = nVar.f151270a;
        if (!str.startsWith("intent:") && !str.startsWith("android-app:")) {
            return C60856cj.m92899h(new C41742a(f106423b));
        }
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            parseUri.setFlags(268468224);
            if (this.f106425d.resolveActivity(parseUri, 0) == null) {
                return C60856cj.m92899h(new C41742a(f106424c));
            }
            Uri data = parseUri.getData();
            if (data != null) {
                try {
                    if (data.toString().equals("dynact://velour/weather/WeatherActivity")) {
                        a aVar = this.f106427f;
                        b createBuilder = c.c.createBuilder();
                        createBuilder.copyOnWrite();
                        c cVar = createBuilder.instance;
                        str.getClass();
                        cVar.a = 1 | cVar.a;
                        cVar.b = str;
                        aVar.mo41490e(createBuilder.build());
                        return C60866ct.f164955a;
                    }
                } catch (ActivityNotFoundException e) {
                    ((C59052c) ((C59052c) ((C59052c) f106422a.mo56225c()).mo56382g(e)).mo56372aa(53354)).mo56386p("Opening uri failed");
                    return C60856cj.m92899h(new C41742a(f106424c));
                }
            }
            if (C142073b.m230647a(parseUri).booleanValue()) {
                C142072a aVar2 = this.f106428g;
                C142075d dVar = (C142075d) C142076e.f385463c.createBuilder();
                dVar.copyOnWrite();
                C142076e eVar = (C142076e) dVar.instance;
                str.getClass();
                eVar.f385465a = 1 | eVar.f385465a;
                eVar.f385466b = str;
                aVar2.mo41490e((C142076e) dVar.build());
            } else {
                this.f106426e.startActivity(parseUri);
            }
            return C60866ct.f164955a;
        } catch (URISyntaxException unused) {
            ((C59052c) ((C59052c) f106422a.mo56224b()).mo56372aa(53355)).mo56386p("Malformed intent: URI");
            return C60856cj.m92899h(new C41742a(f106423b));
        }
    }
}

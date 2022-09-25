package com.google.android.apps.gsa.staticplugins.opa.p8332bd.p8333a.p8334a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.opa.C83581al;
import com.google.android.apps.gsa.p8839t.p8847h.C118426bs;
import com.google.android.apps.gsa.p8839t.p8847h.C118435k;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.media.C87576a;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.libraries.assistant.pcp.p1573k.C18927g;
import com.google.android.libraries.assistant.pcp.p1573k.C18930j;
import com.google.android.libraries.assistant.pcp.p1573k.C18932l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4764a.p4765a.p4766a.C63120g;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4764a.p4765a.p4766a.C63121h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bd.a.a.n */
/* compiled from: PG */
public final class C107970n {

    /* renamed from: a */
    public static final C59071e f300422a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bd.a.a.n");

    /* renamed from: b */
    public final Context f300423b;

    /* renamed from: c */
    public final C83581al f300424c;

    /* renamed from: d */
    public final C118426bs f300425d;

    /* renamed from: e */
    public final C18927g f300426e;

    /* renamed from: f */
    public final C18930j f300427f;

    /* renamed from: g */
    public final C18932l f300428g;

    /* renamed from: h */
    public final C87576a f300429h;

    /* renamed from: i */
    public final C118435k f300430i;

    /* renamed from: j */
    public final C22871g f300431j;

    /* renamed from: k */
    public final C21370a f300432k;

    /* renamed from: l */
    public final long f300433l;

    /* renamed from: m */
    public final int f300434m;

    /* renamed from: n */
    public final C58485gu f300435n;

    /* renamed from: o */
    public final Map f300436o;

    /* renamed from: p */
    public final C91189au f300437p;

    /* renamed from: q */
    private final C63121h f300438q;

    public C107970n(Context context, C83581al alVar, C118426bs bsVar, C18927g gVar, C18930j jVar, C18932l lVar, C87576a aVar, C118435k kVar, C86124t tVar, C22871g gVar2, C21370a aVar2, C91189au auVar) {
        this.f300423b = context;
        this.f300424c = alVar;
        this.f300425d = bsVar;
        this.f300426e = gVar;
        this.f300437p = auVar;
        this.f300427f = jVar;
        this.f300428g = lVar;
        this.f300429h = aVar;
        this.f300430i = kVar;
        this.f300431j = gVar2;
        this.f300432k = aVar2;
        this.f300433l = tVar.mo79743a(C90069du.f249739q);
        long a = tVar.mo79743a(C90069du.f249718L);
        int i = (int) a;
        if (a == ((long) i)) {
            this.f300434m = i;
            this.f300435n = tVar.mo79745c(C90069du.f249737o);
            C63121h hVar = (C63121h) tVar.mo79754t(C90069du.f249715I, C63121h.f170396b.getParserForType());
            this.f300438q = hVar == null ? C63121h.f170396b : hVar;
            this.f300436o = new HashMap();
            return;
        }
        throw new ArithmeticException();
    }

    /* renamed from: c */
    public static C58833ax m179252c(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            return applicationInfo != null ? C58833ax.m90834k(context.getPackageManager().getApplicationLabel(applicationInfo).toString()) : C58836b.f156633a;
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f300422a.mo56225c()).mo56382g(e)).mo56372aa(26903)).mo56386p("Error in getting on-device provider name.");
            return C58836b.f156633a;
        }
    }

    /* renamed from: d */
    public static String m179253d(String str, String str2) {
        return String.format("intent:#Intent;S.zero_state_action_name=%s;S.media_app_package_name=%s;S.media_id=%s;end;", new Object[]{"OnDeviceMediaAction", str, str2});
    }

    /* renamed from: a */
    public final C58833ax mo96347a(Map map, ComponentName componentName) {
        C58833ax axVar;
        if (map.containsKey(componentName)) {
            return (C58833ax) map.get(componentName);
        }
        try {
            axVar = C58833ax.m90834k(this.f300423b.getPackageManager().getApplicationIcon(componentName.getPackageName()));
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f300422a.mo56225c()).mo56382g(e)).mo56372aa(26900)).mo56386p("Error in getting on-device provider icon.");
            axVar = C58836b.f156633a;
        }
        byte[] bArr = null;
        if (axVar.mo56113h()) {
            Drawable drawable = (Drawable) axVar.mo56107c();
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            if (createBitmap != null) {
                C63087y v = C63088z.m96150v();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, v);
                bArr = v.mo59165b().mo59174N();
            }
        }
        if (bArr != null) {
            map.put(componentName, C58833ax.m90834k(bArr));
            return C58833ax.m90834k(bArr);
        }
        map.put(componentName, C58836b.f156633a);
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final C58833ax mo96348b(String str) {
        for (C63120g gVar : this.f300438q.f170398a) {
            if (gVar.f170393a.equals(str) && !gVar.f170394b.isEmpty()) {
                ((C59052c) ((C59052c) f300422a.mo56224b()).mo56372aa(26899)).mo56389s("Find a matching media provider icon URL for {%s}", str);
                return C58833ax.m90834k(gVar.f170394b);
            }
        }
        return C58836b.f156633a;
    }
}

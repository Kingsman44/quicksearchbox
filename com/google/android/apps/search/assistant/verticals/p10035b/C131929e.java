package com.google.android.apps.search.assistant.verticals.p10035b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.verticals.b.e */
/* compiled from: PG */
final class C131929e implements GatewayHandler {

    /* renamed from: a */
    public static final C58485gu f360218a = C58485gu.m89850r("com.android.chrome", "com.chrome.beta", "com.chrome.canary", "com.chrome.dev", "com.google.android.apps.chrome");

    /* renamed from: b */
    public static final C59071e f360219b = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.b.e");

    /* renamed from: c */
    public static final C60870cx f360220c = C60856cj.m92900i(GatewayHandler.GatewayDestination.m84517e());

    /* renamed from: j */
    private static final C58869cf f360221j = C58869cf.m90937c(C58837ba.m90854c("\\."));

    /* renamed from: d */
    public final Context f360222d;

    /* renamed from: e */
    public final C32158h f360223e;

    /* renamed from: f */
    public final C58528ij f360224f;

    /* renamed from: g */
    public final C131934j f360225g;

    /* renamed from: h */
    public final String f360226h;

    /* renamed from: i */
    public boolean f360227i = false;

    /* renamed from: k */
    private final boolean f360228k;

    /* renamed from: l */
    private final String f360229l;

    /* renamed from: m */
    private final C37215b f360230m;

    public C131929e(C38780c cVar, Context context, boolean z, C131934j jVar, C65603f fVar, String str, String str2, C32158h hVar) {
        this.f360230m = cVar.mo41619a(C38828b.GOOGLE_APP);
        this.f360222d = context;
        this.f360228k = z;
        this.f360225g = jVar;
        this.f360224f = C58528ij.m90006F(fVar.f178307a);
        this.f360226h = str;
        this.f360229l = str2;
        this.f360223e = hVar;
    }

    /* renamed from: b */
    public static C58485gu m214391b(String str) {
        if (C58837ba.m90859h(str)) {
            return C58485gu.m89845m();
        }
        Iterable<String> g = f360221j.mo56153g(str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : g) {
            try {
                arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
            } catch (NumberFormatException e) {
                ((C59052c) ((C59052c) ((C59052c) f360219b.mo56226d()).mo56382g(e)).mo56372aa(39455)).mo56389s("Invalid number format %s", str2);
            }
        }
        return C58485gu.m89842j(arrayList);
    }

    /* renamed from: d */
    public static void m214392d(C37215b bVar, int i) {
        bVar.mo19974a(C37176a.f97276iW.mo40803a(i - 1, "niuErrors"));
    }

    /* renamed from: a */
    public final C47506l mo20007a(C47507m mVar) {
        this.f360230m.mo19974a(C37176a.f97275iV);
        Uri data = mVar.f123337a.getData();
        mVar.f123337a.setData(Uri.parse(this.f360229l));
        if (data == null || !TextUtils.equals(data.getScheme(), "https") || !TextUtils.equals(data.getHost(), "www.google.com") || !TextUtils.equals(C58837ba.m90858g(data.getPath()), "/niuactions") || data.getQueryParameter("fid") == null) {
            ((C59052c) ((C59052c) f360219b.mo56226d()).mo56372aa(39453)).mo56386p("Invalid request, ignoring deeplink visit.");
            m214392d(this.f360230m, 1);
            mo110352c(R.string.assistant_autobot_invalid_request);
        } else if (this.f360228k) {
            return new C131928d(this, data, this.f360230m, mVar);
        } else {
            ((C59052c) ((C59052c) f360219b.mo56224b()).mo56372aa(39454)).mo56386p("Niu Actions Gateway is disabled, ignoring deeplink visit.");
            m214392d(this.f360230m, 2);
            mo110352c(R.string.assistant_autobot_unsupported_feature);
        }
        return new C131926b(this);
    }

    /* renamed from: c */
    public final void mo110352c(int i) {
        Toast.makeText(this.f360222d, i, 1).show();
    }
}

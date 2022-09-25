package com.google.android.apps.search.assistant.surfaces.bisto.p9389b;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124659by;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60105ky;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.b.d */
/* compiled from: PG */
public final class C124536d implements GatewayHandler {

    /* renamed from: a */
    static final C58495hd f343609a = C58495hd.m89900n("fast_pair", 759);

    /* renamed from: b */
    static final C58495hd f343610b = C58495hd.m89902p("fast_pair", C60105ky.ANDROID_OOBE_FAST_PAIR_HALF_SHEET, "companion_vm_only", C60105ky.ANDROID_OOBE_COMPANION_VOICE_MATCH_ONLY, "companion_post_gesture_config", C60105ky.ANDROID_OOBE_COMPANION_POST_GESTURE_CONFIG);

    /* renamed from: i */
    private static final C59071e f343611i = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.b.d");

    /* renamed from: c */
    public final boolean f343612c;

    /* renamed from: d */
    public final boolean f343613d;

    /* renamed from: e */
    public final Context f343614e;

    /* renamed from: f */
    public final C60887da f343615f;

    /* renamed from: g */
    public final C60887da f343616g;

    /* renamed from: h */
    public final C32158h f343617h;

    /* renamed from: j */
    private final boolean f343618j;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.b.d$a */
    /* compiled from: PG */
    public interface C124537a {
        /* renamed from: av */
        C124659by mo106451av();
    }

    public C124536d(Context context, C60887da daVar, C60887da daVar2, C32158h hVar, boolean z, boolean z2, boolean z3) {
        this.f343614e = context;
        this.f343618j = z;
        this.f343612c = z2;
        this.f343613d = z3;
        this.f343615f = daVar;
        this.f343616g = daVar2;
        this.f343617h = hVar;
    }

    /* renamed from: b */
    public static C60105ky m204010b(Uri uri) {
        String queryParameter = uri.getQueryParameter("source");
        C59104x b = f343611i.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGatewayHandler");
        ((C59052c) ((C59052c) b).mo56372aa(36242)).mo56389s("DeeplinkSource %s", queryParameter);
        if (!C58837ba.m90859h(queryParameter)) {
            C58495hd hdVar = f343610b;
            if (hdVar.containsKey(queryParameter)) {
                return (C60105ky) hdVar.get(queryParameter);
            }
            try {
                C60105ky a = C60105ky.m92528a(Integer.parseInt(queryParameter));
                if (a != null) {
                    return a;
                }
            } catch (NumberFormatException unused) {
            }
            C59104x d = f343611i.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoGatewayHandler");
            ((C59052c) ((C59052c) d).mo56372aa(36243)).mo56386p("Bad DeeplinkSource");
        }
        return C60105ky.UNKNOWN;
    }

    /* renamed from: a */
    public final C47506l mo20007a(C47507m mVar) {
        Uri data = mVar.f123337a.getData();
        if (data == null) {
            return null;
        }
        String scheme = data.getScheme();
        String host = data.getHost();
        String path = data.getPath();
        if (scheme != null && host != null && path != null && scheme.equals("https") && host.equals("www.google.com") && path.equals("/assistant/wearables/setup")) {
            if (this.f343618j) {
                C59104x d = f343611i.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoGatewayHandler");
                ((C59052c) ((C59052c) d).mo56372aa(36241)).mo56386p("Deeplink was called but was disabled.");
                return null;
            }
            String queryParameter = data.getQueryParameter("public_address");
            if (queryParameter != null && BluetoothAdapter.checkBluetoothAddress(queryParameter)) {
                return new C124535c(this, data, queryParameter);
            }
            C59104x d2 = f343611i.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "BistoGatewayHandler");
            ((C59052c) ((C59052c) d2).mo56372aa(36240)).mo56389s("Invalid Address %s", queryParameter);
        }
        return null;
    }
}

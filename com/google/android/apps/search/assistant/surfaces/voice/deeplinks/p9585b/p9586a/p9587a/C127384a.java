package com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9585b.p9586a.p9587a;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.p9583a.C127373a;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9588c.C127387a;
import com.google.android.apps.search.googleapp.p10338l.p10339a.C136382ae;
import com.google.apps.tiktok.nav.gateway.C47505k;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.a.a.a */
/* compiled from: PG */
final class C127384a implements C47506l {

    /* renamed from: a */
    final /* synthetic */ C47507m f350775a;

    /* renamed from: b */
    final /* synthetic */ C127385b f350776b;

    public C127384a(C127385b bVar, C47507m mVar) {
        this.f350776b = bVar;
        this.f350775a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo20002a() {
        return 0;
    }

    /* renamed from: b */
    public final /* synthetic */ int mo20003b() {
        return 0;
    }

    /* renamed from: c */
    public final C58833ax mo20004c() {
        return this.f350776b.f350782f.mo37970a();
    }

    /* renamed from: d */
    public final C60870cx mo20005d(C47505k kVar) {
        Uri uri;
        Intent intent;
        Uri data = this.f350775a.f123337a.getData();
        if (data == null) {
            ((C59052c) ((C59052c) C127385b.f350777a.mo56225c()).mo56372aa(37451)).mo56386p("Unable to retrieve deeplink URI from intent.");
            return C127385b.f350779c;
        } else if (!this.f350776b.f350780d) {
            ((C59052c) ((C59052c) C127385b.f350777a.mo56226d()).mo56372aa(37450)).mo56386p("Ma Deeplink Gateway is disabled, fallback to agsa-c.");
            return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(this.f350776b.mo108041b(data)));
        } else {
            String scheme = data.getScheme();
            String host = data.getHost();
            if ((TextUtils.equals(scheme, C136382ae.f371303a) && TextUtils.equals(host, "interpreter")) || ((TextUtils.equals(scheme, "https") || TextUtils.equals(scheme, "http")) && TextUtils.equals(host, "assistant.google.com"))) {
                ((C59052c) ((C59052c) C127385b.f350777a.mo56224b()).mo56372aa(37449)).mo56389s("Given deeplink is legacy PC deeplink: %s", data);
                String scheme2 = data.getScheme();
                String host2 = data.getHost();
                if (!TextUtils.equals(scheme2, C136382ae.f371303a) || !TextUtils.equals(host2, "interpreter")) {
                    uri = ((TextUtils.equals(scheme2, "https") || TextUtils.equals(scheme2, "http")) && TextUtils.equals(host2, "assistant.google.com")) ? new Uri.Builder().scheme("https").authority("mobile-assistant.google.com").path(data.getPath()).encodedQuery(data.getQuery()).fragment(data.getFragment()).build() : data;
                } else {
                    uri = new Uri.Builder().scheme("https").authority("mobile-assistant.google.com").appendPath("interpreter").encodedQuery(data.getQuery()).fragment(data.getFragment()).build();
                }
                C127385b bVar = this.f350776b;
                String path = uri.getPath();
                if (TextUtils.isEmpty(path) || path.length() <= 1) {
                    ((C59052c) ((C59052c) C127385b.f350777a.mo56226d()).mo56372aa(37454)).mo56389s("Path does not exist for deeplink %s", uri);
                } else {
                    String a = C127387a.m208324a(path);
                    C69464a aVar = (C69464a) bVar.f350781e.get(a);
                    if (aVar == null) {
                        ((C59052c) ((C59052c) C127385b.f350777a.mo56226d()).mo56372aa(37455)).mo56389s("No deeplink data converter found for %s", a);
                    } else if (((C127373a) aVar.mo17428b()).mo108039b(uri)) {
                        intent = this.f350776b.mo108042c(uri, this.f350775a.f123338b, true);
                        return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(intent));
                    }
                }
                intent = this.f350776b.mo108041b(data);
                return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(intent));
            } else if (!TextUtils.equals(data.getScheme(), "https") || !TextUtils.equals(data.getHost(), "mobile-assistant.google.com")) {
                ((C59052c) ((C59052c) C127385b.f350777a.mo56225c()).mo56372aa(37447)).mo56386p("Invalid MA deeplink Uri from intent.");
                return C127385b.f350778b;
            } else {
                ((C59052c) ((C59052c) C127385b.f350777a.mo56224b()).mo56372aa(37448)).mo56389s("Given deeplink is TNG deeplink: %s", data);
                return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(this.f350776b.mo108042c(data, this.f350775a.f123338b, false)));
            }
        }
    }

    /* renamed from: e */
    public final /* synthetic */ GatewayHandler.GatewayDestination mo20006e() {
        return GatewayHandler.GatewayDestination.m84513a((String) null);
    }
}

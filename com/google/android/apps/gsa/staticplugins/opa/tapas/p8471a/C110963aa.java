package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.appactions.p11035a.C147839g;
import com.google.android.libraries.appactions.p11035a.C147840h;
import com.google.common.base.C58835az;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.net.URISyntaxException;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.aa */
/* compiled from: PG */
public final class C110963aa {

    /* renamed from: a */
    private static final C59071e f309129a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.a.aa");

    /* renamed from: b */
    private final C69464a f309130b;

    public C110963aa(C69464a aVar) {
        this.f309130b = aVar;
    }

    /* renamed from: a */
    public final Optional mo98992a(Optional optional, Optional optional2, Map map) {
        Optional b = mo98993b(optional, optional2, map);
        if (b.isEmpty()) {
            return Optional.empty();
        }
        Intent intent = (Intent) ((C58835az) b.get()).f156631a;
        intent.putExtra("actions.fulfillment.extra.ACTION_TOKEN", BuildConfig.FLAVOR);
        if (((C147840h) ((C58835az) b.get()).f156632b).mo124508c()) {
            intent.addFlags(805306368);
        } else {
            intent.addFlags(268468224);
        }
        return Optional.m71637of(intent);
    }

    /* renamed from: b */
    public final Optional mo98993b(Optional optional, Optional optional2, Map map) {
        C58976aa aaVar = C58975e.f156826a;
        C147839g gVar = (C147839g) this.f309130b.mo17428b();
        String str = (String) optional2.get();
        String str2 = (String) optional.get();
        Optional empty = Optional.empty();
        try {
            empty = gVar.mo124517b(str, str2, (C58495hd) Collection.EL.stream(map.entrySet()).collect(C58370cn.m89403c(C111073w.f309299a, C111074x.f309300a, C111075y.f309301a)), Optional.empty());
        } catch (IllegalArgumentException e) {
            C59104x d = f309129a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TapasAAFulIntentHelper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(27064)).mo56354G("AppActionsFulfiller failed for pkg %s intent %s", str, str2);
        }
        if (empty.isEmpty()) {
            C59104x d2 = f309129a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "TapasAAFulIntentHelper");
            ((C59052c) ((C59052c) d2).mo56372aa(27063)).mo56386p("#getRawAndroidIntent: optAppActionsFulfillmentResult is not present");
            return Optional.empty();
        }
        C147840h hVar = (C147840h) empty.get();
        hVar.mo124506a();
        if (hVar.mo124509d() != 3) {
            C59104x d3 = f309129a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "TapasAAFulIntentHelper");
            ((C59052c) ((C59052c) d3).mo56372aa(27062)).mo56386p("#getRawAndroidIntent: not yet support non-deeplink fulfillment");
        } else if (hVar.mo124506a().startsWith("android-app://")) {
            C59104x d4 = f309129a.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "TapasAAFulIntentHelper");
            ((C59052c) ((C59052c) d4).mo56372aa(27061)).mo56389s("#getRawAndroidIntent: unsupported URL starting with %s", "android-app://");
        } else {
            try {
                Intent parseUri = Intent.parseUri(hVar.mo124506a(), 7);
                Objects.requireNonNull(parseUri);
                optional2.ifPresent(new C111076z(parseUri));
                parseUri.toUri(1);
                return Optional.m71637of(new C58835az(parseUri, hVar));
            } catch (URISyntaxException e2) {
                C59104x c = f309129a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TapasAAFulIntentHelper");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(27060)).mo56389s("#getRawAndroidIntent: exception %s", e2);
            }
        }
        return Optional.empty();
    }
}

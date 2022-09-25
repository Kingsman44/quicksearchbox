package com.google.android.apps.search.webglide.p10699b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2886n.C37212a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.android.libraries.search.p3025k.C38561o;
import com.google.android.libraries.web.weblayer.p3448b.C44127c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63042fg;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.webglide.b.e */
/* compiled from: PG */
public final class C142174e extends C38561o {

    /* renamed from: a */
    public final C62921ba f385686a;

    /* renamed from: b */
    public final C44127c f385687b;

    /* renamed from: c */
    private final AccountId f385688c;

    /* renamed from: d */
    private final Context f385689d;

    /* renamed from: e */
    private final C37215b f385690e;

    /* renamed from: f */
    private final C142176g f385691f;

    public C142174e(C62921ba baVar, Optional optional, Fragment fragment, AccountId accountId, Context context, C38780c cVar, C44127c cVar2, C142176g gVar) {
        super(optional, fragment, 1);
        this.f385686a = baVar;
        this.f385688c = accountId;
        this.f385689d = context;
        this.f385690e = cVar.mo41619a(C38828b.WEBGLIDE);
        this.f385687b = cVar2;
        this.f385691f = gVar;
    }

    /* renamed from: b */
    public static C142173d m230796b(Intent intent, C62921ba baVar) {
        if (!intent.hasExtra("EXTRA_OPEN_WEBGLIDE_PARAMS")) {
            return C142173d.f385675i;
        }
        try {
            return (C142173d) ProtoParsers.m95519b(intent, "EXTRA_OPEN_WEBGLIDE_PARAMS", C142173d.f385675i, baVar);
        } catch (C62974ct e) {
            throw new IllegalArgumentException("Parsing open webglide param data from proto failed", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Intent mo41488a(Object obj) {
        Intent component = new Intent().setComponent(new ComponentName(this.f385689d, "com.google.android.apps.search.webglide.navroot.WebGlideActivity"));
        component.setFlags(67108864);
        C45963aa.m82131a(component, this.f385688c);
        ProtoParsers.m95531n(component, "EXTRA_OPEN_WEBGLIDE_PARAMS", (C142173d) obj);
        return component;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo41489c(Fragment fragment, Intent intent, Object obj) {
        C142173d dVar = (C142173d) obj;
        C37215b bVar = this.f385690e;
        C37258g gVar = C37212a.f98859a;
        C63042fg fgVar = dVar.f385680d;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        bVar.mo19974a(gVar.mo40811d(C62953e.m95479d(fgVar)));
        this.f385690e.mo19974a(C37212a.f98860b);
        C142180k kVar = dVar.f385681e;
        if (kVar == null) {
            kVar = C142180k.f385703q;
        }
        C142176g gVar2 = this.f385691f;
        gVar2.f385692a = kVar.f385707c;
        gVar2.f385693b = kVar.f385709e;
        gVar2.f385694c = kVar.f385710f;
        gVar2.f385695d = kVar.f385708d;
        gVar2.f385696e = kVar.f385711g;
        gVar2.f385697f = kVar.f385712h;
        gVar2.f385698g = kVar.f385713i;
        gVar2.f385699h = kVar.f385714j;
        gVar2.f385700i = kVar.f385715k;
        gVar2.f385701j = kVar.f385716l;
        C47709i.m84861a(fragment, intent);
    }
}

package com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e;

import android.content.Context;
import android.content.Intent;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51940et;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.net.URISyntaxException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.e.h */
/* compiled from: PG */
public final class C33230h {

    /* renamed from: a */
    public static final C59071e f88865a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.e.h");

    /* renamed from: a */
    public static C52492tt m61619a(C51941eu euVar, C51953ff ffVar) {
        C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
        String str = euVar.f136279g;
        tpVar.copyOnWrite();
        C52490tr trVar = (C52490tr) tpVar.instance;
        str.getClass();
        trVar.f137797a |= 1;
        trVar.f137800d = str;
        String str2 = euVar.f136280h;
        tpVar.copyOnWrite();
        C52490tr trVar2 = (C52490tr) tpVar.instance;
        str2.getClass();
        trVar2.f137797a |= 2;
        trVar2.f137801e = str2;
        tpVar.copyOnWrite();
        C52490tr trVar3 = (C52490tr) tpVar.instance;
        trVar3.f137797a |= 4;
        trVar3.f137802f = true;
        C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
        tsVar.copyOnWrite();
        C52492tt ttVar = (C52492tt) tsVar.instance;
        ffVar.getClass();
        ttVar.f137806b = ffVar;
        ttVar.f137805a |= 1;
        C52506ug ugVar = (C52506ug) C52507uh.f137838b.createBuilder();
        ugVar.mo53877a((C52490tr) tpVar.build());
        tsVar.copyOnWrite();
        C52492tt ttVar2 = (C52492tt) tsVar.instance;
        C52507uh uhVar = (C52507uh) ugVar.build();
        uhVar.getClass();
        ttVar2.f137807c = uhVar;
        ttVar2.f137805a |= 2;
        return (C52492tt) tsVar.build();
    }

    /* renamed from: b */
    public static Optional m61620b(Context context, C51098gh ghVar) {
        if (ghVar.f133012b != 1) {
            return Optional.empty();
        }
        C51058ev evVar = (C51058ev) ghVar.f133013c;
        if ((evVar.f132943a & 32) == 0) {
            return m61623e(context, evVar);
        }
        try {
            Intent parseUri = Intent.parseUri(evVar.f132949g, 0);
            if ((evVar.f132943a & 1) != 0) {
                parseUri.setPackage(evVar.f132944b);
            }
            return Optional.m71637of(parseUri);
        } catch (URISyntaxException unused) {
            return m61623e(context, evVar);
        }
    }

    /* renamed from: c */
    public static void m61621c(View view, C51941eu euVar, Context context, C51953ff ffVar, Fragment fragment, C32942a aVar) {
        C51940et etVar;
        if (euVar.f136275c == 24) {
            etVar = (C51940et) euVar.f136276d;
        } else {
            etVar = C51940et.f136268b;
        }
        if (etVar.f136270a.size() <= 0) {
            int i = euVar.f136275c;
            if (i == 22) {
                view.setOnClickListener(new C33228f(context, fragment, euVar));
            } else if (i == 1) {
                view.setOnClickListener(new C33229g(euVar, aVar, ffVar));
            }
        } else {
            view.setOnClickListener(new C33227e(euVar, aVar, ffVar));
        }
    }

    /* renamed from: e */
    private static Optional m61623e(Context context, C51058ev evVar) {
        Intent launchIntentForPackage;
        if ((evVar.f132943a & 1) == 0 || (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(evVar.f132944b)) == null) {
            return Optional.empty();
        }
        return Optional.m71637of(launchIntentForPackage);
    }

    /* renamed from: d */
    public static void m61622d(Context context, Fragment fragment, C51098gh ghVar) {
        if (ghVar == null || fragment == null) {
            ((C59052c) ((C59052c) f88865a.mo56226d()).mo56372aa(51178)).mo56386p("Unable to start activity due to null params");
            return;
        }
        Optional b = m61620b(context, ghVar);
        if (b.isPresent()) {
            C47709i.m84861a(fragment, (Intent) b.get());
        } else {
            ((C59052c) ((C59052c) f88865a.mo56226d()).mo56372aa(51180)).mo56386p("Unable to handle click for provider, as it does not resolve to an intent");
        }
    }
}

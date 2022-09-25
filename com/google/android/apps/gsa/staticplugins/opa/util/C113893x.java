package com.google.android.apps.gsa.staticplugins.opa.util;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.ajh;
import com.google.common.p4552o.aji;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.x */
/* compiled from: PG */
public final class C113893x {

    /* renamed from: a */
    private static final C59071e f315343a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.util.x");

    /* renamed from: a */
    public static boolean m188579a(Intent intent) {
        Uri data;
        if (!"android.intent.action.VIEW".equals(intent.getAction()) || (data = intent.getData()) == null || !"googleassistant".equals(data.getScheme())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m188580b(Uri uri, int i) {
        if (uri != null) {
            ajh ajh = (ajh) aji.f158874d.createBuilder();
            ajh.copyOnWrite();
            aji aji = (aji) ajh.instance;
            aji.f158877b = i - 1;
            aji.f158876a |= 1;
            String queryParameter = uri.getQueryParameter("src");
            if (queryParameter != null) {
                if (queryParameter.length() <= 10) {
                    ajh.copyOnWrite();
                    aji aji2 = (aji) ajh.instance;
                    aji2.f158876a |= 2;
                    aji2.f158878c = queryParameter;
                } else {
                    ((C59052c) ((C59052c) f315343a.mo56225c()).mo56372aa(28408)).mo56387q("Source exceeds maximum allowable length: %d", 10);
                }
            }
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 950;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            aji aji3 = (aji) ajh.build();
            aji3.getClass();
            ufVar2.f164193bu = aji3;
            ufVar2.f164252g |= 1073741824;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }
}

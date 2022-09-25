package com.google.android.apps.gsa.staticplugins.smartspace.p8766g;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.android.apps.gsa.smartspace.C92035ae;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.staticplugins.smartspace.p8764e.C117383a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50795cs;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.g.ad */
/* compiled from: PG */
final class C117395ad extends C90953s {

    /* renamed from: a */
    final /* synthetic */ C117396ae f325885a;

    /* renamed from: b */
    private final C92035ae f325886b;

    /* renamed from: c */
    private final Intent f325887c;

    /* renamed from: d */
    private final SettableFuture f325888d;

    /* renamed from: e */
    private final String f325889e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117395ad(C117396ae aeVar, C92035ae aeVar2, Intent intent, SettableFuture settableFuture, String str) {
        super("SmartspaceWeatherIH");
        this.f325885a = aeVar;
        this.f325886b = aeVar2;
        this.f325887c = intent;
        this.f325888d = settableFuture;
        this.f325889e = str;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo76757c(Object obj) {
        String str;
        C50731p pVar;
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            C58976aa aaVar = C58975e.f156826a;
            C92035ae aeVar = this.f325886b;
            int i = aeVar.f256572a;
            boolean z = aeVar.f256573b;
            String str2 = aeVar.f256574c;
            String str3 = aeVar.f256575d;
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            C92035ae aeVar2 = this.f325886b;
            aeVar2.f256576e = bitmap;
            C117396ae aeVar3 = this.f325885a;
            Intent intent = this.f325887c;
            String str4 = this.f325889e;
            long b = aeVar3.f325892c.mo26870b();
            C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
            cnVar.copyOnWrite();
            C50818do doVar = (C50818do) cnVar.instance;
            doVar.f132304a |= 4;
            doVar.f132307d = 1905757503;
            cnVar.copyOnWrite();
            C50818do doVar2 = (C50818do) cnVar.instance;
            doVar2.f132304a |= 1;
            doVar2.f132305b = false;
            cnVar.copyOnWrite();
            C50818do doVar3 = (C50818do) cnVar.instance;
            doVar3.f132304a |= 524288;
            doVar3.f132324u = true;
            C50792cp cpVar = C50792cp.SECONDARY;
            cnVar.copyOnWrite();
            C50818do doVar4 = (C50818do) cnVar.instance;
            doVar4.f132306c = cpVar.f132174e;
            doVar4.f132304a |= 2;
            if (aeVar2.f256573b) {
                str = aeVar3.f325890a.getString(R.string.temp_unit_celsius);
            } else {
                str = aeVar3.f325890a.getString(R.string.temp_unit_fahrenheit);
            }
            C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
            String string = aeVar3.f325890a.getString(R.string.temperature_display, new Object[]{Integer.toString(aeVar2.f256572a), str});
            C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
            aVar.copyOnWrite();
            C50723h hVar = (C50723h) aVar.instance;
            string.getClass();
            hVar.f132001a |= 1;
            hVar.f132002b = string;
            C50722g gVar = C50722g.UNSPECIFIED;
            aVar.copyOnWrite();
            C50723h hVar2 = (C50723h) aVar.instance;
            hVar2.f132003c = gVar.f131998e;
            hVar2.f132001a |= 2;
            cyVar.copyOnWrite();
            C50802cz czVar = (C50802cz) cyVar.instance;
            C50723h hVar3 = (C50723h) aVar.build();
            hVar3.getClass();
            czVar.f132239b = hVar3;
            czVar.f132238a |= 1;
            cnVar.copyOnWrite();
            C50818do doVar5 = (C50818do) cnVar.instance;
            C50802cz czVar2 = (C50802cz) cyVar.build();
            czVar2.getClass();
            doVar5.f132309f = czVar2;
            doVar5.f132304a |= 16;
            C50728m mVar = (C50728m) C50729n.f132007g.createBuilder();
            mVar.copyOnWrite();
            C50729n nVar = (C50729n) mVar.instance;
            nVar.f132009a |= 1;
            nVar.f132010b = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON";
            String str5 = aeVar2.f256574c;
            mVar.copyOnWrite();
            C50729n nVar2 = (C50729n) mVar.instance;
            str5.getClass();
            nVar2.f132009a |= 4;
            nVar2.f132011c = str5;
            String str6 = aeVar2.f256575d;
            mVar.copyOnWrite();
            C50729n nVar3 = (C50729n) mVar.instance;
            str6.getClass();
            nVar3.f132009a |= 8;
            nVar3.f132012d = str6;
            cnVar.copyOnWrite();
            C50818do doVar6 = (C50818do) cnVar.instance;
            C50729n nVar4 = (C50729n) mVar.build();
            nVar4.getClass();
            doVar6.f132314k = nVar4;
            doVar6.f132304a |= 512;
            C50794cr crVar = C50794cr.WEATHER;
            cnVar.copyOnWrite();
            C50818do doVar7 = (C50818do) cnVar.instance;
            doVar7.f132315l = crVar.f132222T;
            doVar7.f132304a |= 1024;
            if (aeVar3.f325891b.mo79746e(C89985ax.f246715aw)) {
                pVar = C50731p.START_ACTIVITY;
            } else {
                pVar = C50731p.BROADCAST;
            }
            C50731p pVar2 = pVar;
            Intent d = C92122r.m151186d(intent, (String) null, (String) null, C50794cr.WEATHER, pVar2, false);
            if (aeVar3.f325891b.mo79746e(C90014bt.f247312el) && !str4.isEmpty()) {
                d.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.ZERO_STATE_DEEP_LINK_ID_EXTRA", str4);
            }
            String str7 = aeVar2.f256578g;
            if (aeVar3.f325891b.mo79746e(C89985ax.f246718az) && str7 != null) {
                cnVar.copyOnWrite();
                C50818do doVar8 = (C50818do) cnVar.instance;
                doVar8.f132304a |= 268435456;
                doVar8.f132297C = str7;
            }
            C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
            qVar.copyOnWrite();
            C50733r rVar = (C50733r) qVar.instance;
            rVar.f132024b = pVar2.f132020d;
            rVar.f132023a |= 1;
            String uri = d.toUri(1);
            qVar.copyOnWrite();
            C50733r rVar2 = (C50733r) qVar.instance;
            uri.getClass();
            rVar2.f132023a |= 2;
            rVar2.f132025c = uri;
            cnVar.copyOnWrite();
            C50818do doVar9 = (C50818do) cnVar.instance;
            C50733r rVar3 = (C50733r) qVar.build();
            rVar3.getClass();
            doVar9.f132316m = rVar3;
            doVar9.f132304a |= 2048;
            cnVar.copyOnWrite();
            C50818do doVar10 = (C50818do) cnVar.instance;
            doVar10.f132304a |= 4096;
            doVar10.f132317n = b;
            cnVar.copyOnWrite();
            C50818do doVar11 = (C50818do) cnVar.instance;
            doVar11.f132304a |= 8192;
            doVar11.f132318o = b;
            long j = C131179d.f358770f;
            cnVar.copyOnWrite();
            C50818do doVar12 = (C50818do) cnVar.instance;
            doVar12.f132304a |= 16384;
            doVar12.f132319p = j;
            C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
            long j2 = C131179d.f358771g;
            csVar.copyOnWrite();
            C50796ct ctVar = (C50796ct) csVar.instance;
            ctVar.f132225a |= 1;
            ctVar.f132226b = b + j2;
            cnVar.copyOnWrite();
            C50818do doVar13 = (C50818do) cnVar.instance;
            C50796ct ctVar2 = (C50796ct) csVar.build();
            ctVar2.getClass();
            doVar13.f132320q = ctVar2;
            doVar13.f132304a |= 32768;
            this.f325888d.mo57356n(new C117383a((C50818do) cnVar.build(), bitmap));
            return;
        }
        this.f325888d.mo57356n(new C117383a());
    }
}

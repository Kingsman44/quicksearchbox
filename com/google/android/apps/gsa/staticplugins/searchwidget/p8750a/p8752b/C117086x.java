package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import android.content.ComponentName;
import android.content.Intent;
import android.util.Base64;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6995aq.C89269l;
import com.google.android.apps.gsa.shared.p6995aq.C89270m;
import com.google.android.apps.gsa.shared.p6995aq.C89272o;
import com.google.android.apps.gsa.shared.p6995aq.C89280w;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.gsa.staticplugins.searchwidget.C117241bi;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.x */
/* compiled from: PG */
final class C117086x implements C117052a {

    /* renamed from: a */
    final /* synthetic */ C117087y f325092a;

    public C117086x(C117087y yVar) {
        this.f325092a = yVar;
    }

    /* renamed from: a */
    public final void mo103121a() {
        C117062aj ajVar = this.f325092a.f325094b;
        ajVar.getClass();
        C89270m mVar = (C89270m) C89283z.f242073n.createBuilder();
        int a = C89280w.m145217a(((Integer) ((C117077o) ajVar.f325013a).f325065c.f63720e).intValue());
        mVar.copyOnWrite();
        C89283z zVar = (C89283z) mVar.instance;
        int i = a - 1;
        if (a != 0) {
            zVar.f242078d = i;
            zVar.f242075a |= 8;
            int intValue = ((Integer) ((C117077o) ajVar.f325013a).f325066d.f63720e).intValue();
            mVar.copyOnWrite();
            C89283z zVar2 = (C89283z) mVar.instance;
            zVar2.f242075a |= 1;
            zVar2.f242076b = intValue;
            int a2 = C89269l.m145214a(((Integer) ((C117077o) ajVar.f325013a).f325067e.f63720e).intValue());
            mVar.copyOnWrite();
            C89283z zVar3 = (C89283z) mVar.instance;
            int i2 = a2 - 1;
            if (a2 != 0) {
                zVar3.f242077c = i2;
                zVar3.f242075a |= 4;
                int a3 = C89272o.m145215a(((Integer) ((C117077o) ajVar.f325013a).f325070h.f63720e).intValue());
                mVar.copyOnWrite();
                C89283z zVar4 = (C89283z) mVar.instance;
                int i3 = a3 - 1;
                if (a3 != 0) {
                    zVar4.f242083i = i3;
                    zVar4.f242075a |= 16384;
                    int intValue2 = ((Integer) ((C117077o) ajVar.f325013a).f325063a.f63720e).intValue();
                    mVar.copyOnWrite();
                    C89283z zVar5 = (C89283z) mVar.instance;
                    zVar5.f242075a |= C89885b.HTTP_VALUE;
                    zVar5.f242087m = intValue2;
                    boolean booleanValue = ((Boolean) ((C117077o) ajVar.f325013a).f325068f.f63720e).booleanValue();
                    mVar.copyOnWrite();
                    C89283z zVar6 = (C89283z) mVar.instance;
                    zVar6.f242075a |= 512;
                    zVar6.f242080f = booleanValue;
                    boolean e = ajVar.mo103125e();
                    mVar.copyOnWrite();
                    C89283z zVar7 = (C89283z) mVar.instance;
                    zVar7.f242075a |= 4096;
                    zVar7.f242081g = e;
                    boolean booleanValue2 = ((Boolean) ((C117077o) ajVar.f325013a).f325069g.f63720e).booleanValue();
                    mVar.copyOnWrite();
                    C89283z zVar8 = (C89283z) mVar.instance;
                    zVar8.f242075a |= 128;
                    zVar8.f242079e = booleanValue2;
                    C89283z zVar9 = (C89283z) mVar.build();
                    C117241bi biVar = ajVar.f325014b;
                    if (zVar9.f242081g) {
                        String encodeToString = Base64.encodeToString(zVar9.toByteArray(), 8);
                        C86337q b = biVar.f325475a.mo80076b();
                        b.mo80073h("search_widget_style_proto", encodeToString);
                        b.apply();
                        C86337q b2 = biVar.f325475a.mo80076b();
                        b2.mo80067b("search_widget_customization_created", true);
                        b2.apply();
                    } else {
                        biVar.mo103216c();
                    }
                    Intent intent = new Intent("update-widget");
                    intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.googlequicksearchbox.SearchWidgetProvider"));
                    intent.addFlags(268435456);
                    this.f325092a.f325093a.sendBroadcast(intent);
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 1131;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                    this.f325092a.f325096d.mo80935a();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}

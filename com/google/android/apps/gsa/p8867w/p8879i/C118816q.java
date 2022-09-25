package com.google.android.apps.gsa.p8867w.p8879i;

import android.util.Base64;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p6995aq.C89269l;
import com.google.android.apps.gsa.shared.p6995aq.C89272o;
import com.google.android.apps.gsa.shared.p6995aq.C89280w;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.search.googleapp.searchwidget.C139135z;
import com.google.android.apps.search.googleapp.searchwidget.p10477a.C138924a;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139070av;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139073ay;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139074az;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139077bb;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139079bd;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139080be;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.w.i.q */
/* compiled from: PG */
public final class C118816q implements C138924a {

    /* renamed from: a */
    public final C86338r f331390a;

    public C118816q(C86338r rVar) {
        this.f331390a = rVar;
    }

    /* renamed from: a */
    public final C89283z mo103995a() {
        String string = this.f331390a.getString("search_widget_style_proto", (String) null);
        if (string == null) {
            return C89283z.f242073n;
        }
        try {
            return (C89283z) C62942bv.parseFrom((C62942bv) C89283z.f242073n, Base64.decode(string, 8), C62921ba.m95368a());
        } catch (C62974ct | IllegalArgumentException unused) {
            return C89283z.f242073n;
        }
    }

    /* renamed from: b */
    public final C60870cx mo103996b() {
        C139080be beVar;
        C89283z a = mo103995a();
        if (a.equals(C89283z.f242073n) || !a.f242081g) {
            beVar = C139135z.m226018d();
        } else {
            C139070av avVar = (C139070av) C139080be.f378248g.createBuilder();
            avVar.copyOnWrite();
            C139080be beVar2 = (C139080be) avVar.instance;
            beVar2.f378250a |= 1;
            beVar2.f378251b = true;
            int i = a.f242076b;
            avVar.copyOnWrite();
            C139080be beVar3 = (C139080be) avVar.instance;
            beVar3.f378250a |= 2;
            beVar3.f378252c = i;
            C139079bd bdVar = C139079bd.THEME_UNKNOWN;
            C139077bb bbVar = C139077bb.BAR_RADIUS_UNKNOWN;
            int a2 = C89269l.m145214a(a.f242077c);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 == 0) {
                C139077bb bbVar2 = C139077bb.BAR_RADIUS_2;
                avVar.copyOnWrite();
                C139080be beVar4 = (C139080be) avVar.instance;
                beVar4.f378253d = bbVar2.f378239e;
                beVar4.f378250a |= 4;
            } else if (i2 != 1) {
                C139077bb bbVar3 = C139077bb.BAR_RADIUS_24;
                avVar.copyOnWrite();
                C139080be beVar5 = (C139080be) avVar.instance;
                beVar5.f378253d = bbVar3.f378239e;
                beVar5.f378250a |= 4;
            } else {
                C139077bb bbVar4 = C139077bb.BAR_RADIUS_8;
                avVar.copyOnWrite();
                C139080be beVar6 = (C139080be) avVar.instance;
                beVar6.f378253d = bbVar4.f378239e;
                beVar6.f378250a |= 4;
            }
            int a3 = C89280w.m145217a(a.f242078d);
            if (a3 == 0) {
                a3 = 1;
            }
            if (a3 - 1 != 0) {
                avVar.copyOnWrite();
                C139080be beVar7 = (C139080be) avVar.instance;
                beVar7.f378254e = 1;
                beVar7.f378250a |= 8;
            } else {
                avVar.copyOnWrite();
                C139080be beVar8 = (C139080be) avVar.instance;
                beVar8.f378254e = 2;
                beVar8.f378250a |= 8;
            }
            C139073ay ayVar = (C139073ay) C139074az.f378227d.createBuilder();
            int a4 = C89272o.m145215a(a.f242083i);
            if (a4 == 0) {
                a4 = 1;
            }
            int i3 = a4 - 1;
            if (i3 == 0) {
                C139079bd bdVar2 = C139079bd.STANDARD_COLOR;
                ayVar.copyOnWrite();
                C139074az azVar = (C139074az) ayVar.instance;
                azVar.f378230b = bdVar2.f378247f;
                azVar.f378229a |= 1;
                avVar.copyOnWrite();
                C139080be beVar9 = (C139080be) avVar.instance;
                C139074az azVar2 = (C139074az) ayVar.build();
                azVar2.getClass();
                beVar9.f378255f = azVar2;
                beVar9.f378250a |= 16;
            } else if (i3 == 1) {
                C139079bd bdVar3 = C139079bd.MONOCHROME_LIGHT;
                ayVar.copyOnWrite();
                C139074az azVar3 = (C139074az) ayVar.instance;
                azVar3.f378230b = bdVar3.f378247f;
                azVar3.f378229a |= 1;
                avVar.copyOnWrite();
                C139080be beVar10 = (C139080be) avVar.instance;
                C139074az azVar4 = (C139074az) ayVar.build();
                azVar4.getClass();
                beVar10.f378255f = azVar4;
                beVar10.f378250a |= 16;
            } else if (i3 != 2) {
                C139079bd bdVar4 = C139079bd.CUSTOM_COLOR;
                ayVar.copyOnWrite();
                C139074az azVar5 = (C139074az) ayVar.instance;
                azVar5.f378230b = bdVar4.f378247f;
                azVar5.f378229a |= 1;
                int i4 = a.f242087m;
                ayVar.copyOnWrite();
                C139074az azVar6 = (C139074az) ayVar.instance;
                azVar6.f378229a |= 2;
                azVar6.f378231c = i4;
                avVar.copyOnWrite();
                C139080be beVar11 = (C139080be) avVar.instance;
                C139074az azVar7 = (C139074az) ayVar.build();
                azVar7.getClass();
                beVar11.f378255f = azVar7;
                beVar11.f378250a |= 16;
            } else {
                C139079bd bdVar5 = C139079bd.MONOCHROME_DARK;
                ayVar.copyOnWrite();
                C139074az azVar8 = (C139074az) ayVar.instance;
                azVar8.f378230b = bdVar5.f378247f;
                azVar8.f378229a |= 1;
                avVar.copyOnWrite();
                C139080be beVar12 = (C139080be) avVar.instance;
                C139074az azVar9 = (C139074az) ayVar.build();
                azVar9.getClass();
                beVar12.f378255f = azVar9;
                beVar12.f378250a |= 16;
            }
            beVar = (C139080be) avVar.build();
        }
        return C60856cj.m92900i(beVar);
    }
}

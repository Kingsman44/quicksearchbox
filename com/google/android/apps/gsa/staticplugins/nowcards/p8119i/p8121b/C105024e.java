package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7082ah.C90210a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7082ah.C90211b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7082ah.C90212c;
import com.google.android.apps.gsa.shared.monet.p7116h.C90332a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.C91070p;
import com.google.android.apps.p489g.p494d.C9212cu;
import com.google.android.apps.p489g.p494d.C9214cw;
import com.google.android.apps.p489g.p494d.C9215cx;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.e */
/* compiled from: PG */
public final class C105024e {

    /* renamed from: a */
    private static final C59071e f292661a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.i.b.e");

    /* renamed from: b */
    private final Context f292662b;

    /* renamed from: c */
    private final C86338r f292663c;

    /* renamed from: d */
    private final C8142xb f292664d;

    public C105024e(Context context, C86338r rVar, C8142xb xbVar) {
        this.f292662b = context;
        this.f292663c = rVar;
        this.f292664d = xbVar;
    }

    /* renamed from: a */
    public final void mo94479a(C9215cx cxVar, long j, long j2, View view, C7718hj hjVar) {
        C23129y yVar;
        ActivityOptions activityOptions;
        int i = cxVar.f31840b;
        if (i == 1 || i == 2) {
            C90210a aVar = (C90210a) C90211b.f252001n.createBuilder();
            aVar.copyOnWrite();
            C90211b bVar = (C90211b) aVar.instance;
            bVar.f252003a |= 2;
            bVar.f252005c = j;
            String str = cxVar.f31848j;
            aVar.copyOnWrite();
            C90211b bVar2 = (C90211b) aVar.instance;
            str.getClass();
            bVar2.f252003a |= 8;
            bVar2.f252010h = str;
            aVar.copyOnWrite();
            C90211b bVar3 = (C90211b) aVar.instance;
            bVar3.f252003a |= 4;
            bVar3.f252009g = j2;
            aVar.copyOnWrite();
            C90211b bVar4 = (C90211b) aVar.instance;
            hjVar.getClass();
            bVar4.f252014l = hjVar;
            bVar4.f252003a |= 128;
            C8142xb xbVar = this.f292664d;
            aVar.copyOnWrite();
            C90211b bVar5 = (C90211b) aVar.instance;
            bVar5.f252015m = xbVar.f28649u;
            bVar5.f252003a |= 256;
            String string = this.f292663c.getString(C90507o.f253011a, (String) null);
            if (string != null) {
                aVar.copyOnWrite();
                C90211b bVar6 = (C90211b) aVar.instance;
                bVar6.f252003a |= 64;
                bVar6.f252013k = string;
            }
            if ((cxVar.f31839a & 16) != 0) {
                float f = cxVar.f31843e;
                aVar.copyOnWrite();
                C90211b bVar7 = (C90211b) aVar.instance;
                bVar7.f252003a |= 32;
                bVar7.f252012j = f;
            }
            int i2 = cxVar.f31840b;
            if (i2 == 1) {
                String str2 = ((C9214cw) cxVar.f31841c).f31836b;
                aVar.copyOnWrite();
                C90211b bVar8 = (C90211b) aVar.instance;
                str2.getClass();
                bVar8.f252003a |= 1;
                bVar8.f252004b = str2;
            } else if (i2 == 2) {
                try {
                    C9212cu cuVar = (C9212cu) C62942bv.parseFrom((C62942bv) C9212cu.f31820l, ((C9212cu) cxVar.f31841c).toByteArray());
                    aVar.copyOnWrite();
                    C90211b bVar9 = (C90211b) aVar.instance;
                    cuVar.getClass();
                    bVar9.f252011i = cuVar;
                    bVar9.f252003a |= 16;
                } catch (C62974ct e) {
                    ((C59052c) ((C59052c) ((C59052c) f292661a.mo56225c()).mo56382g(e)).mo56372aa(22102)).mo56386p("Could not parse the ThirdPartyVideo proto, no video will be shown.");
                }
            }
            C62971cq cqVar = cxVar.f31847i;
            aVar.copyOnWrite();
            C90211b bVar10 = (C90211b) aVar.instance;
            C62971cq cqVar2 = bVar10.f252006d;
            if (!cqVar2.mo58948c()) {
                bVar10.f252006d = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) bVar10.f252006d);
            C62971cq cqVar3 = cxVar.f31846h;
            aVar.copyOnWrite();
            C90211b bVar11 = (C90211b) aVar.instance;
            C62971cq cqVar4 = bVar11.f252007e;
            if (!cqVar4.mo58948c()) {
                bVar11.f252007e = C62942bv.mutableCopy(cqVar4);
            }
            C62947c.addAll((Iterable) cqVar3, (List) bVar11.f252007e);
            C62971cq cqVar5 = cxVar.f31844f;
            aVar.copyOnWrite();
            C90211b bVar12 = (C90211b) aVar.instance;
            C62971cq cqVar6 = bVar12.f252008f;
            if (!cqVar6.mo58948c()) {
                bVar12.f252008f = C62942bv.mutableCopy(cqVar6);
            }
            C62947c.addAll((Iterable) cqVar5, (List) bVar12.f252008f);
            if (cxVar.f31840b == 1) {
                yVar = C90212c.f252017a;
            } else {
                yVar = C90212c.f252018b;
            }
            Intent a = C90334c.m146886a(C90332a.CONFIG_CHANGES.f252281i, yVar, C23245b.m43556a((C90211b) aVar.build()));
            if (C8142xb.ACETONE_OVERLAY.equals(this.f292664d) || C8142xb.ACETONE_OVERLAY_MOMO.equals(this.f292664d)) {
                a.addFlags(67108864);
            } else {
                a.addFlags(C89885b.S3REQUEST_VALUE);
            }
            Activity a2 = C91070p.m148776a(this.f292662b);
            if (a2 == null || view == null) {
                activityOptions = ActivityOptions.makeCustomAnimation(this.f292662b, 17432576, 17432577);
            } else {
                activityOptions = ActivityOptions.makeSceneTransitionAnimation(a2, view, "OneTapVideoTransitionSharedElement");
            }
            this.f292662b.startActivity(a, activityOptions.toBundle());
            return;
        }
        ((C59052c) ((C59052c) f292661a.mo56225c()).mo56372aa(22103)).mo56386p("startOneTapVideo was called with a PlayVideoAction with no video!");
    }
}

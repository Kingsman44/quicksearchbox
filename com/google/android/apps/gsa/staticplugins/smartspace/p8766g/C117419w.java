package com.google.android.apps.gsa.staticplugins.smartspace.p8766g;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3886c.C50781ce;
import com.google.assistant.p3886c.C50782cf;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50812di;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50717b;
import com.google.assistant.p3886c.p3888b.C50719d;
import com.google.assistant.p3886c.p3888b.C50720e;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.common.p4535g.C59203do;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57021m;
import com.google.protobuf.C62940bt;
import dagger.C68214a;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.g.w */
/* compiled from: PG */
public final class C117419w extends C117414r {
    public C117419w(C91189au auVar, Context context, C86124t tVar, C21370a aVar, C68214a aVar2) {
        super(auVar, context, tVar, aVar, aVar2);
    }

    /* renamed from: i */
    private static String m195140i(double d) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(Locale.getDefault());
        if (d < 1.0d) {
            decimalFormat.applyPattern("0.####");
        } else {
            int log10 = (int) Math.log10(d);
            if (log10 >= 4) {
                decimalFormat.applyPattern("###");
            } else {
                char[] cArr = new char[(4 - log10)];
                Arrays.fill(cArr, '#');
                decimalFormat.applyPattern("###.".concat(new String(cArr)));
            }
        }
        return decimalFormat.format(d);
    }

    /* renamed from: a */
    public final long mo103291a(C57017i iVar) {
        return this.f325922c.mo26870b() + iVar.f152214i;
    }

    /* renamed from: b */
    public final C50794cr mo103282b() {
        return C50794cr.STOCK_PRICE_CHANGE;
    }

    /* renamed from: e */
    public final boolean mo103285e(Object obj) {
        return super.mo103285e(obj) && ((C57017i) obj).f152207b == 10;
    }

    /* renamed from: f */
    public final Optional mo103293f(C57017i iVar) {
        C57021m mVar;
        if (iVar.f152207b == 10) {
            mVar = (C57021m) iVar.f152208c;
        } else {
            mVar = C57021m.f152232e;
        }
        if ((mVar.f152234a & 32) == 0) {
            return Optional.m71637of(BitmapFactory.decodeResource(this.f325920a.getResources(), R.drawable.quantum_gm_ic_finance_white_24));
        }
        if (mVar.f152237d > C59203do.f157270a) {
            return Optional.m71637of(BitmapFactory.decodeResource(this.f325920a.getResources(), R.drawable.quantum_gm_ic_trending_up_white_24));
        }
        return Optional.m71637of(BitmapFactory.decodeResource(this.f325920a.getResources(), R.drawable.quantum_gm_ic_trending_down_white_24));
    }

    /* renamed from: g */
    public final Optional mo103294g(C57017i iVar) {
        return Optional.empty();
    }

    /* renamed from: h */
    public final Optional mo103295h(C57017i iVar) {
        C57021m mVar;
        C57017i iVar2 = iVar;
        if (iVar2.f152207b == 10) {
            mVar = (C57021m) iVar2.f152208c;
        } else {
            mVar = C57021m.f152232e;
        }
        C50812di diVar = (C50812di) C50813dj.f132278a.createBuilder();
        C62940bt btVar = C50782cf.f132151d;
        C50781ce ceVar = (C50781ce) C50782cf.f132150c.createBuilder();
        ceVar.copyOnWrite();
        C50782cf cfVar = (C50782cf) ceVar.instance;
        mVar.getClass();
        cfVar.f132154b = mVar;
        cfVar.f132153a |= 1;
        diVar.mo58885m(btVar, (C50782cf) ceVar.build());
        C50813dj djVar = (C50813dj) diVar.build();
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        String str = iVar2.f152210e;
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        str.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = str;
        C50722g gVar = C50722g.UNSPECIFIED;
        aVar.copyOnWrite();
        C50723h hVar2 = (C50723h) aVar.instance;
        hVar2.f132003c = gVar.f131998e;
        hVar2.f132001a |= 2;
        C50723h hVar3 = (C50723h) aVar.build();
        C50716a aVar2 = (C50716a) C50723h.f131999e.createBuilder();
        String str2 = iVar2.f152211f;
        aVar2.copyOnWrite();
        C50723h hVar4 = (C50723h) aVar2.instance;
        str2.getClass();
        hVar4.f132001a |= 1;
        hVar4.f132002b = str2;
        C50722g gVar2 = C50722g.UNSPECIFIED;
        aVar2.copyOnWrite();
        C50723h hVar5 = (C50723h) aVar2.instance;
        hVar5.f132003c = gVar2.f131998e;
        hVar5.f132001a |= 2;
        C50723h hVar6 = (C50723h) aVar2.build();
        if (!this.f325921b.mo79746e(C90014bt.f247659lN)) {
            return Optional.empty();
        }
        C50717b bVar = (C50717b) C50720e.f131985f.createBuilder();
        C50722g gVar3 = C50722g.UNSPECIFIED;
        bVar.copyOnWrite();
        C50720e eVar = (C50720e) bVar.instance;
        eVar.f131989c = gVar3.f131998e;
        eVar.f131987a |= 2;
        C50719d dVar = C50719d.EVENT_START_TIME;
        bVar.copyOnWrite();
        C50720e eVar2 = (C50720e) bVar.instance;
        eVar2.f131990d = dVar.f131984e;
        eVar2.f131987a |= 4;
        bVar.copyOnWrite();
        C50720e eVar3 = (C50720e) bVar.instance;
        eVar3.f131987a |= 8;
        eVar3.f131991e = true;
        C50716a aVar3 = (C50716a) C50723h.f131999e.createBuilder();
        Locale locale = Locale.getDefault();
        double d = (double) mVar.f152236c;
        Double.isNaN(d);
        String format = String.format(locale, "%s%s · %s", new Object[]{mVar.f152235b, m195140i(d / 1000000.0d), this.f325920a.getResources().getString(R.string.stock_price_event_time, new Object[]{"%1$s"})});
        aVar3.copyOnWrite();
        C50723h hVar7 = (C50723h) aVar3.instance;
        format.getClass();
        hVar7.f132001a |= 1;
        hVar7.f132002b = format;
        aVar3.mo53428a((C50720e) bVar.build());
        C50722g gVar4 = C50722g.UNSPECIFIED;
        aVar3.copyOnWrite();
        C50723h hVar8 = (C50723h) aVar3.instance;
        hVar8.f132003c = gVar4.f131998e;
        hVar8.f132001a |= 2;
        C50723h hVar9 = (C50723h) aVar3.build();
        CharSequence a = C89407a.m145418a(this.f325920a, iVar2.f152213h, 0, false);
        C50716a aVar4 = (C50716a) C50723h.f131999e.createBuilder();
        Locale locale2 = Locale.getDefault();
        double d2 = (double) mVar.f152236c;
        Double.isNaN(d2);
        String format2 = String.format(locale2, "%s%s · %s", new Object[]{mVar.f152235b, m195140i(d2 / 1000000.0d), a});
        aVar4.copyOnWrite();
        C50723h hVar10 = (C50723h) aVar4.instance;
        format2.getClass();
        hVar10.f132001a |= 1;
        hVar10.f132002b = format2;
        C50722g gVar5 = C50722g.UNSPECIFIED;
        aVar4.copyOnWrite();
        C50723h hVar11 = (C50723h) aVar4.instance;
        hVar11.f132003c = gVar5.f131998e;
        hVar11.f132001a |= 2;
        C50723h hVar12 = (C50723h) aVar4.build();
        C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
        C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
        cyVar.copyOnWrite();
        C50802cz czVar = (C50802cz) cyVar.instance;
        hVar3.getClass();
        czVar.f132239b = hVar3;
        czVar.f132238a |= 1;
        if (true != this.f325921b.mo79746e(C90014bt.f247658lM)) {
            hVar9 = hVar6;
        }
        cyVar.copyOnWrite();
        C50802cz czVar2 = (C50802cz) cyVar.instance;
        hVar9.getClass();
        czVar2.f132241d = hVar9;
        czVar2.f132238a |= 4;
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        C50802cz czVar3 = (C50802cz) cyVar.build();
        czVar3.getClass();
        doVar.f132310g = czVar3;
        doVar.f132304a |= 32;
        C50801cy cyVar2 = (C50801cy) C50802cz.f132236g.createBuilder();
        cyVar2.copyOnWrite();
        C50802cz czVar4 = (C50802cz) cyVar2.instance;
        hVar3.getClass();
        czVar4.f132239b = hVar3;
        czVar4.f132238a |= 1;
        if (true == this.f325921b.mo79746e(C90014bt.f247658lM)) {
            hVar6 = hVar12;
        }
        cyVar2.copyOnWrite();
        C50802cz czVar5 = (C50802cz) cyVar2.instance;
        hVar6.getClass();
        czVar5.f132241d = hVar6;
        czVar5.f132238a |= 4;
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        C50802cz czVar6 = (C50802cz) cyVar2.build();
        czVar6.getClass();
        doVar2.f132313j = czVar6;
        doVar2.f132304a |= 256;
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        djVar.getClass();
        doVar3.f132329z = djVar;
        doVar3.f132304a |= 33554432;
        cnVar.copyOnWrite();
        C50818do doVar4 = (C50818do) cnVar.instance;
        doVar4.f132304a |= 524288;
        doVar4.f132324u = true;
        return Optional.m71637of((C50818do) cnVar.build());
    }
}

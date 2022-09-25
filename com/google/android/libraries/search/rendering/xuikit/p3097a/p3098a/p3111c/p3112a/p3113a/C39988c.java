package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3111c.p3112a.p3113a;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.p4535g.C59203do;
import com.google.protobuf.C62921ba;
import com.google.protos.p5146w.p5149b.p5154b.p5155a.p5156a.C65945a;
import com.google.protos.p5146w.p5149b.p5154b.p5155a.p5156a.C65946b;
import java.math.BigDecimal;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.c.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C39988c implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ C39990e f105116a;

    /* renamed from: b */
    public final /* synthetic */ String f105117b;

    /* renamed from: c */
    public final /* synthetic */ String f105118c;

    /* renamed from: d */
    public final /* synthetic */ boolean f105119d;

    /* renamed from: e */
    public final /* synthetic */ double f105120e;

    /* renamed from: f */
    public final /* synthetic */ int f105121f;

    public /* synthetic */ C39988c(C39990e eVar, String str, String str2, boolean z, double d, int i) {
        this.f105116a = eVar;
        this.f105117b = str;
        this.f105118c = str2;
        this.f105119d = z;
        this.f105120e = d;
        this.f105121f = i;
    }

    /* renamed from: a */
    public final Object mo25875a(Object obj) {
        double d;
        String str;
        C39990e eVar = this.f105116a;
        String str2 = this.f105117b;
        String str3 = this.f105118c;
        boolean z = this.f105119d;
        double d2 = this.f105120e;
        int i = this.f105121f;
        String str4 = ((C65946b) ((C65945a) ((C65945a) C65946b.f179363d.createBuilder()).mergeFrom((byte[]) ((C58833ax) obj).mo56109e(new byte[0]), C62921ba.m95368a())).build()).f179366b;
        C65945a d3 = eVar.mo42107d(str2);
        C65945a d4 = eVar.mo42107d(str3);
        if (str4.isEmpty()) {
            d3.copyOnWrite();
            C65946b bVar = (C65946b) d3.instance;
            bVar.f179365a |= 1;
            bVar.f179366b = BuildConfig.FLAVOR;
            d3.copyOnWrite();
            C65946b bVar2 = (C65946b) d3.instance;
            bVar2.f179365a |= 2;
            bVar2.f179367c = BuildConfig.FLAVOR;
            d4.copyOnWrite();
            C65946b bVar3 = (C65946b) d4.instance;
            bVar3.f179365a |= 1;
            bVar3.f179366b = BuildConfig.FLAVOR;
            d4.copyOnWrite();
            C65946b bVar4 = (C65946b) d4.instance;
            bVar4.f179365a |= 2;
            bVar4.f179367c = BuildConfig.FLAVOR;
        } else if (str4.equals(".")) {
            d3.copyOnWrite();
            C65946b bVar5 = (C65946b) d3.instance;
            str4.getClass();
            bVar5.f179365a |= 2;
            bVar5.f179367c = str4;
        } else {
            try {
                if (Double.parseDouble(str4) >= C59203do.f157270a) {
                    if (z) {
                        d = Double.parseDouble(str4) * d2;
                    } else {
                        d = Double.parseDouble(str4) / d2;
                    }
                    if (Math.rint(d) == d) {
                        str = Long.toString((long) d);
                    } else {
                        str = BigDecimal.valueOf(d).setScale(i, 4).stripTrailingZeros().toPlainString();
                    }
                    d3.copyOnWrite();
                    C65946b bVar6 = (C65946b) d3.instance;
                    str4.getClass();
                    bVar6.f179365a |= 1;
                    bVar6.f179366b = str4;
                    d3.copyOnWrite();
                    C65946b bVar7 = (C65946b) d3.instance;
                    str4.getClass();
                    bVar7.f179365a |= 2;
                    bVar7.f179367c = str4;
                    d4.copyOnWrite();
                    C65946b bVar8 = (C65946b) d4.instance;
                    str.getClass();
                    bVar8.f179365a |= 1;
                    bVar8.f179366b = str;
                    d4.copyOnWrite();
                    C65946b bVar9 = (C65946b) d4.instance;
                    str.getClass();
                    bVar9.f179365a |= 2;
                    bVar9.f179367c = str;
                }
            } catch (NumberFormatException unused) {
            }
            String str5 = ((C65946b) d3.build()).f179367c;
            d3.copyOnWrite();
            C65946b bVar10 = (C65946b) d3.instance;
            str5.getClass();
            bVar10.f179365a |= 1;
            bVar10.f179366b = str5;
        }
        eVar.f105123a.mo26140c(str2, ((C65946b) d3.build()).toByteArray());
        eVar.f105123a.mo26140c(str3, ((C65946b) d4.build()).toByteArray());
        C69794a aVar = C69874i.f186267a;
        C69822d dVar = C70101a.f186847o;
        return aVar;
    }
}

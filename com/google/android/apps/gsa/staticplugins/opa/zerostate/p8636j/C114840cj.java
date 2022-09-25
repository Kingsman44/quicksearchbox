package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3994s.p3995a.C53424nj;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4574q.C60740s;
import com.google.p4242bp.p4253e.p4254a.C56188h;
import com.google.protos.p4755ab.p4756a.C63101a;
import com.google.protos.p4816ai.C63186a;
import com.google.protos.p4816ai.C63194b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.cj */
/* compiled from: PG */
public final class C114840cj {

    /* renamed from: a */
    private static final C59071e f318618a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.j.cj");

    /* renamed from: b */
    private static final C58495hd f318619b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_DEFAULT, C56188h.STANDARD);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_AREA_50K, C56188h.STANDARD);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_FAVICON_16, C56188h.STANDARD);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_FAVICON_32, C56188h.STANDARD);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_FAVICON_64, C56188h.STANDARD);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_AREA_50K_ALPHA, C56188h.STANDARD);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_AREA_50K_SYNTHETIC_ALPHA, C56188h.STANDARD);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_TENOR_30K_OPTIMIZED_THUMBNAIL_GIF, C56188h.STANDARD);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_TENOR_45K_OPTIMIZED_90P_GIF, C56188h.STANDARD);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_TENOR_50K_OPTIMIZED_100P_GIF, C56188h.STANDARD);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_TENOR_50K_OPTIMIZED_100W_GIF, C56188h.STANDARD);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_TENOR_45K_PREVIEW_GIF, C56188h.STANDARD);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_TENOR_250K_GIF, C56188h.LARGE);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_TENOR_100K_OPTIMIZED_GIF, C56188h.LARGE);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_TENOR_100K_OPTIMIZED_200P_GIF, C56188h.LARGE);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_TENOR_100K_OPTIMIZED_200W_GIF, C56188h.LARGE);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_400, C56188h.LARGE);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_AREA_300K, C56188h.LARGE);
        gzVar.mo55429h(C63101a.THUMBNAIL_TYPE_ORIGINAL_HQ_LICENSED, C56188h.LARGE);
        f318619b = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public final C63194b mo101654a(C53424nj njVar) {
        C56188h hVar;
        C63186a aVar = (C63186a) C63194b.f170728d.createBuilder();
        if ((njVar.f140201a & 2) != 0) {
            C51012dc dcVar = njVar.f140203c;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            if ((dcVar.f132815a & 2) != 0) {
                String k = C60740s.m92701a(dcVar.f132817c).mo57131c().mo57143k(C59002s.f156871a);
                if (k != null) {
                    if (k.isEmpty()) {
                        hVar = C56188h.STANDARD;
                    } else {
                        try {
                            C63101a a = C63101a.m96179a(Integer.parseInt(k));
                            if (a == null) {
                                hVar = C56188h.UNKNOWN;
                            } else {
                                hVar = (C56188h) f318619b.get(a);
                                if (hVar == null) {
                                    hVar = C56188h.UNKNOWN;
                                }
                            }
                        } catch (NumberFormatException e) {
                            ((C59052c) ((C59052c) ((C59052c) f318618a.mo56226d()).mo56382g(e)).mo56372aa(29577)).mo56386p("Ignoring non-numeric thumbnail URL param.");
                        }
                    }
                    aVar.copyOnWrite();
                    C63194b bVar = (C63194b) aVar.instance;
                    bVar.f170733c = hVar.f149709f;
                    bVar.f170731a |= 4;
                }
                hVar = C56188h.STANDARD;
                aVar.copyOnWrite();
                C63194b bVar2 = (C63194b) aVar.instance;
                bVar2.f170733c = hVar.f149709f;
                bVar2.f170731a |= 4;
            }
        }
        if ((njVar.f140201a & 1) != 0) {
            int i = njVar.f140202b;
            aVar.copyOnWrite();
            C63194b bVar3 = (C63194b) aVar.instance;
            bVar3.f170731a |= 1;
            bVar3.f170732b = i;
        }
        return (C63194b) aVar.build();
    }
}

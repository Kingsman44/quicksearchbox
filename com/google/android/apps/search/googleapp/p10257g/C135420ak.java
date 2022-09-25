package com.google.android.apps.search.googleapp.p10257g;

import android.graphics.Color;
import android.net.Uri;
import com.google.android.apps.search.googleapp.p10257g.p10259b.C135426a;
import com.google.android.apps.search.googleapp.p10257g.p10259b.C135427b;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4552o.C60415pj;
import com.google.common.p4552o.C60416pk;
import com.google.p337aa.C6617d;
import com.google.p337aa.p338a.C6604f;
import com.google.p337aa.p338a.C6606h;
import com.google.p337aa.p338a.C6610l;
import com.google.p4479cg.C58070b;
import com.google.protobuf.C62942bv;
import java.util.Set;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.ak */
/* compiled from: PG */
public final class C135420ak {

    /* renamed from: a */
    private static final C59071e f368946a = C59071e.m91331h();

    /* renamed from: a */
    public static final C135414ae m219576a(C6617d dVar, boolean z, C135419aj ajVar, C135431f fVar) {
        C6610l lVar;
        C135412ac acVar;
        C135413ad adVar;
        int a;
        int a2;
        C6617d dVar2 = dVar;
        C135419aj ajVar2 = ajVar;
        C135431f fVar2 = fVar;
        C69664n.m101061g(dVar2, "doodle");
        C69664n.m101061g(ajVar2, "imageSize");
        C69664n.m101061g(dVar2, "doodle");
        if (z) {
            lVar = (C6610l) ajVar2.f368945d.mo5761a(dVar2);
        } else {
            lVar = (C6610l) ajVar2.f368944c.mo5761a(dVar2);
        }
        C6610l lVar2 = lVar;
        Uri a3 = C135427b.m219590a(lVar2.f19633b);
        C69664n.m101060f(a3, "makeDoodleUrlAbsolute(doodleImage.url)");
        Integer valueOf = (lVar2.f19632a & 256) != 0 ? Integer.valueOf(Color.parseColor(lVar2.f19635d)) : null;
        String str = dVar2.f19653c;
        C69664n.m101060f(str, "doodle.altText");
        int i = dVar2.f19664n;
        int a4 = C6604f.m17999a(i);
        if (a4 != 0 && a4 == 6) {
            acVar = C135453z.f369018a;
        } else {
            int i2 = dVar2.f19663m;
            int a5 = C6606h.m18000a(i2);
            if (a5 != 0 && a5 == 4 && (a2 = C6604f.m17999a(i)) != 0 && a2 == 2) {
                String str2 = dVar2.f19657g;
                C69664n.m101060f(str2, "fullpageInteractiveUrl");
                acVar = new C135452y(str2);
            } else {
                int a6 = C6606h.m18000a(i2);
                if (a6 == 0 || a6 != 3 || (a = C6604f.m17999a(i)) == 0 || a == 1) {
                    String str3 = dVar2.f19655e;
                    C69664n.m101060f(str3, "targetUrl");
                    String str4 = dVar2.f19656f;
                    C69664n.m101060f(str4, "searchUrl");
                    acVar = new C135410aa(str3, str4);
                } else {
                    String str5 = dVar2.f19655e;
                    C69664n.m101060f(str5, "targetUrl");
                    acVar = new C135411ab(str5);
                }
            }
        }
        C60415pj pjVar = (C60415pj) C60416pk.f163490d.createBuilder();
        C69664n.m101060f(pjVar, "newBuilder()");
        if ((dVar2.f19651a & 67108864) != 0) {
            int i3 = dVar2.f19667q;
            pjVar.copyOnWrite();
            C60416pk pkVar = (C60416pk) pjVar.instance;
            pkVar.f163492a |= 1;
            pkVar.f163493b = i3;
        }
        if ((lVar2.f19632a & 4096) != 0) {
            int i4 = lVar2.f19638g;
            pjVar.copyOnWrite();
            C60416pk pkVar2 = (C60416pk) pjVar.instance;
            pkVar2.f163492a |= 2;
            pkVar2.f163494c = i4;
        }
        C62942bv build = pjVar.build();
        C69664n.m101060f(build, "doodleLogData.build()");
        C60416pk pkVar3 = (C60416pk) build;
        if (dVar2.f19669s && fVar2 != null) {
            C135430e a7 = C135430e.m219591a(fVar2.f368967b);
            if (a7 == null) {
                a7 = C135430e.UNKNOWN;
            }
            if (a7 != C135430e.PIXEL_SPLUS_MINUS_ONE) {
                String str6 = lVar2.f19637f;
                C69664n.m101060f(str6, "doodleImage.overlayIconColor");
                if (str6.length() > 0) {
                    String str7 = dVar2.f19654d;
                    C69664n.m101060f(str7, "doodle.shareText");
                    if (str7.length() > 0) {
                        C58070b bVar = fVar2.f368969d;
                        if (bVar == null) {
                            bVar = C58070b.f155212e;
                        }
                        C69664n.m101060f(bVar, "doodleFragmentParams!!.customLogoTint");
                        int a8 = C135426a.m219589a(bVar);
                        Set p = C69531o.m100939p(new C135430e[]{C135430e.SAMSUNG_MINUS_ONE, C135430e.SAMSUNG_MINUS_ONE_POST_MVP});
                        C135430e a9 = C135430e.m219591a(fVar2.f368967b);
                        if (a9 == null) {
                            a9 = C135430e.UNKNOWN;
                        }
                        boolean contains = p.contains(a9);
                        if (a8 == 0 || !contains) {
                            String str8 = lVar2.f19637f;
                            C69664n.m101060f(str8, "doodleImage.overlayIconColor");
                            if (str8.length() == 0) {
                                a8 = 0;
                            } else {
                                a8 = Color.parseColor(lVar2.f19637f);
                            }
                        }
                        String str9 = dVar2.f19653c;
                        C69664n.m101060f(str9, "doodle.altText");
                        String str10 = dVar2.f19654d;
                        C69664n.m101060f(str10, "doodle.shareText");
                        adVar = new C135413ad(str9, str10, a8);
                        return new C135414ae(lVar2, a3, valueOf, str, acVar, pkVar3, adVar);
                    }
                }
                C59052c cVar = (C59052c) f368946a.mo56226d();
                cVar.mo56378ag(C38505d.f101864b, 149815953);
                String str11 = lVar2.f19637f;
                String str12 = dVar2.f19654d;
                cVar.mo56379ah(new C59094n(40564));
                cVar.mo56354G("Server said to show share button but it returned invalid params. Overlay icon color: %s; Share text: %s", str11, str12);
            }
        }
        adVar = null;
        return new C135414ae(lVar2, a3, valueOf, str, acVar, pkVar3, adVar);
    }
}

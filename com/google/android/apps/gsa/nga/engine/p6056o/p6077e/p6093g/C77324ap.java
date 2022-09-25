package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import com.google.android.apps.gsa.nga.engine.au.av;
import com.google.android.apps.gsa.nga.engine.au.d;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76575as;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.assistant.p3817aj.p3818a.p3819a.C49190b;
import com.google.assistant.p3817aj.p3818a.p3819a.C49192d;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.ap */
/* compiled from: PG */
public final class C77324ap {

    /* renamed from: a */
    public static final /* synthetic */ int f213249a = 0;

    /* renamed from: b */
    private static final C58495hd f213250b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C49190b.CATEGORY_ENTERTAINMENT, 87539);
        gzVar.mo55429h(C49190b.CATEGORY_FOOD_AND_DRINK, 87543);
        gzVar.mo55429h(C49190b.CATEGORY_MUSIC_AND_AUDIO, 87541);
        gzVar.mo55429h(C49190b.CATEGORY_NEWS_AND_MAGAZINES, 87542);
        gzVar.mo55429h(C49190b.CATEGORY_SHOPPING, 87537);
        gzVar.mo55429h(C49190b.CATEGORY_SOCIAL, 87540);
        gzVar.mo55429h(C49190b.CATEGORY_TRAVEL, 87538);
        gzVar.mo55429h(C49190b.GOOGLE_IMAGE_SEARCH, 87535);
        gzVar.mo55429h(C49190b.GOOGLE_MAPS, 87531);
        gzVar.mo55429h(C49190b.GOOGLE_PHOTOS, 87532);
        gzVar.mo55429h(C49190b.GOOGLE_PLAY_STORE, 87533);
        gzVar.mo55429h(C49190b.GOOGLE_WEB_SEARCH, 87534);
        f213250b = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static C58485gu m124096a(C76590bg bgVar, String str, av avVar) {
        Optional optional;
        C58480gp e = C58485gu.m89837e();
        boolean booleanValue = ((Boolean) bgVar.mo72265g(C76575as.f211814a, "isAssistedBrowse").orElse(false)).booleanValue();
        boolean isPresent = bgVar.mo72265g(C76564ah.f211801a, "App_search_classifier_origin").filter(C77322an.f213247a).isPresent();
        if (!booleanValue) {
            e.mo55395g(77913);
        } else if (isPresent) {
            e.mo55395g(82918);
            e.mo55395g(97043);
        } else {
            e.mo55395g(76548);
        }
        if (((Boolean) bgVar.mo72265g(C76575as.f211814a, "isQueryPatternMatched").orElse(false)).booleanValue()) {
            e.mo55395g(87551);
        }
        C49192d dVar = avVar.c(str).f117b;
        if (dVar != null) {
            C58495hd hdVar = f213250b;
            C49190b a = C49190b.m85387a(dVar.f127202b);
            if (a == null) {
                a = C49190b.OTHER;
            }
            optional = Optional.ofNullable((Integer) hdVar.get(a));
        } else {
            optional = Optional.empty();
        }
        Objects.requireNonNull(e);
        optional.ifPresent(new C77323ao(e));
        return e.mo55394f();
    }

    /* renamed from: b */
    public static C58485gu m124097b(C76590bg bgVar, String str, av avVar, d dVar) {
        Optional optional;
        C58480gp e = C58485gu.m89837e();
        e.mo55395g(Integer.valueOf(true != ((Boolean) bgVar.mo72265g(C76575as.f211814a, "isAssistedBrowse").orElse(false)).booleanValue() ? 77913 : 76548));
        if (((Boolean) bgVar.mo72265g(C76575as.f211814a, "isQueryPatternMatched").orElse(false)).booleanValue()) {
            e.mo55395g(87551);
        }
        C49192d dVar2 = avVar.d(str, dVar).f117b;
        if (dVar2 != null) {
            C58495hd hdVar = f213250b;
            C49190b a = C49190b.m85387a(dVar2.f127202b);
            if (a == null) {
                a = C49190b.OTHER;
            }
            optional = Optional.ofNullable((Integer) hdVar.get(a));
        } else {
            optional = Optional.empty();
        }
        Objects.requireNonNull(e);
        optional.ifPresent(new C77323ao(e));
        return e.mo55394f();
    }
}

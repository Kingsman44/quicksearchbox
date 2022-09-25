package com.bumptech.glide.p282c.p284b;

import com.bumptech.glide.C5997p;
import com.google.apps.tiktok.media.contrib.cronet.C47447b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.c.b.j */
/* compiled from: PG */
final class C5538j {

    /* renamed from: a */
    public static final Map f16773a;

    /* renamed from: b */
    public static final C58881cr f16774b = C58886cw.m90973a(new C5531c());

    /* renamed from: c */
    public final C5536h f16775c = new C5536h(this);

    /* renamed from: d */
    public final Map f16776d = new HashMap();

    /* renamed from: e */
    public final C47447b f16777e;

    static {
        EnumMap enumMap = new EnumMap(C5997p.class);
        f16773a = enumMap;
        enumMap.put(C5997p.IMMEDIATE, 4);
        enumMap.put(C5997p.HIGH, 3);
        enumMap.put(C5997p.NORMAL, 2);
        enumMap.put(C5997p.LOW, 1);
    }

    public C5538j(C47447b bVar) {
        this.f16777e = bVar;
    }
}

package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aiv */
/* compiled from: PG */
final class aiv extends agt {

    /* renamed from: a */
    final /* synthetic */ aiw f20721a;

    /* renamed from: b */
    private final agt f20722b;

    /* renamed from: c */
    private final agt f20723c;

    /* renamed from: d */
    private final aid f20724d;

    public aiv(aiw aiw, age age, Type type, agt agt, Type type2, agt agt2, aid aid) {
        this.f20721a = aiw;
        this.f20722b = new ajj(age, agt, type);
        this.f20723c = new ajj(age, agt2, type2);
        this.f20724d = aid;
    }

    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        int p = alb.mo14838p();
        if (p == 9) {
            alb.mo14831i();
            return null;
        }
        Map map = (Map) this.f20724d.mo14768a();
        if (p == 1) {
            alb.mo14822a();
            while (alb.mo14827e()) {
                alb.mo14822a();
                Object read = this.f20722b.read(alb);
                if (map.put(read, this.f20723c.read(alb)) == null) {
                    alb.mo14823b();
                } else {
                    new StringBuilder("duplicate key: ").append(read);
                    throw new agq("duplicate key: ".concat(String.valueOf(read)));
                }
            }
            alb.mo14823b();
        } else {
            alb.mo14824c();
            while (alb.mo14827e()) {
                aht.f20669a.mo14776a(alb);
                Object read2 = this.f20722b.read(alb);
                if (map.put(read2, this.f20723c.read(alb)) != null) {
                    new StringBuilder("duplicate key: ").append(read2);
                    throw new agq("duplicate key: ".concat(String.valueOf(read2)));
                }
            }
            alb.mo14826d();
        }
        return map;
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            ald.mo14851g();
            return;
        }
        boolean z = this.f20721a.f20725a;
        ald.mo14845c();
        for (Map.Entry entry : map.entrySet()) {
            ald.mo14849f(String.valueOf(entry.getKey()));
            this.f20723c.write(ald, entry.getValue());
        }
        ald.mo14848e();
    }
}

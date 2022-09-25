package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.android.apps.gsa.assistant.shared.appactions.g.a;
import com.google.android.apps.gsa.assistant.shared.appactions.g.g;
import com.google.android.apps.gsa.assistant.shared.appactions.p5807g.C73821h;
import com.google.assistant.p3825an.p3830c.p3831a.C49275au;
import com.google.assistant.p3825an.p3830c.p3831a.C49277aw;
import com.google.assistant.p3825an.p3830c.p3831a.C49279ay;
import com.google.assistant.p3825an.p3830c.p3831a.C49330g;
import com.google.assistant.p3861at.C49823ah;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49836au;
import com.google.assistant.p3861at.C49838aw;
import com.google.assistant.p3861at.C49843ba;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.j */
/* compiled from: PG */
public final /* synthetic */ class C10352j implements Function {

    /* renamed from: a */
    public final /* synthetic */ C10325al f35036a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f35037b;

    public /* synthetic */ C10352j(C10325al alVar, C58495hd hdVar) {
        this.f35036a = alVar;
        this.f35037b = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58485gu guVar;
        C49838aw awVar;
        int i;
        int i2;
        Stream.Builder builder;
        C49838aw awVar2;
        Optional optional;
        C10325al alVar = this.f35036a;
        C58495hd hdVar = this.f35037b;
        C49836au auVar = (C49836au) obj;
        C49838aw awVar3 = auVar.f129499a;
        if (awVar3 == null) {
            awVar3 = C49838aw.f129504g;
        }
        C58485gu guVar2 = (C58485gu) hdVar.get(awVar3.f129507b);
        C49838aw awVar4 = auVar.f129499a;
        if (awVar4 == null) {
            awVar4 = C49838aw.f129504g;
        }
        Stream.Builder builder2 = Stream.CC.builder();
        Iterator it = auVar.f129500b.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            C49826ak akVar = (C49826ak) it.next();
            if (!C10325al.m25261j(akVar)) {
                optional = Optional.empty();
            } else {
                if (!akVar.f129476m.isEmpty()) {
                    C49843ba baVar = akVar.f129479p;
                    if (baVar == null) {
                        baVar = C49843ba.f129533d;
                    }
                    int b = C49277aw.m85400b(baVar.f129537c);
                    if (b == 0 || b != 5) {
                        if (guVar2 != null) {
                            int size = guVar2.size();
                            while (true) {
                                if (i3 >= size) {
                                    optional = Optional.empty();
                                    break;
                                }
                                C49330g gVar = (C49330g) guVar2.get(i3);
                                i3++;
                                if (gVar.f127496g.equals(akVar.f129476m)) {
                                    Long valueOf = Long.valueOf(alVar.f34998m.incrementAndGet());
                                    ConcurrentMap concurrentMap = alVar.f34997l;
                                    C49275au auVar2 = gVar.f127495f;
                                    if (auVar2 == null) {
                                        auVar2 = C49275au.f127371c;
                                    }
                                    concurrentMap.put(valueOf, auVar2);
                                    long longValue = valueOf.longValue();
                                    C49823ah ahVar = (C49823ah) akVar.toBuilder();
                                    String str = gVar.f127492c;
                                    ahVar.copyOnWrite();
                                    C49826ak akVar2 = (C49826ak) ahVar.instance;
                                    str.getClass();
                                    akVar2.f129464a |= 32;
                                    akVar2.f129471h = str;
                                    optional = Optional.m71637of(new C10337ax(longValue, (C49826ak) ahVar.build()));
                                }
                            }
                        } else {
                            optional = Optional.empty();
                        }
                    }
                }
                optional = Optional.m71637of(new C10337ax(alVar.f34998m.incrementAndGet(), akVar));
            }
            Objects.requireNonNull(builder2);
            optional.ifPresent(new C10358p(builder2));
        }
        Stream.Builder builder3 = Stream.CC.builder();
        int i4 = 0;
        for (C49826ak akVar3 : auVar.f129500b) {
            if (((long) i4) >= alVar.f34995j) {
                break;
            } else if (!C10325al.m25261j(akVar3) && !akVar3.f129476m.isEmpty()) {
                C49843ba baVar2 = akVar3.f129479p;
                if (baVar2 == null) {
                    baVar2 = C49843ba.f129533d;
                }
                int b2 = C49279ay.m85402b(baVar2.f129536b);
                if (b2 != 0 && b2 == 3) {
                    a aVar = alVar.f34989d;
                    C49838aw awVar5 = auVar.f129499a;
                    if (awVar5 == null) {
                        awVar5 = C49838aw.f129504g;
                    }
                    if (aVar.b(awVar5.f129507b, akVar3.f129476m)) {
                        i4++;
                        builder3.add(new C10337ax(alVar.f34998m.incrementAndGet(), akVar3));
                    }
                }
            }
        }
        Stream map = Collection.EL.stream(auVar.f129500b).filter(Predicate.CC.not(C10359q.f35045a)).filter(C10360r.f35046a).map(new C10361s(alVar));
        if (guVar2 == null) {
            guVar = (C58485gu) Stream.CC.m71936of((T[]) new Stream[]{builder2.build(), builder3.build(), map}).flatMap(C10362t.f35048a).collect(C58370cn.f155946a);
            awVar = awVar4;
        } else {
            Stream.Builder builder4 = Stream.CC.builder();
            int size2 = guVar2.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size2) {
                C49330g gVar2 = (C49330g) guVar2.get(i6);
                int i7 = gVar2.f127498i;
                int b3 = C49279ay.m85402b(i7);
                if (b3 != 0 && b3 == 4) {
                    awVar2 = awVar4;
                    builder = builder2;
                    i2 = size2;
                    i = i6;
                    if (((long) i5) >= alVar.f34994i) {
                        i6 = i + 1;
                        awVar4 = awVar2;
                        builder2 = builder;
                        size2 = i2;
                    }
                } else {
                    awVar2 = awVar4;
                    builder = builder2;
                    i2 = size2;
                    i = i6;
                }
                int b4 = C49279ay.m85402b(i7);
                if ((b4 == 0 || b4 != 3 || ((long) i4) < alVar.f34995j) && alVar.f34989d.b(gVar2.f127491b, gVar2.f127496g)) {
                    Optional c = C73821h.m108392c(gVar2);
                    if (c.isPresent() && !Collection.EL.stream(auVar.f129500b).anyMatch(new g(gVar2))) {
                        Long valueOf2 = Long.valueOf(alVar.f34998m.incrementAndGet());
                        ConcurrentMap concurrentMap2 = alVar.f34997l;
                        C49275au auVar3 = gVar2.f127495f;
                        if (auVar3 == null) {
                            auVar3 = C49275au.f127371c;
                        }
                        concurrentMap2.put(valueOf2, auVar3);
                        int i8 = gVar2.f127498i;
                        int b5 = C49279ay.m85402b(i8);
                        if (b5 != 0 && b5 == 4) {
                            builder4.add(new C10337ax(valueOf2.longValue(), (C49826ak) c.get()));
                            i5++;
                        } else {
                            int b6 = C49279ay.m85402b(i8);
                            if (b6 != 0 && b6 == 3) {
                                builder3.add(new C10337ax(valueOf2.longValue(), (C49826ak) c.get()));
                                i4++;
                            }
                        }
                    }
                }
                i6 = i + 1;
                awVar4 = awVar2;
                builder2 = builder;
                size2 = i2;
            }
            awVar = awVar4;
            guVar = (C58485gu) Stream.CC.m71936of((T[]) new Stream[]{builder2.build(), builder4.build(), builder3.build(), map}).flatMap(C10363u.f35049a).collect(C58370cn.f155946a);
        }
        return C10339az.m25295e(awVar, guVar, C58485gu.m89842j(auVar.f129501c));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6225y.p6226a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78810l;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.engine.warmactions.C79566g;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79576h;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79583o;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79591w;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79593y;
import com.google.android.apps.gsa.nga.engine.warmactions.p6259k.C79720c;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80762ej;
import com.google.android.apps.gsa.nga.shared.p6417x.C83346ag;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128539d;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128541f;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128542g;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128543h;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4535g.C59203do;
import com.google.common.p4543n.p4545b.C59366ag;
import com.google.common.p4543n.p4545b.C59367ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.y.a.a */
/* compiled from: PG */
public final /* synthetic */ class C78885a implements C83346ag {

    /* renamed from: a */
    public static final /* synthetic */ C78885a f217080a = new C78885a();

    private /* synthetic */ C78885a() {
    }

    /* renamed from: a */
    public final Object mo73128a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        double d;
        double[] dArr;
        int[] iArr;
        C79566g gVar = (C79566g) obj2;
        Locale locale = (Locale) obj5;
        int h = ((C78245d) obj3).mo73180b().mo73175h();
        C128542g gVar2 = (C128542g) C128543h.f353464i.createBuilder();
        boolean b = ((C80762ej) obj4).mo74563b();
        gVar2.copyOnWrite();
        C128543h hVar = (C128543h) gVar2.instance;
        hVar.f353466a |= 8;
        hVar.f353471f = b;
        boolean contains = C78892h.f217088b.contains(C78810l.m126595a(((C78815q) obj6).f216929a));
        gVar2.copyOnWrite();
        C128543h hVar2 = (C128543h) gVar2.instance;
        hVar2.f353466a |= 16;
        boolean z = true;
        hVar2.f353472g = !contains;
        if (!((Boolean) obj).booleanValue()) {
            return C78892h.f217089c;
        }
        C128539d dVar = C128539d.WARM_ACTIONS_UI_ACTION_CATEGORY_UNSPECIFIED;
        int b2 = gVar.mo74018b();
        int i = b2 - 1;
        if (b2 == 0) {
            throw null;
        } else if (i == 1) {
            C128541f fVar = C128541f.ANSWERING;
            gVar2.copyOnWrite();
            C128543h hVar3 = (C128543h) gVar2.instance;
            hVar3.f353467b = fVar.f353463f;
            hVar3.f353466a |= 1;
            gVar2.copyOnWrite();
            C128543h hVar4 = (C128543h) gVar2.instance;
            hVar4.f353466a |= 32;
            hVar4.f353473h = true;
            return (C128543h) gVar2.build();
        } else if (C79720c.m127814b(gVar.mo74017a()).isEmpty()) {
            return C78892h.f217089c;
        } else {
            C79570b d2 = gVar.mo74138d();
            C79570b d3 = gVar.mo74138d();
            C79583o oVar = (C79583o) Collections.unmodifiableMap(gVar.mo74017a().f218319b).get(Integer.valueOf(d3.f218339o));
            C58838bb.m90867b(oVar, "No config for MWW context: %s", d3.name());
            C79593y yVar = oVar.f218362c;
            if (yVar == null) {
                yVar = C79593y.f218377c;
            }
            C128541f fVar2 = C128541f.LISTENING;
            gVar2.copyOnWrite();
            C128543h hVar5 = (C128543h) gVar2.instance;
            hVar5.f353467b = fVar2.f353463f;
            hVar5.f353466a |= 1;
            gVar2.copyOnWrite();
            C128543h hVar6 = (C128543h) gVar2.instance;
            hVar6.f353468c = d2.f218339o;
            int i2 = 2;
            hVar6.f353466a |= 2;
            C62971cq cqVar = yVar.f218379a;
            int a = C79576h.m127652a(yVar.f218380b);
            if (a == 0) {
                a = 1;
            }
            if (a == 1) {
                ((C59052c) ((C59052c) C78892h.f217087a.mo56226d()).mo56372aa(5426)).mo56386p("#MWW Biasing strategy unspecified, defaulting to uniform.");
            } else {
                i2 = a;
            }
            if (i2 - 1 != 1) {
                Random random = C59367ah.f157568a;
                Iterable<Number> iterable = (Iterable) Collection.EL.stream(cqVar).map(C78891g.f217086a).collect(C58370cn.f155946a);
                int b3 = C58557jl.m90121b(C58557jl.m90124e(iterable, new C59366ag()));
                dArr = new double[b3];
                iArr = new int[b3];
                d = 0.0d;
                int i3 = 0;
                int i4 = 0;
                for (Number number : iterable) {
                    if (number.doubleValue() > C59203do.f157270a) {
                        d += number.doubleValue();
                        dArr[i4] = d;
                        iArr[i4] = i4 + i3;
                        i4++;
                    } else {
                        i3++;
                    }
                }
                C58838bb.m90884s(d > C59203do.f157270a, "Total sum of weights must be positive.");
            } else {
                Random random2 = C59367ah.f157568a;
                Iterable<Number> iterable2 = (Iterable) Collection.EL.stream(cqVar).map(C78890f.f217085a).collect(C58370cn.f155946a);
                int b4 = C58557jl.m90121b(C58557jl.m90124e(iterable2, new C59366ag()));
                dArr = new double[b4];
                iArr = new int[b4];
                d = 0.0d;
                int i5 = 0;
                int i6 = 0;
                for (Number number2 : iterable2) {
                    if (number2.doubleValue() > C59203do.f157270a) {
                        d += number2.doubleValue();
                        dArr[i6] = d;
                        iArr[i6] = i6 + i5;
                        i6++;
                    } else {
                        i5++;
                    }
                }
                C58838bb.m90884s(d > C59203do.f157270a, "Total sum of weights must be positive.");
            }
            int binarySearch = Arrays.binarySearch(dArr, C59367ah.f157568a.nextDouble() * d);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            String str = ((C79591w) cqVar.get(iArr[binarySearch])).f218375b;
            gVar2.copyOnWrite();
            C128543h hVar7 = (C128543h) gVar2.instance;
            str.getClass();
            hVar7.f353466a |= 4;
            hVar7.f353469d = str;
            C58485gu guVar = (C58485gu) Collection.EL.stream(yVar.f218379a).filter(C78887c.f217082a).map(C78888d.f217083a).map(new C78889e(locale)).collect(C58370cn.f155946a);
            gVar2.copyOnWrite();
            C128543h hVar8 = (C128543h) gVar2.instance;
            C62971cq cqVar2 = hVar8.f353470e;
            if (!cqVar2.mo58948c()) {
                hVar8.f353470e = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) guVar, (List) hVar8.f353470e);
            if (h != 4) {
                z = false;
            }
            if (h != 0) {
                gVar2.copyOnWrite();
                C128543h hVar9 = (C128543h) gVar2.instance;
                hVar9.f353466a |= 32;
                hVar9.f353473h = z;
                return (C128543h) gVar2.build();
            }
            throw null;
        }
    }
}

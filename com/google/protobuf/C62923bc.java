package com.google.protobuf;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.bc */
/* compiled from: PG */
final class C62923bc extends C62922bb {
    /* renamed from: a */
    public final int mo58833a(Map.Entry entry) {
        return ((C62939bs) entry.getKey()).f169964b;
    }

    /* renamed from: b */
    public final C62926bf mo58834b(Object obj) {
        return ((C62937bq) obj).f169962ag;
    }

    /* renamed from: c */
    public final C62926bf mo58835c(Object obj) {
        return ((C62937bq) obj).mo58886k();
    }

    /* renamed from: d */
    public final Object mo58836d(C62921ba baVar, MessageLite messageLite, int i) {
        return baVar.mo58830c(messageLite, i);
    }

    /* renamed from: e */
    public final Object mo58837e(C63016eh ehVar, Object obj, C62921ba baVar, C62926bf bfVar, Object obj2, C63044fi fiVar) {
        Object obj3;
        Object l;
        ArrayList arrayList;
        C62940bt btVar = (C62940bt) obj;
        C62939bs bsVar = btVar.f169971d;
        int i = bsVar.f169964b;
        if (!bsVar.f169966d || !bsVar.f169967e) {
            if (bsVar.f169965c != C63066gd.ENUM) {
                switch (btVar.f169971d.f169965c.ordinal()) {
                    case 0:
                        obj3 = Double.valueOf(ehVar.mo58728a());
                        break;
                    case 1:
                        obj3 = Float.valueOf(ehVar.mo58729b());
                        break;
                    case 2:
                        obj3 = Long.valueOf(ehVar.mo58739l());
                        break;
                    case 3:
                        obj3 = Long.valueOf(ehVar.mo58742o());
                        break;
                    case 4:
                        obj3 = Integer.valueOf(ehVar.mo58734g());
                        break;
                    case 5:
                        obj3 = Long.valueOf(ehVar.mo58738k());
                        break;
                    case 6:
                        obj3 = Integer.valueOf(ehVar.mo58733f());
                        break;
                    case 7:
                        obj3 = Boolean.valueOf(ehVar.mo58726T());
                        break;
                    case 8:
                        obj3 = ehVar.mo58748v();
                        break;
                    case 9:
                        obj3 = ehVar.mo58744r(btVar.f169970c.getClass(), baVar);
                        break;
                    case 10:
                        obj3 = ehVar.mo58746t(btVar.f169970c.getClass(), baVar);
                        break;
                    case 11:
                        obj3 = ehVar.mo58743q();
                        break;
                    case 12:
                        obj3 = Integer.valueOf(ehVar.mo58737j());
                        break;
                    case 13:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 14:
                        obj3 = Integer.valueOf(ehVar.mo58735h());
                        break;
                    case 15:
                        obj3 = Long.valueOf(ehVar.mo58740m());
                        break;
                    case 16:
                        obj3 = Integer.valueOf(ehVar.mo58736i());
                        break;
                    case 17:
                        obj3 = Long.valueOf(ehVar.mo58741n());
                        break;
                    default:
                        obj3 = null;
                        break;
                }
            } else {
                int g = ehVar.mo58734g();
                if (btVar.f169971d.f169963a.mo23993a(g) == null) {
                    return C63023eo.m95840r(i, g, obj2, fiVar);
                }
                obj3 = Integer.valueOf(g);
            }
            C62939bs bsVar2 = btVar.f169971d;
            if (bsVar2.f169966d) {
                bfVar.mo58855m(bsVar2, obj3);
            } else {
                int ordinal = bsVar2.f169965c.ordinal();
                if ((ordinal == 9 || ordinal == 10) && (l = bfVar.mo58854l(btVar.f169971d)) != null) {
                    obj3 = C62972cr.m95545e(l, obj3);
                }
                bfVar.mo58856n(btVar.f169971d, obj3);
            }
        } else {
            C63066gd gdVar = C63066gd.DOUBLE;
            switch (btVar.f169971d.f169965c.ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    ehVar.mo58708A(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    ehVar.mo58712E(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    ehVar.mo58715H(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    ehVar.mo58725S(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    ehVar.mo58714G(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    ehVar.mo58711D(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    ehVar.mo58710C(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    ehVar.mo58751y(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    ehVar.mo58724R(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    ehVar.mo58709B(arrayList);
                    obj2 = C63023eo.m95838p(i, arrayList, btVar.f169971d.f169963a, obj2, fiVar);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    ehVar.mo58718K(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    ehVar.mo58719L(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    ehVar.mo58720M(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    ehVar.mo58721N(arrayList);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: ".concat(String.valueOf(String.valueOf(btVar.f169971d.f169965c))));
            }
            bfVar.mo58856n(btVar.f169971d, arrayList);
        }
        return obj2;
    }

    /* renamed from: f */
    public final void mo58838f(Object obj) {
        ((C62937bq) obj).f169962ag.mo58849f();
    }

    /* renamed from: g */
    public final void mo58839g(C63016eh ehVar, Object obj, C62921ba baVar, C62926bf bfVar) {
        C62940bt btVar = (C62940bt) obj;
        bfVar.mo58856n(btVar.f169971d, ehVar.mo58746t(btVar.f169970c.getClass(), baVar));
    }

    /* renamed from: h */
    public final void mo58840h(C63088z zVar, Object obj, C62921ba baVar, C62926bf bfVar) {
        C62940bt btVar = (C62940bt) obj;
        MessageLite buildPartial = btVar.f169970c.newBuilderForType().buildPartial();
        ByteBuffer wrap = ByteBuffer.wrap(zVar.mo59174N());
        if (wrap.hasArray()) {
            C63073k kVar = new C63073k(wrap);
            C63013ee.f170090a.mo59017a(buildPartial.getClass()).mo58998h(buildPartial, kVar, baVar);
            bfVar.mo58856n(btVar.f169971d, buildPartial);
            if (kVar.mo58730c() != Integer.MAX_VALUE) {
                throw C62974ct.m95551a();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    /* renamed from: i */
    public final boolean mo58841i(MessageLite messageLite) {
        return messageLite instanceof C62937bq;
    }

    /* renamed from: j */
    public final void mo58842j(C62907ao aoVar, Map.Entry entry) {
        C62939bs bsVar = (C62939bs) entry.getKey();
        if (bsVar.f169966d) {
            C63066gd gdVar = C63066gd.DOUBLE;
            switch (bsVar.f169965c.ordinal()) {
                case 0:
                    C63023eo.m95805I(bsVar.f169964b, (List) entry.getValue(), aoVar, bsVar.f169967e);
                    return;
                case 1:
                    C63023eo.m95809M(bsVar.f169964b, (List) entry.getValue(), aoVar, bsVar.f169967e);
                    return;
                case 2:
                    C63023eo.m95812P(bsVar.f169964b, (List) entry.getValue(), aoVar, bsVar.f169967e);
                    return;
                case 3:
                    C63023eo.m95820X(bsVar.f169964b, (List) entry.getValue(), aoVar, bsVar.f169967e);
                    return;
                case 4:
                    C63023eo.m95811O(bsVar.f169964b, (List) entry.getValue(), aoVar, bsVar.f169967e);
                    return;
                case 5:
                    C63023eo.m95808L(bsVar.f169964b, (List) entry.getValue(), aoVar, bsVar.f169967e);
                    return;
                case 6:
                    C63023eo.m95807K(bsVar.f169964b, (List) entry.getValue(), aoVar, bsVar.f169967e);
                    return;
                case 7:
                    C63023eo.m95803G(bsVar.f169964b, (List) entry.getValue(), aoVar, bsVar.f169967e);
                    return;
                case 8:
                    C63023eo.m95818V(bsVar.f169964b, (List) entry.getValue(), aoVar);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C63023eo.m95810N(bsVar.f169964b, (List) entry.getValue(), aoVar, C63013ee.f170090a.mo59017a(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C63023eo.m95813Q(bsVar.f169964b, (List) entry.getValue(), aoVar, C63013ee.f170090a.mo59017a(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    C63023eo.m95804H(bsVar.f169964b, (List) entry.getValue(), aoVar);
                    return;
                case 12:
                    C63023eo.m95819W(bsVar.f169964b, (List) entry.getValue(), aoVar, bsVar.f169967e);
                    return;
                case 13:
                    C63023eo.m95811O(bsVar.f169964b, (List) entry.getValue(), aoVar, bsVar.f169967e);
                    return;
                case 14:
                    C63023eo.m95814R(bsVar.f169964b, (List) entry.getValue(), aoVar, bsVar.f169967e);
                    return;
                case 15:
                    C63023eo.m95815S(bsVar.f169964b, (List) entry.getValue(), aoVar, bsVar.f169967e);
                    return;
                case 16:
                    C63023eo.m95816T(bsVar.f169964b, (List) entry.getValue(), aoVar, bsVar.f169967e);
                    return;
                case 17:
                    C63023eo.m95817U(bsVar.f169964b, (List) entry.getValue(), aoVar, bsVar.f169967e);
                    return;
                default:
                    return;
            }
        } else {
            C63066gd gdVar2 = C63066gd.DOUBLE;
            switch (bsVar.f169965c.ordinal()) {
                case 0:
                    aoVar.f169854a.mo58768k(bsVar.f169964b, Double.doubleToRawLongBits(((Double) entry.getValue()).doubleValue()));
                    return;
                case 1:
                    aoVar.f169854a.mo58766i(bsVar.f169964b, Float.floatToRawIntBits(((Float) entry.getValue()).floatValue()));
                    return;
                case 2:
                    aoVar.f169854a.mo58781x(bsVar.f169964b, ((Long) entry.getValue()).longValue());
                    return;
                case 3:
                    aoVar.f169854a.mo58781x(bsVar.f169964b, ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    aoVar.f169854a.mo58770m(bsVar.f169964b, ((Integer) entry.getValue()).intValue());
                    return;
                case 5:
                    aoVar.f169854a.mo58768k(bsVar.f169964b, ((Long) entry.getValue()).longValue());
                    return;
                case 6:
                    aoVar.f169854a.mo58766i(bsVar.f169964b, ((Integer) entry.getValue()).intValue());
                    return;
                case 7:
                    aoVar.f169854a.mo58761Z(bsVar.f169964b, ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 8:
                    aoVar.f169854a.mo58776s(bsVar.f169964b, (String) entry.getValue());
                    return;
                case 9:
                    aoVar.mo58790a(bsVar.f169964b, entry.getValue(), C63013ee.f170090a.mo59017a(entry.getValue().getClass()));
                    return;
                case 10:
                    aoVar.mo58791b(bsVar.f169964b, entry.getValue(), C63013ee.f170090a.mo59017a(entry.getValue().getClass()));
                    return;
                case 11:
                    aoVar.f169854a.mo58763aa(bsVar.f169964b, (C63088z) entry.getValue());
                    return;
                case 12:
                    aoVar.f169854a.mo58779v(bsVar.f169964b, ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    aoVar.f169854a.mo58770m(bsVar.f169964b, ((Integer) entry.getValue()).intValue());
                    return;
                case 14:
                    aoVar.f169854a.mo58766i(bsVar.f169964b, ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    aoVar.f169854a.mo58768k(bsVar.f169964b, ((Long) entry.getValue()).longValue());
                    return;
                case 16:
                    int i = bsVar.f169964b;
                    int intValue = ((Integer) entry.getValue()).intValue();
                    aoVar.f169854a.mo58779v(i, (intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    int i2 = bsVar.f169964b;
                    long longValue = ((Long) entry.getValue()).longValue();
                    aoVar.f169854a.mo58781x(i2, (longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        }
    }
}

package com.google.android.apps.gsa.search.core.p6805i;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90075e;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.apps.gsa.shared.p7066m.C90130i;
import com.google.android.apps.gsa.shared.p7066m.C90131j;
import com.google.android.apps.gsa.shared.p7066m.p7067a.C89961b;
import com.google.common.p4535g.C59203do;
import com.google.common.p4552o.C59828gu;
import com.google.common.p4552o.C59829gv;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.search.core.i.o */
/* compiled from: PG */
public final /* synthetic */ class C86119o implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f232766a;

    /* renamed from: b */
    public final /* synthetic */ Map f232767b;

    public /* synthetic */ C86119o(Map map, Map map2) {
        this.f232766a = map;
        this.f232767b = map2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        Long l;
        Double d;
        String str3;
        String str4;
        Map map = this.f232766a;
        Map map2 = this.f232767b;
        C86113i iVar = (C86113i) obj;
        int i = iVar.f232755e;
        Map a = C90131j.m146672a();
        Integer valueOf = Integer.valueOf(i);
        C90130i iVar2 = (C90130i) a.get(valueOf);
        if (iVar2 != null) {
            str = String.valueOf(iVar2.f251804a);
        } else {
            str = String.valueOf(i);
        }
        C86113i iVar3 = (C86113i) map.get(valueOf);
        C86113i iVar4 = (C86113i) map2.get(valueOf);
        int i2 = iVar.f232755e;
        Map a2 = C90131j.m146672a();
        Integer valueOf2 = Integer.valueOf(i2);
        C90130i iVar5 = (C90130i) a2.get(valueOf2);
        Object obj2 = null;
        Object obj3 = iVar5 != null ? iVar5.f251805b : null;
        if (!(obj3 instanceof C90048d)) {
            int i3 = iVar.f232752b;
            if (i3 == 2) {
                bool = null;
            } else {
                boolean z = obj3 instanceof C90102f;
                if (z || i3 == 4) {
                    Long valueOf3 = z ? Long.valueOf(((C90102f) obj3).f250557b) : null;
                    long j = 0;
                    Long valueOf4 = Long.valueOf(i3 == 4 ? ((Long) iVar.f232753c).longValue() : 0);
                    if (iVar3 == null) {
                        l = null;
                    } else {
                        l = Long.valueOf(iVar3.f232752b == 4 ? ((Long) iVar3.f232753c).longValue() : 0);
                    }
                    if (iVar4 != null) {
                        if (iVar4.f232752b == 4) {
                            j = ((Long) iVar4.f232753c).longValue();
                        }
                        obj2 = Long.valueOf(j);
                    }
                    str2 = C86124t.m138481g(valueOf2, valueOf3, valueOf4, l, obj2);
                    C59828gu guVar = (C59828gu) C59829gv.f161673d.createBuilder();
                    guVar.copyOnWrite();
                    C59829gv gvVar = (C59829gv) guVar.instance;
                    str.getClass();
                    gvVar.f161675a |= 1;
                    gvVar.f161676b = str;
                    guVar.copyOnWrite();
                    C59829gv gvVar2 = (C59829gv) guVar.instance;
                    gvVar2.f161675a |= 2;
                    gvVar2.f161677c = str2;
                    return (C59829gv) guVar.build();
                }
                boolean z2 = obj3 instanceof C90075e;
                if (z2 || i3 == 7) {
                    Double valueOf5 = z2 ? Double.valueOf(((C90075e) obj3).f249779b) : null;
                    double d2 = C59203do.f157270a;
                    Double valueOf6 = Double.valueOf(i3 == 7 ? ((Double) iVar.f232753c).doubleValue() : 0.0d);
                    if (iVar3 == null) {
                        d = null;
                    } else {
                        d = Double.valueOf(iVar3.f232752b == 7 ? ((Double) iVar3.f232753c).doubleValue() : 0.0d);
                    }
                    if (iVar4 != null) {
                        if (iVar4.f232752b == 7) {
                            d2 = ((Double) iVar4.f232753c).doubleValue();
                        }
                        obj2 = Double.valueOf(d2);
                    }
                    str2 = C86124t.m138481g(valueOf2, valueOf5, valueOf6, d, obj2);
                    C59828gu guVar2 = (C59828gu) C59829gv.f161673d.createBuilder();
                    guVar2.copyOnWrite();
                    C59829gv gvVar3 = (C59829gv) guVar2.instance;
                    str.getClass();
                    gvVar3.f161675a |= 1;
                    gvVar3.f161676b = str;
                    guVar2.copyOnWrite();
                    C59829gv gvVar22 = (C59829gv) guVar2.instance;
                    gvVar22.f161675a |= 2;
                    gvVar22.f161677c = str2;
                    return (C59829gv) guVar2.build();
                }
                boolean z3 = obj3 instanceof C90129h;
                str2 = BuildConfig.FLAVOR;
                if (!z3) {
                    if (i3 == 3) {
                        str3 = null;
                    }
                    C59828gu guVar22 = (C59828gu) C59829gv.f161673d.createBuilder();
                    guVar22.copyOnWrite();
                    C59829gv gvVar32 = (C59829gv) guVar22.instance;
                    str.getClass();
                    gvVar32.f161675a |= 1;
                    gvVar32.f161676b = str;
                    guVar22.copyOnWrite();
                    C59829gv gvVar222 = (C59829gv) guVar22.instance;
                    gvVar222.f161675a |= 2;
                    gvVar222.f161677c = str2;
                    return (C59829gv) guVar22.build();
                }
                str3 = C89961b.m146546a((C90129h) obj3);
                String str5 = iVar.f232752b == 3 ? (String) iVar.f232753c : str2;
                if (iVar3 == null) {
                    str4 = null;
                } else {
                    str4 = iVar3.f232752b == 3 ? (String) iVar3.f232753c : str2;
                }
                if (iVar4 != null) {
                    obj2 = iVar4.f232752b == 3 ? (String) iVar4.f232753c : str2;
                }
                str2 = C86124t.m138481g(valueOf2, str3, str5, str4, obj2);
                C59828gu guVar222 = (C59828gu) C59829gv.f161673d.createBuilder();
                guVar222.copyOnWrite();
                C59829gv gvVar322 = (C59829gv) guVar222.instance;
                str.getClass();
                gvVar322.f161675a |= 1;
                gvVar322.f161676b = str;
                guVar222.copyOnWrite();
                C59829gv gvVar2222 = (C59829gv) guVar222.instance;
                gvVar2222.f161675a |= 2;
                gvVar2222.f161677c = str2;
                return (C59829gv) guVar222.build();
            }
        } else {
            bool = Boolean.valueOf(C89961b.m146547b((C90048d) obj3));
        }
        boolean z4 = false;
        Boolean valueOf7 = Boolean.valueOf(iVar.f232752b == 2 ? ((Boolean) iVar.f232753c).booleanValue() : false);
        if (iVar3 == null) {
            bool2 = null;
        } else {
            bool2 = Boolean.valueOf(iVar3.f232752b == 2 ? ((Boolean) iVar3.f232753c).booleanValue() : false);
        }
        if (iVar4 != null) {
            if (iVar4.f232752b == 2) {
                z4 = ((Boolean) iVar4.f232753c).booleanValue();
            }
            obj2 = Boolean.valueOf(z4);
        }
        str2 = C86124t.m138481g(valueOf2, bool, valueOf7, bool2, obj2);
        C59828gu guVar2222 = (C59828gu) C59829gv.f161673d.createBuilder();
        guVar2222.copyOnWrite();
        C59829gv gvVar3222 = (C59829gv) guVar2222.instance;
        str.getClass();
        gvVar3222.f161675a |= 1;
        gvVar3222.f161676b = str;
        guVar2222.copyOnWrite();
        C59829gv gvVar22222 = (C59829gv) guVar2222.instance;
        gvVar22222.f161675a |= 2;
        gvVar22222.f161677c = str2;
        return (C59829gv) guVar2222.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

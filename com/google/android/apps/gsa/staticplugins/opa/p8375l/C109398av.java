package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p4008y.p4009a.C53592by;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.av */
/* compiled from: PG */
public final class C109398av {

    /* renamed from: a */
    public static final Pattern f304687a = Pattern.compile("%([^%]+)%");

    /* renamed from: b */
    public static final Set f304688b = new HashSet();

    /* renamed from: c */
    public static final Set f304689c = new HashSet();

    /* renamed from: d */
    public final C60870cx f304690d;

    public C109398av(C109384ah ahVar) {
        C60870cx g = C60922j.m93044g(ahVar.f304666a.mo90814b(C53306j.CHALKBOARD, C58485gu.m89846n(8), false), C109426y.f304752a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        this.f304690d = C60922j.m93044g(g, C109382af.f304665a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public static void m182093b(List list, Set set, String str, C53592by byVar, String str2) {
        Collection.EL.stream(list).filter(new C109393aq(set)).findAny().ifPresent(new C109394ar(set, byVar, str2, str));
    }

    /* renamed from: a */
    public final C60870cx mo97813a(List list) {
        C60870cx g = C60922j.m93044g(C60856cj.m92906o((Iterable) Collection.EL.stream(list).map(new C109395as(this)).collect(Collectors.toList())), C109396at.f304685a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }
}

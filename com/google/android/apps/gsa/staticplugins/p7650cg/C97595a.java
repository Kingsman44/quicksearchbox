package com.google.android.apps.gsa.staticplugins.p7650cg;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.main.entry.C91330bh;
import com.google.android.apps.gsa.sidekick.main.entry.C91346bx;
import com.google.android.apps.gsa.sidekick.main.notifications.C91502aq;
import com.google.android.apps.gsa.sidekick.main.notifications.C91530d;
import com.google.android.apps.gsa.sidekick.main.notifications.C91533g;
import com.google.android.apps.gsa.staticplugins.p7650cg.p7652b.C97601c;
import com.google.android.apps.gsa.staticplugins.p7650cg.p7652b.C97603e;
import com.google.android.apps.gsa.staticplugins.p7650cg.p7652b.C97604f;
import com.google.android.apps.gsa.staticplugins.p7650cg.p7652b.C97624y;
import com.google.android.apps.gsa.staticplugins.p7650cg.p7652b.C97625z;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7874nd;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.cg.a */
/* compiled from: PG */
public final class C97595a extends C91346bx implements C91533g {

    /* renamed from: a */
    private final C21370a f272615a;

    /* renamed from: b */
    private final C89291a f272616b;

    /* renamed from: c */
    private final C86124t f272617c;

    /* renamed from: d */
    private final C68214a f272618d;

    public C97595a(C21370a aVar, C91330bh bhVar, C86124t tVar, C68214a aVar2) {
        super(bhVar);
        this.f272615a = aVar;
        this.f272616b = new C89291a(aVar);
        this.f272617c = tVar;
        this.f272618d = aVar2;
    }

    /* renamed from: f */
    private final C91530d m161716f(C7718hj hjVar) {
        if (!C91502aq.m149664b(hjVar)) {
            return null;
        }
        C7874nd ndVar = hjVar.f26938J;
        if (ndVar == null) {
            ndVar = C7874nd.f27577J;
        }
        return new C97603e(hjVar, ndVar, this.f272616b, this.f272617c, this.f272618d);
    }

    @Deprecated
    /* renamed from: i */
    private static boolean m161717i(C7718hj hjVar) {
        if ((hjVar.f26955a & 1073741824) == 0) {
            return false;
        }
        C7874nd ndVar = hjVar.f26938J;
        if (ndVar == null) {
            ndVar = C7874nd.f27577J;
        }
        if (ndVar.f27598j.size() > 0) {
            return true;
        }
        int i = ndVar.f27589a;
        return ((i & 128) == 0 && (i & 512) == 0) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo85554a(C7718hj hjVar) {
        if (hjVar.f26946R || (hjVar.f26955a & 1073741824) == 0) {
            return null;
        }
        C7746ik ikVar = C7746ik.UNKNOWN;
        C7746ik a = C7746ik.m22834a(hjVar.f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal != 4) {
            if (ordinal != 6) {
                if (ordinal != 9) {
                    return m161716f(hjVar);
                }
                C7874nd ndVar = hjVar.f26938J;
                if (ndVar == null) {
                    ndVar = C7874nd.f27577J;
                }
                return new C97624y(hjVar, ndVar, this.f272615a, this.f272616b, this.f272617c, this.f272618d);
            } else if (m161717i(hjVar)) {
                return m161716f(hjVar);
            } else {
                C7874nd ndVar2 = hjVar.f26938J;
                if (ndVar2 == null) {
                    ndVar2 = C7874nd.f27577J;
                }
                return new C97625z(hjVar, ndVar2, this.f272616b, this.f272617c, this.f272618d);
            }
        } else if (m161717i(hjVar)) {
            return m161716f(hjVar);
        } else {
            C7874nd ndVar3 = hjVar.f26938J;
            if (ndVar3 == null) {
                ndVar3 = C7874nd.f27577J;
            }
            return new C97601c(hjVar, ndVar3, this.f272616b, this.f272617c, this.f272618d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo85555b(C7718hj hjVar, List list) {
        C7746ik ikVar = C7746ik.UNKNOWN;
        C7746ik a = C7746ik.m22834a(hjVar.f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        if (a.ordinal() != 0) {
            return m161716f(hjVar);
        }
        return null;
    }

    /* renamed from: c */
    public final C91530d mo85909c(C58485gu guVar) {
        return new C97604f(C58485gu.m89842j(guVar));
    }
}

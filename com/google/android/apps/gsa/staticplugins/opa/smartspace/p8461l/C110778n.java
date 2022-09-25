package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.n */
/* compiled from: PG */
final class C110778n implements Comparator {

    /* renamed from: a */
    private final C21370a f308664a;

    public C110778n(C21370a aVar) {
        this.f308664a = aVar;
    }

    /* renamed from: a */
    private final int m184504a(C50818do doVar) {
        long b = this.f308664a.mo26870b();
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        switch (a.ordinal()) {
            case 2:
                return 50;
            case 3:
                return 30;
            case 4:
                return doVar.f132318o - b < C131179d.f358765a ? 70 : 40;
            case 5:
                return 10;
            case 7:
                return 0;
            case 8:
                return 45;
            case 10:
                return 20;
            case 11:
                return 100;
            case 12:
                return 80;
            case 13:
                return 43;
            case 14:
                return 75;
            case 15:
                return 5;
            case 16:
                return 41;
            case 20:
                return 42;
            default:
                return -1;
        }
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C83741am amVar = (C83741am) obj2;
        C50818do doVar = ((C83741am) obj).f228252c;
        if (doVar == null) {
            doVar = C50818do.f132293H;
        }
        C50818do doVar2 = amVar.f228252c;
        if (doVar2 == null) {
            doVar2 = C50818do.f132293H;
        }
        C50792cp a = C50792cp.m85936a(doVar.f132306c);
        if (a == null) {
            a = C50792cp.PRIORITY_UNDEFINED;
        }
        int i = a.f132174e;
        C50792cp a2 = C50792cp.m85936a(doVar2.f132306c);
        if (a2 == null) {
            a2 = C50792cp.PRIORITY_UNDEFINED;
        }
        int i2 = a2.f132174e;
        if (i != i2) {
            return i - i2;
        }
        int a3 = m184504a(doVar);
        int a4 = m184504a(doVar2);
        if (a3 <= a4) {
            if (a3 >= a4) {
                long j = doVar.f132318o;
                long j2 = doVar2.f132318o;
                if (j >= j2) {
                    if (j <= j2) {
                        return (doVar.f132319p > doVar2.f132319p ? 1 : (doVar.f132319p == doVar2.f132319p ? 0 : -1));
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}

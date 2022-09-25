package com.google.p4583d.p4584a.p4589e;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import com.google.p4583d.p4584a.p4588d.C60980g;
import com.google.p4583d.p4584a.p4588d.C60987n;
import com.google.p4583d.p4584a.p4588d.C60992s;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.d.a.e.f */
/* compiled from: PG */
public final class C60999f implements Comparator {

    /* renamed from: a */
    final /* synthetic */ C60980g f165133a;

    /* renamed from: b */
    final /* synthetic */ C61012g f165134b;

    public C60999f(C60980g gVar, C61012g gVar2) {
        this.f165133a = gVar;
        this.f165134b = gVar2;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C60987n nVar = (C60987n) obj;
        C60987n nVar2 = (C60987n) obj2;
        C60980g gVar = this.f165133a;
        C61012g gVar2 = this.f165134b;
        if (nVar instanceof C60992s) {
            return !(nVar2 instanceof C60992s) ? 1 : 0;
        }
        if (nVar2 instanceof C60992s) {
            return -1;
        }
        if (gVar == null) {
            return nVar.mo57475i().compareTo(nVar2.mo57475i());
        }
        return (int) C61013h.m93259a(gVar.mo57451a(gVar2, Arrays.asList(new C60987n[]{nVar, nVar2})).mo57473h().doubleValue());
    }
}

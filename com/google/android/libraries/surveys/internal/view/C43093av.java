package com.google.android.libraries.surveys.internal.view;

import com.google.common.p4522b.C58495hd;
import com.google.p4281bu.p4282a.C56546cc;
import com.google.p4281bu.p4282a.C56548ce;
import com.google.p4281bu.p4282a.C56551ch;
import com.google.p4281bu.p4282a.C56589o;
import com.google.p4281bu.p4282a.C56590p;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.surveys.internal.view.av */
/* compiled from: PG */
public final class C43093av {

    /* renamed from: a */
    private final C58495hd f112708a;

    /* renamed from: b */
    private final int f112709b;

    /* renamed from: c */
    private int f112710c = -1;

    public C43093av(C58495hd hdVar, int i) {
        this.f112708a = hdVar;
        this.f112709b = i;
    }

    /* renamed from: a */
    public final int mo46157a(int i, C56546cc ccVar) {
        C56551ch chVar;
        C56551ch chVar2;
        int intValue;
        if (ccVar.f150993a == 6) {
            chVar = (C56551ch) ccVar.f150994b;
        } else {
            chVar = C56551ch.f151006g;
        }
        if (chVar.f151013f.size() == 0) {
            return this.f112710c;
        }
        if (ccVar.f150993a == 6) {
            chVar2 = (C56551ch) ccVar.f150994b;
        } else {
            chVar2 = C56551ch.f151006g;
        }
        for (C56548ce ceVar : chVar2.f151013f) {
            Iterator it = ceVar.f151004a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Integer) it.next()).intValue() == i) {
                        C56590p pVar = ceVar.f151005b;
                        if (pVar == null) {
                            pVar = C56590p.f151086c;
                        }
                        int a = C56589o.m88216a(pVar.f151088a);
                        if (a == 0) {
                            a = 1;
                        }
                        int i2 = a - 2;
                        if (i2 != 2) {
                            if (i2 == 3) {
                                intValue = this.f112709b;
                            }
                            return this.f112710c;
                        }
                        C58495hd hdVar = this.f112708a;
                        C56590p pVar2 = ceVar.f151005b;
                        if (pVar2 == null) {
                            pVar2 = C56590p.f151086c;
                        }
                        if (hdVar.containsKey(pVar2.f151089b)) {
                            C58495hd hdVar2 = this.f112708a;
                            C56590p pVar3 = ceVar.f151005b;
                            if (pVar3 == null) {
                                pVar3 = C56590p.f151086c;
                            }
                            intValue = ((Integer) hdVar2.get(pVar3.f151089b)).intValue();
                        }
                        return this.f112710c;
                        this.f112710c = intValue;
                        return this.f112710c;
                    }
                }
            }
        }
        return this.f112710c;
    }
}

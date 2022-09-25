package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4534f.C59081b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ht */
/* compiled from: PG */
public final class C108412ht extends C108232bc {

    /* renamed from: a */
    public final EnumSet f301529a = EnumSet.noneOf(C108248bs.class);

    /* renamed from: b */
    public final C108423id f301530b;

    public C108412ht(C108423id idVar, boolean z) {
        super((byte[]) null);
        this.f301530b = idVar;
        idVar.mo96863g();
        idVar.f301557d = z;
    }

    /* renamed from: b */
    public final void mo96850b(Collection collection) {
        C59081b.m91349a(C58979ad.MEDIUM, "stack size");
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C108430ik ikVar = (C108430ik) it.next();
            if (ikVar instanceof C108249bt) {
                C108249bt btVar = (C108249bt) ikVar;
                if (!this.f301529a.add(btVar.f301136a)) {
                    C108248bs bsVar = btVar.f301136a;
                }
            }
            arrayList.add(ikVar);
        }
        this.f301530b.mo96861d(arrayList);
    }

    /* renamed from: c */
    public final void mo96851c() {
        this.f301530b.mo96863g();
        this.f301529a.clear();
    }

    /* renamed from: d */
    public final boolean mo96597d() {
        return true;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return this.f301530b.f301557d ? 43321 : 27225;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 4;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        return this.f301530b.mo96860c();
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        blVar.f301084k.removeAllViews();
        blVar.f301084k.setPadding(bhVar.mo96662e(), bhVar.mo96666i(), bhVar.mo96662e(), bhVar.mo96665h());
        this.f301530b.f301555b = bhVar;
        C0653fo foVar = ((RecyclerView) blVar.f301084k).mLayout;
        if (foVar != null) {
            if (foVar instanceof LinearLayoutManager) {
                ((LinearLayoutManager) foVar).setStackFromEnd(true);
            }
            foVar.scrollToPosition(0);
        }
        C28295m.m52919e(blVar.f301084k, this.f301030l);
    }

    /* renamed from: jz */
    public final int mo96576jz(BitFlags bitFlags) {
        if (this.f301530b.f301557d && BitFlags.m148144f(bitFlags.f253762b, 64)) {
            return 3;
        }
        if (!BitFlags.m148144f(bitFlags.f253762b, 1)) {
            return 1;
        }
        C86124t tVar = this.f301041w;
        return (tVar == null || !tVar.mo79746e(C90014bt.f247793np)) ? 2 : 1;
    }

    /* renamed from: k */
    public final void mo95833k(C108241bl blVar) {
        blVar.f301084k.scrollTo(0, 0);
    }

    /* renamed from: r */
    public final void mo96608r(C28292j jVar) {
        this.f301030l = jVar;
        this.f301530b.f301558e = jVar;
    }
}

package com.google.android.libraries.searchbox.root;

import android.os.Bundle;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.suggestion.C41678d;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.C41684j;
import com.google.android.libraries.searchbox.shared.suggestion.C41685k;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
public class RootSuggestion extends Suggestion implements C41633g {

    /* renamed from: a */
    public static final C59071e f108829a = C59071e.m91332i("com.google.android.libraries.searchbox.root.RootSuggestion");

    /* renamed from: b */
    public static final Comparator f108830b = C41636d.f108848a;

    /* renamed from: c */
    public static final Comparator f108831c = C41637e.f108849a;

    /* renamed from: d */
    public boolean f108832d = true;

    /* renamed from: e */
    public int f108833e = -1;

    /* renamed from: f */
    public boolean f108834f = false;

    /* renamed from: g */
    public boolean f108835g = false;

    public RootSuggestion(CharSequence charSequence, int i, int i2, List list, String str, Integer num, int i3, C54228aq aqVar, C41679e eVar) {
        super(charSequence, i, i2, list, (Bundle) null, str, -1, num, i3, aqVar, eVar);
    }

    /* renamed from: a */
    public final void mo44201a() {
        C41678d dVar = (C41678d) this.f108907B.toBuilder();
        C41684j jVar = (C41684j) C41685k.f109031e.createBuilder();
        jVar.copyOnWrite();
        C41685k kVar = (C41685k) jVar.instance;
        kVar.f109033a |= 4;
        kVar.f109036d = true;
        C41685k kVar2 = (C41685k) jVar.build();
        dVar.copyOnWrite();
        C41679e eVar = (C41679e) dVar.instance;
        kVar2.getClass();
        eVar.f109020n = kVar2;
        eVar.f109007a |= 8192;
        this.f108907B = (C41679e) dVar.build();
    }

    /* renamed from: b */
    public final void mo44202b() {
        C41678d dVar = (C41678d) this.f108907B.toBuilder();
        C41684j jVar = (C41684j) C41685k.f109031e.createBuilder();
        jVar.copyOnWrite();
        C41685k kVar = (C41685k) jVar.instance;
        kVar.f109033a |= 1;
        kVar.f109034b = true;
        C41685k kVar2 = (C41685k) jVar.build();
        dVar.copyOnWrite();
        C41679e eVar = (C41679e) dVar.instance;
        kVar2.getClass();
        eVar.f109020n = kVar2;
        eVar.f109007a |= 8192;
        this.f108907B = (C41679e) dVar.build();
    }

    /* renamed from: c */
    public final void mo44203c() {
        C41678d dVar = (C41678d) this.f108907B.toBuilder();
        C41684j jVar = (C41684j) C41685k.f109031e.createBuilder();
        jVar.copyOnWrite();
        C41685k kVar = (C41685k) jVar.instance;
        kVar.f109033a |= 2;
        kVar.f109035c = true;
        C41685k kVar2 = (C41685k) jVar.build();
        dVar.copyOnWrite();
        C41679e eVar = (C41679e) dVar.instance;
        kVar2.getClass();
        eVar.f109020n = kVar2;
        eVar.f109007a |= 8192;
        this.f108907B = (C41679e) dVar.build();
    }

    /* renamed from: d */
    public final void mo44204d(int i) {
        if (this.f108832d) {
            this.f108917r = i;
        } else {
            ((C59052c) ((C59052c) f108829a.mo56226d()).mo56372aa(53911)).mo56386p("Attempting to set the score of a non-twiddleable suggestion.");
        }
    }

    /* renamed from: e */
    public final void mo44205e(Integer num) {
        if (this.f108832d) {
            this.f108915p = num;
        } else {
            ((C59052c) ((C59052c) f108829a.mo56226d()).mo56372aa(53912)).mo56386p("Attempting to set the suggestion group of a non-twiddleable suggestion.");
        }
    }

    /* renamed from: f */
    public final void mo44206f() {
        this.f108832d = false;
    }

    /* renamed from: g */
    public final void mo44207g(C41679e eVar) {
        this.f108907B = eVar;
    }

    /* renamed from: h */
    public final boolean mo44208h() {
        return this.f108833e != -1;
    }

    /* renamed from: i */
    public final void mo44209i() {
        ArrayList arrayList = new ArrayList(this.f108925z);
        arrayList.add(300);
        this.f108925z = C58485gu.m89842j(arrayList);
    }

    /* renamed from: j */
    public final void mo44210j() {
        this.f108835g = true;
        this.f108834f = false;
    }
}

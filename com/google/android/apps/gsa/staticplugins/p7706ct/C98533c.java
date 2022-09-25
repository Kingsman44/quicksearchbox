package com.google.android.apps.gsa.staticplugins.p7706ct;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84578e;
import com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84579f;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.p4152bb.p4153a.C55030dg;
import com.google.p4152bb.p4153a.C55031dh;
import com.google.p4152bb.p4153a.C55032di;
import com.google.p4152bb.p4153a.C55035dl;
import com.google.speech.grammar.pumpkin.C66528t;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.c */
/* compiled from: PG */
public final class C98533c extends C66528t {

    /* renamed from: a */
    private final C68214a f275137a;

    /* renamed from: b */
    private final C86124t f275138b;

    /* renamed from: c */
    private C55035dl f275139c;

    public C98533c(C68214a aVar, C86124t tVar) {
        this.f275138b = tVar;
        this.f275137a = aVar;
    }

    /* renamed from: a */
    public final float mo59673a(String str) {
        C89949q.m146523g(1197);
        if (this.f275138b.mo79746e(C90086ek.f250523u)) {
            return 0.0f;
        }
        if (this.f275139c == null) {
            C55030dg dgVar = (C55030dg) C55035dl.f144790f.createBuilder();
            dgVar.copyOnWrite();
            C55035dl dlVar = (C55035dl) dgVar.instance;
            dlVar.f144793a |= 2;
            dlVar.f144795c = "com.google.android.gms";
            C55031dh dhVar = (C55031dh) C55032di.f144777j.createBuilder();
            dhVar.copyOnWrite();
            C55032di diVar = (C55032di) dhVar.instance;
            diVar.f144779a |= 4;
            diVar.f144782d = "apps";
            dgVar.copyOnWrite();
            C55035dl dlVar2 = (C55035dl) dgVar.instance;
            C55032di diVar2 = (C55032di) dhVar.build();
            diVar2.getClass();
            dlVar2.mo54173a();
            dlVar2.f144796d.add(diVar2);
            this.f275139c = (C55035dl) dgVar.build();
        }
        C55030dg dgVar2 = (C55030dg) this.f275139c.toBuilder();
        dgVar2.copyOnWrite();
        C55035dl dlVar3 = (C55035dl) dgVar2.instance;
        str.getClass();
        dlVar3.f144793a |= 1;
        dlVar3.f144794b = str;
        C55031dh dhVar2 = (C55031dh) ((C55032di) this.f275139c.f144796d.get(0)).toBuilder();
        dhVar2.copyOnWrite();
        C55032di diVar3 = (C55032di) dhVar2.instance;
        str.getClass();
        diVar3.f144779a |= 1;
        diVar3.f144780b = str;
        dgVar2.mo54172c(0, dhVar2);
        this.f275139c = (C55035dl) dgVar2.build();
        C84578e a = ((C84579f) this.f275137a.mo27525b()).mo78340a(this.f275139c);
        if (a == null || TextUtils.isEmpty(a.f230170f)) {
            return 0.0f;
        }
        return C98555y.m163249a(str);
    }
}

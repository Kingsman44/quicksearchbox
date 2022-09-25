package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c;

import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.C15362p;
import com.google.android.libraries.assistant.p1478e.p1479a.p1480a.C17939a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2186a.C28297a;
import com.google.assistant.p3745ab.p3766r.C48385a;
import com.google.assistant.p3745ab.p3766r.C48388d;
import com.google.assistant.p3745ab.p3766r.C48389e;
import com.google.assistant.p3745ab.p3766r.C48390f;
import com.google.assistant.p3745ab.p3766r.C48391g;
import com.google.assistant.p3745ab.p3766r.C48392h;
import com.google.assistant.p3897e.p3917i.p3918a.C51474ja;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.t */
/* compiled from: PG */
public final class C15158t extends C15161w {

    /* renamed from: g */
    private static final C59071e f45481g = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.c.t");

    /* renamed from: h */
    private static final String f45482h = C15362p.class.getSimpleName();

    /* renamed from: a */
    public C14647d f45483a;

    /* renamed from: b */
    public C28310af f45484b;

    /* renamed from: c */
    public C28306ab f45485c;

    /* renamed from: d */
    public Context f45486d;

    /* renamed from: e */
    public C14499lm f45487e;

    /* renamed from: f */
    public C15362p f45488f;

    /* renamed from: h */
    public final void mo22016h() {
        C59104x b = f45481g.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.EphemFragHost");
        ((C59052c) ((C59052c) b).mo56372aa(45994)).mo56386p("#onStop");
        super.mo22016h();
    }

    /* renamed from: jP */
    public final void mo19987jP(Bundle bundle) {
        String str;
        C59071e eVar = f45481g;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.EphemFragHost");
        ((C59052c) ((C59052c) b).mo56372aa(45993)).mo56386p("#onCreate");
        if (bundle == null) {
            str = null;
        } else {
            str = bundle.getString("ACCOUNT_NAME");
        }
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "Morris.EphemFragHost");
        ((C59052c) ((C59052c) b2).mo56372aa(45991)).mo56386p("#bindRootVe");
        ViewGroup viewGroup = (ViewGroup) this.f122878z.findViewById(16908290);
        C28423g b3 = str != null ? C28297a.m52922b(str) : C28297a.m52923c();
        this.f45483a.mo21597a();
        C14160ab.m30482c(this.f45486d);
        C28306ab abVar = this.f45485c;
        C28313c a = this.f45484b.mo33805a(C28427h.m53115a(104514));
        C51474ja a2 = this.f45483a.mo21597a();
        boolean c = C14160ab.m30482c(this.f45486d);
        C62940bt btVar = C17939a.f51392b;
        C48385a aVar = (C48385a) C48392h.f125083c.createBuilder();
        C48390f fVar = (C48390f) C48391g.f125079c.createBuilder();
        C48388d dVar = (C48388d) C48389e.f125074d.createBuilder();
        dVar.copyOnWrite();
        C48389e eVar2 = (C48389e) dVar.instance;
        eVar2.f125077b = a2.f134124v;
        eVar2.f125076a |= 1;
        dVar.copyOnWrite();
        C48389e eVar3 = (C48389e) dVar.instance;
        eVar3.f125076a |= 2;
        eVar3.f125078c = c;
        fVar.copyOnWrite();
        C48391g gVar = (C48391g) fVar.instance;
        C48389e eVar4 = (C48389e) dVar.build();
        eVar4.getClass();
        gVar.f125082b = eVar4;
        gVar.f125081a = 3;
        aVar.copyOnWrite();
        C48392h hVar = (C48392h) aVar.instance;
        C48391g gVar2 = (C48391g) fVar.build();
        gVar2.getClass();
        hVar.f125087b = gVar2;
        hVar.f125086a |= 1;
        a.mo33858f(new C28353e(btVar, (C48392h) aVar.build()));
        a.mo33859g(b3);
        abVar.mo33802c(viewGroup, a);
        super.mo19987jP(bundle);
        C15362p pVar = new C15362p();
        C68324h.m98669f(pVar);
        this.f45488f = pVar;
        C0154a aVar2 = new C0154a(mo51122q());
        C15362p pVar2 = this.f45488f;
        pVar2.getClass();
        aVar2.mo689v(R.id.ephemeral_dialog, pVar2, f45482h);
        aVar2.mo509f();
    }
}

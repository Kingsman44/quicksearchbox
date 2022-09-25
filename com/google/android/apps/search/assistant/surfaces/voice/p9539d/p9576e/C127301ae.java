package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e;

import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.assistant.p3897e.p3917i.p3918a.C51421hb;
import com.google.assistant.p3897e.p3917i.p3918a.C51422hc;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.e.ae */
/* compiled from: PG */
public final class C127301ae extends C68247h {

    /* renamed from: a */
    private final C68283d f350592a;

    /* renamed from: c */
    private final C68283d f350593c;

    public C127301ae(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C127301ae.class), aVar);
        this.f350592a = C68236af.m98549d(dVar);
        this.f350593c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C51422hc hcVar;
        List list = (List) obj;
        Optional optional = (Optional) list.get(0);
        Optional optional2 = (Optional) list.get(1);
        C51421hb hbVar = (C51421hb) C51422hc.f133938f.createBuilder();
        if (optional.isPresent()) {
            C63088z byteString = C127300ad.m208215a((C18496n) optional.get()).toByteString();
            hbVar.copyOnWrite();
            C51422hc hcVar2 = (C51422hc) hbVar.instance;
            byteString.getClass();
            hcVar2.f133940a = 1 | hcVar2.f133940a;
            hcVar2.f133941b = byteString;
        }
        if (optional2.isPresent() && !Objects.equals(optional2.get(), C18496n.f52438d)) {
            C63088z byteString2 = C127300ad.m208215a((C18496n) optional2.get()).toByteString();
            hbVar.copyOnWrite();
            C51422hc hcVar3 = (C51422hc) hbVar.instance;
            byteString2.getClass();
            hcVar3.f133940a |= 2;
            hcVar3.f133942c = byteString2;
        }
        int i = ((C51422hc) hbVar.instance).f133940a;
        if ((i & 1) == 0 && (i & 2) == 0) {
            ((C59052c) ((C59052c) C127300ad.f350591a.mo56226d()).mo56372aa(37286)).mo56386p("Search Handover service not available, using default search params");
            hcVar = C51422hc.f133938f;
        } else {
            hcVar = (C51422hc) hbVar.build();
        }
        return C60856cj.m92900i(hcVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f350592a.mo60297gq(), this.f350593c.mo60297gq());
    }
}

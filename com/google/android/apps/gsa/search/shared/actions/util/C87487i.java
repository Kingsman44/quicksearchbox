package com.google.android.apps.gsa.search.shared.actions.util;

import android.os.Parcel;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;
import com.google.p4152bb.p4153a.C55368pu;
import com.google.p4152bb.p4153a.C55370pw;
import com.google.p4152bb.p4153a.C55371px;
import com.google.p4152bb.p4153a.C55372py;
import com.google.p4152bb.p4153a.C55373pz;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.util.i */
/* compiled from: PG */
public final class C87487i implements Cloneable {

    /* renamed from: a */
    public final List f236312a;

    /* renamed from: b */
    public C55373pz f236313b;

    /* renamed from: c */
    public C55373pz f236314c;

    public C87487i(List list, C55373pz pzVar, C55373pz pzVar2) {
        this.f236312a = list;
        this.f236313b = pzVar;
        this.f236314c = pzVar2;
    }

    /* renamed from: c */
    public static C87487i m142003c(Parcel parcel, C63010eb ebVar) {
        return new C87487i(ProtoLiteParcelable.m147137h(parcel, ebVar), (C55373pz) ProtoLiteParcelable.m147135f(parcel, C55373pz.f145913d), (C55373pz) ProtoLiteParcelable.m147135f(parcel, C55373pz.f145913d));
    }

    /* renamed from: h */
    public static void m142004h(C87487i iVar, Parcel parcel) {
        ProtoLiteParcelable.m147139j(iVar.f236312a, parcel);
        ProtoLiteParcelable.m147140k(iVar.f236313b, parcel);
        ProtoLiteParcelable.m147140k(iVar.f236314c, parcel);
    }

    /* renamed from: j */
    private final void m142005j(int i, C55370pw pwVar) {
        C55368pu puVar = (C55368pu) C55371px.f145907d.createBuilder();
        puVar.copyOnWrite();
        C55371px pxVar = (C55371px) puVar.instance;
        pxVar.f145909a |= 1;
        pxVar.f145910b = i;
        puVar.copyOnWrite();
        C55371px pxVar2 = (C55371px) puVar.instance;
        pxVar2.f145911c = pwVar.f145906f;
        pxVar2.f145909a |= 4;
        C55371px pxVar3 = (C55371px) puVar.build();
        C55373pz pzVar = this.f236313b;
        this.f236314c = pzVar;
        if (pzVar == null) {
            C55372py pyVar = (C55372py) C55373pz.f145913d.createBuilder();
            pyVar.mo54254b(pxVar3);
            this.f236313b = (C55373pz) pyVar.build();
            return;
        }
        C55372py pyVar2 = (C55372py) pzVar.toBuilder();
        pyVar2.copyOnWrite();
        ((C55373pz) pyVar2.instance).f145916b = C55373pz.emptyProtobufList();
        pyVar2.mo54254b(pxVar3);
        for (C55371px pxVar4 : pzVar.f145916b) {
            if (pxVar4.f145910b != i) {
                pyVar2.mo54254b(pxVar4);
            }
        }
        this.f236313b = (C55373pz) pyVar2.build();
    }

    /* renamed from: a */
    public final int mo81477a(C55370pw... pwVarArr) {
        C58528ij H = C58528ij.m90008H(pwVarArr);
        C55373pz pzVar = this.f236313b;
        if (pzVar == null) {
            return -1;
        }
        for (C55371px pxVar : pzVar.f145916b) {
            C55370pw a = C55370pw.m87678a(pxVar.f145911c);
            if (a == null) {
                a = C55370pw.UNKNOWN_SELECTION_TYPE;
            }
            if (H.contains(a) && pxVar.f145910b < this.f236312a.size()) {
                return pxVar.f145910b;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C87487i clone() {
        return new C87487i(C58597ky.m90211b(this.f236312a), this.f236313b, this.f236314c);
    }

    /* renamed from: d */
    public final MessageLite mo81480d() {
        int a = mo81477a(C55370pw.USER_SELECTED, C55370pw.AUTOMATIC);
        if (a == -1) {
            return null;
        }
        return (MessageLite) this.f236312a.get(a);
    }

    /* renamed from: e */
    public final void mo81481e(MessageLite messageLite) {
        m142005j(this.f236312a.indexOf(messageLite), C55370pw.AUTOMATIC);
    }

    /* renamed from: f */
    public final void mo81482f(MessageLite messageLite) {
        m142005j(this.f236312a.indexOf(messageLite), C55370pw.USER_SELECTED);
    }

    /* renamed from: g */
    public final void mo81483g() {
        this.f236313b = this.f236314c;
        this.f236314c = null;
    }

    /* renamed from: i */
    public final boolean mo81484i() {
        return mo81477a(C55370pw.USER_SELECTED, C55370pw.AUTOMATIC) != -1;
    }
}

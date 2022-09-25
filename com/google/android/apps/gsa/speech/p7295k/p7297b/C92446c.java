package com.google.android.apps.gsa.speech.p7295k.p7297b;

import com.google.android.apps.gsa.shared.p6968aa.C89034be;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89045bp;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.speech.p5208h.C66553aj;
import com.google.speech.p5208h.C66555al;

/* renamed from: com.google.android.apps.gsa.speech.k.b.c */
/* compiled from: PG */
public final class C92446c extends C90880an {

    /* renamed from: a */
    private final C89037bh f257842a;

    /* renamed from: b */
    private final C89045bp f257843b;

    public C92446c(C89037bh bhVar, C89045bp bpVar) {
        super("MobileUserInfoBuilderTask", 1, 0);
        this.f257842a = bhVar;
        this.f257843b = bpVar;
    }

    /* renamed from: b */
    public final C66555al call() {
        C66553aj ajVar = (C66553aj) C66555al.f181029g.createBuilder();
        int[] b = this.f257843b.mo27403b();
        if (b != C89045bp.f241322a) {
            int i = b[0];
            ajVar.copyOnWrite();
            C66555al alVar = (C66555al) ajVar.instance;
            alVar.f181032a |= 1;
            alVar.f181033b = i;
            int i2 = b[1];
            ajVar.copyOnWrite();
            C66555al alVar2 = (C66555al) ajVar.instance;
            alVar2.f181032a |= 2;
            alVar2.f181034c = i2;
        }
        int[] c = this.f257843b.mo27404c();
        if (c != C89045bp.f241322a) {
            int i3 = c[0];
            ajVar.copyOnWrite();
            C66555al alVar3 = (C66555al) ajVar.instance;
            alVar3.f181032a |= 4;
            alVar3.f181035d = i3;
            int i4 = c[1];
            ajVar.copyOnWrite();
            C66555al alVar4 = (C66555al) ajVar.instance;
            alVar4.f181032a |= 8;
            alVar4.f181036e = i4;
        }
        int i5 = C89034be.m144791a(this.f257842a.mo27377b()).f181028z;
        ajVar.copyOnWrite();
        C66555al alVar5 = (C66555al) ajVar.instance;
        alVar5.f181032a |= 16;
        alVar5.f181037f = i5;
        return (C66555al) ajVar.build();
    }
}

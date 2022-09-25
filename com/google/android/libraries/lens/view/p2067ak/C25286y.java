package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.C62995dn;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.y */
/* compiled from: PG */
public final /* synthetic */ class C25286y implements C25240bs {

    /* renamed from: a */
    public final /* synthetic */ String f68784a;

    /* renamed from: b */
    public final /* synthetic */ int f68785b;

    /* renamed from: c */
    public final /* synthetic */ long f68786c;

    public /* synthetic */ C25286y(String str, int i, long j) {
        this.f68784a = str;
        this.f68785b = i;
        this.f68786c = j;
    }

    /* renamed from: a */
    public final MessageLite mo30341a(MessageLite messageLite) {
        String str = this.f68784a;
        int i = this.f68785b;
        long j = this.f68786c;
        C25284w wVar = (C25284w) messageLite;
        C25283v vVar = (C25283v) wVar.toBuilder();
        C25265d dVar = wVar.f68781b;
        if (dVar == null) {
            dVar = C25265d.f68732c;
        }
        C25194a aVar = (C25194a) dVar.toBuilder();
        String b = C25197ac.m46570b(str, i);
        b.getClass();
        aVar.copyOnWrite();
        C25265d dVar2 = (C25265d) aVar.instance;
        C62995dn dnVar = dVar2.f68735b;
        if (!dnVar.f170058b) {
            dVar2.f68735b = dnVar.mo58980a();
        }
        dVar2.f68735b.put(b, Long.valueOf(j));
        vVar.copyOnWrite();
        C25265d dVar3 = (C25265d) aVar.build();
        dVar3.getClass();
        ((C25284w) vVar.instance).f68781b = dVar3;
        return (C25284w) vVar.build();
    }
}

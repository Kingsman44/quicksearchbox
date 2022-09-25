package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.ab */
/* compiled from: PG */
public final /* synthetic */ class C25196ab implements C25240bs {

    /* renamed from: a */
    public final /* synthetic */ String f68623a;

    /* renamed from: b */
    public final /* synthetic */ long f68624b;

    public /* synthetic */ C25196ab(String str, long j) {
        this.f68623a = str;
        this.f68624b = j;
    }

    /* renamed from: a */
    public final MessageLite mo30341a(MessageLite messageLite) {
        String str = this.f68623a;
        long j = this.f68624b;
        C25284w wVar = (C25284w) messageLite;
        C25283v vVar = (C25283v) wVar.toBuilder();
        C25265d dVar = wVar.f68781b;
        if (dVar == null) {
            dVar = C25265d.f68732c;
        }
        C25194a aVar = (C25194a) dVar.toBuilder();
        aVar.mo30340a(String.valueOf(str), j);
        vVar.copyOnWrite();
        C25265d dVar2 = (C25265d) aVar.build();
        dVar2.getClass();
        ((C25284w) vVar.instance).f68781b = dVar2;
        return (C25284w) vVar.build();
    }
}

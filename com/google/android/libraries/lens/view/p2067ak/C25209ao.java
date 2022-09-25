package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.ao */
/* compiled from: PG */
public final /* synthetic */ class C25209ao implements C25240bs {
    /* renamed from: a */
    public final MessageLite mo30341a(MessageLite messageLite) {
        C25199ae aeVar = (C25199ae) messageLite;
        C25198ad adVar = (C25198ad) aeVar.toBuilder();
        C25233bl blVar = aeVar.f68639l;
        if (blVar == null) {
            blVar = C25233bl.f68683b;
        }
        C25232bk bkVar = (C25232bk) blVar.toBuilder();
        bkVar.copyOnWrite();
        ((C25233bl) bkVar.instance).f68685a = true;
        adVar.copyOnWrite();
        C25233bl blVar2 = (C25233bl) bkVar.build();
        blVar2.getClass();
        ((C25199ae) adVar.instance).f68639l = blVar2;
        return (C25199ae) adVar.build();
    }
}

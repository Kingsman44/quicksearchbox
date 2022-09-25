package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.assistant.shared.g.a;
import com.google.android.apps.gsa.assistant.shared.g.b;
import com.google.android.apps.gsa.assistant.shared.g.c;
import com.google.android.apps.gsa.assistant.shared.g.f;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73868h;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gn */
/* compiled from: PG */
public final /* synthetic */ class C108379gn implements Callable {

    /* renamed from: a */
    public final /* synthetic */ OpaToggleCard f301443a;

    public /* synthetic */ C108379gn(OpaToggleCard opaToggleCard) {
        this.f301443a = opaToggleCard;
    }

    public final Object call() {
        OpaToggleCard opaToggleCard = this.f301443a;
        a createBuilder = b.f.createBuilder();
        String obj = opaToggleCard.f300933b.getText().toString();
        createBuilder.copyOnWrite();
        b bVar = createBuilder.instance;
        obj.getClass();
        bVar.a |= 1;
        bVar.b = obj;
        byte[] a = C73868h.m108448a(opaToggleCard.f300935d.getDrawable());
        if (a != null) {
            C63088z A = C63088z.m96139A(a);
            createBuilder.copyOnWrite();
            b bVar2 = createBuilder.instance;
            bVar2.a |= 4;
            bVar2.d = A;
        }
        c createBuilder2 = f.d.createBuilder();
        createBuilder2.copyOnWrite();
        f fVar = createBuilder2.instance;
        b build = createBuilder.build();
        build.getClass();
        fVar.b = build;
        fVar.a |= 1;
        return createBuilder2.build();
    }
}

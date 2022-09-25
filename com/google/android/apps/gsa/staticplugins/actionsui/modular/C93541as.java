package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.assistant.shared.g.a;
import com.google.android.apps.gsa.assistant.shared.g.b;
import com.google.android.apps.gsa.assistant.shared.g.c;
import com.google.android.apps.gsa.assistant.shared.g.f;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73868h;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a.C93514f;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.as */
/* compiled from: PG */
public final /* synthetic */ class C93541as implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C93544av f261188a;

    public /* synthetic */ C93541as(C93544av avVar) {
        this.f261188a = avVar;
    }

    public final Object call() {
        C93544av avVar = this.f261188a;
        C93514f g = avVar.mo87956g();
        String string = avVar.getResources().getString(g.mo87924b());
        CharSequence e = g.mo87927e(avVar.getResources());
        Drawable b = avVar.mo87909b();
        a createBuilder = b.f.createBuilder();
        String obj = string.toString();
        createBuilder.copyOnWrite();
        b bVar = createBuilder.instance;
        obj.getClass();
        bVar.a |= 1;
        bVar.b = obj;
        String obj2 = e.toString();
        createBuilder.copyOnWrite();
        b bVar2 = createBuilder.instance;
        obj2.getClass();
        bVar2.a |= 2;
        bVar2.c = obj2;
        if (b != null) {
            C63088z A = C63088z.m96139A(C73868h.m108448a(b));
            createBuilder.copyOnWrite();
            b bVar3 = createBuilder.instance;
            bVar3.a |= 4;
            bVar3.d = A;
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

package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.assistant.shared.g.a;
import com.google.android.apps.gsa.assistant.shared.g.b;
import com.google.android.apps.gsa.assistant.shared.g.c;
import com.google.android.apps.gsa.assistant.shared.g.f;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73868h;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gg */
/* compiled from: PG */
public final /* synthetic */ class C108372gg implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C108375gj f301424a;

    public /* synthetic */ C108372gg(C108375gj gjVar) {
        this.f301424a = gjVar;
    }

    public final Object call() {
        C108375gj gjVar = this.f301424a;
        byte[] a = C73868h.m108448a(gjVar.f301435l.getDrawable());
        c createBuilder = f.d.createBuilder();
        a createBuilder2 = b.f.createBuilder();
        String obj = gjVar.f301434k.getText().toString();
        createBuilder2.copyOnWrite();
        b bVar = createBuilder2.instance;
        obj.getClass();
        bVar.a |= 1;
        bVar.b = obj;
        C63088z A = C63088z.m96139A(a);
        createBuilder2.copyOnWrite();
        b bVar2 = createBuilder2.instance;
        bVar2.a |= 4;
        bVar2.d = A;
        createBuilder.copyOnWrite();
        f fVar = createBuilder.instance;
        b build = createBuilder2.build();
        build.getClass();
        fVar.b = build;
        fVar.a |= 1;
        return createBuilder.build();
    }
}

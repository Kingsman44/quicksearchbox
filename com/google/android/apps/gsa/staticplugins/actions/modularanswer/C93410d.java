package com.google.android.apps.gsa.staticplugins.actions.modularanswer;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.g.a;
import com.google.android.apps.gsa.assistant.shared.g.b;
import com.google.android.apps.gsa.assistant.shared.g.c;
import com.google.android.apps.gsa.assistant.shared.g.f;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73868h;
import com.google.android.apps.gsa.search.shared.actions.util.C87493o;
import com.google.p4152bb.p4153a.C55293n;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.modularanswer.d */
/* compiled from: PG */
public final /* synthetic */ class C93410d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ OpaNonModularActionCompletionCard f260530a;

    public /* synthetic */ C93410d(OpaNonModularActionCompletionCard opaNonModularActionCompletionCard) {
        this.f260530a = opaNonModularActionCompletionCard;
    }

    public final Object call() {
        C55293n nVar;
        OpaNonModularActionCompletionCard opaNonModularActionCompletionCard = this.f260530a;
        a createBuilder = b.f.createBuilder();
        String obj = opaNonModularActionCompletionCard.f260523a.getText().toString();
        createBuilder.copyOnWrite();
        b bVar = createBuilder.instance;
        obj.getClass();
        bVar.a |= 1;
        bVar.b = obj;
        if (TextUtils.isEmpty(opaNonModularActionCompletionCard.f260525c)) {
            nVar = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("com.google.opa.QUERY", opaNonModularActionCompletionCard.f260525c);
            nVar = C87493o.m142022d(intent);
        }
        if (nVar != null) {
            createBuilder.copyOnWrite();
            b bVar2 = createBuilder.instance;
            bVar2.e = nVar;
            bVar2.a |= 8;
        }
        byte[] a = C73868h.m108448a(opaNonModularActionCompletionCard.f260524b.getDrawable());
        if (a != null) {
            C63088z A = C63088z.m96139A(a);
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

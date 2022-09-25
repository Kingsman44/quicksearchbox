package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.gsa.assistant.shared.g.a;
import com.google.android.apps.gsa.assistant.shared.g.b;
import com.google.android.apps.gsa.assistant.shared.g.c;
import com.google.android.apps.gsa.assistant.shared.g.f;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73868h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.util.p7159c.C90878al;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.fn */
/* compiled from: PG */
final class C108352fn extends C90878al {

    /* renamed from: a */
    final /* synthetic */ OpaAppActionsSliceCard f301393a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108352fn(OpaAppActionsSliceCard opaAppActionsSliceCard) {
        super("OpaAppActionsSliceCard#ActionCardHistoryProto", 2, 0);
        this.f301393a = opaAppActionsSliceCard;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        Drawable drawable;
        byte[] a;
        C118826c cVar = (C118826c) obj;
        a createBuilder = b.f.createBuilder();
        String str = this.f301393a.f300901c;
        createBuilder.copyOnWrite();
        b bVar = createBuilder.instance;
        str.getClass();
        bVar.a |= 1;
        bVar.b = str;
        if (!(((C86124t) this.f301393a.f300900b.mo27525b()).mo79746e(C90019by.f248080n) || (drawable = ((ImageView) this.f301393a.findViewById(R.id.slice_header_logo_url)).getDrawable()) == null || (a = C73868h.m108448a(drawable)) == null)) {
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
        return C60856cj.m92900i(createBuilder2.build());
    }
}

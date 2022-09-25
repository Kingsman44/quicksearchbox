package com.google.android.libraries.lens.sdk.avs.p2042c;

import android.util.Size;
import com.google.android.libraries.lens.sdk.avs.data.RenderableGleam;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.p2069am.C25348x;
import com.google.android.libraries.p1657ba.p1664c.p1668c.C19652b;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1671c.C19663b;
import com.google.lens.p4707j.C62440bq;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62444bu;
import com.google.lens.p4707j.C62445bv;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.sdk.avs.c.a */
/* compiled from: PG */
public final /* synthetic */ class C24862a implements Function {

    /* renamed from: a */
    public final /* synthetic */ Size f67916a;

    public /* synthetic */ C24862a(Size size) {
        this.f67916a = size;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Size size = this.f67916a;
        C19652b bVar = ((C19663b) obj).f54686a;
        if (bVar == null) {
            bVar = C19652b.f54662e;
        }
        C25348x xVar = (C25348x) C25308ap.f68839y.createBuilder();
        C62444bu buVar = (C62444bu) C62445bv.f168618e.createBuilder();
        C62440bq bqVar = (C62440bq) C62441br.f168608h.createBuilder();
        int i = bVar.f54664a;
        int i2 = bVar.f54666c;
        int width = size.getWidth();
        bqVar.copyOnWrite();
        C62441br brVar = (C62441br) bqVar.instance;
        brVar.f168610a |= 1;
        brVar.f168611b = (((float) i) + (((float) i2) / 2.0f)) / ((float) width);
        int i3 = bVar.f54665b;
        int i4 = bVar.f54667d;
        int height = size.getHeight();
        bqVar.copyOnWrite();
        C62441br brVar2 = (C62441br) bqVar.instance;
        brVar2.f168610a |= 2;
        brVar2.f168612c = (((float) i3) + (((float) i4) / 2.0f)) / ((float) height);
        int i5 = bVar.f54666c;
        int width2 = size.getWidth();
        bqVar.copyOnWrite();
        C62441br brVar3 = (C62441br) bqVar.instance;
        brVar3.f168610a |= 4;
        brVar3.f168613d = ((float) i5) / ((float) width2);
        int i6 = bVar.f54667d;
        int height2 = size.getHeight();
        bqVar.copyOnWrite();
        C62441br brVar4 = (C62441br) bqVar.instance;
        brVar4.f168610a |= 8;
        brVar4.f168614e = ((float) i6) / ((float) height2);
        bqVar.copyOnWrite();
        C62441br brVar5 = (C62441br) bqVar.instance;
        brVar5.f168616g = 1;
        brVar5.f168610a |= 32;
        C62441br brVar6 = (C62441br) bqVar.build();
        buVar.copyOnWrite();
        C62445bv bvVar = (C62445bv) buVar.instance;
        brVar6.getClass();
        bvVar.f168621b = brVar6;
        bvVar.f168620a |= 1;
        C62445bv bvVar2 = (C62445bv) buVar.build();
        xVar.copyOnWrite();
        bvVar2.getClass();
        ((C25308ap) xVar.instance).f68847h = bvVar2;
        return new RenderableGleam((C25308ap) xVar.build());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

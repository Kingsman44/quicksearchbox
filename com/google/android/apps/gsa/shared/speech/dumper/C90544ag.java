package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60669yl;
import com.google.common.p4552o.C60672yo;
import com.google.common.p4552o.C60675yr;
import com.google.common.p4552o.C60676ys;
import com.google.common.p4552o.C60677yt;
import com.google.common.p4552o.C60680yw;
import com.google.common.p4552o.C60681yx;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.ag */
/* compiled from: PG */
public final class C90544ag {

    /* renamed from: a */
    public static final C59071e f253128a = C59071e.m91332i("com.google.android.apps.gsa.shared.speech.dumper.ag");

    /* renamed from: b */
    public final C42876ab f253129b;

    public C90544ag(C42876ab abVar) {
        this.f253129b = abVar;
    }

    /* renamed from: a */
    public final C60675yr mo84660a() {
        return (C60675yr) C60856cj.m92910s(this.f253129b.mo46042d());
    }

    /* renamed from: b */
    public final void mo84661b(Long l) {
        C60669yl ylVar = (C60669yl) C60672yo.f164588e.createBuilder();
        long longValue = l.longValue();
        ylVar.copyOnWrite();
        C60672yo yoVar = (C60672yo) ylVar.instance;
        yoVar.f164590a |= 1;
        yoVar.f164591b = longValue;
        ylVar.copyOnWrite();
        C60672yo yoVar2 = (C60672yo) ylVar.instance;
        yoVar2.f164592c = 4;
        yoVar2.f164590a |= 2;
        ylVar.copyOnWrite();
        C60672yo yoVar3 = (C60672yo) ylVar.instance;
        yoVar3.f164593d = 4;
        yoVar3.f164590a = 4 | yoVar3.f164590a;
        C118826c.m197213c(this.f253129b.mo46039a(new C90573z((C60672yo) ylVar.build()), C60826bg.f164896a));
    }

    /* renamed from: c */
    public final void mo84662c() {
        C118826c.m197213c(this.f253129b.mo46039a(C90567t.f253166a, C60826bg.f164896a));
    }

    /* renamed from: d */
    public final void mo84663d() {
        C118826c.m197213c(this.f253129b.mo46039a(C90569v.f253168a, C60826bg.f164896a));
    }

    /* renamed from: e */
    public final void mo84664e(String str, int i) {
        C60676ys ysVar = (C60676ys) C60677yt.f164618d.createBuilder();
        ysVar.copyOnWrite();
        C60677yt ytVar = (C60677yt) ysVar.instance;
        str.getClass();
        ytVar.f164620a |= 1;
        ytVar.f164621b = str;
        ysVar.copyOnWrite();
        C60677yt ytVar2 = (C60677yt) ysVar.instance;
        ytVar2.f164620a |= 2;
        ytVar2.f164622c = i;
        C118826c.m197213c(this.f253129b.mo46039a(new C90559l((C60677yt) ysVar.build()), C60826bg.f164896a));
    }

    /* renamed from: f */
    public final void mo84665f(int i, String str, C90584f fVar) {
        int i2 = fVar.f253255d;
        C60680yw ywVar = (C60680yw) C60681yx.f164631e.createBuilder();
        ywVar.copyOnWrite();
        C60681yx yxVar = (C60681yx) ywVar.instance;
        yxVar.f164633a |= 1;
        yxVar.f164634b = i;
        ywVar.copyOnWrite();
        C60681yx yxVar2 = (C60681yx) ywVar.instance;
        str.getClass();
        yxVar2.f164633a |= 2;
        yxVar2.f164635c = str;
        ywVar.copyOnWrite();
        C60681yx yxVar3 = (C60681yx) ywVar.instance;
        yxVar3.f164636d = fVar.f253255d;
        yxVar3.f164633a |= 4;
        C118826c.m197213c(this.f253129b.mo46039a(new C90562o((C60681yx) ywVar.build()), C60826bg.f164896a));
    }
}

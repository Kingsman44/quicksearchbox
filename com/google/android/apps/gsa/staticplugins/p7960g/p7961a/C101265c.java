package com.google.android.apps.gsa.staticplugins.p7960g.p7961a;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.assist.C9332ac;
import com.google.android.apps.gsa.assist.C9433w;
import com.google.android.apps.gsa.assist.p501a.C9313a;
import com.google.android.apps.gsa.assist.p501a.C9316d;
import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.g.a.c */
/* compiled from: PG */
final class C101265c extends C90888av {

    /* renamed from: a */
    public final SettableFuture f282610a;

    /* renamed from: b */
    public final C9313a f282611b;

    /* renamed from: c */
    public final boolean f282612c;

    /* renamed from: d */
    public final AtomicBoolean f282613d;

    /* renamed from: e */
    public C63087y f282614e;

    /* renamed from: f */
    public int f282615f;

    /* renamed from: g */
    public Bitmap f282616g;

    /* renamed from: h */
    public C9433w f282617h;

    /* renamed from: i */
    private final C9321i f282618i;

    /* renamed from: j */
    private final C9316d f282619j;

    /* renamed from: k */
    private final Future f282620k;

    /* renamed from: l */
    private final C90931ca f282621l;

    /* renamed from: m */
    private final C9318f f282622m;

    /* renamed from: n */
    private int f282623n;

    public C101265c(SettableFuture settableFuture, C9321i iVar, Future future, C9313a aVar, boolean z, AtomicBoolean atomicBoolean, C90931ca caVar, C9318f fVar) {
        super("AssistDataBuilder.ProcessScreenshot", 1, 8);
        this.f282610a = settableFuture;
        this.f282618i = iVar;
        this.f282620k = future;
        this.f282611b = aVar;
        this.f282612c = z;
        this.f282613d = atomicBoolean;
        this.f282621l = caVar;
        this.f282622m = fVar;
        this.f282619j = iVar.mo17525b(fVar);
    }

    public final void run() {
        C9433w wVar = this.f282617h;
        if (wVar != null) {
            wVar.clear();
        }
        Bitmap a = C101272j.m167532a(this.f282620k, this.f282611b, this.f282612c);
        if (a != null && C101272j.m167534c(a)) {
            if (this.f282612c) {
                this.f282611b.mo17503a(5);
            }
            if (this.f282619j == null) {
                ((C59052c) ((C59052c) C101272j.f282651a.mo56225c()).mo56372aa(13831)).mo56386p("AssistDataConfig was null. Exiting.");
                return;
            }
            int width = a.getWidth();
            int height = a.getHeight();
            this.f282623n = this.f282619j.mo17516c();
            this.f282615f = this.f282619j.mo17515b();
            C9433w wVar2 = (C9433w) C9332ac.f32378j.createBuilder();
            this.f282617h = wVar2;
            boolean f = this.f282619j.mo17518f();
            wVar2.copyOnWrite();
            C9332ac acVar = (C9332ac) wVar2.instance;
            acVar.f32380a |= 256;
            acVar.f32388i = f;
            C9433w wVar3 = this.f282617h;
            wVar3.copyOnWrite();
            C9332ac acVar2 = (C9332ac) wVar3.instance;
            acVar2.f32380a |= 32;
            acVar2.f32385f = width;
            C9433w wVar4 = this.f282617h;
            wVar4.copyOnWrite();
            C9332ac acVar3 = (C9332ac) wVar4.instance;
            acVar3.f32380a |= 64;
            acVar3.f32386g = height;
            C9433w wVar5 = this.f282617h;
            int i = this.f282615f;
            wVar5.copyOnWrite();
            C9332ac acVar4 = (C9332ac) wVar5.instance;
            acVar4.f32380a |= 128;
            acVar4.f32387h = i;
            C9433w wVar6 = this.f282617h;
            wVar6.copyOnWrite();
            C9332ac acVar5 = (C9332ac) wVar6.instance;
            acVar5.f32384e = 1;
            acVar5.f32380a |= 16;
            C9433w wVar7 = this.f282617h;
            wVar7.copyOnWrite();
            C9332ac acVar6 = (C9332ac) wVar7.instance;
            acVar6.f32380a |= 4;
            acVar6.f32382c = 1;
            C9433w wVar8 = this.f282617h;
            wVar8.copyOnWrite();
            C9332ac acVar7 = (C9332ac) wVar8.instance;
            acVar7.f32380a |= 8;
            acVar7.f32383d = 1;
            int i2 = this.f282623n;
            this.f282616g = Bitmap.createScaledBitmap(a, (width * i2) / 100, (height * i2) / 100, true);
            this.f282614e = C63088z.m96150v();
            this.f282621l.mo85139d(new C101264b(this));
        }
    }
}

package com.google.android.libraries.elements.p1714d.p1719e;

import android.view.View;
import com.google.android.libraries.elements.interfaces.C21244an;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21295ck;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.protos.youtube.elements.C66043ae;
import com.google.protos.youtube.elements.C66045ag;
import com.google.protos.youtube.elements.C66205ds;
import com.google.protos.youtube.elements.C66206dt;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* renamed from: com.google.android.libraries.elements.d.e.ac */
/* compiled from: PG */
final class C20997ac implements C21244an {

    /* renamed from: a */
    final /* synthetic */ C21357r f58855a;

    /* renamed from: b */
    final /* synthetic */ C21248ar f58856b;

    /* renamed from: c */
    final /* synthetic */ C21310q f58857c;

    /* renamed from: d */
    final /* synthetic */ C21319z f58858d;

    /* renamed from: e */
    final /* synthetic */ C21001ag f58859e;

    public C20997ac(C21001ag agVar, C21357r rVar, C21248ar arVar, C21310q qVar, C21319z zVar) {
        this.f58859e = agVar;
        this.f58855a = rVar;
        this.f58856b = arVar;
        this.f58857c = qVar;
        this.f58858d = zVar;
    }

    /* renamed from: a */
    public final void mo26101a(View view, C21295ck ckVar, C21295ck ckVar2, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        C66045ag h = C21001ag.m39469h(view);
        C21295ck ckVar3 = ckVar;
        C66043ae g = C21001ag.m39468g(view, ckVar, (float) iArr[0], (float) iArr[1]);
        C21295ck ckVar4 = ckVar2;
        C66043ae g2 = C21001ag.m39468g(view, ckVar2, (float) iArr[0], (float) iArr[1]);
        C66205ds dsVar = (C66205ds) C66206dt.f180035d.createBuilder();
        dsVar.copyOnWrite();
        C66206dt dtVar = (C66206dt) dsVar.instance;
        dtVar.f180037a = 1 | dtVar.f180037a;
        dtVar.f180038b = f;
        dsVar.copyOnWrite();
        C66206dt dtVar2 = (C66206dt) dsVar.instance;
        dtVar2.f180037a = 2 | dtVar2.f180037a;
        dtVar2.f180039c = f2;
        SenderStateOuterClass$SenderState j = C21001ag.m39471j(g, g2, (C66206dt) dsVar.build(), h);
        this.f58859e.mo26102l(this.f58859e.f58877b.mo26124a(this.f58855a.mo26862a(), C21001ag.m39467f(view, (View) null, ckVar, j, this.f58856b, this.f58857c, this.f58858d)).mo61453k(), this.f58858d);
    }
}

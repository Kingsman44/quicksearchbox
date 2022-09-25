package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.view.View;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65937o;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.cc */
/* compiled from: PG */
public final /* synthetic */ class C102357cc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ VideoMetadataView f285656a;

    public /* synthetic */ C102357cc(VideoMetadataView videoMetadataView) {
        this.f285656a = videoMetadataView;
    }

    public final void onClick(View view) {
        Object obj;
        C102374p pVar = this.f285656a.f285530k;
        C65930h hVar = pVar.f285681c;
        C62940bt r1 = C62942bv.checkIsLite(C65937o.f179333l);
        hVar.mo58887l(r1);
        Object l = hVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        pVar.mo93173d(((C65937o) obj).f179338d);
    }
}

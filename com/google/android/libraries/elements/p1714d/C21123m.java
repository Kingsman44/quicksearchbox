package com.google.android.libraries.elements.p1714d;

import android.content.Context;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.facebook.litho.p329g.p331b.C6317s;
import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.internal.C21327ag;
import com.google.protos.youtube.elements.C66205ds;
import com.google.protos.youtube.elements.C66206dt;
import com.google.protos.youtube.elements.C66216ec;
import com.google.protos.youtube.elements.C66263u;
import com.google.protos.youtube.elements.C66264v;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import com.youtube.p5283a.p5284a.C68093o;

/* renamed from: com.google.android.libraries.elements.d.m */
/* compiled from: PG */
final class C21123m implements C21310q {

    /* renamed from: a */
    private final float f59227a;

    /* renamed from: b */
    private final boolean f59228b;

    /* renamed from: c */
    private final int f59229c;

    /* renamed from: d */
    private final C6317s f59230d;

    public C21123m(C68093o oVar, Context context, C6317s sVar) {
        this.f59227a = context.getResources().getDisplayMetrics().density;
        this.f59228b = C21327ag.m40334a(context);
        this.f59229c = oVar.mo60243j();
        this.f59230d = sVar;
    }

    /* renamed from: a */
    public final C21309p mo25826a(C21309p pVar) {
        C66216ec ecVar;
        RecyclerView a = this.f59230d.mo13573a();
        if (a == null) {
            return pVar;
        }
        C66263u uVar = (C66263u) C66264v.f180201d.createBuilder();
        C66205ds dsVar = (C66205ds) C66206dt.f180035d.createBuilder();
        int computeHorizontalScrollOffset = a.computeHorizontalScrollOffset();
        float f = this.f59227a;
        dsVar.copyOnWrite();
        C66206dt dtVar = (C66206dt) dsVar.instance;
        dtVar.f180037a |= 1;
        dtVar.f180038b = ((float) computeHorizontalScrollOffset) / f;
        int computeVerticalScrollOffset = a.computeVerticalScrollOffset();
        float f2 = this.f59227a;
        dsVar.copyOnWrite();
        C66206dt dtVar2 = (C66206dt) dsVar.instance;
        dtVar2.f180037a |= 2;
        dtVar2.f180039c = ((float) computeVerticalScrollOffset) / f2;
        uVar.copyOnWrite();
        C66264v vVar = (C66264v) uVar.instance;
        C66206dt dtVar3 = (C66206dt) dsVar.build();
        dtVar3.getClass();
        vVar.f180205b = dtVar3;
        vVar.f180204a |= 1;
        int i = this.f59229c;
        boolean z = this.f59228b;
        int i2 = C21124n.f59231a;
        int i3 = -1;
        if (i == 1) {
            View findChildViewUnder = a.findChildViewUnder((float) (a.getWidth() / 2), (float) (a.getHeight() / 2));
            if (findChildViewUnder != null) {
                i3 = a.getChildAdapterPosition(findChildViewUnder);
            }
        } else {
            C0653fo foVar = a.mLayout;
            if (foVar instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) foVar;
                i3 = (!z || linearLayoutManager.getOrientation() != 0) ? linearLayoutManager.findFirstVisibleItemPosition() : linearLayoutManager.findLastVisibleItemPosition();
            }
        }
        uVar.copyOnWrite();
        C66264v vVar2 = (C66264v) uVar.instance;
        vVar2.f180204a |= 2;
        vVar2.f180206c = i3;
        C66264v vVar3 = (C66264v) uVar.build();
        C21230a aVar = (C21230a) pVar;
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = aVar.f59563d;
        if (senderStateOuterClass$SenderState != null) {
            ecVar = (C66216ec) senderStateOuterClass$SenderState.toBuilder();
        } else {
            ecVar = (C66216ec) SenderStateOuterClass$SenderState.f179521a.createBuilder();
        }
        ecVar.mo58885m(C66264v.f180202e, vVar3);
        aVar.f59563d = (SenderStateOuterClass$SenderState) ecVar.build();
        return pVar;
    }
}

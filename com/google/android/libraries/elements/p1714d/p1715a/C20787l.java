package com.google.android.libraries.elements.p1714d.p1715a;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.p041a.C0500j;
import com.facebook.litho.C6278fu;
import com.facebook.litho.p329g.C6336o;
import com.facebook.litho.widget.C6475cg;
import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21308o;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.android.libraries.elements.p1714d.C20813az;
import com.google.protobuf.C62940bt;
import com.google.protos.youtube.elements.C66157cb;
import com.google.protos.youtube.elements.C66158cc;
import com.google.protos.youtube.elements.C66216ec;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.util.List;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69826b;

/* renamed from: com.google.android.libraries.elements.d.a.l */
/* compiled from: PG */
public final class C20787l extends C0500j {

    /* renamed from: a */
    public final List f58149a;

    /* renamed from: b */
    private final C21319z f58150b;

    /* renamed from: c */
    private final C21308o f58151c;

    /* renamed from: d */
    private final C21313t f58152d;

    /* renamed from: e */
    private int f58153e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20787l(com.google.android.libraries.elements.interfaces.C21319z r3, com.google.android.libraries.elements.interfaces.C21308o r4, com.youtube.p5283a.p5284a.C68093o r5, com.google.android.libraries.elements.interfaces.C21313t r6) {
        /*
            r2 = this;
            com.youtube.a.a.ag r0 = r5.mo60244k()
            if (r0 == 0) goto L_0x0016
            com.youtube.a.a.ag r0 = r5.mo60244k()
            int r0 = r0.mo60106i()
            r1 = 405782140(0x182fbe7c, float:2.271439E-24)
            if (r0 != r1) goto L_0x0016
            r5 = 15
            goto L_0x0021
        L_0x0016:
            int r5 = r5.mo60240g()
            r0 = 1
            if (r5 != r0) goto L_0x0020
            r5 = 12
            goto L_0x0021
        L_0x0020:
            r5 = 3
        L_0x0021:
            r0 = 0
            r2.<init>(r5, r0)
            r5 = -1
            r2.f58153e = r5
            r2.f58150b = r3
            r2.f58151c = r4
            r2.f58152d = r6
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f58149a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.p1715a.C20787l.<init>(com.google.android.libraries.elements.interfaces.z, com.google.android.libraries.elements.interfaces.o, com.youtube.a.a.o, com.google.android.libraries.elements.interfaces.t):void");
    }

    /* renamed from: d */
    public final void mo2441d(RecyclerView recyclerView, C0673gh ghVar) {
        super.mo2441d(recyclerView, ghVar);
        int absoluteAdapterPosition = ghVar.getAbsoluteAdapterPosition();
        int i = this.f58153e;
        if (!(i == -1 || i == absoluteAdapterPosition)) {
            ((C20776a) this.f58151c).f58125a.moveItem(i, absoluteAdapterPosition);
            C21357r rVar = ((C20776a) this.f58151c).f58127c;
            CommandOuterClass$Command a = rVar != null ? rVar.mo26862a() : null;
            int i2 = this.f58153e;
            if (a != null) {
                C21309p k = C21311r.m40252k();
                C66216ec ecVar = (C66216ec) SenderStateOuterClass$SenderState.f179521a.createBuilder();
                C62940bt btVar = C66158cc.f179895e;
                C66157cb cbVar = (C66157cb) C66158cc.f179894d.createBuilder();
                cbVar.copyOnWrite();
                C66158cc ccVar = (C66158cc) cbVar.instance;
                ccVar.f179897a |= 2;
                ccVar.f179898b = i2;
                cbVar.copyOnWrite();
                C66158cc ccVar2 = (C66158cc) cbVar.instance;
                ccVar2.f179897a |= 4;
                ccVar2.f179899c = absoluteAdapterPosition;
                ecVar.mo58885m(btVar, (C66158cc) cbVar.build());
                ((C21230a) k).f59563d = (SenderStateOuterClass$SenderState) ecVar.build();
                C69803b k2 = this.f58152d.mo26124a(a, k.mo26698a()).mo61453k();
                C69826b l = this.f58150b.mo26811l();
                if (l != null) {
                    l.mo61462b(k2);
                }
            }
        }
        this.f58153e = -1;
    }

    /* renamed from: f */
    public final boolean mo2443f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo2444g(RecyclerView recyclerView, C0673gh ghVar, C0673gh ghVar2) {
        C0640fb fbVar = recyclerView.mAdapter;
        if (!(fbVar instanceof C6475cg)) {
            return false;
        }
        int absoluteAdapterPosition = ghVar.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = ghVar2.getAbsoluteAdapterPosition();
        if (this.f58153e == -1) {
            this.f58153e = absoluteAdapterPosition;
        }
        ((C6475cg) fbVar).mo13548a(absoluteAdapterPosition, absoluteAdapterPosition2);
        for (C20813az azVar : this.f58149a) {
            C6336o oVar = (C6336o) azVar.f58286a.get();
            if (oVar.mo13351n() != null) {
                oVar.mo13350h(new C6278fu(1, Integer.valueOf(absoluteAdapterPosition), Integer.valueOf(absoluteAdapterPosition2)), "updateState:DataDrivenCollectionSection.onItemDraggedStateUpdate");
            }
        }
        return true;
    }

    /* renamed from: k */
    public final void mo2448k(C0673gh ghVar) {
    }
}

package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3128d;

import android.content.IntentFilter;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40165ak;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40171aq;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40129aa;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40137i;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40143o;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40144p;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40145q;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40247a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40248b;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40252f;
import com.google.android.libraries.search.rendering.xuikit.bubbles.view.BubbleView;
import com.google.common.p4526f.C59052c;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57800ad;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57802af;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.d.d */
/* compiled from: PG */
public final class C40221d {

    /* renamed from: a */
    public C57800ad f105671a = C57800ad.f154417d;

    /* renamed from: b */
    public C57802af f105672b = C57802af.f154423d;

    /* renamed from: c */
    public boolean f105673c = false;

    /* renamed from: d */
    public final C40222e f105674d;

    /* renamed from: e */
    public int f105675e = 1;

    public C40221d(C40222e eVar) {
        this.f105674d = eVar;
    }

    /* renamed from: a */
    public final void mo42328a(int i) {
        if (this.f105675e != i) {
            this.f105675e = i;
            C40165ak akVar = (C40165ak) this.f105674d;
            if (akVar.f105512s == null || akVar.f105511r == null || akVar.f105514u == null) {
                ((C59052c) ((C59052c) C40165ak.f105489a.mo56225c()).mo56372aa(53244)).mo56386p("onExpansionStateChange: called without onCreate()");
                return;
            }
            C40223f fVar = C40223f.NONE;
            int i2 = akVar.f105499f.f105675e;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i3 == 0) {
                C40248b bVar = akVar.f105490A;
                akVar.mo42270a();
                C40137i iVar = akVar.f105512s;
                iVar.mo42246g(iVar.mo42243d(bVar));
            } else if (i3 == 1) {
                akVar.f105490A = akVar.f105512s.f105431l.mo42221b();
                akVar.f105516w.setAlpha(0.0f);
                akVar.f105516w.setVisibility(0);
                akVar.f105516w.animate().alpha(1.0f).start();
                C40144p pVar = akVar.f105514u;
                C40145q qVar = pVar.f105451e;
                qVar.f105455a.removeView(qVar.f105458d);
                qVar.f105455a.removeView(qVar.f105457c);
                WindowManager windowManager = qVar.f105455a;
                View view = qVar.f105458d;
                windowManager.addView(view, view.getLayoutParams());
                WindowManager windowManager2 = qVar.f105455a;
                View view2 = qVar.f105457c;
                windowManager2.addView(view2, view2.getLayoutParams());
                int width = pVar.f105448b.getWidth();
                int width2 = pVar.f105449c.getWidth();
                int height = pVar.f105448b.getHeight();
                int height2 = pVar.f105449c.getHeight();
                C40145q qVar2 = pVar.f105451e;
                qVar2.f105461g.mo124186l(((float) width) / ((float) width2));
                qVar2.f105462h.mo124186l(((float) height) / ((float) height2));
                BubbleView bubbleView = pVar.f105448b;
                bubbleView.getLocationOnScreen(C40252f.f105723a);
                int[] iArr = C40252f.f105723a;
                int i4 = iArr[0];
                int i5 = iArr[1];
                Rect rect = new Rect(i4, i5, bubbleView.getWidth() + i4, bubbleView.getHeight() + i5);
                C40145q qVar3 = pVar.f105451e;
                float exactCenterX = rect.exactCenterX();
                float exactCenterY = rect.exactCenterY();
                C40247a aVar = (C40247a) C40252f.m69867a(qVar3.f105456b);
                qVar3.f105459e.mo124186l(exactCenterX - aVar.f105717a);
                qVar3.f105460f.mo124186l(exactCenterY - aVar.f105718b);
                pVar.f105451e.f105463i.mo124186l(0.0f);
                pVar.f105450d.mo42363d(0, false);
                pVar.f105448b.mo42363d(8, true);
                C40129aa aaVar = pVar.f105452f;
                C40137i iVar2 = pVar.f105447a;
                Objects.requireNonNull(iVar2);
                aaVar.mo42218b(new C40143o(iVar2));
                C40145q qVar4 = pVar.f105451e;
                qVar4.f105461g.mo124179e(1.0f);
                qVar4.f105462h.mo124179e(1.0f);
                C40145q qVar5 = pVar.f105451e;
                qVar5.f105459e.mo124179e(0.0f);
                qVar5.f105460f.mo124179e(0.0f);
                pVar.f105451e.f105463i.mo124179e(1.0f);
                akVar.f105511r.f105689c = false;
                C40171aq aqVar = akVar.f105491B;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
                aqVar.f105529a.registerReceiver(aqVar, intentFilter);
            } else if (i3 == 2) {
                akVar.mo42270a();
            }
        }
    }
}
